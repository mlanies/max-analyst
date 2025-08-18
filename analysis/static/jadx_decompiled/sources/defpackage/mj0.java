package defpackage;

import android.util.SparseArray;
import android.util.SparseIntArray;
import com.facebook.imagepipeline.memory.BasePool$PoolSizeViolationException;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class mj0 implements l5b {
    public final Set X;
    public final boolean Y;
    public final jt Z;
    public final Class a = getClass();
    public final sq8 b;
    public final n5b c;
    public final SparseArray o;
    public final jt s0;
    public final o5b t0;
    public boolean u0;

    public mj0(sq8 sq8Var, n5b n5bVar, o5b o5bVar) {
        sq8Var.getClass();
        this.b = sq8Var;
        n5bVar.getClass();
        this.c = n5bVar;
        o5bVar.getClass();
        this.t0 = o5bVar;
        SparseArray sparseArray = new SparseArray();
        this.o = sparseArray;
        SparseIntArray sparseIntArray = new SparseIntArray(0);
        synchronized (this) {
            try {
                sparseArray.clear();
                SparseIntArray sparseIntArray2 = n5bVar.c;
                if (sparseIntArray2 != null) {
                    for (int i = 0; i < sparseIntArray2.size(); i++) {
                        int iKeyAt = sparseIntArray2.keyAt(i);
                        int iValueAt = sparseIntArray2.valueAt(i);
                        int i2 = sparseIntArray.get(iKeyAt, 0);
                        SparseArray sparseArray2 = this.o;
                        int iH = h(iKeyAt);
                        this.c.getClass();
                        sparseArray2.put(iKeyAt, new ps0(iH, iValueAt, i2));
                    }
                    this.Y = false;
                } else {
                    this.Y = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.X = Collections.newSetFromMap(new IdentityHashMap());
        this.s0 = new jt(1);
        this.Z = new jt(1);
    }

    public abstract Object a(int i);

    public final synchronized boolean b(int i) {
        if (this.u0) {
            return true;
        }
        n5b n5bVar = this.c;
        int i2 = n5bVar.a;
        int i3 = this.Z.c;
        if (i > i2 - i3) {
            this.t0.getClass();
            return false;
        }
        int i4 = n5bVar.b;
        if (i > i4 - (i3 + this.s0.c)) {
            n(i4 - i);
        }
        if (i <= i2 - (this.Z.c + this.s0.c)) {
            return true;
        }
        this.t0.getClass();
        return false;
    }

    public abstract void c(Object obj);

    public final synchronized ps0 d(int i) {
        try {
            ps0 ps0Var = (ps0) this.o.get(i);
            if (ps0Var == null && this.Y) {
                if (ta5.a.i(2)) {
                    ta5.d(this.a, Integer.valueOf(i), "creating new bucket %s");
                }
                ps0 ps0VarM = m(i);
                this.o.put(i, ps0VarM);
                return ps0VarM;
            }
            return ps0Var;
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0096  */
    @Override // defpackage.pic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(java.lang.Object r8) {
        /*
            r7 = this;
            r8.getClass()
            int r0 = r7.g(r8)
            int r1 = r7.h(r0)
            monitor-enter(r7)
            monitor-enter(r7)     // Catch: java.lang.Throwable -> L3f
            android.util.SparseArray r2 = r7.o     // Catch: java.lang.Throwable -> Ld4
            java.lang.Object r2 = r2.get(r0)     // Catch: java.lang.Throwable -> Ld4
            ps0 r2 = (defpackage.ps0) r2     // Catch: java.lang.Throwable -> Ld4
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L3f
            java.util.Set r3 = r7.X     // Catch: java.lang.Throwable -> L3f
            boolean r3 = r3.remove(r8)     // Catch: java.lang.Throwable -> L3f
            if (r3 != 0) goto L42
            java.lang.Class r1 = r7.a     // Catch: java.lang.Throwable -> L3f
            java.lang.String r2 = "release (free, value unrecognized) (object, size) = (%x, %s)"
            int r3 = java.lang.System.identityHashCode(r8)     // Catch: java.lang.Throwable -> L3f
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L3f
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L3f
            java.lang.Object[] r0 = new java.lang.Object[]{r3, r0}     // Catch: java.lang.Throwable -> L3f
            defpackage.ta5.b(r1, r2, r0)     // Catch: java.lang.Throwable -> L3f
            r7.c(r8)     // Catch: java.lang.Throwable -> L3f
            o5b r8 = r7.t0     // Catch: java.lang.Throwable -> L3f
            r8.getClass()     // Catch: java.lang.Throwable -> L3f
            goto Lcf
        L3f:
            r8 = move-exception
            goto Ld7
        L42:
            r3 = 1
            r4 = 2
            if (r2 == 0) goto L96
            int r5 = r2.e     // Catch: java.lang.Throwable -> L3f
            java.util.LinkedList r6 = r2.c     // Catch: java.lang.Throwable -> L3f
            int r6 = r6.size()     // Catch: java.lang.Throwable -> L3f
            int r6 = r6 + r5
            int r5 = r2.b     // Catch: java.lang.Throwable -> L3f
            if (r6 <= r5) goto L54
            goto L96
        L54:
            boolean r5 = r7.j()     // Catch: java.lang.Throwable -> L3f
            if (r5 != 0) goto L96
            boolean r5 = r7.k(r8)     // Catch: java.lang.Throwable -> L3f
            if (r5 != 0) goto L61
            goto L96
        L61:
            r2.c(r8)     // Catch: java.lang.Throwable -> L3f
            jt r2 = r7.s0     // Catch: java.lang.Throwable -> L3f
            int r5 = r2.b     // Catch: java.lang.Throwable -> L3f
            int r5 = r5 + r3
            r2.b = r5     // Catch: java.lang.Throwable -> L3f
            int r3 = r2.c     // Catch: java.lang.Throwable -> L3f
            int r3 = r3 + r1
            r2.c = r3     // Catch: java.lang.Throwable -> L3f
            jt r2 = r7.Z     // Catch: java.lang.Throwable -> L3f
            r2.a(r1)     // Catch: java.lang.Throwable -> L3f
            o5b r1 = r7.t0     // Catch: java.lang.Throwable -> L3f
            r1.getClass()     // Catch: java.lang.Throwable -> L3f
            ft7 r1 = defpackage.ta5.a     // Catch: java.lang.Throwable -> L3f
            boolean r1 = r1.i(r4)     // Catch: java.lang.Throwable -> L3f
            if (r1 == 0) goto Lcf
            java.lang.Class r1 = r7.a     // Catch: java.lang.Throwable -> L3f
            java.lang.String r2 = "release (reuse) (object, size) = (%x, %s)"
            int r8 = java.lang.System.identityHashCode(r8)     // Catch: java.lang.Throwable -> L3f
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> L3f
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L3f
            defpackage.ta5.e(r1, r2, r8, r0)     // Catch: java.lang.Throwable -> L3f
            goto Lcf
        L96:
            if (r2 == 0) goto La7
            int r5 = r2.e     // Catch: java.lang.Throwable -> L3f
            if (r5 <= 0) goto L9e
            r5 = r3
            goto L9f
        L9e:
            r5 = 0
        L9f:
            defpackage.od2.p(r5)     // Catch: java.lang.Throwable -> L3f
            int r5 = r2.e     // Catch: java.lang.Throwable -> L3f
            int r5 = r5 - r3
            r2.e = r5     // Catch: java.lang.Throwable -> L3f
        La7:
            ft7 r2 = defpackage.ta5.a     // Catch: java.lang.Throwable -> L3f
            boolean r2 = r2.i(r4)     // Catch: java.lang.Throwable -> L3f
            if (r2 == 0) goto Lc2
            java.lang.Class r2 = r7.a     // Catch: java.lang.Throwable -> L3f
            java.lang.String r3 = "release (free) (object, size) = (%x, %s)"
            int r4 = java.lang.System.identityHashCode(r8)     // Catch: java.lang.Throwable -> L3f
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L3f
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L3f
            defpackage.ta5.e(r2, r3, r4, r0)     // Catch: java.lang.Throwable -> L3f
        Lc2:
            r7.c(r8)     // Catch: java.lang.Throwable -> L3f
            jt r8 = r7.Z     // Catch: java.lang.Throwable -> L3f
            r8.a(r1)     // Catch: java.lang.Throwable -> L3f
            o5b r8 = r7.t0     // Catch: java.lang.Throwable -> L3f
            r8.getClass()     // Catch: java.lang.Throwable -> L3f
        Lcf:
            r7.l()     // Catch: java.lang.Throwable -> L3f
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L3f
            return
        Ld4:
            r8 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> Ld4
            throw r8     // Catch: java.lang.Throwable -> L3f
        Ld7:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L3f
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mj0.e(java.lang.Object):void");
    }

    public abstract int f(int i);

    public abstract int g(Object obj);

    @Override // defpackage.l5b
    public final Object get(int i) throws Throwable {
        Object objA;
        Object objI;
        synchronized (this) {
            try {
                od2.p(!j() || this.s0.c == 0);
            } finally {
            }
        }
        int iF = f(i);
        synchronized (this) {
            try {
                ps0 ps0VarD = d(iF);
                if (ps0VarD != null && (objI = i(ps0VarD)) != null) {
                    od2.p(this.X.add(objI));
                    int iG = g(objI);
                    int iH = h(iG);
                    jt jtVar = this.Z;
                    jtVar.b++;
                    jtVar.c += iH;
                    this.s0.a(iH);
                    this.t0.getClass();
                    l();
                    if (ta5.a.i(2)) {
                        ta5.e(this.a, "get (reuse) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(objI)), Integer.valueOf(iG));
                    }
                    return objI;
                }
                int iH2 = h(iF);
                if (!b(iH2)) {
                    int i2 = this.c.a;
                    int i3 = this.Z.c;
                    int i4 = this.s0.c;
                    StringBuilder sbJ = wg0.j("Pool hard cap violation? Hard cap = ", i2, " Used size = ", i3, " Free size = ");
                    sbJ.append(i4);
                    sbJ.append(" Request size = ");
                    sbJ.append(iH2);
                    throw new BasePool$PoolSizeViolationException(sbJ.toString());
                }
                jt jtVar2 = this.Z;
                jtVar2.b++;
                jtVar2.c += iH2;
                if (ps0VarD != null) {
                    ps0VarD.e++;
                }
                try {
                    objA = a(iF);
                } catch (Throwable th) {
                    synchronized (this) {
                        this.Z.a(iH2);
                        ps0 ps0VarD2 = d(iF);
                        if (ps0VarD2 != null) {
                            od2.p(ps0VarD2.e > 0);
                            ps0VarD2.e--;
                        }
                        if (Error.class.isInstance(th)) {
                            throw ((Throwable) Error.class.cast(th));
                        }
                        if (RuntimeException.class.isInstance(th)) {
                            throw ((Throwable) RuntimeException.class.cast(th));
                        }
                        objA = null;
                    }
                }
                synchronized (this) {
                    try {
                        od2.p(this.X.add(objA));
                        synchronized (this) {
                            if (j()) {
                                n(this.c.b);
                            }
                        }
                        return objA;
                    } finally {
                    }
                }
                this.t0.getClass();
                l();
                if (ta5.a.i(2)) {
                    ta5.e(this.a, "get (alloc) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(objA)), Integer.valueOf(iF));
                }
                return objA;
            } finally {
            }
        }
    }

    public abstract int h(int i);

    public synchronized Object i(ps0 ps0Var) {
        Object objB;
        objB = ps0Var.b();
        if (objB != null) {
            ps0Var.e++;
        }
        return objB;
    }

    public final synchronized boolean j() {
        boolean z;
        z = this.Z.c + this.s0.c > this.c.b;
        if (z) {
            this.t0.getClass();
        }
        return z;
    }

    public boolean k(Object obj) {
        obj.getClass();
        return true;
    }

    public final void l() {
        if (ta5.a.i(2)) {
            Integer numValueOf = Integer.valueOf(this.Z.b);
            int i = this.s0.b;
            if (ta5.a.i(2)) {
                ft7 ft7Var = ta5.a;
                String simpleName = this.a.getSimpleName();
                new StringBuilder("Used = (").append(numValueOf);
                ft7Var.b(simpleName);
            }
        }
    }

    public ps0 m(int i) {
        int iH = h(i);
        this.c.getClass();
        return new ps0(iH, Integer.MAX_VALUE, 0);
    }

    public final synchronized void n(int i) {
        try {
            int i2 = this.Z.c;
            int i3 = this.s0.c;
            int iMin = Math.min((i2 + i3) - i, i3);
            if (iMin <= 0) {
                return;
            }
            if (ta5.a.i(2)) {
                ta5.f(this.a, "trimToSize: TargetSize = %d; Initial Size = %d; Bytes to free = %d", Integer.valueOf(i), Integer.valueOf(this.Z.c + this.s0.c), Integer.valueOf(iMin));
            }
            l();
            for (int i4 = 0; i4 < this.o.size() && iMin > 0; i4++) {
                ps0 ps0Var = (ps0) this.o.valueAt(i4);
                ps0Var.getClass();
                while (iMin > 0) {
                    Object objB = ps0Var.b();
                    if (objB == null) {
                        break;
                    }
                    c(objB);
                    int i5 = ps0Var.a;
                    iMin -= i5;
                    this.s0.a(i5);
                }
            }
            l();
            if (ta5.a.i(2)) {
                ta5.e(this.a, "trimToSize: TargetSize = %d; Final Size = %d", Integer.valueOf(i), Integer.valueOf(this.Z.c + this.s0.c));
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
