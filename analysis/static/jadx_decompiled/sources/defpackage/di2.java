package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class di2 extends hu3 {
    public um8 X;
    public long Y;
    public /* synthetic */ Object Z;
    public gi2 o;
    public final /* synthetic */ gi2 s0;
    public int t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public di2(gi2 gi2Var, Continuation continuation) {
        super(continuation);
        this.s0 = gi2Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.Z = obj;
        this.t0 |= Integer.MIN_VALUE;
        return gi2.r(this.s0, null, this);
    }
}
