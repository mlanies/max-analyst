package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ojb extends ffe implements a66 {
    public final /* synthetic */ zjb X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ojb(zjb zjbVar, Continuation continuation) {
        super(2, continuation);
        this.X = zjbVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ojb ojbVar = (ojb) n((sx3) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        ojbVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new ojb(this.X, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        wha whaVar = (wha) this.X.Y.getValue();
        whaVar.g(new eqe(vea.I1));
        whaVar.e(new kia(woc.I));
        whaVar.i();
        return e5f.a;
    }
}
