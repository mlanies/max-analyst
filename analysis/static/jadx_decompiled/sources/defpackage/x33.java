package defpackage;

/* loaded from: classes.dex */
public final class x33 implements frc {
    public final frc a;
    public boolean b;
    public final /* synthetic */ z33 c;

    public x33(z33 z33Var, frc frcVar) {
        this.c = z33Var;
        this.a = frcVar;
    }

    @Override // defpackage.frc
    public final void c() {
        this.a.c();
    }

    @Override // defpackage.frc
    public final boolean d() {
        return !this.c.b() && this.a.d();
    }

    @Override // defpackage.frc
    public final int e(long j) {
        if (this.c.b()) {
            return -3;
        }
        return this.a.e(j);
    }

    @Override // defpackage.frc
    public final int g(imc imcVar, o54 o54Var, int i) {
        z33 z33Var = this.c;
        if (z33Var.b()) {
            return -3;
        }
        if (this.b) {
            o54Var.b = 4;
            return -4;
        }
        int iG = this.a.g(imcVar, o54Var, i);
        if (iG != -5) {
            long j = z33Var.Y;
            if (j == Long.MIN_VALUE || ((iG != -4 || o54Var.Y < j) && !(iG == -3 && z33Var.r() == Long.MIN_VALUE && !o54Var.X))) {
                return iG;
            }
            o54Var.v();
            o54Var.b = 4;
            this.b = true;
            return -4;
        }
        oy5 oy5Var = (oy5) imcVar.c;
        oy5Var.getClass();
        int i2 = oy5Var.N0;
        int i3 = oy5Var.M0;
        if (i3 != 0 || i2 != 0) {
            if (z33Var.X != 0) {
                i3 = 0;
            }
            if (z33Var.Y != Long.MIN_VALUE) {
                i2 = 0;
            }
            my5 my5VarA = oy5Var.a();
            my5VarA.A = i3;
            my5VarA.B = i2;
            imcVar.c = my5VarA.a();
        }
        return -5;
    }
}
