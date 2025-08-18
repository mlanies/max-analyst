package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class y4g extends hu3 {
    public /* synthetic */ Object X;
    public final /* synthetic */ p31 Y;
    public int Z;
    public p31 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y4g(p31 p31Var, Continuation continuation) {
        super(continuation);
        this.Y = p31Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return this.Y.b(this);
    }
}
