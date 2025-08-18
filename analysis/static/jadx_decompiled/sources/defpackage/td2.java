package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public final class td2 extends ConstraintLayout implements kre {
    public final TextView G0;
    public final TextView H0;
    public final GradientDrawable I0;
    public final AppCompatImageView J0;
    public o50 K0;
    public x77 L0;
    public Long M0;

    public td2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TextView textView = new TextView(context);
        ti3 ti3Var = new ti3(-1, -2);
        float f = 4;
        ((ViewGroup.MarginLayoutParams) ti3Var).bottomMargin = tu0.G(fk4.d().getDisplayMetrics().density * f);
        textView.setLayoutParams(ti3Var);
        i4f.j.b(textView, du4.b);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        this.G0 = textView;
        TextView textView2 = new TextView(context);
        ti3 ti3Var2 = new ti3(-1, -2);
        ((ViewGroup.MarginLayoutParams) ti3Var2).bottomMargin = tu0.G(f * fk4.d().getDisplayMetrics().density);
        textView2.setLayoutParams(ti3Var2);
        i4f.n.b(textView2, du4.b);
        textView2.setMaxLines(2);
        textView2.setEllipsize(truncateAt);
        textView2.setVisibility(8);
        this.H0 = textView2;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setCornerRadius(fk4.d().getDisplayMetrics().density * 48.0f);
        pq9 pq9Var = qp4.u0;
        gradientDrawable.setColor(ColorStateList.valueOf(pq9Var.j(this).getIcon().k));
        this.I0 = gradientDrawable;
        AppCompatImageView appCompatImageView = new AppCompatImageView(context, null);
        appCompatImageView.setId(wea.j0);
        float f2 = 40;
        appCompatImageView.setLayoutParams(new ti3(tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(f2 * fk4.d().getDisplayMetrics().density)));
        appCompatImageView.setBackground(gradientDrawable);
        pq9Var.j(appCompatImageView).getClass();
        appCompatImageView.setImageTintList(ColorStateList.valueOf(-1));
        appCompatImageView.setScaleType(ImageView.ScaleType.CENTER);
        this.J0 = appCompatImageView;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(wea.i0);
        linearLayout.setLayoutParams(new ti3(0, -2));
        linearLayout.setOrientation(1);
        linearLayout.addView(textView);
        linearLayout.addView(textView2);
        setLayoutParams(new ti3(-1, -2));
        float f3 = 12;
        int iG = tu0.G(fk4.d().getDisplayMetrics().density * f3);
        setPadding(iG, iG, iG, iG);
        setBackground(new RippleDrawable(ColorStateList.valueOf(pq9Var.j(this).d().a.a.h), null, new ColorDrawable(-1)));
        addView(appCompatImageView);
        addView(linearLayout);
        dj3 dj3VarQ = fp3.q(this);
        int id = appCompatImageView.getId();
        dj3VarQ.d(id, 6, 0, 6);
        dj3VarQ.d(id, 3, 0, 3);
        dj3VarQ.d(id, 4, 0, 4);
        int id2 = linearLayout.getId();
        dj3VarQ.d(id2, 3, 0, 3);
        dj3VarQ.d(id2, 4, 0, 4);
        dj3VarQ.d(id2, 7, 0, 7);
        dj3VarQ.d(id2, 6, appCompatImageView.getId(), 7);
        new l2a(dj3VarQ, 6, id2, 4).e(tu0.G(f3 * fk4.d().getDisplayMetrics().density));
        dj3VarQ.a(this);
        onThemeChanged(pq9Var.j(this));
    }

    private final void setButtonState(l30 l30Var) {
        boolean zF = tpa.f(l30Var, sp3.a);
        AppCompatImageView appCompatImageView = this.J0;
        if (zF) {
            appCompatImageView.setImageDrawable(kt3.b(getContext(), woc.c2));
        } else {
            if (!tpa.f(l30Var, dp3.a) && !tpa.f(l30Var, o84.c) && !tpa.f(l30Var, vu4.a)) {
                throw new NoWhenBranchMatchedException();
            }
            appCompatImageView.setImageDrawable(kt3.b(getContext(), woc.I1));
        }
    }

    private final void setState(j0e j0eVar) {
        o50 o50Var;
        this.K0 = new o50(this, 1, j0eVar);
        if (isAttachedToWindow() && (o50Var = this.K0) != null) {
            o50Var.onViewAttachedToWindow(this);
        }
        addOnAttachStateChangeListener(this.K0);
    }

    private final void setSubtitle(CharSequence charSequence) {
        TextView textView = this.H0;
        textView.setVisibility(true ^ (charSequence == null || charSequence.length() == 0) ? 0 : 8);
        textView.setText(charSequence);
    }

    private final void setTitle(CharSequence charSequence) {
        this.G0.setText(charSequence);
    }

    public static final void w(td2 td2Var, v50 v50Var) {
        td2Var.getClass();
        l30 l30Var = v50Var != null ? v50Var.c : null;
        if (l30Var == null || !tpa.f(v50Var.a, td2Var.M0)) {
            td2Var.setButtonState(o84.c);
        } else {
            td2Var.setButtonState(l30Var);
        }
    }

    @Override // defpackage.kre
    public final void onThemeChanged(fka fkaVar) {
        this.G0.setTextColor(fkaVar.getText().e);
        this.H0.setTextColor(fkaVar.getText().g);
        this.I0.setColor(ColorStateList.valueOf(fkaVar.getIcon().k));
        this.J0.setImageTintList(ColorStateList.valueOf(-1));
    }

    public final void setupAudio(qm8 qm8Var) {
        this.M0 = Long.valueOf(qm8Var.b);
        setTitle(qm8Var.Y);
        setSubtitle(qm8Var.Z);
        setState(qm8Var.t0);
    }
}
