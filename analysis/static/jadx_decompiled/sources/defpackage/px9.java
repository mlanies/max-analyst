package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class px9 extends hu3 {
    public final /* synthetic */ qx9 X;
    public int Y;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public px9(qx9 qx9Var, Continuation continuation) {
        super(continuation);
        this.X = qx9Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.o = obj;
        this.Y |= Integer.MIN_VALUE;
        return qx9.d(this.X, null, this);
    }
}
