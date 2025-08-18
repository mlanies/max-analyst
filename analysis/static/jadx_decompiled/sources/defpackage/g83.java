package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class g83 extends hu3 {
    public y73 X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ m83 Z;
    public m83 o;
    public int s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g83(m83 m83Var, Continuation continuation) {
        super(continuation);
        this.Z = m83Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.Y = obj;
        this.s0 |= Integer.MIN_VALUE;
        return m83.a(this.Z, null, this);
    }
}
