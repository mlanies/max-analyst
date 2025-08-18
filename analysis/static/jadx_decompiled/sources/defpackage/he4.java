package defpackage;

import android.text.TextUtils;

/* loaded from: classes.dex */
public final class he4 extends we4 implements Comparable {
    public final boolean A0;
    public final int B0;
    public final int C0;
    public final int D0;
    public final int E0;
    public final boolean F0;
    public final boolean G0;
    public final int X;
    public final boolean Y;
    public final String Z;
    public final ne4 s0;
    public final boolean t0;
    public final int u0;
    public final int v0;
    public final int w0;
    public final boolean x0;
    public final int y0;
    public final int z0;

    public he4(int i, qze qzeVar, int i2, ne4 ne4Var, int i3, boolean z) {
        int i4;
        int iC;
        int iC2;
        boolean z2;
        super(i, qzeVar, i2);
        this.s0 = ne4Var;
        this.Z = bf4.f(this.o.c);
        int i5 = 0;
        this.t0 = bf4.d(i3, false);
        int i6 = 0;
        while (true) {
            i4 = Integer.MAX_VALUE;
            if (i6 >= ne4Var.y0.size()) {
                iC = 0;
                i6 = Integer.MAX_VALUE;
                break;
            } else {
                iC = bf4.c(this.o, (String) ne4Var.y0.get(i6), false);
                if (iC > 0) {
                    break;
                } else {
                    i6++;
                }
            }
        }
        this.v0 = i6;
        this.u0 = iC;
        this.w0 = bf4.a(this.o.X, ne4Var.z0);
        oy5 oy5Var = this.o;
        int i7 = oy5Var.X;
        this.x0 = i7 == 0 || (i7 & 1) != 0;
        this.A0 = (oy5Var.o & 1) != 0;
        int i8 = oy5Var.J0;
        this.B0 = i8;
        this.C0 = oy5Var.K0;
        int i9 = oy5Var.s0;
        this.D0 = i9;
        this.Y = (i9 == -1 || i9 <= ne4Var.B0) && (i8 == -1 || i8 <= ne4Var.A0);
        String[] strArrY = maf.y();
        int i10 = 0;
        while (true) {
            if (i10 >= strArrY.length) {
                iC2 = 0;
                i10 = Integer.MAX_VALUE;
                break;
            } else {
                iC2 = bf4.c(this.o, strArrY[i10], false);
                if (iC2 > 0) {
                    break;
                } else {
                    i10++;
                }
            }
        }
        this.y0 = i10;
        this.z0 = iC2;
        int i11 = 0;
        while (true) {
            zw6 zw6Var = ne4Var.C0;
            if (i11 < zw6Var.size()) {
                String str = this.o.w0;
                if (str != null && str.equals(zw6Var.get(i11))) {
                    i4 = i11;
                    break;
                }
                i11++;
            } else {
                break;
            }
        }
        this.E0 = i4;
        this.F0 = uj0.f(i3) == 128;
        this.G0 = uj0.g(i3) == 64;
        ne4 ne4Var2 = this.s0;
        if (bf4.d(i3, ne4Var2.U0) && ((z2 = this.Y) || ne4Var2.P0)) {
            i5 = (!bf4.d(i3, false) || !z2 || this.o.s0 == -1 || ne4Var2.H0 || ne4Var2.G0 || (!ne4Var2.W0 && z)) ? 1 : 2;
        }
        this.X = i5;
    }

    @Override // defpackage.we4
    public final int a() {
        return this.X;
    }

    @Override // defpackage.we4
    public final boolean b(we4 we4Var) {
        int i;
        String str;
        int i2;
        he4 he4Var = (he4) we4Var;
        ne4 ne4Var = this.s0;
        boolean z = ne4Var.S0;
        oy5 oy5Var = he4Var.o;
        oy5 oy5Var2 = this.o;
        if ((z || ((i2 = oy5Var2.J0) != -1 && i2 == oy5Var.J0)) && ((ne4Var.Q0 || ((str = oy5Var2.w0) != null && TextUtils.equals(str, oy5Var.w0))) && (ne4Var.R0 || ((i = oy5Var2.K0) != -1 && i == oy5Var.K0)))) {
            if (!ne4Var.T0) {
                if (this.F0 != he4Var.F0 || this.G0 != he4Var.G0) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.lang.Comparable
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int compareTo(he4 he4Var) {
        boolean z = this.t0;
        boolean z2 = this.Y;
        zma zmaVarB = (z2 && z) ? bf4.f : bf4.f.b();
        aa3 aa3VarD = aa3.a.d(z, he4Var.t0);
        Integer numValueOf = Integer.valueOf(this.v0);
        Integer numValueOf2 = Integer.valueOf(he4Var.v0);
        sm9.a.getClass();
        dkc dkcVar = dkc.a;
        aa3 aa3VarC = aa3VarD.c(numValueOf, numValueOf2, dkcVar).a(this.u0, he4Var.u0).a(this.w0, he4Var.w0).d(this.A0, he4Var.A0).d(this.x0, he4Var.x0).c(Integer.valueOf(this.y0), Integer.valueOf(he4Var.y0), dkcVar).a(this.z0, he4Var.z0).d(z2, he4Var.Y).c(Integer.valueOf(this.E0), Integer.valueOf(he4Var.E0), dkcVar);
        int i = this.D0;
        Integer numValueOf3 = Integer.valueOf(i);
        int i2 = he4Var.D0;
        aa3 aa3VarC2 = aa3VarC.c(numValueOf3, Integer.valueOf(i2), this.s0.G0 ? bf4.f.b() : bf4.g).d(this.F0, he4Var.F0).d(this.G0, he4Var.G0).c(Integer.valueOf(this.B0), Integer.valueOf(he4Var.B0), zmaVarB).c(Integer.valueOf(this.C0), Integer.valueOf(he4Var.C0), zmaVarB);
        Integer numValueOf4 = Integer.valueOf(i);
        Integer numValueOf5 = Integer.valueOf(i2);
        if (!maf.a(this.Z, he4Var.Z)) {
            zmaVarB = bf4.g;
        }
        return aa3VarC2.c(numValueOf4, numValueOf5, zmaVarB).f();
    }
}
