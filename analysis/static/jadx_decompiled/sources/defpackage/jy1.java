package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class jy1 extends hu3 {
    public long X;
    public long Y;
    public long Z;
    public ky1 o;
    public long s0;
    public /* synthetic */ Object t0;
    public final /* synthetic */ ky1 u0;
    public int v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jy1(ky1 ky1Var, Continuation continuation) {
        super(continuation);
        this.u0 = ky1Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.t0 = obj;
        this.v0 |= Integer.MIN_VALUE;
        return this.u0.a(0L, 0L, 0L, 0L, null, this);
    }
}
