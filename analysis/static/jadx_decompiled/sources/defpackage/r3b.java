package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class r3b extends ffe implements a66 {
    public final /* synthetic */ o23 X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r3b(o23 o23Var, Continuation continuation) {
        super(2, continuation);
        this.X = o23Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        r3b r3bVar = (r3b) n((on5) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        r3bVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new r3b(this.X, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        e60 e60Var = (e60) this.X.a;
        ((uh9) e60Var.c).e(e60Var.t0);
        sx3 sx3Var = e60Var.o;
        pag.n(sx3Var.getCoroutineContext()).invokeOnCompletion(new l(13, e60Var));
        j47.T(sx3Var, ((w9a) e60Var.a).a(), null, new c60(e60Var, null), 2);
        return e5f.a;
    }
}
