package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class g79 extends hu3 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ n79 Z;
    public n79 o;
    public int s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g79(n79 n79Var, Continuation continuation) {
        super(continuation);
        this.Z = n79Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.Y = obj;
        this.s0 |= Integer.MIN_VALUE;
        return this.Z.d(0L, this);
    }
}
