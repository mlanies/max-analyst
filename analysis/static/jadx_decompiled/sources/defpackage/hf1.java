package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class hf1 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ of1 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hf1(of1 of1Var, Continuation continuation) {
        super(2, continuation);
        this.Y = of1Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        hf1 hf1Var = (hf1) n((wm9) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        hf1Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        hf1 hf1Var = new hf1(this.Y, continuation);
        hf1Var.X = obj;
        return hf1Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        pnf.o(this.Y.E0, (wm9) this.X);
        return e5f.a;
    }
}
