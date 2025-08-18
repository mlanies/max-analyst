package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class njb extends ffe implements a66 {
    public /* synthetic */ Object X;

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        njb njbVar = (njb) n((wm9) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        njbVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        njb njbVar = new njb(2, continuation);
        njbVar.X = obj;
        return njbVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        if (tpa.f((wm9) this.X, g43.b)) {
            gfb.c.P1().d();
        }
        return e5f.a;
    }
}
