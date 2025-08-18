package defpackage;

import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes2.dex */
public final class c50 implements am7 {
    public static final /* synthetic */ bc7[] h;
    public final je7 a;
    public final ContextScope b;
    public final w4d c = mqd.D();
    public final w4d d = new w4d(3, this);
    public volatile Long e;
    public final q0e f;
    public final zn5 g;

    static {
        oi9 oi9Var = new oi9(c50.class, "updatePlayer", "getUpdatePlayer()Lkotlinx/coroutines/Job;");
        nec.a.getClass();
        h = new bc7[]{oi9Var};
    }

    public c50(je7 je7Var, je7 je7Var2) {
        this.a = je7Var2;
        this.b = j1e.a(((w9a) ((kke) je7Var.getValue())).c().getImmediate().plus(pag.a()));
        q0e q0eVarA = r0e.a(new zl7(null, false));
        this.f = q0eVarA;
        this.g = new zn5(q0eVarA, new a50(je7Var2, this, null));
    }

    public static final void f(c50 c50Var) {
        vxd vxdVarT = j47.T(c50Var.b, null, vx3.b, new b50(c50Var, null), 1);
        c50Var.c.o1(c50Var, h[0], vxdVarT);
    }

    @Override // defpackage.am7
    public final void a() {
        if (((uh9) g()).x) {
            ((uh9) g()).t();
        }
    }

    @Override // defpackage.am7
    public final void b(Long l) {
        this.e = l;
    }

    @Override // defpackage.am7
    public final void c() {
        q0e q0eVar = this.f;
        ((zl7) q0eVar.getValue()).getClass();
        q0eVar.m(null, new zl7(null, false));
    }

    @Override // defpackage.am7
    public final mn5 d() {
        return this.g;
    }

    @Override // defpackage.am7
    public final void e() {
        uh9 uh9Var = (uh9) g();
        uh9Var.getClass();
        j47.T(uh9Var.h, null, null, new rh9(uh9Var, 1.0f, null), 3);
        long jL = ((uh9) g()).l();
        Long l = this.e;
        boolean z = l != null && jL == l.longValue();
        if (((uh9) g()).x && z) {
            ((uh9) g()).q();
            return;
        }
        if (((uh9) g()).w && z) {
            ((uh9) g()).r();
            return;
        }
        Long l2 = this.e;
        if (l2 != null) {
            long jLongValue = l2.longValue();
            ch9 ch9VarG = g();
            uh9 uh9Var2 = (uh9) ch9VarG;
            j47.T(uh9Var2.h, ((w9a) uh9Var2.b).b(), null, new oh9(new zg9(jLongValue), uh9Var2, null), 2);
        }
    }

    public final ch9 g() {
        return (ch9) this.a.getValue();
    }

    @Override // defpackage.am7
    public final void release() {
        j1e.i(this.b, null);
        ((uh9) g()).s(this.d);
    }

    @Override // defpackage.am7
    public final void seekTo(long j) {
        uh9 uh9Var = (uh9) g();
        uh9Var.getClass();
        j47.T(uh9Var.h, null, null, new qh9(j, uh9Var, null), 3);
    }
}
