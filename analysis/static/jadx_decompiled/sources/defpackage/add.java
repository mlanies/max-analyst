package defpackage;

import android.app.Application;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class add extends pnf {
    public static final /* synthetic */ bc7[] K0 = {new oi9(add.class, "showInviteDialogJob", "getShowInviteDialogJob()Lkotlinx/coroutines/Job;"), rh4.g(nec.a, add.class, "sectionItemsJob", "getSectionItemsJob()Lkotlinx/coroutines/Job;")};
    public final s35 A0;
    public final q0e B0;
    public final w7c C0;
    public final q0e D0;
    public final w7c E0;
    public final AtomicReference F0;
    public final AtomicLong G0;
    public final w4d H0;
    public final w4d I0;
    public final ai9 J0;
    public final Application X;
    public final je7 Y;
    public final je7 Z;
    public final x6a b;
    public final mb6 c;
    public final oc6 o;
    public final je7 s0;
    public final je7 t0;
    public final je7 u0;
    public final je7 v0;
    public final je7 w0;
    public final je7 x0;
    public final fc3 y0;
    public final s35 z0;

    public add() {
        yfd yfdVar = yfd.a;
        wxc wxcVar = (wxc) yfdVar.getAccessor().c(wxc.class);
        khe kheVarD = yfdVar.getAccessor().d(m7b.class);
        khe kheVarD2 = yfdVar.getAccessor().d(lle.class);
        x6a x6aVar = (x6a) yfdVar.getAccessor().c(x6a.class);
        mb6 mb6Var = (mb6) yfdVar.getAccessor().c(mb6.class);
        oc6 oc6Var = (oc6) yfdVar.getAccessor().c(oc6.class);
        hhb hhbVar = (hhb) yfdVar.getAccessor().c(hhb.class);
        khe kheVarD3 = yfdVar.getAccessor().d(kke.class);
        khe kheVarD4 = yfdVar.getAccessor().d(eua.class);
        yfdVar.getClass();
        Application application = new Application();
        khe kheVarD5 = yfdVar.getAccessor().d(kk5.class);
        khe kheVarD6 = yfdVar.getAccessor().d(pk.class);
        blb blbVar = (blb) yfdVar.getAccessor().d(blb.class).getValue();
        khe kheVarD7 = yfdVar.getAccessor().d(iy2.class);
        khe kheVarD8 = yfdVar.getAccessor().d(l67.class);
        this.b = x6aVar;
        this.c = mb6Var;
        this.o = oc6Var;
        this.X = application;
        this.Y = kheVarD;
        this.Z = kheVarD2;
        this.s0 = kheVarD3;
        this.t0 = kheVarD4;
        this.u0 = kheVarD5;
        this.v0 = kheVarD6;
        this.w0 = kheVarD7;
        this.x0 = kheVarD8;
        this.y0 = new fc3(5);
        this.z0 = new s35(0);
        this.A0 = new s35(0);
        q0e q0eVarA = r0e.a(did.h);
        this.B0 = q0eVarA;
        this.C0 = new w7c(q0eVarA);
        q0e q0eVarA2 = r0e.a(nz4.a);
        this.D0 = q0eVarA2;
        this.E0 = new w7c(q0eVarA2);
        this.F0 = new AtomicReference();
        this.G0 = new AtomicLong();
        this.H0 = mqd.D();
        this.I0 = mqd.D();
        this.J0 = new ai9(2);
        q();
        j47.T(this.a, ((w9a) ((kke) kheVarD3.getValue())).a(), null, new ncd(wxcVar, blbVar, kheVarD, this, null), 2);
        od2.L(new zn5(new v7c(hhbVar.a), new ocd(this, null), 5), this.a);
    }

    public final void q() {
        vxd vxdVarS = j47.S(this.a, ((w9a) r()).a(), vx3.b, new scd(this, null));
        this.I0.o1(this, K0[1], vxdVarS);
    }

    public final kke r() {
        return (kke) this.s0.getValue();
    }

    public final m7b s() {
        return (m7b) this.Y.getValue();
    }

    public final Long t() {
        long j = ((did) this.C0.a.getValue()).a;
        Long lValueOf = Long.valueOf(j);
        if (j != -1) {
            return lValueOf;
        }
        return null;
    }

    public final void u() {
        if (!((eua) this.t0.getValue()).b(eua.l)) {
            pnf.o(this.z0, ugd.b);
        } else {
            j47.T(this.a, ((w9a) r()).b(), null, new zcd(this, null), 2);
        }
    }

    public final void v() {
        this.F0.set(null);
        pnf.o(this.z0, new ahd(new eqe(mha.o), Integer.valueOf(woc.I)));
    }

    public final void w() {
        this.F0.set(null);
        pnf.o(this.z0, new ahd(new eqe(mha.q), Integer.valueOf(woc.I)));
    }
}
