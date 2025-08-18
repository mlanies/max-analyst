package defpackage;

import android.os.Handler;

/* loaded from: classes.dex */
public final class fe8 {
    public final gue a = new gue();
    public final jue b = new jue();
    public final h74 c;
    public final Handler d;
    public long e;
    public int f;
    public boolean g;
    public ae8 h;
    public ae8 i;
    public ae8 j;
    public int k;
    public Object l;
    public long m;

    public fe8(h74 h74Var, Handler handler) {
        this.c = h74Var;
        this.d = handler;
    }

    public static xj8 l(lue lueVar, Object obj, long j, long j2, jue jueVar, gue gueVar) {
        lueVar.h(obj, gueVar);
        lueVar.o(gueVar.c, jueVar);
        int iB = lueVar.b(obj);
        Object obj2 = obj;
        while (gueVar.o == 0) {
            r8 r8Var = gueVar.Z;
            if (r8Var.a <= 0 || !gueVar.g(r8Var.o) || gueVar.c(0L) != -1) {
                break;
            }
            int i = iB + 1;
            if (iB >= jueVar.A0) {
                break;
            }
            lueVar.g(i, gueVar, true);
            obj2 = gueVar.b;
            obj2.getClass();
            iB = i;
        }
        lueVar.h(obj2, gueVar);
        int iC = gueVar.c(j);
        return iC == -1 ? new xj8(obj2, j2, gueVar.b(j)) : new xj8(obj2, iC, gueVar.e(iC), j2, -1);
    }

    public final ae8 a() {
        ae8 ae8Var = this.h;
        if (ae8Var == null) {
            return null;
        }
        if (ae8Var == this.i) {
            this.i = ae8Var.l;
        }
        ae8Var.f();
        int i = this.k - 1;
        this.k = i;
        if (i == 0) {
            this.j = null;
            ae8 ae8Var2 = this.h;
            this.l = ae8Var2.b;
            this.m = ae8Var2.f.a.d;
        }
        this.h = this.h.l;
        j();
        return this.h;
    }

