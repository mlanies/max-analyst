package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class qo5 extends hu3 {
    public int X;
    public final /* synthetic */ qn5 Y;
    public qn5 Z;
    public /* synthetic */ Object o;
    public on5 s0;
    public int t0;
    public int u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qo5(qn5 qn5Var, Continuation continuation) {
        super(continuation);
        this.Y = qn5Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.o = obj;
        this.X |= Integer.MIN_VALUE;
        return this.Y.d(null, this);
    }
}
