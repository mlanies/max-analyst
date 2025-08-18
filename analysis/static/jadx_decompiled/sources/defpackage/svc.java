package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class svc extends ffe implements a66 {
    public /* synthetic */ Object X;

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((svc) n((mm3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        svc svcVar = new svc(2, continuation);
        svcVar.X = obj;
        return svcVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        return new mqc(new rvc((mm3) this.X, null));
    }
}
