package defpackage;

import android.view.View;
import java.util.logging.Level;

/* loaded from: classes2.dex */
public final class q57 implements Runnable {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ q57(int i, View view, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final void a() {
    }

    private final void b() {
        mne mneVarC;
        long jNanoTime;
        while (true) {
            synchronized (((foe) this.b)) {
                mneVarC = ((foe) this.b).c();
            }
            if (mneVarC == null) {
                return;
            }
            coe coeVar = mneVarC.a;
            boolean zIsLoggable = foe.i.isLoggable(Level.FINE);
            if (zIsLoggable) {
                coeVar.e.g.getClass();
                jNanoTime = System.nanoTime();
                wmd.c(mneVarC, coeVar, "starting");
            } else {
                jNanoTime = -1;
            }
            try {
                foe.a((foe) this.b, mneVarC);
                if (zIsLoggable) {
                    coeVar.e.g.getClass();
                    wmd.c(mneVarC, coeVar, "finished run in ".concat(wmd.p(System.nanoTime() - jNanoTime)));
                }
            } finally {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x004a, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0050, code lost:
    
        r1 = r1 | java.lang.Thread.interrupted();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0051, code lost:
    
        r4.run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0057, code lost:
    
        r4.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c() {
        /*
            r10 = this;
            r0 = 0
            r1 = r0
        L2:
            java.lang.Object r2 = r10.b     // Catch: java.lang.Throwable -> L55
            q6d r2 = (defpackage.q6d) r2     // Catch: java.lang.Throwable -> L55
            java.util.ArrayDeque r2 = r2.a     // Catch: java.lang.Throwable -> L55
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L55
            r3 = 1
            if (r0 != 0) goto L2c
            java.lang.Object r0 = r10.b     // Catch: java.lang.Throwable -> L20
            q6d r0 = (defpackage.q6d) r0     // Catch: java.lang.Throwable -> L20
            int r4 = r0.o     // Catch: java.lang.Throwable -> L20
            r5 = 4
            if (r4 != r5) goto L22
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L1f
            java.lang.Thread r10 = java.lang.Thread.currentThread()
            r10.interrupt()
        L1f:
            return
        L20:
            r10 = move-exception
            goto L5b
        L22:
            long r6 = r0.X     // Catch: java.lang.Throwable -> L20
            r8 = 1
            long r6 = r6 + r8
            r0.X = r6     // Catch: java.lang.Throwable -> L20
            r0.o = r5     // Catch: java.lang.Throwable -> L20
            r0 = r3
        L2c:
            java.lang.Object r4 = r10.b     // Catch: java.lang.Throwable -> L20
            q6d r4 = (defpackage.q6d) r4     // Catch: java.lang.Throwable -> L20
            java.util.ArrayDeque r4 = r4.a     // Catch: java.lang.Throwable -> L20
            java.lang.Object r4 = r4.poll()     // Catch: java.lang.Throwable -> L20
            java.lang.Runnable r4 = (java.lang.Runnable) r4     // Catch: java.lang.Throwable -> L20
            if (r4 != 0) goto L4b
            java.lang.Object r10 = r10.b     // Catch: java.lang.Throwable -> L20
            q6d r10 = (defpackage.q6d) r10     // Catch: java.lang.Throwable -> L20
            r10.o = r3     // Catch: java.lang.Throwable -> L20
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L4a
            java.lang.Thread r10 = java.lang.Thread.currentThread()
            r10.interrupt()
        L4a:
            return
        L4b:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            boolean r2 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L55
            r1 = r1 | r2
            r4.run()     // Catch: java.lang.Throwable -> L55 java.lang.RuntimeException -> L57
            goto L2
        L55:
            r10 = move-exception
            goto L5d
        L57:
            r4.toString()     // Catch: java.lang.Throwable -> L55
            goto L2
        L5b:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            throw r10     // Catch: java.lang.Throwable -> L55
        L5d:
            if (r1 == 0) goto L66
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L66:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q57.c():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:132:0x0299  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 922
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q57.run():void");
    }

    public /* synthetic */ q57(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
