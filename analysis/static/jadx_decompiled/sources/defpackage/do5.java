package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class do5 extends hu3 {
    public int X;
    public Object Y;
    public on5 Z;
    public /* synthetic */ Object o;
    public final /* synthetic */ yn5 s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public do5(yn5 yn5Var, Continuation continuation) {
        super(continuation);
        this.s0 = yn5Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.o = obj;
        this.X |= Integer.MIN_VALUE;
        return this.s0.a(null, this);
    }
}
