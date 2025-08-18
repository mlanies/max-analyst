package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class bh0 extends pnf {
    public static final /* synthetic */ bc7[] u0;
    public static final long v0;
    public final je7 X;
    public final q0e Y;
    public final q0e Z;
    public final kke b;
    public final jh0 c;
    public final k56 o;
    public final w7c s0;
    public final w4d t0;

    static {
        oi9 oi9Var = new oi9(bh0.class, "bannerJob", "getBannerJob()Lkotlinx/coroutines/Job;");
        nec.a.getClass();
        u0 = new bc7[]{oi9Var};
        v0 = new yxc(7).hashCode();
    }

    public bh0(je7 je7Var, boolean z, po3 po3Var, int i) {
        int i2 = 5;
        int i3 = 4;
        int i4 = 1;
        dh0 dh0Var = dh0.a;
        ug0 ug0Var = (ug0) dh0Var.getAccessor().c(ug0.class);
        kke kkeVar = (kke) dh0Var.getAccessor().c(kke.class);
        jh0 jh0Var = (jh0) dh0Var.getAccessor().c(jh0.class);
        z = (i & 16) != 0 ? false : z;
        k56 mVar = (i & 32) != 0 ? new m(20) : po3Var;
        this.b = kkeVar;
        this.c = jh0Var;
        this.o = mVar;
        this.X = je7Var;
        q0e q0eVarA = r0e.a(Boolean.valueOf(z));
        this.Y = q0eVarA;
        w7c w7cVar = new w7c(q0eVarA);
        boolean z2 = (jh0Var.e || jh0Var.g || jh0Var.f) ? false : true;
        nz4 nz4Var = nz4.a;
        q0e q0eVarA2 = r0e.a(z2 ? nz4Var : q(z));
        this.Z = q0eVarA2;
        this.s0 = od2.X(new qw(q0eVarA2, 6), this.a, wld.a, nz4Var);
        this.t0 = mqd.D();
        od2.L(new zn5(new j31(new cp5(new zn5(od2.E(new qn5(2, new mn5[]{new v7c(ug0Var.b), new qw(ug0Var.d, i3), new qw(ug0Var.e, i2)})), new tg0(ug0Var, null)), new br(ug0Var, (Continuation) null, i4)), w7cVar, new xg0(3, null), 4), new zg0(this, je7Var, null), 5), this.a);
    }

    public final List q(boolean z) {
        kl7 kl7VarL = j1e.l();
        jh0 jh0Var = this.c;
        kl7VarL.add(jh0Var.e ? new yq3(((Boolean) this.o.invoke()).booleanValue() ? 1 : z ? 2 : 3) : null);
        kl7VarL.add(jh0Var.g ? new yq3(z ? 5 : 4) : null);
        kl7VarL.add(jh0Var.f ? new yq3(z ? 7 : 6) : null);
        List listE0 = x53.e0(j1e.d(kl7VarL));
        boolean z2 = !((ArrayList) listE0).isEmpty();
        je7 je7Var = this.X;
        if (z2) {
            m56 m56VarB = ((vg0) je7Var.getValue()).b();
            ArrayList arrayList = new ArrayList();
            for (Object obj : listE0) {
                if (((Boolean) m56VarB.invoke(obj)).booleanValue()) {
                    arrayList.add(obj);
                }
            }
            listE0 = arrayList;
        }
        return listE0.isEmpty() ^ true ? x53.x0(listE0, ((vg0) je7Var.getValue()).a()) : listE0;
    }
}
