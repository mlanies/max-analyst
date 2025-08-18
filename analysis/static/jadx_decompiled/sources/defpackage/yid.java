package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class yid extends ffe implements a66 {
    public /* synthetic */ Object X;

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        yid yidVar = (yid) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        yidVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        yid yidVar = new yid(2, continuation);
        yidVar.X = obj;
        return yidVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        ihd.c.P1().b(":settings/privacy/pincode?mode=confirm&hash=".concat((String) this.X), null);
        return e5f.a;
    }
}
