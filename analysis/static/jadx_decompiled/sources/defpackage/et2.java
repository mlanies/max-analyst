package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class et2 extends hu3 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ft2 Y;
    public int Z;
    public ft2 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public et2(ft2 ft2Var, Continuation continuation) {
        super(continuation);
        this.Y = ft2Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return this.Y.a(null, this);
    }
}
