package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class jq1 extends hu3 {
    public /* synthetic */ Object X;
    public final /* synthetic */ kq1 Y;
    public int Z;
    public iab o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jq1(kq1 kq1Var, Continuation continuation) {
        super(continuation);
        this.Y = kq1Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return this.Y.j(null, this);
    }
}
