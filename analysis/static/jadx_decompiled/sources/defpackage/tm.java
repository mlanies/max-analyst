package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class tm extends yof {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ tm(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.yof, defpackage.xof
    public void b() {
        Object obj = this.b;
        switch (this.a) {
            case 0:
                ((sm) obj).b.G0.setVisibility(0);
                break;
            case 1:
                dn dnVar = (dn) obj;
                dnVar.G0.setVisibility(0);
                if (dnVar.G0.getParent() instanceof View) {
                    View view = (View) dnVar.G0.getParent();
                    WeakHashMap weakHashMap = zmf.a;
                    mmf.c(view);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.xof
    public final void c() {
        Object obj = this.b;
        switch (this.a) {
            case 0:
                sm smVar = (sm) obj;
                smVar.b.G0.setAlpha(1.0f);
                dn dnVar = smVar.b;
                dnVar.J0.d(null);
                dnVar.J0 = null;
                break;
            case 1:
                dn dnVar2 = (dn) obj;
                dnVar2.G0.setAlpha(1.0f);
                dnVar2.J0.d(null);
                dnVar2.J0 = null;
                break;
            default:
                imc imcVar = (imc) obj;
                ((dn) imcVar.c).G0.setVisibility(8);
                dn dnVar3 = (dn) imcVar.c;
                PopupWindow popupWindow = dnVar3.H0;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (dnVar3.G0.getParent() instanceof View) {
                    View view = (View) dnVar3.G0.getParent();
                    WeakHashMap weakHashMap = zmf.a;
                    mmf.c(view);
                }
                dnVar3.G0.e();
                dnVar3.J0.d(null);
                dnVar3.J0 = null;
                ViewGroup viewGroup = dnVar3.L0;
                WeakHashMap weakHashMap2 = zmf.a;
                mmf.c(viewGroup);
                break;
        }
    }
}
