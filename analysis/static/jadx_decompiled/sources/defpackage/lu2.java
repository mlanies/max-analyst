package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class lu2 extends hu3 {
    public /* synthetic */ Object X;
    public final /* synthetic */ nu2 Y;
    public int Z;
    public nu2 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lu2(nu2 nu2Var, Continuation continuation) {
        super(continuation);
        this.Y = nu2Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        this.Y.d(null, this);
        return tx3.a;
    }
}
