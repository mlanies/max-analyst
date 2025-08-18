package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class j6f extends hu3 {
    public long X;
    public long Y;
    public /* synthetic */ Object Z;
    public k6f o;
    public final /* synthetic */ k6f s0;
    public int t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j6f(k6f k6fVar, Continuation continuation) {
        super(continuation);
        this.s0 = k6fVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.Z = obj;
        this.t0 |= Integer.MIN_VALUE;
        return this.s0.a(0L, 0L, null, null, this);
    }
}
