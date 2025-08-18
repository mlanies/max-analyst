package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class t39 extends hu3 {
    public final /* synthetic */ n59 X;
    public int Y;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t39(n59 n59Var, Continuation continuation) {
        super(continuation);
        this.X = n59Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.o = obj;
        this.Y |= Integer.MIN_VALUE;
        return this.X.y(0L, this);
    }
}
