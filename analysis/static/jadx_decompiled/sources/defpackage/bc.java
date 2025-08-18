package defpackage;

/* loaded from: classes2.dex */
public final class bc extends pnf {
    public static final /* synthetic */ bc7[] t0;
    public final w4d X = mqd.D();
    public final kld Y;
    public final q0e Z;
    public final long b;
    public final pb c;
    public final je7 o;
    public final ac s0;

    static {
        oi9 oi9Var = new oi9(bc.class, "searchJob", "getSearchJob()Lkotlinx/coroutines/Job;");
        nec.a.getClass();
        t0 = new bc7[]{oi9Var};
    }

    public bc(long j, pb pbVar, je7 je7Var, je7 je7Var2) {
        this.b = j;
        this.c = pbVar;
        this.o = je7Var;
        kld kldVarB = lld.b(0, 0, 0, 7);
        this.Y = kldVarB;
        q0e q0eVarA = r0e.a(null);
        this.Z = q0eVarA;
        this.s0 = new ac(new j31(pbVar.j, kldVarB, new c3(this, null, 1), 4), 0, this);
        if (pbVar.g.compareAndSet(false, true)) {
            j47.T(pbVar.f, null, null, new ob(pbVar, null), 3);
        }
        od2.L(new zn5(pbVar.l, new vb(this, null), 5), this.a);
        od2.L(new zn5(od2.x(od2.u(q0eVarA, 200L)), new xb(this, je7Var2, null), 5), this.a);
    }

    public final boolean q() {
        CharSequence charSequence = (CharSequence) this.Z.getValue();
        return !(charSequence == null || charSequence.length() == 0);
    }
}
