package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ndd extends pnf {
    public static final /* synthetic */ bc7[] A0 = {new oi9(ndd.class, "loadVideoJob", "getLoadVideoJob()Lkotlinx/coroutines/Job;"), rh4.g(nec.a, ndd.class, "loadAudioJob", "getLoadAudioJob()Lkotlinx/coroutines/Job;"), new oi9(ndd.class, "loadGifJob", "getLoadGifJob()Lkotlinx/coroutines/Job;"), new oi9(ndd.class, "loadPhotoJob", "getLoadPhotoJob()Lkotlinx/coroutines/Job;"), new oi9(ndd.class, "loadQualityVideoJob", "getLoadQualityVideoJob()Lkotlinx/coroutines/Job;"), new oi9(ndd.class, "loadRoamingJob", "getLoadRoamingJob()Lkotlinx/coroutines/Job;"), new oi9(ndd.class, "loadGifEnablingJob", "getLoadGifEnablingJob()Lkotlinx/coroutines/Job;"), new oi9(ndd.class, "loadAnimojiEnablingJob", "getLoadAnimojiEnablingJob()Lkotlinx/coroutines/Job;")};
    public final q0e X;
    public final w7c Y;
    public final w4d Z;
    public final je7 b;
    public final je7 c;
    public final je7 o;
    public final w4d s0;
    public final w4d t0;
    public final w4d u0;
    public final w4d v0;
    public final w4d w0;
    public final w4d x0;
    public final w4d y0;
    public final s35 z0;

    public ndd(je7 je7Var, je7 je7Var2, je7 je7Var3) {
        this.b = je7Var;
        this.c = je7Var2;
        this.o = je7Var3;
        q0e q0eVarA = r0e.a(nz4.a);
        this.X = q0eVarA;
        this.Y = new w7c(q0eVarA);
        this.Z = mqd.D();
        this.s0 = mqd.D();
        this.t0 = mqd.D();
        this.u0 = mqd.D();
        this.v0 = mqd.D();
        this.w0 = mqd.D();
        this.x0 = mqd.D();
        this.y0 = mqd.D();
        this.z0 = new s35(0);
        pnf.n(this, null, null, new ddd(this, null), 3);
    }

    public static final Object q(ndd nddVar, Continuation continuation) throws Throwable {
        Object objT0 = j47.t0(((w9a) ((kke) nddVar.b.getValue())).b(), new edd(nddVar, null), continuation);
        return objT0 == tx3.a ? objT0 : e5f.a;
    }

    public static jqe t(int i, boolean z) {
        eqe eqeVar;
        if (i == -1) {
            eqeVar = z ? new eqe(gha.b) : new eqe(gha.c);
        } else if (i == 0) {
            eqeVar = new eqe(gha.a);
        } else {
            if (i != 1) {
                return new iqe("");
            }
            eqeVar = new eqe(gha.g);
        }
        return eqeVar;
    }

    public final kxc r() {
        return (kxc) this.c.getValue();
    }

    public final void s(int i) {
        int i2 = fha.m;
        bc7[] bc7VarArr = A0;
        if (i == i2) {
            this.x0.o1(this, bc7VarArr[6], pnf.n(this, null, null, new gdd(this, !((jp) r()).g.getBoolean("app.media.autoplay.gif", true), null), 3));
            return;
        }
        if (i == fha.j) {
            this.y0.o1(this, bc7VarArr[7], pnf.n(this, null, null, new fdd(this, !((rj) this.o.getValue()).a(), null), 3));
            return;
        }
        if (i == fha.n) {
            this.w0.o1(this, bc7VarArr[5], pnf.n(this, null, null, new kdd(this, !r().n(), null), 3));
            return;
        }
        int i3 = fha.o;
        s35 s35Var = this.z0;
        if (i == i3) {
            pnf.o(s35Var, sgd.e);
            return;
        }
        if (i == fha.s) {
            w(0);
            return;
        }
        if (i == fha.u) {
            w(1);
            return;
        }
        if (i == fha.t) {
            w(-1);
            return;
        }
        if (i == fha.l) {
            pnf.o(s35Var, sgd.f);
            return;
        }
        if (i == fha.g) {
            v(0);
            return;
        }
        if (i == fha.i) {
            v(1);
            return;
        }
        if (i == fha.h) {
            v(-1);
            return;
        }
        if (i == fha.k) {
            pnf.o(s35Var, sgd.g);
            return;
        }
        if (i == fha.a) {
            u(0);
            return;
        }
        if (i == fha.c) {
            u(1);
            return;
        }
        if (i == fha.b) {
            u(-1);
            return;
        }
        if (i == fha.p) {
            pnf.o(s35Var, sgd.h);
            return;
        }
        if (i == fha.d) {
            x(0);
            return;
        }
        if (i == fha.f) {
            x(1);
            return;
        }
        if (i == fha.e) {
            x(-1);
            return;
        }
        if (i == fha.r) {
            pnf.o(s35Var, sgd.i);
            return;
        }
        if (i == fha.v) {
            y(xdf.b);
            return;
        }
        if (i == fha.x) {
            y(xdf.c);
        } else if (i == fha.w) {
            y(xdf.o);
        } else if (i == fha.q) {
            pnf.o(s35Var, qgd.b);
        }
    }

    public final void u(int i) {
        vxd vxdVarN = pnf.n(this, null, null, new hdd(this, i, null), 3);
        this.s0.o1(this, A0[1], vxdVarN);
    }

    public final void v(int i) {
        vxd vxdVarN = pnf.n(this, null, null, new idd(this, i, null), 3);
        this.t0.o1(this, A0[2], vxdVarN);
    }

    public final void w(int i) {
        vxd vxdVarN = pnf.n(this, null, null, new jdd(this, i, null), 3);
        this.u0.o1(this, A0[3], vxdVarN);
    }

    public final void x(int i) {
        vxd vxdVarN = pnf.n(this, null, null, new ldd(this, i, null), 3);
        this.Z.o1(this, A0[0], vxdVarN);
    }

    public final void y(xdf xdfVar) {
        vxd vxdVarN = pnf.n(this, null, null, new mdd(this, xdfVar, null), 3);
        this.v0.o1(this, A0[4], vxdVarN);
    }
}
