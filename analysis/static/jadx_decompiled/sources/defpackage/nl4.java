package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlinx.coroutines.internal.DispatchedContinuationKt;
import kotlinx.coroutines.internal.ScopeCoroutine;

/* loaded from: classes.dex */
public final class nl4 extends ScopeCoroutine {
    public static final /* synthetic */ AtomicIntegerFieldUpdater a = AtomicIntegerFieldUpdater.newUpdater(nl4.class, "_decision$volatile");
    private volatile /* synthetic */ int _decision$volatile;

    @Override // kotlinx.coroutines.internal.ScopeCoroutine, defpackage.z87
    public final void afterCompletion(Object obj) {
        afterResume(obj);
    }

    @Override // kotlinx.coroutines.internal.ScopeCoroutine, defpackage.z87
    public final void afterResume(Object obj) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = a;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("Already resumed".toString());
                }
                DispatchedContinuationKt.resumeCancellableWith$default(v3c.u(this.uCont), z7.M(obj), null, 2, null);
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }
}
