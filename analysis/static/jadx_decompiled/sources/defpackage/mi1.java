package defpackage;

import kotlin.coroutines.Continuation;
import one.me.calls.ui.ui.call.CallScreen;
import one.me.calls.ui.ui.waitingroom.event.CallWaitingRoomEventsWidget;

/* loaded from: classes.dex */
public final class mi1 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ CallScreen Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mi1(Continuation continuation, CallScreen callScreen) {
        super(2, continuation);
        this.Y = callScreen;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        mi1 mi1Var = (mi1) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        mi1Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        mi1 mi1Var = new mi1(continuation, this.Y);
        mi1Var.X = obj;
        return mi1Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        CallWaitingRoomEventsWidget callWaitingRoomEventsWidget;
        od2.a0(obj);
        boolean zBooleanValue = ((Boolean) this.X).booleanValue();
        yxc yxcVar = CallScreen.R0;
        CallScreen callScreen = this.Y;
        if (!zBooleanValue) {
            uu3 uu3VarB = callScreen.x0().b();
            callWaitingRoomEventsWidget = uu3VarB instanceof CallWaitingRoomEventsWidget ? (CallWaitingRoomEventsWidget) uu3VarB : null;
            if (callWaitingRoomEventsWidget != null) {
                CallWaitingRoomEventsWidget.p0(callWaitingRoomEventsWidget);
            }
        } else if (callScreen.x0().b() != null) {
            uu3 uu3VarB2 = callScreen.x0().b();
            callWaitingRoomEventsWidget = uu3VarB2 instanceof CallWaitingRoomEventsWidget ? (CallWaitingRoomEventsWidget) uu3VarB2 : null;
            if (callWaitingRoomEventsWidget != null) {
                callScreen.r0(callWaitingRoomEventsWidget);
            }
        } else {
            j03 j03VarX0 = callScreen.x0();
            if (!tpa.f(j03VarX0.c(), "call_waiting_room_widget_tag")) {
                CallWaitingRoomEventsWidget callWaitingRoomEventsWidget2 = new CallWaitingRoomEventsWidget(callScreen.s0, null);
                callScreen.r0(callWaitingRoomEventsWidget2);
                coc cocVar = new coc(callWaitingRoomEventsWidget2, null, null, null, false, -1);
                cocVar.d("call_waiting_room_widget_tag");
                j03VarX0.a.R(cocVar);
            }
        }
        return e5f.a;
    }
}
