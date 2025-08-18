package defpackage;

import android.view.View;

/* loaded from: classes.dex */
public final /* synthetic */ class e33 implements View.OnFocusChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e33(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        switch (this.a) {
            case 0:
                h33 h33Var = (h33) this.b;
                h33Var.t(h33Var.u());
                break;
            case 1:
                qs4 qs4Var = (qs4) this.b;
                qs4Var.l = z;
                qs4Var.q();
                if (!z) {
                    qs4Var.t(false);
                    qs4Var.m = false;
                    break;
                }
                break;
            default:
                if (!z) {
                    ((lea) this.b).s0 = false;
                    break;
                }
                break;
        }
    }
}
