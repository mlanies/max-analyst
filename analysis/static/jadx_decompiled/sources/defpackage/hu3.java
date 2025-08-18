package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public abstract class hu3 extends gi0 {
    public final lx3 b;
    public transient Continuation c;

    public hu3(lx3 lx3Var, Continuation continuation) {
        super(continuation);
        this.b = lx3Var;
    }

    @Override // kotlin.coroutines.Continuation
    public lx3 getContext() {
        return this.b;
    }

    @Override // defpackage.gi0
    public void p() {
        Continuation continuation = this.c;
        if (continuation != null && continuation != this) {
            ((iu3) getContext().get(vu4.b)).releaseInterceptedContinuation(continuation);
        }
        this.c = kb3.b;
    }

    public hu3(Continuation continuation) {
        this(continuation != null ? continuation.getContext() : null, continuation);
    }
}
