package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class aq1 extends LinearLayout {
    public final je7 a;

    public aq1(Context context) {
        super(context, null);
        this.a = tu0.r(3, new x2(context, 17, this));
        dy7.H(this, fk4.d().getDisplayMetrics().density * 20.0f);
        setOrientation(1);
        setBackground(getAnimatedBackground());
        ImageView imageView = new ImageView(context);
        float f = 48;
        imageView.setLayoutParams(new LinearLayout.LayoutParams(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density)));
        setGravity(17);
        pq9 pq9Var = qp4.u0;
        pq9Var.p(imageView).c.getIcon();
        imageView.setImageTintList(ColorStateList.valueOf(-1));
        imageView.setImageResource(x7a.z0);
        TextView textView = new TextView(context);
        textView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        textView.setGravity(17);
        i4f.c.b(textView, du4.b);
        textView.setTextColor(pq9Var.p(textView).c.getText().e);
        textView.setText(b8a.W);
        int iG = tu0.G(12 * fk4.d().getDisplayMetrics().density);
        textView.setPadding(iG, iG, iG, iG);
        addView(imageView);
        addView(textView);
    }

    private final lmd getAnimatedBackground() {
        return (lmd) this.a.getValue();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        lmd background = getBackground();
        if (background != null) {
            background.onThemeChanged(qp4.u0.p(this).c);
        }
        lmd background2 = getBackground();
        if (background2 != null) {
            background2.start();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        lmd background = getBackground();
        if (background != null) {
            background.stop();
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        lmd background;
        super.onLayout(z, i, i2, i3, i4);
        if (z && (background = getBackground()) != null) {
            background.a((i3 - i) / 2);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        if (super.verifyDrawable(drawable)) {
            return true;
        }
        lmd background = getBackground();
        return background != null && background.b(drawable);
    }

    @Override // android.view.View
    public lmd getBackground() {
        Drawable background = super.getBackground();
        if (background instanceof lmd) {
            return (lmd) background;
        }
        return null;
    }
}
