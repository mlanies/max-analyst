package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class zy6 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ fz6 Y;
    public final /* synthetic */ int Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zy6(fz6 fz6Var, int i, Continuation continuation) {
        super(2, continuation);
        this.Y = fz6Var;
        this.Z = i;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        zy6 zy6Var = (zy6) n((sx3) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        zy6Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        zy6 zy6Var = new zy6(this.Y, this.Z, continuation);
        zy6Var.X = obj;
        return zy6Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        sx3 sx3Var = (sx3) this.X;
        fz6 fz6Var = this.Y;
        vxd vxdVarT = j47.T(sx3Var, null, null, new xy6(fz6Var, null), 3);
        int i = this.Z;
        vxdVarT.invokeOnCompletion(new wy6(i, 0));
        j47.T(sx3Var, null, null, new yy6(fz6Var, null), 3).invokeOnCompletion(new wy6(i, 1));
        return e5f.a;
    }
}
