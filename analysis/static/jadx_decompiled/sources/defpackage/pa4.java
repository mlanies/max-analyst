package defpackage;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import kotlinx.coroutines.internal.Symbol;

/* loaded from: classes.dex */
public final class pa4 extends z35 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;
    public static final pa4 s0;
    public static final long t0;

    static {
        Long l;
        pa4 pa4Var = new pa4();
        s0 = pa4Var;
        pa4Var.S(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        t0 = timeUnit.toNanos(l.longValue());
    }

    @Override // defpackage.z35, defpackage.hg4
    public final cm4 invokeOnTimeout(long j, Runnable runnable, lx3 lx3Var) {
        Symbol symbol = b45.a;
        long j2 = j > 0 ? j >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j : 0L;
        if (j2 >= 4611686018427387903L) {
            return er9.a;
        }
        long jNanoTime = System.nanoTime();
        w35 w35Var = new w35(runnable, j2 + jNanoTime);
        s0(jNanoTime, w35Var);
        return w35Var;
    }

    @Override // defpackage.a45
    public final void n0(long j, x35 x35Var) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // defpackage.a45
    public final Thread o() {
        Thread thread = _thread;
        if (thread == null) {
            synchronized (this) {
                thread = _thread;
                if (thread == null) {
                    thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                    _thread = thread;
                    thread.setContextClassLoader(pa4.class.getClassLoader());
                    thread.setDaemon(true);
                    thread.start();
                }
            }
        }
        return thread;
    }

    @Override // defpackage.z35
    public final void o0(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.o0(runnable);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zR0;
        use.a.set(this);
        try {
            synchronized (this) {
                int i = debugStatus;
                if (i == 2 || i == 3) {
                    if (zR0) {
                        return;
                    } else {
                        return;
                    }
                }
                debugStatus = 1;
                notifyAll();
                long j = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long jE0 = e0();
                    if (jE0 == Long.MAX_VALUE) {
                        long jNanoTime = System.nanoTime();
                        if (j == Long.MAX_VALUE) {
                            j = t0 + jNanoTime;
                        }
                        long j2 = j - jNanoTime;
                        if (j2 <= 0) {
                            _thread = null;
                            t0();
                            if (r0()) {
                                return;
                            }
                            o();
                            return;
                        }
                        if (jE0 > j2) {
                            jE0 = j2;
                        }
                    } else {
                        j = Long.MAX_VALUE;
                    }
                    if (jE0 > 0) {
                        int i2 = debugStatus;
                        if (i2 == 2 || i2 == 3) {
                            _thread = null;
                            t0();
                            if (r0()) {
                                return;
                            }
                            o();
                            return;
                        }
                        LockSupport.parkNanos(this, jE0);
                    }
                }
            }
        } finally {
            _thread = null;
            t0();
            if (!r0()) {
                o();
            }
        }
    }

    @Override // defpackage.z35, defpackage.a45
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    public final synchronized void t0() {
        int i = debugStatus;
        if (i == 2 || i == 3) {
            debugStatus = 3;
            z35.X.set(this, null);
            z35.Y.set(this, null);
            notifyAll();
        }
    }

    @Override // defpackage.nx3
    /* renamed from: toString */
    public final String getName() {
        return "DefaultExecutor";
    }
}
