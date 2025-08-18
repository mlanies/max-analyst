package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class os9 extends hu3 {
    public fs8 X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ ps9 Z;
    public ps9 o;
    public int s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public os9(ps9 ps9Var, Continuation continuation) {
        super(continuation);
        this.Z = ps9Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.Y = obj;
        this.s0 |= Integer.MIN_VALUE;
        return ps9.a(this.Z, 0L, null, this);
    }
}
