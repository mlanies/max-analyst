package defpackage;

/* loaded from: classes.dex */
public final class ze4 extends we4 {
    public final boolean A0;
    public final boolean B0;
    public final int C0;
    public final boolean X;
    public final ne4 Y;
    public final boolean Z;
    public final boolean s0;
    public final int t0;
    public final int u0;
    public final int v0;
    public final int w0;
    public final boolean x0;
    public final boolean y0;
    public final int z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:31:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ze4(int r7, defpackage.qze r8, int r9, defpackage.ne4 r10, int r11, int r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ze4.<init>(int, qze, int, ne4, int, int, boolean):void");
    }

    public static int c(ze4 ze4Var, ze4 ze4Var2) {
        aa3 aa3VarD = aa3.a.d(ze4Var.s0, ze4Var2.s0).a(ze4Var.w0, ze4Var2.w0).d(ze4Var.x0, ze4Var2.x0).d(ze4Var.X, ze4Var2.X).d(ze4Var.Z, ze4Var2.Z);
        Integer numValueOf = Integer.valueOf(ze4Var.v0);
        Integer numValueOf2 = Integer.valueOf(ze4Var2.v0);
        sm9.a.getClass();
        aa3 aa3VarC = aa3VarD.c(numValueOf, numValueOf2, dkc.a);
        boolean z = ze4Var2.A0;
        boolean z2 = ze4Var.A0;
        aa3 aa3VarD2 = aa3VarC.d(z2, z);
        boolean z3 = ze4Var2.B0;
        boolean z4 = ze4Var.B0;
        aa3 aa3VarD3 = aa3VarD2.d(z4, z3);
        if (z2 && z4) {
            aa3VarD3 = aa3VarD3.a(ze4Var.C0, ze4Var2.C0);
        }
        return aa3VarD3.f();
    }

    @Override // defpackage.we4
    public final int a() {
        return this.z0;
    }

    @Override // defpackage.we4
    public final boolean b(we4 we4Var) {
        ze4 ze4Var = (ze4) we4Var;
        if (this.y0 || maf.a(this.o.w0, ze4Var.o.w0)) {
            if (!this.Y.O0) {
                if (this.A0 != ze4Var.A0 || this.B0 != ze4Var.B0) {
                }
            }
            return true;
        }
        return false;
    }
}
