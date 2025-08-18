package defpackage;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;

/* loaded from: classes2.dex */
public final class tz7 extends LinearLayout implements nse {
    public final AppCompatTextView a;
    public boolean b;
    public ObjectAnimator c;

    public tz7(Context context) throws Resources.NotFoundException {
        super(context, null, 0);
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(ktb.markdown_dot_size);
        int dimensionPixelSize2 = (getContext().getResources().getDimensionPixelSize(ktb.markdown_button_size) - dimensionPixelSize) / 2;
        setOrientation(0);
        setGravity(17);
        AppCompatTextView appCompatTextView = new AppCompatTextView(context, null, 0);
        appCompatTextView.setIncludeFontPadding(false);
        appCompatTextView.setTextAlignment(6);
        appCompatTextView.setTextSize(14.0f);
        appCompatTextView.setLineHeight(tu0.G(14 * fk4.d().getDisplayMetrics().density));
        appCompatTextView.setGravity(17);
        appCompatTextView.setPaddingRelative(tu0.G(16 * fk4.d().getDisplayMetrics().density), appCompatTextView.getPaddingTop(), appCompatTextView.getPaddingEnd(), appCompatTextView.getPaddingBottom());
        this.a = appCompatTextView;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        layoutParams.gravity = 17;
        layoutParams.setMarginEnd(tu0.G(26 * fk4.d().getDisplayMetrics().density));
        addView(appCompatTextView, layoutParams);
        View view = new View(context, null, 0);
        Drawable shapeDrawable = new ShapeDrawable(new OvalShape());
        ngg.G(shapeDrawable, -1);
        view.setBackground(shapeDrawable);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(new LinearLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize));
        layoutParams2.gravity = 17;
        layoutParams2.setMarginEnd(dimensionPixelSize2);
        addView(view, layoutParams2);
        if (isInEditMode()) {
            appCompatTextView.setText(eae.m0(20, "s"));
            appCompatTextView.setTextColor(-1);
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, e3c.MarkdownItemView);
        if (typedArrayObtainStyledAttributes.hasValue(e3c.MarkdownItemView_miv_title)) {
            setTitle(typedArrayObtainStyledAttributes.getResourceId(e3c.MarkdownItemView_miv_title, 0));
        }
        a(typedArrayObtainStyledAttributes.getBoolean(e3c.MarkdownItemView_miv_highlight_title, false), false);
        typedArrayObtainStyledAttributes.recycle();
        c();
    }

    public final void a(boolean z, boolean z2) {
        this.b = z;
        Float fValueOf = Float.valueOf(0.6f);
        Float fValueOf2 = Float.valueOf(1.0f);
        of ofVar = new of(fValueOf, fValueOf2);
        if (!this.b) {
            ofVar = new of(fValueOf2, fValueOf);
        }
        float alpha = getAlpha();
        Number number = ofVar.b;
        if (alpha == number.floatValue()) {
            return;
        }
        if (isInEditMode() || !z2 || (!mr0.w(this).p())) {
            setAlpha(number.floatValue());
            invalidate();
            return;
        }
        tg tgVarW = mr0.w(this);
        ObjectAnimator objectAnimator = this.c;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            ObjectAnimator objectAnimator2 = this.c;
            if (objectAnimator2 != null) {
                objectAnimator2.cancel();
            }
            this.c = null;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, (Property<tz7, Float>) LinearLayout.ALPHA, ofVar.a.floatValue(), number.floatValue());
        this.c = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(tgVarW.a.b());
        boolean z3 = this.b;
        lg lgVar = tgVarW.a;
        objectAnimatorOfFloat.setInterpolator(z3 ? lgVar.d() : lgVar.l());
        objectAnimatorOfFloat.addListener(new lf(this, 3, ofVar));
        objectAnimatorOfFloat.start();
    }

    @Override // defpackage.nse
    public final void c() {
        sme smeVarR;
        if (isInEditMode()) {
            return;
        }
        if (isInEditMode()) {
            smeVarR = ee4.e0;
        } else {
            Context context = getContext();
            khe kheVar = sme.a0;
            smeVarR = fm9.R(context);
        }
        this.a.setTextColor(smeVarR.l);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ObjectAnimator objectAnimator = this.c;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    public final void setTitle(int i) {
        this.a.setText(i);
    }
}
