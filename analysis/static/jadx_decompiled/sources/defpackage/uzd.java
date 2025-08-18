package defpackage;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;

/* loaded from: classes2.dex */
public final class uzd extends LinearLayout implements kre {
    public static final /* synthetic */ bc7[] u0;
    public final StateListDrawable a;
    public final je7 b;
    public final khe c;
    public final yj o;
    public ValueAnimator s0;
    public int t0;

    static {
        oi9 oi9Var = new oi9(uzd.class, "expandableState", "getExpandableState()Lone/me/sdk/uikit/common/chat/StartMiniAppActionView$ExpandableState;");
        nec.a.getClass();
        u0 = new bc7[]{oi9Var};
    }

    public uzd(Context context) {
        super(context, null);
        StateListDrawable stateListDrawable = new StateListDrawable();
        int[] iArr = {R.attr.state_enabled};
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(fk4.d().getDisplayMetrics().density * 20.0f);
        stateListDrawable.addState(iArr, gradientDrawable);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setCornerRadius(fk4.d().getDisplayMetrics().density * 20.0f);
        stateListDrawable.addState(new int[]{-16842910}, gradientDrawable2);
        this.a = stateListDrawable;
        this.b = tu0.r(3, new rzd(0, this));
        AppCompatImageView appCompatImageView = new AppCompatImageView(context, null);
        appCompatImageView.setId(xoc.T);
        appCompatImageView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        appCompatImageView.setImageDrawable(getLeftOuterDrawable());
        this.c = new khe(new yqd(context, 6));
        this.o = new yj(this);
        setMinimumWidth(tu0.G(44 * fk4.d().getDisplayMetrics().density));
        setOrientation(0);
        addView(appCompatImageView);
        onThemeChanged(qp4.u0.j(this));
        setBackground(stateListDrawable);
        float f = 10;
        float f2 = 6;
        setPaddingRelative(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(f * fk4.d().getDisplayMetrics().density), tu0.G(f2 * fk4.d().getDisplayMetrics().density));
    }

    public static final void a(uzd uzdVar) {
        khe kheVar = uzdVar.c;
        if (kheVar.a()) {
            TextView textView = (TextView) kheVar.getValue();
            uzdVar.t0 = textView.getMeasuredWidth();
            ValueAnimator valueAnimator = uzdVar.s0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator valueAnimatorB = b(uzdVar, textView, true);
            uzdVar.s0 = valueAnimatorB;
            valueAnimatorB.start();
        }
    }

    public static final ValueAnimator b(uzd uzdVar, TextView textView, boolean z) {
        int i = 0;
        int i2 = z ? uzdVar.t0 : 0;
        if (z) {
            uzdVar.getClass();
        } else {
            i = uzdVar.t0;
        }
        ValueAnimator duration = ValueAnimator.ofInt(i2, i).setDuration(150L);
        duration.addUpdateListener(new z00(19, textView));
        duration.addListener(new tzd(z, textView, 1));
        duration.addListener(new tzd(z, textView, 0));
        return duration;
    }

    private final Drawable getLeftOuterDrawable() {
        return (Drawable) this.b.getValue();
    }

    public final szd getExpandableState() {
        bc7 bc7Var = u0[0];
        return (szd) this.o.b;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(tu0.G(36 * fk4.d().getDisplayMetrics().density), 1073741824));
    }

    @Override // defpackage.kre
    public final void onThemeChanged(fka fkaVar) {
        Drawable leftOuterDrawable = getLeftOuterDrawable();
        fkaVar.getIcon();
        ngg.G(leftOuterDrawable, -1);
        int[] iArr = {R.attr.state_enabled};
        StateListDrawable stateListDrawable = this.a;
        ((GradientDrawable) stateListDrawable.getStateDrawable(stateListDrawable.findStateDrawableIndex(iArr))).setColor(fkaVar.b().a.m);
        ((GradientDrawable) stateListDrawable.getStateDrawable(stateListDrawable.findStateDrawableIndex(new int[]{-16842910}))).setColor(fkaVar.d().a.b.l);
    }

    public final void setExpandableState(szd szdVar) {
        this.o.o1(this, u0[0], szdVar);
    }

    public final void setText(CharSequence charSequence) {
        khe kheVar = this.c;
        if (charSequence != null && charSequence.length() != 0) {
            br7.b(this, (View) kheVar.getValue(), -1);
            ((TextView) kheVar.getValue()).setText(charSequence);
            ((View) kheVar.getValue()).setVisibility(0);
        } else if (kheVar.a()) {
            a(this);
        }
    }
}
