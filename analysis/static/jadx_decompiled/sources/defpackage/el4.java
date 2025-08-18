package defpackage;

import android.os.StatFs;
import android.os.SystemClock;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public final class el4 implements lg5 {
    public static final long n = TimeUnit.HOURS.toMillis(2);
    public static final long o = TimeUnit.MINUTES.toMillis(30);
    public final long a;
    public final long b;
    public long c;
    public final HashSet d;
    public long e;
    public final d0e f;
    public final dl4 g;
    public final pq9 h;
    public final lq9 i;
    public final boolean j;
    public final dw0 k;
    public final qx7 l;
    public final Object m = new Object();

    public el4(cu4 cu4Var, pq9 pq9Var, l7 l7Var, mq9 mq9Var, lq9 lq9Var, ExecutorService executorService) {
        d0e d0eVar;
        this.a = l7Var.b;
        long j = l7Var.c;
        this.b = j;
        this.c = j;
        d0e d0eVar2 = d0e.h;
        synchronized (d0e.class) {
            try {
                if (d0e.h == null) {
                    d0e.h = new d0e();
                }
                d0eVar = d0e.h;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f = d0eVar;
        this.g = cu4Var;
        this.h = pq9Var;
        this.e = -1L;
        this.i = lq9Var;
        dw0 dw0Var = new dw0();
        dw0Var.a = false;
        dw0Var.b = -1L;
        dw0Var.c = -1L;
        this.k = dw0Var;
        this.l = qx7.Y;
        this.j = false;
        this.d = new HashSet();
        new CountDownLatch(0);
    }

    public final void a() {
        synchronized (this.m) {
            try {
                this.g.e();
                this.d.clear();
            } catch (IOException | NullPointerException e) {
                lq9 lq9Var = this.i;
                e.getMessage();
                lq9Var.getClass();
            }
            dw0 dw0Var = this.k;
            synchronized (dw0Var) {
                dw0Var.a = false;
                dw0Var.c = -1L;
                dw0Var.b = -1L;
            }
        }
    }

    public final void b(long j) throws IOException {
        dl4 dl4Var = this.g;
        try {
            ArrayList arrayListD = d(dl4Var.d());
            dw0 dw0Var = this.k;
            long jA = dw0Var.a() - j;
            Iterator it = arrayListD.iterator();
            int i = 0;
            long j2 = 0;
            while (it.hasNext()) {
                l94 l94Var = (l94) it.next();
                if (j2 > jA) {
                    break;
                }
                long jC = dl4Var.c(l94Var);
                this.d.remove(l94Var.a);
                if (jC > 0) {
                    i++;
                    j2 += jC;
                    re6.p0().q0();
                }
            }
            dw0Var.b(-j2, -i);
            dl4Var.b();
        } catch (IOException e) {
            e.getMessage();
            this.i.getClass();
            throw e;
        }
    }

    public final kg5 c(ww0 ww0Var) {
        kg5 kg5VarA;
        re6 re6VarP0 = re6.p0();
        try {
            synchronized (this.m) {
                try {
                    ArrayList arrayListR = v3c.r(ww0Var);
                    String str = null;
                    kg5VarA = null;
                    for (int i = 0; i < arrayListR.size() && (kg5VarA = this.g.a(ww0Var, (str = (String) arrayListR.get(i)))) == null; i++) {
                    }
                    if (kg5VarA == null) {
                        this.d.remove(str);
                    } else {
                        str.getClass();
                        this.d.add(str);
                    }
                } finally {
                }
            }
            return kg5VarA;
        } catch (IOException unused) {
            this.i.getClass();
            return null;
        } finally {
            re6VarP0.q0();
        }
    }

    public final ArrayList d(Collection collection) {
        this.l.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis() + n;
        ArrayList arrayList = new ArrayList(collection.size());
        ArrayList arrayList2 = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            l94 l94Var = (l94) it.next();
            if (l94Var.a() > jCurrentTimeMillis) {
                arrayList.add(l94Var);
            } else {
                arrayList2.add(l94Var);
            }
        }
        this.h.getClass();
        Collections.sort(arrayList2, new fs4(23));
        arrayList.addAll(arrayList2);
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0067 A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.kg5 e(defpackage.ww0 r11, defpackage.f9 r12) {
        /*
            r10 = this;
            re6 r0 = defpackage.re6.p0()
            java.lang.Object r1 = r10.m
            monitor-enter(r1)
            java.lang.String r2 = r11.c()     // Catch: java.lang.Throwable -> Lb5 java.io.UnsupportedEncodingException -> Lbe
            java.lang.String r3 = "UTF-8"
            java.nio.charset.Charset r3 = java.nio.charset.Charset.forName(r3)     // Catch: java.lang.Throwable -> Lb5 java.io.UnsupportedEncodingException -> Lbe
            byte[] r2 = r2.getBytes(r3)     // Catch: java.lang.Throwable -> Lb5 java.io.UnsupportedEncodingException -> Lbe
            java.lang.String r3 = "SHA-1"
            java.security.MessageDigest r3 = java.security.MessageDigest.getInstance(r3)     // Catch: java.lang.Throwable -> Lb5 java.security.NoSuchAlgorithmException -> Lb7 java.io.UnsupportedEncodingException -> Lbe
            int r4 = r2.length     // Catch: java.lang.Throwable -> Lb5 java.security.NoSuchAlgorithmException -> Lb7 java.io.UnsupportedEncodingException -> Lbe
            r5 = 0
            r3.update(r2, r5, r4)     // Catch: java.lang.Throwable -> Lb5 java.security.NoSuchAlgorithmException -> Lb7 java.io.UnsupportedEncodingException -> Lbe
            byte[] r2 = r3.digest()     // Catch: java.lang.Throwable -> Lb5 java.security.NoSuchAlgorithmException -> Lb7 java.io.UnsupportedEncodingException -> Lbe
            r3 = 11
            java.lang.String r2 = android.util.Base64.encodeToString(r2, r3)     // Catch: java.lang.Throwable -> Lb5 java.security.NoSuchAlgorithmException -> Lb7 java.io.UnsupportedEncodingException -> Lbe
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb5
            vq7 r11 = r10.g(r2, r11)     // Catch: java.lang.Throwable -> L72 java.io.IOException -> L74
            r1 = 1
            r11.w(r12)     // Catch: java.lang.Throwable -> L7a
            java.lang.Object r12 = r10.m     // Catch: java.lang.Throwable -> L7a
            monitor-enter(r12)     // Catch: java.lang.Throwable -> L7a
            kg5 r3 = r11.m()     // Catch: java.lang.Throwable -> L7c
            java.util.HashSet r4 = r10.d     // Catch: java.lang.Throwable -> L7c
            r4.add(r2)     // Catch: java.lang.Throwable -> L7c
            dw0 r2 = r10.k     // Catch: java.lang.Throwable -> L7c
            java.io.File r4 = r3.a     // Catch: java.lang.Throwable -> L7c
            long r6 = r4.length()     // Catch: java.lang.Throwable -> L7c
            r8 = 1
            r2.b(r6, r8)     // Catch: java.lang.Throwable -> L7c
            monitor-exit(r12)     // Catch: java.lang.Throwable -> L7c
            java.io.File r12 = r3.a     // Catch: java.lang.Throwable -> L7a
            r12.length()     // Catch: java.lang.Throwable -> L7a
            dw0 r10 = r10.k     // Catch: java.lang.Throwable -> L7a
            r10.a()     // Catch: java.lang.Throwable -> L7a
            java.lang.Object r10 = r11.c     // Catch: java.lang.Throwable -> L72 java.io.IOException -> L74
            java.io.File r10 = (java.io.File) r10     // Catch: java.lang.Throwable -> L72 java.io.IOException -> L74
            boolean r11 = r10.exists()     // Catch: java.lang.Throwable -> L72 java.io.IOException -> L74
            if (r11 == 0) goto L67
            boolean r10 = r10.delete()     // Catch: java.lang.Throwable -> L72 java.io.IOException -> L74
            if (r10 == 0) goto L68
        L67:
            r5 = r1
        L68:
            if (r5 != 0) goto L76
            java.lang.Class<el4> r10 = defpackage.el4.class
            java.lang.String r11 = "Failed to delete temp file"
            defpackage.ta5.a(r10, r11)     // Catch: java.lang.Throwable -> L72 java.io.IOException -> L74
            goto L76
        L72:
            r10 = move-exception
            goto Lb1
        L74:
            r10 = move-exception
            goto L9a
        L76:
            r0.q0()
            return r3
        L7a:
            r10 = move-exception
            goto L7f
        L7c:
            r10 = move-exception
            monitor-exit(r12)     // Catch: java.lang.Throwable -> L7c
            throw r10     // Catch: java.lang.Throwable -> L7a
        L7f:
            java.lang.Object r11 = r11.c     // Catch: java.lang.Throwable -> L72 java.io.IOException -> L74
            java.io.File r11 = (java.io.File) r11     // Catch: java.lang.Throwable -> L72 java.io.IOException -> L74
            boolean r12 = r11.exists()     // Catch: java.lang.Throwable -> L72 java.io.IOException -> L74
            if (r12 == 0) goto L8f
            boolean r11 = r11.delete()     // Catch: java.lang.Throwable -> L72 java.io.IOException -> L74
            if (r11 == 0) goto L90
        L8f:
            r5 = r1
        L90:
            if (r5 != 0) goto L99
            java.lang.Class<el4> r11 = defpackage.el4.class
            java.lang.String r12 = "Failed to delete temp file"
            defpackage.ta5.a(r11, r12)     // Catch: java.lang.Throwable -> L72 java.io.IOException -> L74
        L99:
            throw r10     // Catch: java.lang.Throwable -> L72 java.io.IOException -> L74
        L9a:
            java.lang.Class<el4> r11 = defpackage.el4.class
            java.lang.String r12 = "Failed inserting a file into the cache"
            ft7 r1 = defpackage.ta5.a     // Catch: java.lang.Throwable -> L72
            r2 = 6
            boolean r1 = r1.i(r2)     // Catch: java.lang.Throwable -> L72
            if (r1 == 0) goto Lb0
            ft7 r1 = defpackage.ta5.a     // Catch: java.lang.Throwable -> L72
            java.lang.String r11 = r11.getSimpleName()     // Catch: java.lang.Throwable -> L72
            r1.e(r11, r12, r10)     // Catch: java.lang.Throwable -> L72
        Lb0:
            throw r10     // Catch: java.lang.Throwable -> L72
        Lb1:
            r0.q0()
            throw r10
        Lb5:
            r10 = move-exception
            goto Lc5
        Lb7:
            r10 = move-exception
            java.lang.RuntimeException r11 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> Lb5 java.io.UnsupportedEncodingException -> Lbe
            r11.<init>(r10)     // Catch: java.lang.Throwable -> Lb5 java.io.UnsupportedEncodingException -> Lbe
            throw r11     // Catch: java.lang.Throwable -> Lb5 java.io.UnsupportedEncodingException -> Lbe
        Lbe:
            r10 = move-exception
            java.lang.RuntimeException r11 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> Lb5
            r11.<init>(r10)     // Catch: java.lang.Throwable -> Lb5
            throw r11     // Catch: java.lang.Throwable -> Lb5
        Lc5:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb5
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.el4.e(ww0, f9):kg5");
    }

    public final boolean f() {
        boolean z;
        long j;
        boolean z2;
        this.l.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        dw0 dw0Var = this.k;
        synchronized (dw0Var) {
            z = dw0Var.a;
        }
        long jMax = -1;
        if (z) {
            long j2 = this.e;
            if (j2 != -1 && jCurrentTimeMillis - j2 <= o) {
                return false;
            }
        }
        this.l.getClass();
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        long j3 = n + jCurrentTimeMillis2;
        HashSet hashSet = (this.j && this.d.isEmpty()) ? this.d : this.j ? new HashSet() : null;
        try {
            boolean z3 = false;
            int i = 0;
            long j4 = 0;
            for (l94 l94Var : this.g.d()) {
                int i2 = i + 1;
                boolean z4 = z3;
                if (l94Var.c < 0) {
                    l94Var.c = l94Var.b.a.length();
                }
                j4 += l94Var.c;
                if (l94Var.a() > j3) {
                    if (l94Var.c < 0) {
                        l94Var.c = l94Var.b.a.length();
                    }
                    jMax = Math.max(l94Var.a() - jCurrentTimeMillis2, jMax);
                    z3 = true;
                } else {
                    if (this.j) {
                        hashSet.getClass();
                        hashSet.add(l94Var.a);
                    }
                    z3 = z4;
                }
                i = i2;
            }
            if (z3) {
                this.i.getClass();
            }
            dw0 dw0Var2 = this.k;
            synchronized (dw0Var2) {
                j = dw0Var2.c;
            }
            long j5 = i;
            if (j == j5 && this.k.a() == j4) {
                z2 = true;
            } else {
                if (this.j && this.d != hashSet) {
                    hashSet.getClass();
                    this.d.clear();
                    this.d.addAll(hashSet);
                }
                dw0 dw0Var3 = this.k;
                synchronized (dw0Var3) {
                    dw0Var3.c = j5;
                    dw0Var3.b = j4;
                    z2 = true;
                    dw0Var3.a = true;
                }
            }
            this.e = jCurrentTimeMillis2;
            return z2;
        } catch (IOException e) {
            lq9 lq9Var = this.i;
            e.getMessage();
            lq9Var.getClass();
            return false;
        }
    }

    public final vq7 g(String str, ww0 ww0Var) {
        synchronized (this.m) {
            boolean zF = f();
            h();
            long jA = this.k.a();
            if (jA > this.c && !zF) {
                dw0 dw0Var = this.k;
                synchronized (dw0Var) {
                    dw0Var.a = false;
                    dw0Var.c = -1L;
                    dw0Var.b = -1L;
                }
                f();
            }
            long j = this.c;
            if (jA > j) {
                b((j * 9) / 10);
            }
        }
        return this.g.f(ww0Var, str);
    }

    public final void h() {
        char c = this.g.isExternal() ? (char) 2 : (char) 1;
        d0e d0eVar = this.f;
        long jA = this.b - this.k.a();
        d0eVar.a();
        d0eVar.a();
        ReentrantLock reentrantLock = d0eVar.f;
        if (reentrantLock.tryLock()) {
            try {
                if (SystemClock.uptimeMillis() - d0eVar.e > d0e.i) {
                    d0eVar.a = d0e.b(d0eVar.a, d0eVar.b);
                    d0eVar.c = d0e.b(d0eVar.c, d0eVar.d);
                    d0eVar.e = SystemClock.uptimeMillis();
                }
            } finally {
                reentrantLock.unlock();
            }
        }
        StatFs statFs = c == 1 ? d0eVar.a : d0eVar.c;
        long availableBlocksLong = statFs != null ? statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong() : 0L;
        if (availableBlocksLong <= 0 || availableBlocksLong < jA) {
            this.c = this.a;
        } else {
            this.c = this.b;
        }
    }
}
