package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ThreadContextKt;

/* loaded from: classes.dex */
public abstract class d0 extends z87 implements Continuation, sx3 {
    private final lx3 context;

    public d0(lx3 lx3Var, boolean z, boolean z2) {
        super(z2);
        if (z) {
            initParentJob((x77) lx3Var.get(c32.X));
        }
        this.context = lx3Var.plus(this);
    }

    public static /* synthetic */ void getContext$annotations() {
    }

    @Override // defpackage.z87
    public String cancellationExceptionMessage() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    @Override // kotlin.coroutines.Continuation
    public final lx3 getContext() {
        return this.context;
    }

    @Override // defpackage.sx3
    public lx3 getCoroutineContext() {
        return this.context;
    }

    @Override // defpackage.z87
    public final void handleOnCompletionException$kotlinx_coroutines_core(Throwable th) {
        wmd.v(this.context, th);
    }

    @Override // defpackage.z87, defpackage.x77
    public boolean isActive() {
        return super.isActive();
    }

    @Override // defpackage.z87
    public String nameString$kotlinx_coroutines_core() {
        return super.nameString$kotlinx_coroutines_core();
    }

    public void onCancelled(Throwable th, boolean z) {
    }

    public void onCompleted(Object obj) {
    }

    @Override // defpackage.z87
    public final void onCompletionInternal(Object obj) {
        if (!(obj instanceof lb3)) {
            onCompleted(obj);
        } else {
            lb3 lb3Var = (lb3) obj;
            onCancelled(lb3Var.a, lb3.b.get(lb3Var) != 0);
        }
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(Object obj) throws Throwable {
        Object objMakeCompletingOnce$kotlinx_coroutines_core = makeCompletingOnce$kotlinx_coroutines_core(z7.T(obj, null));
        if (objMakeCompletingOnce$kotlinx_coroutines_core == a97.b) {
            return;
        }
        afterResume(objMakeCompletingOnce$kotlinx_coroutines_core);
    }

    public final <R> void start(vx3 vx3Var, R r, a66 a66Var) {
        Object objInvoke;
        int iOrdinal = vx3Var.ordinal();
        if (iOrdinal == 0) {
            tu0.M(a66Var, r, this);
            return;
        }
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                v3c.u(v3c.j(a66Var, r, this)).resumeWith(e5f.a);
                return;
            }
            if (iOrdinal != 3) {
                throw new NoWhenBranchMatchedException();
            }
            try {
                lx3 context = getContext();
                Object objUpdateThreadContext = ThreadContextKt.updateThreadContext(context, null);
                try {
                    od2.P(this);
                    if (a66Var instanceof gi0) {
                        f8.c(2, a66Var);
                        objInvoke = a66Var.invoke(r, this);
                    } else {
                        objInvoke = v3c.H(a66Var, r, this);
                    }
                    ThreadContextKt.restoreThreadContext(context, objUpdateThreadContext);
                    if (objInvoke != tx3.a) {
                        resumeWith(objInvoke);
                    }
                } catch (Throwable th) {
                    ThreadContextKt.restoreThreadContext(context, objUpdateThreadContext);
                    throw th;
                }
            } catch (Throwable th2) {
                resumeWith(new njc(th2));
            }
        }
    }
}
