package defpackage;

/* loaded from: classes.dex */
public final class eo6 extends r5g {
    public static final int[] k = new int[2];

    public static void m(int[] iArr, int i, int i2, int i3, int i4, float f, int i5) {
        int i6 = i2 - i;
        int i7 = i4 - i3;
        if (i5 != -1) {
            if (i5 == 0) {
                iArr[0] = (int) ((i7 * f) + 0.5f);
                iArr[1] = i7;
                return;
            } else {
                if (i5 != 1) {
                    return;
                }
                iArr[0] = i6;
                iArr[1] = (int) ((i6 * f) + 0.5f);
                return;
            }
        }
        int i8 = (int) ((i7 * f) + 0.5f);
        int i9 = (int) ((i6 / f) + 0.5f);
        if (i8 <= i6) {
            iArr[0] = i8;
            iArr[1] = i7;
        } else if (i9 <= i7) {
            iArr[0] = i6;
            iArr[1] = i9;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x0267  */
    @Override // defpackage.oh4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(defpackage.oh4 r24) {
        /*
            Method dump skipped, instructions count: 907
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eo6.a(oh4):void");
    }

    @Override // defpackage.r5g
    public final void d() {
        hj3 hj3Var;
        hj3 hj3Var2;
        int i;
        hj3 hj3Var3;
        hj3 hj3Var4;
        int i2;
        hj3 hj3Var5 = this.b;
        boolean z = hj3Var5.a;
        ek4 ek4Var = this.e;
        if (z) {
            ek4Var.d(hj3Var5.q());
        }
        boolean z2 = ek4Var.j;
        sh4 sh4Var = this.i;
        sh4 sh4Var2 = this.h;
        if (!z2) {
            hj3 hj3Var6 = this.b;
            int i3 = hj3Var6.p0[0];
            this.d = i3;
            if (i3 != 3) {
                if (i3 == 4 && (hj3Var4 = hj3Var6.T) != null && ((i2 = hj3Var4.p0[0]) == 1 || i2 == 4)) {
                    int iQ = (hj3Var4.q() - this.b.I.e()) - this.b.K.e();
                    r5g.b(sh4Var2, hj3Var4.d.h, this.b.I.e());
                    r5g.b(sh4Var, hj3Var4.d.i, -this.b.K.e());
                    ek4Var.d(iQ);
                    return;
                }
                if (i3 == 1) {
                    ek4Var.d(hj3Var6.q());
                }
            }
        } else if (this.d == 4 && (hj3Var2 = (hj3Var = this.b).T) != null && ((i = hj3Var2.p0[0]) == 1 || i == 4)) {
            r5g.b(sh4Var2, hj3Var2.d.h, hj3Var.I.e());
            r5g.b(sh4Var, hj3Var2.d.i, -this.b.K.e());
            return;
        }
        if (ek4Var.j) {
            hj3 hj3Var7 = this.b;
            if (hj3Var7.a) {
                oi3[] oi3VarArr = hj3Var7.Q;
                oi3 oi3Var = oi3VarArr[0];
                oi3 oi3Var2 = oi3Var.f;
                if (oi3Var2 != null && oi3VarArr[1].f != null) {
                    if (hj3Var7.x()) {
                        sh4Var2.f = this.b.Q[0].e();
                        sh4Var.f = -this.b.Q[1].e();
                        return;
                    }
                    sh4 sh4VarH = r5g.h(this.b.Q[0]);
                    if (sh4VarH != null) {
                        r5g.b(sh4Var2, sh4VarH, this.b.Q[0].e());
                    }
                    sh4 sh4VarH2 = r5g.h(this.b.Q[1]);
                    if (sh4VarH2 != null) {
                        r5g.b(sh4Var, sh4VarH2, -this.b.Q[1].e());
                    }
                    sh4Var2.b = true;
                    sh4Var.b = true;
                    return;
                }
                if (oi3Var2 != null) {
                    sh4 sh4VarH3 = r5g.h(oi3Var);
                    if (sh4VarH3 != null) {
                        r5g.b(sh4Var2, sh4VarH3, this.b.Q[0].e());
                        r5g.b(sh4Var, sh4Var2, ek4Var.g);
                        return;
                    }
                    return;
                }
                oi3 oi3Var3 = oi3VarArr[1];
                if (oi3Var3.f != null) {
                    sh4 sh4VarH4 = r5g.h(oi3Var3);
                    if (sh4VarH4 != null) {
                        r5g.b(sh4Var, sh4VarH4, -this.b.Q[1].e());
                        r5g.b(sh4Var2, sh4Var, -ek4Var.g);
                        return;
                    }
                    return;
                }
                if ((hj3Var7 instanceof uj6) || hj3Var7.T == null || hj3Var7.i(7).f != null) {
                    return;
                }
                hj3 hj3Var8 = this.b;
                r5g.b(sh4Var2, hj3Var8.T.d.h, hj3Var8.r());
                r5g.b(sh4Var, sh4Var2, ek4Var.g);
                return;
            }
        }
        if (this.d == 3) {
            hj3 hj3Var9 = this.b;
            int i4 = hj3Var9.r;
            if (i4 == 2) {
                hj3 hj3Var10 = hj3Var9.T;
                if (hj3Var10 != null) {
                    ek4 ek4Var2 = hj3Var10.e.e;
                    ek4Var.l.add(ek4Var2);
                    ek4Var2.k.add(ek4Var);
                    ek4Var.b = true;
                    ek4Var.k.add(sh4Var2);
                    ek4Var.k.add(sh4Var);
                }
            } else if (i4 == 3) {
                if (hj3Var9.s == 3) {
                    sh4Var2.a = this;
                    sh4Var.a = this;
                    ocf ocfVar = hj3Var9.e;
                    ocfVar.h.a = this;
                    ocfVar.i.a = this;
                    ek4Var.a = this;
                    if (hj3Var9.y()) {
                        ek4Var.l.add(this.b.e.e);
                        this.b.e.e.k.add(ek4Var);
                        ocf ocfVar2 = this.b.e;
                        ocfVar2.e.a = this;
                        ek4Var.l.add(ocfVar2.h);
                        ek4Var.l.add(this.b.e.i);
                        this.b.e.h.k.add(ek4Var);
                        this.b.e.i.k.add(ek4Var);
                    } else if (this.b.x()) {
                        this.b.e.e.l.add(ek4Var);
                        ek4Var.k.add(this.b.e.e);
                    } else {
                        this.b.e.e.l.add(ek4Var);
                    }
                } else {
                    ek4 ek4Var3 = hj3Var9.e.e;
                    ek4Var.l.add(ek4Var3);
                    ek4Var3.k.add(ek4Var);
                    this.b.e.h.k.add(ek4Var);
                    this.b.e.i.k.add(ek4Var);
                    ek4Var.b = true;
                    ek4Var.k.add(sh4Var2);
                    ek4Var.k.add(sh4Var);
                    sh4Var2.l.add(ek4Var);
                    sh4Var.l.add(ek4Var);
                }
            }
        }
        hj3 hj3Var11 = this.b;
        oi3[] oi3VarArr2 = hj3Var11.Q;
        oi3 oi3Var4 = oi3VarArr2[0];
        oi3 oi3Var5 = oi3Var4.f;
        if (oi3Var5 != null && oi3VarArr2[1].f != null) {
            if (hj3Var11.x()) {
                sh4Var2.f = this.b.Q[0].e();
                sh4Var.f = -this.b.Q[1].e();
                return;
            }
            sh4 sh4VarH5 = r5g.h(this.b.Q[0]);
            sh4 sh4VarH6 = r5g.h(this.b.Q[1]);
            if (sh4VarH5 != null) {
                sh4VarH5.b(this);
            }
            if (sh4VarH6 != null) {
                sh4VarH6.b(this);
            }
            this.j = 4;
            return;
        }
        if (oi3Var5 != null) {
            sh4 sh4VarH7 = r5g.h(oi3Var4);
            if (sh4VarH7 != null) {
                r5g.b(sh4Var2, sh4VarH7, this.b.Q[0].e());
                c(sh4Var, sh4Var2, 1, ek4Var);
                return;
            }
            return;
        }
        oi3 oi3Var6 = oi3VarArr2[1];
        if (oi3Var6.f != null) {
            sh4 sh4VarH8 = r5g.h(oi3Var6);
            if (sh4VarH8 != null) {
                r5g.b(sh4Var, sh4VarH8, -this.b.Q[1].e());
                c(sh4Var2, sh4Var, -1, ek4Var);
                return;
            }
            return;
        }
        if ((hj3Var11 instanceof uj6) || (hj3Var3 = hj3Var11.T) == null) {
            return;
        }
        r5g.b(sh4Var2, hj3Var3.d.h, hj3Var11.r());
        c(sh4Var, sh4Var2, 1, ek4Var);
    }

    @Override // defpackage.r5g
    public final void e() {
        sh4 sh4Var = this.h;
        if (sh4Var.j) {
            this.b.Y = sh4Var.g;
        }
    }

    @Override // defpackage.r5g
    public final void f() {
        this.c = null;
        this.h.c();
        this.i.c();
        this.e.c();
        this.g = false;
    }

    @Override // defpackage.r5g
    public final boolean k() {
        return this.d != 3 || this.b.r == 0;
    }

    public final void n() {
        this.g = false;
        sh4 sh4Var = this.h;
        sh4Var.c();
        sh4Var.j = false;
        sh4 sh4Var2 = this.i;
        sh4Var2.c();
        sh4Var2.j = false;
        this.e.j = false;
    }

    public final String toString() {
        return "HorizontalRun " + this.b.h0;
    }
}
