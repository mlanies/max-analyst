package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.locks.LockSupport;

/* loaded from: classes.dex */
public final class e3f extends k1 implements RunnableFuture, d1 {
    public volatile d3f s0;

    public e3f(Callable callable) {
        this.s0 = new d3f(this, callable);
    }

    @Override // defpackage.k1
    public final void b() {
        d3f d3fVar;
        Object obj = this.a;
        if ((obj instanceof q0) && ((q0) obj).a && (d3fVar = this.s0) != null) {
            wdg wdgVar = d3f.o;
            wdg wdgVar2 = d3f.c;
            Runnable runnable = (Runnable) d3fVar.get();
            if (runnable instanceof Thread) {
                i47 i47Var = new i47(d3fVar);
                i47.a(i47Var, Thread.currentThread());
                if (d3fVar.compareAndSet(runnable, i47Var)) {
                    try {
                        ((Thread) runnable).interrupt();
                    } finally {
                        if (((Runnable) d3fVar.getAndSet(wdgVar2)) == wdgVar) {
                            LockSupport.unpark((Thread) runnable);
                        }
                    }
                }
            }
        }
        this.s0 = null;
    }

    @Override // defpackage.k1, java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.a instanceof q0;
    }

    @Override // defpackage.k1
    public final String j() {
        d3f d3fVar = this.s0;
        if (d3fVar == null) {
            return super.j();
        }
        return "task=[" + d3fVar + "]";
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        d3f d3fVar = this.s0;
        if (d3fVar != null) {
            d3fVar.run();
        }
        this.s0 = null;
    }
}
