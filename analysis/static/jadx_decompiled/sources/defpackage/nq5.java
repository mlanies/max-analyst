package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class nq5 extends hu3 {
    public int X;
    public final /* synthetic */ yn5 Y;
    public Object Z;
    public /* synthetic */ Object o;
    public on5 s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nq5(yn5 yn5Var, Continuation continuation) {
        super(continuation);
        this.Y = yn5Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.o = obj;
        this.X |= Integer.MIN_VALUE;
        return this.Y.a(null, this);
    }
}
