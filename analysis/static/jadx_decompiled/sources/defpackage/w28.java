package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class w28 extends wk0 implements b38 {
    public final int Y;
    public volatile boolean Z;
    public final vae a;
    public final y28 o;
    public boolean s0;
    public long t0;
    public final hc3 b = new hc3();
    public final AtomicLong c = new AtomicLong();
    public final az X = new az();

    public w28(vae vaeVar, int i, y28 y28Var) {
        this.a = vaeVar;
        this.Y = i;
        this.o = y28Var;
    }

    @Override // defpackage.b38, defpackage.erd
    public final void a(Object obj) {
        this.o.offer(obj);
        g();
    }

    @Override // defpackage.b38, defpackage.ab3
    public final void b() {
        this.o.offer(hv9.a);
        g();
    }

    @Override // defpackage.b38, defpackage.erd
    public final void c(zl4 zl4Var) {
        this.b.a(zl4Var);
    }

    @Override // defpackage.xae
    public final void cancel() {
        if (this.Z) {
            return;
        }
        this.Z = true;
        this.b.g();
        if (getAndIncrement() == 0) {
            this.o.clear();
        }
    }

    @Override // defpackage.dqd
    public final void clear() {
        this.o.clear();
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x009d, code lost:
    
        if (r3 != r5) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a7, code lost:
    
        if (((java.lang.Throwable) r11.X.get()) == null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00a9, code lost:
    
        r2.clear();
        r11.X.e(r11.a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b8, code lost:
    
        if (r2.peek() != r8) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ba, code lost:
    
        r2.k();
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00c4, code lost:
    
        if (r2.i() != r11.Y) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00c6, code lost:
    
        r0.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00ca, code lost:
    
        r11.t0 = r3;
        r1 = addAndGet(-r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g() {
        /*
            r11 = this;
            int r0 = r11.getAndIncrement()
            if (r0 == 0) goto L7
            return
        L7:
            boolean r0 = r11.s0
            r1 = 1
            if (r0 == 0) goto L51
            vae r0 = r11.a
            y28 r2 = r11.o
            r3 = r1
        L11:
            boolean r4 = r11.Z
            if (r4 == 0) goto L1a
            r2.clear()
            goto Ld3
        L1a:
            az r4 = r11.X
            java.lang.Object r4 = r4.get()
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            if (r4 == 0) goto L2c
            r2.clear()
            r0.onError(r4)
            goto Ld3
        L2c:
            int r4 = r2.d()
            int r5 = r11.Y
            if (r4 != r5) goto L36
            r4 = r1
            goto L37
        L36:
            r4 = 0
        L37:
            boolean r5 = r2.isEmpty()
            if (r5 != 0) goto L41
            r5 = 0
            r0.e(r5)
        L41:
            if (r4 == 0) goto L48
            r0.b()
            goto Ld3
        L48:
            int r3 = -r3
            int r3 = r11.addAndGet(r3)
            if (r3 != 0) goto L11
            goto Ld3
        L51:
            vae r0 = r11.a
            y28 r2 = r11.o
            long r3 = r11.t0
        L57:
            java.util.concurrent.atomic.AtomicLong r5 = r11.c
            long r5 = r5.get()
        L5d:
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            hv9 r8 = defpackage.hv9.a
            if (r7 == 0) goto L9d
            boolean r9 = r11.Z
            if (r9 == 0) goto L6c
            r2.clear()
            goto Ld3
        L6c:
            az r9 = r11.X
            java.lang.Object r9 = r9.get()
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            if (r9 == 0) goto L81
            r2.clear()
            az r0 = r11.X
            vae r11 = r11.a
            r0.e(r11)
            goto Ld3
        L81:
            int r9 = r2.i()
            int r10 = r11.Y
            if (r9 != r10) goto L8d
            r0.b()
            goto Ld3
        L8d:
            java.lang.Object r9 = r2.poll()
            if (r9 != 0) goto L94
            goto L9d
        L94:
            if (r9 == r8) goto L5d
            r0.e(r9)
            r7 = 1
            long r3 = r3 + r7
            goto L5d
        L9d:
            if (r7 != 0) goto Lca
            az r5 = r11.X
            java.lang.Object r5 = r5.get()
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            if (r5 == 0) goto Lb4
            r2.clear()
            az r0 = r11.X
            vae r11 = r11.a
            r0.e(r11)
            goto Ld3
        Lb4:
            java.lang.Object r5 = r2.peek()
            if (r5 != r8) goto Lbe
            r2.k()
            goto Lb4
        Lbe:
            int r5 = r2.i()
            int r6 = r11.Y
            if (r5 != r6) goto Lca
            r0.b()
            goto Ld3
        Lca:
            r11.t0 = r3
            int r1 = -r1
            int r1 = r11.addAndGet(r1)
            if (r1 != 0) goto L57
        Ld3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w28.g():void");
    }

    @Override // defpackage.dqd
    public final boolean isEmpty() {
        return this.o.isEmpty();
    }

    @Override // defpackage.xae
    public final void j(long j) {
        if (zae.d(j)) {
            ngg.b(this.c, j);
            g();
        }
    }

    @Override // defpackage.uqb
    public final int n(int i) {
        this.s0 = true;
        return 2;
    }

    @Override // defpackage.b38, defpackage.erd
    public final void onError(Throwable th) {
        if (this.X.a(th)) {
            this.b.g();
            this.o.offer(hv9.a);
            g();
        }
    }

    @Override // defpackage.dqd
    public final Object poll() {
        Object objPoll;
        do {
            objPoll = this.o.poll();
        } while (objPoll == hv9.a);
        return objPoll;
    }
}
