package defpackage;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class ge8 {
    public final i74 c;
    public final di6 d;
    public final q64 e;
    public long f;
    public int g;
    public boolean h;
    public be8 i;
    public be8 j;
    public be8 k;
    public int l;
    public Object m;
    public long n;
    public final hue a = new hue();
    public final kue b = new kue();
    public List o = new ArrayList();

    public ge8(i74 i74Var, bie bieVar, q64 q64Var) {
        this.c = i74Var;
        this.d = bieVar;
        this.e = q64Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.yj8 m(defpackage.mue r15, java.lang.Object r16, long r17, long r19, defpackage.kue r21, defpackage.hue r22) {
        /*
            r0 = r15
            r1 = r17
            r3 = r21
            r4 = r16
            r5 = r22
            r15.h(r4, r5)
            int r6 = r5.c
            r15.o(r6, r3)
            int r6 = r15.b(r16)
            r8 = r4
        L16:
            s8 r4 = r5.g
            int r4 = r4.b
            r7 = -1
            if (r4 == 0) goto L70
            r9 = 1
            r10 = 0
            if (r4 != r9) goto L27
            boolean r11 = r5.h(r10)
            if (r11 != 0) goto L70
        L27:
            s8 r11 = r5.g
            int r11 = r11.e
            boolean r11 = r5.i(r11)
            if (r11 == 0) goto L70
            r11 = 0
            int r13 = r5.c(r11)
            if (r13 == r7) goto L3a
            goto L70
        L3a:
            long r13 = r5.d
            int r13 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r13 != 0) goto L41
            goto L61
        L41:
            int r13 = r4 + (-1)
            boolean r13 = r5.h(r13)
            if (r13 == 0) goto L4b
            r13 = 2
            goto L4c
        L4b:
            r13 = r9
        L4c:
            int r4 = r4 - r13
        L4d:
            if (r10 > r4) goto L5b
            s8 r13 = r5.g
            q8 r13 = r13.a(r10)
            long r13 = r13.h
            long r11 = r11 + r13
            int r10 = r10 + 1
            goto L4d
        L5b:
            long r13 = r5.d
            int r4 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r4 > 0) goto L70
        L61:
            int r4 = r3.o
            if (r6 > r4) goto L70
            r15.g(r6, r5, r9)
            java.lang.Object r8 = r5.b
            r8.getClass()
            int r6 = r6 + 1
            goto L16
        L70:
            r15.h(r8, r5)
            int r9 = r5.c(r1)
            if (r9 != r7) goto L85
            int r0 = r5.b(r1)
            yj8 r1 = new yj8
            r2 = r19
            r1.<init>(r8, r2, r0)
            return r1
        L85:
            r2 = r19
            int r10 = r5.f(r9)
            yj8 r0 = new yj8
            r13 = -1
            r7 = r0
            r11 = r19
            r7.<init>(r8, r9, r10, r11, r13)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ge8.m(mue, java.lang.Object, long, long, kue, hue):yj8");
    }

    public final be8 a() {
        be8 be8Var = this.i;
        if (be8Var == null) {
            return null;
        }
        if (be8Var == this.j) {
            this.j = be8Var.l;
        }
        be8Var.g();
        int i = this.l - 1;
        this.l = i;
        if (i == 0) {
            this.k = null;
            be8 be8Var2 = this.i;
            this.m = be8Var2.b;
            this.n = be8Var2.f.a.d;
        }
        this.i = this.i.l;
        k();
        return this.i;
    }

    public final void b() {
        if (this.l == 0) {
            return;
        }
        be8 be8Var = this.i;
        fm9.l(be8Var);
        this.m = be8Var.b;
        this.n = be8Var.f.a.d;
        while (be8Var != null) {
            be8Var.g();
            be8Var = be8Var.l;
        }
        this.i = null;
        this.k = null;
        this.j = null;
        this.l = 0;
        k();
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.ee8 c(defpackage.mue r23, defpackage.be8 r24, long r25) {
        /*
            Method dump skipped, instructions count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ge8.c(mue, be8, long):ee8");
    }

    public final ee8 d(mue mueVar, be8 be8Var, long j) {
        ee8 ee8Var = be8Var.f;
        long j2 = (be8Var.o + ee8Var.e) - j;
        if (ee8Var.g) {
            return c(mueVar, be8Var, j2);
        }
        yj8 yj8Var = ee8Var.a;
        Object obj = yj8Var.a;
        hue hueVar = this.a;
        mueVar.h(obj, hueVar);
        boolean zB = yj8Var.b();
        Object obj2 = yj8Var.a;
        if (!zB) {
            int i = yj8Var.e;
            if (i != -1 && hueVar.h(i)) {
                return c(mueVar, be8Var, j2);
            }
            int iF = hueVar.f(i);
            boolean z = hueVar.i(i) && hueVar.e(i, iF) == 3;
            if (iF != hueVar.g.a(i).b && !z) {
                return f(mueVar, yj8Var.a, yj8Var.e, iF, ee8Var.e, yj8Var.d);
            }
            mueVar.h(obj2, hueVar);
            long jD = hueVar.d(i);
            return g(mueVar, yj8Var.a, jD == Long.MIN_VALUE ? hueVar.d : hueVar.g.a(i).h + jD, ee8Var.e, yj8Var.d);
        }
        s8 s8Var = hueVar.g;
        int i2 = yj8Var.b;
        int i3 = s8Var.a(i2).b;
        if (i3 != -1) {
            int iA = hueVar.g.a(i2).a(yj8Var.c);
            if (iA < i3) {
                return f(mueVar, yj8Var.a, i2, iA, ee8Var.c, yj8Var.d);
            }
            long jLongValue = ee8Var.c;
            if (jLongValue == -9223372036854775807L) {
                Pair pairK = mueVar.k(this.b, hueVar, hueVar.c, -9223372036854775807L, Math.max(0L, j2));
                if (pairK != null) {
                    jLongValue = ((Long) pairK.second).longValue();
                }
            }
            mueVar.h(obj2, hueVar);
            int i4 = yj8Var.b;
            long jD2 = hueVar.d(i4);
            return g(mueVar, yj8Var.a, Math.max(jD2 == Long.MIN_VALUE ? hueVar.d : hueVar.g.a(i4).h + jD2, jLongValue), ee8Var.c, yj8Var.d);
        }
        return null;
    }

    public final ee8 e(mue mueVar, yj8 yj8Var, long j, long j2) {
        mueVar.h(yj8Var.a, this.a);
        if (!yj8Var.b()) {
            return g(mueVar, yj8Var.a, j2, j, yj8Var.d);
        }
        return f(mueVar, yj8Var.a, yj8Var.b, yj8Var.c, j, yj8Var.d);
    }

    public final ee8 f(mue mueVar, Object obj, int i, int i2, long j, long j2) {
        yj8 yj8Var = new yj8(obj, i, i2, j2, -1);
        hue hueVar = this.a;
        long jA = mueVar.h(obj, hueVar).a(i, i2);
        long j3 = i2 == hueVar.f(i) ? hueVar.g.c : 0L;
        return new ee8(yj8Var, (jA == -9223372036854775807L || j3 < jA) ? j3 : Math.max(0L, jA - 1), j, -9223372036854775807L, jA, hueVar.i(i), false, false, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.ee8 g(defpackage.mue r27, java.lang.Object r28, long r29, long r31, long r33) {
        /*
            Method dump skipped, instructions count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ge8.g(mue, java.lang.Object, long, long, long):ee8");
    }

    public final ee8 h(mue mueVar, ee8 ee8Var) {
        yj8 yj8Var = ee8Var.a;
        boolean zB = yj8Var.b();
        int i = yj8Var.e;
        boolean z = !zB && i == -1;
        boolean zJ = j(mueVar, yj8Var);
        boolean zI = i(mueVar, yj8Var, z);
        Object obj = ee8Var.a.a;
        hue hueVar = this.a;
        mueVar.h(obj, hueVar);
        long jD = (yj8Var.b() || i == -1) ? -9223372036854775807L : hueVar.d(i);
        boolean zB2 = yj8Var.b();
        int i2 = yj8Var.b;
        return new ee8(yj8Var, ee8Var.b, ee8Var.c, jD, zB2 ? hueVar.a(i2, yj8Var.c) : (jD == -9223372036854775807L || jD == Long.MIN_VALUE) ? hueVar.d : jD, yj8Var.b() ? hueVar.i(i2) : i != -1 && hueVar.i(i), z, zJ, zI);
    }

    public final boolean i(mue mueVar, yj8 yj8Var, boolean z) {
        int iB = mueVar.b(yj8Var.a);
        if (mueVar.n(mueVar.g(iB, this.a, false).c, this.b, 0L).i) {
            return false;
        }
        return mueVar.d(iB, this.a, this.b, this.g, this.h) == -1 && z;
    }

    public final boolean j(mue mueVar, yj8 yj8Var) {
        if (!(!yj8Var.b() && yj8Var.e == -1)) {
            return false;
        }
        Object obj = yj8Var.a;
        return mueVar.n(mueVar.h(obj, this.a).c, this.b, 0L).o == mueVar.b(obj);
    }

    public final void k() {
        ww6 ww6VarI = zw6.i();
        for (be8 be8Var = this.i; be8Var != null; be8Var = be8Var.l) {
            ww6VarI.a(be8Var.f.a);
        }
        be8 be8Var2 = this.j;
        ((bie) this.d).d(new v05(this, ww6VarI, be8Var2 == null ? null : be8Var2.f.a, 12));
    }

    public final boolean l(be8 be8Var) {
        fm9.l(be8Var);
        boolean z = false;
        if (be8Var.equals(this.k)) {
            return false;
        }
        this.k = be8Var;
        while (true) {
            be8Var = be8Var.l;
            if (be8Var == null) {
                break;
            }
            if (be8Var == this.j) {
                this.j = this.i;
                z = true;
            }
            be8Var.g();
            this.l--;
        }
        be8 be8Var2 = this.k;
        be8Var2.getClass();
        if (be8Var2.l != null) {
            be8Var2.b();
            be8Var2.l = null;
            be8Var2.c();
        }
        k();
        return z;
    }

    public final yj8 n(mue mueVar, Object obj, long j) {
        long jO;
        int iB;
        Object obj2 = obj;
        hue hueVar = this.a;
        int i = mueVar.h(obj2, hueVar).c;
        Object obj3 = this.m;
        if (obj3 == null || (iB = mueVar.b(obj3)) == -1 || mueVar.g(iB, hueVar, false).c != i) {
            be8 be8Var = this.i;
            while (true) {
                if (be8Var == null) {
                    be8 be8Var2 = this.i;
                    while (true) {
                        if (be8Var2 != null) {
                            int iB2 = mueVar.b(be8Var2.b);
                            if (iB2 != -1 && mueVar.g(iB2, hueVar, false).c == i) {
                                jO = be8Var2.f.a.d;
                                break;
                            }
                            be8Var2 = be8Var2.l;
                        } else {
                            jO = o(obj2);
                            if (jO == -1) {
                                jO = this.f;
                                this.f = 1 + jO;
                                if (this.i == null) {
                                    this.m = obj2;
                                    this.n = jO;
                                }
                            }
                        }
                    }
                } else {
                    if (be8Var.b.equals(obj2)) {
                        jO = be8Var.f.a.d;
                        break;
                    }
                    be8Var = be8Var.l;
                }
            }
        } else {
            jO = this.n;
        }
        mueVar.h(obj2, hueVar);
        int i2 = hueVar.c;
        kue kueVar = this.b;
        mueVar.o(i2, kueVar);
        boolean z = false;
        for (int iB3 = mueVar.b(obj); iB3 >= kueVar.n; iB3--) {
            mueVar.g(iB3, hueVar, true);
            boolean z2 = hueVar.g.b > 0;
            z |= z2;
            if (hueVar.c(hueVar.d) != -1) {
                obj2 = hueVar.b;
                obj2.getClass();
            }
            if (z && (!z2 || hueVar.d != 0)) {
                break;
            }
        }
        return m(mueVar, obj2, j, jO, this.b, this.a);
    }

    public final long o(Object obj) {
        for (int i = 0; i < this.o.size(); i++) {
            be8 be8Var = (be8) this.o.get(i);
            if (be8Var.b.equals(obj)) {
                return be8Var.f.a.d;
            }
        }
        return -1L;
    }

    public final boolean p(mue mueVar) {
        be8 be8Var;
        be8 be8Var2 = this.i;
        if (be8Var2 == null) {
            return true;
        }
        int iB = mueVar.b(be8Var2.b);
        while (true) {
            iB = mueVar.d(iB, this.a, this.b, this.g, this.h);
            while (true) {
                be8Var2.getClass();
                be8Var = be8Var2.l;
                if (be8Var == null || be8Var2.f.g) {
                    break;
                }
                be8Var2 = be8Var;
            }
            if (iB == -1 || be8Var == null || mueVar.b(be8Var.b) != iB) {
                break;
            }
            be8Var2 = be8Var;
        }
        boolean zL = l(be8Var2);
        be8Var2.f = h(mueVar, be8Var2.f);
        return !zL;
    }

    public final boolean q(mue mueVar, long j, long j2) {
        ee8 ee8VarH;
        be8 be8Var = this.i;
        be8 be8Var2 = null;
        while (be8Var != null) {
            ee8 ee8Var = be8Var.f;
            if (be8Var2 == null) {
                ee8VarH = h(mueVar, ee8Var);
            } else {
                ee8 ee8VarD = d(mueVar, be8Var2, j);
                if (ee8VarD == null) {
                    return !l(be8Var2);
                }
                if (ee8Var.b != ee8VarD.b || !ee8Var.a.equals(ee8VarD.a)) {
                    return !l(be8Var2);
                }
                ee8VarH = ee8VarD;
            }
            be8Var.f = ee8VarH.a(ee8Var.c);
            long j3 = ee8Var.e;
            if (j3 != -9223372036854775807L) {
                long j4 = ee8VarH.e;
                if (j3 != j4) {
                    be8Var.i();
                    return (l(be8Var) || (be8Var == this.j && !be8Var.f.f && ((j2 > Long.MIN_VALUE ? 1 : (j2 == Long.MIN_VALUE ? 0 : -1)) == 0 || (j2 > ((j4 > (-9223372036854775807L) ? 1 : (j4 == (-9223372036854775807L) ? 0 : -1)) == 0 ? Long.MAX_VALUE : be8Var.o + j4) ? 1 : (j2 == ((j4 > (-9223372036854775807L) ? 1 : (j4 == (-9223372036854775807L) ? 0 : -1)) == 0 ? Long.MAX_VALUE : be8Var.o + j4) ? 0 : -1)) >= 0))) ? false : true;
                }
            }
            be8Var2 = be8Var;
            be8Var = be8Var.l;
        }
        return true;
    }
}
