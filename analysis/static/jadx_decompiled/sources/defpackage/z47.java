package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;

/* loaded from: classes2.dex */
public final class z47 extends LinearLayout implements kre {
    public final AppCompatImageView a;
    public final AppCompatTextView b;
    public final RippleDrawable c;

    public z47(Context context) {
        super(context, null);
        AppCompatImageView appCompatImageView = new AppCompatImageView(context, null);
        float f = 24;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density));
        float f2 = 18;
        layoutParams.setMarginEnd(tu0.G(fk4.d().getDisplayMetrics().density * f2));
        appCompatImageView.setLayoutParams(layoutParams);
        addView(appCompatImageView);
        this.a = appCompatImageView;
        AppCompatTextView appCompatTextView = new AppCompatTextView(context, null);
        i4f.j.b(appCompatTextView, du4.b);
        addView(appCompatTextView);
        this.b = appCompatTextView;
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        pq9 pq9Var = qp4.u0;
        RippleDrawable rippleDrawable = new RippleDrawable(ColorStateList.valueOf(pq9Var.j(this).b().g), null, shapeDrawable);
        this.c = rippleDrawable;
        setLayoutParams(new LinearLayout.LayoutParams(-1, tu0.G(56 * fk4.d().getDisplayMetrics().density)));
        setGravity(16);
        float f3 = 12;
        setPadding(tu0.G(f2 * fk4.d().getDisplayMetrics().density), tu0.G(fk4.d().getDisplayMetrics().density * f3), tu0.G(fk4.d().getDisplayMetrics().density * f3), tu0.G(f3 * fk4.d().getDisplayMetrics().density));
        setBackground(rippleDrawable);
        setClipChildren(false);
        setClipToOutline(false);
        onThemeChanged(pq9Var.j(this));
    }

    public final Drawable getIcon() {
        return this.a.getDrawable();
    }

    public final CharSequence getText() {
        return this.b.getText();
    }

    @Override // defpackage.kre
    public final void onThemeChanged(fka fkaVar) {
        this.a.setImageTintList(ColorStateList.valueOf(fkaVar.getText().j));
        this.b.setTextColor(fkaVar.getText().j);
        this.c.setColor(ColorStateList.valueOf(fkaVar.d().a.a.h));
    }

    public final void setIcon(Drawable drawable) {
        this.a.setImageDrawable(drawable);
    }

    public final void setText(CharSequence charSequence) {
        this.b.setText(charSequence);
    }
}
