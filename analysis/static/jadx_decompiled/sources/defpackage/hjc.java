package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public abstract class hjc extends gi0 {
    public hjc(Continuation continuation) {
        super(continuation);
        if (continuation != null && continuation.getContext() != hz4.a) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext".toString());
        }
    }

    @Override // kotlin.coroutines.Continuation
    public final lx3 getContext() {
        return hz4.a;
    }
}
