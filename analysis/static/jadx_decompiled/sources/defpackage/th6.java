package defpackage;

/* loaded from: classes.dex */
public final class th6 implements cw4, dw4 {
    public final /* synthetic */ int a;
    public String b;
    public boolean c;
    public final boolean[] d;
    public long e;
    public long f;
    public final Object g;
    public Object h;
    public Object i;
    public final Object j;
    public final Object k;
    public final Object l;
    public final Object m;
    public final Object n;
    public final Object o;

    public th6(wva wvaVar) {
        this.a = 0;
        this.g = wvaVar;
        this.d = new boolean[3];
        this.j = new vl9(32, 0);
        this.k = new vl9(33, 0);
        this.l = new vl9(34, 0);
        this.m = new vl9(39, 0);
        this.n = new vl9(40, 0);
        this.f = -9223372036854775807L;
        this.o = new yaf(3, false);
    }

    @Override // defpackage.cw4
    public final void a() {
        switch (this.a) {
            case 0:
                this.e = 0L;
                this.f = -9223372036854775807L;
                np8.i(this.d);
                ((vl9) this.j).c();
                ((vl9) this.k).c();
                ((vl9) this.l).c();
                ((vl9) this.m).c();
                ((vl9) this.n).c();
                sh6 sh6Var = (sh6) this.i;
                if (sh6Var != null) {
                    sh6Var.e = false;
                    sh6Var.f = false;
                    sh6Var.g = false;
                    sh6Var.h = false;
                    sh6Var.i = false;
                    break;
                }
                break;
            default:
                this.e = 0L;
                this.f = -9223372036854775807L;
                fm9.n(this.d);
                ((vl9) this.j).c();
                ((vl9) this.k).c();
                ((vl9) this.l).c();
                ((vl9) this.m).c();
                ((vl9) this.n).c();
                sh6 sh6Var2 = (sh6) this.i;
                if (sh6Var2 != null) {
                    sh6Var2.e = false;
                    sh6Var2.f = false;
                    sh6Var2.g = false;
                    sh6Var2.h = false;
                    sh6Var2.i = false;
                    break;
                }
                break;
        }
    }

    public final void b(int i, byte[] bArr, int i2) {
        switch (this.a) {
            case 0:
                sh6 sh6Var = (sh6) this.i;
                if (sh6Var.e) {
                    int i3 = sh6Var.c;
                    int i4 = (i + 2) - i3;
                    if (i4 < i2) {
                        sh6Var.f = (bArr[i4] & 128) != 0;
                        sh6Var.e = false;
                    } else {
                        sh6Var.c = (i2 - i) + i3;
                    }
                }
                if (!this.c) {
                    ((vl9) this.j).a(i, bArr, i2);
                    ((vl9) this.k).a(i, bArr, i2);
                    ((vl9) this.l).a(i, bArr, i2);
                }
                ((vl9) this.m).a(i, bArr, i2);
                ((vl9) this.n).a(i, bArr, i2);
                break;
            default:
                sh6 sh6Var2 = (sh6) this.i;
                if (sh6Var2.e) {
                    int i5 = sh6Var2.c;
                    int i6 = (i + 2) - i5;
                    if (i6 < i2) {
                        sh6Var2.f = (bArr[i6] & 128) != 0;
                        sh6Var2.e = false;
                    } else {
                        sh6Var2.c = (i2 - i) + i5;
                    }
                }
                if (!this.c) {
                    ((vl9) this.j).a(i, bArr, i2);
                    ((vl9) this.k).a(i, bArr, i2);
                    ((vl9) this.l).a(i, bArr, i2);
                }
                ((vl9) this.m).a(i, bArr, i2);
                ((vl9) this.n).a(i, bArr, i2);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0241 A[SYNTHETIC] */
    @Override // defpackage.dw4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d(defpackage.wpa r38) {
        /*
            Method dump skipped, instructions count: 599
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.th6.d(wpa):void");
    }

    @Override // defpackage.dw4
    public void e(boolean z) {
        fm9.l((yze) this.h);
        int i = oaf.a;
        if (z) {
            sh6 sh6Var = (sh6) this.i;
            long j = this.e;
            sh6Var.l = sh6Var.b;
            sh6Var.a((int) (j - sh6Var.a));
            sh6Var.j = sh6Var.a;
            sh6Var.a = j;
            sh6Var.a(0);
            sh6Var.h = false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:178:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0446  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x044a  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0479  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x049c  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x04a2  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x04a7  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x04ab  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x04b2  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x04c1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00db  */
    @Override // defpackage.cw4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void f(defpackage.yaf r43) {
        /*
            Method dump skipped, instructions count: 1240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.th6.f(yaf):void");
    }

    @Override // defpackage.cw4
    public final void g(int i, long j) {
        switch (this.a) {
            case 0:
                if (j != -9223372036854775807L) {
                    this.f = j;
                    break;
                }
                break;
            default:
                this.f = j;
                break;
        }
    }

    @Override // defpackage.cw4
    public void h() {
    }

    @Override // defpackage.dw4
    public void i(pa5 pa5Var, l3f l3fVar) {
        l3fVar.a();
        l3fVar.b();
        this.b = l3fVar.f;
        l3fVar.b();
        yze yzeVarMo6B = pa5Var.mo6B(l3fVar.e, 2);
        this.h = yzeVarMo6B;
        this.i = new sh6(yzeVarMo6B);
        ((aab) this.g).i(pa5Var, l3fVar);
    }

    @Override // defpackage.cw4
    public void j(oa5 oa5Var, l3f l3fVar) {
        l3fVar.a();
        l3fVar.b();
        this.b = l3fVar.f;
        l3fVar.b();
        xze xzeVarB = oa5Var.B(l3fVar.e, 2);
        this.h = xzeVarB;
        this.i = new sh6(xzeVarB);
        ((wva) this.g).b(oa5Var, l3fVar);
    }

    public th6(aab aabVar) {
        this.a = 1;
        this.g = aabVar;
        this.d = new boolean[3];
        this.j = new vl9(32, 1);
        this.k = new vl9(33, 1);
        this.l = new vl9(34, 1);
        this.m = new vl9(39, 1);
        this.n = new vl9(40, 1);
        this.f = -9223372036854775807L;
        this.o = new wpa();
    }
}
