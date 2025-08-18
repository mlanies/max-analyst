package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import kotlinx.coroutines.internal.Symbol;
import kotlinx.coroutines.internal.ThreadSafeHeapNode;

/* loaded from: classes.dex */
public abstract class z35 extends a45 implements hg4 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater X = AtomicReferenceFieldUpdater.newUpdater(z35.class, Object.class, "_queue$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater Y = AtomicReferenceFieldUpdater.newUpdater(z35.class, Object.class, "_delayed$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater Z = AtomicIntegerFieldUpdater.newUpdater(z35.class, "_isCompleted$volatile");
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile = 0;
    private volatile /* synthetic */ Object _queue$volatile;

    @Override // defpackage.hg4
    public final Object delay(long j, Continuation continuation) {
        return c37.j(this, j, continuation);
    }

    @Override // defpackage.nx3
    /* renamed from: dispatch */
    public final void mo20dispatch(lx3 lx3Var, Runnable runnable) {
        o0(runnable);
    }

    @Override // defpackage.a45
    public final long e0() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Runnable runnable;
        y35 y35Var;
        x35 x35Var;
        if (m0()) {
            return 0L;
        }
        p0();
        loop0: while (true) {
            atomicReferenceFieldUpdater = X;
            Object obj = atomicReferenceFieldUpdater.get(this);
            runnable = null;
            if (obj == null) {
                break;
            }
            if (!(obj instanceof LockFreeTaskQueueCore)) {
                if (obj != b45.b) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    runnable = (Runnable) obj;
                    break loop0;
                }
                break;
            }
            LockFreeTaskQueueCore lockFreeTaskQueueCore = (LockFreeTaskQueueCore) obj;
            Object objRemoveFirstOrNull = lockFreeTaskQueueCore.removeFirstOrNull();
            if (objRemoveFirstOrNull != LockFreeTaskQueueCore.REMOVE_FROZEN) {
                runnable = (Runnable) objRemoveFirstOrNull;
                break;
            }
            LockFreeTaskQueueCore next = lockFreeTaskQueueCore.next();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, next) && atomicReferenceFieldUpdater.get(this) == obj) {
            }
        }
        if (runnable != null) {
            runnable.run();
            return 0L;
        }
        hs hsVar = this.c;
        if (((hsVar == null || hsVar.isEmpty()) ? Long.MAX_VALUE : 0L) == 0) {
            return 0L;
        }
        Object obj2 = atomicReferenceFieldUpdater.get(this);
        if (obj2 == null) {
            y35Var = (y35) Y.get(this);
            if (y35Var != null && (x35Var = (x35) y35Var.peek()) != null) {
                return ote.c(x35Var.a - System.nanoTime(), 0L);
            }
        } else if (obj2 instanceof LockFreeTaskQueueCore) {
            if (!((LockFreeTaskQueueCore) obj2).isEmpty()) {
                return 0L;
            }
            y35Var = (y35) Y.get(this);
            if (y35Var != null) {
                return ote.c(x35Var.a - System.nanoTime(), 0L);
            }
        } else if (obj2 != b45.b) {
            return 0L;
        }
        return Long.MAX_VALUE;
    }

    public cm4 invokeOnTimeout(long j, Runnable runnable, lx3 lx3Var) {
        return c37.r(j, runnable, lx3Var);
    }

    public void o0(Runnable runnable) {
        p0();
        if (!q0(runnable)) {
            pa4.s0.o0(runnable);
            return;
        }
        Thread threadO = o();
        if (Thread.currentThread() != threadO) {
            LockSupport.unpark(threadO);
        }
    }

    public final void p0() {
        ThreadSafeHeapNode threadSafeHeapNodeRemoveAtImpl;
        y35 y35Var = (y35) Y.get(this);
        if (y35Var == null || y35Var.isEmpty()) {
            return;
        }
        long jNanoTime = System.nanoTime();
        do {
            synchronized (y35Var) {
                try {
                    ThreadSafeHeapNode threadSafeHeapNodeFirstImpl = y35Var.firstImpl();
                    if (threadSafeHeapNodeFirstImpl != null) {
                        x35 x35Var = (x35) threadSafeHeapNodeFirstImpl;
                        threadSafeHeapNodeRemoveAtImpl = ((jNanoTime - x35Var.a) > 0L ? 1 : ((jNanoTime - x35Var.a) == 0L ? 0 : -1)) >= 0 ? q0(x35Var) : false ? y35Var.removeAtImpl(0) : null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } while (((x35) threadSafeHeapNodeRemoveAtImpl) != null);
    }

    public final boolean q0(Runnable runnable) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = X;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (Z.get(this) != 0) {
                return false;
            }
            if (obj == null) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, runnable)) {
                    if (atomicReferenceFieldUpdater.get(this) != null) {
                        break;
                    }
                }
                return true;
            }
            if (!(obj instanceof LockFreeTaskQueueCore)) {
                if (obj == b45.b) {
                    return false;
                }
                LockFreeTaskQueueCore lockFreeTaskQueueCore = new LockFreeTaskQueueCore(8, true);
                lockFreeTaskQueueCore.addLast((Runnable) obj);
                lockFreeTaskQueueCore.addLast(runnable);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, lockFreeTaskQueueCore)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return true;
            }
            LockFreeTaskQueueCore lockFreeTaskQueueCore2 = (LockFreeTaskQueueCore) obj;
            int iAddLast = lockFreeTaskQueueCore2.addLast(runnable);
            if (iAddLast == 0) {
                return true;
            }
            if (iAddLast == 1) {
                LockFreeTaskQueueCore next = lockFreeTaskQueueCore2.next();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, next) && atomicReferenceFieldUpdater.get(this) == obj) {
                }
            } else if (iAddLast == 2) {
                return false;
            }
        }
    }

    public final boolean r0() {
        hs hsVar = this.c;
        if (!(hsVar != null ? hsVar.isEmpty() : true)) {
            return false;
        }
        y35 y35Var = (y35) Y.get(this);
        if (y35Var != null && !y35Var.isEmpty()) {
            return false;
        }
        Object obj = X.get(this);
        if (obj == null) {
            return true;
        }
        return obj instanceof LockFreeTaskQueueCore ? ((LockFreeTaskQueueCore) obj).isEmpty() : obj == b45.b;
    }

    public final void s0(long j, x35 x35Var) {
        int iB;
        Thread threadO;
        boolean z = Z.get(this) != 0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = Y;
        if (z) {
            iB = 1;
        } else {
            y35 y35Var = (y35) atomicReferenceFieldUpdater.get(this);
            if (y35Var == null) {
                y35 y35Var2 = new y35();
                y35Var2.b = j;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, y35Var2) && atomicReferenceFieldUpdater.get(this) == null) {
                }
                y35Var = (y35) atomicReferenceFieldUpdater.get(this);
            }
            iB = x35Var.b(j, y35Var, this);
        }
        if (iB != 0) {
            if (iB == 1) {
                n0(j, x35Var);
                return;
            } else {
                if (iB != 2) {
                    throw new IllegalStateException("unexpected result".toString());
                }
                return;
            }
        }
        y35 y35Var3 = (y35) atomicReferenceFieldUpdater.get(this);
        if ((y35Var3 != null ? (x35) y35Var3.peek() : null) != x35Var || Thread.currentThread() == (threadO = o())) {
            return;
        }
        LockSupport.unpark(threadO);
    }

    @Override // defpackage.hg4
    /* renamed from: scheduleResumeAfterDelay */
    public final void mo21scheduleResumeAfterDelay(long j, ry1 ry1Var) {
        Symbol symbol = b45.a;
        long j2 = j > 0 ? j >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j : 0L;
        if (j2 < 4611686018427387903L) {
            long jNanoTime = System.nanoTime();
            v35 v35Var = new v35(this, j2 + jNanoTime, ry1Var);
            s0(jNanoTime, v35Var);
            nu0.w(ry1Var, new hy1(2, v35Var));
        }
    }

    @Override // defpackage.a45
    public void shutdown() {
        x35 x35Var;
        ThreadLocal threadLocal = use.a;
        use.a.set(null);
        Z.set(this, 1);
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = X;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj != null) {
                if (!(obj instanceof LockFreeTaskQueueCore)) {
                    if (obj != b45.b) {
                        LockFreeTaskQueueCore lockFreeTaskQueueCore = new LockFreeTaskQueueCore(8, true);
                        lockFreeTaskQueueCore.addLast((Runnable) obj);
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, lockFreeTaskQueueCore)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj) {
                                break;
                            }
                        }
                        break loop0;
                    }
                    break;
                }
                ((LockFreeTaskQueueCore) obj).close();
                break;
            }
            Symbol symbol = b45.b;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, symbol)) {
                if (atomicReferenceFieldUpdater.get(this) != null) {
                    break;
                }
            }
            break loop0;
        }
        while (e0() <= 0) {
        }
        long jNanoTime = System.nanoTime();
        while (true) {
            y35 y35Var = (y35) Y.get(this);
            if (y35Var == null || (x35Var = (x35) y35Var.removeFirstOrNull()) == null) {
                return;
            } else {
                n0(jNanoTime, x35Var);
            }
        }
    }
}
