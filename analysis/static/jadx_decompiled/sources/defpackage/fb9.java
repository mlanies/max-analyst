package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class fb9 extends hu3 {
    public /* synthetic */ Object X;
    public final /* synthetic */ t68 Y;
    public int Z;
    public t68 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fb9(t68 t68Var, Continuation continuation) {
        super(continuation);
        this.Y = t68Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return this.Y.d(this);
    }
}
