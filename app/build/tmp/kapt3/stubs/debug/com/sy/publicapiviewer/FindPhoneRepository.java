package com.sy.publicapiviewer;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/sy/publicapiviewer/FindPhoneRepository;", "", "service", "Lcom/sy/publicapiviewer/service/FindPhoneService;", "(Lcom/sy/publicapiviewer/service/FindPhoneService;)V", "getRepositorySearchItems", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Lcom/sy/publicapiviewer/item/Item;", "query", "", "app_debug"})
public final class FindPhoneRepository {
    private final com.sy.publicapiviewer.service.FindPhoneService service = null;
    
    public FindPhoneRepository(@org.jetbrains.annotations.NotNull()
    com.sy.publicapiviewer.service.FindPhoneService service) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.sy.publicapiviewer.item.Item>> getRepositorySearchItems(@org.jetbrains.annotations.NotNull()
    java.lang.String query) {
        return null;
    }
}