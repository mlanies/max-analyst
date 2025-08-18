package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class l8f extends hu3 {
    public Object X;
    public aj9 Y;
    public /* synthetic */ Object Z;
    public n8f o;
    public final /* synthetic */ n8f s0;
    public int t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l8f(n8f n8fVar, Continuation continuation) {
        super(continuation);
        this.s0 = n8fVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.Z = obj;
        this.t0 |= Integer.MIN_VALUE;
        return this.s0.g(null, this);
    }
}
