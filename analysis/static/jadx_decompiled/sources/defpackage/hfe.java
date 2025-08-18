package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class hfe extends hu3 {
    public v6f X;
    public it3 Y;
    public /* synthetic */ Object Z;
    public cge o;
    public final /* synthetic */ cge s0;
    public int t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hfe(cge cgeVar, Continuation continuation) {
        super(continuation);
        this.s0 = cgeVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.Z = obj;
        this.t0 |= Integer.MIN_VALUE;
        return this.s0.e(null, null, this);
    }
}
