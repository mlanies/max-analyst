package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class yt0 extends hu3 {
    public final /* synthetic */ zt0 X;
    public int Y;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yt0(zt0 zt0Var, Continuation continuation) {
        super(continuation);
        this.X = zt0Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        this.o = obj;
        this.Y |= Integer.MIN_VALUE;
        Object objD = this.X.D(null, 0, 0L, this);
        return objD == tx3.a ? objD : new i42(objD);
    }
}
