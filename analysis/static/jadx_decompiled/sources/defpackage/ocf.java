package defpackage;

/* loaded from: classes.dex */
public final class ocf extends r5g {
    public sh4 k;
    public qk0 l;

    @Override // defpackage.oh4
    public final void a(oh4 oh4Var) {
        float f;
        float f2;
        float f3;
        int i;
        if (au1.s(this.j) == 3) {
            hj3 hj3Var = this.b;
            l(hj3Var.J, hj3Var.L, 1);
            return;
        }
        ek4 ek4Var = this.e;
        if (ek4Var.c && !ek4Var.j && this.d == 3) {
            hj3 hj3Var2 = this.b;
            int i2 = hj3Var2.s;
            if (i2 == 2) {
                hj3 hj3Var3 = hj3Var2.T;
                if (hj3Var3 != null) {
                    if (hj3Var3.e.e.j) {
                        ek4Var.d((int) ((r5.g * hj3Var2.z) + 0.5f));
                    }
                }
            } else if (i2 == 3) {
                ek4 ek4Var2 = hj3Var2.d.e;
                if (ek4Var2.j) {
                    int i3 = hj3Var2.X;
                    if (i3 == -1) {
                        f = ek4Var2.g;
                        f2 = hj3Var2.W;
                    } else if (i3 == 0) {
                        f3 = ek4Var2.g * hj3Var2.W;
                        i = (int) (f3 + 0.5f);
                        ek4Var.d(i);
                    } else if (i3 != 1) {
                        i = 0;
                        ek4Var.d(i);
                    } else {
                        f = ek4Var2.g;
                        f2 = hj3Var2.W;
                    }
                    f3 = f / f2;
                    i = (int) (f3 + 0.5f);
                    ek4Var.d(i);
                }
            }
        }
        sh4 sh4Var = this.h;
        if (sh4Var.c) {
            sh4 sh4Var2 = this.i;
            if (sh4Var2.c) {
                if (sh4Var.j && sh4Var2.j && ek4Var.j) {
                    return;
                }
                if (!ek4Var.j && this.d == 3) {
                    hj3 hj3Var4 = this.b;
                    if (hj3Var4.r == 0 && !hj3Var4.y()) {
                        sh4 sh4Var3 = (sh4) sh4Var.l.get(0);
                        sh4 sh4Var4 = (sh4) sh4Var2.l.get(0);
                        int i4 = sh4Var3.g + sh4Var.f;
                        int i5 = sh4Var4.g + sh4Var2.f;
                        sh4Var.d(i4);
                        sh4Var2.d(i5);
                        ek4Var.d(i5 - i4);
                        return;
                    }
                }
                if (!ek4Var.j && this.d == 3 && this.a == 1 && sh4Var.l.size() > 0 && sh4Var2.l.size() > 0) {
                    sh4 sh4Var5 = (sh4) sh4Var.l.get(0);
                    int i6 = (((sh4) sh4Var2.l.get(0)).g + sh4Var2.f) - (sh4Var5.g + sh4Var.f);
                    int i7 = ek4Var.m;
                    if (i6 < i7) {
                        ek4Var.d(i6);
                    } else {
                        ek4Var.d(i7);
                    }
                }
                if (ek4Var.j && sh4Var.l.size() > 0 && sh4Var2.l.size() > 0) {
                    sh4 sh4Var6 = (sh4) sh4Var.l.get(0);
                    sh4 sh4Var7 = (sh4) sh4Var2.l.get(0);
                    int i8 = sh4Var6.g;
                    int i9 = sh4Var.f + i8;
                    int i10 = sh4Var7.g;
                    int i11 = sh4Var2.f + i10;
                    float f4 = this.b.e0;
                    if (sh4Var6 == sh4Var7) {
                        f4 = 0.5f;
                    } else {
                        i8 = i9;
                        i10 = i11;
                    }
                    sh4Var.d((int) ((((i10 - i8) - ek4Var.g) * f4) + i8 + 0.5f));
                    sh4Var2.d(sh4Var.g + ek4Var.g);
                }
            }
        }
    }

