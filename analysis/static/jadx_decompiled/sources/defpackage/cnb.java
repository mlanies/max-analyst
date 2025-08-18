package defpackage;

import android.content.Context;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public final class cnb extends pnf {
    public static final /* synthetic */ bc7[] S0 = {new oi9(cnb.class, "leaveChatJob", "getLeaveChatJob()Lkotlinx/coroutines/Job;"), rh4.g(nec.a, cnb.class, "attacheClickJob", "getAttacheClickJob()Lkotlinx/coroutines/Job;"), new oi9(cnb.class, "openCallJob", "getOpenCallJob()Lkotlinx/coroutines/Job;"), new oi9(cnb.class, "linkInterceptJob", "getLinkInterceptJob()Lkotlinx/coroutines/Job;")};
    public final s35 A0;
    public final w4d B0;
    public final w4d C0;
    public final w4d D0;
    public final w4d E0;
    public final je7 F0;
    public final je7 G0;
    public final je7 H0;
    public final q0e I0;
    public final w7c J0;
    public final q0e K0;
    public final w7c L0;
    public final q0e M0;
    public final w7c N0;
    public final pab O0;
    public final AtomicReference P0;
    public final Context Q0;
    public boolean R0;
    public final je7 X;
    public final je7 Y;
    public final ehb Z;
    public final hdb b;
    public final je7 c;
    public final je7 o;
    public final je7 s0;
    public final je7 t0;
    public final je7 u0;
    public final je7 v0;
    public final je7 w0;
    public final je7 x0;
    public final aab y0;
    public final s35 z0;

    public cnb(long j, hdb hdbVar, boolean z, y7g y7gVar) {
        pab cn2Var;
        this.b = hdbVar;
        String name = cnb.class.getName();
        xcb xcbVar = xcb.a;
        je7 je7VarE = xcbVar.e();
        this.c = xcbVar.c();
        this.o = xcbVar.getAccessor().d(zfc.class);
        this.X = xcbVar.getAccessor().d(s8g.class);
        this.Y = xcbVar.f();
        ehb ehbVar = (ehb) xcbVar.getAccessor().c(ehb.class);
        this.Z = ehbVar;
        this.s0 = xcbVar.getAccessor().d(eua.class);
        this.t0 = xcbVar.d();
        this.u0 = xcbVar.getAccessor().d(y7d.class);
        this.v0 = xcbVar.getAccessor().d(kk5.class);
        this.w0 = xcbVar.getAccessor().d(vj7.class);
        this.x0 = xcbVar.getAccessor().d(fl7.class);
        this.y0 = new aab((ad) xcbVar.getAccessor().c(ad.class), (q33) xcbVar.getAccessor().c(q33.class));
        this.z0 = new s35(0);
        this.A0 = new s35(0);
        this.B0 = mqd.D();
        this.C0 = mqd.D();
        this.D0 = mqd.D();
        this.E0 = mqd.D();
        this.F0 = tu0.r(3, new lab(21));
        this.G0 = tu0.r(3, new lab(22));
        this.H0 = tu0.r(3, new lab(23));
        nz4 nz4Var = nz4.a;
        q0e q0eVarA = r0e.a(nz4Var);
        this.I0 = q0eVarA;
        this.J0 = new w7c(q0eVarA);
        q0e q0eVarA2 = r0e.a(nz4Var);
        this.K0 = q0eVarA2;
        this.L0 = new w7c(q0eVarA2);
        q0e q0eVarA3 = r0e.a(null);
        this.M0 = q0eVarA3;
        this.N0 = new w7c(q0eVarA3);
        this.P0 = new AtomicReference();
        this.Q0 = (Context) xcbVar.getAccessor().c(Context.class);
        hm9.n(name, "inited by " + hdbVar + ":#" + j);
        int iOrdinal = hdbVar.ordinal();
        if (iOrdinal == 0) {
            e52 e52Var = (e52) ((jz2) t()).m(j).a.getValue();
            uj3 uj3VarL = e52Var != null ? e52Var.l() : null;
            if (e52Var == null || !e52Var.H()) {
                cn2Var = (e52Var == null || !e52Var.M() || uj3VarL == null) ? new cn2(j, this.a, y7gVar) : new cq3(uj3VarL.n(), this.a, z);
            } else {
                if (uj3VarL == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                cn2Var = new nq0(uj3VarL.n(), this.a);
            }
        } else if (iOrdinal == 1) {
            cn2Var = new i7d(j);
        } else {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            uj3 uj3Var = (uj3) ((ds3) ((khe) je7VarE).getValue()).c(j).a.getValue();
            cn2Var = (uj3Var == null || !uj3Var.t()) ? new cq3(j, this.a, z) : new nq0(j, this.a);
        }
        this.O0 = cn2Var;
        od2.L(od2.F(new zn5(new t03(cn2Var.e, 11), new jmb(this, null), 5), ((w9a) u()).a()), this.a);
        od2.L(new zn5(new v7c(ehbVar.b), new kmb(this, null), 5), this.a);
    }

    public final void A() {
        pnf.o(this.z0, new ulb(new eqe(yea.p0), new imb(this, 0)));
    }

    public final void B() {
        vlb vlbVar;
        vlb vlbVar2;
        tab tabVar = (tab) this.M0.getValue();
        CharSequence charSequence = tabVar != null ? tabVar.e : null;
        if (charSequence == null) {
            charSequence = "";
        }
        int iK = this.O0.k();
        if (iK == 0) {
            return;
        }
        gcb gcbVar = (gcb) this.G0.getValue();
        gcbVar.getClass();
        int iS = au1.s(iK);
        if (iS != 0) {
            if (iS == 1) {
                eqe eqeVar = new eqe(yea.M0);
                eqe eqeVar2 = new eqe(yea.N0);
                kl7 kl7VarL = j1e.l();
                kl7VarL.add(new mg3(wea.B, new eqe(yea.L0), 1, false));
                kl7VarL.add(gcbVar.b());
                vlbVar2 = new vlb(eqeVar, eqeVar2, j1e.d(kl7VarL), null);
            } else if (iS == 2) {
                eqe eqeVar3 = new eqe(yea.K0);
                eqe eqeVar4 = new eqe(yea.J0);
                kl7 kl7VarL2 = j1e.l();
                kl7VarL2.add(new mg3(wea.r, new eqe(yea.i0), 1, false));
                kl7VarL2.add(new mg3(wea.A, new eqe(yea.I0), 1, false));
                kl7VarL2.add(gcbVar.b());
                vlbVar2 = new vlb(eqeVar3, eqeVar4, j1e.d(kl7VarL2), null);
            } else {
                if (iS != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                vlbVar = gcbVar.c();
            }
            vlbVar = vlbVar2;
        } else {
            gqe gqeVar = new gqe(yea.O0, ys.m0(new Object[]{charSequence}));
            kl7 kl7VarL3 = j1e.l();
            kl7VarL3.add(new mg3(wea.r, new eqe(yea.i0), 1, false));
            kl7VarL3.add(new mg3(wea.B, new eqe(yea.L0), 1, false));
            kl7VarL3.add(gcbVar.b());
            vlbVar = new vlb(gqeVar, null, j1e.d(kl7VarL3), null);
        }
        pnf.o(this.z0, vlbVar);
    }

    public final void C(boolean z) {
        pnf.o(this.z0, new ulb(new eqe(z ? yea.n0 : yea.q0), new xa1(this, z, 4)));
    }

    public final void D() {
        this.P0.set(null);
        pnf.o(this.z0, new zlb(new eqe(yea.Y), Integer.valueOf(woc.I)));
    }

    @Override // defpackage.pnf
    public final void p() {
        this.O0.d();
        ehb ehbVar = this.Z;
        ehbVar.a.f(ehbVar);
        bc7[] bc7VarArr = S0;
        bc7 bc7Var = bc7VarArr[0];
        w4d w4dVar = this.B0;
        x77 x77Var = (x77) w4dVar.T0(this, bc7Var);
        if (x77Var != null) {
            x77Var.cancel(null);
        }
        w4dVar.o1(this, bc7VarArr[0], null);
        bc7 bc7Var2 = bc7VarArr[1];
        w4d w4dVar2 = this.C0;
        x77 x77Var2 = (x77) w4dVar2.T0(this, bc7Var2);
        if (x77Var2 != null) {
            x77Var2.cancel(null);
        }
        w4dVar2.o1(this, bc7VarArr[1], null);
    }

    public final void q() {
        Long lI = this.O0.i();
        if (lI != null) {
            pnf.o(this.z0, new ulb(new eqe(yea.B0), new nq2(this, lI.longValue(), 3)));
        }
    }

    public final String r() {
        String strH = this.O0.h();
        if (strH == null) {
            return "";
        }
        if (tpa.s()) {
            pnf.o(this.z0, new zlb(new eqe(yea.s1), Integer.valueOf(woc.u)));
        }
        return strH;
    }

    public final void s() {
        Long lI;
        if (this.R0 || (lI = this.O0.i()) == null) {
            return;
        }
        long jLongValue = lI.longValue();
        this.R0 = true;
        j47.S(this.a, ((w9a) u()).b().plus(xq9.a), vx3.c, new omb(this, jLongValue, null));
    }

    public final iy2 t() {
        return (iy2) this.c.getValue();
    }

    public final kke u() {
        return (kke) this.Y.getValue();
    }

    public final void v(String str) {
        vxd vxdVarS = j47.S(this.a, ((w9a) u()).b(), vx3.b, new pmb(this, str, null));
        this.E0.o1(this, S0[3], vxdVarS);
    }

    public final void w(boolean z) {
        mec mecVar = new mec();
        pab pabVar = this.O0;
        hdb hdbVarL = pabVar.l();
        if (hdbVarL == null) {
            return;
        }
        mecVar.a = hdbVarL;
        lec lecVar = new lec();
        lecVar.a = pabVar.m();
        vxd vxdVarN = pnf.n(this, null, vx3.b, new vmb(mecVar, lecVar, this, z, null), 1);
        this.D0.o1(this, S0[2], vxdVarN);
    }

    public final void x(int i, String str, lk7 lk7Var) {
        String str2;
        pab pabVar = this.O0;
        char c = 4;
        char c2 = pabVar.p() ? (char) 4 : pabVar instanceof nq0 ? (char) 2 : pabVar.r() ? (char) 1 : (char) 3;
        long jM = pabVar.m();
        aab aabVar = this.y0;
        aabVar.getClass();
        int iS = au1.s(ju0.B(str) ? 3 : ju0.C(str) ? 2 : 1);
        if (iS != 0) {
            if (iS == 1) {
                c = 3;
            } else {
                if (iS != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                c = 2;
            }
        } else if (lk7Var != lk7.X) {
            c = 1;
        }
        int i2 = 1;
        if (c != 1) {
            i2 = 2;
            if (c != 2) {
                i2 = 3;
                if (c != 3) {
                    i2 = 4;
                    if (c != 4) {
                        throw null;
                    }
                }
            }
        }
        kpa kpaVar = new kpa("element_type", Integer.valueOf(i2));
        kpa kpaVar2 = new kpa("source_id", Long.valueOf(jM));
        int i3 = 1;
        if (c2 != 1) {
            i3 = 2;
            if (c2 != 2) {
                i3 = 3;
                if (c2 != 3) {
                    i3 = 4;
                    if (c2 != 4) {
                        throw null;
                    }
                }
            }
        }
        Map mapA0 = mz7.a0(kpaVar, kpaVar2, new kpa("source_type", Integer.valueOf(i3)));
        e47 e47Var = new e47();
        e47Var.a = System.currentTimeMillis();
        e47Var.c = "CHAT_PROFILE_CLICKABLE_ELEMENT_ACTIONS";
        if (i == 1) {
            str2 = "clicked_clickable_element";
        } else if (i == 2) {
            str2 = "clicked_open_context_menu";
        } else if (i == 3) {
            str2 = "clicked_copy";
        } else {
            if (i != 4) {
                throw null;
            }
            str2 = "clicked_in_context_menu";
        }
        e47Var.o = str2;
        q33 q33Var = (q33) aabVar.b;
        e47Var.b = ((hyc) q33Var).t();
        e47Var.b(mapA0);
        e47Var.X = ((t33) q33Var).F();
        ((ad) aabVar.a).j(e47Var.c());
    }

    public final void y() {
        if (!((eua) this.s0.getValue()).b(eua.l)) {
            pnf.o(this.z0, slb.a);
        } else {
            j47.T(this.a, ((w9a) u()).b(), null, new ymb(this, null), 2);
        }
    }

    public final void z() {
        this.P0.set(null);
        pnf.o(this.z0, new zlb(new eqe(yea.Y), Integer.valueOf(woc.I)));
    }
}
