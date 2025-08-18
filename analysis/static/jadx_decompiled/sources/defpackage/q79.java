package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class q79 extends hu3 {
    public /* synthetic */ Object X;
    public final /* synthetic */ r79 Y;
    public int Z;
    public boolean o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q79(r79 r79Var, Continuation continuation) {
        super(continuation);
        this.Y = r79Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return this.Y.c(0L, 0L, 0L, false, 0, null, this);
    }
}
