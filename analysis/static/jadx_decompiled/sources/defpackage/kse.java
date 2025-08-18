package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class kse extends ffe implements a66 {
    public final /* synthetic */ lse X;
    public final /* synthetic */ String Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kse(lse lseVar, String str, Continuation continuation) {
        super(2, continuation);
        this.X = lseVar;
        this.Y = str;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        kse kseVar = (kse) n((sx3) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        kseVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new kse(this.X, this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        pq9 pq9Var = qp4.u0;
        lse lseVar = this.X;
        qp4 qp4VarB = pq9Var.b(lseVar.b);
        String str = this.Y;
        qp4VarB.l(str, true);
        lseVar.o.setValue(lseVar.q());
        pnf.o(lseVar.X, new jse(str));
        return e5f.a;
    }
}
