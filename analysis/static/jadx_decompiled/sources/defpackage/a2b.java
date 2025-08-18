package defpackage;

import kotlin.coroutines.Continuation;
import one.me.calls.ui.ui.pip.PipScreen;

/* loaded from: classes.dex */
public final class a2b extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ PipScreen Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2b(PipScreen pipScreen, Continuation continuation) {
        super(2, continuation);
        this.Y = pipScreen;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        a2b a2bVar = (a2b) n((qma) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        a2bVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        a2b a2bVar = new a2b(this.Y, continuation);
        a2bVar.X = obj;
        return a2bVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        qma qmaVar = (qma) this.X;
        bc7[] bc7VarArr = PipScreen.o;
        xg1 xg1Var = ((t1b) this.Y.b.getValue()).c;
        if (xg1Var != null) {
            xg1Var.d(qmaVar);
        }
        return e5f.a;
    }
}
