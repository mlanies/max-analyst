package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class qh2 extends hu3 {
    public boolean X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ gi2 Z;
    public String o;
    public int s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qh2(gi2 gi2Var, Continuation continuation) {
        super(continuation);
        this.Z = gi2Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.Y = obj;
        this.s0 |= Integer.MIN_VALUE;
        return this.Z.z(0L, null, 0L, false, this);
    }
}
