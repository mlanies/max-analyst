package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class x62 extends ffe implements a66 {
    public final /* synthetic */ int X;
    public final /* synthetic */ k72 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x62(int i, k72 k72Var, Continuation continuation) {
        super(2, continuation);
        this.X = i;
        this.Y = k72Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        x62 x62Var = (x62) n((sx3) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        x62Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new x62(this.X, this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        if (this.X == sea.E0) {
            bc7[] bc7VarArr = k72.x;
            k72 k72Var = this.Y;
            vxd vxdVarT = j47.T(k72Var.b, ((w9a) k72Var.p()).b(), null, new v62(k72Var, false, null), 2);
            k72Var.s.o1(k72Var, k72.x[0], vxdVarT);
        }
        return e5f.a;
    }
}
