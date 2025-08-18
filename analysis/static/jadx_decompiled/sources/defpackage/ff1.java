package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class ff1 extends ffe implements a66 {
    public final /* synthetic */ of1 X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ff1(of1 of1Var, Continuation continuation) {
        super(2, continuation);
        this.X = of1Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ff1 ff1Var = (ff1) n((pqa) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        ff1Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new ff1(this.X, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        of1 of1Var = this.X;
        String str = of1Var.y0;
        j47.T(of1Var.a, ((w9a) of1Var.X).e(), null, new mf1(of1Var, str, null), 2);
        return e5f.a;
    }
}
