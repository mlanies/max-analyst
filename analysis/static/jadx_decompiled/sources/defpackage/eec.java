package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class eec extends a4 {
    public final fec d;
    public final WeakHashMap e = new WeakHashMap();

    public eec(fec fecVar) {
        this.d = fecVar;
    }

    @Override // defpackage.a4
    public final boolean a(View view, AccessibilityEvent accessibilityEvent) {
        a4 a4Var = (a4) this.e.get(view);
        return a4Var != null ? a4Var.a(view, accessibilityEvent) : this.a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // defpackage.a4
    public final w4d b(View view) {
        a4 a4Var = (a4) this.e.get(view);
        return a4Var != null ? a4Var.b(view) : super.b(view);
    }

    @Override // defpackage.a4
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        a4 a4Var = (a4) this.e.get(view);
        if (a4Var != null) {
            a4Var.c(view, accessibilityEvent);
        } else {
            super.c(view, accessibilityEvent);
        }
    }

    @Override // defpackage.a4
    public final void d(View view, l4 l4Var) {
        fec fecVar = this.d;
        boolean zX = fecVar.d.X();
        View.AccessibilityDelegate accessibilityDelegate = this.a;
        AccessibilityNodeInfo accessibilityNodeInfo = l4Var.a;
        if (!zX) {
            RecyclerView recyclerView = fecVar.d;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().c0(view, l4Var);
                a4 a4Var = (a4) this.e.get(view);
                if (a4Var != null) {
                    a4Var.d(view, l4Var);
                    return;
                } else {
                    accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                    return;
                }
            }
        }
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
    }

    @Override // defpackage.a4
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        a4 a4Var = (a4) this.e.get(view);
        if (a4Var != null) {
            a4Var.e(view, accessibilityEvent);
        } else {
            super.e(view, accessibilityEvent);
        }
    }

    @Override // defpackage.a4
    public final boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        a4 a4Var = (a4) this.e.get(viewGroup);
        return a4Var != null ? a4Var.f(viewGroup, view, accessibilityEvent) : this.a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // defpackage.a4
    public final boolean g(View view, int i, Bundle bundle) {
        fec fecVar = this.d;
        if (!fecVar.d.X()) {
            RecyclerView recyclerView = fecVar.d;
            if (recyclerView.getLayoutManager() != null) {
                a4 a4Var = (a4) this.e.get(view);
                if (a4Var != null) {
                    if (a4Var.g(view, i, bundle)) {
                        return true;
                    }
                } else if (super.g(view, i, bundle)) {
                    return true;
                }
                vdc vdcVar = recyclerView.getLayoutManager().b.c;
                return false;
            }
        }
        return super.g(view, i, bundle);
    }

    @Override // defpackage.a4
    public final void h(View view, int i) {
        a4 a4Var = (a4) this.e.get(view);
        if (a4Var != null) {
            a4Var.h(view, i);
        } else {
            super.h(view, i);
        }
    }

    @Override // defpackage.a4
    public final void i(View view, AccessibilityEvent accessibilityEvent) {
        a4 a4Var = (a4) this.e.get(view);
        if (a4Var != null) {
            a4Var.i(view, accessibilityEvent);
        } else {
            super.i(view, accessibilityEvent);
        }
    }
}
