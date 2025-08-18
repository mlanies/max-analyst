package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class hr1 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ir1 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hr1(ir1 ir1Var, Continuation continuation) {
        super(2, continuation);
        this.Y = ir1Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        hr1 hr1Var = (hr1) n((u9f) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        hr1Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        hr1 hr1Var = new hr1(this.Y, continuation);
        hr1Var.X = obj;
        return hr1Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        u9f u9fVar = (u9f) this.X;
        u9f u9fVar2 = u9f.a;
        ir1 ir1Var = this.Y;
        if (u9fVar == u9fVar2) {
            d04 d04Var = (d04) ir1Var.b().getValue();
            bt1 bt1Var = (bt1) ir1Var.m.getValue();
            String str = d04Var.c;
            bt1Var.getClass();
            bt1.c(bt1Var, "BAD_CONNECTION_ALERT", str, "VPN", null, null, null, d04Var.h, 56);
        }
        ir1Var.o(u9fVar);
        return e5f.a;
    }
}
