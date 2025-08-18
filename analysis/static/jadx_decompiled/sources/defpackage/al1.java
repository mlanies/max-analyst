package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class al1 extends hu3 {
    public int X;
    public final /* synthetic */ tk1 Y;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public al1(tk1 tk1Var, Continuation continuation) {
        super(continuation);
        this.Y = tk1Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.o = obj;
        this.X |= Integer.MIN_VALUE;
        return this.Y.a(null, this);
    }
}
