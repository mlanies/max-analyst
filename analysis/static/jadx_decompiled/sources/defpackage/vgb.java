package defpackage;

import android.app.Application;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public final class vgb extends pnf {
    public static final /* synthetic */ bc7[] A0;
    public final je7 X;
    public final je7 Y;
    public final je7 Z;
    public final gv4 b;
    public final je7 c;
    public final je7 o;
    public final q0e s0;
    public final w7c t0;
    public final q0e u0;
    public final w7c v0;
    public final s35 w0;
    public final s35 x0;
    public final w4d y0;
    public final AtomicReference z0;

    static {
        oi9 oi9Var = new oi9(vgb.class, "submitChangesJob", "getSubmitChangesJob()Lkotlinx/coroutines/Job;");
        nec.a.getClass();
        A0 = new bc7[]{oi9Var};
    }

    public vgb(long j, reb rebVar) {
        gv4 ka2Var;
        neb nebVar = neb.a;
        this.c = nebVar.getAccessor().d(y7d.class);
        this.o = nebVar.d();
        khe kheVar = new khe(new lab(18));
        this.X = nebVar.getAccessor().d(eua.class);
        this.Y = nebVar.getAccessor().d(kk5.class);
        this.Z = nebVar.getAccessor().d(Application.class);
        nebVar.c();
        q0e q0eVarA = r0e.a(nz4.a);
        this.s0 = q0eVarA;
        this.t0 = new w7c(q0eVarA);
        q0e q0eVarA2 = r0e.a(null);
        this.u0 = q0eVarA2;
        this.v0 = new w7c(q0eVarA2);
        this.w0 = new s35(0);
        this.x0 = new s35(0);
        this.y0 = mqd.D();
        this.z0 = new AtomicReference();
        int iOrdinal = rebVar.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            ka2Var = new ka2(j, this.a);
        } else {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            ka2Var = new jm3(j, this.a);
        }
        this.b = ka2Var;
        od2.L(od2.F(new zn5(new t03(ka2Var.f, 11), new lgb(this, null), 5), ((w9a) q()).a()), this.a);
        od2.L(od2.F(new zn5(ka2Var.d, new mgb(this, null), 5), ((w9a) q()).c()), this.a);
        od2.L(od2.F(new zn5(ka2Var.e, new ngb(this, null), 5), ((w9a) q()).c()), this.a);
        od2.L(new zn5(new v7c(((dfb) kheVar.getValue()).a), new ugb(this, null), 5), this.a);
    }

    @Override // defpackage.pnf
    public final void p() {
        this.b.b();
    }

    public final kke q() {
        return (kke) this.o.getValue();
    }

    public final void r() {
        if (!((eua) this.X.getValue()).b(eua.l)) {
            pnf.o(this.w0, hfb.b);
        } else {
            j47.T(this.a, ((w9a) q()).b(), null, new sgb(this, null), 2);
        }
    }

    public final void s() {
        this.z0.set(null);
        pnf.o(this.w0, new sfb(new eqe(vea.j), Integer.valueOf(woc.I)));
    }

    public final void t() {
        this.z0.set(null);
        pnf.o(this.w0, new sfb(new eqe(vea.p), Integer.valueOf(woc.I)));
    }

    public final void u() {
        vxd vxdVarT = j47.T(this.a, null, null, new tgb(this, null), 3);
        this.y0.o1(this, A0[0], vxdVarT);
    }
}
