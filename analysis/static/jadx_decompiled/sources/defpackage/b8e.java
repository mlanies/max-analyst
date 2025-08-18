package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
public final class b8e extends pnf {
    public static final /* synthetic */ bc7[] B0 = {new oi9(b8e.class, "selectedFindJob", "getSelectedFindJob()Lkotlinx/coroutines/Job;"), rh4.g(nec.a, b8e.class, "addSetInFavoriteJob", "getAddSetInFavoriteJob()Lkotlinx/coroutines/Job;"), new oi9(b8e.class, "clearRecentJob", "getClearRecentJob()Lkotlinx/coroutines/Job;")};
    public final w4d A0;
    public final je7 X;
    public final je7 Y;
    public final je7 Z;
    public final kke b;
    public final je7 c;
    public final je7 o;
    public final je7 s0;
    public final q0e t0;
    public final w7c u0;
    public final AtomicLong v0;
    public final q0e w0;
    public final w7c x0;
    public final w4d y0;
    public final w4d z0;

    public b8e(kke kkeVar, je7 je7Var, je7 je7Var2, je7 je7Var3, je7 je7Var4, khe kheVar, je7 je7Var5) {
        this.b = kkeVar;
        this.c = je7Var;
        this.o = je7Var2;
        this.X = je7Var3;
        this.Y = je7Var4;
        this.Z = kheVar;
        this.s0 = je7Var5;
        nz4 nz4Var = nz4.a;
        q0e q0eVarA = r0e.a(new l7e(nz4Var, nz4Var));
        this.t0 = q0eVarA;
        this.u0 = new w7c(q0eVarA);
        this.v0 = new AtomicLong();
        q0e q0eVarA2 = r0e.a(new k7e(0L, 0, 0, 7));
        this.w0 = q0eVarA2;
        this.x0 = new w7c(q0eVarA2);
        this.y0 = mqd.D();
        this.z0 = mqd.D();
        this.A0 = mqd.D();
    }

    public static void q(kl7 kl7Var, w3e w3eVar, ArrayList arrayList) {
        e02 e02Var = new e02(w3eVar.a, w3eVar);
        arrayList.add(e02Var);
        kl7Var.add(e02Var);
        kl7Var.addAll(w3eVar.X);
    }

    public final w3e r(m3e m3eVar, int i) {
        long j = m3eVar.a;
        String str = m3eVar.b;
        if (str == null) {
            str = "";
        }
        return new w3e(j, new iqe(str), m3eVar.c, null, s(j, m3eVar.h), i, false, false, 200);
    }

    public final List s(long j, List list) {
        return l6d.i0(new r1f(l6d.Z(new at(2, list), new w8c(10)), new hmb(j, this, j == -9223372036854775807L || j == -9223372036854775806L || j == -9223372036854775805L)));
    }

    public final void t(long j, m56 m56Var) {
        vxd vxdVarS = j47.S(this.a, ((w9a) this.b).b(), vx3.b, new z7e(m56Var, j, this, null));
        this.y0.o1(this, B0[0], vxdVarS);
    }
}
