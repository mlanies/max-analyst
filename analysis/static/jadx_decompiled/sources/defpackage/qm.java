package defpackage;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class qm implements Executor {
    public final Object X;
    public final /* synthetic */ int a;
    public final ArrayDeque b;
    public final Executor c;
    public Runnable o;

    public qm(Executor executor, int i) {
        this.a = i;
        switch (i) {
            case 2:
                this.c = executor;
                this.b = new ArrayDeque();
                this.X = new Object();
                break;
            default:
                this.c = executor;
                this.b = new ArrayDeque();
                this.X = new Object();
                break;
        }
    }

    public final void a() {
        switch (this.a) {
            case 0:
                synchronized (this.X) {
                    try {
                        Runnable runnable = (Runnable) this.b.poll();
                        this.o = runnable;
                        if (runnable != null) {
                            this.c.execute(runnable);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 1:
                Runnable runnable2 = (Runnable) this.b.poll();
                this.o = runnable2;
                if (runnable2 != null) {
                    this.c.execute(runnable2);
                    return;
                }
                return;
            default:
                synchronized (this.X) {
                    Object objPoll = this.b.poll();
                    Runnable runnable3 = (Runnable) objPoll;
                    this.o = runnable3;
                    if (objPoll != null) {
                        this.c.execute(runnable3);
                    }
                }
                return;
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.a) {
            case 0:
                synchronized (this.X) {
                    try {
                        this.b.add(new c(this, 3, runnable));
                        if (this.o == null) {
                            a();
                        }
                    } finally {
                    }
                }
                return;
            case 1:
                synchronized (this.X) {
                    try {
                        this.b.add(new i76(this, 19, runnable));
                        if (this.o == null) {
                            a();
                        }
                    } finally {
                    }
                }
                return;
            default:
                synchronized (this.X) {
                    this.b.offer(new fre(runnable, 1, this));
                    if (this.o == null) {
                        a();
                    }
                }
                return;
        }
    }

    public qm(ok4 ok4Var) {
        this.a = 0;
        this.X = new Object();
        this.b = new ArrayDeque();
        this.c = ok4Var;
    }
}
