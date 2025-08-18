package defpackage;

import android.view.ViewStub;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.coroutines.Continuation;
import one.me.calls.ui.bottomsheet.opponents.CallOpponentsListWidget;

/* loaded from: classes.dex */
public final class tf1 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ CallOpponentsListWidget Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tf1(Continuation continuation, CallOpponentsListWidget callOpponentsListWidget) {
        super(2, continuation);
        this.Y = callOpponentsListWidget;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        tf1 tf1Var = (tf1) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        tf1Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        tf1 tf1Var = new tf1(continuation, this.Y);
        tf1Var.X = obj;
        return tf1Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        wf1 wf1Var = (wf1) this.X;
        bc7[] bc7VarArr = CallOpponentsListWidget.H0;
        CallOpponentsListWidget callOpponentsListWidget = this.Y;
        callOpponentsListWidget.getClass();
        bc7[] bc7VarArr2 = CallOpponentsListWidget.H0;
        bc7 bc7Var = bc7VarArr2[4];
        ((TextView) callOpponentsListWidget.w0.getValue()).setText(wf1Var.e);
        callOpponentsListWidget.q0().setTitle(wf1Var.e);
        bc7 bc7Var2 = bc7VarArr2[2];
        ((o7a) callOpponentsListWidget.u0.getValue()).b(wf1Var.b, wf1Var.c, wf1Var.d);
        if (wf1Var.f) {
            callOpponentsListWidget.q0().setRightActions((pka) callOpponentsListWidget.s0.getValue());
        } else {
            callOpponentsListWidget.q0().setRightActions(nka.a);
        }
        kl7 kl7VarL = j1e.l();
        kl7VarL.addAll(wf1Var.a);
        kl7 kl7VarD = j1e.d(kl7VarL);
        ((cf1) callOpponentsListWidget.D0.getValue()).E(kl7VarD);
        boolean zIsEmpty = kl7VarD.isEmpty();
        boolean z = !zIsEmpty;
        if (!z || br7.G(callOpponentsListWidget.o0())) {
            ViewStub viewStubO0 = callOpponentsListWidget.o0();
            bc7 bc7Var3 = bc7VarArr2[10];
            qm0 qm0Var = callOpponentsListWidget.C0;
            br7.F(viewStubO0, (aba) qm0Var.getValue(), null);
            bc7 bc7Var4 = bc7VarArr2[10];
            ((aba) qm0Var.getValue()).setVisibility(zIsEmpty ? 0 : 8);
            bc7 bc7Var5 = bc7VarArr2[3];
            ((RecyclerView) callOpponentsListWidget.v0.getValue()).setVisibility(z ? 0 : 8);
        }
        return e5f.a;
    }
}
