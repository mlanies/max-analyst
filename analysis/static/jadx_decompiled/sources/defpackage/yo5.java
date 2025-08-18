package defpackage;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.TimeoutCancellationException;

/* loaded from: classes.dex */
public final class yo5 extends ffe implements m56 {
    public final /* synthetic */ long X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yo5(long j, Continuation continuation) {
        super(1, continuation);
        this.X = j;
    }

    @Override // defpackage.m56
    public final Object invoke(Object obj) throws Throwable {
        new yo5(this.X, (Continuation) obj).o(e5f.a);
        throw null;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        throw new TimeoutCancellationException("Timed out waiting for " + ((Object) ft4.j(this.X)), null);
    }
}
