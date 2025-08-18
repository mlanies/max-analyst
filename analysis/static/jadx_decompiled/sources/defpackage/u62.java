package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class u62 extends hu3 {
    public /* synthetic */ Object X;
    public final /* synthetic */ k72 Y;
    public int Z;
    public k72 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u62(k72 k72Var, Continuation continuation) {
        super(continuation);
        this.Y = k72Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return this.Y.n(this);
    }
}
