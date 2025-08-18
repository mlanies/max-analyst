package defpackage;

import android.text.TextUtils;

/* loaded from: classes2.dex */
public final class ale {
    public final je7 a;
    public final je7 b;
    public final je7 c;
    public final je7 d;
    public final je7 e;
    public final je7 f;

    public ale(je7 je7Var, je7 je7Var2, je7 je7Var3, je7 je7Var4, je7 je7Var5, je7 je7Var6) {
        this.a = je7Var;
        this.b = je7Var2;
        this.c = je7Var3;
        this.d = je7Var4;
        this.e = je7Var5;
        this.f = je7Var6;
    }

    public final eqb a() {
        return (eqb) this.c.getValue();
    }

    public final void b(String str, String str2, String str3, String str4) {
        a().f(false, !((ch3) r0.a.getValue()).c());
        ((ad) this.b.getValue()).f("ACTION_DEEP_LINK_PUSH_RECEIVE");
        ((k4a) ((pk) this.d.getValue())).A(str, false);
        d64 d64Var = (d64) this.a.getValue();
        bea beaVar = (bea) d64Var.b.getValue();
        ((p84) d64Var.c.getValue()).getClass();
        bu9 bu9VarH = beaVar.h("ru.oneme.app.misc", true, false);
        if (!TextUtils.isEmpty(str3)) {
            bu9VarH.f(str3);
        }
        if (!TextUtils.isEmpty(str2)) {
            bu9VarH.e(str2);
            zt9 zt9Var = new zt9(0);
            zt9Var.f = bu9.c(str2);
            bu9VarH.q(zt9Var);
        }
        if (TextUtils.isEmpty(str4)) {
            return;
        }
        bu9VarH.k(ld0.a(d64Var.a, (ida) d64Var.d.getValue(), (p82) d64Var.e.getValue(), (pd0) d64Var.f.getValue(), null, str4, ((hyc) ((q33) d64Var.g.getValue())).q(), (ztc) d64Var.h.getValue()));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(long r17, long r19, java.lang.String r21, java.lang.String r22, java.lang.String r23, boolean r24) {
        /*
            Method dump skipped, instructions count: 403
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ale.c(long, long, java.lang.String, java.lang.String, java.lang.String, boolean):void");
    }

    public final void d(l7 l7Var) {
        eqb eqbVarA = a();
        oq0 oq0VarC = ((f5a) eqbVarA.v0.getValue()).c();
        boolean z = oq0VarC.b;
        boolean z2 = oq0VarC.a;
        if (z2 && !z) {
            ((rw9) eqbVarA.u0.getValue()).f(l7Var.b, l7Var.c);
            eqbVarA.f(false, eqbVarA.c());
            return;
        }
        hm9.m0("eqb", "onReadOnOtherDevice: skipped, authorized=" + z2 + ", external=" + z, new Object[0]);
    }

    public final void e() {
        a().f(false, !((ch3) r2.a.getValue()).c());
    }
}
