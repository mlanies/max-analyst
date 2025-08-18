package defpackage;

/* loaded from: classes2.dex */
public final class p0g extends pnf {
    public static final /* synthetic */ bc7[] z0 = {new oi9(p0g.class, "toggleBiometryJob", "getToggleBiometryJob()Lkotlinx/coroutines/Job;"), rh4.g(nec.a, p0g.class, "loadWebAppSectionsJob", "getLoadWebAppSectionsJob()Lkotlinx/coroutines/Job;")};
    public final String X;
    public final je7 Y;
    public final je7 Z;
    public final long b;
    public final long c;
    public final kxf o;
    public final je7 s0;
    public final q0e t0;
    public final w7c u0;
    public final s35 v0;
    public final s35 w0;
    public final w4d x0;
    public final w4d y0;

    public p0g(long j, long j2) {
        StringBuilder sbK = au1.k(j, "webapp_biom_s_key_", "_");
        sbK.append(j2);
        kxf kxfVar = new kxf(sbK.toString(), true);
        jwf jwfVar = jwf.a;
        khe kheVarD = jwfVar.getAccessor().d(mtf.class);
        khe kheVarD2 = jwfVar.getAccessor().d(uc6.class);
        khe kheVarD3 = jwfVar.getAccessor().d(kke.class);
        this.b = j;
        this.c = j2;
        this.o = kxfVar;
        this.X = p0g.class.getName();
        this.Y = kheVarD;
        this.Z = kheVarD2;
        this.s0 = kheVarD3;
        q0e q0eVarA = r0e.a(new l0g("", nz4.a));
        this.t0 = q0eVarA;
        this.u0 = new w7c(q0eVarA);
        this.v0 = new s35(0);
        this.w0 = new s35(0);
        this.x0 = mqd.D();
        this.y0 = mqd.D();
        q();
    }

    public final void q() {
        vxd vxdVarS = j47.S(this.a, ((w9a) ((kke) this.s0.getValue())).b(), vx3.b, new m0g(this, null));
        this.y0.o1(this, z0[1], vxdVarS);
    }
}
