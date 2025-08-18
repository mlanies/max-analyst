package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class ob1 extends ffe implements a66 {
    public final /* synthetic */ vb1 X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ob1(vb1 vb1Var, Continuation continuation) {
        super(2, continuation);
        this.X = vb1Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ob1 ob1Var = (ob1) n((sx3) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        ob1Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new ob1(this.X, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        vb1 vb1Var = this.X;
        vb1Var.z0 = new Long(((k4a) ((pk) vb1Var.Y.getValue())).A(c37.D(this.X.b), true));
        return e5f.a;
    }
}
