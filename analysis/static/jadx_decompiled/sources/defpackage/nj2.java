package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class nj2 extends hu3 {
    public Object X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ ck2 Z;
    public ck2 o;
    public int s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nj2(ck2 ck2Var, Continuation continuation) {
        super(continuation);
        this.Z = ck2Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.Y = obj;
        this.s0 |= Integer.MIN_VALUE;
        return ck2.t(this.Z, null, this);
    }
}
