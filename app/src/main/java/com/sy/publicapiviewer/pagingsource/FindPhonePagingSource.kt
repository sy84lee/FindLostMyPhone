package com.sy.publicapiviewer.pagingsource

import android.util.Log
import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.sy.publicapiviewer.item.Item
import com.sy.publicapiviewer.service.FindPhoneService

class FindPhonePagingSource(
    private val backend: FindPhoneService,
    val query: String
) : PagingSource<Int, Item>() {

    override fun getRefreshKey(state: PagingState<Int, Item>): Int? {
        return state.anchorPosition?.let { anchorPosition ->
            state.closestPageToPosition(anchorPosition)?.prevKey?.plus(1)
                ?: state.closestPageToPosition(anchorPosition)?.nextKey?.minus(1)
        }
    }

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, Item> {
        return try {
            val nextPageNumber = params.key ?: 1
            Log.i("TEST","[nextPageNumber ] " + nextPageNumber)
            val response = backend.getPhoneList(nextPageNumber, 100)

            //val items : ArrayList<Item> = ArrayList()
            //for (i:Item in response.body.items.item) {
            //    val result : Boolean
            //    if (i.fdSbjt?.contains(query) == true) {
            //        items.add(i)
            //    }
           // }

            return LoadResult.Page(
                data = response.body.items.item,
                //data = items,
                prevKey = if (nextPageNumber == 0 || nextPageNumber == 1) null else nextPageNumber - 1,
                nextKey = if (nextPageNumber == 0) 1 else nextPageNumber + 1
            )
        }
        catch (e: Exception) {
            Log.i("TEST","[Exception] : " + e.printStackTrace())
            return LoadResult.Error(e)
        }
    }
}