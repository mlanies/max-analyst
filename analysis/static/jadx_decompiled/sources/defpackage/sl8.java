package defpackage;

import android.content.Context;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public final class sl8 extends LinearLayout implements kre {
    public boolean a;
    public jm8 b;
    public final AppCompatImageView c;
    public final AppCompatTextView o;

    public sl8(Context context) {
        super(context, null, 0);
        AppCompatImageView appCompatImageView = new AppCompatImageView(context, null);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        float f = 4;
        int iG = tu0.G(fk4.d().getDisplayMetrics().density * f);
        appCompatImageView.setPadding(iG, iG, iG, iG);
        appCompatImageView.setLayoutParams(layoutParams);
        this.c = appCompatImageView;
        AppCompatTextView appCompatTextView = new AppCompatTextView(context, null);
        appCompatTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        appCompatTextView.setMaxWidth(tu0.G(72 * fk4.d().getDisplayMetrics().density));
        i4f.s.b(appCompatTextView, du4.b);
        this.o = appCompatTextView;
        setId(t8a.z);
        setOrientation(1);
        setGravity(1);
        setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        float f2 = 6;
        setPadding(tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(f * fk4.d().getDisplayMetrics().density), tu0.G(f2 * fk4.d().getDisplayMetrics().density), getPaddingBottom());
        addView(appCompatImageView);
        addView(appCompatTextView);
        a();
    }

    public final void a() {
        boolean z = this.a;
        AppCompatImageView appCompatImageView = this.c;
        pq9 pq9Var = qp4.u0;
        AppCompatTextView appCompatTextView = this.o;
        if (z) {
            appCompatTextView.setTextColor(pq9Var.j(this).getText().e);
            appCompatImageView.setColorFilter(pq9Var.j(this).getIcon().f);
        } else {
            appCompatTextView.setTextColor(pq9Var.j(this).getText().g);
            appCompatImageView.setColorFilter(pq9Var.j(this).getIcon().j);
        }
    }

    public final jm8 getState() {
        return this.b;
    }

    @Override // defpackage.kre
    public final void onThemeChanged(fka fkaVar) {
        a();
    }

    public final void setIsSelected(boolean z) {
        this.a = z;
        a();
    }

    public final void setState(jm8 jm8Var) {
        int i;
        int i2;
        this.b = jm8Var;
        AppCompatTextView appCompatTextView = this.o;
        gm8 gm8Var = gm8.a;
        boolean zF = tpa.f(jm8Var, gm8Var);
        fm8 fm8Var = fm8.a;
        em8 em8Var = em8.a;
        hm8 hm8Var = hm8.a;
        im8 im8Var = im8.a;
        if (zF) {
            i = u8a.I;
        } else if (tpa.f(jm8Var, im8Var)) {
            i = u8a.K;
        } else if (tpa.f(jm8Var, hm8Var)) {
            i = u8a.T;
        } else if (tpa.f(jm8Var, em8Var)) {
            i = u8a.C;
        } else {
            if (!tpa.f(jm8Var, fm8Var)) {
                throw new NoWhenBranchMatchedException();
            }
            i = u8a.D;
        }
        appCompatTextView.setText(i);
        AppCompatImageView appCompatImageView = this.c;
        if (tpa.f(jm8Var, gm8Var)) {
            i2 = s8a.m;
        } else if (tpa.f(jm8Var, im8Var)) {
            i2 = s8a.o;
        } else if (tpa.f(jm8Var, hm8Var)) {
            i2 = s8a.b;
        } else if (tpa.f(jm8Var, em8Var)) {
            i2 = s8a.n;
        } else {
            if (!tpa.f(jm8Var, fm8Var)) {
                throw new NoWhenBranchMatchedException();
            }
            i2 = s8a.a;
        }
        appCompatImageView.setImageResource(i2);
    }
}
