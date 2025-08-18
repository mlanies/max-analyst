package defpackage;

/* loaded from: classes.dex */
public final class o13 implements frc {
    public final /* synthetic */ s13 X;
    public final s13 a;
    public final drc b;
    public final int c;
    public boolean o;

    public o13(s13 s13Var, s13 s13Var2, drc drcVar, int i) {
        this.X = s13Var;
        this.a = s13Var2;
        this.b = drcVar;
        this.c = i;
    }

    public final void a() {
        if (this.o) {
            return;
        }
        s13 s13Var = this.X;
        gk8 gk8Var = s13Var.Z;
        int[] iArr = s13Var.b;
        int i = this.c;
        gk8Var.b(iArr[i], s13Var.c[i], 0, null, s13Var.E0);
        this.o = true;
    }

    @Override // defpackage.frc
    public final void c() {
    }

    @Override // defpackage.frc
    public final boolean d() {
        s13 s13Var = this.X;
        return !s13Var.m() && this.b.t(s13Var.H0);
    }

    @Override // defpackage.frc
    public final int e(long j) {
        s13 s13Var = this.X;
        if (s13Var.m()) {
            return 0;
        }
        boolean z = s13Var.H0;
        drc drcVar = this.b;
        int iQ = drcVar.q(j, z);
        yi0 yi0Var = s13Var.G0;
        if (yi0Var != null) {
            iQ = Math.min(iQ, yi0Var.d(this.c + 1) - drcVar.o());
        }
        drcVar.B(iQ);
        if (iQ > 0) {
            a();
        }
        return iQ;
    }

    @Override // defpackage.frc
    public final int g(imc imcVar, o54 o54Var, int i) {
        s13 s13Var = this.X;
        if (s13Var.m()) {
            return -3;
        }
        yi0 yi0Var = s13Var.G0;
        drc drcVar = this.b;
        if (yi0Var != null && yi0Var.d(this.c + 1) <= drcVar.o()) {
            return -3;
        }
        a();
        return drcVar.y(imcVar, o54Var, i, s13Var.H0);
    }
}
