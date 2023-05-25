package com.sy.publicapiviewer.service

import com.sy.publicapiviewer.item.ImageItem
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

const val API_KEY = "DPo7pwuVB26NZUErOX%2BUltyyqxjRt%2FX%2Bj0mIof3ZS7UVy54bPj0mlyodQ9mgYzohKbPsh6QsH6PcIec1lUMUlA%3D%3D"
const val BASE_URL = "http://apis.data.go.kr/1320000/SearchMoblphonInfoInqireService/"



interface FindPhoneService {
    @Headers(
        "Content-Type:application/xml;charset=UTF-8"
    )
    //@GET("SearchMoblphonInfoInqireService/getMoblphonAcctoKindAreaPeriodInfo")
    @GET("getMoblphonAcctoKindAreaPeriodInfo?serviceKey=DPo7pwuVB26NZUErOX%2BUltyyqxjRt%2FX%2Bj0mIof3ZS7UVy54bPj0mlyodQ9mgYzohKbPsh6QsH6PcIec1lUMUlA%3D%3D")
    suspend fun getPhoneList(
        @Query("pageNo") page: Int? = null,
        @Query("numOfRows") limit: Int? = null): ImageItem
}