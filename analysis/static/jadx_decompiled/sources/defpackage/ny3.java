package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/* loaded from: classes2.dex */
public final class ny3 extends LinearLayout implements kre {
    public final ImageView a;
    public final TextView b;
    public final TextView c;

    public ny3(Context context) {
        super(context, null);
        ImageView imageView = new ImageView(context);
        float f = 40;
        imageView.setLayoutParams(new LinearLayout.LayoutParams(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density)));
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        this.a = imageView;
        TextView textView = new TextView(context);
        i4f.j.b(textView, du4.b);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, 0, tu0.G(12 * fk4.d().getDisplayMetrics().density), 0);
        layoutParams.weight = 1.0f;
        textView.setLayoutParams(layoutParams);
        this.b = textView;
        TextView textView2 = new TextView(context);
        i4f.m.b(textView2, du4.b);
        this.c = textView2;
        setMinimumHeight(tu0.G(56 * fk4.d().getDisplayMetrics().density));
        setOrientation(0);
        setGravity(16);
        setOutlineProvider(new ix3(16.0f));
        setClipToOutline(true);
        addView(imageView);
        addView(textView);
        addView(textView2);
        onThemeChanged(qp4.u0.j(this));
    }

    @Override // defpackage.kre
    public final void onThemeChanged(fka fkaVar) {
        this.b.setTextColor(fkaVar.getText().e);
        this.c.setTextColor(fkaVar.getText().g);
    }

    public final void setCountryInfo(eaa eaaVar) {
        Integer num = eaaVar.o;
        if (num != null) {
            int iIntValue = num.intValue();
            ImageView imageView = this.a;
            imageView.setImageResource(iIntValue);
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMargins(0, 0, tu0.G(12 * fk4.d().getDisplayMetrics().density), 0);
            imageView.setLayoutParams(marginLayoutParams);
        }
        this.b.setText(getContext().getString(eaaVar.c));
        this.c.setText("+" + eaaVar.b);
    }
}
