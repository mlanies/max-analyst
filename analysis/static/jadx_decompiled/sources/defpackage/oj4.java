package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class oj4 extends ffe implements a66 {
    public final /* synthetic */ pj4 X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oj4(pj4 pj4Var, Continuation continuation) {
        super(2, continuation);
        this.X = pj4Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        oj4 oj4Var = (oj4) n((sx3) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        oj4Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new oj4(this.X, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        bc7[] bc7VarArr = pj4.s0;
        pj4 pj4Var = this.X;
        int i = ((kxc) ((hp) pj4Var.c.getValue())).p() == 1 ? 0 : 1;
        String str = i != 1 ? i != 2 ? "ON" : "REPLY" : "OFF";
        kxc kxcVar = (kxc) ((hp) pj4Var.c.getValue());
        kxcVar.k(i, "app.notification.dialogs.show");
        kxcVar.j.e(Integer.valueOf(i));
        pk pkVar = (pk) pj4Var.b.getValue();
        eaf eafVar = new eaf();
        eafVar.c = str;
        pkVar.a(new gaf(eafVar));
        pj4Var.X.setValue(pj4Var.q());
        return e5f.a;
    }
}
