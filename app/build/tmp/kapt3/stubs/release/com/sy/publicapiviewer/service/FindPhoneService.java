package com.sy.publicapiviewer.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J)\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\b"}, d2 = {"Lcom/sy/publicapiviewer/service/FindPhoneService;", "", "getPhoneList", "Lcom/sy/publicapiviewer/item/ImageItem;", "page", "", "limit", "(Ljava/lang/Integer;Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_release"})
public abstract interface FindPhoneService {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "getMoblphonAcctoKindAreaPeriodInfo?serviceKey=DPo7pwuVB26NZUErOX%2BUltyyqxjRt%2FX%2Bj0mIof3ZS7UVy54bPj0mlyodQ9mgYzohKbPsh6QsH6PcIec1lUMUlA%3D%3D")
    @retrofit2.http.Headers(value = {"Content-Type:application/xml;charset=UTF-8"})
    public abstract java.lang.Object getPhoneList(@org.jetbrains.annotations.Nullable()
    @retrofit2.http.Query(value = "pageNo")
    java.lang.Integer page, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Query(value = "numOfRows")
    java.lang.Integer limit, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.sy.publicapiviewer.item.ImageItem> continuation);
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 3)
    public final class DefaultImpls {
    }
}