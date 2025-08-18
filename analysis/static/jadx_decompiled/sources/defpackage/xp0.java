package defpackage;

import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class xp0 {
    public static final xp0 d = new xp0();
    public final ExecutorService a;
    public final ScheduledExecutorService b;
    public final k40 c;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.util.concurrent.ExecutorService] */
    public xp0() {
        ThreadPoolExecutor threadPoolExecutorNewCachedThreadPool;
        String property = System.getProperty("java.runtime.name");
        if (property == null ? false : property.toLowerCase(Locale.US).contains("android")) {
            ld ldVar = ld.b;
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(ld.c, ld.d, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue());
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            threadPoolExecutorNewCachedThreadPool = threadPoolExecutor;
        } else {
            threadPoolExecutorNewCachedThreadPool = Executors.newCachedThreadPool();
        }
        this.a = threadPoolExecutorNewCachedThreadPool;
        this.b = Executors.newSingleThreadScheduledExecutor();
        k40 k40Var = new k40(2);
        k40Var.b = new ThreadLocal();
        this.c = k40Var;
    }
}
