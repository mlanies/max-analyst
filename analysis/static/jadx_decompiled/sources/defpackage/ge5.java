package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ge5 extends hu3 {
    public final /* synthetic */ he5 X;
    public int Y;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ge5(he5 he5Var, Continuation continuation) {
        super(continuation);
        this.X = he5Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.o = obj;
        this.Y |= Integer.MIN_VALUE;
        return he5.p(this.X, null, this);
    }
}
