package defpackage;

import kotlinx.coroutines.flow.internal.ChildCancelledException;
import kotlinx.coroutines.internal.ScopeCoroutine;

/* loaded from: classes.dex */
public final class pn5 extends ScopeCoroutine {
    @Override // defpackage.z87
    public final boolean childCancelled(Throwable th) {
        if (th instanceof ChildCancelledException) {
            return true;
        }
        return cancelImpl$kotlinx_coroutines_core(th);
    }
}
