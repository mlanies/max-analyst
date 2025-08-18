package defpackage;

/* loaded from: classes.dex */
public final class p08 extends oc3 {
    public final dj0 k;
    public final boolean l;
    public final jue m;
    public final gue n;
    public l08 o;
    public j08 p;
    public boolean q;
    public boolean r;
    public boolean s;

    public p08(dj0 dj0Var, boolean z) {
        boolean z2;
        this.k = dj0Var;
        if (z) {
            dj0Var.getClass();
            z2 = true;
        } else {
            z2 = false;
        }
        this.l = z2;
        this.m = new jue();
        this.n = new gue();
        dj0Var.getClass();
        this.o = new l08(new n08(dj0Var.f()), jue.C0, l08.X);
    }

    @Override // defpackage.dj0
    public final rb8 f() {
        return this.k.f();
    }

    @Override // defpackage.oc3, defpackage.dj0
    public final void g() {
    }

    @Override // defpackage.dj0
    public final void i(y0f y0fVar) {
        this.j = y0fVar;
        this.i = maf.m(null);
        if (this.l) {
            return;
        }
        this.q = true;
        r(null, this.k);
    }

    @Override // defpackage.dj0
    public final void k(yd8 yd8Var) {
        j08 j08Var = (j08) yd8Var;
        if (j08Var.X != null) {
            dj0 dj0Var = j08Var.o;
            dj0Var.getClass();
            dj0Var.k(j08Var.X);
        }
        if (yd8Var == this.p) {
            this.p = null;
        }
    }

    @Override // defpackage.oc3, defpackage.dj0
    public final void m() {
        this.r = false;
        this.q = false;
        super.m();
    }

    @Override // defpackage.oc3
    public final xj8 p(Object obj, xj8 xj8Var) {
        Object obj2 = xj8Var.a;
        Object obj3 = this.o.o;
        if (obj3 != null && obj3.equals(obj2)) {
            obj2 = l08.X;
        }
        return xj8Var.b(obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.oc3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q(java.lang.Integer r15, defpackage.dj0 r16, defpackage.lue r17) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p08.q(java.lang.Integer, dj0, lue):void");
    }

    @Override // defpackage.dj0
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public final j08 a(xj8 xj8Var, n64 n64Var, long j) {
        j08 j08Var = new j08(xj8Var, n64Var, j);
        np8.f(j08Var.o == null);
        dj0 dj0Var = this.k;
        j08Var.o = dj0Var;
        if (this.r) {
            Object obj = this.o.o;
            Object obj2 = xj8Var.a;
            if (obj != null && obj2.equals(l08.X)) {
                obj2 = this.o.o;
            }
            xj8 xj8VarB = xj8Var.b(obj2);
            long jB = j08Var.b(j);
            dj0 dj0Var2 = j08Var.o;
            dj0Var2.getClass();
            yd8 yd8VarA = dj0Var2.a(xj8VarB, n64Var, jB);
            j08Var.X = yd8VarA;
            if (j08Var.Y != null) {
                yd8VarA.J(j08Var, jB);
            }
        } else {
            this.p = j08Var;
            if (!this.q) {
                this.q = true;
                r(null, dj0Var);
            }
        }
        return j08Var;
    }

    public final void t(long j) {
        j08 j08Var = this.p;
        int iB = this.o.b(j08Var.a.a);
        if (iB == -1) {
            return;
        }
        l08 l08Var = this.o;
        gue gueVar = this.n;
        l08Var.g(iB, gueVar, false);
        long j2 = gueVar.o;
        if (j2 != -9223372036854775807L && j >= j2) {
            j = Math.max(0L, j2 - 1);
        }
        j08Var.Z = j;
    }
}
