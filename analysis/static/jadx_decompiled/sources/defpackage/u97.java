package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class u97 extends hu3 {
    public /* synthetic */ Object X;
    public final /* synthetic */ w97 Y;
    public int Z;
    public w97 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u97(w97 w97Var, Continuation continuation) {
        super(continuation);
        this.Y = w97Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return this.Y.e(null, this);
    }
}
