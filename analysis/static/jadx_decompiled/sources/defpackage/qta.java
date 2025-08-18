package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class qta extends ffe implements a66 {
    public final /* synthetic */ rta X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qta(rta rtaVar, Continuation continuation) {
        super(2, continuation);
        this.X = rtaVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        qta qtaVar = (qta) n((on5) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        qtaVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new qta(this.X, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        rta rtaVar = this.X;
        rtaVar.a.registerActivityLifecycleCallbacks(rtaVar.c);
        return e5f.a;
    }
}
