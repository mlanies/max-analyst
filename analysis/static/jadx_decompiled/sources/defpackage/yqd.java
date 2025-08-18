package defpackage;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;

/* loaded from: classes2.dex */
public final /* synthetic */ class yqd implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    public /* synthetic */ yqd(Context context, int i) {
        this.a = i;
        this.b = context;
    }

    @Override // defpackage.k56
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return new up0(this.b);
            case 1:
                return new pm8(this.b);
            case 2:
                return new up0(this.b);
            case 3:
                mdf mdfVar = new mdf(this.b);
                mdfVar.setBackgroundEnabled(true);
                mdfVar.setDrawableEnabled(false);
                return mdfVar;
            case 4:
                return new up0(this.b);
            case 5:
                mdf mdfVar2 = new mdf(this.b);
                mdfVar2.setBackgroundEnabled(true);
                mdfVar2.setDrawableEnabled(false);
                return mdfVar2;
            case 6:
                TextView textView = new TextView(this.b);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
                layoutParams.setMarginStart(tu0.G(4 * fk4.d().getDisplayMetrics().density));
                textView.setLayoutParams(layoutParams);
                i4f.C.b(textView, du4.b);
                v3c.y(new v9(3, null, 25), textView);
                textView.setGravity(17);
                return textView;
            case 7:
                return new cu6(this.b);
            default:
                return Integer.valueOf(qp4.u0.b(this.b).i().a().k().d.b);
        }
    }
}
