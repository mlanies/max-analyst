package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class et9 extends hu3 {
    public uj3 X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ gt9 Z;
    public gt9 o;
    public int s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public et9(gt9 gt9Var, Continuation continuation) {
        super(continuation);
        this.Z = gt9Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.Y = obj;
        this.s0 |= Integer.MIN_VALUE;
        return this.Z.c(null, this);
    }
}
