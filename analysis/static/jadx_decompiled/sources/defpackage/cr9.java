package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import ru.ok.tamtam.android.prefs.PmsKey;

/* loaded from: classes2.dex */
public abstract class cr9 {
    public final sx3 a;
    public final je7 b;
    public x77 c;
    public a66 d;

    public cr9(sx3 sx3Var, je7 je7Var) {
        this.a = sx3Var;
        this.b = je7Var;
    }

    public final void a() {
        x77 x77Var = this.c;
        if (x77Var != null) {
            x77Var.cancel(null);
        }
        this.c = null;
        ar9 ar9Var = (ar9) this;
        ReentrantLock reentrantLock = ar9Var.f;
        reentrantLock.lock();
        try {
            ar9Var.e.c();
        } finally {
            reentrantLock.unlock();
        }
    }

    public final long b() {
        int i = ft4.o;
        z7d z7dVar = ((p7b) ((m7b) this.b.getValue())).b;
        z7dVar.getClass();
        return z7.S(z7dVar.q(PmsKey.f96noncontactcollectioninterval, TimeUnit.SECONDS.toMillis(10L)), kt4.MILLISECONDS);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r9v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.gi9 r10, kotlin.coroutines.Continuation r11) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r11 instanceof defpackage.br9
            if (r0 == 0) goto L13
            r0 = r11
            br9 r0 = (defpackage.br9) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            br9 r0 = new br9
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.X
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Z
            e5f r3 = defpackage.e5f.a
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L38
            if (r2 != r5) goto L30
            cr9 r9 = r0.o
            defpackage.od2.a0(r11)     // Catch: java.lang.Throwable -> L2c java.lang.Error -> L2e
            goto L90
        L2c:
            r10 = move-exception
            goto L75
        L2e:
            r9 = move-exception
            goto L91
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L38:
            defpackage.od2.a0(r11)
            java.lang.Class r11 = r9.getClass()
            java.lang.String r11 = r11.getName()
            ir6 r2 = defpackage.hm9.m
            if (r2 != 0) goto L48
            goto L5f
        L48:
            boolean r6 = r2.c()
            if (r6 == 0) goto L5f
            us7 r6 = defpackage.us7.X
            r7 = 31
            java.lang.String r7 = defpackage.gi9.k(r10, r4, r4, r7)
            java.lang.String r8 = "request ids "
            java.lang.String r7 = r8.concat(r7)
            r2.d(r6, r11, r7, r4)
        L5f:
            boolean r11 = r10.i()
            if (r11 == 0) goto L66
            return r3
        L66:
            a66 r11 = r9.d     // Catch: java.lang.Throwable -> L2c java.lang.Error -> L2e
            if (r11 == 0) goto L90
            r0.o = r9     // Catch: java.lang.Throwable -> L2c java.lang.Error -> L2e
            r0.Z = r5     // Catch: java.lang.Throwable -> L2c java.lang.Error -> L2e
            java.lang.Object r9 = r11.invoke(r10, r0)     // Catch: java.lang.Throwable -> L2c java.lang.Error -> L2e
            if (r9 != r1) goto L90
            return r1
        L75:
            r9.a()
            boolean r10 = r10 instanceof java.util.concurrent.CancellationException
            if (r10 == 0) goto L7d
            return r3
        L7d:
            ar9 r9 = (defpackage.ar9) r9
            r9.a()
            zq9 r10 = new zq9
            r10.<init>(r9, r4)
            r11 = 3
            sx3 r0 = r9.a
            vxd r10 = defpackage.j47.T(r0, r4, r4, r10, r11)
            r9.c = r10
        L90:
            return r3
        L91:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cr9.c(gi9, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
