package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class s39 extends hu3 {
    public /* synthetic */ Object X;
    public final /* synthetic */ n59 Y;
    public int Z;
    public String o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s39(n59 n59Var, Continuation continuation) {
        super(continuation);
        this.Y = n59Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return this.Y.x(0L, null, 0L, false, this);
    }
}
