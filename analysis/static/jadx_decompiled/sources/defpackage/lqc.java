package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class lqc implements Continuation, ux3 {
    public static final AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(lqc.class, Object.class, "result");
    public final Continuation a;
    private volatile Object result;

    public lqc(Continuation continuation) {
        tx3 tx3Var = tx3.b;
        this.a = continuation;
        this.result = tx3Var;
    }

    public final Object a() throws Throwable {
        Object obj = this.result;
        tx3 tx3Var = tx3.b;
        tx3 tx3Var2 = tx3.a;
        if (obj == tx3Var) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, tx3Var, tx3Var2)) {
                if (atomicReferenceFieldUpdater.get(this) != tx3Var) {
                    obj = this.result;
                }
            }
            return tx3Var2;
        }
        if (obj == tx3.c) {
            return tx3Var2;
        }
        if (obj instanceof njc) {
            throw ((njc) obj).a;
        }
        return obj;
    }

    @Override // defpackage.ux3
    public final ux3 getCallerFrame() {
        Continuation continuation = this.a;
        if (continuation instanceof ux3) {
            return (ux3) continuation;
        }
        return null;
    }

    @Override // kotlin.coroutines.Continuation
    public final lx3 getContext() {
        return this.a.getContext();
    }

    @Override // defpackage.ux3
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(Object obj) {
        while (true) {
            Object obj2 = this.result;
            tx3 tx3Var = tx3.b;
            if (obj2 == tx3Var) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, tx3Var, obj)) {
                    if (atomicReferenceFieldUpdater.get(this) != tx3Var) {
                        break;
                    }
                }
                return;
            }
            tx3 tx3Var2 = tx3.a;
            if (obj2 != tx3Var2) {
                throw new IllegalStateException("Already resumed");
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = b;
            tx3 tx3Var3 = tx3.c;
            while (!atomicReferenceFieldUpdater2.compareAndSet(this, tx3Var2, tx3Var3)) {
                if (atomicReferenceFieldUpdater2.get(this) != tx3Var2) {
                    break;
                }
            }
            this.a.resumeWith(obj);
            return;
        }
    }

    public final String toString() {
        return "SafeContinuation for " + this.a;
    }
}
