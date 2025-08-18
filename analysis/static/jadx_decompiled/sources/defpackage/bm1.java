package defpackage;

import android.view.View;
import one.me.calls.ui.ui.call.CallScreen;

/* loaded from: classes.dex */
public final /* synthetic */ class bm1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ dm1 b;

    public /* synthetic */ bm1(dm1 dm1Var, int i) {
        this.a = i;
        this.b = dm1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        dm1 dm1Var = this.b;
        switch (this.a) {
            case 0:
                cm1 cm1Var = dm1Var.M0;
                if (cm1Var != null) {
                    yxc yxcVar = CallScreen.R0;
                    ((CallScreen) ((w4d) cm1Var).b).D0().Z.e();
                    break;
                }
                break;
            default:
                cm1 cm1Var2 = dm1Var.M0;
                if (cm1Var2 != null) {
                    gg1 gg1Var = dm1Var.R0;
                    yxc yxcVar2 = CallScreen.R0;
                    ((CallScreen) ((w4d) cm1Var2).b).D0().Z.c(gg1Var);
                    break;
                }
                break;
        }
    }
}
