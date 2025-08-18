package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class vl2 extends hu3 {
    public Object X;
    public Object Y;
    public Object Z;
    public cm2 o;
    public long s0;
    public boolean t0;
    public /* synthetic */ Object u0;
    public final /* synthetic */ cm2 v0;
    public int w0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vl2(cm2 cm2Var, Continuation continuation) {
        super(continuation);
        this.v0 = cm2Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.u0 = obj;
        this.w0 |= Integer.MIN_VALUE;
        return this.v0.c(null, this);
    }
}
