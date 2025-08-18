package defpackage;

import android.graphics.Point;
import one.me.calls.ui.ui.call.CallScreen;

/* loaded from: classes.dex */
public final class lm1 implements ye1 {
    public final /* synthetic */ mm1 a;

    public lm1(mm1 mm1Var) {
        this.a = mm1Var;
    }

    @Override // defpackage.xo1
    public final void H(gg1 gg1Var) {
        Object value;
        km1 km1Var = this.a.Y0;
        if (km1Var != null) {
            yxc yxcVar = CallScreen.R0;
            q0e q0eVar = ((ui1) km1Var).a.D0().c.n;
            do {
                value = q0eVar.getValue();
            } while (!q0eVar.c(value, to1.a((to1) value, null, null, gg1Var, null, false, null, 0L, 251)));
        }
    }

    @Override // defpackage.xo1
    public final void N() {
        km1 km1Var = this.a.Y0;
        if (km1Var != null) {
            yxc yxcVar = CallScreen.R0;
            ((ui1) km1Var).a.D0().Z.e();
        }
    }

    @Override // defpackage.xo1
    public final void S(gg1 gg1Var) {
        km1 km1Var = this.a.Y0;
        if (km1Var != null) {
            yxc yxcVar = CallScreen.R0;
            ((ui1) km1Var).a.D0().v(gg1Var);
        }
    }

    @Override // defpackage.xo1
    public final void v(gg1 gg1Var, Point point) {
        km1 km1Var = this.a.Y0;
        if (km1Var != null) {
            yxc yxcVar = CallScreen.R0;
            ((ui1) km1Var).a.D0().x(gg1Var, point);
        }
    }

    @Override // defpackage.xo1
    public final void y(gg1 gg1Var) {
        km1 km1Var = this.a.Y0;
        if (km1Var != null) {
            yxc yxcVar = CallScreen.R0;
            ((ui1) km1Var).a.D0().Z.c(gg1Var);
        }
    }
}
