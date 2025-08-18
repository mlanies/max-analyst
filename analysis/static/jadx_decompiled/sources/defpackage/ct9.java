package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class ct9 extends hu3 {
    public /* synthetic */ Object X;
    public final /* synthetic */ gt9 Y;
    public int Z;
    public iv6 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ct9(gt9 gt9Var, Continuation continuation) {
        super(continuation);
        this.Y = gt9Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return this.Y.a(null, null, this);
    }
}
