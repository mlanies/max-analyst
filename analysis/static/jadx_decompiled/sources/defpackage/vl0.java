package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class vl0 extends hu3 {
    public /* synthetic */ Object X;
    public final /* synthetic */ yl0 Y;
    public int Z;
    public Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vl0(yl0 yl0Var, Continuation continuation) {
        super(continuation);
        this.Y = yl0Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return yl0.f(this.Y, null, 0L, this);
    }
}
