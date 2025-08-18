package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class gk5 extends hu3 {
    public final /* synthetic */ ik5 X;
    public int Y;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gk5(ik5 ik5Var, Continuation continuation) {
        super(continuation);
        this.X = ik5Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.o = obj;
        this.Y |= Integer.MIN_VALUE;
        return this.X.e(this);
    }
}
