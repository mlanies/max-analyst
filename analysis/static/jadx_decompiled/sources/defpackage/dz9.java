package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class dz9 extends AtomicInteger implements f2a, zl4 {
    public zl4 X;
    public volatile boolean Y;
    public volatile boolean Z;
    public dqd o;
    public final f2a s0;
    public final b66 t0;
    public Object v0;
    public volatile int w0;
    public final int c = 1;
    public final az a = new az();
    public final int b = 2;
    public final br5 u0 = new br5(1, this);

    public dz9(f2a f2aVar, b66 b66Var) {
        this.s0 = f2aVar;
        this.t0 = b66Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002c, code lost:
    
        r2.clear();
        r10.v0 = null;
        r3.d(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0034, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            r10 = this;
            int r0 = r10.getAndIncrement()
            if (r0 == 0) goto L7
            return
        L7:
            f2a r0 = r10.s0
            int r1 = r10.c
            dqd r2 = r10.o
            az r3 = r10.a
            r4 = 1
            r5 = r4
        L11:
            boolean r6 = r10.Z
            r7 = 0
            if (r6 == 0) goto L1d
            r2.clear()
            r10.v0 = r7
            goto L93
        L1d:
            int r6 = r10.w0
            java.lang.Object r8 = r3.get()
            r9 = 2
            if (r8 == 0) goto L35
            if (r1 == r4) goto L2c
            if (r1 != r9) goto L35
            if (r6 != 0) goto L35
        L2c:
            r2.clear()
            r10.v0 = r7
            r3.d(r0)
            return
        L35:
            r8 = 0
            if (r6 != 0) goto L86
            boolean r6 = r10.Y
            java.lang.Object r7 = r2.poll()     // Catch: java.lang.Throwable -> L74
            if (r7 != 0) goto L41
            r8 = r4
        L41:
            if (r6 == 0) goto L49
            if (r8 == 0) goto L49
            r3.d(r0)
            return
        L49:
            if (r8 == 0) goto L4c
            goto L93
        L4c:
            b66 r6 = r10.t0     // Catch: java.lang.Throwable -> L61
            java.lang.Object r6 = r6.mo131apply(r7)     // Catch: java.lang.Throwable -> L61
            java.lang.String r7 = "The mapper returned a null SingleSource"
            java.util.Objects.requireNonNull(r6, r7)     // Catch: java.lang.Throwable -> L61
            iqd r6 = (defpackage.iqd) r6     // Catch: java.lang.Throwable -> L61
            r10.w0 = r4
            br5 r7 = r10.u0
            r6.k(r7)
            goto L93
        L61:
            r1 = move-exception
            defpackage.c37.B(r1)
            zl4 r10 = r10.X
            r10.g()
            r2.clear()
            r3.a(r1)
            r3.d(r0)
            return
        L74:
            r1 = move-exception
            defpackage.c37.B(r1)
            r10.Z = r4
            zl4 r10 = r10.X
            r10.g()
            r3.a(r1)
            r3.d(r0)
            return
        L86:
            if (r6 != r9) goto L93
            java.lang.Object r6 = r10.v0
            r10.v0 = r7
            r0.e(r6)
            r10.w0 = r8
            goto L11
        L93:
            int r5 = -r5
            int r5 = r10.addAndGet(r5)
            if (r5 != 0) goto L11
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dz9.a():void");
    }

    @Override // defpackage.f2a
    public final void b() {
        this.Y = true;
        a();
    }

    @Override // defpackage.f2a
    public final void c(zl4 zl4Var) {
        if (dm4.f(this.X, zl4Var)) {
            this.X = zl4Var;
            if (zl4Var instanceof tqb) {
                tqb tqbVar = (tqb) zl4Var;
                int iN = tqbVar.n(7);
                if (iN == 1) {
                    this.o = tqbVar;
                    this.Y = true;
                    this.s0.c(this);
                    a();
                    return;
                }
                if (iN == 2) {
                    this.o = tqbVar;
                    this.s0.c(this);
                    return;
                }
            }
            this.o = new pwd(this.b);
            this.s0.c(this);
        }
    }

    @Override // defpackage.f2a
    public final void e(Object obj) {
        if (obj != null) {
            this.o.offer(obj);
        }
        a();
    }

    @Override // defpackage.zl4
    public final void g() {
        this.Z = true;
        this.X.g();
        br5 br5Var = this.u0;
        br5Var.getClass();
        dm4.a(br5Var);
        this.a.b();
        if (getAndIncrement() == 0) {
            this.o.clear();
            this.v0 = null;
        }
    }

    @Override // defpackage.zl4
    public final boolean h() {
        return this.Z;
    }

    @Override // defpackage.f2a
    public final void onError(Throwable th) {
        if (this.a.a(th)) {
            if (this.c == 1) {
                br5 br5Var = this.u0;
                br5Var.getClass();
                dm4.a(br5Var);
            }
            this.Y = true;
            a();
        }
    }
}
