package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class kj7 extends hu3 {
    public /* synthetic */ Object X;
    public final /* synthetic */ vj7 Y;
    public int Z;
    public on5 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kj7(vj7 vj7Var, Continuation continuation) {
        super(continuation);
        this.Y = vj7Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return this.Y.g(null, null, this);
    }
}
