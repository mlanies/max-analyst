package defpackage;

/* loaded from: classes.dex */
public final class rh6 implements cw4, dw4 {
    public final /* synthetic */ int a;
    public final boolean b;
    public final boolean c;
    public long d;
    public final boolean[] e;
    public String f;
    public boolean g;
    public long h;
    public boolean i;
    public final Object j;
    public final Object k;
    public final Object l;
    public final Object m;
    public Object n;
    public Object o;
    public final Object p;

    public rh6(aab aabVar, boolean z, boolean z2) {
        this.a = 1;
        this.j = aabVar;
        this.b = z;
        this.c = z2;
        this.e = new boolean[3];
        this.k = new vl9(7, 1);
        this.l = new vl9(8, 1);
        this.m = new vl9(6, 1);
        this.h = -9223372036854775807L;
        this.p = new wpa();
    }

    @Override // defpackage.cw4
    public final void a() {
        switch (this.a) {
            case 0:
                this.d = 0L;
                this.i = false;
                this.h = -9223372036854775807L;
                np8.i(this.e);
                ((vl9) this.k).c();
                ((vl9) this.l).c();
                ((vl9) this.m).c();
                ph6 ph6Var = (ph6) this.o;
                if (ph6Var != null) {
                    ph6Var.k = false;
                    ph6Var.o = false;
                    oh6 oh6Var = ph6Var.n;
                    oh6Var.b = false;
                    oh6Var.a = false;
                    break;
                }
                break;
            default:
                this.d = 0L;
                this.i = false;
                this.h = -9223372036854775807L;
                fm9.n(this.e);
                ((vl9) this.k).c();
                ((vl9) this.l).c();
                ((vl9) this.m).c();
                qh6 qh6Var = (qh6) this.o;
                if (qh6Var != null) {
                    qh6Var.k = false;
                    qh6Var.o = false;
                    oh6 oh6Var2 = qh6Var.n;
                    oh6Var2.b = false;
                    oh6Var2.a = false;
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:151:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x014b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(int r18, byte[] r19, int r20) {
        /*
            Method dump skipped, instructions count: 824
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rh6.b(int, byte[], int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0297  */
    @Override // defpackage.dw4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d(defpackage.wpa r31) {
        /*
            Method dump skipped, instructions count: 804
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rh6.d(wpa):void");
    }

    @Override // defpackage.dw4
    public void e(boolean z) {
        fm9.l((yze) this.n);
        int i = oaf.a;
        if (z) {
            qh6 qh6Var = (qh6) this.o;
            long j = this.d;
            qh6Var.a();
            qh6Var.j = j;
            long j2 = qh6Var.q;
            if (j2 != -9223372036854775807L) {
                boolean z2 = qh6Var.r;
                qh6Var.a.a(j2, z2 ? 1 : 0, (int) (j - qh6Var.p), 0, null);
            }
            qh6Var.o = false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:129:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0240  */
    @Override // defpackage.cw4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void f(defpackage.yaf r29) {
        /*
            Method dump skipped, instructions count: 767
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rh6.f(yaf):void");
    }

    @Override // defpackage.cw4
    public final void g(int i, long j) {
        switch (this.a) {
            case 0:
                if (j != -9223372036854775807L) {
                    this.h = j;
                }
                this.i = ((i & 2) != 0) | this.i;
                break;
            default:
                this.h = j;
                this.i = ((i & 2) != 0) | this.i;
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
        this.f = l3fVar.f;
        l3fVar.b();
        yze yzeVarMo6B = pa5Var.mo6B(l3fVar.e, 2);
        this.n = yzeVarMo6B;
        this.o = new qh6(yzeVarMo6B, this.b, this.c);
        ((aab) this.j).i(pa5Var, l3fVar);
    }

    @Override // defpackage.cw4
    public void j(oa5 oa5Var, l3f l3fVar) {
        l3fVar.a();
        l3fVar.b();
        this.f = l3fVar.f;
        l3fVar.b();
        xze xzeVarB = oa5Var.B(l3fVar.e, 2);
        this.n = xzeVarB;
        this.o = new ph6(xzeVarB, this.b, this.c);
        ((wva) this.j).b(oa5Var, l3fVar);
    }

    public rh6(wva wvaVar, boolean z, boolean z2) {
        this.a = 0;
        this.j = wvaVar;
        this.b = z;
        this.c = z2;
        this.e = new boolean[3];
        this.k = new vl9(7, 0);
        this.l = new vl9(8, 0);
        this.m = new vl9(6, 0);
        this.h = -9223372036854775807L;
        this.p = new yaf(3, false);
    }
}
