package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class cx2 extends ffe implements a66 {
    public final /* synthetic */ nx2 X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cx2(nx2 nx2Var, Continuation continuation) {
        super(2, continuation);
        this.X = nx2Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        cx2 cx2Var = (cx2) n((on5) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        cx2Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new cx2(this.X, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        this.X.b.b();
        return e5f.a;
    }
}
