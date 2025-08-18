package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class hj2 extends hu3 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ck2 Y;
    public int Z;
    public ck2 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hj2(ck2 ck2Var, Continuation continuation) {
        super(continuation);
        this.Y = ck2Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return ck2.r(this.Y, null, this);
    }
}
