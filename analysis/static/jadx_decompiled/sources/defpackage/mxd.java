package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class mxd implements Continuation, ux3 {
    public final Continuation a;
    public final lx3 b;

    public mxd(lx3 lx3Var, Continuation continuation) {
        this.a = continuation;
        this.b = lx3Var;
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
        return this.b;
    }

    @Override // defpackage.ux3
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(Object obj) {
        this.a.resumeWith(obj);
    }
}
