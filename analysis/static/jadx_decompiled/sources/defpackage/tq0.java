package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class tq0 extends hu3 {
    public ru2 X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ uq0 Z;
    public uq0 o;
    public int s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tq0(uq0 uq0Var, Continuation continuation) {
        super(continuation);
        this.Z = uq0Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.Y = obj;
        this.s0 |= Integer.MIN_VALUE;
        return uq0.a(this.Z, this);
    }
}
