package defpackage;

import android.text.TextUtils;

/* loaded from: classes.dex */
public final class ie4 extends xe4 implements Comparable {
    public final int A0;
    public final boolean B0;
    public final int C0;
    public final int D0;
    public final int E0;
    public final int F0;
    public final boolean G0;
    public final boolean H0;
    public final int X;
    public final boolean Y;
    public final String Z;
    public final oe4 s0;
    public final boolean t0;
    public final int u0;
    public final int v0;
    public final int w0;
    public final boolean x0;
    public final boolean y0;
    public final int z0;

    public ie4(int i, rze rzeVar, int i2, oe4 oe4Var, int i3, boolean z, ge4 ge4Var, int i4) {
        int i5;
        int iE;
        int iE2;
        boolean z2;
        super(i, rzeVar, i2);
        this.s0 = oe4Var;
        int i6 = oe4Var.r0 ? 24 : 16;
        int i7 = 1;
        int i8 = 0;
        this.x0 = oe4Var.n0 && (i4 & i6) != 0;
        this.Z = cf4.h(this.o.d);
        this.t0 = vj0.n(i3, false);
        int i9 = 0;
        while (true) {
            zw6 zw6Var = oe4Var.n;
            i5 = Integer.MAX_VALUE;
            if (i9 >= zw6Var.size()) {
                iE = 0;
                i9 = Integer.MAX_VALUE;
                break;
            } else {
                iE = cf4.e(this.o, (String) zw6Var.get(i9), false);
                if (iE > 0) {
                    break;
                } else {
                    i9++;
                }
            }
        }
        this.v0 = i9;
        this.u0 = iE;
        this.w0 = cf4.c(this.o.f, oe4Var.o);
        qy5 qy5Var = this.o;
        int i10 = qy5Var.f;
        this.y0 = i10 == 0 || (i10 & 1) != 0;
        this.B0 = (qy5Var.e & 1) != 0;
        int i11 = qy5Var.B;
        this.C0 = i11;
        this.D0 = qy5Var.C;
        int i12 = qy5Var.i;
        this.E0 = i12;
        this.Y = (i12 == -1 || i12 <= oe4Var.q) && (i11 == -1 || i11 <= oe4Var.p) && ge4Var.apply(qy5Var);
        String[] strArrF = oaf.F();
        int i13 = 0;
        while (true) {
            if (i13 >= strArrF.length) {
                iE2 = 0;
                i13 = Integer.MAX_VALUE;
                break;
            } else {
                iE2 = cf4.e(this.o, strArrF[i13], false);
                if (iE2 > 0) {
                    break;
                } else {
                    i13++;
                }
            }
        }
        this.z0 = i13;
        this.A0 = iE2;
        int i14 = 0;
        while (true) {
            zw6 zw6Var2 = oe4Var.r;
            if (i14 < zw6Var2.size()) {
                String str = this.o.n;
                if (str != null && str.equals(zw6Var2.get(i14))) {
                    i5 = i14;
                    break;
                }
                i14++;
            } else {
                break;
            }
        }
        this.F0 = i5;
        this.G0 = vj0.h(i3) == 128;
        this.H0 = vj0.i(i3) == 64;
        oe4 oe4Var2 = this.s0;
        if (vj0.n(i3, oe4Var2.t0) && ((z2 = this.Y) || oe4Var2.m0)) {
            f0f f0fVar = oe4Var2.s;
            int i15 = f0fVar.a;
            qy5 qy5Var2 = this.o;
            if (i15 != 2 || cf4.i(oe4Var2, i3, qy5Var2)) {
                if (vj0.n(i3, false) && z2 && qy5Var2.i != -1 && !oe4Var2.z && !oe4Var2.y && ((oe4Var2.v0 || !z) && f0fVar.a != 2 && (i6 & i3) != 0)) {
                    i7 = 2;
                }
                i8 = i7;
            }
        }
        this.X = i8;
    }

    @Override // defpackage.xe4
    public final int a() {
        return this.X;
    }

    @Override // defpackage.xe4
    public final boolean b(xe4 xe4Var) {
        int i;
        String str;
        int i2;
        ie4 ie4Var = (ie4) xe4Var;
        oe4 oe4Var = this.s0;
        boolean z = oe4Var.p0;
        qy5 qy5Var = ie4Var.o;
        qy5 qy5Var2 = this.o;
        if ((z || ((i2 = qy5Var2.B) != -1 && i2 == qy5Var.B)) && ((this.x0 || ((str = qy5Var2.n) != null && TextUtils.equals(str, qy5Var.n))) && (oe4Var.o0 || ((i = qy5Var2.C) != -1 && i == qy5Var.C)))) {
            if (!oe4Var.q0) {
                if (this.G0 != ie4Var.G0 || this.H0 != ie4Var.H0) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.lang.Comparable
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int compareTo(ie4 ie4Var) {
        boolean z = this.t0;
        boolean z2 = this.Y;
        zma zmaVarB = (z2 && z) ? cf4.j : cf4.j.b();
        aa3 aa3VarD = aa3.a.d(z, ie4Var.t0);
        Integer numValueOf = Integer.valueOf(this.v0);
        Integer numValueOf2 = Integer.valueOf(ie4Var.v0);
        sm9.a.getClass();
        dkc dkcVar = dkc.a;
        aa3 aa3VarC = aa3VarD.c(numValueOf, numValueOf2, dkcVar).a(this.u0, ie4Var.u0).a(this.w0, ie4Var.w0).d(this.B0, ie4Var.B0).d(this.y0, ie4Var.y0).c(Integer.valueOf(this.z0), Integer.valueOf(ie4Var.z0), dkcVar).a(this.A0, ie4Var.A0).d(z2, ie4Var.Y).c(Integer.valueOf(this.F0), Integer.valueOf(ie4Var.F0), dkcVar);
        boolean z3 = this.s0.y;
        int i = this.E0;
        int i2 = ie4Var.E0;
        if (z3) {
            aa3VarC = aa3VarC.c(Integer.valueOf(i), Integer.valueOf(i2), cf4.j.b());
        }
        aa3 aa3VarC2 = aa3VarC.d(this.G0, ie4Var.G0).d(this.H0, ie4Var.H0).c(Integer.valueOf(this.C0), Integer.valueOf(ie4Var.C0), zmaVarB).c(Integer.valueOf(this.D0), Integer.valueOf(ie4Var.D0), zmaVarB);
        if (oaf.a(this.Z, ie4Var.Z)) {
            aa3VarC2 = aa3VarC2.c(Integer.valueOf(i), Integer.valueOf(i2), zmaVarB);
        }
        return aa3VarC2.f();
    }
}
