package defpackage;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class p6d implements Executor {
    public static final Logger Y = Logger.getLogger(p6d.class.getName());
    public final Executor a;
    public final ArrayDeque b = new ArrayDeque();
    public int c = 1;
    public long o = 0;
    public final h76 X = new h76(this);

    public p6d(Executor executor) {
        fp3.n(executor);
        this.a = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        fp3.n(runnable);
        synchronized (this.b) {
            int i = this.c;
            if (i != 4 && i != 3) {
                long j = this.o;
                tqc tqcVar = new tqc(runnable, 1);
                this.b.add(tqcVar);
                this.c = 2;
                try {
                    this.a.execute(this.X);
                    if (this.c != 2) {
                        return;
                    }
                    synchronized (this.b) {
                        try {
                            if (this.o == j && this.c == 2) {
                                this.c = 3;
                            }
                        } finally {
                        }
                    }
                    return;
                } catch (Error | RuntimeException e) {
                    synchronized (this.b) {
                        try {
                            int i2 = this.c;
                            boolean z = true;
                            if ((i2 != 1 && i2 != 2) || !this.b.removeLastOccurrence(tqcVar)) {
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
            this.b.add(runnable);
        }
    }

    public final String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.a + "}";
    }
}
