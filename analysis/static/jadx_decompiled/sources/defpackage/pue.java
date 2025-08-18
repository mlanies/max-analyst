package defpackage;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.internal.ScopeCoroutine;

/* loaded from: classes.dex */
public final class pue extends ScopeCoroutine implements Runnable {
    public final long a;

    public pue(long j, Continuation continuation) {
        super(continuation.getContext(), continuation);
        this.a = j;
    }

    @Override // defpackage.d0, defpackage.z87
    public final String nameString$kotlinx_coroutines_core() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.nameString$kotlinx_coroutines_core());
        sb.append("(timeMillis=");
        return z7b.i(sb, this.a, ')');
    }

    @Override // java.lang.Runnable
    public final void run() {
        j47.H(getContext());
        cancelCoroutine(new TimeoutCancellationException("Timed out waiting for " + this.a + " ms", this));
    }
}
