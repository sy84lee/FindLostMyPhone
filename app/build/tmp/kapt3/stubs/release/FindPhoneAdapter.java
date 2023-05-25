
import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00142\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0014\u0015B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000fH\u0016R\u001a\u0010\u0007\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u0006\u00a8\u0006\u0016"}, d2 = {"LFindPhoneAdapter;", "Landroidx/paging/PagingDataAdapter;", "Lcom/sy/publicapiviewer/item/Item;", "LFindPhoneAdapter$Holder;", "listener", "Lcom/sy/publicapiviewer/OnItemClick;", "(Lcom/sy/publicapiviewer/OnItemClick;)V", "mCallback", "getMCallback", "()Lcom/sy/publicapiviewer/OnItemClick;", "setMCallback", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Companion", "Holder", "app_release"})
public final class FindPhoneAdapter extends androidx.paging.PagingDataAdapter<com.sy.publicapiviewer.item.Item, FindPhoneAdapter.Holder> {
    @org.jetbrains.annotations.NotNull()
    private com.sy.publicapiviewer.OnItemClick mCallback;
    @org.jetbrains.annotations.NotNull()
    public static final FindPhoneAdapter.Companion Companion = null;
    private static final androidx.recyclerview.widget.DiffUtil.ItemCallback<com.sy.publicapiviewer.item.Item> IMAGE_DIFF = null;
    
    public FindPhoneAdapter(@org.jetbrains.annotations.NotNull()
    com.sy.publicapiviewer.OnItemClick listener) {
        super(null, null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.sy.publicapiviewer.OnItemClick getMCallback() {
        return null;
    }
    
    public final void setMCallback(@org.jetbrains.annotations.NotNull()
    com.sy.publicapiviewer.OnItemClick p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public FindPhoneAdapter.Holder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    FindPhoneAdapter.Holder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0014"}, d2 = {"LFindPhoneAdapter$Holder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/sy/publicapiviewer/databinding/ItemRecycler2Binding;", "callback", "Lcom/sy/publicapiviewer/OnItemClick;", "(Lcom/sy/publicapiviewer/databinding/ItemRecycler2Binding;Lcom/sy/publicapiviewer/OnItemClick;)V", "getBinding", "()Lcom/sy/publicapiviewer/databinding/ItemRecycler2Binding;", "getCallback", "()Lcom/sy/publicapiviewer/OnItemClick;", "currentItem", "Lcom/sy/publicapiviewer/item/Item;", "getCurrentItem", "()Lcom/sy/publicapiviewer/item/Item;", "setCurrentItem", "(Lcom/sy/publicapiviewer/item/Item;)V", "setItem", "", "item", "app_release"})
    public static final class Holder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.sy.publicapiviewer.databinding.ItemRecycler2Binding binding = null;
        @org.jetbrains.annotations.NotNull()
        private final com.sy.publicapiviewer.OnItemClick callback = null;
        public com.sy.publicapiviewer.item.Item currentItem;
        
        public Holder(@org.jetbrains.annotations.NotNull()
        com.sy.publicapiviewer.databinding.ItemRecycler2Binding binding, @org.jetbrains.annotations.NotNull()
        com.sy.publicapiviewer.OnItemClick callback) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.sy.publicapiviewer.databinding.ItemRecycler2Binding getBinding() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.sy.publicapiviewer.OnItemClick getCallback() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.sy.publicapiviewer.item.Item getCurrentItem() {
            return null;
        }
        
        public final void setCurrentItem(@org.jetbrains.annotations.NotNull()
        com.sy.publicapiviewer.item.Item p0) {
        }
        
        public final void setItem(@org.jetbrains.annotations.NotNull()
        com.sy.publicapiviewer.item.Item item) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"LFindPhoneAdapter$Companion;", "", "()V", "IMAGE_DIFF", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/sy/publicapiviewer/item/Item;", "app_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}