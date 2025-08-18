package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class jx9 extends hu3 {
    public long X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ qx9 Z;
    public long o;
    public int s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jx9(qx9 qx9Var, Continuation continuation) {
        super(continuation);
        this.Z = qx9Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.Y = obj;
        this.s0 |= Integer.MIN_VALUE;
        return qx9.b(this.Z, 0L, 0L, this);
    }
}
