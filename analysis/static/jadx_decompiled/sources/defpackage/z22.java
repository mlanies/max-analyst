package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class z22 extends ffe implements a66 {
    public final /* synthetic */ a32 X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z22(a32 a32Var, Continuation continuation) {
        super(2, continuation);
        this.X = a32Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        z22 z22Var = (z22) n((sx3) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        z22Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new z22(this.X, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        a32 a32Var = this.X;
        ((jz2) ((iy2) a32Var.o.getValue())).l().Q(a32Var.b);
        pnf.o(a32Var.Z, pkb.b);
        return e5f.a;
    }
}
