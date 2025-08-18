package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class r87 extends sy1 {
    public final z87 Y;

    public r87(z87 z87Var, Continuation continuation) {
        super(1, continuation);
        this.Y = z87Var;
    }

    @Override // defpackage.sy1
    public final Throwable k(z87 z87Var) {
        Throwable thC;
        Object state$kotlinx_coroutines_core = this.Y.getState$kotlinx_coroutines_core();
        return (!(state$kotlinx_coroutines_core instanceof t87) || (thC = ((t87) state$kotlinx_coroutines_core).c()) == null) ? state$kotlinx_coroutines_core instanceof lb3 ? ((lb3) state$kotlinx_coroutines_core).a : z87Var.getCancellationException() : thC;
    }

    @Override // defpackage.sy1
    public final String t() {
        return "AwaitContinuation";
    }
}
