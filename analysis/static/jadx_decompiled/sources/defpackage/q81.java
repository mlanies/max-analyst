package defpackage;

import java.util.Collections;
import kotlin.coroutines.Continuation;
import one.me.calllist.ui.CallHistoryScreen;

/* loaded from: classes.dex */
public final class q81 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ CallHistoryScreen Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q81(Continuation continuation, CallHistoryScreen callHistoryScreen) {
        super(2, continuation);
        this.Y = callHistoryScreen;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        q81 q81Var = (q81) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        q81Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        q81 q81Var = new q81(continuation, this.Y);
        q81Var.X = obj;
        return q81Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        q0e q0eVar;
        Object value;
        od2.a0(obj);
        bc7[] bc7VarArr = CallHistoryScreen.C0;
        CallHistoryScreen callHistoryScreen = this.Y;
        boolean z = ((s81) callHistoryScreen.n0().Z.getValue()).a;
        q7c q7cVar = callHistoryScreen.Y;
        if (z) {
            ((cla) q7cVar.T0(callHistoryScreen, CallHistoryScreen.C0[1])).c(String.valueOf(((s81) callHistoryScreen.n0().Z.getValue()).b.size()), Collections.singletonList(new zka(0, c0c.call_history_item_call_toolbar_action_remove, ytb.ic_delete_22)), new o81(callHistoryScreen, 0), new l(18, callHistoryScreen));
        } else {
            u81 u81VarN0 = callHistoryScreen.n0();
            do {
                q0eVar = u81VarN0.Z;
                value = q0eVar.getValue();
            } while (!q0eVar.c(value, new s81()));
            ((cla) q7cVar.T0(callHistoryScreen, CallHistoryScreen.C0[1])).a();
        }
        cla claVar = (cla) q7cVar.T0(callHistoryScreen, CallHistoryScreen.C0[1]);
        ((ela) claVar.z0.getValue()).setSelectionTitle(String.valueOf(((s81) callHistoryScreen.n0().Z.getValue()).b.size()));
        return e5f.a;
    }
}
