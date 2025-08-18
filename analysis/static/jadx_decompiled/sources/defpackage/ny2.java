package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ny2 extends hu3 {
    public long X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ ty2 Z;
    public ty2 o;
    public int s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ny2(ty2 ty2Var, Continuation continuation) {
        super(continuation);
        this.Z = ty2Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.Y = obj;
        this.s0 |= Integer.MIN_VALUE;
        return ty2.d(this.Z, 0L, this);
    }
}
