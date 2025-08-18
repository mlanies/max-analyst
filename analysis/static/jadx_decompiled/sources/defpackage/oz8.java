package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class oz8 extends hu3 {
    public cu8 X;
    public boolean Y;
    public int Z;
    public Object o;
    public /* synthetic */ Object s0;
    public final /* synthetic */ xz8 t0;
    public int u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oz8(xz8 xz8Var, Continuation continuation) {
        super(continuation);
        this.t0 = xz8Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.s0 = obj;
        this.u0 |= Integer.MIN_VALUE;
        return this.t0.x(null, false, this);
    }
}
