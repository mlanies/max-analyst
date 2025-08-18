package defpackage;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class nw7 implements jy3, lq8 {
    public final ide X;
    public mq8 Y;
    public long Z;
    public final w4d a;
    public final jn b;
    public final jn c;
    public final vaf o;
    public final boolean s0;
    public final boolean t0;

    public nw7(vaf vafVar, ide ideVar) {
        new WeakHashMap();
        this.o = vafVar;
        this.b = new jn(new imc(this, 23, vafVar));
        this.c = new jn(new imc(this, 23, vafVar));
        this.X = ideVar;
        mq8 mq8Var = (mq8) ideVar.get();
        od2.o(mq8Var, "mMemoryCacheParamsSupplier returned null");
        this.Y = mq8Var;
        this.Z = SystemClock.uptimeMillis();
        this.a = null;
        this.s0 = false;
        this.t0 = false;
    }

    public static void d(iy3 iy3Var) {
        w4d w4dVar;
        if (iy3Var == null || (w4dVar = iy3Var.e) == null) {
            return;
        }
        w4dVar.I(iy3Var.a, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.v84 a(java.lang.Object r8, defpackage.o43 r9, defpackage.w4d r10) {
        /*
            r7 = this;
            r8.getClass()
            r9.getClass()
            r7.e()
            monitor-enter(r7)
            jn r0 = r7.b     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r0 = r0.M(r8)     // Catch: java.lang.Throwable -> L2d
            iy3 r0 = (defpackage.iy3) r0     // Catch: java.lang.Throwable -> L2d
            jn r1 = r7.c     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r1 = r1.M(r8)     // Catch: java.lang.Throwable -> L2d
            iy3 r1 = (defpackage.iy3) r1     // Catch: java.lang.Throwable -> L2d
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L33
            monitor-enter(r7)     // Catch: java.lang.Throwable -> L2d
            boolean r4 = r1.d     // Catch: java.lang.Throwable -> L30
            r4 = r4 ^ r2
            defpackage.od2.p(r4)     // Catch: java.lang.Throwable -> L30
            r1.d = r2     // Catch: java.lang.Throwable -> L30
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L2d
            o43 r1 = r7.g(r1)     // Catch: java.lang.Throwable -> L2d
            goto L34
        L2d:
            r8 = move-exception
            goto La4
        L30:
            r8 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L30
            throw r8     // Catch: java.lang.Throwable -> L2d
        L33:
            r1 = r3
        L34:
            java.lang.Object r4 = r9.e0()     // Catch: java.lang.Throwable -> L2d
            vaf r5 = r7.o     // Catch: java.lang.Throwable -> L2d
            int r4 = r5.j(r4)     // Catch: java.lang.Throwable -> L2d
            monitor-enter(r7)     // Catch: java.lang.Throwable -> L2d
            mq8 r5 = r7.Y     // Catch: java.lang.Throwable -> L72
            int r5 = r5.d     // Catch: java.lang.Throwable -> L72
            if (r4 > r5) goto L7a
            monitor-enter(r7)     // Catch: java.lang.Throwable -> L72
            jn r5 = r7.c     // Catch: java.lang.Throwable -> L77
            int r5 = r5.t()     // Catch: java.lang.Throwable -> L77
            jn r6 = r7.b     // Catch: java.lang.Throwable -> L77
            int r6 = r6.t()     // Catch: java.lang.Throwable -> L77
            int r5 = r5 - r6
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L72
            mq8 r6 = r7.Y     // Catch: java.lang.Throwable -> L72
            int r6 = r6.b     // Catch: java.lang.Throwable -> L72
            int r6 = r6 - r2
            if (r5 > r6) goto L7a
            monitor-enter(r7)     // Catch: java.lang.Throwable -> L72
            jn r5 = r7.c     // Catch: java.lang.Throwable -> L74
            int r5 = r5.v()     // Catch: java.lang.Throwable -> L74
            jn r6 = r7.b     // Catch: java.lang.Throwable -> L74
            int r6 = r6.v()     // Catch: java.lang.Throwable -> L74
            int r5 = r5 - r6
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L72
            mq8 r6 = r7.Y     // Catch: java.lang.Throwable -> L72
            int r6 = r6.a     // Catch: java.lang.Throwable -> L72
            int r6 = r6 - r4
            if (r5 > r6) goto L7a
            goto L7b
        L72:
            r8 = move-exception
            goto La2
        L74:
            r8 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L74
            throw r8     // Catch: java.lang.Throwable -> L72
        L77:
            r8 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L77
            throw r8     // Catch: java.lang.Throwable -> L72
        L7a:
            r2 = 0
        L7b:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L2d
            if (r2 == 0) goto L97
            boolean r2 = r7.s0     // Catch: java.lang.Throwable -> L2d
            if (r2 == 0) goto L88
            iy3 r2 = new iy3     // Catch: java.lang.Throwable -> L2d
            r2.<init>(r8, r9, r10, r4)     // Catch: java.lang.Throwable -> L2d
            goto L8e
        L88:
            iy3 r2 = new iy3     // Catch: java.lang.Throwable -> L2d
            r3 = -1
            r2.<init>(r8, r9, r10, r3)     // Catch: java.lang.Throwable -> L2d
        L8e:
            jn r9 = r7.c     // Catch: java.lang.Throwable -> L2d
            r9.J(r8, r2)     // Catch: java.lang.Throwable -> L2d
            v84 r3 = r7.f(r2)     // Catch: java.lang.Throwable -> L2d
        L97:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L2d
            defpackage.o43.S(r1)
            d(r0)
            r7.c()
            return r3
        La2:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L72
            throw r8     // Catch: java.lang.Throwable -> L2d
        La4:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L2d
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nw7.a(java.lang.Object, o43, w4d):v84");
    }

    public final synchronized void b(ArrayList arrayList) {
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                iy3 iy3Var = (iy3) it.next();
                synchronized (this) {
                    iy3Var.getClass();
                    od2.p(!iy3Var.d);
                    iy3Var.d = true;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0073 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c() {
        /*
            r5 = this;
            monitor-enter(r5)
            mq8 r0 = r5.Y     // Catch: java.lang.Throwable -> L74
            r0.getClass()     // Catch: java.lang.Throwable -> L74
            mq8 r0 = r5.Y     // Catch: java.lang.Throwable -> L74
            int r0 = r0.b     // Catch: java.lang.Throwable -> L74
            monitor-enter(r5)     // Catch: java.lang.Throwable -> L74
            jn r1 = r5.c     // Catch: java.lang.Throwable -> L79
            int r1 = r1.t()     // Catch: java.lang.Throwable -> L79
            jn r2 = r5.b     // Catch: java.lang.Throwable -> L79
            int r2 = r2.t()     // Catch: java.lang.Throwable -> L79
            int r1 = r1 - r2
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L74
            int r0 = r0 - r1
            r1 = 2147483647(0x7fffffff, float:NaN)
            int r0 = java.lang.Math.min(r1, r0)     // Catch: java.lang.Throwable -> L74
            mq8 r1 = r5.Y     // Catch: java.lang.Throwable -> L74
            int r2 = r1.c     // Catch: java.lang.Throwable -> L74
            int r1 = r1.a     // Catch: java.lang.Throwable -> L74
            monitor-enter(r5)     // Catch: java.lang.Throwable -> L74
            jn r3 = r5.c     // Catch: java.lang.Throwable -> L76
            int r3 = r3.v()     // Catch: java.lang.Throwable -> L76
            jn r4 = r5.b     // Catch: java.lang.Throwable -> L76
            int r4 = r4.v()     // Catch: java.lang.Throwable -> L76
            int r3 = r3 - r4
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L74
            int r1 = r1 - r3
            int r1 = java.lang.Math.min(r2, r1)     // Catch: java.lang.Throwable -> L74
            java.util.ArrayList r0 = r5.i(r0, r1)     // Catch: java.lang.Throwable -> L74
            r5.b(r0)     // Catch: java.lang.Throwable -> L74
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L74
            if (r0 == 0) goto L5d
            java.util.Iterator r1 = r0.iterator()
        L49:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L5d
            java.lang.Object r2 = r1.next()
            iy3 r2 = (defpackage.iy3) r2
            o43 r2 = r5.g(r2)
            defpackage.o43.S(r2)
            goto L49
        L5d:
            if (r0 == 0) goto L73
            java.util.Iterator r5 = r0.iterator()
        L63:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L73
            java.lang.Object r0 = r5.next()
            iy3 r0 = (defpackage.iy3) r0
            d(r0)
            goto L63
        L73:
            return
        L74:
            r0 = move-exception
            goto L7c
        L76:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L76
            throw r0     // Catch: java.lang.Throwable -> L74
        L79:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L79
            throw r0     // Catch: java.lang.Throwable -> L74
        L7c:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L74
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nw7.c():void");
    }

    public final synchronized void e() {
        if (this.Z + this.Y.e > SystemClock.uptimeMillis()) {
            return;
        }
        this.Z = SystemClock.uptimeMillis();
        mq8 mq8Var = (mq8) this.X.get();
        od2.o(mq8Var, "mMemoryCacheParamsSupplier returned null");
        this.Y = mq8Var;
    }

    public final synchronized v84 f(iy3 iy3Var) {
        synchronized (this) {
            od2.p(!iy3Var.d);
            iy3Var.c++;
        }
        return o43.p0(iy3Var.b.e0(), new y7g(this, iy3Var, false, 22), o43.Y);
        return o43.p0(iy3Var.b.e0(), new y7g(this, iy3Var, false, 22), o43.Y);
    }

    public final synchronized o43 g(iy3 iy3Var) {
        iy3Var.getClass();
        return (iy3Var.d && iy3Var.c == 0) ? iy3Var.b : null;
    }

    @Override // defpackage.lq8
    public final o43 get(Object obj) {
        iy3 iy3Var;
        Object obj2;
        v84 v84VarF;
        obj.getClass();
        synchronized (this) {
            try {
                iy3Var = (iy3) this.b.M(obj);
                jn jnVar = this.c;
                synchronized (jnVar) {
                    obj2 = ((LinkedHashMap) jnVar.o).get(obj);
                }
                iy3 iy3Var2 = (iy3) obj2;
                v84VarF = iy3Var2 != null ? f(iy3Var2) : null;
            } catch (Throwable th) {
                throw th;
            }
        }
        d(iy3Var);
        e();
        c();
        return v84VarF;
    }

    @Override // defpackage.lq8
    public final synchronized int getSizeInBytes() {
        return this.c.v();
    }

    @Override // defpackage.lq8
    public final o43 h(Object obj, o43 o43Var) {
        return a(obj, o43Var, this.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0059, code lost:
    
        if (r5.t0 == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005b, code lost:
    
        r6 = r5.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005d, code lost:
    
        monitor-enter(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0066, code lost:
    
        if (((java.util.LinkedHashMap) r6.o).isEmpty() == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0068, code lost:
    
        r6.b = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x006d, code lost:
    
        monitor-exit(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0095, code lost:
    
        throw new java.lang.IllegalStateException(java.lang.String.format("key is null, but exclusiveEntries count: %d, size: %d", java.lang.Integer.valueOf(r5.b.t()), java.lang.Integer.valueOf(r5.b.v())));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized java.util.ArrayList i(int r6, int r7) {
        /*
            r5 = this;
            monitor-enter(r5)
            r0 = 0
            int r6 = java.lang.Math.max(r6, r0)     // Catch: java.lang.Throwable -> L1d
            int r7 = java.lang.Math.max(r7, r0)     // Catch: java.lang.Throwable -> L1d
            jn r1 = r5.b     // Catch: java.lang.Throwable -> L1d
            int r1 = r1.t()     // Catch: java.lang.Throwable -> L1d
            r2 = 0
            if (r1 > r6) goto L20
            jn r1 = r5.b     // Catch: java.lang.Throwable -> L1d
            int r1 = r1.v()     // Catch: java.lang.Throwable -> L1d
            if (r1 > r7) goto L20
            monitor-exit(r5)
            return r2
        L1d:
            r6 = move-exception
            goto Lab
        L20:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L1d
            r1.<init>()     // Catch: java.lang.Throwable -> L1d
        L25:
            jn r3 = r5.b     // Catch: java.lang.Throwable -> L1d
            int r3 = r3.t()     // Catch: java.lang.Throwable -> L1d
            if (r3 > r6) goto L35
            jn r3 = r5.b     // Catch: java.lang.Throwable -> L1d
            int r3 = r3.v()     // Catch: java.lang.Throwable -> L1d
            if (r3 <= r7) goto L6e
        L35:
            jn r3 = r5.b     // Catch: java.lang.Throwable -> L1d
            monitor-enter(r3)     // Catch: java.lang.Throwable -> L1d
            java.lang.Object r4 = r3.o     // Catch: java.lang.Throwable -> La8
            java.util.LinkedHashMap r4 = (java.util.LinkedHashMap) r4     // Catch: java.lang.Throwable -> La8
            boolean r4 = r4.isEmpty()     // Catch: java.lang.Throwable -> La8
            if (r4 == 0) goto L44
            r4 = r2
            goto L54
        L44:
            java.lang.Object r4 = r3.o     // Catch: java.lang.Throwable -> La8
            java.util.LinkedHashMap r4 = (java.util.LinkedHashMap) r4     // Catch: java.lang.Throwable -> La8
            java.util.Set r4 = r4.keySet()     // Catch: java.lang.Throwable -> La8
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> La8
            java.lang.Object r4 = r4.next()     // Catch: java.lang.Throwable -> La8
        L54:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1d
            if (r4 != 0) goto L96
            boolean r6 = r5.t0     // Catch: java.lang.Throwable -> L1d
            if (r6 == 0) goto L72
            jn r6 = r5.b     // Catch: java.lang.Throwable -> L1d
            monitor-enter(r6)     // Catch: java.lang.Throwable -> L1d
            java.lang.Object r7 = r6.o     // Catch: java.lang.Throwable -> L6b
            java.util.LinkedHashMap r7 = (java.util.LinkedHashMap) r7     // Catch: java.lang.Throwable -> L6b
            boolean r7 = r7.isEmpty()     // Catch: java.lang.Throwable -> L6b
            if (r7 == 0) goto L6d
            r6.b = r0     // Catch: java.lang.Throwable -> L6b
            goto L6d
        L6b:
            r7 = move-exception
            goto L70
        L6d:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L1d
        L6e:
            monitor-exit(r5)
            return r1
        L70:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L6b
            throw r7     // Catch: java.lang.Throwable -> L1d
        L72:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L1d
            java.lang.String r7 = "key is null, but exclusiveEntries count: %d, size: %d"
            jn r0 = r5.b     // Catch: java.lang.Throwable -> L1d
            int r0 = r0.t()     // Catch: java.lang.Throwable -> L1d
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L1d
            jn r1 = r5.b     // Catch: java.lang.Throwable -> L1d
            int r1 = r1.v()     // Catch: java.lang.Throwable -> L1d
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L1d
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r1}     // Catch: java.lang.Throwable -> L1d
            java.lang.String r7 = java.lang.String.format(r7, r0)     // Catch: java.lang.Throwable -> L1d
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L1d
            throw r6     // Catch: java.lang.Throwable -> L1d
        L96:
            jn r3 = r5.b     // Catch: java.lang.Throwable -> L1d
            r3.M(r4)     // Catch: java.lang.Throwable -> L1d
            jn r3 = r5.c     // Catch: java.lang.Throwable -> L1d
            java.lang.Object r3 = r3.M(r4)     // Catch: java.lang.Throwable -> L1d
            iy3 r3 = (defpackage.iy3) r3     // Catch: java.lang.Throwable -> L1d
            r1.add(r3)     // Catch: java.lang.Throwable -> L1d
            goto L25
        La8:
            r6 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> La8
            throw r6     // Catch: java.lang.Throwable -> L1d
        Lab:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L1d
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nw7.i(int, int):java.util.ArrayList");
    }

    @Override // defpackage.lq8
    public final int n(d7b d7bVar) {
        ArrayList arrayListN;
        ArrayList arrayListN2;
        synchronized (this) {
            arrayListN = this.b.N(d7bVar);
            arrayListN2 = this.c.N(d7bVar);
            b(arrayListN2);
        }
        Iterator it = arrayListN2.iterator();
        while (it.hasNext()) {
            o43.S(g((iy3) it.next()));
        }
        Iterator it2 = arrayListN.iterator();
        while (it2.hasNext()) {
            d((iy3) it2.next());
        }
        e();
        c();
        return arrayListN2.size();
    }
}
