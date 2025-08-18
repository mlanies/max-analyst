package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class xq extends ffe implements a66 {
    public /* synthetic */ Object X;

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        xq xqVar = (xq) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        xqVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        xq xqVar = new xq(2, continuation);
        xqVar.X = obj;
        return xqVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        if (tpa.f((wm9) this.X, g43.b)) {
            lr.c.P1().d();
        }
        return e5f.a;
    }
}
