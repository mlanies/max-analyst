package defpackage;

import android.content.Context;
import android.view.View;

/* loaded from: classes2.dex */
public final class cc extends gmb {
    public final /* synthetic */ int F0;
    public final Object G0;

    public cc(Context context, int i) {
        this.F0 = i;
        switch (i) {
            case 1:
                ufd ufdVar = new ufd(context, null);
                super(ufdVar);
                vfd vfdVar = new vfd(128, 0, new eqe(yea.J), null, null, Integer.valueOf(woc.f2), cfd.a, null, null, 0, null, 1816);
                this.G0 = vfdVar;
                ufdVar.setModelItem(vfdVar);
                break;
            case 2:
                ufd ufdVar2 = new ufd(context, null);
                super(ufdVar2);
                this.G0 = ufdVar2;
                ufdVar2.setMinHeight(tu0.G(56 * fk4.d().getDisplayMetrics().density));
                break;
            default:
                ufd ufdVar3 = new ufd(context, null);
                super(ufdVar3);
                vfd vfdVar2 = new vfd(64, 0, new eqe(yea.C), null, null, Integer.valueOf(woc.f2), cfd.a, null, null, 0, null, 1816);
                this.G0 = vfdVar2;
                ufdVar3.setModelItem(vfdVar2);
                break;
        }
    }

    @Override // defpackage.hqd
    public final void A(ol7 ol7Var) {
        switch (this.F0) {
            case 0:
                ((ufd) this.a).setModelItem(vfd.k((vfd) this.G0, null, new dfd(new iqe(String.valueOf(((nib) ol7Var).a)), null), 1983));
                return;
            case 1:
                ((ufd) this.a).setModelItem(vfd.k((vfd) this.G0, null, new dfd(new iqe(String.valueOf(((zib) ol7Var).a)), null), 1983));
                return;
            default:
                au1.r(ol7Var);
                throw null;
        }
    }

    @Override // defpackage.gmb
    public final void G(View.OnClickListener onClickListener) {
        switch (this.F0) {
            case 0:
                tu0.K(this.a, 300L, onClickListener);
                break;
            case 1:
                tu0.K(this.a, 300L, onClickListener);
                break;
            default:
                tu0.K((ufd) this.G0, 300L, onClickListener);
                break;
        }
    }

    @Override // defpackage.gmb
    public void H(View.OnLongClickListener onLongClickListener) {
        switch (this.F0) {
            case 2:
                ((ufd) this.G0).setOnLongClickListener(onLongClickListener);
                break;
        }
    }
}
