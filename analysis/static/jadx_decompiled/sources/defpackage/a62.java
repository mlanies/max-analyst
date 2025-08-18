package defpackage;

import android.view.View;

/* loaded from: classes2.dex */
public final class a62 extends of2 {
    public final /* synthetic */ int F0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a62(View view, int i) {
        super(view);
        this.F0 = i;
    }

    @Override // defpackage.hqd
    public final void A(ol7 ol7Var) throws NumberFormatException {
        switch (this.F0) {
            case 0:
                qm8 qm8Var = (qm8) ol7Var;
                td2 td2Var = (td2) this.a;
                td2Var.setId((int) qm8Var.a);
                td2Var.setupAudio(qm8Var);
                break;
            default:
                wm8 wm8Var = (wm8) ol7Var;
                sg2 sg2Var = (sg2) this.a;
                sg2Var.setId((int) wm8Var.a);
                sg2Var.setItem(wm8Var);
                break;
        }
    }

    @Override // defpackage.hqd
    public void D() {
        switch (this.F0) {
            case 0:
                td2 td2Var = (td2) this.a;
                td2Var.removeOnAttachStateChangeListener(td2Var.K0);
                x77 x77Var = td2Var.L0;
                if (x77Var != null) {
                    x77Var.cancel(null);
                }
                td2Var.L0 = null;
                td2Var.M0 = null;
                break;
        }
    }

    @Override // defpackage.of2
    public final void E(xm8 xm8Var, m56 m56Var, a66 a66Var) throws NumberFormatException {
        switch (this.F0) {
            case 0:
                qm8 qm8Var = (qm8) xm8Var;
                View view = this.a;
                td2 td2Var = (td2) view;
                td2 td2Var2 = (td2) view;
                td2Var2.setId((int) qm8Var.a);
                td2Var2.setupAudio(qm8Var);
                tu0.K(td2Var, 300L, new tb(m56Var, 10, qm8Var));
                td2Var.setOnLongClickListener(new z52(a66Var, qm8Var, this, 0));
                break;
            default:
                wm8 wm8Var = (wm8) xm8Var;
                View view2 = this.a;
                sg2 sg2Var = (sg2) view2;
                sg2 sg2Var2 = (sg2) view2;
                sg2Var2.setId((int) wm8Var.a);
                sg2Var2.setItem(wm8Var);
                tu0.K(sg2Var, 300L, new tb(m56Var, 13, wm8Var));
                sg2Var.setOnLongClickListener(new z52(a66Var, wm8Var, this, 2));
                break;
        }
    }
}
