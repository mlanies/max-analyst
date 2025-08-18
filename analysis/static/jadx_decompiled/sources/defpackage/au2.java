package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class au2 extends hu3 {
    public jec X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ pu2 Z;
    public pu2 o;
    public int s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public au2(pu2 pu2Var, Continuation continuation) {
        super(continuation);
        this.Z = pu2Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.Y = obj;
        this.s0 |= Integer.MIN_VALUE;
        return pu2.b(this.Z, null, this);
    }
}
