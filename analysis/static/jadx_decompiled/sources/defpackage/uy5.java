package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class uy5 extends hu3 {
    public vy5 X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ vy5 Z;
    public boolean o;
    public int s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uy5(vy5 vy5Var, Continuation continuation) {
        super(continuation);
        this.Z = vy5Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.Y = obj;
        this.s0 |= Integer.MIN_VALUE;
        return this.Z.b(0L, null, this, false);
    }
}
