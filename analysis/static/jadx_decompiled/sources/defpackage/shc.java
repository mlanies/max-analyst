package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class shc {
    public static final long d = TimeUnit.HOURS.toMillis(24);
    public static final long e = TimeUnit.MINUTES.toMillis(30);
    public final qaf a;
    public long b;
    public int c;

    public shc() {
        if (mq9.Z == null) {
            Pattern pattern = qaf.c;
            mq9.Z = new mq9(17);
        }
        mq9 mq9Var = mq9.Z;
        if (qaf.d == null) {
            qaf.d = new qaf(mq9Var);
        }
        this.a = qaf.d;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean a() {
        /*
            r4 = this;
            monitor-enter(r4)
            int r0 = r4.c     // Catch: java.lang.Throwable -> L19
            if (r0 == 0) goto L1b
            qaf r0 = r4.a     // Catch: java.lang.Throwable -> L19
            mq9 r0 = r0.a     // Catch: java.lang.Throwable -> L19
            r0.getClass()     // Catch: java.lang.Throwable -> L19
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L19
            long r2 = r4.b     // Catch: java.lang.Throwable -> L19
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L17
            goto L1b
        L17:
            r0 = 0
            goto L1c
        L19:
            r0 = move-exception
            goto L1e
        L1b:
            r0 = 1
        L1c:
            monitor-exit(r4)
            return r0
        L1e:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L19
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.shc.a():boolean");
    }

    public final synchronized void b(int i) {
        long jMin;
        if ((i >= 200 && i < 300) || i == 401 || i == 404) {
            synchronized (this) {
                this.c = 0;
            }
            return;
        }
        this.c++;
        synchronized (this) {
            if (i == 429 || (i >= 500 && i < 600)) {
                double dPow = Math.pow(2.0d, this.c);
                this.a.getClass();
                jMin = (long) Math.min(dPow + ((long) (Math.random() * 1000.0d)), e);
            } else {
                jMin = d;
            }
            this.a.a.getClass();
            this.b = System.currentTimeMillis() + jMin;
        }
        return;
    }
}