    public final void b() {
        if (this.k == 0) {
            return;
        }
        ae8 ae8Var = this.h;
        np8.g(ae8Var);
        this.l = ae8Var.b;
        this.m = ae8Var.f.a.d;
        while (ae8Var != null) {
            ae8Var.f();
            ae8Var = ae8Var.l;
        }
        this.h = null;
        this.j = null;
        this.i = null;
        this.k = 0;
        j();
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.de8 c(defpackage.lue r24, defpackage.ae8 r25, long r26) {
        /*
            Method dump skipped, instructions count: 481
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fe8.c(lue, ae8, long):de8");
    }

    public final de8 d(lue lueVar, xj8 xj8Var, long j, long j2) {
        lueVar.h(xj8Var.a, this.a);
        if (!xj8Var.a()) {
            return f(lueVar, xj8Var.a, j2, j, xj8Var.d);
        }
        return e(lueVar, xj8Var.a, xj8Var.b, xj8Var.c, j, xj8Var.d);
    }

    public final de8 e(lue lueVar, Object obj, int i, int i2, long j, long j2) {
        xj8 xj8Var = new xj8(obj, i, i2, j2, -1);
        gue gueVar = this.a;
        long jA = lueVar.h(obj, gueVar).a(i, i2);
        long j3 = i2 == gueVar.e(i) ? gueVar.Z.b : 0L;
        return new de8(xj8Var, (jA == -9223372036854775807L || j3 < jA) ? j3 : Math.max(0L, jA - 1), j, -9223372036854775807L, jA, gueVar.g(i), false, false, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.de8 f(defpackage.lue r26, java.lang.Object r27, long r28, long r30, long r32) {
        /*
            Method dump skipped, instructions count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fe8.f(lue, java.lang.Object, long, long, long):de8");
    }

    public final de8 g(lue lueVar, de8 de8Var) {
        xj8 xj8Var = de8Var.a;
        boolean zA = xj8Var.a();
        int i = xj8Var.e;
        boolean z = !zA && i == -1;
        boolean zI = i(lueVar, xj8Var);
        boolean zH = h(lueVar, xj8Var, z);
        Object obj = de8Var.a.a;
        gue gueVar = this.a;
        lueVar.h(obj, gueVar);
        long j = (xj8Var.a() || i == -1) ? -9223372036854775807L : gueVar.Z.a(i).a;
        boolean zA2 = xj8Var.a();
        int i2 = xj8Var.b;
        return new de8(xj8Var, de8Var.b, de8Var.c, j, zA2 ? gueVar.a(i2, xj8Var.c) : (j == -9223372036854775807L || j == Long.MIN_VALUE) ? gueVar.o : j, xj8Var.a() ? gueVar.g(i2) : i != -1 && gueVar.g(i), z, zI, zH);
    }

    public final boolean h(lue lueVar, xj8 xj8Var, boolean z) {
        int iB = lueVar.b(xj8Var.a);
        if (lueVar.n(lueVar.g(iB, this.a, false).c, this.b, 0L).t0) {
            return false;
        }
        return lueVar.d(iB, this.a, this.b, this.f, this.g) == -1 && z;
    }

    public final boolean i(lue lueVar, xj8 xj8Var) {
        if (!(!xj8Var.a() && xj8Var.e == -1)) {
            return false;
        }
        Object obj = xj8Var.a;
        return lueVar.n(lueVar.h(obj, this.a).c, this.b, 0L).A0 == lueVar.b(obj);
    }

    public final void j() {
        ww6 ww6VarI = zw6.i();
        for (ae8 ae8Var = this.h; ae8Var != null; ae8Var = ae8Var.l) {
            ww6VarI.a(ae8Var.f.a);
        }
        ae8 ae8Var2 = this.i;
        this.d.post(new v05(this, ww6VarI, ae8Var2 == null ? null : ae8Var2.f.a, 11));
    }

    public final boolean k(ae8 ae8Var) {
        boolean z = false;
        np8.f(ae8Var != null);
        if (ae8Var.equals(this.j)) {
            return false;
        }
        this.j = ae8Var;
        while (true) {
            ae8Var = ae8Var.l;
            if (ae8Var == null) {
                break;
            }
            if (ae8Var == this.i) {
                this.i = this.h;
                z = true;
            }
            ae8Var.f();
            this.k--;
        }
        ae8 ae8Var2 = this.j;
        if (ae8Var2.l != null) {
            ae8Var2.b();
            ae8Var2.l = null;
            ae8Var2.c();
        }
        j();
        return z;
    }

    public final xj8 m(lue lueVar, Object obj, long j) {
        long j2;
        int iB;
        Object obj2 = obj;
        gue gueVar = this.a;
        int i = lueVar.h(obj2, gueVar).c;
        Object obj3 = this.l;
        if (obj3 == null || (iB = lueVar.b(obj3)) == -1 || lueVar.g(iB, gueVar, false).c != i) {
            ae8 ae8Var = this.h;
            while (true) {
                if (ae8Var == null) {
                    ae8 ae8Var2 = this.h;
                    while (true) {
                        if (ae8Var2 != null) {
                            int iB2 = lueVar.b(ae8Var2.b);
                            if (iB2 != -1 && lueVar.g(iB2, gueVar, false).c == i) {
                                j2 = ae8Var2.f.a.d;
                                break;
                            }
                            ae8Var2 = ae8Var2.l;
                        } else {
                            j2 = this.e;
                            this.e = 1 + j2;
                            if (this.h == null) {
                                this.l = obj2;
                                this.m = j2;
                            }
                        }
                    }
                } else {
                    if (ae8Var.b.equals(obj2)) {
                        j2 = ae8Var.f.a.d;
                        break;
                    }
                    ae8Var = ae8Var.l;
                }
            }
        } else {
            j2 = this.m;
        }
        lueVar.h(obj2, gueVar);
        int i2 = gueVar.c;
        jue jueVar = this.b;
        lueVar.o(i2, jueVar);
        boolean z = false;
        for (int iB3 = lueVar.b(obj); iB3 >= jueVar.z0; iB3--) {
            lueVar.g(iB3, gueVar, true);
            boolean z2 = gueVar.Z.a > 0;
            z |= z2;
            if (gueVar.c(gueVar.o) != -1) {
                obj2 = gueVar.b;
                obj2.getClass();
            }
            if (z && (!z2 || gueVar.o != 0)) {
                break;
            }
        }
        return l(lueVar, obj2, j, j2, this.b, this.a);
    }

    public final boolean n(lue lueVar) {
        ae8 ae8Var;
        ae8 ae8Var2 = this.h;
        if (ae8Var2 == null) {
            return true;
        }
        int iB = lueVar.b(ae8Var2.b);
        while (true) {
            iB = lueVar.d(iB, this.a, this.b, this.f, this.g);
            while (true) {
                ae8Var = ae8Var2.l;
                if (ae8Var == null || ae8Var2.f.g) {
                    break;
                }
                ae8Var2 = ae8Var;
            }
            if (iB == -1 || ae8Var == null || lueVar.b(ae8Var.b) != iB) {
                break;
            }
            ae8Var2 = ae8Var;
        }
        boolean zK = k(ae8Var2);
        ae8Var2.f = g(lueVar, ae8Var2.f);
        return !zK;
    }

    public final boolean o(lue lueVar, long j, long j2) {
        de8 de8VarG;
        ae8 ae8Var = this.h;
        ae8 ae8Var2 = null;
        while (ae8Var != null) {
            de8 de8Var = ae8Var.f;
            if (ae8Var2 == null) {
                de8VarG = g(lueVar, de8Var);
            } else {
                de8 de8VarC = c(lueVar, ae8Var2, j);
                if (de8VarC == null) {
                    return !k(ae8Var2);
                }
                if (de8Var.b != de8VarC.b || !de8Var.a.equals(de8VarC.a)) {
                    return !k(ae8Var2);
                }
                de8VarG = de8VarC;
            }
            ae8Var.f = de8VarG.a(de8Var.c);
            long j3 = de8Var.e;
            if (j3 != -9223372036854775807L) {
                long j4 = de8VarG.e;
                if (j3 != j4) {
                    ae8Var.h();
                    return (k(ae8Var) || (ae8Var == this.i && !ae8Var.f.f && ((j2 > Long.MIN_VALUE ? 1 : (j2 == Long.MIN_VALUE ? 0 : -1)) == 0 || (j2 > ((j4 > (-9223372036854775807L) ? 1 : (j4 == (-9223372036854775807L) ? 0 : -1)) == 0 ? Long.MAX_VALUE : ae8Var.o + j4) ? 1 : (j2 == ((j4 > (-9223372036854775807L) ? 1 : (j4 == (-9223372036854775807L) ? 0 : -1)) == 0 ? Long.MAX_VALUE : ae8Var.o + j4) ? 0 : -1)) >= 0))) ? false : true;
                }
            }
            ae8Var2 = ae8Var;
            ae8Var = ae8Var.l;
        }
        return true;
    }
}
