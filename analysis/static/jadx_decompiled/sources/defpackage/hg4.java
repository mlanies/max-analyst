package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public interface hg4 {
    Object delay(long j, Continuation continuation);

    cm4 invokeOnTimeout(long j, Runnable runnable, lx3 lx3Var);

    /* renamed from: scheduleResumeAfterDelay */
    void mo21scheduleResumeAfterDelay(long j, ry1 ry1Var);
}
