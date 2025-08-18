package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class bh2 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ dh2 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bh2(dh2 dh2Var, Continuation continuation) {
        super(2, continuation);
        this.Y = dh2Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        bh2 bh2Var = (bh2) n((e52) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        bh2Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        bh2 bh2Var = new bh2(this.Y, continuation);
        bh2Var.X = obj;
        return bh2Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        e52 e52Var = (e52) this.X;
        q0e q0eVar = this.Y.b;
        String strG = e52Var.g(kk0.c, jk0.a);
        e52Var.l0();
        q0eVar.m(null, new ch2(new tka(strG, e52Var.x0, e52Var.f(), null, 24), e52Var.q()));
        return e5f.a;
    }
}
