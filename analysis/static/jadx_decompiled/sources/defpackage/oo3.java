package defpackage;

import android.content.Context;

/* loaded from: classes.dex */
public final class oo3 extends pnf {
    public static final /* synthetic */ bc7[] G0;
    public static final l45 H0;
    public final w4d A0;
    public final js3 B0;
    public final s35 C0;
    public final s35 D0;
    public final q0e E0;
    public final q0e F0;
    public final je7 X;
    public final je7 Y;
    public final je7 Z;
    public final uo3 b;
    public final kke c;
    public final je7 o;
    public final je7 s0;
    public final je7 t0;
    public final je7 u0;
    public final je7 v0;
    public final je7 w0;
    public final je7 x0;
    public final je7 y0;
    public final w7c z0;

    static {
        oi9 oi9Var = new oi9(oo3.class, "showInviteDialogJob", "getShowInviteDialogJob()Lkotlinx/coroutines/Job;");
        nec.a.getClass();
        G0 = new bc7[]{oi9Var};
        H0 = new l45(y53.M(vj3.c, vj3.Z, vj3.s0, vj3.a, vj3.b, vj3.o, vj3.t0, vj3.X, vj3.Y));
    }

    public oo3(uo3 uo3Var, je7 je7Var, qn3 qn3Var, je7 je7Var2, kke kkeVar, je7 je7Var3, je7 je7Var4, je7 je7Var5, je7 je7Var6, je7 je7Var7, je7 je7Var8, je7 je7Var9, je7 je7Var10, je7 je7Var11, je7 je7Var12, je7 je7Var13, je7 je7Var14) {
        this.b = uo3Var;
        this.c = kkeVar;
        this.o = je7Var4;
        this.X = je7Var5;
        this.Y = je7Var6;
        this.Z = je7Var7;
        this.s0 = je7Var8;
        this.t0 = je7Var9;
        this.u0 = je7Var10;
        this.v0 = je7Var11;
        this.w0 = je7Var12;
        this.x0 = je7Var13;
        this.y0 = je7Var14;
        q0e q0eVarA = r0e.a(dn3.d);
        w7c w7cVar = new w7c(q0eVarA);
        this.z0 = w7cVar;
        this.A0 = mqd.D();
        this.B0 = new js3(this.a, w7cVar, new td(je7Var2, (Context) je7Var.getValue(), uo3Var == uo3.a, 8), new v07(kkeVar), je7Var3);
        this.C0 = new s35(0);
        this.D0 = new s35(0);
        q0e q0eVarA2 = r0e.a(new eqe(a9a.j));
        this.E0 = q0eVarA2;
        this.F0 = q0eVarA2;
        od2.L(new zn5(new ac(qn3Var.a(), 17, this), new vw(2, q0eVarA, ti9.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 17), 5), this.a);
        qn3Var.b();
        pnf.n(this, ((w9a) kkeVar).b(), null, new eo3(this, null), 2);
    }

    public final void q(int i, long j) {
        pnf.n(this, ((w9a) this.c).a(), null, new jo3(i, this, j, null), 2);
    }

    public final void r() {
        bc7[] bc7VarArr = G0;
        bc7 bc7Var = bc7VarArr[0];
        w4d w4dVar = this.A0;
        x77 x77Var = (x77) w4dVar.T0(this, bc7Var);
        if (x77Var == null || !x77Var.isActive()) {
            w4dVar.o1(this, bc7VarArr[0], pnf.n(this, ((w9a) this.c).c(), null, new lo3(this, null), 2));
        }
    }
}
