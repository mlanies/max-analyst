package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class v39 extends ffe implements a66 {
    public final /* synthetic */ n59 X;
    public final /* synthetic */ x69 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v39(n59 n59Var, x69 x69Var, Continuation continuation) {
        super(2, continuation);
        this.X = n59Var;
        this.Y = x69Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        v39 v39Var = (v39) n((sx3) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        v39Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new v39(this.X, this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        long j = this.Y.a;
        bc7[] bc7VarArr = n59.D1;
        this.X.K(j, false, true, false);
        return e5f.a;
    }
}
