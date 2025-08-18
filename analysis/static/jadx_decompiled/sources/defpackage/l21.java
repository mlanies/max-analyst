package defpackage;

import android.view.View;
import kotlin.coroutines.Continuation;
import one.me.calls.ui.ui.call.panels.CallBottomPanelWidget;

/* loaded from: classes.dex */
public final class l21 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ CallBottomPanelWidget Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l21(Continuation continuation, CallBottomPanelWidget callBottomPanelWidget) {
        super(2, continuation);
        this.Y = callBottomPanelWidget;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        l21 l21Var = (l21) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        l21Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        l21 l21Var = new l21(continuation, this.Y);
        l21Var.X = obj;
        return l21Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        zq0 zq0Var = (zq0) this.X;
        bc7[] bc7VarArr = CallBottomPanelWidget.s0;
        CallBottomPanelWidget callBottomPanelWidget = this.Y;
        r11 r11VarM0 = callBottomPanelWidget.m0();
        r11 r11VarM02 = callBottomPanelWidget.m0();
        if (!(r11VarM02 instanceof View)) {
            r11VarM02 = null;
        }
        if (r11VarM02 != null && r11VarM02.getVisibility() == 0) {
            r11VarM0.setVideoEnabled(zq0Var.b);
            m38 m38Var = zq0Var.a;
            r11VarM0.setMicrophoneEnabled(m38Var);
            r11VarM0.setRaiseHand(zq0Var.c);
            r11VarM0.setOpenChat(zq0Var.d);
            callBottomPanelWidget.m0().setAudioInfo(zq0Var.e);
            r11 r11VarM03 = callBottomPanelWidget.m0();
            boolean z = m38Var == m38.b;
            if (((el1) callBottomPanelWidget.c.getValue()).u()) {
                callBottomPanelWidget.X.o1(callBottomPanelWidget, CallBottomPanelWidget.s0[1], z ? j47.T(callBottomPanelWidget.getViewLifecycleScope(), null, null, new i21(callBottomPanelWidget, r11VarM03, null), 3) : null);
            }
        }
        return e5f.a;
    }
}
