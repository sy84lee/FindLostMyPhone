package com.sy.publicapiviewer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.gms.ads.*
import com.sy.publicapiviewer.databinding.ActivityMainBinding
import com.sy.publicapiviewer.item.Item

class MainActivity : AppCompatActivity(), OnItemClick{

    val binding by lazy { ActivityMainBinding.inflate(layoutInflater)}
    val listFragment by lazy { ListFragment() }
    //val detailFragment by lazy { DetailFragment() }
    //val viewModel by lazy { ViewModelProvider(this).get(FindPhoneListViewModel::class.java) }
    var _item: Item? = null
    lateinit var mAdView : AdView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        setFragment()

        // 1. 모바일광고 SDK 초기화
        MobileAds.initialize(this) {}

        // 2. 광고 띄우기
        mAdView = binding.adViewBanner
        val adRequest = AdRequest.Builder().build()
        mAdView.loadAd(adRequest)

        mAdView.adListener = object: AdListener() {
            override fun onAdLoaded() {
                // Code to be executed when an ad finishes loading.
            }

            override fun onAdFailedToLoad(adError : LoadAdError) {
                // Code to be executed when an ad request fails.
            }

            override fun onAdOpened() {
                // Code to be executed when an ad opens an overlay that
                // covers the screen.
            }

            override fun onAdClicked() {
                // Code to be executed when the user clicks on an ad.
            }

            override fun onAdClosed() {
                // Code to be executed when the user is about to return
                // to the app after tapping on an ad.
            }
        }


    }

    fun goDetail(item:Item) {
        _item = item
        val detailFragment = DetailFragment()
        val transaction = supportFragmentManager.beginTransaction()
        transaction.add(R.id.framelayout, detailFragment)
        transaction.addToBackStack("detail")
        transaction.commit()
    }

    fun goBack() {
        onBackPressed()
    }

    fun setFragment() {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.add(R.id.framelayout, listFragment)
        transaction.commit()
    }

    override fun onClick(item: Item?) {
        if (item != null) {
            goDetail(item)
        }
    }
}

//class CustomAdapter(val listData:MutableList<Memo>) : RecyclerView.Adapter<CustomAdapter.Holder>() {
//
//    class Holder(val binding: ItemRecyclerBinding):RecyclerView.ViewHolder(binding.root) {
//
//        lateinit var currentMemo: Memo
//
//        //클릭처리는 init에서만 한다
//        init {
//            binding.root.setOnClickListener {
//                val title = binding.textTitle.text
//                Toast.makeText(binding.root.context, "Clicked item: ${currentMemo.title}", Toast.LENGTH_SHORT).show()
//                //Toast.makeText(binding.root.context, "Clicked item: ${title}", Toast.LENGTH_SHORT).show()
//            }
//        }
//
//        // 3. 받은 데이터를 화면에 출력
//        fun setMemo(memo: Memo) {
//            currentMemo = memo
//            with(binding) {
//                textNumber.text = "${memo.no}"
//                textTitle.text = memo.title
//                val sdf = SimpleDateFormat("yyyy-MM-dd")
//                val formattedDate = sdf.format(memo.timestamp)
//                textDate.text = formattedDate
//            }
//        }
//    }
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
//        val binding = ItemRecyclerBinding.inflate(LayoutInflater.from(parent.context), parent, false)
//        return Holder(binding)
//    }
//
//    override fun onBindViewHolder(holder: Holder, position: Int) {
//        //1. 사용할 데이터를 꺼내고
//        val memo = listData.get(position)
//        //2.  홀더에 데이터를 전달
//        holder.setMemo(memo)
//    }
//
//    override fun getItemCount(): Int = listData.size
//}