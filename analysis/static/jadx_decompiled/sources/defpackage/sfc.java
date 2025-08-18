package defpackage;

import android.net.Uri;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class sfc implements p26 {
    public final iv6 a;
    public final String b = sfc.class.getName();
    public m26 c = m26.d;
    public g0 d;
    public g0 e;

    public sfc(iv6 iv6Var) {
        this.a = iv6Var;
    }

    @Override // defpackage.p26
    public final m26 c() {
        return this.c;
    }

    @Override // defpackage.p26
    public final boolean d() {
        gef gefVar = this.c.a;
        return (gefVar != null ? gefVar.b() : null) != null;
    }

    @Override // defpackage.p26
    public final Object e(long j, Continuation continuation) {
        g0 g0Var = this.e;
        if (g0Var != null) {
            g0Var.a();
        }
        this.e = null;
        gef gefVar = this.c.a;
        uy uyVarB = gefVar != null ? gefVar.b() : null;
        if (gefVar == null || uyVarB == null) {
            hm9.p(this.b, "Video collage is null", null);
            return null;
        }
        sy1 sy1Var = new sy1(1, v3c.u(continuation));
        sy1Var.n();
        xv6 xv6VarD = xv6.d(Uri.parse((String) uyVarB.Y));
        xv6VarD.p = bp4.c;
        xv6VarD.l = new x26(gefVar, j);
        g0 g0VarA = this.a.a(xv6VarD.a(), null);
        this.e = g0VarA;
        g0VarA.m(new yu6(sy1Var, g0VarA, this), qq1.a);
        return sy1Var.m();
    }

    @Override // defpackage.p26
    public final void prepare() throws NumberFormatException {
        gef gefVar = this.c.a;
        String str = this.b;
        if (gefVar == null) {
            hm9.p(str, "You should call init before prepare!", null);
            return;
        }
        uy uyVarB = gefVar.b();
        if (uyVarB == null) {
            hm9.p(str, "Video collage is null", null);
            return;
        }
        xv6 xv6VarD = xv6.d(Uri.parse((String) uyVarB.Y));
        xv6VarD.p = bp4.c;
        g0 g0Var = this.d;
        if (g0Var != null) {
            g0Var.a();
        }
        this.d = null;
        this.d = this.a.f(xv6VarD.a(), null);
    }
}
