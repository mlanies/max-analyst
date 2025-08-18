package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class j83 extends hu3 {
    public uq2 X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ m83 Z;
    public m83 o;
    public int s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j83(m83 m83Var, Continuation continuation) {
        super(continuation);
        this.Z = m83Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.Y = obj;
        this.s0 |= Integer.MIN_VALUE;
        return m83.b(this.Z, this);
    }
}
