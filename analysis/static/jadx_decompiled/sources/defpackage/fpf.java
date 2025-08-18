package defpackage;

import android.view.View;
import java.util.concurrent.CancellationException;

/* loaded from: classes2.dex */
public final class fpf implements View.OnAttachStateChangeListener {
    public vxd a;
    public final /* synthetic */ c66 b;
    public final /* synthetic */ View c;

    public fpf(c66 c66Var, View view) {
        this.b = c66Var;
        this.c = view;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        vxd vxdVar = this.a;
        if (vxdVar == null || !vxdVar.isActive()) {
            w7c w7cVar = (w7c) qp4.u0.b(view.getContext()).t0;
            c66 c66Var = this.b;
            View view2 = this.c;
            this.a = od2.L(new zn5(new zn5(w7cVar, new dpf(c66Var, view2, view, null)), new epf(c66Var, view2, null), 5), lnf.b(view));
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        vxd vxdVar = this.a;
        if (vxdVar != null) {
            vxdVar.cancel((CancellationException) null);
        }
        this.a = null;
    }
}
