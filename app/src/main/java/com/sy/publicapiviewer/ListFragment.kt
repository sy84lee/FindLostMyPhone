package com.sy.publicapiviewer

import FindPhoneAdapter
import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.SearchView
import androidx.core.view.isVisible
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import androidx.paging.LoadState
import androidx.paging.LoadStateAdapter
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.sy.publicapiviewer.databinding.FragmentListBinding
import com.sy.publicapiviewer.databinding.ProgressItemBinding
import com.sy.publicapiviewer.service.FindPhoneService
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch

class ListFragment : Fragment() {
    lateinit var binding:FragmentListBinding
    lateinit var mainActivity: MainActivity
    lateinit var adapter : FindPhoneAdapter
    lateinit var service : FindPhoneService
    lateinit var restApi : RestApi
    lateinit var repository : FindPhoneRepository
    //private val viewModel by viewModels<FindPhoneListViewModel>()
//    private val viewModel : FindPhoneListViewModel by viewModel()

    class PhoneLoadStateAdapter(
        private val retry: () -> Unit
    ) : LoadStateAdapter<PhoneLoadStateAdapter.SampleLoadStateViewHolder>() {

        inner class SampleLoadStateViewHolder(
            private val binding: ProgressItemBinding
        ) : RecyclerView.ViewHolder(binding.root) {

            fun bind(loadState: LoadState) {
                binding.loadStateProgress.isVisible = loadState is LoadState.Loading
                binding.loadStateErrorMessage.isVisible = loadState !is LoadState.Loading
                binding.loadStateRetry.isVisible = loadState !is LoadState.Loading
                binding.loadStateRetry.setOnClickListener {
                    retry.invoke()
                }
            }
        }

        override fun onBindViewHolder(holder: SampleLoadStateViewHolder, loadState: LoadState) {
            holder.bind(loadState)
        }

        override fun onCreateViewHolder(parent: ViewGroup, loadState: LoadState): SampleLoadStateViewHolder {
            val view = LayoutInflater.from(parent.context).inflate(R.layout.progress_item, parent, false)
            val binding = ProgressItemBinding.bind(view)
            return SampleLoadStateViewHolder(binding)
        }
    }

    private val viewModel by lazy {
        ViewModelProvider(this, HasParamViewModelFactory(repository)
        ).get(FindPhoneViewModel::class.java)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is MainActivity) mainActivity = context
        adapter = FindPhoneAdapter(mainActivity)
        adapter.addLoadStateListener {
            binding.loadStateProgress.isVisible = it.source.refresh is LoadState.Loading
            binding.loadStateErrorMessage.isVisible = it.source.refresh is LoadState.Error
            binding.loadStateRetry.isVisible = it.source.refresh is LoadState.Error
            binding.loadStateCancel.isVisible = it.source.refresh is LoadState.Error
            binding.loadStateRetry.setOnClickListener {
                adapter.retry()
            }
            binding.loadStateCancel.setOnClickListener {
                binding.loadStateErrorMessage.isVisible = false
                binding.loadStateRetry.isVisible = false
                binding.loadStateCancel.isVisible = false
            }
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentListBinding.inflate(inflater, container, false)

        binding.searchView!!.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                binding.readmeMessase.isVisible = false
                binding.mark.isVisible = false
                loadData(query!!)
                return false
            }
            override fun onQueryTextChange(newText: String?): Boolean {
                return false
            }
        })
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.fragmentAdapter.adapter = adapter.withLoadStateHeaderAndFooter(
            header =  PhoneLoadStateAdapter { adapter.retry() },
            footer = PhoneLoadStateAdapter{ adapter.retry() }
        )
        binding.fragmentAdapter.layoutManager = LinearLayoutManager(view.context)
        restApi = RestApi()
        service = restApi.getService()
        repository = FindPhoneRepository(service)
    }

    fun loadData(query: String) {
        viewLifecycleOwner.lifecycleScope.launch {
            //adapter.submitData(PagingData.empty())
            viewModel.searchRepository(query).collectLatest { it ->
                adapter.submitData(it)
                adapter.notifyDataSetChanged()
            }
        }
    }
}