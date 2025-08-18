package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class hc6 extends hu3 {
    public final /* synthetic */ jc6 X;
    public int Y;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hc6(jc6 jc6Var, Continuation continuation) {
        super(continuation);
        this.X = jc6Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.o = obj;
        this.Y |= Integer.MIN_VALUE;
        return jc6.b(this.X, 0L, null, this);
    }
}
