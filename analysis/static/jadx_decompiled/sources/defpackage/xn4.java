package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class xn4 extends hu3 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ao4 Y;
    public int Z;
    public ao4 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xn4(ao4 ao4Var, Continuation continuation) {
        super(continuation);
        this.Y = ao4Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return this.Y.d(this);
    }
}
