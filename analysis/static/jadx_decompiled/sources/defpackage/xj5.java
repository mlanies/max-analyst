package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class xj5 extends hu3 {
    public Object X;
    public Object Y;
    public xi9 Z;
    public yj5 o;
    public /* synthetic */ Object s0;
    public final /* synthetic */ yj5 t0;
    public int u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xj5(yj5 yj5Var, Continuation continuation) {
        super(continuation);
        this.t0 = yj5Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.s0 = obj;
        this.u0 |= Integer.MIN_VALUE;
        return this.t0.f(null, null, this);
    }
}
