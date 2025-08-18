package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class hna extends ffe implements a66 {
    public final /* synthetic */ ina X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hna(ina inaVar, Continuation continuation) {
        super(2, continuation);
        this.X = inaVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        hna hnaVar = (hna) n((sx3) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        hnaVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new hna(this.X, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        bc7[] bc7VarArr = ina.s0;
        ina inaVar = this.X;
        boolean z = !((jp) ((hp) inaVar.c.getValue())).g.getBoolean("app.notification.show.new.users", true);
        ((jp) ((hp) inaVar.c.getValue())).j("app.notification.show.new.users", z);
        pk pkVar = (pk) inaVar.b.getValue();
        eaf eafVar = new eaf();
        eafVar.a = Boolean.valueOf(z);
        pkVar.a(new gaf(eafVar));
        inaVar.X.setValue(inaVar.q());
        return e5f.a;
    }
}
