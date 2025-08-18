package defpackage;

import java.util.concurrent.atomic.AtomicLong;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class is2 extends ffe implements a66 {
    public final /* synthetic */ ks2 X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public is2(ks2 ks2Var, Continuation continuation) {
        super(2, continuation);
        this.X = ks2Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        is2 is2Var = (is2) n((sx3) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        is2Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new is2(this.X, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        ks2 ks2Var = this.X;
        AtomicLong atomicLong = ks2Var.C0;
        pk pkVar = (pk) ks2Var.X.getValue();
        k4a k4aVar = (k4a) pkVar;
        atomicLong.set(k4a.v(k4aVar, new g32(((p7b) k4aVar.y()).a.o(), ks2Var.G0, ks2Var.H0)));
        return e5f.a;
    }
}
