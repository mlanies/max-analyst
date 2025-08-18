package defpackage;

import kotlin.coroutines.Continuation;
import one.me.android.externalcallback.ExternalCallbackWidget;

/* loaded from: classes.dex */
public final class u95 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ExternalCallbackWidget Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u95(Continuation continuation, ExternalCallbackWidget externalCallbackWidget) {
        super(2, continuation);
        this.Y = externalCallbackWidget;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        u95 u95Var = (u95) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        u95Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        u95 u95Var = new u95(continuation, this.Y);
        u95Var.X = obj;
        return u95Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        wm9 wm9Var = (wm9) this.X;
        boolean z = wm9Var instanceof c64;
        ExternalCallbackWidget externalCallbackWidget = this.Y;
        if (z) {
            vw7.c.R1((c64) wm9Var);
        } else if (wm9Var instanceof p95) {
            wha whaVar = new wha(externalCallbackWidget);
            whaVar.g(((p95) wm9Var).b);
            whaVar.i();
        } else {
            boolean z2 = wm9Var instanceof o95;
        }
        externalCallbackWidget.s0(false);
        return e5f.a;
    }
}
