package defpackage;

import android.widget.PopupWindow;

/* loaded from: classes.dex */
public final /* synthetic */ class g11 implements PopupWindow.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ j11 b;

    public /* synthetic */ g11(j11 j11Var, int i) {
        this.a = i;
        this.b = j11Var;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        switch (this.a) {
            case 0:
                this.b.Q0 = null;
                break;
            case 1:
                j11 j11Var = this.b;
                a51 a51Var = j11Var.P0;
                if (a51Var != null) {
                    boolean z = a51Var instanceof w41;
                    knc kncVar = j11Var.I0;
                    if (!z) {
                        j11.A(kncVar, a51Var.a(), a51Var.getContentDescription());
                        break;
                    } else {
                        w41 w41Var = (w41) a51Var;
                        j11.x(kncVar, w41Var.c, w41Var.f);
                        break;
                    }
                }
                break;
            default:
                j11.x(this.b.L0, woc.s0, new eqe(f0c.call_more_accessibility));
                break;
        }
    }
}
