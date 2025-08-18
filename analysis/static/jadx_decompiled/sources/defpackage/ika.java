package defpackage;

import java.lang.Thread;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public final class ika implements ThreadFactory {
    public final AtomicInteger X = new AtomicInteger(1);
    public final String a;
    public final Thread.UncaughtExceptionHandler b;
    public final int c;
    public final vse o;

    public ika(String str, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, int i, vse vseVar) {
        this.a = str;
        this.b = uncaughtExceptionHandler;
        this.c = i;
        this.o = vseVar;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        hka hkaVar = new hka(this.a + "-" + this.X.getAndIncrement(), runnable);
        hkaVar.setUncaughtExceptionHandler(this.b);
        hkaVar.setPriority(this.c);
        hkaVar.b = this.o;
        return hkaVar;
    }
}
