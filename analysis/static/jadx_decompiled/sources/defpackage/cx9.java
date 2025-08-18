package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class cx9 extends ffe implements a66 {
    public final /* synthetic */ gx9 X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cx9(gx9 gx9Var, Continuation continuation) {
        super(2, continuation);
        this.X = gx9Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        cx9 cx9Var = (cx9) n((sx3) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        cx9Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new cx9(this.X, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        bc7[] bc7VarArr = gx9.C0;
        gx9 gx9Var = this.X;
        ((jp) gx9Var.q()).j("app.notification.show.text", !((jp) gx9Var.q()).g.getBoolean("app.notification.show.text", true));
        ((cea) gx9Var.Y.getValue()).c();
        q0e q0eVar = gx9Var.x0;
        q0eVar.m(null, new Integer(((Number) q0eVar.getValue()).intValue() + 1));
        return e5f.a;
    }
}
