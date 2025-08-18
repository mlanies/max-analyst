package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class a89 extends hu3 {
    public long X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ l89 Z;
    public l89 o;
    public int s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a89(l89 l89Var, Continuation continuation) {
        super(continuation);
        this.Z = l89Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.Y = obj;
        this.s0 |= Integer.MIN_VALUE;
        return l89.a(this.Z, 0L, this);
    }
}
