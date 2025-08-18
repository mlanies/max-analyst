package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class pj extends ffe implements a66 {
    public final /* synthetic */ rj X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pj(rj rjVar, Continuation continuation) {
        super(2, continuation);
        this.X = rjVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        pj pjVar = (pj) n((sx3) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        pjVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new pj(this.X, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        rj rjVar = this.X;
        ld2 ld2Var = (ld2) ((lr2) rjVar.f.getValue());
        ld2Var.t.j(-1);
        ld2Var.v.j(-1);
        ((t6b) rjVar.d.getValue()).a();
        ((jz2) ((iy2) rjVar.e.getValue())).l().O();
        ((ci0) rjVar.g.getValue()).a(ht2.a);
        return e5f.a;
    }
}
