package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class wc8 extends hu3 {
    public final /* synthetic */ yc8 X;
    public int Y;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wc8(yc8 yc8Var, Continuation continuation) {
        super(continuation);
        this.X = yc8Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.o = obj;
        this.Y |= Integer.MIN_VALUE;
        return this.X.c(null, null, this);
    }
}
