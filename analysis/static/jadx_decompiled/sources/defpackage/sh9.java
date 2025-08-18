package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class sh9 extends ffe implements a66 {
    public final /* synthetic */ uh9 X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sh9(uh9 uh9Var, Continuation continuation) {
        super(2, continuation);
        this.X = uh9Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        sh9 sh9Var = (sh9) n((sx3) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        sh9Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new sh9(this.X, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        a98 a98Var = this.X.m;
        if (a98Var != null) {
            a98Var.stop();
        }
        return e5f.a;
    }
}
