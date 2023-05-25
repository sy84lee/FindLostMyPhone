package com.sy.publicapiviewer

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.sy.publicapiviewer.databinding.FragmentDetailBinding

class DetailFragment : Fragment() {
    lateinit var binding: FragmentDetailBinding
    lateinit var mainActivity: MainActivity

    override fun onAttach(context: Context) {
        super.onAttach(context)

        if (context is MainActivity) mainActivity = context
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDetailBinding.inflate(inflater, container, false)

        Glide.with(mainActivity).load(mainActivity._item?.fdFilePathImg).into(binding.imageView)
        binding.textInputEditTextRnum.setText(mainActivity._item?.rnum)
        binding.textInputEditTextActId.setText(mainActivity._item?.atcId)
        binding.textInputEditTextFdSn.setText(mainActivity._item?.fdSn)
        binding.textInputEditTextPrdtCINm.setText(mainActivity._item?.prdtClNm)
        binding.textInputEditTextClrNm.setText(mainActivity._item?.clrNm)
        binding.textInputEditTextFdPrdtNm.setText(mainActivity._item?.fdPrdtNm)
        binding.textInputEditTextMdcd.setText(mainActivity._item?.mdcd)
        binding.textInputEditTextSrno.setText(mainActivity._item?.srno)
        binding.textInputEditTextDepPlace.setText(mainActivity._item?.depPlace)
        binding.textInputEditTextFdYmd.setText(mainActivity._item?.fdYmd)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//        binding.btnBack.setOnClickListener {
//            mainActivity.goBack()
//        }
    }

}