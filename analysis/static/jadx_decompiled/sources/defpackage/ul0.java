package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ul0 extends hu3 {
    public final /* synthetic */ yl0 X;
    public int Y;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ul0(yl0 yl0Var, Continuation continuation) {
        super(continuation);
        this.X = yl0Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.o = obj;
        this.Y |= Integer.MIN_VALUE;
        return this.X.g(null, this);
    }
}
