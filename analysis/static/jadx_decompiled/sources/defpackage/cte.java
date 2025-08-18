package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class cte extends pnf {
    public static final /* synthetic */ bc7[] X;
    public final q0e b = r0e.a(nz4.a);
    public final w4d c;
    public final List o;

    static {
        oi9 oi9Var = new oi9(cte.class, "loadJob", "getLoadJob()Lkotlinx/coroutines/Job;");
        nec.a.getClass();
        X = new bc7[]{oi9Var};
    }

    public cte(iba ibaVar) {
        w4d w4dVarD = mqd.D();
        this.c = w4dVarD;
        kpa kpaVar = new kpa("single", ibaVar.d());
        bc7[] bc7VarArr = iba.p;
        bc7 bc7Var = bc7VarArr[5];
        kpa kpaVar2 = new kpa("trnsmt", ibaVar.e(ibaVar.k));
        bc7 bc7Var2 = bc7VarArr[4];
        kpa kpaVar3 = new kpa("net", ibaVar.e(ibaVar.j));
        bc7 bc7Var3 = bc7VarArr[3];
        this.o = y53.M(kpaVar, kpaVar2, kpaVar3, new kpa("single-low", ibaVar.e(ibaVar.i)));
        w4dVarD.o1(this, X[0], pnf.n(this, null, vx3.b, new bte(this, null), 1));
    }
}
