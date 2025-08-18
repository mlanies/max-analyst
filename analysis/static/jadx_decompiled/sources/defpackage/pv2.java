package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class pv2 extends ffe implements a66 {
    public final /* synthetic */ gw2 X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pv2(gw2 gw2Var, Continuation continuation) {
        super(2, continuation);
        this.X = gw2Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        pv2 pv2Var = (pv2) n((sx3) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        pv2Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new pv2(this.X, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        gw2 gw2Var = this.X;
        k9c k9cVar = gw2Var.b;
        k9cVar.getClass();
        new qa3(new c0a(new ty9(qy9.j(k9cVar.a.E(p82.I)), new j9c(k9cVar, 2), 1), new j9c(k9cVar, 5)), 0, new c0a(new ty9(new ty9(qy9.j(k9cVar.b.j(el3.r, el3.t)), new j9c(k9cVar, 6), 1), new j9c(k9cVar, 0), 1), new j9c(k9cVar, 4))).k(k9cVar.c).i(new iq1(new p4c(8), 0, new fa4(4)));
        q0e q0eVar = gw2Var.E0;
        ov2 ov2Var = (ov2) q0eVar.getValue();
        it6 it6Var = ov2Var.c;
        q0eVar.m(null, ov2.a(ov2Var, null, new it6(it6Var.a, nz4.a, it6Var.c), null, false, 27));
        return e5f.a;
    }
}
