package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class bu2 extends ffe implements a66 {
    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        bu2 bu2Var = (bu2) n((sx3) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        bu2Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new bu2(2, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        return e5f.a;
    }
}
