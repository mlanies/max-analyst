package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class gt5 extends hu3 {
    public tu2 X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ ht5 Z;
    public ht5 o;
    public int s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gt5(ht5 ht5Var, Continuation continuation) {
        super(continuation);
        this.Z = ht5Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.Y = obj;
        this.s0 |= Integer.MIN_VALUE;
        return ht5.a(this.Z, this);
    }
}
