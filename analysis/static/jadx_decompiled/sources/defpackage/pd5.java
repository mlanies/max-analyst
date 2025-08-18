package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class pd5 extends hu3 {
    public xxc X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ qd5 Z;
    public qd5 o;
    public int s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pd5(qd5 qd5Var, Continuation continuation) {
        super(continuation);
        this.Z = qd5Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.Y = obj;
        this.s0 |= Integer.MIN_VALUE;
        return this.Z.a(this);
    }
}
