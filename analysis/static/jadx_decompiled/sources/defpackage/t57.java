package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class t57 extends hu3 {
    public /* synthetic */ Object X;
    public final /* synthetic */ c67 Y;
    public int Z;
    public Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t57(c67 c67Var, Continuation continuation) {
        super(continuation);
        this.Y = c67Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return c67.q(this.Y, null, null, this);
    }
}
