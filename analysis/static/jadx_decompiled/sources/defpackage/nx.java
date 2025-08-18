package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class nx extends hu3 {
    public long X;
    public long Y;
    public int Z;
    public px o;
    public /* synthetic */ Object s0;
    public final /* synthetic */ px t0;
    public int u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nx(px pxVar, Continuation continuation) {
        super(continuation);
        this.t0 = pxVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.s0 = obj;
        this.u0 |= Integer.MIN_VALUE;
        return this.t0.d(0, 0L, 0L, this);
    }
}
