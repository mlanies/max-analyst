package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class vg6 extends hu3 {
    public final /* synthetic */ xg6 X;
    public int Y;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vg6(xg6 xg6Var, Continuation continuation) {
        super(continuation);
        this.X = xg6Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.o = obj;
        this.Y |= Integer.MIN_VALUE;
        return this.X.b(null, this);
    }
}
