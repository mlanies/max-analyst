package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class be5 extends hu3 {
    public je5 X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ he5 Z;
    public he5 o;
    public int s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public be5(he5 he5Var, Continuation continuation) {
        super(continuation);
        this.Z = he5Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.Y = obj;
        this.s0 |= Integer.MIN_VALUE;
        return this.Z.s(null, this);
    }
}
