package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ph2 extends hu3 {
    public final /* synthetic */ gi2 X;
    public int Y;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ph2(gi2 gi2Var, Continuation continuation) {
        super(continuation);
        this.X = gi2Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.o = obj;
        this.Y |= Integer.MIN_VALUE;
        return this.X.y(0L, this);
    }
}
