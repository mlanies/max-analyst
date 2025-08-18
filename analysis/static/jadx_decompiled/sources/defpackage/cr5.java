package defpackage;

import io.reactivex.rxjava3.exceptions.QueueOverflowException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class cr5 extends AtomicInteger implements xae, gs5 {
    public volatile int A0;
    public xae X;
    public volatile boolean Y;
    public volatile boolean Z;
    public final int b;
    public final int c;
    public dqd o;
    public boolean s0;
    public final vae t0;
    public final b66 u0;
    public long x0;
    public int y0;
    public Object z0;
    public final az a = new az();
    public final AtomicLong v0 = new AtomicLong();
    public final br5 w0 = new br5(0, this);

    public cr5(vae vaeVar, b66 b66Var, int i, int i2) {
        this.c = i2;
        this.b = i;
        this.t0 = vaeVar;
        this.u0 = b66Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0037, code lost:
    
        r3.clear();
        r17.z0 = null;
        r4.e(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003f, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            r17 = this;
            r1 = r17
            int r0 = r17.getAndIncrement()
            if (r0 == 0) goto L9
            return
        L9:
            vae r2 = r1.t0
            int r0 = r1.c
            dqd r3 = r1.o
            az r4 = r1.a
            java.util.concurrent.atomic.AtomicLong r5 = r1.v0
            int r6 = r1.b
            int r7 = r6 >> 1
            int r6 = r6 - r7
            boolean r7 = r1.s0
            r8 = 1
            r9 = r8
        L1c:
            boolean r10 = r1.Z
            r11 = 0
            if (r10 == 0) goto L28
            r3.clear()
            r1.z0 = r11
            goto Lc0
        L28:
            int r10 = r1.A0
            java.lang.Object r12 = r4.get()
            r13 = 2
            if (r12 == 0) goto L40
            if (r0 == r8) goto L37
            if (r0 != r13) goto L40
            if (r10 != 0) goto L40
        L37:
            r3.clear()
            r1.z0 = r11
            r4.e(r2)
            return
        L40:
            r12 = 0
            if (r10 != 0) goto La4
            boolean r10 = r1.Y
            java.lang.Object r11 = r3.poll()     // Catch: java.lang.Throwable -> L93
            if (r11 != 0) goto L4d
            r13 = r8
            goto L4e
        L4d:
            r13 = r12
        L4e:
            if (r10 == 0) goto L56
            if (r13 == 0) goto L56
            r4.e(r2)
            return
        L56:
            if (r13 == 0) goto L59
            goto Lc0
        L59:
            if (r7 != 0) goto L6b
            int r10 = r1.y0
            int r10 = r10 + r8
            if (r10 != r6) goto L69
            r1.y0 = r12
            xae r10 = r1.X
            long r12 = (long) r6
            r10.j(r12)
            goto L6b
        L69:
            r1.y0 = r10
        L6b:
            b66 r10 = r1.u0     // Catch: java.lang.Throwable -> L80
            java.lang.Object r10 = r10.mo131apply(r11)     // Catch: java.lang.Throwable -> L80
            java.lang.String r11 = "The mapper returned a null SingleSource"
            java.util.Objects.requireNonNull(r10, r11)     // Catch: java.lang.Throwable -> L80
            iqd r10 = (defpackage.iqd) r10     // Catch: java.lang.Throwable -> L80
            r1.A0 = r8
            br5 r11 = r1.w0
            r10.k(r11)
            goto Lc0
        L80:
            r0 = move-exception
            defpackage.c37.B(r0)
            xae r1 = r1.X
            r1.cancel()
            r3.clear()
            r4.a(r0)
            r4.e(r2)
            return
        L93:
            r0 = move-exception
            r3 = r0
            defpackage.c37.B(r3)
            xae r0 = r1.X
            r0.cancel()
            r4.a(r3)
            r4.e(r2)
            return
        La4:
            if (r10 != r13) goto Lc0
            long r13 = r1.x0
            long r15 = r5.get()
            int r10 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r10 == 0) goto Lc0
            java.lang.Object r10 = r1.z0
            r1.z0 = r11
            r2.e(r10)
            r10 = 1
            long r13 = r13 + r10
            r1.x0 = r13
            r1.A0 = r12
            goto L1c
        Lc0:
            int r9 = -r9
            int r9 = r1.addAndGet(r9)
            if (r9 != 0) goto L1c
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cr5.a():void");
    }

    @Override // defpackage.vae
    public final void b() {
        this.Y = true;
        a();
    }

    @Override // defpackage.xae
    public final void cancel() {
        this.Z = true;
        this.X.cancel();
        br5 br5Var = this.w0;
        br5Var.getClass();
        dm4.a(br5Var);
        this.a.b();
        if (getAndIncrement() == 0) {
            this.o.clear();
            this.z0 = null;
        }
    }

    @Override // defpackage.vae
    public final void e(Object obj) {
        if (obj == null || this.o.offer(obj)) {
            a();
        } else {
            this.X.cancel();
            onError(new QueueOverflowException());
        }
    }

    @Override // defpackage.vae
    public final void f(xae xaeVar) {
        if (zae.e(this.X, xaeVar)) {
            this.X = xaeVar;
            if (xaeVar instanceof vqb) {
                vqb vqbVar = (vqb) xaeVar;
                int iN = vqbVar.n(7);
                if (iN == 1) {
                    this.o = vqbVar;
                    this.s0 = true;
                    this.Y = true;
                    this.t0.f(this);
                    a();
                    return;
                }
                if (iN == 2) {
                    this.o = vqbVar;
                    this.t0.f(this);
                    this.X.j(this.b);
                    return;
                }
            }
            this.o = new owd(this.b);
            this.t0.f(this);
            this.X.j(this.b);
        }
    }

    @Override // defpackage.xae
    public final void j(long j) {
        ngg.b(this.v0, j);
        a();
    }

    @Override // defpackage.vae
    public final void onError(Throwable th) {
        if (this.a.a(th)) {
            if (this.c == 1) {
                br5 br5Var = this.w0;
                br5Var.getClass();
                dm4.a(br5Var);
            }
            this.Y = true;
            a();
        }
    }
}
