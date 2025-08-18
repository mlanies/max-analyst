package defpackage;

/* loaded from: classes.dex */
public final class q0a extends vk0 implements f2a, Runnable {
    public dqd X;
    public zl4 Y;
    public Throwable Z;
    public final f2a a;
    public final xtc b;
    public final boolean c = false;
    public final int o;
    public volatile boolean s0;
    public volatile boolean t0;
    public int u0;
    public boolean v0;

    public q0a(f2a f2aVar, xtc xtcVar, int i) {
        this.a = f2aVar;
        this.b = xtcVar;
        this.o = i;
    }

    @Override // defpackage.f2a
    public final void b() {
        if (this.s0) {
            return;
        }
        this.s0 = true;
        if (getAndIncrement() == 0) {
            this.b.b(this);
        }
    }

    @Override // defpackage.f2a
    public final void c(zl4 zl4Var) {
        if (dm4.f(this.Y, zl4Var)) {
            this.Y = zl4Var;
            if (zl4Var instanceof tqb) {
                tqb tqbVar = (tqb) zl4Var;
                int iN = tqbVar.n(7);
                if (iN == 1) {
                    this.u0 = iN;
                    this.X = tqbVar;
                    this.s0 = true;
                    this.a.c(this);
                    if (getAndIncrement() == 0) {
                        this.b.b(this);
                        return;
                    }
                    return;
                }
                if (iN == 2) {
                    this.u0 = iN;
                    this.X = tqbVar;
                    this.a.c(this);
                    return;
                }
            }
            this.X = new pwd(this.o);
            this.a.c(this);
        }
    }

    @Override // defpackage.dqd
    public final void clear() {
        this.X.clear();
    }

    @Override // defpackage.f2a
    public final void e(Object obj) {
        if (this.s0) {
            return;
        }
        if (this.u0 != 2) {
            this.X.offer(obj);
        }
        if (getAndIncrement() == 0) {
            this.b.b(this);
        }
    }

    public final boolean f(boolean z, boolean z2, f2a f2aVar) {
        if (this.t0) {
            this.X.clear();
            return true;
        }
        if (!z) {
            return false;
        }
        Throwable th = this.Z;
        if (this.c) {
            if (!z2) {
                return false;
            }
            this.t0 = true;
            if (th != null) {
                f2aVar.onError(th);
            } else {
                f2aVar.b();
            }
            this.b.g();
            return true;
        }
        if (th != null) {
            this.t0 = true;
            this.X.clear();
            f2aVar.onError(th);
            this.b.g();
            return true;
        }
        if (!z2) {
            return false;
        }
        this.t0 = true;
        f2aVar.b();
        this.b.g();
        return true;
    }

    @Override // defpackage.zl4
    public final void g() {
        if (this.t0) {
            return;
        }
        this.t0 = true;
        this.Y.g();
        this.b.g();
        if (this.v0 || getAndIncrement() != 0) {
            return;
        }
        this.X.clear();
    }

    @Override // defpackage.zl4
    public final boolean h() {
        return this.t0;
    }

    @Override // defpackage.dqd
    public final boolean isEmpty() {
        return this.X.isEmpty();
    }

    @Override // defpackage.uqb
    public final int n(int i) {
        this.v0 = true;
        return 2;
    }

    @Override // defpackage.f2a
    public final void onError(Throwable th) {
        if (this.s0) {
            j47.Z(th);
            return;
        }
        this.Z = th;
        this.s0 = true;
        if (getAndIncrement() == 0) {
            this.b.b(this);
        }
    }

    @Override // defpackage.dqd
    public final Object poll() {
        return this.X.poll();
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0075, code lost:
    
        r3 = addAndGet(-r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x007a, code lost:
    
        if (r3 != 0) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:?, code lost:
    
        return;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r7 = this;
            boolean r0 = r7.v0
            r1 = 1
            if (r0 == 0) goto L4f
            r0 = r1
        L6:
            boolean r2 = r7.t0
            if (r2 == 0) goto Lc
            goto L97
        Lc:
            boolean r2 = r7.s0
            java.lang.Throwable r3 = r7.Z
            boolean r4 = r7.c
            if (r4 != 0) goto L28
            if (r2 == 0) goto L28
            if (r3 == 0) goto L28
            r7.t0 = r1
            f2a r0 = r7.a
            java.lang.Throwable r1 = r7.Z
            r0.onError(r1)
            xtc r7 = r7.b
            r7.g()
            goto L97
        L28:
            f2a r3 = r7.a
            r4 = 0
            r3.e(r4)
            if (r2 == 0) goto L47
            r7.t0 = r1
            java.lang.Throwable r0 = r7.Z
            if (r0 == 0) goto L3c
            f2a r1 = r7.a
            r1.onError(r0)
            goto L41
        L3c:
            f2a r0 = r7.a
            r0.b()
        L41:
            xtc r7 = r7.b
            r7.g()
            goto L97
        L47:
            int r0 = -r0
            int r0 = r7.addAndGet(r0)
            if (r0 != 0) goto L6
            goto L97
        L4f:
            dqd r0 = r7.X
            f2a r2 = r7.a
            r3 = r1
        L54:
            boolean r4 = r7.s0
            boolean r5 = r0.isEmpty()
            boolean r4 = r7.f(r4, r5, r2)
            if (r4 == 0) goto L61
            goto L97
        L61:
            boolean r4 = r7.s0
            java.lang.Object r5 = r0.poll()     // Catch: java.lang.Throwable -> L81
            if (r5 != 0) goto L6b
            r6 = r1
            goto L6c
        L6b:
            r6 = 0
        L6c:
            boolean r4 = r7.f(r4, r6, r2)
            if (r4 == 0) goto L73
            goto L97
        L73:
            if (r6 == 0) goto L7d
            int r3 = -r3
            int r3 = r7.addAndGet(r3)
            if (r3 != 0) goto L54
            goto L97
        L7d:
            r2.e(r5)
            goto L61
        L81:
            r3 = move-exception
            defpackage.c37.B(r3)
            r7.t0 = r1
            zl4 r1 = r7.Y
            r1.g()
            r0.clear()
            r2.onError(r3)
            xtc r7 = r7.b
            r7.g()
        L97:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q0a.run():void");
    }
}
