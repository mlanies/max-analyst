package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class vy3 extends hqd {
    public static final int H0 = View.generateViewId();
    public static final int I0 = View.generateViewId();
    public final ImageView F0;
    public final TextView G0;

    public vy3(ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, tu0.G(56 * fk4.d().getDisplayMetrics().density)));
        float f = 18;
        float f2 = 12;
        linearLayout.setPadding(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(f2 * fk4.d().getDisplayMetrics().density));
        View imageView = new ImageView(context);
        int i = H0;
        imageView.setId(i);
        float f3 = 24;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(tu0.G(fk4.d().getDisplayMetrics().density * f3), tu0.G(f3 * fk4.d().getDisplayMetrics().density));
        layoutParams.setMarginEnd(tu0.G(f * fk4.d().getDisplayMetrics().density));
        imageView.setLayoutParams(layoutParams);
        linearLayout.setGravity(16);
        linearLayout.addView(imageView);
        TextView textView = new TextView(context);
        int i2 = I0;
        textView.setId(i2);
        i4f.j.b(textView, du4.b);
        textView.setSingleLine(true);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, -2, 1.0f);
        layoutParams2.gravity = 19;
        textView.setLayoutParams(layoutParams2);
        linearLayout.addView(textView);
        v3c.y(new jf1(imageView, textView, (Continuation) null, 2), linearLayout);
        super(linearLayout);
        this.F0 = (ImageView) linearLayout.findViewById(i);
        this.G0 = (TextView) linearLayout.findViewById(i2);
    }

    @Override // defpackage.hqd
    public final void D() {
        ((LinearLayout) this.a).setOnClickListener(null);
    }

    @Override // defpackage.hqd
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public final void A(uy3 uy3Var) {
        this.F0.setImageResource(uy3Var.b);
        TextView textView = this.G0;
        textView.setText(uy3Var.c.b(textView.getContext()));
        ((LinearLayout) this.a).setOnClickListener(null);
    }
}
