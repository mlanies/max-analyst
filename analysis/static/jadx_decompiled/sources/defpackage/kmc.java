package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final /* synthetic */ class kmc implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ lmc b;

    public /* synthetic */ kmc(lmc lmcVar, int i) {
        this.a = i;
        this.b = lmcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicBoolean atomicBoolean;
        boolean z;
        Executor executor;
        switch (this.a) {
            case 0:
                lmc lmcVar = this.b;
                if (lmcVar.s.compareAndSet(false, true)) {
                    v47 v47Var = lmcVar.l.e;
                    v47Var.getClass();
                    v47Var.a(new u47(v47Var, lmcVar.p));
                }
                do {
                    AtomicBoolean atomicBoolean2 = lmcVar.r;
                    boolean zCompareAndSet = atomicBoolean2.compareAndSet(false, true);
                    atomicBoolean = lmcVar.q;
                    if (zCompareAndSet) {
                        Object objCall = null;
                        z = false;
                        while (atomicBoolean.compareAndSet(true, false)) {
                            try {
                                try {
                                    objCall = lmcVar.o.call();
                                    z = true;
                                } catch (Exception e) {
                                    throw new RuntimeException("Exception while computing database live data.", e);
                                }
                            } finally {
                                atomicBoolean2.set(false);
                            }
                        }
                        if (z) {
                            lmcVar.i(objCall);
                        }
                    } else {
                        z = false;
                    }
                    if (!z) {
                        return;
                    }
                } while (atomicBoolean.get());
                return;
            default:
                lmc lmcVar2 = this.b;
                boolean z2 = lmcVar2.c > 0;
                if (lmcVar2.q.compareAndSet(false, true) && z2) {
                    Executor executor2 = null;
                    boolean z3 = lmcVar2.n;
                    ilc ilcVar = lmcVar2.l;
                    if (!z3 ? (executor = ilcVar.b) != null : (executor = ilcVar.c) != null) {
                        executor2 = executor;
                    }
                    executor2.execute(lmcVar2.t);
                    return;
                }
                return;
        }
    }
}
