package defpackage;

import android.view.View;

/* loaded from: classes.dex */
public final /* synthetic */ class h11 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ j11 b;

    public /* synthetic */ h11(j11 j11Var, int i) {
        this.a = i;
        this.b = j11Var;
    }

    @Override // defpackage.k56
    public final Object invoke() {
        switch (this.a) {
            case 0:
                int i = rvb.call_bottom_control_container;
                j11 j11Var = this.b;
                View viewT = br7.t(j11Var, i);
                return viewT == null ? j11Var : viewT;
            default:
                return qp4.u0.p(this.b).c;
        }
    }
}
