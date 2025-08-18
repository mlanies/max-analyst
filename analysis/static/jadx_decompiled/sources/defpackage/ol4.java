package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.DispatchedContinuation;
import kotlinx.coroutines.internal.ThreadContextKt;

/* loaded from: classes.dex */
public abstract class ol4 extends nne {
    public int resumeMode;

    public ol4(int i) {
        super(0L, joe.g);
        this.resumeMode = i;
    }

    public abstract void cancelCompletedResult$kotlinx_coroutines_core(Object obj, Throwable th);

    public abstract Continuation getDelegate$kotlinx_coroutines_core();

    public Throwable getExceptionalResult$kotlinx_coroutines_core(Object obj) {
        lb3 lb3Var = obj instanceof lb3 ? (lb3) obj : null;
        if (lb3Var != null) {
            return lb3Var.a;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T getSuccessfulResult$kotlinx_coroutines_core(Object obj) {
        return obj;
    }

    public final void handleFatalException$kotlinx_coroutines_core(Throwable th, Throwable th2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (th == null && th2 == null) {
            return;
        }
        if (th != null && th2 != null) {
            j47.e(th, th2);
        }
        if (th == null) {
            th = th2;
        }
        wmd.v(getDelegate$kotlinx_coroutines_core().getContext(), new yx3("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Object njcVar = e5f.a;
        sne sneVar = this.taskContext;
        try {
            DispatchedContinuation dispatchedContinuation = (DispatchedContinuation) getDelegate$kotlinx_coroutines_core();
            Continuation<T> continuation = dispatchedContinuation.continuation;
            Object obj = dispatchedContinuation.countOrElement;
            lx3 context = continuation.getContext();
            Object objUpdateThreadContext = ThreadContextKt.updateThreadContext(context, obj);
            z4f z4fVarG = objUpdateThreadContext != ThreadContextKt.NO_THREAD_ELEMENTS ? v3c.G(continuation, context, objUpdateThreadContext) : null;
            try {
                lx3 context2 = continuation.getContext();
                Object objTakeState$kotlinx_coroutines_core = takeState$kotlinx_coroutines_core();
                Throwable exceptionalResult$kotlinx_coroutines_core = getExceptionalResult$kotlinx_coroutines_core(objTakeState$kotlinx_coroutines_core);
                x77 x77Var = (exceptionalResult$kotlinx_coroutines_core == null && v3c.v(this.resumeMode)) ? (x77) context2.get(c32.X) : null;
                if (x77Var != null && !x77Var.isActive()) {
                    CancellationException cancellationException = x77Var.getCancellationException();
                    cancelCompletedResult$kotlinx_coroutines_core(objTakeState$kotlinx_coroutines_core, cancellationException);
                    continuation.resumeWith(new njc(cancellationException));
                } else if (exceptionalResult$kotlinx_coroutines_core != null) {
                    continuation.resumeWith(new njc(exceptionalResult$kotlinx_coroutines_core));
                } else {
                    continuation.resumeWith(getSuccessfulResult$kotlinx_coroutines_core(objTakeState$kotlinx_coroutines_core));
                }
                if (z4fVarG == null || z4fVarG.H()) {
                    ThreadContextKt.restoreThreadContext(context, objUpdateThreadContext);
                }
                try {
                    sneVar.getClass();
                } catch (Throwable th) {
                    njcVar = new njc(th);
                }
                handleFatalException$kotlinx_coroutines_core(null, pjc.a(njcVar));
            } catch (Throwable th2) {
                if (z4fVarG == null || z4fVarG.H()) {
                    ThreadContextKt.restoreThreadContext(context, objUpdateThreadContext);
                }
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                sneVar.getClass();
            } catch (Throwable th4) {
                njcVar = new njc(th4);
            }
            handleFatalException$kotlinx_coroutines_core(th3, pjc.a(njcVar));
        }
    }

    public abstract Object takeState$kotlinx_coroutines_core();
}
