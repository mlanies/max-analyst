package defpackage;

/* loaded from: classes.dex */
public final class ft1 implements ct1 {
    public static final /* synthetic */ bc7[] f;
    public final jr1 a;
    public final je7 b;
    public final je7 c;
    public final je7 d;
    public final w4d e = mqd.D();

    static {
        oi9 oi9Var = new oi9(ft1.class, "tokenRefreshJob", "getTokenRefreshJob()Lkotlinx/coroutines/Job;");
        nec.a.getClass();
        f = new bc7[]{oi9Var};
    }

    public ft1(jr1 jr1Var, je7 je7Var, je7 je7Var2, je7 je7Var3) {
        this.a = jr1Var;
        this.b = je7Var;
        this.c = je7Var2;
        this.d = je7Var3;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(kotlin.coroutines.Continuation r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ft1.a(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void b() {
        bc7[] bc7VarArr = f;
        bc7 bc7Var = bc7VarArr[0];
        w4d w4dVar = this.e;
        x77 x77Var = (x77) w4dVar.T0(this, bc7Var);
        if (x77Var == null || !x77Var.isActive()) {
            w4dVar.o1(this, bc7VarArr[0], j47.T(this.a, null, null, new et1(this, null), 3));
        }
    }
}
