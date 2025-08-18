package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class cl2 extends hu3 {
    public final /* synthetic */ fl2 X;
    public int Y;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cl2(fl2 fl2Var, Continuation continuation) {
        super(continuation);
        this.X = fl2Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.o = obj;
        this.Y |= Integer.MIN_VALUE;
        return fl2.b(this.X, null, this);
    }
}
