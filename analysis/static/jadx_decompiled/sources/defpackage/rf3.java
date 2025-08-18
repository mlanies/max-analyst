package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class rf3 extends ffe implements a66 {
    public /* synthetic */ Object X;

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        rf3 rf3Var = (rf3) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        rf3Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        rf3 rf3Var = new rf3(2, continuation);
        rf3Var.X = obj;
        return rf3Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        ihd.c.P1().b(":settings/privacy", null);
        return e5f.a;
    }
}
