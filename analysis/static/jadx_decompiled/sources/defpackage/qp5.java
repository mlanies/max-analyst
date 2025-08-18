package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class qp5 extends hu3 {
    public /* synthetic */ Object X;
    public int Y;
    public final /* synthetic */ rp5 Z;
    public rp5 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qp5(rp5 rp5Var, Continuation continuation) {
        super(continuation);
        this.Z = rp5Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.X = obj;
        this.Y |= Integer.MIN_VALUE;
        return this.Z.a(null, this);
    }
}
