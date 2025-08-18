package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class qb5 extends ffe implements a66 {
    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((qb5) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new qb5(2, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        return Boolean.valueOf(((f5a) q3g.a.getAccessor().c(f5a.class)).d());
    }
}
