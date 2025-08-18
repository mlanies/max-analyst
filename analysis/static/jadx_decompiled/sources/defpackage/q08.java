package defpackage;

/* loaded from: classes.dex */
public final class q08 extends b9g {
    public final boolean l;
    public final kue m;
    public final hue n;
    public m08 o;
    public k08 p;
    public boolean q;
    public boolean r;
    public boolean s;

    public q08(ej0 ej0Var, boolean z) {
        super(ej0Var);
        this.l = z && ej0Var.j();
        this.m = new kue();
        this.n = new hue();
        mue mueVarH = ej0Var.h();
        if (mueVarH == null) {
            this.o = new m08(new o08(ej0Var.i()), kue.q, m08.h);
        } else {
            this.o = new m08(mueVarH, null, null);
            this.s = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.b9g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A(defpackage.mue r15) {
        /*
            Method dump skipped, instructions count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q08.A(mue):void");
    }

    @Override // defpackage.b9g
    public final void B() {
        if (this.l) {
            return;
        }
        this.q = true;
        y(null, this.k);
    }

    @Override // defpackage.ej0
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public final k08 c(yj8 yj8Var, n64 n64Var, long j) {
        k08 k08Var = new k08(yj8Var, n64Var, j);
        fm9.k(k08Var.o == null);
        ej0 ej0Var = this.k;
        k08Var.o = ej0Var;
        if (this.r) {
            Object obj = this.o.g;
            Object obj2 = yj8Var.a;
            if (obj != null && obj2.equals(m08.h)) {
                obj2 = this.o.g;
            }
            k08Var.b(yj8Var.a(obj2));
        } else {
            this.p = k08Var;
            if (!this.q) {
                this.q = true;
                y(null, ej0Var);
            }
        }
        return k08Var;
    }

    public final boolean D(long j) {
        k08 k08Var = this.p;
        int iB = this.o.b(k08Var.a.a);
        if (iB == -1) {
            return false;
        }
        m08 m08Var = this.o;
        hue hueVar = this.n;
        m08Var.g(iB, hueVar, false);
        long j2 = hueVar.d;
        if (j2 != -9223372036854775807L && j >= j2) {
            j = Math.max(0L, j2 - 1);
        }
        k08Var.Z = j;
        return true;
    }

    @Override // defpackage.ej0
    public final boolean a(tb8 tb8Var) {
        return this.k.a(tb8Var);
    }

    @Override // defpackage.pc3, defpackage.ej0
    public final void k() {
    }

    @Override // defpackage.ej0
    public final void o(zd8 zd8Var) {
        ((k08) zd8Var).c();
        if (zd8Var == this.p) {
            this.p = null;
        }
    }

    @Override // defpackage.pc3, defpackage.ej0
    public final void q() {
        this.r = false;
        this.q = false;
        super.q();
    }

    @Override // defpackage.b9g, defpackage.ej0
    public final void t(tb8 tb8Var) {
        if (this.s) {
            m08 m08Var = this.o;
            this.o = new m08(new z4b(this.o.e, tb8Var), m08Var.f, m08Var.g);
        } else {
            this.o = new m08(new o08(tb8Var), kue.q, m08.h);
        }
        this.k.t(tb8Var);
    }

    @Override // defpackage.b9g
    public final yj8 z(yj8 yj8Var) {
        Object obj = yj8Var.a;
        Object obj2 = this.o.g;
        if (obj2 != null && obj2.equals(obj)) {
            obj = m08.h;
        }
        return yj8Var.a(obj);
    }
}
