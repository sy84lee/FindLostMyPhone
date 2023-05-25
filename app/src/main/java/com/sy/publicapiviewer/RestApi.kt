package com.sy.publicapiviewer

import com.sy.publicapiviewer.service.BASE_URL
import com.sy.publicapiviewer.service.FindPhoneService
import com.tickaroo.tikxml.TikXml
import com.tickaroo.tikxml.retrofit.TikXmlConverterFactory
import retrofit2.Retrofit

class RestApi {
    private val findPhoneService: FindPhoneService
    fun getService() : FindPhoneService { return findPhoneService }
    init {
        val parser = TikXml.Builder().exceptionOnUnreadXml(false).build()
        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(TikXmlConverterFactory.create(parser))
            .build()
        findPhoneService = retrofit.create(FindPhoneService::class.java)
    }

    companion object {
        val parser = TikXml.Builder().exceptionOnUnreadXml(false).build()
        fun loadService() : FindPhoneService = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(TikXmlConverterFactory.create(parser))
            .build()
            .create(FindPhoneService::class.java)
    }
}