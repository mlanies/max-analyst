package defpackage;

import java.util.Comparator;

/* loaded from: classes.dex */
public final class te4 extends xe4 implements Comparable {
    public final int X;
    public final boolean Y;
    public final boolean Z;
    public final boolean s0;
    public final int t0;
    public final int u0;
    public final int v0;
    public final int w0;
    public final boolean x0;

    public te4(int i, rze rzeVar, int i2, oe4 oe4Var, int i3, String str) {
        int iE;
        super(i, rzeVar, i2);
        int i4 = 0;
        this.Y = vj0.n(i3, false);
        int i5 = this.o.e & (~oe4Var.v);
        this.Z = (i5 & 1) != 0;
        this.s0 = (i5 & 2) != 0;
        zw6 zw6Var = oe4Var.t;
        zw6 zw6VarN = zw6Var.isEmpty() ? zw6.n("") : zw6Var;
        int i6 = 0;
        while (true) {
            if (i6 >= zw6VarN.size()) {
                i6 = Integer.MAX_VALUE;
                iE = 0;
                break;
            } else {
                iE = cf4.e(this.o, (String) zw6VarN.get(i6), oe4Var.w);
                if (iE > 0) {
                    break;
                } else {
                    i6++;
                }
            }
        }
        this.t0 = i6;
        this.u0 = iE;
        int iC = cf4.c(this.o.f, oe4Var.u);
        this.v0 = iC;
        this.x0 = (this.o.f & 1088) != 0;
        int iE2 = cf4.e(this.o, str, cf4.h(str) == null);
        this.w0 = iE2;
        boolean z = iE > 0 || (zw6Var.isEmpty() && iC > 0) || this.Z || (this.s0 && iE2 > 0);
        if (vj0.n(i3, oe4Var.t0) && z) {
            i4 = 1;
        }
        this.X = i4;
    }

    @Override // defpackage.xe4
    public final int a() {
        return this.X;
    }

    @Override // defpackage.xe4
    public final /* bridge */ /* synthetic */ boolean b(xe4 xe4Var) {
        return false;
    }

    @Override // java.lang.Comparable
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int compareTo(te4 te4Var) {
        aa3 aa3VarD = aa3.a.d(this.Y, te4Var.Y);
        Integer numValueOf = Integer.valueOf(this.t0);
        Integer numValueOf2 = Integer.valueOf(te4Var.t0);
        Comparator comparator = sm9.a;
        comparator.getClass();
        dkc dkcVar = dkc.a;
        aa3 aa3VarC = aa3VarD.c(numValueOf, numValueOf2, dkcVar);
        int i = this.u0;
        aa3 aa3VarA = aa3VarC.a(i, te4Var.u0);
        int i2 = this.v0;
        aa3 aa3VarD2 = aa3VarA.a(i2, te4Var.v0).d(this.Z, te4Var.Z);
        Boolean boolValueOf = Boolean.valueOf(this.s0);
        Boolean boolValueOf2 = Boolean.valueOf(te4Var.s0);
        if (i != 0) {
            comparator = dkcVar;
        }
        aa3 aa3VarA2 = aa3VarD2.c(boolValueOf, boolValueOf2, comparator).a(this.w0, te4Var.w0);
        if (i2 == 0) {
            aa3VarA2 = aa3VarA2.e(this.x0, te4Var.x0);
        }
        return aa3VarA2.f();
    }
}
