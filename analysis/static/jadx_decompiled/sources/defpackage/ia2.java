package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ia2 extends hu3 {
    public final /* synthetic */ ka2 X;
    public int Y;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ia2(ka2 ka2Var, Continuation continuation) {
        super(continuation);
        this.X = ka2Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.o = obj;
        this.Y |= Integer.MIN_VALUE;
        return this.X.l(this);
    }
}
