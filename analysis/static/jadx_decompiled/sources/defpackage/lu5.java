package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class lu5 extends hu3 {
    public ti9 X;
    public Object Y;
    public /* synthetic */ Object Z;
    public nu5 o;
    public final /* synthetic */ nu5 s0;
    public int t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lu5(nu5 nu5Var, Continuation continuation) {
        super(continuation);
        this.s0 = nu5Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.Z = obj;
        this.t0 |= Integer.MIN_VALUE;
        return nu5.r(this.s0, this);
    }
}
