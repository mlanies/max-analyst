package defpackage;

/* loaded from: classes.dex */
public final class i0 extends li0 {
    public final /* synthetic */ String a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ k0 c;

    public i0(k0 k0Var, String str, boolean z) {
        this.c = k0Var;
        this.a = str;
        this.b = z;
    }

    @Override // defpackage.li0, defpackage.b34
    public final void b(g0 g0Var) {
        boolean zH = g0Var.h();
        float fD = g0Var.d();
        String str = this.a;
        k0 k0Var = this.c;
        if (!k0Var.h(str, g0Var)) {
            k0Var.i("ignore_old_datasource @ onProgress", null);
            g0Var.a();
        } else {
            if (zH) {
                return;
            }
            k0Var.h.m(fD, false);
        }
    }

    @Override // defpackage.li0
    public final void e(g0 g0Var) {
        this.c.l(this.a, g0Var, g0Var.c(), true);
    }

    @Override // defpackage.li0
    public final void f(g0 g0Var) {
        boolean zH = g0Var.h();
        boolean z = g0Var instanceof vjc;
        float fD = g0Var.d();
        Object objE = g0Var.e();
        if (objE != null) {
            this.c.m(this.a, g0Var, objE, fD, zH, this.b, z);
        } else if (zH) {
            this.c.l(this.a, g0Var, new NullPointerException(), true);
        }
    }
}
