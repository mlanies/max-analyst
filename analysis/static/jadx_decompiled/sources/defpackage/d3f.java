package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* loaded from: classes.dex */
public final class d3f extends AtomicReference implements Runnable {
    public static final wdg c = new wdg(6);
    public static final wdg o = new wdg(6);
    public final Callable a;
    public final /* synthetic */ e3f b;

    public d3f(e3f e3fVar, Callable callable) {
        this.b = e3fVar;
        callable.getClass();
        this.a = callable;
    }

    public final void a(Thread thread) {
        Runnable runnable = (Runnable) get();
        i47 i47Var = null;
        boolean z = false;
        int i = 0;
        while (true) {
            boolean z2 = runnable instanceof i47;
            wdg wdgVar = o;
            if (!z2 && runnable != wdgVar) {
                break;
            }
            if (z2) {
                i47Var = (i47) runnable;
            }
            i++;
            if (i <= 1000) {
                Thread.yield();
            } else if (runnable == wdgVar || compareAndSet(runnable, wdgVar)) {
                z = Thread.interrupted() || z;
                LockSupport.park(i47Var);
            }
            runnable = (Runnable) get();
        }
        if (z) {
            thread.interrupt();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Thread threadCurrentThread = Thread.currentThread();
        Object objCall = null;
        if (compareAndSet(null, threadCurrentThread)) {
            e3f e3fVar = this.b;
            boolean z = !e3fVar.isDone();
            wdg wdgVar = c;
            if (z) {
                try {
                    objCall = this.a.call();
                } catch (Throwable th) {
                    try {
                        if (th instanceof InterruptedException) {
                            Thread.currentThread().interrupt();
                        }
                        if (!compareAndSet(threadCurrentThread, wdgVar)) {
                            a(threadCurrentThread);
                        }
                        if (z) {
                            e3fVar.m(th);
                            return;
                        }
                        return;
                    } finally {
                        if (!compareAndSet(threadCurrentThread, wdgVar)) {
                            a(threadCurrentThread);
                        }
                        if (z) {
                            e3fVar.l(null);
                        }
                    }
                }
            }
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String str;
        Runnable runnable = (Runnable) get();
        if (runnable == c) {
            str = "running=[DONE]";
        } else if (runnable instanceof i47) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            str = "running=[RUNNING ON " + ((Thread) runnable).getName() + "]";
        } else {
            str = "running=[NOT STARTED YET]";
        }
        StringBuilder sbO = rh4.o(str, ", ");
        sbO.append(this.a.toString());
        return sbO.toString();
    }
}
