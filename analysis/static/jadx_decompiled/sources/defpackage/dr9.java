package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes2.dex */
public final class dr9 implements qu7 {
    public final khe a;
    public final khe b;
    public final cr9 c;

    public dr9(je7 je7Var, je7 je7Var2, je7 je7Var3) {
        this.a = new khe(new dr(je7Var2, je7Var3, 7));
        khe kheVar = new khe(new yf3(this, 21, je7Var));
        this.b = kheVar;
        this.c = (cr9) kheVar.getValue();
    }

    @Override // defpackage.qu7
    public final void a() {
        ((cr9) this.b.getValue()).a();
    }

    public final void b(long j) {
        ar9 ar9Var = (ar9) ((cr9) this.b.getValue());
        if (ar9Var.e()) {
            ReentrantLock reentrantLock = ar9Var.f;
            reentrantLock.lock();
            try {
                ar9Var.e.a(j);
                reentrantLock.unlock();
                ar9Var.d();
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(defpackage.gi9 r15) {
        /*
            r14 = this;
            khe r14 = r14.b
            java.lang.Object r14 = r14.getValue()
            cr9 r14 = (defpackage.cr9) r14
            ar9 r14 = (defpackage.ar9) r14
            r14.getClass()
            boolean r0 = r15.i()
            if (r0 != 0) goto L72
            boolean r0 = r14.e()
            if (r0 != 0) goto L1a
            goto L72
        L1a:
            java.util.concurrent.locks.ReentrantLock r0 = r14.f
            r0.lock()
            long[] r1 = r15.b     // Catch: java.lang.Throwable -> L5a
            long[] r15 = r15.a     // Catch: java.lang.Throwable -> L5a
            int r2 = r15.length     // Catch: java.lang.Throwable -> L5a
            int r2 = r2 + (-2)
            if (r2 < 0) goto L67
            r3 = 0
            r4 = r3
        L2a:
            r5 = r15[r4]     // Catch: java.lang.Throwable -> L5a
            long r7 = ~r5     // Catch: java.lang.Throwable -> L5a
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L62
            int r7 = r4 - r2
            int r7 = ~r7     // Catch: java.lang.Throwable -> L5a
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r3
        L44:
            if (r9 >= r7) goto L60
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L5c
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r1[r10]     // Catch: java.lang.Throwable -> L5a
            gi9 r12 = r14.e     // Catch: java.lang.Throwable -> L5a
            r12.a(r10)     // Catch: java.lang.Throwable -> L5a
            goto L5c
        L5a:
            r14 = move-exception
            goto L6e
        L5c:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L44
        L60:
            if (r7 != r8) goto L67
        L62:
            if (r4 == r2) goto L67
            int r4 = r4 + 1
            goto L2a
        L67:
            r0.unlock()
            r14.d()
            goto L72
        L6e:
            r0.unlock()
            throw r14
        L72:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dr9.c(gi9):void");
    }

    public final void d(Collection collection) {
        ar9 ar9Var = (ar9) ((cr9) this.b.getValue());
        ar9Var.getClass();
        if (collection.isEmpty() || !ar9Var.e()) {
            return;
        }
        ReentrantLock reentrantLock = ar9Var.f;
        reentrantLock.lock();
        try {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                ar9Var.e.a(((Number) it.next()).longValue());
            }
            reentrantLock.unlock();
            ar9Var.d();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
