package defpackage;

import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class u04 implements ThreadFactory {
    public static final ThreadFactory X = Executors.defaultThreadFactory();
    public final AtomicLong a = new AtomicLong();
    public final String b;
    public final int c;
    public final StrictMode.ThreadPolicy o;

    public u04(String str, int i, StrictMode.ThreadPolicy threadPolicy) {
        this.b = str;
        this.c = i;
        this.o = threadPolicy;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = X.newThread(new wt1(this, 17, runnable));
        Locale locale = Locale.ROOT;
        threadNewThread.setName(this.b + " Thread #" + this.a.getAndIncrement());
        return threadNewThread;
    }
}
