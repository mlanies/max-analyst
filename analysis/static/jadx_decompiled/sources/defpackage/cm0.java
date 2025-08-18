package defpackage;

import android.content.Context;
import android.net.Uri;
import com.facebook.drawee.view.SimpleDraweeView;

/* loaded from: classes.dex */
public final class cm0 extends hqd {
    public final /* synthetic */ int F0 = 0;
    public final m56 G0;

    public cm0(Context context, iv5 iv5Var) {
        super(new bm0(context));
        this.G0 = iv5Var;
    }

    @Override // defpackage.hqd
    public final void A(ol7 ol7Var) throws NumberFormatException {
        wv6 wv6VarA;
        wv6 wv6VarA2;
        switch (this.F0) {
            case 0:
                ov5 ov5Var = (ov5) ol7Var;
                bm0 bm0Var = (bm0) this.a;
                bm0Var.c.setText(ov5Var.b);
                bm0Var.o.setText(ov5Var.o);
                bm0Var.setBackgroundColor(ov5Var.c);
                String str = ov5Var.X;
                if (str != null) {
                    xv6 xv6VarD = xv6.d(Uri.parse(str));
                    xv6VarD.d = bm0Var.b;
                    wv6VarA = xv6VarD.a();
                } else {
                    wv6VarA = null;
                }
                SimpleDraweeView simpleDraweeView = bm0Var.s0;
                if (wv6VarA != null) {
                    iv6 iv6VarO = s36.o();
                    iv6VarO.getClass();
                    hv6 hv6Var = new hv6(iv6VarO, wv6VarA, bm0Var);
                    wjc wjcVar = bm0Var.a;
                    wjcVar.a(hv6Var);
                    if (simpleDraweeView.getController() == null) {
                        e2b e2bVar = s36.a.get();
                        e2bVar.g = wjcVar;
                        e2bVar.k = true;
                        simpleDraweeView.setController(e2bVar.a());
                    }
                    simpleDraweeView.setVisibility(0);
                } else {
                    simpleDraweeView.setController(null);
                    simpleDraweeView.setVisibility(8);
                }
                tu0.K(bm0Var, 300L, new tb(this, 1, ov5Var));
                break;
            default:
                ov5 ov5Var2 = (ov5) ol7Var;
                pv5 pv5Var = (pv5) this.a;
                pv5Var.c.setText(ov5Var2.b);
                pv5Var.o.setText(ov5Var2.o);
                pv5Var.setBackgroundColor(ov5Var2.c);
                String str2 = ov5Var2.X;
                if (str2 != null) {
                    xv6 xv6VarD2 = xv6.d(Uri.parse(str2));
                    xv6VarD2.d = pv5Var.b;
                    wv6VarA2 = xv6VarD2.a();
                } else {
                    wv6VarA2 = null;
                }
                SimpleDraweeView simpleDraweeView2 = pv5Var.s0;
                if (wv6VarA2 != null) {
                    iv6 iv6VarO2 = s36.o();
                    iv6VarO2.getClass();
                    hv6 hv6Var2 = new hv6(iv6VarO2, wv6VarA2, pv5Var);
                    wjc wjcVar2 = pv5Var.a;
                    wjcVar2.a(hv6Var2);
                    if (simpleDraweeView2.getController() == null) {
                        e2b e2bVar2 = s36.a.get();
                        e2bVar2.g = wjcVar2;
                        e2bVar2.k = true;
                        simpleDraweeView2.setController(e2bVar2.a());
                    }
                    simpleDraweeView2.setVisibility(0);
                } else {
                    simpleDraweeView2.setController(null);
                    simpleDraweeView2.setVisibility(8);
                }
                tu0.K(pv5Var, 300L, new vu5(this, 1, ov5Var2));
                break;
        }
    }

    public cm0(Context context, m56 m56Var) {
        super(new pv5(context));
        this.G0 = m56Var;
    }
}
