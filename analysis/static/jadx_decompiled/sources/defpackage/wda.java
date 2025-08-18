package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

/* loaded from: classes2.dex */
public final /* synthetic */ class wda implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ zda c;

    public /* synthetic */ wda(zda zdaVar, Context context) {
        this.a = 4;
        this.c = zdaVar;
        this.b = context;
    }

    @Override // defpackage.k56
    public final Object invoke() {
        switch (this.a) {
            case 0:
                TextView textView = new TextView(this.b);
                textView.setId(xoc.c0);
                ti3 ti3Var = new ti3(0, -2);
                ti3Var.t = 0;
                ti3Var.i = 0;
                zda zdaVar = this.c;
                je7 je7Var = zdaVar.L0;
                ti3Var.u = je7Var.a() ? ((ImageView) je7Var.getValue()).getId() : 0;
                je7 je7Var2 = zdaVar.K0;
                ti3Var.k = je7Var2.a() ? ((TextView) je7Var2.getValue()).getId() : 0;
                int i = zdaVar.I0;
                ti3Var.setMarginStart(i);
                ((ViewGroup.MarginLayoutParams) ti3Var).topMargin = tu0.G(26 * fk4.d().getDisplayMetrics().density);
                ti3Var.setMarginEnd(i);
                textView.setLayoutParams(ti3Var);
                textView.setMaxLines(2);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                qp4.u0.j(textView).getText();
                textView.setTextColor(-1);
                i4f.z.b(textView, du4.b);
                return textView;
            case 1:
                TextView textView2 = new TextView(this.b);
                textView2.setId(xoc.b0);
                ti3 ti3Var2 = new ti3(0, -2);
                ti3Var2.t = 0;
                zda zdaVar2 = this.c;
                je7 je7Var3 = zdaVar2.J0;
                ti3Var2.j = je7Var3.a() ? ((TextView) je7Var3.getValue()).getId() : 0;
                je7 je7Var4 = zdaVar2.L0;
                ti3Var2.u = je7Var4.a() ? ((ImageView) je7Var4.getValue()).getId() : 0;
                ti3Var2.l = 0;
                int i2 = zdaVar2.I0;
                ti3Var2.setMarginStart(i2);
                ((ViewGroup.MarginLayoutParams) ti3Var2).topMargin = zdaVar2.G0;
                ti3Var2.setMarginEnd(i2);
                ((ViewGroup.MarginLayoutParams) ti3Var2).bottomMargin = tu0.G(26 * fk4.d().getDisplayMetrics().density);
                textView2.setLayoutParams(ti3Var2);
                textView2.setMaxLines(2);
                textView2.setEllipsize(TextUtils.TruncateAt.END);
                qp4.u0.j(textView2).getText();
                textView2.setTextColor(f8.G(-1, 0.7f));
                i4f.p.b(textView2, du4.b);
                return textView2;
            case 2:
                return zda.w(this.c, this.b);
            case 3:
                FrameLayout frameLayout = new FrameLayout(this.b);
                frameLayout.setId(xoc.a0);
                float f = 60;
                ti3 ti3Var3 = new ti3(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density));
                ti3Var3.i = 0;
                ti3Var3.v = 0;
                ti3Var3.l = 0;
                ti3Var3.setMarginEnd(tu0.G(24 * fk4.d().getDisplayMetrics().density));
                frameLayout.setLayoutParams(ti3Var3);
                frameLayout.setBackground(this.c.N0);
                return frameLayout;
            default:
                Drawable drawableB = kt3.b(this.c.getContext(), yfa.q);
                drawableB.setTint(k7d.h(qp4.u0, this.b).f);
                return drawableB;
        }
    }

    public /* synthetic */ wda(Context context, zda zdaVar, int i) {
        this.a = i;
        this.b = context;
        this.c = zdaVar;
    }
}
