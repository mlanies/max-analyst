package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class ou2 extends hu3 {
    public /* synthetic */ Object X;
    public final /* synthetic */ pu2 Y;
    public int Z;
    public pu2 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ou2(pu2 pu2Var, Continuation continuation) {
        super(continuation);
        this.Y = pu2Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return this.Y.g(this);
    }
}
