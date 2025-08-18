package defpackage;

import android.view.ViewGroup;
import one.me.calls.ui.ui.pip.PipScreen;

/* loaded from: classes.dex */
public final /* synthetic */ class z1b implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ PipScreen b;

    public /* synthetic */ z1b(PipScreen pipScreen, int i) {
        this.a = i;
        this.b = pipScreen;
    }

    @Override // defpackage.k56
    public final Object invoke() {
        PipScreen pipScreen = this.b;
        switch (this.a) {
            case 0:
                bc7[] bc7VarArr = PipScreen.o;
                xg1 xg1Var = new xg1(pipScreen.getContext());
                xg1Var.setPipTheme(qp4.u0.p(xg1Var).c);
                xg1Var.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                xg1Var.setVideoLayoutUpdatesControllerProvider(new z1b(pipScreen, 2));
                xg1Var.setBackgroundCorners(0.0f);
                return xg1Var;
            case 1:
                bc7[] bc7VarArr2 = PipScreen.o;
                n31 n31Var = n31.a;
                return new t1b((oqa) n31Var.getAccessor().c(oqa.class), n31Var.d(), n31Var.c(), new rxd(25, pipScreen), yi1.b());
            default:
                bc7[] bc7VarArr3 = PipScreen.o;
                return (ugf) ((t1b) pipScreen.b.getValue()).Y.getValue();
        }
    }
}
