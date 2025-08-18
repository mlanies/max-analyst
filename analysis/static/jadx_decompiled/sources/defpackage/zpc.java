package defpackage;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class zpc extends AtomicLong implements ThreadFactory {
    public final String a;
    public final int b;
    public final boolean c;

    public zpc(String str) {
        this(str, 5, false);
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        String str = this.a + '-' + incrementAndGet();
        Thread txVar = this.c ? new tx(str, runnable) : new Thread(runnable, str);
        txVar.setPriority(this.b);
        txVar.setDaemon(true);
        return txVar;
    }

    @Override // java.util.concurrent.atomic.AtomicLong
    public final String toString() {
        return zr6.l(new StringBuilder("RxThreadFactory["), this.a, "]");
    }

    public zpc(String str, int i, boolean z) {
        this.a = str;
        this.b = i;
        this.c = z;
    }
}
