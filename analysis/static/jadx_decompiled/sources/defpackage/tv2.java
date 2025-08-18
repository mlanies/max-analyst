package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class tv2 extends ffe implements a66 {
    public final /* synthetic */ gw2 X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tv2(gw2 gw2Var, Continuation continuation) {
        super(2, continuation);
        this.X = gw2Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        tv2 tv2Var = (tv2) n((sx3) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        tv2Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new tv2(this.X, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        gw2 gw2Var = this.X;
        yx7 yx7Var = gw2Var.o;
        String str = ((ov2) gw2Var.E0.getValue()).b;
        yx7Var.getClass();
        hm9.n("yx7", "loadNextMessages");
        if (cqc.c(yx7Var.l)) {
            au auVar = new au(str, !oag.t(yx7Var.s) ? yx7Var.s : null);
            tle tleVar = (tle) yx7Var.d;
            tleVar.getClass();
            q1a q1aVar = new q1a(1, new ypc(tleVar, 9, auVar));
            ztc ztcVar = yx7Var.c;
            drd drdVarI = q1aVar.i(ztcVar);
            fme fmeVar = yx7Var.f;
            fmeVar.getClass();
            drd drdVarI2 = drdVarI.j(new dme(fmeVar, 1, 0)).m(ztcVar).i(yx7Var.b);
            iq1 iq1Var = new iq1(new sx7(yx7Var, str, 0), 2, new rx7(yx7Var, 1));
            drdVarI2.k(iq1Var);
            yx7Var.l = iq1Var;
        } else {
            hm9.n("yx7", "searchMessagesInternal: is loading, return");
        }
        return e5f.a;
    }
}
