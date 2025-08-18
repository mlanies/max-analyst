package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class w4a extends ffe implements a66 {
    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        w4a w4aVar = (w4a) n((fka) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        w4aVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new w4a(2, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        k29 k29Var = (k29) jyc.a.getAccessor().c(k29.class);
        ((j29) k29Var.i.getValue()).j(-1);
        k29Var.e().i().forEach(new a29(new bk(12, k29Var), 0));
        return e5f.a;
    }
}
