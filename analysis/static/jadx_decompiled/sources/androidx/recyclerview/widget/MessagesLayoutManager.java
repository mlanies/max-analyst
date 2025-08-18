package androidx.recyclerview.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import defpackage.dec;
import defpackage.lu3;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/recyclerview/widget/MessagesLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "tamtam-app_release"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes.dex */
public final class MessagesLayoutManager extends LinearLayoutManager {
    public RecyclerView E;

    public MessagesLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        o1(1);
        p1(true);
        this.h = false;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.a
    public final boolean K0() {
        return false;
    }

    @Override // androidx.recyclerview.widget.a
    public final void S(View view, int i, int i2, int i3, int i4) {
        dec decVarT;
        RecyclerView recyclerView = this.E;
        if (recyclerView == null || (decVarT = recyclerView.T(view)) == null) {
            return;
        }
        if (!(decVarT instanceof lu3)) {
            super.S(view, i, i2, i3, i4);
            return;
        }
        int i5 = i3 - i;
        int width = ((recyclerView.getWidth() - i5) / 2) + recyclerView.getLeft();
        super.S(view, width, i2, width + i5, i4);
    }

    @Override // androidx.recyclerview.widget.a
    public final void W(RecyclerView recyclerView) {
        this.E = recyclerView;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.a
    public final void X(RecyclerView recyclerView) {
        this.E = null;
    }
}
