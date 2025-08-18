package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class tb9 extends hu3 {
    public gi9 X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ xb9 Z;
    public xb9 o;
    public int s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tb9(xb9 xb9Var, Continuation continuation) {
        super(continuation);
        this.Z = xb9Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.Y = obj;
        this.s0 |= Integer.MIN_VALUE;
        return this.Z.p(null, 0L, this);
    }
}
