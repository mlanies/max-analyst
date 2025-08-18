package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* loaded from: classes.dex */
public final class zsc extends h0 implements Callable {
    @Override // java.util.concurrent.Callable
    public final Object call() {
        FutureTask futureTask = h0.o;
        this.c = Thread.currentThread();
        try {
            try {
                this.a.run();
                return null;
            } finally {
                lazySet(futureTask);
                this.c = null;
            }
        } catch (Throwable th) {
            j47.Z(th);
            throw th;
        }
    }
}
