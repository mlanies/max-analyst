package defpackage;

import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes.dex */
public final class n6a {
    public final ContextScope a;
    public final q33 b;
    public final y7d c;
    public final x6a d;
    public final kr1 e;
    public final je7 f = tu0.r(3, bv3.u0);

    public n6a(v4 v4Var) {
        this.a = j1e.a(((w9a) ((kke) v4Var.c(kke.class))).c());
        this.b = (q33) v4Var.c(q33.class);
        this.c = (y7d) v4Var.c(y7d.class);
        this.d = (x6a) v4Var.c(x6a.class);
        this.e = (kr1) v4Var.c(kr1.class);
    }

    public final boolean a() {
        if (((int) ((qyc) this.c).q(pyc.b, 0)) != 1) {
            return false;
        }
        String string = ((t33) this.b).g.getString("version.force.update.received", "");
        this.d.getClass();
        return tpa.f(string, "25.8.1");
    }

    public final void b() {
        ((wr1) this.e).v();
        j47.T(this.a, null, null, new m6a(this, null), 3);
    }
}
