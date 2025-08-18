package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class nw9 extends hu3 {
    public long X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ rw9 Z;
    public e52 o;
    public int s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nw9(rw9 rw9Var, Continuation continuation) {
        super(continuation);
        this.Z = rw9Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.Y = obj;
        this.s0 |= Integer.MIN_VALUE;
        return this.Z.d(null, 0L, 0L, this);
    }
}
