package defpackage;

import android.graphics.drawable.LayerDrawable;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.calls.ui.ui.waitingroom.event.CallWaitingRoomEventsWidget;

/* loaded from: classes.dex */
public final class yp1 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ CallWaitingRoomEventsWidget Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yp1(Continuation continuation, CallWaitingRoomEventsWidget callWaitingRoomEventsWidget) {
        super(2, continuation);
        this.Y = callWaitingRoomEventsWidget;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        yp1 yp1Var = (yp1) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        yp1Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        yp1 yp1Var = new yp1(continuation, this.Y);
        yp1Var.X = obj;
        return yp1Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        up1 up1Var = (up1) this.X;
        bc7[] bc7VarArr = CallWaitingRoomEventsWidget.v0;
        CallWaitingRoomEventsWidget callWaitingRoomEventsWidget = this.Y;
        callWaitingRoomEventsWidget.getClass();
        boolean z = up1Var instanceof tp1;
        q7c q7cVar = callWaitingRoomEventsWidget.s0;
        if (z) {
            if (callWaitingRoomEventsWidget.m0().findViewById(y7a.R1) != null) {
                ft.g(callWaitingRoomEventsWidget.n0(), false, 0L, null, 6);
            }
            FrameLayout frameLayoutM0 = callWaitingRoomEventsWidget.m0();
            int i = y7a.X1;
            if (frameLayoutM0.findViewById(i) != null) {
                ft.g((lk3) q7cVar.T0(callWaitingRoomEventsWidget, CallWaitingRoomEventsWidget.v0[0]), true, 0L, null, 6);
            } else {
                FrameLayout frameLayoutM02 = callWaitingRoomEventsWidget.m0();
                lk3 lk3Var = new lk3(callWaitingRoomEventsWidget.getContext(), null);
                lk3Var.setId(i);
                lk3Var.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                lk3Var.setCustomTheme(qp4.u0.p(lk3Var).c);
                lk3Var.setCallButtonMode(jk3.b);
                lk3Var.setMessage(lk3Var.getContext().getString(b8a.S1));
                lk3Var.setVisibility(0);
                frameLayoutM02.addView(lk3Var);
            }
        } else if (up1Var instanceof rp1) {
            if (callWaitingRoomEventsWidget.m0().findViewById(y7a.X1) != null) {
                ft.g((lk3) q7cVar.T0(callWaitingRoomEventsWidget, CallWaitingRoomEventsWidget.v0[0]), false, 0L, null, 6);
            }
            FrameLayout frameLayoutM03 = callWaitingRoomEventsWidget.m0();
            int i2 = y7a.R1;
            if (frameLayoutM03.findViewById(i2) != null) {
                ft.g(callWaitingRoomEventsWidget.n0(), true, 0L, null, 6);
            } else {
                FrameLayout frameLayoutM04 = callWaitingRoomEventsWidget.m0();
                sf9 sf9Var = new sf9(callWaitingRoomEventsWidget.getContext(), null);
                sf9Var.setId(i2);
                sf9Var.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                sf9Var.setVisibility(0);
                frameLayoutM04.addView(sf9Var);
                callWaitingRoomEventsWidget.n0().setVisibility(0);
            }
        }
        if (!(up1Var instanceof qp1)) {
            if (up1Var instanceof sp1) {
                callWaitingRoomEventsWidget.o0(((sp1) up1Var).a);
            } else if (z) {
                lk3 lk3Var2 = (lk3) q7cVar.T0(callWaitingRoomEventsWidget, CallWaitingRoomEventsWidget.v0[0]);
                tp1 tp1Var = (tp1) up1Var;
                uc0 uc0Var = tp1Var.d;
                lk3Var2.O(uc0Var.a, uc0Var.b, tp1Var.e);
                lk3Var2.setName(tp1Var.b.b(lk3Var2.getContext()));
                lk3Var2.setMessage(tp1Var.c.b(lk3Var2.getContext()));
                lk3Var2.N();
                je7 je7Var = callWaitingRoomEventsWidget.Y;
                lk3Var2.Q((LayerDrawable) ((lrf) je7Var.getValue()).b.getValue(), (LayerDrawable) ((lrf) je7Var.getValue()).c.getValue(), new zp1(callWaitingRoomEventsWidget, 0, up1Var));
                lk3Var2.setOnClickListener(null);
            } else {
                if (!(up1Var instanceof rp1)) {
                    throw new NoWhenBranchMatchedException();
                }
                sf9 sf9VarN0 = callWaitingRoomEventsWidget.n0();
                rp1 rp1Var = (rp1) up1Var;
                sf9VarN0.setAvatars(rp1Var.c);
                sf9VarN0.setName(rp1Var.a);
                sf9VarN0.setMessage(rp1Var.b);
                tu0.K(sf9VarN0, 300L, new hq(callWaitingRoomEventsWidget, 1, up1Var));
            }
        }
        return e5f.a;
    }
}
