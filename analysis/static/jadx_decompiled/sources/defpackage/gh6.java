package defpackage;

/* loaded from: classes.dex */
public final class gh6 extends r5g {
    @Override // defpackage.oh4
    public final void a(oh4 oh4Var) {
        sh4 sh4Var = this.h;
        if (sh4Var.c && !sh4Var.j) {
            sh4Var.d((int) ((((sh4) sh4Var.l.get(0)).g * ((fh6) this.b).q0) + 0.5f));
        }
    }

    @Override // defpackage.r5g
    public final void d() {
        hj3 hj3Var = this.b;
        fh6 fh6Var = (fh6) hj3Var;
        int i = fh6Var.r0;
        int i2 = fh6Var.s0;
        int i3 = fh6Var.u0;
        sh4 sh4Var = this.h;
        if (i3 == 1) {
            if (i != -1) {
                sh4Var.l.add(hj3Var.T.d.h);
                this.b.T.d.h.k.add(sh4Var);
                sh4Var.f = i;
            } else if (i2 != -1) {
                sh4Var.l.add(hj3Var.T.d.i);
                this.b.T.d.i.k.add(sh4Var);
                sh4Var.f = -i2;
            } else {
                sh4Var.b = true;
                sh4Var.l.add(hj3Var.T.d.i);
                this.b.T.d.i.k.add(sh4Var);
            }
            m(this.b.d.h);
            m(this.b.d.i);
            return;
        }
        if (i != -1) {
            sh4Var.l.add(hj3Var.T.e.h);
            this.b.T.e.h.k.add(sh4Var);
            sh4Var.f = i;
        } else if (i2 != -1) {
            sh4Var.l.add(hj3Var.T.e.i);
            this.b.T.e.i.k.add(sh4Var);
            sh4Var.f = -i2;
        } else {
            sh4Var.b = true;
            sh4Var.l.add(hj3Var.T.e.i);
            this.b.T.e.i.k.add(sh4Var);
        }
        m(this.b.e.h);
        m(this.b.e.i);
    }

    @Override // defpackage.r5g
    public final void e() {
        hj3 hj3Var = this.b;
        int i = ((fh6) hj3Var).u0;
        sh4 sh4Var = this.h;
        if (i == 1) {
            hj3Var.Y = sh4Var.g;
        } else {
            hj3Var.Z = sh4Var.g;
        }
    }

    @Override // defpackage.r5g
    public final void f() {
        this.h.c();
    }

    @Override // defpackage.r5g
    public final boolean k() {
        return false;
    }

    public final void m(sh4 sh4Var) {
        sh4 sh4Var2 = this.h;
        sh4Var2.k.add(sh4Var);
        sh4Var.l.add(sh4Var2);
    }
}
