package defpackage;

import java.util.concurrent.CancellationException;

/* loaded from: classes2.dex */
public final class of3 extends pnf implements dh3 {
    public static final /* synthetic */ bc7[] F0;
    public static final String G0;
    public final gld A0;
    public final q0e B0;
    public volatile String C0;
    public vxd D0;
    public final w4d E0;
    public final String X;
    public final je7 Y;
    public final je7 Z;
    public final /* synthetic */ snf b;
    public final int c;
    public String o;
    public final je7 s0;
    public final je7 t0;
    public final je7 u0;
    public final kld v0;
    public final m32 w0;
    public final s35 x0;
    public final q0e y0;
    public final w7c z0;

    static {
        oi9 oi9Var = new oi9(of3.class, "loginJob", "getLoginJob()Lkotlinx/coroutines/Job;");
        nec.a.getClass();
        F0 = new bc7[]{oi9Var};
        G0 = of3.class.getName();
    }

    public of3(int i, String str, String str2, khe kheVar, khe kheVar2, khe kheVar3, je7 je7Var, je7 je7Var2) {
        lt7 lt7Var = lt7.a;
        khe kheVarD = lt7Var.getAccessor().d(ty3.class);
        khe kheVarD2 = lt7Var.getAccessor().d(cud.class);
        snf snfVar = new snf(je7Var2, new pz2(5));
        this.b = snfVar;
        this.c = i;
        this.o = str;
        this.X = str2;
        this.Y = kheVar;
        this.Z = kheVar2;
        this.s0 = kheVar3;
        this.t0 = je7Var;
        this.u0 = kheVarD2;
        kld kldVarB = lld.b(0, 1, 2, 1);
        this.v0 = kldVarB;
        m32 m32VarN = od2.N(kldVarB, new t03(new t03(snfVar.o, 11), 1));
        this.w0 = m32VarN;
        this.x0 = new s35(0);
        q0e q0eVarA = r0e.a(60L);
        this.y0 = q0eVarA;
        this.z0 = od2.X(new t03(q0eVarA, 2), this.a, wld.a, null);
        this.A0 = ((we6) ((cud) kheVarD2.getValue())).c;
        this.B0 = r0e.a(Boolean.FALSE);
        this.E0 = mqd.D();
        od2.L(od2.F(new zn5(m32VarN, new hf3(this, kheVarD, null), 5), ((w9a) ((kke) je7Var.getValue())).a()), this.a);
    }

    @Override // defpackage.dh3
    public final v7c f() {
        return this.b.o;
    }

    @Override // defpackage.pnf
    public final void p() {
        vxd vxdVar = this.D0;
        if (vxdVar != null) {
            vxdVar.cancel((CancellationException) null);
        }
        this.D0 = null;
        bc7[] bc7VarArr = F0;
        bc7 bc7Var = bc7VarArr[0];
        w4d w4dVar = this.E0;
        x77 x77Var = (x77) w4dVar.T0(this, bc7Var);
        if (x77Var != null) {
            x77Var.cancel(null);
        }
        w4dVar.o1(this, bc7VarArr[0], null);
    }
}
