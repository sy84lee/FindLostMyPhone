package com.sy.publicapiviewer

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.PagingData
import androidx.paging.cachedIn
import com.sy.publicapiviewer.item.Item
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.filter

class FindPhoneViewModel constructor (
    private val repository: FindPhoneRepository
) : ViewModel() {

    private var queryString: String? = null
    var searchResult: Flow<PagingData<Item>>? = null

    fun searchRepository(queryString: String): Flow<PagingData<Item>> {
        val lastResult = searchResult
        //if (lastResult != null)
        //    return lastResult

        this.queryString = queryString
        val newResult = repository.getRepositorySearchItems(queryString)
            .cachedIn(viewModelScope)
        searchResult = newResult
        return newResult
    }
}