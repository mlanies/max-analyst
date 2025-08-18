package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class l97 extends ffe implements a66 {
    public final /* synthetic */ n97 X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l97(n97 n97Var, Continuation continuation) {
        super(2, continuation);
        this.X = n97Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        l97 l97Var = (l97) n((sx3) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        l97Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new l97(this.X, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        n97 n97Var = this.X;
        k4a k4aVar = (k4a) ((pk) n97Var.c.getValue());
        k4aVar.getClass();
        String str = n97Var.b;
        n97Var.o = (str == null || w9e.C0(str)) ? 0L : k4a.v(k4aVar, new oc2(((p7b) k4aVar.y()).a.o(), str, 0));
        return e5f.a;
    }
}
