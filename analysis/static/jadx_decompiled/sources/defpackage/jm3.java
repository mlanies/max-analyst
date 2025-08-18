package defpackage;

import android.graphics.RectF;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class jm3 extends gv4 {
    public final khe A;
    public final AtomicBoolean B;
    public final h35 C;
    public final h35 D;
    public final long n;
    public final je7 o;
    public final je7 p;
    public final je7 q;
    public final je7 r;
    public final je7 s;
    public final je7 t;
    public final je7 u;
    public final je7 v;
    public final je7 w;
    public final je7 x;
    public final ggc y;
    public final je7 z;

    public jm3(long j, sx3 sx3Var) {
        super(sx3Var);
        this.n = j;
        neb nebVar = neb.a;
        khe kheVarD = nebVar.getAccessor().d(ds3.class);
        this.o = kheVarD;
        this.p = nebVar.c();
        this.q = nebVar.getAccessor().d(q33.class);
        this.r = nebVar.getAccessor().d(kxc.class);
        this.s = nebVar.d();
        this.t = nebVar.getAccessor().d(f5a.class);
        this.u = nebVar.getAccessor().d(kr1.class);
        this.v = nebVar.getAccessor().d(hq3.class);
        this.w = nebVar.getAccessor().d(gq3.class);
        this.x = nebVar.getAccessor().d(yj3.class);
        this.y = new ggc(nebVar.getAccessor().d(qea.class));
        this.z = nebVar.b();
        this.A = new khe(new zf3(4));
        this.B = new AtomicBoolean(false);
        this.C = new h35(y53.M(new sf7(), new xc(), new kq9()));
        this.D = new h35(x53.u0(y53.M(new sf7(), new xc(), new kq9()), new kz4()));
        od2.L(od2.F(new zn5(new ac(new mqc(new dm3(new t03(((ds3) kheVarD.getValue()).c(j), 11), null, this)), 16, this), new rl3(this, null), 5), ((w9a) q()).b()), sx3Var);
    }

    public static final Object n(jm3 jm3Var, Continuation continuation) {
        Object objA;
        boolean z = jm3Var.B.get();
        e5f e5fVar = e5f.a;
        tx3 tx3Var = tx3.a;
        kld kldVar = jm3Var.d;
        if (z) {
            jm3Var.c().getClass();
            objA = kldVar.a(new rfb(new eqe(vea.c0), new eqe(vea.b0), y53.M(new mg3(sea.f0, new eqe(vea.a0), 1, false), new mg3(sea.g0, new eqe(vea.Z), 2, false))), continuation);
            if (objA != tx3Var) {
                return e5fVar;
            }
        } else {
            uj3 uj3Var = (uj3) ((ds3) jm3Var.o.getValue()).c(jm3Var.n).a.getValue();
            String strD = uj3Var != null ? uj3Var.d() : null;
            if (strD == null) {
                strD = "";
            }
            jm3Var.c().getClass();
            gqe gqeVar = new gqe(vea.H0, ys.m0(new Object[]{strD}));
            kl7 kl7VarL = j1e.l();
            kl7VarL.add(new mg3(sea.f, new eqe(vea.G0), 1, false));
            kl7VarL.add(new mg3(sea.e, new eqe(vea.E0), 2, false));
            objA = kldVar.a(new rfb(gqeVar, null, j1e.d(kl7VarL)), continuation);
            if (objA != tx3Var) {
                return e5fVar;
            }
        }
        return objA;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.xu4 o(defpackage.jm3 r20, defpackage.uj3 r21) {
        /*
            r0 = r20
            r1 = r21
            java.lang.String r2 = "6M"
            je7 r3 = r0.q
            java.lang.Object r3 = r3.getValue()
            q33 r3 = (defpackage.q33) r3
            hyc r3 = (defpackage.hyc) r3
            java.lang.String r3 = r3.q()
            kk0 r4 = defpackage.kk0.c
            java.lang.String r6 = r1.q(r3, r4)
            long r7 = r21.n()
            java.lang.CharSequence r10 = r21.m()
            java.lang.String r9 = r21.e()
            java.lang.String r12 = r21.f()
            ql3 r3 = r1.a
            pl3 r4 = r3.c
            java.lang.String r14 = r4.o
            java.lang.String r4 = r4.p
            if (r4 == 0) goto L52
            int r4 = r4.length()
            if (r4 != 0) goto L3b
            goto L52
        L3b:
            pl3 r3 = r3.c
            java.lang.String r3 = r3.p
            android.net.Uri r3 = android.net.Uri.parse(r3)
            java.lang.String r3 = r3.getLastPathSegment()
            if (r3 != 0) goto L4b
            java.lang.String r3 = ""
        L4b:
            iqe r4 = new iqe
            r4.<init>(r3)
        L50:
            r15 = r4
            goto L5a
        L52:
            int r3 = defpackage.vea.k2
            eqe r4 = new eqe
            r4.<init>(r3)
            goto L50
        L5a:
            long r3 = r21.o()
            java.lang.String r16 = java.lang.String.valueOf(r3)
            je7 r0 = r0.r
            java.lang.Object r0 = r0.getValue()
            kxc r0 = (defpackage.kxc) r0
            jp r0 = (defpackage.jp) r0
            ne7 r0 = r0.g
            java.lang.String r1 = "app.privacy.inactive.ttl"
            java.lang.String r0 = r0.getString(r1, r2)
            faf r1 = defpackage.faf.TTL_6M
            if (r0 == 0) goto La2
            r3 = -1
            int r4 = r0.hashCode()
            switch(r4) {
                case 1596: goto L95;
                case 1658: goto L8a;
                case 1751: goto L81;
                default: goto L80;
            }
        L80:
            goto L9f
        L81:
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L88
            goto L9f
        L88:
            r3 = 2
            goto L9f
        L8a:
            java.lang.String r2 = "3M"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L93
            goto L9f
        L93:
            r3 = 1
            goto L9f
        L95:
            java.lang.String r2 = "1M"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L9e
            goto L9f
        L9e:
            r3 = 0
        L9f:
            switch(r3) {
                case 0: goto Laa;
                case 1: goto La5;
                case 2: goto La2;
                default: goto La2;
            }
        La2:
            r17 = r1
            goto Lad
        La5:
            faf r0 = defpackage.faf.TTL_3M
        La7:
            r17 = r0
            goto Lad
        Laa:
            faf r0 = defpackage.faf.TTL_1M
            goto La7
        Lad:
            xu4 r0 = new xu4
            r11 = 0
            r13 = 0
            r18 = 0
            r19 = 0
            r5 = r0
            r5.<init>(r6, r7, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jm3.o(jm3, uj3):xu4");
    }

    public static final void p(jm3 jm3Var, long j) {
        Object value;
        xu4 xu4VarC;
        q0e q0eVar;
        Object value2;
        q0e q0eVar2 = jm3Var.j;
        do {
            value = q0eVar2.getValue();
            xu4 xu4Var = (xu4) value;
            if (xu4Var != null) {
                xu4VarC = xu4.c(xu4Var, null, null, null, null, null, null, null, j != 0, Long.valueOf(j), 2047);
            } else {
                xu4VarC = null;
            }
        } while (!q0eVar2.c(value, xu4VarC));
        do {
            q0eVar = jm3Var.c;
            value2 = q0eVar.getValue();
        } while (!q0eVar.c(value2, jm3Var.f().a(jm3Var)));
    }

    @Override // defpackage.gv4
    public final void a(int i) {
        j47.T(this.a, ((w9a) q()).a(), null, new sl3(i, this, null), 2);
    }

    @Override // defpackage.gv4
    public final void b() {
    }

    @Override // defpackage.gv4
    public final boolean d() {
        return this.B.get();
    }

    @Override // defpackage.gv4
    public final long e() {
        return this.n;
    }

    @Override // defpackage.gv4
    public final void g(int i) {
        if (i == sea.b) {
            r(faf.TTL_1M);
            return;
        }
        if (i == sea.c) {
            r(faf.TTL_3M);
            return;
        }
        if (i == sea.d) {
            r(faf.TTL_6M);
            return;
        }
        int i2 = sea.f0;
        sx3 sx3Var = this.a;
        if (i == i2) {
            j47.T(sx3Var, ((w9a) q()).b(), null, new wl3(this, true, null), 2);
            return;
        }
        if (i == sea.f) {
            j47.T(sx3Var, ((w9a) q()).b().plus(xq9.a), null, new vl3(this, null), 2);
        } else if (i == sea.k0) {
            ((wr1) ((kr1) this.u.getValue())).v();
            j47.T(sx3Var, ((w9a) q()).b(), null, new yl3(this, null), 2);
        }
    }

    @Override // defpackage.gv4
    public final Object h(String str, RectF rectF, Continuation continuation) {
        this.m.set(((k4a) ((pk) this.z.getValue())).F(str, nd7.k(rectF)));
        Object objA = this.d.a(new sfb(new eqe(vea.q), new Integer(woc.m)), continuation);
        return objA == tx3.a ? objA : e5f.a;
    }

    @Override // defpackage.gv4
    public final e5f i() {
        uj3 uj3Var = (uj3) ((ds3) this.o.getValue()).c(this.n).a.getValue();
        e5f e5fVar = e5f.a;
        if (uj3Var == null) {
            return e5fVar;
        }
        q0e q0eVar = this.b;
        meb mebVar = (meb) q0eVar.getValue();
        q0eVar.setValue(mebVar != null ? meb.a(mebVar, uj3Var.q(((hyc) ((q33) this.q.getValue())).q(), kk0.c), false, 126) : null);
        return e5fVar;
    }

    @Override // defpackage.gv4
    public final void j() {
        j47.T(this.a, ((w9a) q()).b(), null, new zl3(this, null), 2);
    }

    @Override // defpackage.gv4
    public final void k() {
        j47.T(this.a, ((w9a) q()).a(), null, new am3(this, null), 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.gv4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(kotlin.coroutines.Continuation r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jm3.l(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // defpackage.gv4
    public final void m(int i, String str) {
        Object value;
        xu4 xu4Var;
        Object value2;
        xu4 xu4Var2;
        Object value3;
        xu4 xu4Var3;
        q0e q0eVar = this.j;
        if (i == 1) {
            do {
                value3 = q0eVar.getValue();
                xu4Var3 = (xu4) value3;
            } while (!q0eVar.c(value3, xu4Var3 != null ? xu4.c(xu4Var3, str, null, null, null, null, null, null, false, null, 8171) : null));
        } else if (i == 2) {
            do {
                value2 = q0eVar.getValue();
                xu4Var2 = (xu4) value2;
            } while (!q0eVar.c(value2, xu4Var2 != null ? xu4.c(xu4Var2, null, null, str, null, null, null, null, false, null, 8095) : null));
        } else if (i == 4) {
            do {
                value = q0eVar.getValue();
                xu4Var = (xu4) value;
            } while (!q0eVar.c(value, xu4Var != null ? xu4.c(xu4Var, null, null, null, null, str, null, null, false, null, 8063) : null));
        }
    }

    public final kke q() {
        return (kke) this.s.getValue();
    }

    public final void r(faf fafVar) {
        q0e q0eVar;
        Object value;
        xu4 xu4Var;
        do {
            q0eVar = this.j;
            value = q0eVar.getValue();
            xu4Var = (xu4) value;
        } while (!q0eVar.c(value, xu4Var != null ? xu4.c(xu4Var, null, null, null, null, null, null, fafVar, false, null, 7167) : null));
    }

    public final boolean s(h35 h35Var) {
        Object value;
        xu4 xu4Var;
        q0e q0eVar;
        Object value2;
        String str;
        xu4 xu4Var2;
        String str2;
        q0e q0eVar2 = this.j;
        xu4 xu4Var3 = (xu4) q0eVar2.getValue();
        String str3 = xu4Var3 != null ? xu4Var3.c : null;
        if (str3 == null) {
            str3 = "";
        }
        a73 a73VarA = h35Var.a(1, str3);
        xu4 xu4Var4 = (xu4) q0eVar2.getValue();
        String str4 = xu4Var4 != null ? xu4Var4.f : null;
        a73 a73VarA2 = h35Var.a(2, str4 != null ? str4 : "");
        xu4 xu4Var5 = (xu4) q0eVar2.getValue();
        if (xu4Var5 != null && (str = xu4Var5.c) != null && w9e.C0(str) && (xu4Var2 = (xu4) q0eVar2.getValue()) != null && (str2 = xu4Var2.f) != null && !w9e.C0(str2)) {
            a73VarA = new a73(Collections.singletonList(new eqe(yoc.n0)));
        }
        boolean z = a73VarA == null && a73VarA2 == null;
        do {
            value = q0eVar2.getValue();
            xu4Var = (xu4) value;
        } while (!q0eVar2.c(value, xu4Var != null ? xu4.c(xu4Var, null, a73VarA, null, a73VarA2, null, null, null, false, null, 8111) : null));
        do {
            q0eVar = this.c;
            value2 = q0eVar.getValue();
        } while (!q0eVar.c(value2, f().a(this)));
        return z;
    }
}
