package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class nf5 extends hu3 {
    public /* synthetic */ Object X;
    public final /* synthetic */ pf5 Y;
    public int Z;
    public pf5 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nf5(pf5 pf5Var, Continuation continuation) {
        super(continuation);
        this.Y = pf5Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return this.Y.a(0L, 0L, null, null, null, 0, this);
    }
}
