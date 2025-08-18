package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class uo5 extends hu3 {
    public final /* synthetic */ tn5 X;
    public int Y;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uo5(tn5 tn5Var, Continuation continuation) {
        super(continuation);
        this.X = tn5Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.o = obj;
        this.Y |= Integer.MIN_VALUE;
        return this.X.a(null, this);
    }
}
