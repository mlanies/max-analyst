package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class lm2 extends hu3 {
    public long X;
    public long Y;
    public long Z;
    public mm2 o;
    public boolean s0;
    public /* synthetic */ Object t0;
    public final /* synthetic */ mm2 u0;
    public int v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lm2(mm2 mm2Var, Continuation continuation) {
        super(continuation);
        this.u0 = mm2Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.t0 = obj;
        this.v0 |= Integer.MIN_VALUE;
        return this.u0.a(0L, 0L, 0L, false, this);
    }
}
