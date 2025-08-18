package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class wy1 extends hu3 {
    public final /* synthetic */ tk1 X;
    public int Y;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wy1(tk1 tk1Var, Continuation continuation) {
        super(continuation);
        this.X = tk1Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.o = obj;
        this.Y |= Integer.MIN_VALUE;
        return this.X.a(null, this);
    }
}
