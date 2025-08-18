package defpackage;

/* loaded from: classes.dex */
public final class af4 extends xe4 {
    public final int A0;
    public final boolean B0;
    public final boolean C0;
    public final int D0;
    public final boolean X;
    public final oe4 Y;
    public final boolean Z;
    public final boolean s0;
    public final boolean t0;
    public final int u0;
    public final int v0;
    public final int w0;
    public final int x0;
    public final boolean y0;
    public final boolean z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:31:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public af4(int r8, defpackage.rze r9, int r10, defpackage.oe4 r11, int r12, int r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 432
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.af4.<init>(int, rze, int, oe4, int, int, boolean):void");
    }

    public static int c(af4 af4Var, af4 af4Var2) {
        aa3 aa3VarD = aa3.a.d(af4Var.s0, af4Var2.s0).a(af4Var.x0, af4Var2.x0).d(af4Var.y0, af4Var2.y0).d(af4Var.t0, af4Var2.t0).d(af4Var.X, af4Var2.X).d(af4Var.Z, af4Var2.Z);
        Integer numValueOf = Integer.valueOf(af4Var.w0);
        Integer numValueOf2 = Integer.valueOf(af4Var2.w0);
        sm9.a.getClass();
        aa3 aa3VarC = aa3VarD.c(numValueOf, numValueOf2, dkc.a);
        boolean z = af4Var2.B0;
        boolean z2 = af4Var.B0;
        aa3 aa3VarD2 = aa3VarC.d(z2, z);
        boolean z3 = af4Var2.C0;
        boolean z4 = af4Var.C0;
        aa3 aa3VarD3 = aa3VarD2.d(z4, z3);
        if (z2 && z4) {
            aa3VarD3 = aa3VarD3.a(af4Var.D0, af4Var2.D0);
        }
        return aa3VarD3.f();
    }

    @Override // defpackage.xe4
    public final int a() {
        return this.A0;
    }

    @Override // defpackage.xe4
    public final boolean b(xe4 xe4Var) {
        af4 af4Var = (af4) xe4Var;
        if (this.z0 || oaf.a(this.o.n, af4Var.o.n)) {
            if (!this.Y.l0) {
                if (this.B0 != af4Var.B0 || this.C0 != af4Var.C0) {
                }
            }
            return true;
        }
        return false;
    }
}
