package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class pff extends hu3 {
    public l20 X;
    public k20 Y;
    public /* synthetic */ Object Z;
    public rff o;
    public final /* synthetic */ rff s0;
    public int t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pff(rff rffVar, Continuation continuation) {
        super(continuation);
        this.s0 = rffVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.Z = obj;
        this.t0 |= Integer.MIN_VALUE;
        return this.s0.c(null, 0L, 0L, this);
    }
}
