package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class zm9 extends hu3 {
    public aj9 X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ an9 Z;
    public an9 o;
    public int s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zm9(an9 an9Var, Continuation continuation) {
        super(continuation);
        this.Z = an9Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.Y = obj;
        this.s0 |= Integer.MIN_VALUE;
        return an9.a(this.Z, this);
    }
}
