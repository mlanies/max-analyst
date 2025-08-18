package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class g22 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ l22 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g22(l22 l22Var, Continuation continuation) {
        super(2, continuation);
        this.Y = l22Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        g22 g22Var = (g22) n((y12) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        g22Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        g22 g22Var = new g22(this.Y, continuation);
        g22Var.X = obj;
        return g22Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        y12 y12Var = (y12) this.X;
        l22 l22Var = this.Y;
        l22Var.X.setValue(y12Var.a);
        l22Var.c.setValue(y12Var.b);
        return e5f.a;
    }
}
