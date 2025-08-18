package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class qj2 extends hu3 {
    public Object X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ ck2 Z;
    public ck2 o;
    public int s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qj2(ck2 ck2Var, Continuation continuation) {
        super(continuation);
        this.Z = ck2Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.Y = obj;
        this.s0 |= Integer.MIN_VALUE;
        return this.Z.F(null, this);
    }
}
