package defpackage;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.android.prefs.PmsKey;

/* loaded from: classes2.dex */
public final class zjb extends pnf {
    public static final /* synthetic */ bc7[] B0;
    public z87 A0;
    public final je7 X;
    public final je7 Y;
    public final je7 Z;
    public final long b;
    public final je7 c;
    public final je7 o;
    public final je7 s0;
    public final kld t0;
    public final w4d u0;
    public final kld v0;
    public final v7c w0;
    public final s35 x0;
    public final AtomicLong y0;
    public final q0e z0;

    static {
        oi9 oi9Var = new oi9(zjb.class, "updateOptionsJob", "getUpdateOptionsJob()Lkotlinx/coroutines/Job;");
        nec.a.getClass();
        B0 = new bc7[]{oi9Var};
    }

    public zjb(long j, je7 je7Var, je7 je7Var2, je7 je7Var3, je7 je7Var4, je7 je7Var5, je7 je7Var6, je7 je7Var7) {
        int i = 11;
        this.b = j;
        this.c = je7Var;
        this.o = je7Var2;
        this.X = je7Var3;
        this.Y = je7Var6;
        this.Z = je7Var5;
        this.s0 = je7Var7;
        kld kldVarB = lld.b(0, 0, 0, 7);
        this.t0 = kldVarB;
        m32 m32VarN = od2.N(new ujb(((rh0) je7Var4.getValue()).b, this, 1), new t03(kldVarB, i));
        this.u0 = mqd.D();
        kld kldVarA = lld.a(1, 1, 2);
        this.v0 = kldVarA;
        this.w0 = new v7c(kldVarA);
        this.x0 = new s35(0);
        this.y0 = new AtomicLong(-9223372036854775807L);
        this.z0 = r0e.a(new ljb(false, false, false, false, false));
        y77 y77VarA = pag.a();
        y77VarA.H();
        this.A0 = y77VarA;
        od2.L(od2.F(new mqc(new xjb(new ujb(new t03(((jz2) ((iy2) je7Var.getValue())).m(j), i), this, 0), null, this)), ((w9a) ((kke) je7Var2.getValue())).a()), this.a);
        od2.L(od2.F(new zn5(m32VarN, new pjb(this, null), 5), ((w9a) ((kke) je7Var2.getValue())).a()), this.a);
    }

    public static final Object q(zjb zjbVar, ljb ljbVar, Continuation continuation) {
        zjbVar.getClass();
        kl7 kl7VarL = j1e.l();
        kl7VarL.add(new s0d(new eqe(vea.E1), null, 0, 14));
        int i = sea.n0;
        kl7VarL.add(new x6(i, new vfd(i, 0, new eqe(vea.C1), null, null, new Integer(woc.r0), new ffd(ljbVar.a, true), null, null, 0, null, 1944), 536871936));
        int i2 = sea.l0;
        eqe eqeVar = new eqe(vea.A1);
        Integer num = new Integer(woc.b);
        boolean z = ljbVar.b;
        kl7VarL.add(new x6(i2, new vfd(i2, 0, eqeVar, null, null, num, new ffd(z, true), null, null, 0, null, 1944), 1073742848));
        int i3 = sea.o0;
        kl7VarL.add(new x6(i3, new vfd(i3, 0, new eqe(vea.D1), null, null, new Integer(woc.E1), new ffd(ljbVar.c, true), null, null, 0, null, 1944), 1073742848));
        je7 je7Var = zjbVar.s0;
        if (((se5) ((qe5) je7Var.getValue())).r()) {
            se5 se5Var = (se5) ((qe5) je7Var.getValue());
            se5Var.getClass();
            if (se5Var.n(PmsKey.gcmpe, false)) {
                int i4 = sea.m0;
                kl7VarL.add(new x6(i4, new vfd(i4, 0, new eqe(vea.B1), null, null, new Integer(woc.B1), new ffd(ljbVar.d, true), null, null, 0, null, 1944), 1073742848));
            }
        }
        if (((se5) ((qe5) je7Var.getValue())).p()) {
            int i5 = sea.p0;
            kl7VarL.add(new x6(i5, new vfd(i5, 0, new eqe(vea.F1), null, null, new Integer(woc.f1), new ffd(ljbVar.e, z), null, null, 0, null, 1944), 1073742848));
        }
        Object obj = kl7VarL.get(y53.L(kl7VarL));
        x6 x6Var = obj instanceof x6 ? (x6) obj : null;
        if (x6Var != null) {
            kl7VarL.set(y53.L(kl7VarL), new x6(x6Var.a, x6Var.b, -2147482624));
        }
        Object objA = zjbVar.v0.a(j1e.d(kl7VarL), continuation);
        return objA == tx3.a ? objA : e5f.a;
    }

    public static final ljb r(zjb zjbVar, e52 e52Var) {
        zjbVar.getClass();
        z82 z82Var = e52Var.b.H;
        return new ljb(!z82Var.b, !z82Var.d, z82Var.e, !z82Var.f, z82Var.i);
    }

    public final void s(HashMap map) {
        vxd vxdVarS = j47.S(this.a, ((w9a) ((kke) this.o.getValue())).b(), vx3.b, new yjb(this, map, null));
        this.u0.o1(this, B0[0], vxdVarS);
    }
}
