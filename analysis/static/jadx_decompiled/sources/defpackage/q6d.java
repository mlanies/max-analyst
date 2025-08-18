package defpackage;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes.dex */
public final class q6d implements Executor {
    public final Executor b;
    public final ArrayDeque a = new ArrayDeque();
    public final q57 c = new q57(23, this);
    public int o = 1;
    public long X = 0;

    public q6d(Executor executor) {
        executor.getClass();
        this.b = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        synchronized (this.a) {
            int i = this.o;
            if (i != 4 && i != 3) {
                long j = this.X;
                tqc tqcVar = new tqc(runnable, 2);
                this.a.add(tqcVar);
                this.o = 2;
                try {
                    this.b.execute(this.c);
                    if (this.o != 2) {
                        return;
                    }
                    synchronized (this.a) {
                        try {
                            if (this.X == j && this.o == 2) {
                                this.o = 3;
                            }
                        } finally {
                        }
                    }
                    return;
                } catch (Error | RuntimeException e) {
                    synchronized (this.a) {
                        try {
                            int i2 = this.o;
                            boolean z = true;
                            if ((i2 != 1 && i2 != 2) || !this.a.removeLastOccurrence(tqcVar)) {
                                z = false;
                            }
                            if (!(e instanceof RejectedExecutionException) || z) {
                                throw e;
                            }
                            return;
                        } finally {
                        }
                    }
                }
            }
            this.a.add(runnable);
        }
    }
}
