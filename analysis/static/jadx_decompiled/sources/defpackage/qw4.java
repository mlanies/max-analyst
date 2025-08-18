package defpackage;

import android.os.Build;

/* loaded from: classes.dex */
public final class qw4 extends tu0 {
    public final /* synthetic */ rw4 n;

    public qw4(rw4 rw4Var) {
        this.n = rw4Var;
    }

    @Override // defpackage.tu0
    public final void v(Throwable th) {
        ((vw4) this.n.a).e(th);
    }

    @Override // defpackage.tu0
    public final void y(t99 t99Var) {
        rw4 rw4Var = this.n;
        if (t99Var == null) {
            ((vw4) rw4Var.a).e(new IllegalArgumentException("metadataRepo cannot be null"));
            return;
        }
        rw4Var.c = t99Var;
        t99 t99Var2 = (t99) rw4Var.c;
        vw4 vw4Var = (vw4) rw4Var.a;
        rw4Var.b = new te(t99Var2, vw4Var.g, vw4Var.n, vw4Var.i, vw4Var.j, Build.VERSION.SDK_INT >= 34 ? dx4.a() : od2.H());
        ((vw4) rw4Var.a).f();
    }
}
