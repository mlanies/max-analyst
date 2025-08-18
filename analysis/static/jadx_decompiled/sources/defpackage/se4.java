package defpackage;

import java.util.Comparator;

/* loaded from: classes.dex */
public final class se4 extends we4 implements Comparable {
    public final int X;
    public final boolean Y;
    public final boolean Z;
    public final boolean s0;
    public final int t0;
    public final int u0;
    public final int v0;
    public final int w0;
    public final boolean x0;

    public se4(int i, qze qzeVar, int i2, ne4 ne4Var, int i3, String str) {
        int iC;
        super(i, qzeVar, i2);
        int i4 = 0;
        this.Y = bf4.d(i3, false);
        int i5 = this.o.o & (~ne4Var.K0);
        this.Z = (i5 & 1) != 0;
        this.s0 = (i5 & 2) != 0;
        zw6 zw6Var = ne4Var.D0;
        zw6 zw6VarN = zw6Var.isEmpty() ? zw6.n("") : zw6Var;
        int i6 = 0;
        while (true) {
            if (i6 >= zw6VarN.size()) {
                i6 = Integer.MAX_VALUE;
                iC = 0;
                break;
            } else {
                iC = bf4.c(this.o, (String) zw6VarN.get(i6), ne4Var.F0);
                if (iC > 0) {
                    break;
                } else {
                    i6++;
                }
            }
        }
        this.t0 = i6;
        this.u0 = iC;
        int iA = bf4.a(this.o.X, ne4Var.E0);
        this.v0 = iA;
        this.x0 = (this.o.X & 1088) != 0;
        int iC2 = bf4.c(this.o, str, bf4.f(str) == null);
        this.w0 = iC2;
        boolean z = iC > 0 || (zw6Var.isEmpty() && iA > 0) || this.Z || (this.s0 && iC2 > 0);
        if (bf4.d(i3, ne4Var.U0) && z) {
            i4 = 1;
        }
        this.X = i4;
    }

    @Override // defpackage.we4
    public final int a() {
        return this.X;
    }

    @Override // defpackage.we4
    public final /* bridge */ /* synthetic */ boolean b(we4 we4Var) {
        return false;
    }

    @Override // java.lang.Comparable
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int compareTo(se4 se4Var) {
        aa3 aa3VarD = aa3.a.d(this.Y, se4Var.Y);
        Integer numValueOf = Integer.valueOf(this.t0);
        Integer numValueOf2 = Integer.valueOf(se4Var.t0);
        Comparator comparator = sm9.a;
        comparator.getClass();
        dkc dkcVar = dkc.a;
        aa3 aa3VarC = aa3VarD.c(numValueOf, numValueOf2, dkcVar);
        int i = this.u0;
        aa3 aa3VarA = aa3VarC.a(i, se4Var.u0);
        int i2 = this.v0;
        aa3 aa3VarD2 = aa3VarA.a(i2, se4Var.v0).d(this.Z, se4Var.Z);
        Boolean boolValueOf = Boolean.valueOf(this.s0);
        Boolean boolValueOf2 = Boolean.valueOf(se4Var.s0);
        if (i != 0) {
            comparator = dkcVar;
        }
        aa3 aa3VarA2 = aa3VarD2.c(boolValueOf, boolValueOf2, comparator).a(this.w0, se4Var.w0);
        if (i2 == 0) {
            aa3VarA2 = aa3VarA2.e(this.x0, se4Var.x0);
        }
        return aa3VarA2.f();
    }
}
