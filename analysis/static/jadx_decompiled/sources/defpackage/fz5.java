package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class fz5 extends ffe implements a66 {
    public final /* synthetic */ iz5 X;
    public final /* synthetic */ StringBuilder Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fz5(iz5 iz5Var, StringBuilder sb, Continuation continuation) {
        super(2, continuation);
        this.X = iz5Var;
        this.Y = sb;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((fz5) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new fz5(this.X, this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        wha whaVar = (wha) this.X.k.getValue();
        whaVar.h(this.Y);
        return whaVar.i();
    }
}
