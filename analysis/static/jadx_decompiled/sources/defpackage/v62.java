package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class v62 extends ffe implements a66 {
    public final /* synthetic */ k72 X;
    public final /* synthetic */ boolean Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v62(k72 k72Var, boolean z, Continuation continuation) {
        super(2, continuation);
        this.X = k72Var;
        this.Y = z;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((v62) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new v62(this.X, this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        k72 k72Var = this.X;
        e52 e52VarO = k72Var.o();
        e5f e5fVar = e5f.a;
        if (e52VarO == null) {
            return e5fVar;
        }
        (this.Y ? k72Var.u : k72Var.v).set(((k4a) ((pk) k72Var.o.getValue())).l(e52VarO.a, e52VarO.b.a, 0, null, true, null));
        return e5fVar;
    }
}
