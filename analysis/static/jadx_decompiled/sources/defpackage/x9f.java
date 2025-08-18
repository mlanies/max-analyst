package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.NoWhenBranchMatchedException;
import one.me.sdk.richvector.EnhancedVectorDrawable;

/* loaded from: classes.dex */
public final class x9f extends FrameLayout implements kre {
    public v9f a;
    public final AppCompatImageView b;
    public final AppCompatTextView c;
    public final AppCompatImageView o;

    public x9f(v9f v9fVar, Context context) {
        super(context);
        this.a = v9fVar;
        AppCompatImageView appCompatImageView = new AppCompatImageView(context, null);
        appCompatImageView.setId(View.generateViewId());
        float f = 36;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density));
        float f2 = 12;
        layoutParams.setMarginStart(tu0.G(fk4.d().getDisplayMetrics().density * f2));
        layoutParams.gravity = 8388627;
        appCompatImageView.setLayoutParams(layoutParams);
        int iG = tu0.G(6 * fk4.d().getDisplayMetrics().density);
        appCompatImageView.setPadding(iG, iG, iG, iG);
        this.b = appCompatImageView;
        AppCompatTextView appCompatTextView = new AppCompatTextView(context, null);
        appCompatTextView.setId(View.generateViewId());
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams2.setMarginEnd(tu0.G(52 * fk4.d().getDisplayMetrics().density));
        layoutParams2.gravity = 16;
        appCompatTextView.setLayoutParams(layoutParams2);
        i4f.j.b(appCompatTextView, du4.b);
        this.c = appCompatTextView;
        AppCompatImageView appCompatImageView2 = new AppCompatImageView(context, null);
        appCompatImageView2.setId(View.generateViewId());
        float f3 = 28;
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(tu0.G(fk4.d().getDisplayMetrics().density * f3), tu0.G(f3 * fk4.d().getDisplayMetrics().density));
        layoutParams3.setMarginEnd(tu0.G(f2 * fk4.d().getDisplayMetrics().density));
        layoutParams3.gravity = 8388629;
        appCompatImageView2.setLayoutParams(layoutParams3);
        this.o = appCompatImageView2;
        setId(View.generateViewId());
        setLayoutParams(new FrameLayout.LayoutParams(-1, tu0.G(48 * fk4.d().getDisplayMetrics().density)));
        addView(appCompatImageView);
        addView(appCompatTextView);
        addView(appCompatImageView2);
        onThemeChanged(qp4.u0.j(this));
    }

    @Override // defpackage.kre
    public final void onThemeChanged(fka fkaVar) {
        setBackground(new RippleDrawable(ColorStateList.valueOf(qp4.u0.j(this).d().a.a.h), new ColorDrawable(fkaVar.b().g), new ColorDrawable(-65536)));
        int iOrdinal = this.a.ordinal();
        AppCompatImageView appCompatImageView = this.o;
        AppCompatTextView appCompatTextView = this.c;
        AppCompatImageView appCompatImageView2 = this.b;
        if (iOrdinal == 0 || iOrdinal == 1) {
            appCompatImageView2.setImageTintList(ColorStateList.valueOf(fkaVar.getIcon().f));
            appCompatTextView.setTextColor(fkaVar.getText().e);
            appCompatImageView.setImageTintList(ColorStateList.valueOf(fkaVar.getIcon().f));
            return;
        }
        if (iOrdinal == 2) {
            appCompatImageView2.setImageTintList(ColorStateList.valueOf(fkaVar.getIcon().k));
            appCompatTextView.setTextColor(fkaVar.getText().j);
            appCompatImageView.setImageTintList(ColorStateList.valueOf(fkaVar.getIcon().k));
        } else {
            if (iOrdinal != 3) {
                throw new NoWhenBranchMatchedException();
            }
            appCompatImageView2.setImageTintList(ColorStateList.valueOf(fkaVar.getIcon().f));
            appCompatTextView.setTextColor(fkaVar.getText().e);
            Drawable drawable = appCompatImageView.getDrawable();
            EnhancedVectorDrawable enhancedVectorDrawable = drawable instanceof EnhancedVectorDrawable ? (EnhancedVectorDrawable) drawable : null;
            if (enhancedVectorDrawable != null) {
                c54.Z(enhancedVectorDrawable, "background", fkaVar.b().a.f);
                c54.Z(enhancedVectorDrawable, "plus", fkaVar.getIcon().b);
            }
        }
    }

    public final void setActionMenuIconClickListener(m56 m56Var) {
        tu0.K(this.o, 300L, new v7d(m56Var, 16, this));
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final void setOnDragIconTouchListener(a66 a66Var) {
        this.b.setOnTouchListener(new ei1(5, a66Var));
    }

    public final void setTitle(CharSequence charSequence) {
        this.c.setText(charSequence);
    }

    public final void setType(v9f v9fVar) {
        int i;
        this.a = v9fVar;
        AppCompatImageView appCompatImageView = this.b;
        v9f v9fVar2 = v9f.o;
        int i2 = 0;
        appCompatImageView.setVisibility(v9fVar != v9fVar2 ? 0 : 8);
        int iOrdinal = v9fVar.ordinal();
        if (iOrdinal == 0) {
            i = woc.n1;
        } else if (iOrdinal == 1) {
            i = gpc.b0;
        } else if (iOrdinal == 2) {
            i = gpc.h;
        } else {
            if (iOrdinal != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i = 0;
        }
        appCompatImageView.setImageResource(i);
        ((FrameLayout.LayoutParams) this.c.getLayoutParams()).setMarginStart(v9fVar != v9fVar2 ? tu0.G(60 * fk4.d().getDisplayMetrics().density) : tu0.G(12 * fk4.d().getDisplayMetrics().density));
        AppCompatImageView appCompatImageView2 = this.o;
        if (v9fVar != v9f.b && v9fVar != v9fVar2) {
            i2 = 8;
        }
        appCompatImageView2.setVisibility(i2);
        int iOrdinal2 = v9fVar.ordinal();
        pq9 pq9Var = qp4.u0;
        if (iOrdinal2 == 1) {
            int i3 = pq9Var.j(appCompatImageView2).d().a.a.h;
            ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
            shapeDrawable.getPaint().setColor(-1);
            appCompatImageView2.setBackground(new RippleDrawable(ColorStateList.valueOf(i3), null, shapeDrawable));
            appCompatImageView2.setImageResource(woc.a);
        } else if (iOrdinal2 == 3) {
            appCompatImageView2.setImageDrawable(new EnhancedVectorDrawable(appCompatImageView2.getContext(), pub.ic_add_button_28));
        }
        onThemeChanged(pq9Var.j(this));
    }
}
