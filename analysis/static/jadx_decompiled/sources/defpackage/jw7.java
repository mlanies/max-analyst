package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class jw7 extends hqd {
    public final /* synthetic */ int F0;
    public final int G0;
    public z2e H0;

    public jw7(Context context, w2e w2eVar, int i, int i2) {
        this.F0 = i2;
        switch (i2) {
            case 1:
                i2e i2eVar = new i2e(context);
                super(i2eVar);
                this.G0 = i;
                int iG = i == 0 ? -2 : tu0.G(i * fk4.d().getDisplayMetrics().density);
                i2eVar.setLayoutParams(new ViewGroup.LayoutParams(iG, iG));
                tu0.K(i2eVar, 300L, new v7d(this, 8, w2eVar));
                i2eVar.setOnLongClickListener(new ad2(this, 6, w2eVar));
                break;
            case 2:
                a4g a4gVar = new a4g(context);
                super(a4gVar);
                int iMin = Math.min(350, tu0.G(i * fk4.d().getDisplayMetrics().density));
                this.G0 = iMin;
                a4gVar.setLayoutParams(new ViewGroup.LayoutParams(iMin, iMin));
                tu0.K(a4gVar, 300L, new v7d(this, 19, w2eVar));
                a4gVar.setOnLongClickListener(new ad2(this, 8, w2eVar));
                break;
            default:
                iw7 iw7Var = new iw7(context);
                super(iw7Var);
                int iMin2 = Math.min(350, tu0.G(i * fk4.d().getDisplayMetrics().density));
                this.G0 = iMin2;
                iw7Var.setLayoutParams(new ViewGroup.LayoutParams(iMin2, iMin2));
                tu0.K(iw7Var, 300L, new vu5(this, 10, w2eVar));
                iw7Var.setOnLongClickListener(new ad2(this, 2, w2eVar));
                break;
        }
    }

    @Override // defpackage.hqd
    public final void A(ol7 ol7Var) throws InterruptedException, IOException {
        switch (this.F0) {
            case 0:
                if (ol7Var instanceof z2e) {
                    z2e z2eVar = (z2e) ol7Var;
                    this.H0 = z2eVar;
                    View view = this.a;
                    ((iw7) view).a(z2eVar, this.G0);
                    ((iw7) view).setAlpha(z2eVar.w0 ? 0.3f : 1.0f);
                    break;
                }
                break;
            case 1:
                if (ol7Var instanceof z2e) {
                    z2e z2eVar2 = (z2e) ol7Var;
                    this.H0 = z2eVar2;
                    int i = this.G0;
                    View view2 = this.a;
                    if (i == 0) {
                        ((i2e) view2).setSizeConfigurator(new f4e(view2));
                    }
                    ((i2e) view2).a(z2eVar2);
                    ((i2e) view2).setAlpha(z2eVar2.w0 ? 0.3f : 1.0f);
                    break;
                }
                break;
            default:
                if (ol7Var instanceof z2e) {
                    z2e z2eVar3 = (z2e) ol7Var;
                    this.H0 = z2eVar3;
                    View view3 = this.a;
                    ((a4g) view3).a(z2eVar3, this.G0);
                    ((a4g) view3).setAlpha(z2eVar3.w0 ? 0.3f : 1.0f);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.hqd
    public final void B(ol7 ol7Var, Object obj) throws InterruptedException, IOException {
        switch (this.F0) {
            case 0:
                if (!(obj instanceof y2e)) {
                    A(ol7Var);
                    break;
                } else {
                    ((iw7) this.a).setAlpha(((y2e) obj).a ? 0.3f : 1.0f);
                    break;
                }
            case 1:
                if (!(obj instanceof y2e)) {
                    A(ol7Var);
                    break;
                } else {
                    ((i2e) this.a).setAlpha(((y2e) obj).a ? 0.3f : 1.0f);
                    break;
                }
            default:
                if (!(obj instanceof y2e)) {
                    A(ol7Var);
                    break;
                } else {
                    ((a4g) this.a).setAlpha(((y2e) obj).a ? 0.3f : 1.0f);
                    break;
                }
        }
    }
}
