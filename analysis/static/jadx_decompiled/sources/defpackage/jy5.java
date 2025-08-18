package defpackage;

import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class jy5 extends ForkJoinTask {
    public final Runnable a;
    public final AtomicBoolean b = new AtomicBoolean(false);
    public final AtomicReference c;
    public volatile Throwable o;

    public jy5(Object obj, yg3 yg3Var) {
        this.a = yg3Var;
        this.c = new AtomicReference(obj);
    }

    @Override // java.util.concurrent.ForkJoinTask
    public final boolean exec() {
        if (!this.b.compareAndSet(false, true)) {
            return false;
        }
        try {
            this.a.run();
            return true;
        } catch (Throwable th) {
            this.o = th;
            throw th;
        }
    }

    @Override // java.util.concurrent.ForkJoinTask
    public final Object getRawResult() {
        return this.c.get();
    }

    @Override // java.util.concurrent.ForkJoinTask
    public final void setRawResult(Object obj) {
        this.c.set(obj);
    }
}
