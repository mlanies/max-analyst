package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class xg2 extends hu3 {
    public long X;
    public long Y;
    public int Z;
    public yg2 o;
    public /* synthetic */ Object s0;
    public final /* synthetic */ yg2 t0;
    public int u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xg2(yg2 yg2Var, Continuation continuation) {
        super(continuation);
        this.t0 = yg2Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.s0 = obj;
        this.u0 |= Integer.MIN_VALUE;
        return this.t0.b(0, 0L, 0L, this);
    }
}
