package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class h22 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ l22 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h22(l22 l22Var, Continuation continuation) {
        super(2, continuation);
        this.Y = l22Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        h22 h22Var = (h22) n((wm9) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        h22Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        h22 h22Var = new h22(this.Y, continuation);
        h22Var.X = obj;
        return h22Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        pnf.o(this.Y.Z, (wm9) this.X);
        return e5f.a;
    }
}
