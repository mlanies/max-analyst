package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class u63 extends hu3 {
    public final /* synthetic */ v63 X;
    public int Y;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u63(v63 v63Var, Continuation continuation) {
        super(continuation);
        this.X = v63Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.o = obj;
        this.Y |= Integer.MIN_VALUE;
        return this.X.a(null, this);
    }
}
