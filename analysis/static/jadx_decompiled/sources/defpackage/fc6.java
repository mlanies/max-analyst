package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class fc6 extends hu3 {
    public String X;
    public long Y;
    public /* synthetic */ Object Z;
    public Object o;
    public final /* synthetic */ gc6 s0;
    public int t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fc6(gc6 gc6Var, Continuation continuation) {
        super(continuation);
        this.s0 = gc6Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.Z = obj;
        this.t0 |= Integer.MIN_VALUE;
        return this.s0.a(0L, null, null, this);
    }
}
