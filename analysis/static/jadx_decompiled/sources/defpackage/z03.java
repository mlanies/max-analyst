package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class z03 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ qp4 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z03(qp4 qp4Var, Continuation continuation) {
        super(2, continuation);
        this.Y = qp4Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        z03 z03Var = (z03) n((fka) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        z03Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        z03 z03Var = new z03(this.Y, continuation);
        z03Var.X = obj;
        return z03Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        fka fkaVar = (fka) this.X;
        ((q0e) this.Y.Z).setValue(fkaVar);
        String str = (String) this.Y.a;
        ir6 ir6Var = hm9.m;
        if (ir6Var != null && ir6Var.c()) {
            ir6Var.d(us7.X, str, "big_flow: onEach " + fkaVar + ", isEmitted=true", null);
        }
        return e5f.a;
    }
}
