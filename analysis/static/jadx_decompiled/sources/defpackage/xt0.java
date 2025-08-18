package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class xt0 extends hu3 {
    public final /* synthetic */ zt0 X;
    public int Y;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xt0(zt0 zt0Var, Continuation continuation) {
        super(continuation);
        this.X = zt0Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        this.o = obj;
        this.Y |= Integer.MIN_VALUE;
        Object objC = zt0.C(this.X, this);
        return objC == tx3.a ? objC : new i42(objC);
    }
}
