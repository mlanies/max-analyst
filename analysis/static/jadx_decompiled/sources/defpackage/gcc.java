package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class gcc extends ffe implements a66 {
    public final /* synthetic */ kcc X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gcc(kcc kccVar, Continuation continuation) {
        super(2, continuation);
        this.X = kccVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        gcc gccVar = (gcc) n((wvc) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        gccVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new gcc(this.X, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        pnf.o(this.X.u0, cj1.D);
        return e5f.a;
    }
}
