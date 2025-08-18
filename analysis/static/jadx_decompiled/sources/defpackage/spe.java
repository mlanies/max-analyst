package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class spe extends ffe implements a66 {
    public final /* synthetic */ tpe X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public spe(tpe tpeVar, Continuation continuation) {
        super(2, continuation);
        this.X = tpeVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        spe speVar = (spe) n((e5f) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        speVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new spe(this.X, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        this.X.c.clear();
        return e5f.a;
    }
}
