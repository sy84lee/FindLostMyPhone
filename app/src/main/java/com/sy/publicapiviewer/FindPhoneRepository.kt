package com.sy.publicapiviewer

import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import androidx.paging.filter
import com.sy.publicapiviewer.item.Item
import com.sy.publicapiviewer.pagingsource.FindPhonePagingSource
import com.sy.publicapiviewer.service.FindPhoneService
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class FindPhoneRepository (
    private val service: FindPhoneService
) {
   fun getRepositorySearchItems(query: String): Flow<PagingData<Item>> {
        return Pager(
            config = PagingConfig(
                pageSize = 15,
                enablePlaceholders = false
            ),
            pagingSourceFactory = {
                FindPhonePagingSource(service, query) }
        ).flow
            .map {pagingData ->
                pagingData.filter {
                    it.fdSbjt?.contains(query) == true || it.fdPrdtNm?.contains(query) == true ||
                            it.depPlace?.contains(query) == true
                }
            }
    }
}