package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class feb extends pnf {
    public static final /* synthetic */ bc7[] G0 = {new oi9(feb.class, "goToProfileJob", "getGoToProfileJob()Lkotlinx/coroutines/Job;"), rh4.g(nec.a, feb.class, "disableActionClickJob", "getDisableActionClickJob()Lkotlinx/coroutines/Job;")};
    public final boolean A0;
    public final s35 B0;
    public final s35 C0;
    public final w4d D0;
    public final w4d E0;
    public final w7c F0;
    public final boolean X;
    public final iy2 Y;
    public final ds3 Z;
    public final long b;
    public final long c;
    public final rdb o;
    public final je7 s0;
    public final je7 t0;
    public final je7 u0;
    public final je7 v0;
    public final je7 w0;
    public final je7 x0;
    public final q0e y0;
    public final q0e z0;

    public feb(long j, long j2, rdb rdbVar, boolean z, iy2 iy2Var, ds3 ds3Var, je7 je7Var, je7 je7Var2, je7 je7Var3, je7 je7Var4, je7 je7Var5, je7 je7Var6) {
        this.b = j;
        this.c = j2;
        this.o = rdbVar;
        this.X = z;
        this.Y = iy2Var;
        this.Z = ds3Var;
        this.s0 = je7Var;
        this.t0 = je7Var3;
        this.u0 = je7Var2;
        this.v0 = je7Var4;
        this.w0 = je7Var5;
        this.x0 = je7Var6;
        Continuation continuation = null;
        q0e q0eVarA = r0e.a(null);
        this.y0 = q0eVarA;
        this.z0 = r0e.a(null);
        this.A0 = rdbVar == rdb.c;
        this.B0 = new s35(0);
        this.C0 = new s35(0);
        this.D0 = mqd.D();
        this.E0 = mqd.D();
        if (z) {
            od2.L(od2.F(new zn5(new jp5(new mqc(new ceb(new j31(new t03(((jz2) iy2Var).m(j), 11), new t03(ds3Var.c(j2), 11), sdb.s0, 4), null, this)), 0), new tdb(this, null), 5), ((w9a) u()).a()), this.a);
        } else {
            od2.L(od2.F(new zn5(new mqc(new eeb(new j31(new t03(((jz2) iy2Var).m(j), 11), new t03(ds3Var.c(j2), 11), new c3(this, continuation, 25), 4), null, this)), new udb(this, null), 5), ((w9a) u()).a()), this.a);
        }
        this.F0 = od2.X(od2.F(od2.x(new ap8(new t03(q0eVarA, 11), this, 7)), ((w9a) u()).a()), this.a, wld.a, new vdb());
    }

    /* JADX WARN: Removed duplicated region for block: B:98:0x0276  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.pdb q(defpackage.feb r31, defpackage.e52 r32, defpackage.uj3 r33, boolean r34) {
        /*
            Method dump skipped, instructions count: 650
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.feb.q(feb, e52, uj3, boolean):pdb");
    }

    public final void r() {
        e52 e52Var;
        int iN;
        q0e q0eVar = this.y0;
        pdb pdbVar = (pdb) q0eVar.getValue();
        boolean z = this.X;
        if (pdbVar != null && !pdbVar.a && !pdbVar.b && !pdbVar.c && !pdbVar.d && !pdbVar.e && !pdbVar.f && !z) {
            pnf.o(this.C0, new kdb(new eqe(vea.M0), null));
            return;
        }
        if (tpa.f(this.z0.getValue(), q0eVar.getValue())) {
            if (!z) {
                return;
            }
            if (this.o != rdb.c) {
                return;
            }
        }
        pdb pdbVar2 = (pdb) q0eVar.getValue();
        if (pdbVar2 == null || (e52Var = (e52) ((jz2) this.Y).m(this.b).a.getValue()) == null) {
            return;
        }
        long j = e52Var.b.a;
        if (z) {
            e52 e52VarS = s();
            boolean zI = e52VarS != null ? e52VarS.I() : false;
            odb odbVar = pdbVar2.i;
            iN = oag.n(zI ? false : odbVar.a, pdbVar2.l.a, pdbVar2.m.a, pdbVar2.k.a, pdbVar2.j.a, !zI, pdbVar2.f, zI ? pdbVar2.g.a : false, zI ? pdbVar2.h.a : false, zI ? odbVar.a : false);
        } else {
            iN = oag.n(pdbVar2.b, pdbVar2.e, pdbVar2.a, pdbVar2.d, pdbVar2.c, true, pdbVar2.f, false, false, false);
        }
        j47.T(this.a, ((w9a) u()).b(), null, new wdb(this, j, iN, null), 2);
    }

    public final e52 s() {
        return (e52) ((jz2) this.Y).m(this.b).a.getValue();
    }

    public final uj3 t() {
        return (uj3) this.Z.c(this.c).a.getValue();
    }

    public final kke u() {
        return (kke) this.t0.getValue();
    }

    public final void v(long j, boolean z) {
        pdb pdbVar;
        odb odbVar;
        String strQ;
        gqe gqeVar;
        long j2 = sea.D;
        boolean z2 = false;
        s35 s35Var = this.C0;
        if (j == j2) {
            e52 e52VarS = s();
            eqe eqeVar = (e52VarS == null || !e52VarS.I()) ? new eqe(vea.T0) : new eqe(vea.T0);
            e52 e52VarS2 = s();
            if (e52VarS2 == null || !e52VarS2.I()) {
                int i = vea.R0;
                e52 e52VarS3 = s();
                strQ = e52VarS3 != null ? e52VarS3.q() : null;
                gqeVar = new gqe(i, ys.m0(new Object[]{strQ != null ? strQ : ""}));
            } else {
                int i2 = vea.q1;
                uj3 uj3VarT = t();
                String strD = uj3VarT != null ? uj3VarT.d() : null;
                if (strD == null) {
                    strD = "";
                }
                e52 e52VarS4 = s();
                strQ = e52VarS4 != null ? e52VarS4.q() : null;
                gqeVar = new gqe(i2, ys.m0(new Object[]{strD, strQ != null ? strQ : ""}));
            }
            pnf.o(s35Var, new jdb(eqeVar, gqeVar, y53.M(new mg3(sea.H, new eqe(vea.Q0), 4, false), new mg3(sea.G, new eqe(vea.P0), 2, false))));
            return;
        }
        if (j != sea.M) {
            if (z) {
                w();
                return;
            }
            return;
        }
        boolean z3 = this.X;
        q0e q0eVar = this.y0;
        if (z3 && (pdbVar = (pdb) q0eVar.getValue()) != null && (odbVar = pdbVar.l) != null && odbVar.a) {
            z2 = true;
        }
        pdb pdbVar2 = (pdb) q0eVar.getValue();
        if (pdbVar2 == null || pdbVar2.e || z2) {
            return;
        }
        pnf.o(s35Var, new kdb(new eqe(vea.O0), null));
    }

    public final void w() {
        if (this.X) {
            vxd vxdVarS = j47.S(this.a, ((w9a) u()).a(), vx3.b, new ydb(this, null));
            this.E0.o1(this, G0[1], vxdVarS);
        }
    }

    public final void x() {
        if (tpa.f(this.z0.getValue(), this.y0.getValue())) {
            pnf.o(this.B0, g43.b);
        } else {
            pnf.o(this.C0, new jdb(new eqe(vea.U), null, y53.M(new mg3(sea.d0, new eqe(vea.V), 3, false), new mg3(sea.c0, new eqe(vea.T), 2, false))));
        }
    }
}
