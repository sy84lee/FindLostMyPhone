package com.sy.publicapiviewer;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0006\u0010\u001b\u001a\u00020\u001cJ\u000e\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0005J\u0012\u0010\u001f\u001a\u00020\u001c2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010 \u001a\u00020\u001c2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0014J\u0006\u0010#\u001a\u00020\u001cR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001b\u0010\n\u001a\u00020\u000b8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u00118FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a\u00a8\u0006$"}, d2 = {"Lcom/sy/publicapiviewer/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/sy/publicapiviewer/OnItemClick;", "()V", "_item", "Lcom/sy/publicapiviewer/item/Item;", "get_item", "()Lcom/sy/publicapiviewer/item/Item;", "set_item", "(Lcom/sy/publicapiviewer/item/Item;)V", "binding", "Lcom/sy/publicapiviewer/databinding/ActivityMainBinding;", "getBinding", "()Lcom/sy/publicapiviewer/databinding/ActivityMainBinding;", "binding$delegate", "Lkotlin/Lazy;", "listFragment", "Lcom/sy/publicapiviewer/ListFragment;", "getListFragment", "()Lcom/sy/publicapiviewer/ListFragment;", "listFragment$delegate", "mAdView", "Lcom/google/android/gms/ads/AdView;", "getMAdView", "()Lcom/google/android/gms/ads/AdView;", "setMAdView", "(Lcom/google/android/gms/ads/AdView;)V", "goBack", "", "goDetail", "item", "onClick", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setFragment", "app_debug"})
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity implements com.sy.publicapiviewer.OnItemClick {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy binding$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy listFragment$delegate = null;
    @org.jetbrains.annotations.Nullable()
    private com.sy.publicapiviewer.item.Item _item;
    public com.google.android.gms.ads.AdView mAdView;
    
    public MainActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.sy.publicapiviewer.databinding.ActivityMainBinding getBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.sy.publicapiviewer.ListFragment getListFragment() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.sy.publicapiviewer.item.Item get_item() {
        return null;
    }
    
    public final void set_item(@org.jetbrains.annotations.Nullable()
    com.sy.publicapiviewer.item.Item p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.gms.ads.AdView getMAdView() {
        return null;
    }
    
    public final void setMAdView(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.ads.AdView p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final void goDetail(@org.jetbrains.annotations.NotNull()
    com.sy.publicapiviewer.item.Item item) {
    }
    
    public final void goBack() {
    }
    
    public final void setFragment() {
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.Nullable()
    com.sy.publicapiviewer.item.Item item) {
    }
}