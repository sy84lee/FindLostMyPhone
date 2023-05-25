package com.sy.publicapiviewer;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001a\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\u0005\u001a\u00020\u0006R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R(\u0010\u0007\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u0010"}, d2 = {"Lcom/sy/publicapiviewer/FindPhoneViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/sy/publicapiviewer/FindPhoneRepository;", "(Lcom/sy/publicapiviewer/FindPhoneRepository;)V", "queryString", "", "searchResult", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Lcom/sy/publicapiviewer/item/Item;", "getSearchResult", "()Lkotlinx/coroutines/flow/Flow;", "setSearchResult", "(Lkotlinx/coroutines/flow/Flow;)V", "searchRepository", "app_debug"})
public final class FindPhoneViewModel extends androidx.lifecycle.ViewModel {
    private final com.sy.publicapiviewer.FindPhoneRepository repository = null;
    private java.lang.String queryString;
    @org.jetbrains.annotations.Nullable()
    private kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.sy.publicapiviewer.item.Item>> searchResult;
    
    public FindPhoneViewModel(@org.jetbrains.annotations.NotNull()
    com.sy.publicapiviewer.FindPhoneRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.sy.publicapiviewer.item.Item>> getSearchResult() {
        return null;
    }
    
    public final void setSearchResult(@org.jetbrains.annotations.Nullable()
    kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.sy.publicapiviewer.item.Item>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.sy.publicapiviewer.item.Item>> searchRepository(@org.jetbrains.annotations.NotNull()
    java.lang.String queryString) {
        return null;
    }
}