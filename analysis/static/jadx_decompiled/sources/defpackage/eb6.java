package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class eb6 extends hu3 {
    public long X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ gb6 Z;
    public gb6 o;
    public int s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eb6(gb6 gb6Var, Continuation continuation) {
        super(continuation);
        this.Z = gb6Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.Y = obj;
        this.s0 |= Integer.MIN_VALUE;
        return this.Z.a(0L, false, this);
    }
}
