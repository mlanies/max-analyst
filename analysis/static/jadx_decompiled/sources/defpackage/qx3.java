package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes.dex */
public final class qx3 extends Thread {
    public static final /* synthetic */ AtomicIntegerFieldUpdater t0 = AtomicIntegerFieldUpdater.newUpdater(qx3.class, "workerCtl$volatile");
    public long X;
    public int Y;
    public boolean Z;
    public final c8g a;
    public final mec b;
    public int c;
    private volatile int indexInArray;
    private volatile Object nextParkedWorker;
    public long o;
    public final /* synthetic */ rx3 s0;
    private volatile /* synthetic */ int workerCtl$volatile;

    public qx3(rx3 rx3Var, int i) {
        this.s0 = rx3Var;
        setDaemon(true);
        setContextClassLoader(rx3Var.getClass().getClassLoader());
        this.a = new c8g();
        this.b = new mec();
        this.c = 4;
        this.nextParkedWorker = rx3.v0;
        int iNanoTime = (int) System.nanoTime();
        this.Y = iNanoTime == 0 ? 42 : iNanoTime;
        f(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0045, code lost:
    
        r12 = defpackage.c8g.d.get(r3);
        r0 = defpackage.c8g.c.get(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0051, code lost:
    
        if (r12 == r0) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0059, code lost:
    
        if (defpackage.c8g.e.get(r3) != 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005c, code lost:
    
        r0 = r0 - 1;
        r5 = r3.c(r0, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0062, code lost:
    
        if (r5 == null) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0064, code lost:
    
        r2 = r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.nne a(boolean r12) {
        /*
            r11 = this;
            int r0 = r11.c
            r1 = 1
            r2 = 0
            c8g r3 = r11.a
            rx3 r4 = r11.s0
            if (r0 != r1) goto Lc
            goto L88
        Lc:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = defpackage.rx3.t0
        Le:
            rx3 r6 = r11.s0
            long r7 = r0.get(r6)
            r9 = 9223367638808264704(0x7ffffc0000000000, double:NaN)
            long r9 = r9 & r7
            r5 = 42
            long r9 = r9 >> r5
            int r5 = (int) r9
            if (r5 != 0) goto L77
            r3.getClass()
        L23:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r12 = defpackage.c8g.b
            java.lang.Object r0 = r12.get(r3)
            nne r0 = (defpackage.nne) r0
            if (r0 != 0) goto L2e
            goto L45
        L2e:
            sne r5 = r0.taskContext
            fm5 r5 = (defpackage.fm5) r5
            int r5 = r5.b
            if (r5 != r1) goto L45
        L36:
            boolean r5 = r12.compareAndSet(r3, r0, r2)
            if (r5 == 0) goto L3e
            r2 = r0
            goto L65
        L3e:
            java.lang.Object r5 = r12.get(r3)
            if (r5 == r0) goto L36
            goto L23
        L45:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r12 = defpackage.c8g.d
            int r12 = r12.get(r3)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = defpackage.c8g.c
            int r0 = r0.get(r3)
        L51:
            if (r12 == r0) goto L65
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r5 = defpackage.c8g.e
            int r5 = r5.get(r3)
            if (r5 != 0) goto L5c
            goto L65
        L5c:
            int r0 = r0 + (-1)
            nne r5 = r3.c(r0, r1)
            if (r5 == 0) goto L51
            r2 = r5
        L65:
            if (r2 != 0) goto L76
            yd6 r12 = r4.Y
            java.lang.Object r12 = r12.removeFirstOrNull()
            r2 = r12
            nne r2 = (defpackage.nne) r2
            if (r2 != 0) goto L76
            nne r2 = r11.i(r1)
        L76:
            return r2
        L77:
            r9 = 4398046511104(0x40000000000, double:2.1729236899484E-311)
            long r9 = r7 - r9
            java.util.concurrent.atomic.AtomicLongFieldUpdater r5 = defpackage.rx3.t0
            boolean r5 = r5.compareAndSet(r6, r7, r9)
            if (r5 == 0) goto Le
            r11.c = r1
        L88:
            if (r12 == 0) goto Lbc
            int r12 = r4.a
            int r12 = r12 * 2
            int r12 = r11.d(r12)
            if (r12 != 0) goto L95
            goto L96
        L95:
            r1 = 0
        L96:
            if (r1 == 0) goto L9f
            nne r12 = r11.e()
            if (r12 == 0) goto L9f
            goto Lc8
        L9f:
            r3.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r12 = defpackage.c8g.b
            java.lang.Object r12 = r12.getAndSet(r3, r2)
            nne r12 = (defpackage.nne) r12
            if (r12 != 0) goto Lb0
            nne r12 = r3.b()
        Lb0:
            if (r12 == 0) goto Lb3
            goto Lc8
        Lb3:
            if (r1 != 0) goto Lc3
            nne r12 = r11.e()
            if (r12 == 0) goto Lc3
            goto Lc8
        Lbc:
            nne r12 = r11.e()
            if (r12 == 0) goto Lc3
            goto Lc8
        Lc3:
            r12 = 3
            nne r12 = r11.i(r12)
        Lc8:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qx3.a(boolean):nne");
    }

    public final int b() {
        return this.indexInArray;
    }

    public final Object c() {
        return this.nextParkedWorker;
    }

    public final int d(int i) {
        int i2 = this.Y;
        int i3 = i2 ^ (i2 << 13);
        int i4 = i3 ^ (i3 >> 17);
        int i5 = i4 ^ (i4 << 5);
        this.Y = i5;
        int i6 = i - 1;
        return (i6 & i) == 0 ? i6 & i5 : (Integer.MAX_VALUE & i5) % i;
    }

    public final nne e() {
        int iD = d(2);
        rx3 rx3Var = this.s0;
        if (iD == 0) {
            nne nneVar = (nne) rx3Var.X.removeFirstOrNull();
            return nneVar != null ? nneVar : (nne) rx3Var.Y.removeFirstOrNull();
        }
        nne nneVar2 = (nne) rx3Var.Y.removeFirstOrNull();
        return nneVar2 != null ? nneVar2 : (nne) rx3Var.X.removeFirstOrNull();
    }

    public final void f(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.s0.o);
        sb.append("-worker-");
        sb.append(i == 0 ? "TERMINATED" : String.valueOf(i));
        setName(sb.toString());
        this.indexInArray = i;
    }

    public final void g(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean h(int i) {
        int i2 = this.c;
        boolean z = i2 == 1;
        if (z) {
            rx3.t0.addAndGet(this.s0, 4398046511104L);
        }
        if (i2 != i) {
            this.c = i;
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0082, code lost:
    
        r19 = r6;
        r6 = -2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.nne i(int r24) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qx3.i(int):nne");
    }

    /* JADX WARN: Code restructure failed: missing block: B:121:0x0004, code lost:
    
        continue;
     */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qx3.run():void");
    }
}
