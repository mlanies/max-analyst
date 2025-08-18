package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class q5e extends pnf {
    public static final /* synthetic */ bc7[] z0;
    public final je7 X;
    public final je7 Y;
    public final q0e Z;
    public final long b;
    public final kke c;
    public final je7 o;
    public final w7c s0;
    public final s35 t0;
    public final q0e u0;
    public final AtomicReference v0;
    public final AtomicReference w0;
    public final w4d x0;
    public vxd y0;

    static {
        oi9 oi9Var = new oi9(q5e.class, "searchJob", "getSearchJob()Lkotlinx/coroutines/Job;");
        nec.a.getClass();
        z0 = new bc7[]{oi9Var};
    }

    public q5e(long j, je7 je7Var, bod bodVar, je7 je7Var2, je7 je7Var3, kke kkeVar) {
        this.b = j;
        this.c = kkeVar;
        this.o = je7Var;
        this.X = je7Var2;
        this.Y = je7Var3;
        q0e q0eVarA = r0e.a(szc.c);
        this.Z = q0eVarA;
        this.s0 = new w7c(q0eVarA);
        this.t0 = new s35(0);
        q0e q0eVarA2 = r0e.a(null);
        this.u0 = q0eVarA2;
        this.v0 = new AtomicReference(nz4.a);
        this.w0 = new AtomicReference(new l5e((String) null, 3));
        this.x0 = mqd.D();
        od2.L(od2.F(new zn5(od2.Z(new ap8(c37.c(((o2e) bodVar.a.getValue()).l), bodVar, 10), 1), new k5e(this, null), 5), ((w9a) kkeVar).b()), this.a);
        od2.L(new zn5(od2.u(new jp5(q0eVarA2, 0), 200L), new shb(2, this, q5e.class, "searchStickersByQuery", "searchStickersByQuery(Ljava/lang/String;)V", 4, 14), 5), this.a);
    }

    public static final z2e q(q5e q5eVar, d2e d2eVar) {
        q5eVar.getClass();
        long j = d2eVar.a;
        String str = d2eVar.s0;
        if (oag.t(str)) {
            str = d2eVar.o;
        }
        String str2 = str;
        String str3 = ((se5) ((qe5) q5eVar.Y.getValue())).w() ? d2eVar.z0 : null;
        long j2 = d2eVar.v0;
        return new z2e(j, j2, j2, str2, d2eVar.w0, str3, d2eVar.b, d2eVar.c, false, false, 0L, 7744);
    }

    public final boolean r() {
        l5e l5eVar = (l5e) this.w0.get();
        String str = l5eVar.a;
        return (l5eVar.b == 0 || str == null || str.length() == 0 || !(((szc) this.s0.a.getValue()).b.isEmpty() ^ true)) ? false : true;
    }
}
