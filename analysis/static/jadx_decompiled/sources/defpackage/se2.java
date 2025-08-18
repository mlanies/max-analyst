package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class se2 extends hu3 {
    public String X;
    public s10 Y;
    public /* synthetic */ Object Z;
    public ye2 o;
    public final /* synthetic */ ye2 s0;
    public int t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public se2(ye2 ye2Var, Continuation continuation) {
        super(continuation);
        this.s0 = ye2Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.Z = obj;
        this.t0 |= Integer.MIN_VALUE;
        return this.s0.s(null, null, this);
    }
}
