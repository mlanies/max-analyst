package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class hk1 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ el1 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hk1(el1 el1Var, Continuation continuation) {
        super(2, continuation);
        this.Y = el1Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        hk1 hk1Var = (hk1) n((wm9) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        hk1Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        hk1 hk1Var = new hk1(this.Y, continuation);
        hk1Var.X = obj;
        return hk1Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        pnf.o(this.Y.M0, (wm9) this.X);
        return e5f.a;
    }
}
