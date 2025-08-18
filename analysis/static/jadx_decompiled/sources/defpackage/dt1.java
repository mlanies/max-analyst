package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class dt1 extends hu3 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ft1 Y;
    public int Z;
    public ft1 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dt1(ft1 ft1Var, Continuation continuation) {
        super(continuation);
        this.Y = ft1Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return this.Y.a(this);
    }
}
