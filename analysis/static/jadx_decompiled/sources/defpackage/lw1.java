package defpackage;

import android.content.Context;
import android.util.Range;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class lw1 {
    public static final jw1 D = new jw1();
    public final HashSet A;
    public final Context B;
    public final HashMap C;
    public px1 a;
    public int b;
    public h8b c;
    public fu6 d;
    public pt6 e;
    public rdf f;
    public cdc g;
    public final HashMap h;
    public b9b i;
    public final eu4 j;
    public final eu4 k;
    public final Range l;
    public hg7 m;
    public l9b n;
    public uof o;
    public g8b p;
    public final k8g q;
    public final ync r;
    public final boolean s;
    public boolean t;
    public final l06 u;
    public final l06 v;
    public final ci9 w;
    public final fd7 x;
    public final fd7 y;
    public final fd7 z;

    public lw1(Context context) {
        int i = 15;
        k9b k9bVar = k9b.f;
        k12 k12VarP = s36.p(context);
        mu1 mu1Var = new mu1(5);
        k12 k12VarK = kq0.K(k12VarP, new re6(i, mu1Var), ju0.k());
        this.a = px1.c;
        this.b = 3;
        this.g = null;
        this.h = new HashMap();
        this.i = adc.j0;
        eu4 eu4Var = eu4.c;
        this.j = eu4Var;
        this.k = eu4Var;
        this.l = vb0.f;
        this.s = true;
        this.t = true;
        this.u = new l06();
        this.v = new l06();
        this.w = new ci9(0);
        this.x = new fd7();
        this.y = new fd7();
        this.z = new fd7();
        this.A = new HashSet();
        this.C = new HashMap();
        Context contextN = lz7.n(context);
        this.B = contextN;
        mt6 mt6Var = new mt6(2);
        c(mt6Var);
        eu4 eu4Var2 = this.k;
        mt6Var.b.j(tu6.A, eu4Var2);
        this.c = mt6Var.b();
        mt6 mt6Var2 = new mt6(1);
        c(mt6Var2);
        this.d = mt6Var2.a();
        this.e = d(null, null, null);
        this.f = e();
        ig7 ig7Var = (ig7) this;
        iw1 iw1Var = new iw1(0, ig7Var);
        kq0.K(k12VarK, new re6(i, iw1Var), ju0.D());
        this.q = new k8g(contextN);
        this.r = new ync(28, ig7Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(defpackage.g8b r7, defpackage.uof r8) {
        /*
            r6 = this;
            defpackage.kq0.e()
            g8b r0 = r6.p
            if (r0 == r7) goto Le
            r6.p = r7
            h8b r0 = r6.c
            r0.G(r7)
        Le:
            uof r7 = r6.o
            r0 = 0
            if (r7 == 0) goto L37
            int r7 = r6.g(r8)
            r1 = -1
            if (r7 == r1) goto L21
            fm5 r2 = new fm5
            r3 = 1
            r2.<init>(r7, r3)
            goto L22
        L21:
            r2 = r0
        L22:
            uof r7 = r6.o
            int r7 = r6.g(r7)
            if (r7 == r1) goto L31
            fm5 r1 = new fm5
            r3 = 1
            r1.<init>(r7, r3)
            goto L32
        L31:
            r1 = r0
        L32:
            if (r2 == r1) goto L35
            goto L37
        L35:
            r7 = 0
            goto L38
        L37:
            r7 = 1
        L38:
            r6.o = r8
            k8g r8 = r6.q
            zh6 r1 = defpackage.ju0.D()
            ync r2 = r6.r
            java.lang.Object r3 = r8.a
            monitor-enter(r3)
            java.lang.Object r4 = r8.b     // Catch: java.lang.Throwable -> L51
            bnc r4 = (defpackage.bnc) r4     // Catch: java.lang.Throwable -> L51
            boolean r4 = r4.canDetectOrientation()     // Catch: java.lang.Throwable -> L51
            if (r4 != 0) goto L53
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L51
            goto L67
        L51:
            r6 = move-exception
            goto L70
        L53:
            java.lang.Object r4 = r8.c     // Catch: java.lang.Throwable -> L51
            java.util.HashMap r4 = (java.util.HashMap) r4     // Catch: java.lang.Throwable -> L51
            cnc r5 = new cnc     // Catch: java.lang.Throwable -> L51
            r5.<init>(r2, r1)     // Catch: java.lang.Throwable -> L51
            r4.put(r2, r5)     // Catch: java.lang.Throwable -> L51
            java.lang.Object r8 = r8.b     // Catch: java.lang.Throwable -> L51
            bnc r8 = (defpackage.bnc) r8     // Catch: java.lang.Throwable -> L51
            r8.enable()     // Catch: java.lang.Throwable -> L51
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L51
        L67:
            if (r7 == 0) goto L6c
            r6.r()
        L6c:
            r6.q(r0)
            return
        L70:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L51
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lw1.a(g8b, uof):void");
    }

    public final void b() {
        kq0.e();
        l9b l9bVar = this.n;
        if (l9bVar != null) {
            l9bVar.a(this.c, this.d, this.e, this.f);
        }
        this.c.G(null);
        this.m = null;
        this.p = null;
        this.o = null;
        k8g k8gVar = this.q;
        ync yncVar = this.r;
        synchronized (k8gVar.a) {
            try {
                cnc cncVar = (cnc) ((HashMap) k8gVar.c).get(yncVar);
                if (cncVar != null) {
                    cncVar.c.set(false);
                    ((HashMap) k8gVar.c).remove(yncVar);
                }
                if (((HashMap) k8gVar.c).isEmpty()) {
                    ((bnc) k8gVar.b).disable();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(mt6 mt6Var) {
        uof uofVar = this.o;
        if (uofVar != null) {
            int iG = g(uofVar);
            fm5 fm5Var = iG != -1 ? new fm5(iG, 1) : null;
            if (fm5Var != null) {
                mt6Var.c(new kic(fm5Var, null, 0));
            }
        }
    }

    public final pt6 d(Integer num, Integer num2, Integer num3) {
        mt6 mt6Var = new mt6(0);
        mi9 mi9Var = mt6Var.b;
        if (num != null) {
            mi9Var.j(st6.b, num);
        }
        if (num2 != null) {
            mi9Var.j(st6.c, num2);
        }
        if (num3 != null) {
            mi9Var.j(st6.X, num3);
        }
        c(mt6Var);
        st6 st6Var = new st6(wma.a(mi9Var));
        ev6.e0(st6Var);
        return new pt6(st6Var);
    }

    public final rdf e() {
        int iG;
        av1 av1Var = adc.n0;
        nw4 nw4VarA = ab0.a();
        b9b b9bVar = this.i;
        c54.o(b9bVar, "The specified quality selector can't be null.");
        mc0 mc0Var = (mc0) nw4VarA.b;
        if (mc0Var == null) {
            throw new IllegalStateException("Property \"videoSpec\" has not been set");
        }
        lc0 lc0Var = new lc0();
        lc0Var.a = mc0Var.a;
        lc0Var.b = mc0Var.b;
        lc0Var.c = mc0Var.c;
        lc0Var.d = Integer.valueOf(mc0Var.d);
        lc0Var.a = b9bVar;
        nw4VarA.b = lc0Var.a();
        uof uofVar = this.o;
        if (uofVar != null && this.i == adc.j0 && (iG = g(uofVar)) != -1) {
            mc0 mc0Var2 = (mc0) nw4VarA.b;
            if (mc0Var2 == null) {
                throw new IllegalStateException("Property \"videoSpec\" has not been set");
            }
            lc0 lc0Var2 = new lc0();
            lc0Var2.a = mc0Var2.a;
            lc0Var2.b = mc0Var2.b;
            lc0Var2.c = mc0Var2.c;
            lc0Var2.d = Integer.valueOf(mc0Var2.d);
            lc0Var2.d = Integer.valueOf(iG);
            nw4VarA.b = lc0Var2.a();
        }
        mt6 mt6Var = new mt6(new adc(null, nw4VarA.f(), av1Var, av1Var));
        aa0 aa0Var = o9f.l0;
        Range range = this.l;
        mi9 mi9Var = mt6Var.b;
        mi9Var.j(aa0Var, range);
        mi9Var.j(ev6.E, 0);
        mi9Var.j(tu6.A, this.j);
        return new rdf(new sdf(wma.a(mi9Var)));
    }

    public final dvc f() {
        cvc cvcVar = cvc.b;
        HashMap map = this.C;
        if (map.get(cvcVar) != null) {
            return (dvc) map.get(cvcVar);
        }
        cvc cvcVar2 = cvc.a;
        if (map.get(cvcVar2) != null) {
            return (dvc) map.get(cvcVar2);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int g(defpackage.uof r6) {
        /*
            r5 = this;
            r0 = 0
            if (r6 != 0) goto L5
            r1 = r0
            goto Lb
        L5:
            int r1 = r6.c
            int r1 = defpackage.kp.C(r1)
        Lb:
            l9b r2 = r5.n
            if (r2 != 0) goto L11
            r2 = r0
            goto L1f
        L11:
            px1 r3 = r5.a
            k9b r2 = r2.a
            fjc r2 = r2.e(r3)
            yw1 r2 = r2.a
            int r2 = r2.b()
        L1f:
            l9b r3 = r5.n
            r4 = 1
            if (r3 != 0) goto L26
        L24:
            r5 = r4
            goto L38
        L26:
            px1 r5 = r5.a
            k9b r3 = r3.a
            fjc r5 = r3.e(r5)
            yw1 r5 = r5.a
            int r5 = r5.g()
            if (r5 != r4) goto L37
            goto L24
        L37:
            r5 = r0
        L38:
            int r5 = defpackage.kp.m(r1, r2, r5)
            android.util.Rational r6 = r6.b
            r1 = 90
            if (r5 == r1) goto L46
            r1 = 270(0x10e, float:3.78E-43)
            if (r5 != r1) goto L54
        L46:
            android.util.Rational r5 = new android.util.Rational
            int r1 = r6.getDenominator()
            int r6 = r6.getNumerator()
            r5.<init>(r1, r6)
            r6 = r5
        L54:
            android.util.Rational r5 = new android.util.Rational
            r1 = 4
            r2 = 3
            r5.<init>(r1, r2)
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L62
            return r0
        L62:
            android.util.Rational r5 = new android.util.Rational
            r0 = 16
            r1 = 9
            r5.<init>(r0, r1)
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L72
            return r4
        L72:
            r5 = -1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lw1.g(uof):int");
    }

    public final boolean h() {
        return this.m != null;
    }

    public final boolean i() {
        return this.n != null;
    }

    public final void j(l9b l9bVar) {
        this.n = l9bVar;
        r();
        q(null);
    }

    public final void k(px1 px1Var) {
        kq0.e();
        if (this.a == px1Var) {
            return;
        }
        Integer numB = px1Var.b();
        if (this.d.H() == 3 && numB != null && numB.intValue() != 0) {
            throw new IllegalStateException("Not a front camera despite setting FLASH_MODE_SCREEN");
        }
        px1 px1Var2 = this.a;
        this.a = px1Var;
        l9b l9bVar = this.n;
        if (l9bVar == null) {
            return;
        }
        l9bVar.a(this.c, this.d, this.e, this.f);
        q(new wt1((ig7) this, 5, px1Var2));
    }

    public final void l(int i) {
        kq0.e();
        int i2 = this.b;
        if (i == i2) {
            return;
        }
        this.b = i;
        kq0.e();
        if ((this.b & 4) == 0) {
            kq0.e();
            cdc cdcVar = this.g;
            if (cdcVar != null && !cdcVar.a.get()) {
                kq0.e();
                cdc cdcVar2 = this.g;
                if (cdcVar2 != null) {
                    cdcVar2.close();
                    this.g = null;
                }
            }
        }
        q(new l40(i2, 5, (ig7) this));
    }

    public final void m(int i) {
        kq0.e();
        if (i == 3) {
            Integer numB = this.a.b();
            if (numB != null && numB.intValue() != 0) {
                throw new IllegalArgumentException("Not a front camera despite setting FLASH_MODE_SCREEN");
            }
            dvc dvcVarF = f();
            if (dvcVarF == null) {
                fu6 fu6Var = this.d;
                jw1 jw1Var = D;
                fu6Var.getClass();
                gvc gvcVar = new gvc(jw1Var);
                fu6Var.u = gvcVar;
                fu6Var.d().g(gvcVar);
            } else {
                fu6 fu6Var2 = this.d;
                fu6Var2.getClass();
                gvc gvcVar2 = new gvc(dvcVarF.b);
                fu6Var2.u = gvcVar2;
                fu6Var2.d().g(gvcVar2);
                dvcVarF.a.name();
            }
        }
        fu6 fu6Var3 = this.d;
        fu6Var3.getClass();
        if (i != 0 && i != 1 && i != 2) {
            if (i != 3) {
                throw new IllegalArgumentException(zr6.h(i, "Invalid flash mode: "));
            }
            if (fu6Var3.u.a == null) {
                throw new IllegalArgumentException("ScreenFlash not set for FLASH_MODE_SCREEN");
            }
            if (fu6Var3.c() != null) {
                ax1 ax1VarC = fu6Var3.c();
                if ((ax1VarC != null ? ax1VarC.p().g() : -1) != 0) {
                    throw new IllegalArgumentException("Not a front camera despite setting FLASH_MODE_SCREEN");
                }
            }
        }
        synchronized (fu6Var3.q) {
            fu6Var3.s = i;
            fu6Var3.K();
        }
    }

    public final void n(b9b b9bVar) {
        kq0.e();
        this.i = b9bVar;
        if (i()) {
            this.n.a(this.f);
        }
        this.f = e();
        q(null);
    }

    public final bm7 o(float f) {
        kq0.e();
        if (h()) {
            return ((hw1) this.m.c.B0.d).d(f);
        }
        return this.z.M(Float.valueOf(f));
    }

    public abstract hg7 p();

    public final void q(Runnable runnable) {
        an8 an8Var;
        an8 an8Var2;
        try {
            this.m = p();
            if (h()) {
                xm7 xm7VarR = this.m.c.C0.b.r();
                l06 l06Var = this.u;
                xm7 xm7Var = l06Var.m;
                if (xm7Var != null && (an8Var2 = (an8) l06Var.l.c(xm7Var)) != null) {
                    an8Var2.a.j(an8Var2);
                }
                l06Var.m = xm7VarR;
                l06Var.l(xm7VarR, new gu1(2, l06Var));
                xm7 xm7VarE = this.m.c.C0.b.e();
                l06 l06Var2 = this.v;
                xm7 xm7Var2 = l06Var2.m;
                if (xm7Var2 != null && (an8Var = (an8) l06Var2.l.c(xm7Var2)) != null) {
                    an8Var.a.j(an8Var);
                }
                l06Var2.m = xm7VarE;
                l06Var2.l(xm7VarE, new gu1(2, l06Var2));
                fd7 fd7Var = this.x;
                fd7Var.getClass();
                kq0.e();
                mpa mpaVar = (mpa) fd7Var.a;
                if (mpaVar != null) {
                    Boolean bool = (Boolean) mpaVar.b;
                    boolean zBooleanValue = bool.booleanValue();
                    kq0.e();
                    bm7 bm7VarM = !h() ? fd7Var.M(bool) : ((hw1) this.m.c.B0.d).k(zBooleanValue);
                    lq1 lq1Var = (lq1) ((mpa) fd7Var.a).a;
                    Objects.requireNonNull(lq1Var);
                    kq0.y(bm7VarM, lq1Var);
                    fd7Var.a = null;
                }
                fd7 fd7Var2 = this.y;
                fd7Var2.getClass();
                kq0.e();
                mpa mpaVar2 = (mpa) fd7Var2.a;
                if (mpaVar2 != null) {
                    Float f = (Float) mpaVar2.b;
                    float fFloatValue = f.floatValue();
                    kq0.e();
                    bm7 bm7VarM2 = !h() ? fd7Var2.M(f) : ((hw1) this.m.c.B0.d).b(fFloatValue);
                    lq1 lq1Var2 = (lq1) ((mpa) fd7Var2.a).a;
                    Objects.requireNonNull(lq1Var2);
                    kq0.y(bm7VarM2, lq1Var2);
                    fd7Var2.a = null;
                }
                fd7 fd7Var3 = this.z;
                fd7Var3.getClass();
                kq0.e();
                mpa mpaVar3 = (mpa) fd7Var3.a;
                if (mpaVar3 != null) {
                    bm7 bm7VarO = o(((Float) mpaVar3.b).floatValue());
                    lq1 lq1Var3 = (lq1) ((mpa) fd7Var3.a).a;
                    Objects.requireNonNull(lq1Var3);
                    kq0.y(bm7VarO, lq1Var3);
                    fd7Var3.a = null;
                }
            }
        } catch (RuntimeException e) {
            if (runnable != null) {
                runnable.run();
            }
            throw e;
        }
    }

    public final void r() {
        if (i()) {
            this.n.a(this.c);
        }
        mt6 mt6Var = new mt6(2);
        c(mt6Var);
        mt6Var.b.j(tu6.A, this.k);
        h8b h8bVarB = mt6Var.b();
        this.c = h8bVarB;
        g8b g8bVar = this.p;
        if (g8bVar != null) {
            h8bVarB.G(g8bVar);
        }
        kq0.e();
        Integer numValueOf = Integer.valueOf(this.d.p);
        if (i()) {
            this.n.a(this.d);
        }
        int iH = this.d.H();
        mt6 mt6Var2 = new mt6(1);
        mt6Var2.b.j(gu6.b, numValueOf);
        c(mt6Var2);
        this.d = mt6Var2.a();
        m(iH);
        Integer num = (Integer) ((st6) this.e.f).f(st6.b, 0);
        num.intValue();
        Integer num2 = (Integer) ((st6) this.e.f).f(st6.c, 6);
        num2.intValue();
        Integer numValueOf2 = Integer.valueOf(this.e.G());
        kq0.e();
        if (i()) {
            this.n.a(this.e);
        }
        this.e = d(num, num2, numValueOf2);
        if (i()) {
            this.n.a(this.f);
        }
        this.f = e();
    }
}
