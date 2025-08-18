package defpackage;

import java.util.ArrayList;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class cid extends pnf {
    public static final /* synthetic */ bc7[] O0 = {new oi9(cid.class, "updateHowSeeOnlineJob", "getUpdateHowSeeOnlineJob()Lkotlinx/coroutines/Job;"), rh4.g(nec.a, cid.class, "updateWhoCanCallJob", "getUpdateWhoCanCallJob()Lkotlinx/coroutines/Job;"), new oi9(cid.class, "updateWhoCanAddToChatJob", "getUpdateWhoCanAddToChatJob()Lkotlinx/coroutines/Job;"), new oi9(cid.class, "searchByPhoneJob", "getSearchByPhoneJob()Lkotlinx/coroutines/Job;"), new oi9(cid.class, "updateUnsafeFilesJob", "getUpdateUnsafeFilesJob()Lkotlinx/coroutines/Job;")};
    public final w7c A0;
    public final w4d B0;
    public final w4d C0;
    public final w4d D0;
    public final w4d E0;
    public final w4d F0;
    public Long G0;
    public Long H0;
    public w9d I0;
    public final ArrayList J0;
    public long K0;
    public final kld L0;
    public final v7c M0;
    public final s35 N0;
    public final je7 X;
    public final je7 Y;
    public final je7 Z;
    public final rdd b;
    public final l7b c;
    public final kke o;
    public final je7 s0;
    public final je7 t0;
    public final je7 u0;
    public final je7 v0;
    public final je7 w0;
    public final je7 x0;
    public final je7 y0;
    public final q0e z0;

    public cid(rdd rddVar, l7b l7bVar, kke kkeVar, je7 je7Var, je7 je7Var2, je7 je7Var3, je7 je7Var4, je7 je7Var5, je7 je7Var6, ie3 ie3Var) {
        ehd ehdVar = ehd.a;
        khe kheVarD = ehdVar.getAccessor().d(q6f.class);
        khe kheVarD2 = ehdVar.getAccessor().d(i6f.class);
        khe kheVarD3 = ehdVar.getAccessor().d(t6f.class);
        khe kheVarD4 = ehdVar.getAccessor().d(mtf.class);
        this.b = rddVar;
        this.c = l7bVar;
        this.o = kkeVar;
        this.X = je7Var;
        this.Y = je7Var5;
        this.Z = je7Var6;
        this.s0 = je7Var2;
        this.t0 = je7Var3;
        this.u0 = je7Var4;
        this.v0 = kheVarD;
        this.w0 = kheVarD2;
        this.x0 = kheVarD3;
        this.y0 = kheVarD4;
        q0e q0eVarA = r0e.a(nz4.a);
        this.z0 = q0eVarA;
        this.A0 = new w7c(q0eVarA);
        this.B0 = mqd.D();
        this.C0 = mqd.D();
        this.D0 = mqd.D();
        this.E0 = mqd.D();
        this.F0 = mqd.D();
        this.J0 = new ArrayList();
        kld kldVarB = lld.b(1, Integer.MAX_VALUE, 0, 4);
        this.L0 = kldVarB;
        this.M0 = new v7c(kldVarB);
        this.N0 = new s35(0);
        if (this.G0 == null) {
            k4a k4aVar = (k4a) r();
            this.G0 = Long.valueOf(k4a.v(k4aVar, new lad(((p7b) k4aVar.y()).a.o(), 1)));
        }
        pnf.n(this, null, null, new phd(this, null), 3);
        od2.L(new zn5(new v7c(rddVar.b), new qhd(this, null), 5), this.a);
        od2.L(od2.F(new zn5(new v7c(ie3Var.a), new rhd(this, null), 5), ((w9a) kkeVar).a()), this.a);
    }

    public static final Object q(cid cidVar, Continuation continuation) throws Throwable {
        Object objT0 = j47.t0(((w9a) cidVar.o).a(), new xhd(cidVar, null), continuation);
        return objT0 == tx3.a ? objT0 : e5f.a;
    }

    public static eqe u(String str) {
        int i = shd.$EnumSwitchMapping$0[au1.s(h4f.d(str))];
        return i != 1 ? i != 2 ? new eqe(jpc.b) : new eqe(jpc.G1) : new eqe(jpc.Q);
    }

    @Override // defpackage.pnf
    public final void p() {
        rdd rddVar = this.b;
        ((av0) rddVar.a.getValue()).f(rddVar);
    }

    public final pk r() {
        return (pk) this.Y.getValue();
    }

    public final kxc s() {
        return (kxc) this.X.getValue();
    }

    public final q33 t() {
        return (q33) this.t0.getValue();
    }

    public final y7d v() {
        return (y7d) this.s0.getValue();
    }

    public final void w(wm9 wm9Var) {
        this.L0.g(wm9Var);
    }

    public final void x() {
        w(ydd.b);
    }
}
