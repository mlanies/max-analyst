package defpackage;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ScopeCoroutine;
import kotlinx.coroutines.internal.ThreadContextKt;

/* loaded from: classes.dex */
public final class z4f extends ScopeCoroutine {
    public final ThreadLocal a;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    public z4f(lx3 lx3Var, Continuation continuation) {
        a5f a5fVar = a5f.a;
        super(lx3Var.get(a5fVar) == null ? lx3Var.plus(a5fVar) : lx3Var, continuation);
        this.a = new ThreadLocal();
        if (continuation.getContext().get(vu4.b) instanceof nx3) {
            return;
        }
        Object objUpdateThreadContext = ThreadContextKt.updateThreadContext(lx3Var, null);
        ThreadContextKt.restoreThreadContext(lx3Var, objUpdateThreadContext);
        I(lx3Var, objUpdateThreadContext);
    }

    public final boolean H() {
        boolean z = this.threadLocalIsSet && this.a.get() == null;
        this.a.remove();
        return !z;
    }

    public final void I(lx3 lx3Var, Object obj) {
        this.threadLocalIsSet = true;
        this.a.set(new kpa(lx3Var, obj));
    }

    @Override // kotlinx.coroutines.internal.ScopeCoroutine, defpackage.z87
    public final void afterResume(Object obj) {
        if (this.threadLocalIsSet) {
            kpa kpaVar = (kpa) this.a.get();
            if (kpaVar != null) {
                ThreadContextKt.restoreThreadContext((lx3) kpaVar.a, kpaVar.b);
            }
            this.a.remove();
        }
        Object objM = z7.M(obj);
        Continuation<T> continuation = this.uCont;
        lx3 context = continuation.getContext();
        Object objUpdateThreadContext = ThreadContextKt.updateThreadContext(context, null);
        z4f z4fVarG = objUpdateThreadContext != ThreadContextKt.NO_THREAD_ELEMENTS ? v3c.G(continuation, context, objUpdateThreadContext) : null;
        try {
            this.uCont.resumeWith(objM);
        } finally {
            if (z4fVarG == null || z4fVarG.H()) {
                ThreadContextKt.restoreThreadContext(context, objUpdateThreadContext);
            }
        }
    }
}
