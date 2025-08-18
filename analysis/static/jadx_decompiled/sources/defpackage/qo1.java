package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class qo1 extends hu3 {
    public final /* synthetic */ so1 X;
    public int Y;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qo1(so1 so1Var, Continuation continuation) {
        super(continuation);
        this.X = so1Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.o = obj;
        this.Y |= Integer.MIN_VALUE;
        return so1.a(this.X, this);
    }
}
