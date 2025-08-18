package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class x23 extends hu3 {
    public Long X;
    public long Y;
    public /* synthetic */ Object Z;
    public z23 o;
    public final /* synthetic */ z23 s0;
    public int t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x23(z23 z23Var, Continuation continuation) {
        super(continuation);
        this.s0 = z23Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.Z = obj;
        this.t0 |= Integer.MIN_VALUE;
        return this.s0.c(0L, null, this);
    }
}
