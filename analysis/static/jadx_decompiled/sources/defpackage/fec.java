package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;

/* loaded from: classes.dex */
public final class fec extends a4 {
    public final RecyclerView d;
    public final eec e;

    public fec(RecyclerView recyclerView) {
        this.d = recyclerView;
        eec eecVar = this.e;
        if (eecVar != null) {
            this.e = eecVar;
        } else {
            this.e = new eec(this);
        }
    }

    @Override // defpackage.a4
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || this.d.X()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().Z(accessibilityEvent);
        }
    }

    @Override // defpackage.a4
    public final void d(View view, l4 l4Var) {
        this.a.onInitializeAccessibilityNodeInfo(view, l4Var.a);
        RecyclerView recyclerView = this.d;
        if (recyclerView.X() || recyclerView.getLayoutManager() == null) {
            return;
        }
        a layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.b;
        layoutManager.a0(recyclerView2.c, recyclerView2.s1, l4Var);
    }

    @Override // defpackage.a4
    public final boolean g(View view, int i, Bundle bundle) {
        if (super.g(view, i, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.d;
        if (recyclerView.X() || recyclerView.getLayoutManager() == null) {
            return false;
        }
        a layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.b;
        return layoutManager.o0(recyclerView2.c, recyclerView2.s1, i, bundle);
    }
}
