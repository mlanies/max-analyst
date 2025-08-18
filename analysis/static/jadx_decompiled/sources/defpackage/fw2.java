package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class fw2 extends ffe implements a66 {
    public final /* synthetic */ gw2 X;
    public final /* synthetic */ long Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fw2(gw2 gw2Var, long j, Continuation continuation) {
        super(2, continuation);
        this.X = gw2Var;
        this.Y = j;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        fw2 fw2Var = (fw2) n((sx3) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        fw2Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new fw2(this.X, this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        bc7[] bc7VarArr = gw2.Q0;
        p82 p82VarL = ((jz2) this.X.s()).l();
        cqc.a(new y72(p82VarL, this.Y, ((p7b) p82VarL.n).a.n(), 0), p82VarL.z, null, new un0(18), null);
        return e5f.a;
    }
}
