package defpackage;

import android.content.Context;
import android.os.Handler;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class h84 implements gg0, y0f {
    public static final ffc n = zw6.p(5400000L, 3300000L, 2000000L, 1300000L, 760000L);
    public static final ffc o = zw6.p(1700000L, 820000L, 450000L, 180000L, 130000L);
    public static final ffc p = zw6.p(2300000L, 1300000L, 1000000L, 820000L, 570000L);
    public static final ffc q = zw6.p(3400000L, 2000000L, 1400000L, 1000000L, 620000L);
    public static final ffc r = zw6.p(7500000L, 5200000L, 3700000L, 1800000L, 1100000L);
    public static final ffc s = zw6.p(3300000L, 1900000L, 1700000L, 1500000L, 1200000L);
    public static h84 t;
    public final cx6 a;
    public final wd6 b = new wd6(4);
    public final btd c;
    public final rhe d;
    public final boolean e;
    public int f;
    public long g;
    public long h;
    public int i;
    public long j;
    public long k;
    public long l;
    public long m;

    public h84(Context context, Map map, int i, rhe rheVar, boolean z) {
        go9 go9Var;
        int i2;
        this.a = cx6.b(map);
        this.c = new btd(i, 0);
        this.d = rheVar;
        this.e = z;
        if (context == null) {
            this.i = 0;
            this.l = c(0);
            return;
        }
        synchronized (go9.class) {
            try {
                if (go9.f == null) {
                    go9.f = new go9(context);
                }
                go9Var = go9.f;
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (go9Var.c) {
            i2 = go9Var.b;
        }
        this.i = i2;
        this.l = c(i2);
        f84 f84Var = new f84(this);
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) go9Var.e;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            if (weakReference.get() == null) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
        copyOnWriteArrayList.add(new WeakReference(f84Var));
        ((Handler) go9Var.d).post(new do9(go9Var, 0, f84Var));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0011  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int[] a(java.lang.String r8) {
        /*
            Method dump skipped, instructions count: 8426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h84.a(java.lang.String):int[]");
    }

    public final void b(h74 h74Var, Handler handler) {
        h74Var.getClass();
        wd6 wd6Var = this.b;
        wd6Var.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) wd6Var.b;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            eg0 eg0Var = (eg0) it.next();
            if (eg0Var.b == h74Var) {
                eg0Var.c = true;
                copyOnWriteArrayList.remove(eg0Var);
            }
        }
        copyOnWriteArrayList.add(new eg0(h74Var, handler));
    }

    public final long c(int i) {
        Integer numValueOf = Integer.valueOf(i);
        cx6 cx6Var = this.a;
        Long l = (Long) cx6Var.get(numValueOf);
        if (l == null) {
            l = (Long) cx6Var.get(0);
        }
        if (l == null) {
            l = 1000000L;
        }
        return l.longValue();
    }

    public final void d(int i, long j, long j2) {
        if (i == 0 && j == 0 && j2 == this.m) {
            return;
        }
        this.m = j2;
        Iterator it = ((CopyOnWriteArrayList) this.b.b).iterator();
        while (it.hasNext()) {
            eg0 eg0Var = (eg0) it.next();
            if (!eg0Var.c) {
                eg0Var.a.post(new t60(i, 2, j, j2, eg0Var));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x000d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void e(defpackage.z24 r3, boolean r4, int r5) {
        /*
            r2 = this;
            monitor-enter(r2)
            if (r4 == 0) goto Ld
            int r3 = r3.i     // Catch: java.lang.Throwable -> L1a
            r4 = 8
            r3 = r3 & r4
            if (r3 != r4) goto Lb
            goto Ld
        Lb:
            r3 = 1
            goto Le
        Ld:
            r3 = 0
        Le:
            if (r3 != 0) goto L12
            monitor-exit(r2)
            return
        L12:
            long r3 = r2.h     // Catch: java.lang.Throwable -> L1a
            long r0 = (long) r5     // Catch: java.lang.Throwable -> L1a
            long r3 = r3 + r0
            r2.h = r3     // Catch: java.lang.Throwable -> L1a
            monitor-exit(r2)
            return
        L1a:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1a
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h84.e(z24, boolean, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x000f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void f(defpackage.z24 r11, boolean r12) {
        /*
            r10 = this;
            monitor-enter(r10)
            r0 = 0
            r1 = 1
            if (r12 == 0) goto Lf
            int r11 = r11.i     // Catch: java.lang.Throwable -> L5c
            r12 = 8
            r11 = r11 & r12
            if (r11 != r12) goto Ld
            goto Lf
        Ld:
            r11 = r1
            goto L10
        Lf:
            r11 = r0
        L10:
            if (r11 != 0) goto L14
            monitor-exit(r10)
            return
        L14:
            int r11 = r10.f     // Catch: java.lang.Throwable -> L5c
            if (r11 <= 0) goto L19
            r0 = r1
        L19:
            defpackage.np8.f(r0)     // Catch: java.lang.Throwable -> L5c
            rhe r11 = r10.d     // Catch: java.lang.Throwable -> L5c
            r11.getClass()     // Catch: java.lang.Throwable -> L5c
            long r11 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L5c
            long r2 = r10.g     // Catch: java.lang.Throwable -> L5c
            long r2 = r11 - r2
            int r5 = (int) r2     // Catch: java.lang.Throwable -> L5c
            long r2 = r10.j     // Catch: java.lang.Throwable -> L5c
            long r6 = (long) r5     // Catch: java.lang.Throwable -> L5c
            long r2 = r2 + r6
            r10.j = r2     // Catch: java.lang.Throwable -> L5c
            long r2 = r10.k     // Catch: java.lang.Throwable -> L5c
            long r6 = r10.h     // Catch: java.lang.Throwable -> L5c
            long r2 = r2 + r6
            r10.k = r2     // Catch: java.lang.Throwable -> L5c
            if (r5 <= 0) goto L75
            float r0 = (float) r6     // Catch: java.lang.Throwable -> L5c
            r2 = 1174011904(0x45fa0000, float:8000.0)
            float r0 = r0 * r2
            float r2 = (float) r5     // Catch: java.lang.Throwable -> L5c
            float r0 = r0 / r2
            btd r2 = r10.c     // Catch: java.lang.Throwable -> L5c
            double r3 = (double) r6     // Catch: java.lang.Throwable -> L5c
            double r3 = java.lang.Math.sqrt(r3)     // Catch: java.lang.Throwable -> L5c
            int r3 = (int) r3     // Catch: java.lang.Throwable -> L5c
            r2.a(r3, r0)     // Catch: java.lang.Throwable -> L5c
            long r2 = r10.j     // Catch: java.lang.Throwable -> L5c
            r6 = 2000(0x7d0, double:9.88E-321)
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 >= 0) goto L5e
            long r2 = r10.k     // Catch: java.lang.Throwable -> L5c
            r6 = 524288(0x80000, double:2.590327E-318)
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 < 0) goto L67
            goto L5e
        L5c:
            r11 = move-exception
            goto L7c
        L5e:
            btd r0 = r10.c     // Catch: java.lang.Throwable -> L5c
            float r0 = r0.b()     // Catch: java.lang.Throwable -> L5c
            long r2 = (long) r0     // Catch: java.lang.Throwable -> L5c
            r10.l = r2     // Catch: java.lang.Throwable -> L5c
        L67:
            long r6 = r10.h     // Catch: java.lang.Throwable -> L5c
            long r8 = r10.l     // Catch: java.lang.Throwable -> L5c
            r4 = r10
            r4.d(r5, r6, r8)     // Catch: java.lang.Throwable -> L5c
            r10.g = r11     // Catch: java.lang.Throwable -> L5c
            r11 = 0
            r10.h = r11     // Catch: java.lang.Throwable -> L5c
        L75:
            int r11 = r10.f     // Catch: java.lang.Throwable -> L5c
            int r11 = r11 - r1
            r10.f = r11     // Catch: java.lang.Throwable -> L5c
            monitor-exit(r10)
            return
        L7c:
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L5c
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h84.f(z24, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void g(defpackage.z24 r2, boolean r3) {
        /*
            r1 = this;
            monitor-enter(r1)
            r0 = 1
            if (r3 == 0) goto Le
            int r2 = r2.i     // Catch: java.lang.Throwable -> L23
            r3 = 8
            r2 = r2 & r3
            if (r2 != r3) goto Lc
            goto Le
        Lc:
            r2 = r0
            goto Lf
        Le:
            r2 = 0
        Lf:
            if (r2 != 0) goto L13
            monitor-exit(r1)
            return
        L13:
            int r2 = r1.f     // Catch: java.lang.Throwable -> L23
            if (r2 != 0) goto L25
            rhe r2 = r1.d     // Catch: java.lang.Throwable -> L23
            r2.getClass()     // Catch: java.lang.Throwable -> L23
            long r2 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L23
            r1.g = r2     // Catch: java.lang.Throwable -> L23
            goto L25
        L23:
            r2 = move-exception
            goto L2c
        L25:
            int r2 = r1.f     // Catch: java.lang.Throwable -> L23
            int r2 = r2 + r0
            r1.f = r2     // Catch: java.lang.Throwable -> L23
            monitor-exit(r1)
            return
        L2c:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L23
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h84.g(z24, boolean):void");
    }
}
