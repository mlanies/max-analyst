package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class wac extends ffe implements a66 {
    public final /* synthetic */ cbc X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wac(cbc cbcVar, Continuation continuation) {
        super(2, continuation);
        this.X = cbcVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        wac wacVar = (wac) n((sx3) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        wacVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new wac(this.X, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        jac jacVar = this.X.c;
        eqe eqeVar = new eqe(mga.e);
        jacVar.getClass();
        pnf.o(jacVar.b, new gac(eqeVar));
        return e5f.a;
    }
}
