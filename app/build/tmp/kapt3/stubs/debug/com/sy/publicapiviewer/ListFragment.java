package com.sy.publicapiviewer;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001>B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u000200J\u0010\u00101\u001a\u00020.2\u0006\u00102\u001a\u000203H\u0016J&\u00104\u001a\u0004\u0018\u0001052\u0006\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u0001092\b\u0010:\u001a\u0004\u0018\u00010;H\u0016J\u001a\u0010<\u001a\u00020.2\u0006\u0010=\u001a\u0002052\b\u0010:\u001a\u0004\u0018\u00010;H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u001cX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\u00020\"X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001b\u0010\'\u001a\u00020(8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b)\u0010*\u00a8\u0006?"}, d2 = {"Lcom/sy/publicapiviewer/ListFragment;", "Landroidx/fragment/app/Fragment;", "()V", "adapter", "LFindPhoneAdapter;", "getAdapter", "()LFindPhoneAdapter;", "setAdapter", "(LFindPhoneAdapter;)V", "binding", "Lcom/sy/publicapiviewer/databinding/FragmentListBinding;", "getBinding", "()Lcom/sy/publicapiviewer/databinding/FragmentListBinding;", "setBinding", "(Lcom/sy/publicapiviewer/databinding/FragmentListBinding;)V", "mainActivity", "Lcom/sy/publicapiviewer/MainActivity;", "getMainActivity", "()Lcom/sy/publicapiviewer/MainActivity;", "setMainActivity", "(Lcom/sy/publicapiviewer/MainActivity;)V", "repository", "Lcom/sy/publicapiviewer/FindPhoneRepository;", "getRepository", "()Lcom/sy/publicapiviewer/FindPhoneRepository;", "setRepository", "(Lcom/sy/publicapiviewer/FindPhoneRepository;)V", "restApi", "Lcom/sy/publicapiviewer/RestApi;", "getRestApi", "()Lcom/sy/publicapiviewer/RestApi;", "setRestApi", "(Lcom/sy/publicapiviewer/RestApi;)V", "service", "Lcom/sy/publicapiviewer/service/FindPhoneService;", "getService", "()Lcom/sy/publicapiviewer/service/FindPhoneService;", "setService", "(Lcom/sy/publicapiviewer/service/FindPhoneService;)V", "viewModel", "Lcom/sy/publicapiviewer/FindPhoneViewModel;", "getViewModel", "()Lcom/sy/publicapiviewer/FindPhoneViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "loadData", "", "query", "", "onAttach", "context", "Landroid/content/Context;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "PhoneLoadStateAdapter", "app_debug"})
public final class ListFragment extends androidx.fragment.app.Fragment {
    public com.sy.publicapiviewer.databinding.FragmentListBinding binding;
    public com.sy.publicapiviewer.MainActivity mainActivity;
    public FindPhoneAdapter adapter;
    public com.sy.publicapiviewer.service.FindPhoneService service;
    public com.sy.publicapiviewer.RestApi restApi;
    public com.sy.publicapiviewer.FindPhoneRepository repository;
    private final kotlin.Lazy viewModel$delegate = null;
    
    public ListFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.sy.publicapiviewer.databinding.FragmentListBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull()
    com.sy.publicapiviewer.databinding.FragmentListBinding p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.sy.publicapiviewer.MainActivity getMainActivity() {
        return null;
    }
    
    public final void setMainActivity(@org.jetbrains.annotations.NotNull()
    com.sy.publicapiviewer.MainActivity p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final FindPhoneAdapter getAdapter() {
        return null;
    }
    
    public final void setAdapter(@org.jetbrains.annotations.NotNull()
    FindPhoneAdapter p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.sy.publicapiviewer.service.FindPhoneService getService() {
        return null;
    }
    
    public final void setService(@org.jetbrains.annotations.NotNull()
    com.sy.publicapiviewer.service.FindPhoneService p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.sy.publicapiviewer.RestApi getRestApi() {
        return null;
    }
    
    public final void setRestApi(@org.jetbrains.annotations.NotNull()
    com.sy.publicapiviewer.RestApi p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.sy.publicapiviewer.FindPhoneRepository getRepository() {
        return null;
    }
    
    public final void setRepository(@org.jetbrains.annotations.NotNull()
    com.sy.publicapiviewer.FindPhoneRepository p0) {
    }
    
    private final com.sy.publicapiviewer.FindPhoneViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    public void onAttach(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final void loadData(@org.jetbrains.annotations.NotNull()
    java.lang.String query) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u000eB\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0002\u0010\u0006J\u001c\u0010\u0007\u001a\u00020\u00052\n\u0010\b\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\t\u001a\u00020\nH\u0016J\u001c\u0010\u000b\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\nH\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/sy/publicapiviewer/ListFragment$PhoneLoadStateAdapter;", "Landroidx/paging/LoadStateAdapter;", "Lcom/sy/publicapiviewer/ListFragment$PhoneLoadStateAdapter$SampleLoadStateViewHolder;", "retry", "Lkotlin/Function0;", "", "(Lkotlin/jvm/functions/Function0;)V", "onBindViewHolder", "holder", "loadState", "Landroidx/paging/LoadState;", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "SampleLoadStateViewHolder", "app_debug"})
    public static final class PhoneLoadStateAdapter extends androidx.paging.LoadStateAdapter<com.sy.publicapiviewer.ListFragment.PhoneLoadStateAdapter.SampleLoadStateViewHolder> {
        private final kotlin.jvm.functions.Function0<kotlin.Unit> retry = null;
        
        public PhoneLoadStateAdapter(@org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function0<kotlin.Unit> retry) {
            super();
        }
        
        @java.lang.Override()
        public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
        com.sy.publicapiviewer.ListFragment.PhoneLoadStateAdapter.SampleLoadStateViewHolder holder, @org.jetbrains.annotations.NotNull()
        androidx.paging.LoadState loadState) {
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public com.sy.publicapiviewer.ListFragment.PhoneLoadStateAdapter.SampleLoadStateViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.ViewGroup parent, @org.jetbrains.annotations.NotNull()
        androidx.paging.LoadState loadState) {
            return null;
        }
        
        @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/sy/publicapiviewer/ListFragment$PhoneLoadStateAdapter$SampleLoadStateViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/sy/publicapiviewer/databinding/ProgressItemBinding;", "(Lcom/sy/publicapiviewer/ListFragment$PhoneLoadStateAdapter;Lcom/sy/publicapiviewer/databinding/ProgressItemBinding;)V", "bind", "", "loadState", "Landroidx/paging/LoadState;", "app_debug"})
        public final class SampleLoadStateViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
            private final com.sy.publicapiviewer.databinding.ProgressItemBinding binding = null;
            
            public SampleLoadStateViewHolder(@org.jetbrains.annotations.NotNull()
            com.sy.publicapiviewer.databinding.ProgressItemBinding binding) {
                super(null);
            }
            
            public final void bind(@org.jetbrains.annotations.NotNull()
            androidx.paging.LoadState loadState) {
            }
        }
    }
}