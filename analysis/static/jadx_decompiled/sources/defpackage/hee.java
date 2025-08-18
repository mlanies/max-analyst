package defpackage;

import android.util.Size;

/* loaded from: classes.dex */
public final class hee extends xf4 {
    public final oq1 n;
    public lq1 o;
    public xf4 p;
    public kee q;

    public hee(Size size, int i) {
        super(size, i);
        this.n = f8.g(new bqc(23, this));
    }

    @Override // defpackage.xf4
    public final void a() {
        super.a();
        kq0.H(new fee(this, 2));
    }

    @Override // defpackage.xf4
    public final bm7 e() {
        return this.n;
    }

    public final boolean f(xf4 xf4Var, Runnable runnable) {
        boolean z;
        kq0.e();
        xf4Var.getClass();
        xf4 xf4Var2 = this.p;
        if (xf4Var2 == xf4Var) {
            return false;
        }
        c54.p("A different provider has been set. To change the provider, call SurfaceEdge#invalidate before calling SurfaceEdge#setProvider", xf4Var2 == null);
        Size size = this.h;
        Size size2 = xf4Var.h;
        c54.j("The provider's size(" + size + ") must match the parent(" + size2 + ")", size.equals(size2));
        int i = xf4Var.i;
        int i2 = this.i;
        c54.j(wg0.h("The provider's format(", i2, ") must match the parent(", i, ")"), i2 == i);
        synchronized (this.a) {
            z = this.c;
        }
        c54.p("The parent is closed. Call SurfaceEdge#invalidate() before setting a new provider.", !z);
        this.p = xf4Var;
        kq0.y(xf4Var.c(), this.o);
        xf4Var.d();
        kq0.w(this.e).d(new wf4(xf4Var, 2), ju0.k());
        kq0.w(xf4Var.g).d(runnable, ju0.D());
        return true;
    }
}
