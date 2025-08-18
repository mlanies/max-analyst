package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class np7 extends hu3 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ pp7 Z;
    public pp7 o;
    public int s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public np7(pp7 pp7Var, Continuation continuation) {
        super(continuation);
        this.Z = pp7Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.Y = obj;
        this.s0 |= Integer.MIN_VALUE;
        return this.Z.e(0L, this);
    }
}
