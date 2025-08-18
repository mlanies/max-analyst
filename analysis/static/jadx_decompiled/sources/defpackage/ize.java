package defpackage;

import java.lang.Thread;

/* loaded from: classes2.dex */
public final class ize implements Thread.UncaughtExceptionHandler {
    /* JADX WARN: Removed duplicated region for block: B:14:0x002b  */
    @Override // java.lang.Thread.UncaughtExceptionHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void uncaughtException(java.lang.Thread r10, java.lang.Throwable r11) throws java.lang.InterruptedException {
        /*
            r9 = this;
            boolean r9 = defpackage.kye.b
            if (r9 == 0) goto L6
            goto Lcc
        L6:
            ty2 r9 = defpackage.pye.b     // Catch: java.lang.IllegalStateException -> Lcc
            if (r9 == 0) goto Lc0
            boolean r10 = defpackage.kye.b
            if (r10 == 0) goto L10
            goto Lcc
        L10:
            java.lang.Object r10 = r9.b
            kbd r10 = (defpackage.kbd) r10
            r10.getClass()
            r0 = 0
            r1 = 6
            r2 = 2
            r3 = 0
            defpackage.kbd.d(r10, r2, r3, r0, r1)
            l7b r10 = defpackage.dp3.b
            if (r10 == 0) goto Lb8
            java.lang.String r0 = "system.shutdown.until.ts"
            boolean r0 = defpackage.ju0.b(r10, r0)
            r1 = 1
            if (r0 == 0) goto L2d
        L2b:
            r3 = r1
            goto L49
        L2d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "system."
            r0.<init>(r2)
            java.lang.String r2 = "CRASH_REPORT"
            r0.append(r2)
            java.lang.String r2 = ".shutdown.until.ts"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            boolean r10 = defpackage.ju0.b(r10, r0)
            if (r10 == 0) goto L49
            goto L2b
        L49:
            if (r3 == 0) goto L4d
            goto Lcc
        L4d:
            java.lang.Object r10 = r9.a
            r2 = r10
            sy4 r2 = (defpackage.sy4) r2
            java.lang.Object r10 = r9.b
            kbd r10 = (defpackage.kbd) r10
            yie r5 = r10.c()
            java.lang.Object r10 = r9.c
            pje r10 = (defpackage.pje) r10
            java.util.ArrayList r0 = r10.e
            monitor-enter(r0)
            java.util.ArrayList r10 = r10.e     // Catch: java.lang.Throwable -> Lb5
            java.util.List r6 = defpackage.x53.D0(r10)     // Catch: java.lang.Throwable -> Lb5
            monitor-exit(r0)
            java.util.Map r7 = java.lang.Thread.getAllStackTraces()
            java.lang.Object r10 = r9.o
            zs7 r10 = (defpackage.zs7) r10
            java.util.concurrent.ConcurrentLinkedQueue r10 = r10.h
            java.util.List r8 = defpackage.x53.D0(r10)
            r3 = 1
            r4 = r11
            qy3 r10 = r2.N(r3, r4, r5, r6, r7, r8)
            if (r10 == 0) goto Lcc
            java.util.concurrent.CountDownLatch r11 = new java.util.concurrent.CountDownLatch
            r11.<init>(r1)
            f5 r0 = new f5
            r1 = 17
            r0.<init>(r9, r10, r11, r1)
            defpackage.hze.b(r0)
            android.os.Looper r10 = android.os.Looper.myLooper()
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            boolean r10 = defpackage.tpa.f(r10, r0)
            if (r10 == 0) goto L9e
            r0 = 5000(0x1388, double:2.4703E-320)
            goto La1
        L9e:
            r0 = 100000000(0x5f5e100, double:4.94065646E-316)
        La1:
            java.lang.Object r9 = r9.X
            lbd r9 = (defpackage.lbd) r9
            r9.getClass()
            android.os.ConditionVariable r9 = r9.a     // Catch: java.lang.Exception -> Laf
            if (r9 == 0) goto Laf
            r9.block(r0)     // Catch: java.lang.Exception -> Laf
        Laf:
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.MILLISECONDS
            r11.await(r0, r9)
            goto Lcc
        Lb5:
            r9 = move-exception
            monitor-exit(r0)
            throw r9
        Lb8:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Tracer settings are not initialized."
            r9.<init>(r10)
            throw r9
        Lc0:
            java.lang.String r9 = "Required value was null."
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch: java.lang.IllegalStateException -> Lcc
            java.lang.String r9 = r9.toString()     // Catch: java.lang.IllegalStateException -> Lcc
            r10.<init>(r9)     // Catch: java.lang.IllegalStateException -> Lcc
            throw r10     // Catch: java.lang.IllegalStateException -> Lcc
        Lcc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ize.uncaughtException(java.lang.Thread, java.lang.Throwable):void");
    }
}
