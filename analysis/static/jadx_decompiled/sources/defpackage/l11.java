package defpackage;

import android.view.View;
import one.me.calls.ui.ui.call.panels.CallBottomPanelWidget;

/* loaded from: classes.dex */
public final /* synthetic */ class l11 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ p11 b;

    public /* synthetic */ l11(p11 p11Var, int i) {
        this.a = i;
        this.b = p11Var;
    }

    @Override // defpackage.k56
    public final Object invoke() {
        Object value;
        e5f e5fVar = e5f.a;
        p11 p11Var = this.b;
        switch (this.a) {
            case 0:
                p11Var.V0 = null;
                o11 o11Var = p11Var.P0;
                if (o11Var != null) {
                    bc7[] bc7VarArr = CallBottomPanelWidget.s0;
                    q0e q0eVar = ((CallBottomPanelWidget) ((sy4) o11Var).b).n0().r().n;
                    do {
                        value = q0eVar.getValue();
                    } while (!q0eVar.c(value, to1.a((to1) value, null, null, null, null, true, null, 0L, 223)));
                }
                return e5fVar;
            case 1:
                return qp4.u0.p(p11Var).c;
            case 2:
                View viewT = br7.t(p11Var, rvb.call_bottom_control_container);
                return viewT == null ? p11Var : viewT;
            default:
                p11Var.U0 = null;
                return e5fVar;
        }
    }
}
