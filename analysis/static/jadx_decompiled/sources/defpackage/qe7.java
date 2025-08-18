package defpackage;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.DispatchedContinuationKt;

/* loaded from: classes.dex */
public final class qe7 extends vxd {
    public final Continuation a;

    public qe7(lx3 lx3Var, a66 a66Var) {
        super(lx3Var, true, false);
        this.a = v3c.j(a66Var, this, this);
    }

    @Override // defpackage.z87
    public final void onStart() {
        try {
            DispatchedContinuationKt.resumeCancellableWith$default(v3c.u(this.a), e5f.a, null, 2, null);
        } catch (Throwable th) {
            resumeWith(new njc(th));
            throw th;
        }
    }
}
