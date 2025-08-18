package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class kb6 extends hu3 {
    public final /* synthetic */ mb6 X;
    public int Y;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kb6(mb6 mb6Var, Continuation continuation) {
        super(continuation);
        this.X = mb6Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.o = obj;
        this.Y |= Integer.MIN_VALUE;
        return this.X.c(this);
    }
}
