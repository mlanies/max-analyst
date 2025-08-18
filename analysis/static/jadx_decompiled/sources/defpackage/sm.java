package defpackage;

import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class sm implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ dn b;

    public /* synthetic */ sm(dn dnVar, int i) {
        this.a = i;
        this.b = dnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        switch (this.a) {
            case 0:
                dn dnVar = this.b;
                if ((dnVar.k1 & 1) != 0) {
                    dnVar.s(0);
                }
                if ((dnVar.k1 & 4096) != 0) {
                    dnVar.s(108);
                }
                dnVar.j1 = false;
                dnVar.k1 = 0;
                break;
            default:
                dn dnVar2 = this.b;
                dnVar2.H0.showAtLocation(dnVar2.G0, 55, 0, 0);
                vof vofVar = dnVar2.J0;
                if (vofVar != null) {
                    vofVar.b();
                }
                if (!(dnVar2.K0 && (viewGroup = dnVar2.L0) != null && viewGroup.isLaidOut())) {
                    dnVar2.G0.setAlpha(1.0f);
                    dnVar2.G0.setVisibility(0);
                    break;
                } else {
                    dnVar2.G0.setAlpha(0.0f);
                    vof vofVarA = zmf.a(dnVar2.G0);
                    vofVarA.a(1.0f);
                    dnVar2.J0 = vofVarA;
                    vofVarA.d(new tm(0, this));
                    break;
                }
                break;
        }
    }
}
