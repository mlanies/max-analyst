package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

/* loaded from: classes2.dex */
public final /* synthetic */ class v8a implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ x8a c;

    public /* synthetic */ v8a(x8a x8aVar, Context context) {
        this.a = 4;
        this.c = x8aVar;
        this.b = context;
    }

    @Override // defpackage.k56
    public final Object invoke() {
        switch (this.a) {
            case 0:
                TextView textView = new TextView(this.b);
                textView.setId(xoc.q);
                ti3 ti3Var = new ti3(0, -2);
                ti3Var.t = 0;
                ti3Var.i = 0;
                x8a x8aVar = this.c;
                je7 je7Var = x8aVar.L0;
                ti3Var.u = je7Var.a() ? ((ImageView) je7Var.getValue()).getId() : 0;
                je7 je7Var2 = x8aVar.K0;
                ti3Var.k = je7Var2.a() ? ((TextView) je7Var2.getValue()).getId() : 0;
                int i = x8aVar.I0;
                ti3Var.setMarginStart(i);
                ((ViewGroup.MarginLayoutParams) ti3Var).topMargin = i;
                ti3Var.setMarginEnd(i);
                textView.setLayoutParams(ti3Var);
                textView.setMaxLines(2);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                i4f.B.b(textView, du4.b);
                qp4.u0.j(textView).getText();
                textView.setTextColor(-1);
                return textView;
            case 1:
                TextView textView2 = new TextView(this.b);
                textView2.setId(xoc.p);
                ti3 ti3Var2 = new ti3(0, -2);
                ti3Var2.t = 0;
                x8a x8aVar2 = this.c;
                je7 je7Var3 = x8aVar2.J0;
                ti3Var2.j = je7Var3.a() ? ((TextView) je7Var3.getValue()).getId() : 0;
                je7 je7Var4 = x8aVar2.L0;
                ti3Var2.u = je7Var4.a() ? ((ImageView) je7Var4.getValue()).getId() : 0;
                ti3Var2.l = 0;
                int i2 = x8aVar2.I0;
                ti3Var2.setMarginStart(i2);
                ((ViewGroup.MarginLayoutParams) ti3Var2).topMargin = x8aVar2.G0;
                ti3Var2.setMarginEnd(i2);
                ((ViewGroup.MarginLayoutParams) ti3Var2).bottomMargin = i2;
                textView2.setLayoutParams(ti3Var2);
                textView2.setMaxLines(2);
                textView2.setEllipsize(TextUtils.TruncateAt.END);
                i4f.p.b(textView2, du4.b);
                qp4.u0.j(textView2).getText();
                textView2.setTextColor(f8.G(-1, 0.7f));
                return textView2;
            case 2:
                return x8a.w(this.c, this.b);
            case 3:
                FrameLayout frameLayout = new FrameLayout(this.b);
                frameLayout.setId(xoc.o);
                float f = x8a.Z0;
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

    public /* synthetic */ v8a(Context context, x8a x8aVar, int i) {
        this.a = i;
        this.b = context;
        this.c = x8aVar;
    }
}
