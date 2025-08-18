package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class cjc extends ffe implements a66 {
    public final /* synthetic */ djc X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cjc(djc djcVar, Continuation continuation) {
        super(2, continuation);
        this.X = djcVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        cjc cjcVar = (cjc) n(Integer.valueOf(((Number) obj).intValue()), (Continuation) obj2);
        e5f e5fVar = e5f.a;
        cjcVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new cjc(this.X, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        djc djcVar = this.X;
        hm9.n(djcVar.X, "executeTasks");
        r9d.y((s8g) djcVar.a.getValue());
        ((jy8) djcVar.b.getValue()).a();
        return e5f.a;
    }
}
