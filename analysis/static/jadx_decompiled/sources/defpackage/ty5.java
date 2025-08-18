package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class ty5 extends hu3 {
    public boolean X;
    public vy5 Y;
    public /* synthetic */ Object Z;
    public boolean o;
    public final /* synthetic */ vy5 s0;
    public int t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ty5(vy5 vy5Var, Continuation continuation) {
        super(continuation);
        this.s0 = vy5Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.Z = obj;
        this.t0 |= Integer.MIN_VALUE;
        return this.s0.a(null, null, false, false, this);
    }
}
