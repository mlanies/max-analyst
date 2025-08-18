package defpackage;

/* loaded from: classes.dex */
public final class y33 implements grc {
    public final grc a;
    public boolean b;
    public final /* synthetic */ a43 c;

    public y33(a43 a43Var, grc grcVar) {
        this.c = a43Var;
        this.a = grcVar;
    }

    @Override // defpackage.grc
    public final void c() {
        this.a.c();
    }

    @Override // defpackage.grc
    public final boolean d() {
        return !this.c.b() && this.a.d();
    }

    @Override // defpackage.grc
    public final int e(long j) {
        if (this.c.b()) {
            return -3;
        }
        return this.a.e(j);
    }

    @Override // defpackage.grc
    public final int j(y7g y7gVar, p54 p54Var, int i) {
        a43 a43Var = this.c;
        if (a43Var.b()) {
            return -3;
        }
        if (this.b) {
            p54Var.b = 4;
            return -4;
        }
        long jR = a43Var.r();
        int iJ = this.a.j(y7gVar, p54Var, i);
        if (iJ != -5) {
            long j = a43Var.Y;
            if (j == Long.MIN_VALUE || ((iJ != -4 || p54Var.Z < j) && !(iJ == -3 && jR == Long.MIN_VALUE && !p54Var.Y))) {
                return iJ;
            }
            p54Var.v();
            p54Var.b = 4;
            this.b = true;
            return -4;
        }
        qy5 qy5Var = (qy5) y7gVar.c;
        qy5Var.getClass();
        int i2 = qy5Var.F;
        int i3 = qy5Var.E;
        if (i3 != 0 || i2 != 0) {
            if (a43Var.X != 0) {
                i3 = 0;
            }
            if (a43Var.Y != Long.MIN_VALUE) {
                i2 = 0;
            }
            ny5 ny5VarA = qy5Var.a();
            ny5VarA.D = i3;
            ny5VarA.E = i2;
            y7gVar.c = ny5VarA.a();
        }
        return -5;
    }
}
