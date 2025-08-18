package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class kbb extends hu3 {
    public m56 X;
    public boolean Y;
    public long Z;
    public Object o;
    public /* synthetic */ Object s0;
    public final /* synthetic */ obb t0;
    public int u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kbb(obb obbVar, Continuation continuation) {
        super(continuation);
        this.t0 = obbVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.s0 = obj;
        this.u0 |= Integer.MIN_VALUE;
        return this.t0.b(null, null, null, false, null, this);
    }
}