    @Override // defpackage.r5g
    public final void d() {
        hj3 hj3Var;
        hj3 hj3Var2;
        hj3 hj3Var3;
        hj3 hj3Var4;
        hj3 hj3Var5 = this.b;
        boolean z = hj3Var5.a;
        ek4 ek4Var = this.e;
        if (z) {
            ek4Var.d(hj3Var5.k());
        }
        boolean z2 = ek4Var.j;
        sh4 sh4Var = this.i;
        sh4 sh4Var2 = this.h;
        if (!z2) {
            hj3 hj3Var6 = this.b;
            this.d = hj3Var6.p0[1];
            if (hj3Var6.E) {
                this.l = new qk0(this);
            }
            int i = this.d;
            if (i != 3) {
                if (i == 4 && (hj3Var4 = this.b.T) != null && hj3Var4.p0[1] == 1) {
                    int iK = (hj3Var4.k() - this.b.J.e()) - this.b.L.e();
                    r5g.b(sh4Var2, hj3Var4.e.h, this.b.J.e());
                    r5g.b(sh4Var, hj3Var4.e.i, -this.b.L.e());
                    ek4Var.d(iK);
                    return;
                }
                if (i == 1) {
                    ek4Var.d(this.b.k());
                }
            }
        } else if (this.d == 4 && (hj3Var2 = (hj3Var = this.b).T) != null && hj3Var2.p0[1] == 1) {
            r5g.b(sh4Var2, hj3Var2.e.h, hj3Var.J.e());
            r5g.b(sh4Var, hj3Var2.e.i, -this.b.L.e());
            return;
        }
        boolean z3 = ek4Var.j;
        sh4 sh4Var3 = this.k;
        if (z3) {
            hj3 hj3Var7 = this.b;
            if (hj3Var7.a) {
                oi3[] oi3VarArr = hj3Var7.Q;
                oi3 oi3Var = oi3VarArr[2];
                oi3 oi3Var2 = oi3Var.f;
                if (oi3Var2 != null && oi3VarArr[3].f != null) {
                    if (hj3Var7.y()) {
                        sh4Var2.f = this.b.Q[2].e();
                        sh4Var.f = -this.b.Q[3].e();
                    } else {
                        sh4 sh4VarH = r5g.h(this.b.Q[2]);
                        if (sh4VarH != null) {
                            r5g.b(sh4Var2, sh4VarH, this.b.Q[2].e());
                        }
                        sh4 sh4VarH2 = r5g.h(this.b.Q[3]);
                        if (sh4VarH2 != null) {
                            r5g.b(sh4Var, sh4VarH2, -this.b.Q[3].e());
                        }
                        sh4Var2.b = true;
                        sh4Var.b = true;
                    }
                    hj3 hj3Var8 = this.b;
                    if (hj3Var8.E) {
                        r5g.b(sh4Var3, sh4Var2, hj3Var8.a0);
                        return;
                    }
                    return;
                }
                if (oi3Var2 != null) {
                    sh4 sh4VarH3 = r5g.h(oi3Var);
                    if (sh4VarH3 != null) {
                        r5g.b(sh4Var2, sh4VarH3, this.b.Q[2].e());
                        r5g.b(sh4Var, sh4Var2, ek4Var.g);
                        hj3 hj3Var9 = this.b;
                        if (hj3Var9.E) {
                            r5g.b(sh4Var3, sh4Var2, hj3Var9.a0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                oi3 oi3Var3 = oi3VarArr[3];
                if (oi3Var3.f != null) {
                    sh4 sh4VarH4 = r5g.h(oi3Var3);
                    if (sh4VarH4 != null) {
                        r5g.b(sh4Var, sh4VarH4, -this.b.Q[3].e());
                        r5g.b(sh4Var2, sh4Var, -ek4Var.g);
                    }
                    hj3 hj3Var10 = this.b;
                    if (hj3Var10.E) {
                        r5g.b(sh4Var3, sh4Var2, hj3Var10.a0);
                        return;
                    }
                    return;
                }
                oi3 oi3Var4 = oi3VarArr[4];
                if (oi3Var4.f != null) {
                    sh4 sh4VarH5 = r5g.h(oi3Var4);
                    if (sh4VarH5 != null) {
                        r5g.b(sh4Var3, sh4VarH5, 0);
                        r5g.b(sh4Var2, sh4Var3, -this.b.a0);
                        r5g.b(sh4Var, sh4Var2, ek4Var.g);
                        return;
                    }
                    return;
                }
                if ((hj3Var7 instanceof uj6) || hj3Var7.T == null || hj3Var7.i(7).f != null) {
                    return;
                }
                hj3 hj3Var11 = this.b;
                r5g.b(sh4Var2, hj3Var11.T.e.h, hj3Var11.s());
                r5g.b(sh4Var, sh4Var2, ek4Var.g);
                hj3 hj3Var12 = this.b;
                if (hj3Var12.E) {
                    r5g.b(sh4Var3, sh4Var2, hj3Var12.a0);
                    return;
                }
                return;
            }
        }
        if (z3 || this.d != 3) {
            ek4Var.b(this);
        } else {
            hj3 hj3Var13 = this.b;
            int i2 = hj3Var13.s;
            if (i2 == 2) {
                hj3 hj3Var14 = hj3Var13.T;
                if (hj3Var14 != null) {
                    ek4 ek4Var2 = hj3Var14.e.e;
                    ek4Var.l.add(ek4Var2);
                    ek4Var2.k.add(ek4Var);
                    ek4Var.b = true;
                    ek4Var.k.add(sh4Var2);
                    ek4Var.k.add(sh4Var);
                }
            } else if (i2 == 3 && !hj3Var13.y()) {
                hj3 hj3Var15 = this.b;
                if (hj3Var15.r != 3) {
                    ek4 ek4Var3 = hj3Var15.d.e;
                    ek4Var.l.add(ek4Var3);
                    ek4Var3.k.add(ek4Var);
                    ek4Var.b = true;
                    ek4Var.k.add(sh4Var2);
                    ek4Var.k.add(sh4Var);
                }
            }
        }
        hj3 hj3Var16 = this.b;
        oi3[] oi3VarArr2 = hj3Var16.Q;
        oi3 oi3Var5 = oi3VarArr2[2];
        oi3 oi3Var6 = oi3Var5.f;
        if (oi3Var6 != null && oi3VarArr2[3].f != null) {
            if (hj3Var16.y()) {
                sh4Var2.f = this.b.Q[2].e();
                sh4Var.f = -this.b.Q[3].e();
            } else {
                sh4 sh4VarH6 = r5g.h(this.b.Q[2]);
                sh4 sh4VarH7 = r5g.h(this.b.Q[3]);
                if (sh4VarH6 != null) {
                    sh4VarH6.b(this);
                }
                if (sh4VarH7 != null) {
                    sh4VarH7.b(this);
                }
                this.j = 4;
            }
            if (this.b.E) {
                c(sh4Var3, sh4Var2, 1, this.l);
            }
        } else if (oi3Var6 != null) {
            sh4 sh4VarH8 = r5g.h(oi3Var5);
            if (sh4VarH8 != null) {
                r5g.b(sh4Var2, sh4VarH8, this.b.Q[2].e());
                c(sh4Var, sh4Var2, 1, ek4Var);
                if (this.b.E) {
                    c(sh4Var3, sh4Var2, 1, this.l);
                }
                if (this.d == 3) {
                    hj3 hj3Var17 = this.b;
                    if (hj3Var17.W > 0.0f) {
                        eo6 eo6Var = hj3Var17.d;
                        if (eo6Var.d == 3) {
                            eo6Var.e.k.add(ek4Var);
                            ek4Var.l.add(this.b.d.e);
                            ek4Var.a = this;
                        }
                    }
                }
            }
        } else {
            oi3 oi3Var7 = oi3VarArr2[3];
            if (oi3Var7.f != null) {
                sh4 sh4VarH9 = r5g.h(oi3Var7);
                if (sh4VarH9 != null) {
                    r5g.b(sh4Var, sh4VarH9, -this.b.Q[3].e());
                    c(sh4Var2, sh4Var, -1, ek4Var);
                    if (this.b.E) {
                        c(sh4Var3, sh4Var2, 1, this.l);
                    }
                }
            } else {
                oi3 oi3Var8 = oi3VarArr2[4];
                if (oi3Var8.f != null) {
                    sh4 sh4VarH10 = r5g.h(oi3Var8);
                    if (sh4VarH10 != null) {
                        r5g.b(sh4Var3, sh4VarH10, 0);
                        c(sh4Var2, sh4Var3, -1, this.l);
                        c(sh4Var, sh4Var2, 1, ek4Var);
                    }
                } else if (!(hj3Var16 instanceof uj6) && (hj3Var3 = hj3Var16.T) != null) {
                    r5g.b(sh4Var2, hj3Var3.e.h, hj3Var16.s());
                    c(sh4Var, sh4Var2, 1, ek4Var);
                    if (this.b.E) {
                        c(sh4Var3, sh4Var2, 1, this.l);
                    }
                    if (this.d == 3) {
                        hj3 hj3Var18 = this.b;
                        if (hj3Var18.W > 0.0f) {
                            eo6 eo6Var2 = hj3Var18.d;
                            if (eo6Var2.d == 3) {
                                eo6Var2.e.k.add(ek4Var);
                                ek4Var.l.add(this.b.d.e);
                                ek4Var.a = this;
                            }
                        }
                    }
                }
            }
        }
        if (ek4Var.l.size() == 0) {
            ek4Var.c = true;
        }
    }

    @Override // defpackage.r5g
    public final void e() {
        sh4 sh4Var = this.h;
        if (sh4Var.j) {
            this.b.Z = sh4Var.g;
        }
    }

    @Override // defpackage.r5g
    public final void f() {
        this.c = null;
        this.h.c();
        this.i.c();
        this.k.c();
        this.e.c();
        this.g = false;
    }

    @Override // defpackage.r5g
    public final boolean k() {
        return this.d != 3 || this.b.s == 0;
    }

    public final void m() {
        this.g = false;
        sh4 sh4Var = this.h;
        sh4Var.c();
        sh4Var.j = false;
        sh4 sh4Var2 = this.i;
        sh4Var2.c();
        sh4Var2.j = false;
        sh4 sh4Var3 = this.k;
        sh4Var3.c();
        sh4Var3.j = false;
        this.e.j = false;
    }

    public final String toString() {
        return "VerticalRun " + this.b.h0;
    }
}
