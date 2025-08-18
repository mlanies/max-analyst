package defpackage;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes.dex */
public final class o91 extends ConstraintLayout implements bk1 {
    public static final /* synthetic */ bc7[] J0;
    public final AppCompatTextView G0;
    public final AppCompatTextView H0;
    public final yj I0;

    static {
        oi9 oi9Var = new oi9(o91.class, "indicatorState", "getIndicatorState()Lone/me/calls/ui/view/indicator/CallIndicatorView$Companion$CallIndicatorState;");
        nec.a.getClass();
        J0 = new bc7[]{oi9Var};
    }

    public o91(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.I0 = new yj(this);
        setBackground(new u91(context));
        AppCompatTextView appCompatTextView = new AppCompatTextView(context, null);
        appCompatTextView.setId(y7a.Q);
        appCompatTextView.setMaxLines(1);
        appCompatTextView.setGravity(17);
        appCompatTextView.setLayoutParams(new ti3(-2, -2));
        kqe kqeVar = i4f.n;
        kqeVar.b(appCompatTextView, du4.b);
        appCompatTextView.setTextColor(getTitleColor());
        this.H0 = appCompatTextView;
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(context, null);
        appCompatTextView2.setId(y7a.R);
        appCompatTextView2.setEllipsize(TextUtils.TruncateAt.END);
        appCompatTextView2.setMaxLines(1);
        appCompatTextView2.setGravity(17);
        appCompatTextView2.setLayoutParams(new ti3(-2, -1));
        kqeVar.b(appCompatTextView2, du4.b);
        appCompatTextView2.setTextColor(getTitleColor());
        this.G0 = appCompatTextView2;
        addView(appCompatTextView);
        addView(appCompatTextView2);
        float f = 24;
        float f2 = 0;
        setPadding(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(f * fk4.d().getDisplayMetrics().density), tu0.G(f2 * fk4.d().getDisplayMetrics().density));
        dj3 dj3VarQ = fp3.q(this);
        int id = appCompatTextView2.getId();
        dj3VarQ.d(id, 3, 0, 3);
        dj3VarQ.d(id, 6, 0, 6);
        dj3VarQ.d(id, 7, appCompatTextView.getId(), 6);
        dj3VarQ.g(id).d.l0 = true;
        dj3VarQ.g(id).d.V = 2;
        int id2 = appCompatTextView.getId();
        dj3VarQ.d(id2, 4, appCompatTextView2.getId(), 4);
        dj3VarQ.d(id2, 3, appCompatTextView2.getId(), 3);
        dj3VarQ.d(id2, 6, appCompatTextView2.getId(), 7);
        dj3VarQ.d(id2, 7, 0, 7);
        dj3VarQ.a(this);
    }

    private final int getTitleColor() {
        return qp4.u0.p(this).c.getText().e;
    }

    @Override // defpackage.bk1
    public final void a(boolean z) {
        u91 background = getBackground();
        if (background != null) {
            t91 t91Var = t91.b;
            background.Z.o1(background, u91.s0[0], t91Var);
        }
        u91 background2 = getBackground();
        if (background2 != null) {
            background2.start();
        }
        this.H0.setTranslationY(0.0f);
        this.G0.setTranslationY(0.0f);
        setAlpha(1.0f);
    }

    @Override // defpackage.bk1
    public final void b(boolean z) {
        u91 background = getBackground();
        if (background != null) {
            t91 t91Var = t91.a;
            background.Z.o1(background, u91.s0[0], t91Var);
        }
        u91 background2 = getBackground();
        if (background2 != null) {
            background2.stop();
        }
    }

    public final n91 getIndicatorState() {
        bc7 bc7Var = J0[0];
        return (n91) this.I0.b;
    }

    @Override // defpackage.bk1
    public final void h(kl7 kl7Var, boolean z, long j) {
        kl7Var.add(ObjectAnimator.ofFloat(this, (Property<o91, Float>) View.ALPHA, z ? 0.0f : 1.0f, z ? 1.0f : 0.0f));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        u91 background = getBackground();
        if (background != null) {
            background.start();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        u91 background = getBackground();
        if (background != null) {
            background.stop();
        }
    }

    public final void setIndicatorState(n91 n91Var) {
        this.I0.o1(this, J0[0], n91Var);
    }

    public final void setTime(CharSequence charSequence) {
        this.H0.setText(charSequence);
    }

    public final void setTitle(CharSequence charSequence) {
        this.G0.setText(charSequence);
    }

    @Override // android.view.View
    public u91 getBackground() {
        Drawable background = super.getBackground();
        if (background instanceof u91) {
            return (u91) background;
        }
        return null;
    }
}
