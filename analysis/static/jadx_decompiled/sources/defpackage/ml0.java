package defpackage;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes.dex */
public final class ml0 extends vg3 {
    public static final ll0[] Z = new ll0[0];
    public static final ll0[] s0 = new ll0[0];
    public final AtomicReference X;
    public long Y;
    public final AtomicReference a;
    public final AtomicReference b;
    public final Lock c;
    public final Lock o;

    public ml0(Object obj) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.c = reentrantReadWriteLock.readLock();
        this.o = reentrantReadWriteLock.writeLock();
        this.b = new AtomicReference(Z);
        this.a = new AtomicReference(obj);
        this.X = new AtomicReference();
    }

    public static ml0 z(Object obj) {
        Objects.requireNonNull(obj, "defaultValue is null");
        return new ml0(obj);
    }

    public final Object A() {
        Object obj = this.a.get();
        if (obj == hv9.a || (obj instanceof fv9)) {
            return null;
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void B(ll0 ll0Var) {
        ll0[] ll0VarArr;
        while (true) {
            AtomicReference atomicReference = this.b;
            ll0[] ll0VarArr2 = (ll0[]) atomicReference.get();
            int length = ll0VarArr2.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (ll0VarArr2[i] == ll0Var) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                ll0VarArr = Z;
            } else {
                ll0[] ll0VarArr3 = new ll0[length - 1];
                System.arraycopy(ll0VarArr2, 0, ll0VarArr3, 0, i);
                System.arraycopy(ll0VarArr2, i + 1, ll0VarArr3, i, (length - i) - 1);
                ll0VarArr = ll0VarArr3;
            }
            while (!atomicReference.compareAndSet(ll0VarArr2, ll0VarArr)) {
                if (atomicReference.get() != ll0VarArr2) {
                    break;
                }
            }
            return;
        }
    }

    @Override // defpackage.f2a
    public final void b() {
        AtomicReference atomicReference = this.X;
        p45 p45Var = q45.a;
        while (!atomicReference.compareAndSet(null, p45Var)) {
            if (atomicReference.get() != null) {
                return;
            }
        }
        hv9 hv9Var = hv9.a;
        Lock lock = this.o;
        lock.lock();
        this.Y++;
        this.a.lazySet(hv9Var);
        lock.unlock();
        for (ll0 ll0Var : (ll0[]) this.b.getAndSet(s0)) {
            ll0Var.a(this.Y, hv9Var);
        }
    }

    @Override // defpackage.f2a
    public final void c(zl4 zl4Var) {
        if (this.X.get() != null) {
            zl4Var.g();
        }
    }

    @Override // defpackage.f2a
    public final void e(Object obj) {
        q45.c(obj, "onNext called with a null value.");
        if (this.X.get() != null) {
            return;
        }
        Lock lock = this.o;
        lock.lock();
        this.Y++;
        this.a.lazySet(obj);
        lock.unlock();
        for (ll0 ll0Var : (ll0[]) this.b.get()) {
            ll0Var.a(this.Y, obj);
        }
    }

    @Override // defpackage.f2a
    public final void onError(Throwable th) {
        q45.c(th, "onError called with a null Throwable.");
        AtomicReference atomicReference = this.X;
        while (!atomicReference.compareAndSet(null, th)) {
            if (atomicReference.get() != null) {
                j47.Z(th);
                return;
            }
        }
        fv9 fv9Var = new fv9(th);
        Lock lock = this.o;
        lock.lock();
        this.Y++;
        this.a.lazySet(fv9Var);
        lock.unlock();
        for (ll0 ll0Var : (ll0[]) this.b.getAndSet(s0)) {
            ll0Var.a(this.Y, fv9Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0089, code lost:
    
        r0.o = false;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.qy9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q(defpackage.f2a r7) {
        /*
            r6 = this;
            ll0 r0 = new ll0
            r0.<init>(r7, r6)
            r7.c(r0)
        L8:
            java.util.concurrent.atomic.AtomicReference r1 = r6.b
            java.lang.Object r2 = r1.get()
            ll0[] r2 = (defpackage.ll0[]) r2
            ll0[] r3 = defpackage.ml0.s0
            if (r2 != r3) goto L2a
            java.util.concurrent.atomic.AtomicReference r6 = r6.X
            java.lang.Object r6 = r6.get()
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            p45 r0 = defpackage.q45.a
            if (r6 != r0) goto L25
            r7.b()
            goto L99
        L25:
            r7.onError(r6)
            goto L99
        L2a:
            int r3 = r2.length
            int r4 = r3 + 1
            ll0[] r4 = new defpackage.ll0[r4]
            r5 = 0
            java.lang.System.arraycopy(r2, r5, r4, r5, r3)
            r4[r3] = r0
        L35:
            boolean r3 = r1.compareAndSet(r2, r4)
            if (r3 == 0) goto L9c
            boolean r7 = r0.Z
            if (r7 == 0) goto L43
            r6.B(r0)
            goto L99
        L43:
            boolean r6 = r0.Z
            if (r6 == 0) goto L48
            goto L99
        L48:
            monitor-enter(r0)
            boolean r6 = r0.Z     // Catch: java.lang.Throwable -> L4f
            if (r6 == 0) goto L51
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4f
            goto L99
        L4f:
            r6 = move-exception
            goto L9a
        L51:
            boolean r6 = r0.c     // Catch: java.lang.Throwable -> L4f
            if (r6 == 0) goto L57
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4f
            goto L99
        L57:
            ml0 r6 = r0.b     // Catch: java.lang.Throwable -> L4f
            java.util.concurrent.locks.Lock r7 = r6.c     // Catch: java.lang.Throwable -> L4f
            r7.lock()     // Catch: java.lang.Throwable -> L4f
            long r1 = r6.Y     // Catch: java.lang.Throwable -> L4f
            r0.s0 = r1     // Catch: java.lang.Throwable -> L4f
            java.util.concurrent.atomic.AtomicReference r6 = r6.a     // Catch: java.lang.Throwable -> L4f
            java.lang.Object r6 = r6.get()     // Catch: java.lang.Throwable -> L4f
            r7.unlock()     // Catch: java.lang.Throwable -> L4f
            r7 = 1
            if (r6 == 0) goto L70
            r1 = r7
            goto L71
        L70:
            r1 = r5
        L71:
            r0.o = r1     // Catch: java.lang.Throwable -> L4f
            r0.c = r7     // Catch: java.lang.Throwable -> L4f
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4f
            if (r6 == 0) goto L99
            boolean r6 = r0.test(r6)
            if (r6 == 0) goto L7f
            goto L99
        L7f:
            boolean r6 = r0.Z
            if (r6 == 0) goto L84
            goto L99
        L84:
            monitor-enter(r0)
            jn r6 = r0.X     // Catch: java.lang.Throwable -> L8d
            if (r6 != 0) goto L8f
            r0.o = r5     // Catch: java.lang.Throwable -> L8d
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8d
            goto L99
        L8d:
            r6 = move-exception
            goto L97
        L8f:
            r7 = 0
            r0.X = r7     // Catch: java.lang.Throwable -> L8d
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8d
            r6.p(r0)
            goto L7f
        L97:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8d
            throw r6
        L99:
            return
        L9a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4f
            throw r6
        L9c:
            java.lang.Object r3 = r1.get()
            if (r3 == r2) goto L35
            goto L8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ml0.q(f2a):void");
    }
}
