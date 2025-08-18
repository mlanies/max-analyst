package defpackage;

import io.reactivex.rxjava3.exceptions.CompositeException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class j28 extends AtomicReference implements l28, zl4, erd, b38 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ j28(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004b  */
    @Override // defpackage.erd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.lang.Object r4) {
        /*
            r3 = this;
            int r0 = r3.a
            switch(r0) {
                case 0: goto La0;
                case 1: goto L8a;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r3.b
            d0a r0 = (defpackage.d0a) r0
            hc3 r1 = r0.o
            r1.c(r3)
            int r3 = r0.get()
            if (r3 != 0) goto L4b
            r3 = 0
            r1 = 1
            boolean r2 = r0.compareAndSet(r3, r1)
            if (r2 == 0) goto L4b
            f2a r2 = r0.b
            r2.e(r4)
            java.util.concurrent.atomic.AtomicInteger r4 = r0.X
            int r4 = r4.decrementAndGet()
            if (r4 != 0) goto L2a
            r3 = r1
        L2a:
            java.util.concurrent.atomic.AtomicReference r4 = r0.s0
            java.lang.Object r4 = r4.get()
            pwd r4 = (defpackage.pwd) r4
            if (r3 == 0) goto L44
            if (r4 == 0) goto L3c
            boolean r3 = r4.isEmpty()
            if (r3 == 0) goto L44
        L3c:
            az r3 = r0.Y
            f2a r4 = r0.b
            r3.d(r4)
            goto L86
        L44:
            int r3 = r0.decrementAndGet()
            if (r3 != 0) goto L83
            goto L86
        L4b:
            java.util.concurrent.atomic.AtomicReference r1 = r0.s0
            java.lang.Object r3 = r1.get()
            pwd r3 = (defpackage.pwd) r3
            if (r3 == 0) goto L56
            goto L72
        L56:
            pwd r2 = new pwd
            int r3 = defpackage.wq5.a
            r2.<init>(r3)
        L5d:
            r3 = 0
            boolean r3 = r1.compareAndSet(r3, r2)
            if (r3 == 0) goto L66
            r3 = r2
            goto L72
        L66:
            java.lang.Object r3 = r1.get()
            if (r3 == 0) goto L5d
            java.lang.Object r3 = r1.get()
            pwd r3 = (defpackage.pwd) r3
        L72:
            monitor-enter(r3)
            r3.offer(r4)     // Catch: java.lang.Throwable -> L87
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L87
            java.util.concurrent.atomic.AtomicInteger r3 = r0.X
            r3.decrementAndGet()
            int r3 = r0.getAndIncrement()
            if (r3 == 0) goto L83
            goto L86
        L83:
            r0.a()
        L86:
            return
        L87:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L87
            throw r4
        L8a:
            dm4 r0 = defpackage.dm4.a     // Catch: java.lang.Throwable -> L98
            r3.lazySet(r0)     // Catch: java.lang.Throwable -> L98
            java.lang.Object r3 = r3.b     // Catch: java.lang.Throwable -> L98
            ol0 r3 = (defpackage.ol0) r3     // Catch: java.lang.Throwable -> L98
            r0 = 0
            r3.accept(r4, r0)     // Catch: java.lang.Throwable -> L98
            goto L9f
        L98:
            r3 = move-exception
            defpackage.c37.B(r3)
            defpackage.j47.Z(r3)
        L9f:
            return
        La0:
            java.lang.Object r0 = r3.get()
            dm4 r1 = defpackage.dm4.a
            if (r0 == r1) goto Ld1
            java.lang.Object r0 = r3.getAndSet(r1)
            zl4 r0 = (defpackage.zl4) r0
            if (r0 == r1) goto Ld1
            java.lang.Object r3 = r3.b
            b38 r3 = (defpackage.b38) r3
            if (r4 != 0) goto Lc2
            java.lang.String r4 = "onSuccess called with a null value."
            java.lang.NullPointerException r4 = defpackage.q45.b(r4)     // Catch: java.lang.Throwable -> Lc0
            r3.onError(r4)     // Catch: java.lang.Throwable -> Lc0
            goto Lc5
        Lc0:
            r3 = move-exception
            goto Lcb
        Lc2:
            r3.a(r4)     // Catch: java.lang.Throwable -> Lc0
        Lc5:
            if (r0 == 0) goto Ld1
            r0.g()
            goto Ld1
        Lcb:
            if (r0 == 0) goto Ld0
            r0.g()
        Ld0:
            throw r3
        Ld1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j28.a(java.lang.Object):void");
    }

    @Override // defpackage.b38, defpackage.ab3
    public void b() {
        zl4 zl4Var;
        switch (this.a) {
            case 0:
                Object obj = get();
                dm4 dm4Var = dm4.a;
                if (obj == dm4Var || (zl4Var = (zl4) getAndSet(dm4Var)) == dm4Var) {
                    return;
                }
                try {
                    ((b38) this.b).b();
                    if (zl4Var != null) {
                        return;
                    } else {
                        return;
                    }
                } finally {
                    if (zl4Var != null) {
                        zl4Var.g();
                    }
                }
            default:
                d0a d0aVar = (d0a) this.b;
                d0aVar.o.c(this);
                int i = d0aVar.get();
                AtomicInteger atomicInteger = d0aVar.X;
                if (i == 0) {
                    if (d0aVar.compareAndSet(0, 1)) {
                        boolean z = atomicInteger.decrementAndGet() == 0;
                        pwd pwdVar = (pwd) d0aVar.s0.get();
                        if (z && (pwdVar == null || pwdVar.isEmpty())) {
                            d0aVar.Y.d(d0aVar.b);
                            return;
                        } else {
                            if (d0aVar.decrementAndGet() == 0) {
                                return;
                            }
                            d0aVar.a();
                            return;
                        }
                    }
                }
                atomicInteger.decrementAndGet();
                if (d0aVar.getAndIncrement() == 0) {
                    d0aVar.a();
                    return;
                }
                return;
        }
    }

    @Override // defpackage.erd
    public void c(zl4 zl4Var) {
        switch (this.a) {
            case 1:
                dm4.e(this, zl4Var);
                break;
            default:
                dm4.e(this, zl4Var);
                break;
        }
    }

    @Override // defpackage.zl4
    public final void g() {
        switch (this.a) {
            case 0:
                dm4.a(this);
                break;
            case 1:
                dm4.a(this);
                break;
            default:
                dm4.a(this);
                break;
        }
    }

    @Override // defpackage.zl4
    public final boolean h() {
        switch (this.a) {
            case 1:
                if (get() == dm4.a) {
                }
                break;
        }
        return dm4.b((zl4) get());
    }

    @Override // defpackage.erd
    public final void onError(Throwable th) {
        zl4 zl4Var;
        switch (this.a) {
            case 0:
                Throwable thB = th == null ? q45.b("onError called with a null Throwable.") : th;
                Object obj = get();
                dm4 dm4Var = dm4.a;
                if (obj == dm4Var || (zl4Var = (zl4) getAndSet(dm4Var)) == dm4Var) {
                    j47.Z(th);
                    return;
                }
                try {
                    ((b38) this.b).onError(thB);
                    if (zl4Var != null) {
                        return;
                    } else {
                        return;
                    }
                } finally {
                    if (zl4Var != null) {
                        zl4Var.g();
                    }
                }
            case 1:
                try {
                    lazySet(dm4.a);
                    ((ol0) this.b).accept(null, th);
                    return;
                } catch (Throwable th2) {
                    c37.B(th2);
                    j47.Z(new CompositeException(th, th2));
                    return;
                }
            default:
                d0a d0aVar = (d0a) this.b;
                hc3 hc3Var = d0aVar.o;
                hc3Var.c(this);
                if (d0aVar.Y.a(th)) {
                    if (!d0aVar.c) {
                        d0aVar.t0.g();
                        hc3Var.g();
                    }
                    d0aVar.X.decrementAndGet();
                    if (d0aVar.getAndIncrement() == 0) {
                        d0aVar.a();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public String toString() {
        switch (this.a) {
            case 0:
                return j28.class.getSimpleName() + "{" + super.toString() + "}";
            default:
                return super.toString();
        }
    }

    public j28(d0a d0aVar) {
        this.a = 2;
        this.b = d0aVar;
    }
}
