package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.calls.ui.ui.call.CallScreen;
import one.me.calls.ui.ui.call.panels.VpnPanelWidget;

/* loaded from: classes.dex */
public final class vi1 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ CallScreen Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vi1(Continuation continuation, CallScreen callScreen) {
        super(2, continuation);
        this.Y = callScreen;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        vi1 vi1Var = (vi1) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        vi1Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        vi1 vi1Var = new vi1(continuation, this.Y);
        vi1Var.X = obj;
        return vi1Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        boolean zBooleanValue = ((Boolean) this.X).booleanValue();
        CallScreen callScreen = this.Y;
        if (zBooleanValue) {
            if (CallScreen.n0(callScreen).b() == null) {
                j03 j03VarN0 = CallScreen.n0(callScreen);
                if (!tpa.f(j03VarN0.c(), "call_vpn_panel_widget_tag")) {
                    VpnPanelWidget vpnPanelWidget = new VpnPanelWidget(callScreen.s0, null);
                    vpnPanelWidget.a = new qqd(6, callScreen);
                    coc cocVar = new coc(vpnPanelWidget, null, null, null, false, -1);
                    cocVar.d("call_vpn_panel_widget_tag");
                    j03VarN0.a.R(cocVar);
                }
            }
        } else {
            if (zBooleanValue) {
                throw new NoWhenBranchMatchedException();
            }
            uu3 uu3VarB = CallScreen.n0(callScreen).b();
            VpnPanelWidget vpnPanelWidget2 = uu3VarB instanceof VpnPanelWidget ? (VpnPanelWidget) uu3VarB : null;
            if (vpnPanelWidget2 != null) {
                vpnPanelWidget2.getRouter().B(vpnPanelWidget2);
                qqd qqdVar = vpnPanelWidget2.a;
                if (qqdVar != null) {
                    CallScreen.n0((CallScreen) qqdVar.b).a();
                }
                vpnPanelWidget2.a = null;
            }
        }
        return e5f.a;
    }
}
