package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class i22 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ l22 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i22(l22 l22Var, Continuation continuation) {
        super(2, continuation);
        this.Y = l22Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        i22 i22Var = (i22) n((vcb) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        i22Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        i22 i22Var = new i22(this.Y, continuation);
        i22Var.X = obj;
        return i22Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        pnf.o(this.Y.s0, (vcb) this.X);
        return e5f.a;
    }
}
