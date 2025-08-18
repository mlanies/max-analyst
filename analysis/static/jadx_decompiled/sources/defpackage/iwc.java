package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;

/* loaded from: classes2.dex */
public final class iwc extends FrameLayout implements kre {
    public final AppCompatImageView a;
    public final caa b;

    public iwc(Context context) {
        super(context);
        AppCompatImageView appCompatImageView = new AppCompatImageView(context, null);
        float f = 44;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density));
        layoutParams.gravity = 83;
        appCompatImageView.setLayoutParams(layoutParams);
        int iG = tu0.G(12 * fk4.d().getDisplayMetrics().density);
        appCompatImageView.setPadding(iG, iG, iG, iG);
        appCompatImageView.setOutlineProvider(new ix3(fk4.d().getDisplayMetrics().density * 48.0f));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        appCompatImageView.setBackground(gradientDrawable);
        this.a = appCompatImageView;
        caa caaVar = new caa(context);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 53;
        caaVar.setVisibility(8);
        caaVar.setLayoutParams(layoutParams2);
        this.b = caaVar;
        float f2 = 46;
        setLayoutParams(new FrameLayout.LayoutParams(tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(f2 * fk4.d().getDisplayMetrics().density)));
        addView(appCompatImageView);
        addView(caaVar);
        onThemeChanged(qp4.u0.j(this));
    }

    @Override // defpackage.kre
    public final void onThemeChanged(fka fkaVar) {
        AppCompatImageView appCompatImageView = this.a;
        Drawable background = appCompatImageView.getBackground();
        GradientDrawable gradientDrawable = background instanceof GradientDrawable ? (GradientDrawable) background : null;
        if (gradientDrawable != null) {
            gradientDrawable.setStroke(2, fkaVar.i().b.c);
        }
        Drawable background2 = appCompatImageView.getBackground();
        GradientDrawable gradientDrawable2 = background2 instanceof GradientDrawable ? (GradientDrawable) background2 : null;
        if (gradientDrawable2 != null) {
            gradientDrawable2.setColor(qp4.u0.j(this).a().s().b.i);
        }
        appCompatImageView.setImageTintList(ColorStateList.valueOf(fkaVar.getIcon().f));
        this.b.f(fkaVar);
    }

    public final void setCounter(int i) {
        int i2 = i > 0 ? 0 : 8;
        caa caaVar = this.b;
        caaVar.setVisibility(i2);
        caaVar.g(i, true);
    }

    public final void setImageDrawable(Drawable drawable) {
        this.a.setImageDrawable(drawable);
    }
}
