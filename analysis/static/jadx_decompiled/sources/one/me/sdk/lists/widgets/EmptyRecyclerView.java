package one.me.sdk.lists.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.au1;
import defpackage.bc7;
import defpackage.hdc;
import defpackage.hm9;
import defpackage.jdc;
import defpackage.nec;
import defpackage.oi9;
import defpackage.pz4;
import defpackage.qz4;
import defpackage.tpa;
import defpackage.u2;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.Metadata;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0002\b\u0003\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011R/\u0010\u0018\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u000e8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0011¨\u0006\u0019"}, d2 = {"Lone/me/sdk/lists/widgets/EmptyRecyclerView;", "Landroidx/recyclerview/widget/RecyclerView;", "", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lhdc;", "adapter", "Le5f;", "setAdapter", "(Lhdc;)V", "Landroid/view/View;", "emptyView", "setEmptyView", "(Landroid/view/View;)V", "<set-?>", "V1", "Ls7c;", "getMEmptyView", "()Landroid/view/View;", "setMEmptyView", "mEmptyView", "lists_release"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public class EmptyRecyclerView extends RecyclerView {
    public static final /* synthetic */ bc7[] Y1;
    public final u2 V1;
    public jdc W1;
    public final LinkedHashSet X1;

    static {
        oi9 oi9Var = new oi9(EmptyRecyclerView.class, "mEmptyView", "getMEmptyView()Landroid/view/View;");
        nec.a.getClass();
        Y1 = new bc7[]{oi9Var};
    }

    public EmptyRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.V1 = new qz4(this, 0);
        this.X1 = new LinkedHashSet();
    }

    public static void K0(hdc hdcVar, jdc jdcVar) {
        if (jdcVar == null) {
            return;
        }
        try {
            hdcVar.z(jdcVar);
        } catch (Exception e) {
            hm9.l0(hdcVar.getClass().getName(), "fail to unregister data observer", e);
        }
    }

    public static void L0(hdc hdcVar, jdc jdcVar) {
        if (jdcVar == null) {
            return;
        }
        try {
            hdcVar.B(jdcVar);
        } catch (Exception e) {
            hm9.l0(hdcVar.getClass().getName(), "fail to unregister data observer", e);
        }
    }

    private final View getMEmptyView() {
        bc7 bc7Var = Y1[0];
        return (View) this.V1.b;
    }

    private final void setMEmptyView(View view) {
        this.V1.o1(this, Y1[0], view);
    }

    public final void F0() {
        if (getMEmptyView() == null || getAdapter() == null) {
            return;
        }
        hdc adapter = getAdapter();
        boolean z = adapter != null && adapter.j() == 0;
        View mEmptyView = getMEmptyView();
        if (mEmptyView != null) {
            mEmptyView.setVisibility(z ? 0 : 8);
        }
        setVisibility(z ? 8 : 0);
    }

    public void G0(hdc hdcVar) {
    }

    public void H0(hdc hdcVar) {
    }

    public void I0() {
    }

    public void J0() {
    }

    public final void M0(hdc hdcVar, boolean z) {
        hdc adapter = getAdapter();
        if (adapter != null) {
            L0(adapter, this.W1);
        }
        J0();
        hdc hdcVarN0 = N0(hdcVar);
        setLayoutFrozen(false);
        y0(hdcVarN0, true, z);
        k0(true);
        requestLayout();
        if (hdcVarN0 != null) {
            K0(hdcVarN0, this.W1);
        }
        H0(hdcVarN0);
    }

    public hdc N0(hdc hdcVar) {
        return hdcVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void setAdapter(hdc adapter) {
        jdc jdcVar;
        hdc adapter2 = getAdapter();
        if (adapter2 != null && (jdcVar = this.W1) != null) {
            L0(adapter2, jdcVar);
            this.W1 = null;
        }
        hdc hdcVarN0 = N0(adapter);
        I0();
        super.setAdapter(hdcVarN0);
        if (hdcVarN0 != null && getMEmptyView() != null) {
            pz4 pz4Var = new pz4(0, this);
            this.W1 = pz4Var;
            K0(hdcVarN0, pz4Var);
        }
        G0(hdcVarN0);
        F0();
    }

    public final void setEmptyView(View emptyView) {
        if (tpa.f(emptyView, getMEmptyView())) {
            return;
        }
        View mEmptyView = getMEmptyView();
        if (mEmptyView != null) {
            mEmptyView.setVisibility(8);
        }
        setMEmptyView(emptyView);
        F0();
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i, i2, i3, i4);
        Iterator it = this.X1.iterator();
        if (it.hasNext()) {
            au1.r(it.next());
            throw null;
        }
    }

    public EmptyRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.V1 = new qz4(this, 1);
        this.X1 = new LinkedHashSet();
    }
}
