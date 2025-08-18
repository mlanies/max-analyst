package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class k79 extends hu3 {
    public int X;
    public int Y;
    public /* synthetic */ Object Z;
    public n79 o;
    public final /* synthetic */ n79 s0;
    public int t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k79(n79 n79Var, Continuation continuation) {
        super(continuation);
        this.s0 = n79Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.Z = obj;
        this.t0 |= Integer.MIN_VALUE;
        return this.s0.l(null, this);
    }
}
