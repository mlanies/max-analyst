package defpackage;

import android.content.Context;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public final class a8e extends pnf {
    public static final /* synthetic */ bc7[] C0 = {new oi9(a8e.class, "clearJob", "getClearJob()Lkotlinx/coroutines/Job;"), rh4.g(nec.a, a8e.class, "deleteStickersJob", "getDeleteStickersJob()Lkotlinx/coroutines/Job;"), new oi9(a8e.class, "deleteSetJob", "getDeleteSetJob()Lkotlinx/coroutines/Job;")};
    public final s35 A0;
    public final khe B0;
    public final kke X;
    public final je7 Y;
    public final je7 Z;
    public final a5e b;
    public final long c;
    public final Context o;
    public final je7 s0;
    public final je7 t0;
    public final w4d u0 = mqd.D();
    public final w4d v0 = mqd.D();
    public final w4d w0 = mqd.D();
    public final q0e x0;
    public final w7c y0;
    public final w7c z0;

    public a8e(a5e a5eVar, long j, Context context, kke kkeVar, je7 je7Var, je7 je7Var2, je7 je7Var3, je7 je7Var4, je7 je7Var5, je7 je7Var6) {
        mn5 mqcVar;
        mn5 mn5VarC;
        this.b = a5eVar;
        this.c = j;
        this.o = context;
        this.X = kkeVar;
        this.Y = je7Var2;
        this.Z = je7Var3;
        this.s0 = je7Var4;
        this.t0 = je7Var6;
        q0e q0eVarA = r0e.a(nz4.a);
        this.x0 = q0eVarA;
        this.y0 = new w7c(q0eVarA);
        a5e a5eVar2 = a5e.X;
        if (a5eVar != a5eVar2 || j == -1) {
            mqcVar = new mqc(new u7e(new m7e(a5eVar == a5e.c ? new eqe(hja.q) : new eqe(hja.e), null, null, q(false)), null));
        } else {
            kq1 kq1VarC = c37.c(((a4e) je7Var5.getValue()).b(j));
            sc5 sc5Var = (sc5) je7Var4.getValue();
            sc5Var.getClass();
            c10 c10Var = new c10(j, 15);
            ml0 ml0Var = sc5Var.s0;
            ml0Var.getClass();
            mqcVar = new ap8(new j31(kq1VarC, c37.c(new e0a(ml0Var, c10Var, 1)), t7e.s0, 4), this, 13);
        }
        w9a w9aVar = (w9a) kkeVar;
        this.z0 = od2.X(od2.F(mqcVar, w9aVar.b()), this.a, wld.a, null);
        this.A0 = new s35(0);
        this.B0 = new khe(new rzd(4, this));
        if (a5eVar == a5eVar2 && j == -1) {
            String name = a8e.class.getName();
            ir6 ir6Var = hm9.m;
            if (ir6Var != null && ir6Var.c()) {
                ir6Var.d(us7.Z, name, "Try load stickers from stickerSet by invalid id: -1", null);
            }
            mn5VarC = lz4.a;
        } else {
            int iOrdinal = a5eVar.ordinal();
            if (iOrdinal == 0) {
                mn5VarC = c37.c(((o2e) je7Var.getValue()).a());
            } else if (iOrdinal == 1) {
                mn5VarC = c37.c(((md5) je7Var3.getValue()).a());
            } else {
                if (iOrdinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                mn5VarC = new ovc(c37.c(((a4e) je7Var5.getValue()).b(j)), 4);
            }
        }
        od2.L(od2.F(new zn5(mn5VarC, new shb(2, this, a8e.class, "processStickers", "processStickers(Ljava/util/List;)V", 4, 20), 5), w9aVar.b()), this.a);
    }

    public final kl7 q(boolean z) {
        kl7 kl7VarL = j1e.l();
        a5e a5eVar = a5e.X;
        a5e a5eVar2 = this.b;
        if (a5eVar2 != a5eVar) {
            kl7VarL.add(new tt3(gja.u, new eqe(hja.z), Integer.valueOf(woc.F), Integer.valueOf(wfa.Q), 4));
        } else {
            kl7VarL.add(new tt3(gja.i, new eqe(hja.f), Integer.valueOf(woc.t), Integer.valueOf(wfa.Q), 4));
            if (z) {
                kl7VarL.add(new tt3(gja.j, new eqe(hja.m), Integer.valueOf(wfa.U), Integer.valueOf(woc.w), Integer.valueOf(wfa.P)));
            }
        }
        int iOrdinal = a5eVar2.ordinal();
        Integer numValueOf = iOrdinal != 0 ? iOrdinal != 1 ? null : Integer.valueOf(gja.t) : Integer.valueOf(gja.w);
        if (numValueOf != null) {
            kl7VarL.add(new tt3(numValueOf.intValue(), new eqe(hja.D), Integer.valueOf(wfa.U), Integer.valueOf(woc.w), Integer.valueOf(wfa.P)));
        }
        return j1e.d(kl7VarL);
    }

    public final dg9 r() {
        return (dg9) this.B0.getValue();
    }

    public final String s(int i) {
        return this.o.getResources().getQuantityString(uga.a, i, Integer.valueOf(i));
    }
}
