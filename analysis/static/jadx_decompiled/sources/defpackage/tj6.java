package defpackage;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class tj6 extends r5g {
    @Override // defpackage.oh4
    public final void a(oh4 oh4Var) {
        nh0 nh0Var = (nh0) this.b;
        int i = nh0Var.s0;
        sh4 sh4Var = this.h;
        Iterator it = sh4Var.l.iterator();
        int i2 = 0;
        int i3 = -1;
        while (it.hasNext()) {
            int i4 = ((sh4) it.next()).g;
            if (i3 == -1 || i4 < i3) {
                i3 = i4;
            }
            if (i2 < i4) {
                i2 = i4;
            }
        }
        if (i == 0 || i == 2) {
            sh4Var.d(i3 + nh0Var.u0);
        } else {
            sh4Var.d(i2 + nh0Var.u0);
        }
    }

    @Override // defpackage.r5g
    public final void d() {
        hj3 hj3Var = this.b;
        if (hj3Var instanceof nh0) {
            sh4 sh4Var = this.h;
            sh4Var.b = true;
            nh0 nh0Var = (nh0) hj3Var;
            int i = nh0Var.s0;
            boolean z = nh0Var.t0;
            int i2 = 0;
            if (i == 0) {
                sh4Var.e = 4;
                while (i2 < nh0Var.r0) {
                    hj3 hj3Var2 = nh0Var.q0[i2];
                    if (z || hj3Var2.g0 != 8) {
                        sh4 sh4Var2 = hj3Var2.d.h;
                        sh4Var2.k.add(sh4Var);
                        sh4Var.l.add(sh4Var2);
                    }
                    i2++;
                }
                m(this.b.d.h);
                m(this.b.d.i);
                return;
            }
            if (i == 1) {
                sh4Var.e = 5;
                while (i2 < nh0Var.r0) {
                    hj3 hj3Var3 = nh0Var.q0[i2];
                    if (z || hj3Var3.g0 != 8) {
                        sh4 sh4Var3 = hj3Var3.d.i;
                        sh4Var3.k.add(sh4Var);
                        sh4Var.l.add(sh4Var3);
                    }
                    i2++;
                }
                m(this.b.d.h);
                m(this.b.d.i);
                return;
            }
            if (i == 2) {
                sh4Var.e = 6;
                while (i2 < nh0Var.r0) {
                    hj3 hj3Var4 = nh0Var.q0[i2];
                    if (z || hj3Var4.g0 != 8) {
                        sh4 sh4Var4 = hj3Var4.e.h;
                        sh4Var4.k.add(sh4Var);
                        sh4Var.l.add(sh4Var4);
                    }
                    i2++;
                }
                m(this.b.e.h);
                m(this.b.e.i);
                return;
            }
            if (i != 3) {
                return;
            }
            sh4Var.e = 7;
            while (i2 < nh0Var.r0) {
                hj3 hj3Var5 = nh0Var.q0[i2];
                if (z || hj3Var5.g0 != 8) {
                    sh4 sh4Var5 = hj3Var5.e.i;
                    sh4Var5.k.add(sh4Var);
                    sh4Var.l.add(sh4Var5);
                }
                i2++;
            }
            m(this.b.e.h);
            m(this.b.e.i);
        }
    }

    @Override // defpackage.r5g
    public final void e() {
        hj3 hj3Var = this.b;
        if (hj3Var instanceof nh0) {
            int i = ((nh0) hj3Var).s0;
            sh4 sh4Var = this.h;
            if (i == 0 || i == 1) {
                hj3Var.Y = sh4Var.g;
            } else {
                hj3Var.Z = sh4Var.g;
            }
        }
    }

    @Override // defpackage.r5g
    public final void f() {
        this.c = null;
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
