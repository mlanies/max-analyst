package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public final class k7a extends LinearLayout implements kre {
    public static final /* synthetic */ bc7[] t0 = {new oi9(k7a.class, "customTheme", "getCustomTheme()Lone/me/sdk/design/OneMeTheme;"), rh4.g(nec.a, k7a.class, "mode", "getMode()Lone/me/sdk/uikit/common/buttontool/OneMeButtonTool$Mode;"), new oi9(k7a.class, "appearance", "getAppearance()Lone/me/sdk/uikit/common/buttontool/OneMeButtonTool$Appearance;")};
    public final je7 a;
    public final je7 b;
    public final j7a c;
    public final j7a o;
    public final j7a s0;

    public k7a(Context context) {
        super(context, null);
        this.a = tu0.r(3, new hy4(context, 24));
        this.b = tu0.r(3, new hy4(context, 25));
        this.c = new j7a(this, 0);
        this.o = new j7a(this, 1);
        this.s0 = new j7a(this, 2);
        setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        setGravity(17);
        c(this, getAppearance());
        setClipToOutline(true);
        setOutlineProvider(new ix3(tu0.G(16 * fk4.d().getDisplayMetrics().density)));
        setClickable(true);
        setOrientation(1);
        addView(getIconView());
    }

    private final fka getCurrentTheme() {
        fka customTheme = getCustomTheme();
        return customTheme == null ? qp4.u0.j(this) : customTheme;
    }

    private final ImageView getIconView() {
        return (ImageView) this.a.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AppCompatTextView getTextView() {
        return (AppCompatTextView) this.b.getValue();
    }

    public final void b() {
        invalidate();
        requestLayout();
    }

    public final void c(View view, g7a g7aVar) {
        RippleDrawable rippleDrawable;
        int iOrdinal = g7aVar.ordinal();
        pq9 pq9Var = qp4.u0;
        if (iOrdinal == 0) {
            pq9Var.j(view);
            rippleDrawable = new RippleDrawable(ColorStateList.valueOf(getCurrentTheme().d().a.a.h), new ColorDrawable(getCurrentTheme().b().g), new ColorDrawable(-65536));
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            rippleDrawable = new RippleDrawable(ColorStateList.valueOf(pq9Var.j(view).d().a.a.d), new ColorDrawable(getCurrentTheme().d().a.a.d), new ColorDrawable(-65536));
        }
        view.setBackground(rippleDrawable);
    }

    public final g7a getAppearance() {
        bc7 bc7Var = t0[2];
        return (g7a) this.s0.b;
    }

    public final fka getCustomTheme() {
        bc7 bc7Var = t0[0];
        return (fka) this.c.b;
    }

    public final h7a getMode() {
        bc7 bc7Var = t0[1];
        return (h7a) this.o.b;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int iMax = Math.max(getMeasuredHeight(), tu0.G(60 * fk4.d().getDisplayMetrics().density));
        if (getMeasuredWidth() < iMax) {
            setMeasuredDimension(iMax, iMax);
        } else {
            setMeasuredDimension(getMeasuredWidth(), iMax);
        }
    }

    @Override // defpackage.kre
    public final void onThemeChanged(fka fkaVar) {
        getIconView().setImageTintList(ColorStateList.valueOf(getCurrentTheme().getIcon().f));
        Drawable background = getIconView().getBackground();
        if (background != null) {
            background.setTint(getCurrentTheme().getIcon().f);
        }
        c(this, getAppearance());
        getTextView().setTextColor(getCurrentTheme().getText().e);
    }

    public final void setAppearance(g7a g7aVar) {
        this.s0.o1(this, t0[2], g7aVar);
    }

    public final void setCustomTheme(fka fkaVar) {
        this.c.o1(this, t0[0], fkaVar);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        setAlpha(z ? 1.0f : 0.48f);
    }

    public final void setIcon(Drawable drawable) {
        if (getIconView().getDrawable() == drawable) {
            return;
        }
        if (drawable != null) {
            drawable.setTint(qp4.u0.j(this).getIcon().f);
        }
        getIconView().setImageDrawable(drawable);
        b();
    }

    public final void setMode(h7a h7aVar) {
        this.o.o1(this, t0[1], h7aVar);
    }

    public final void setText(CharSequence charSequence) {
        if (getMode() != h7a.b || tpa.f(getTextView().getText(), charSequence)) {
            return;
        }
        getTextView().setText(charSequence);
        if (getTextView().getParent() == null) {
            addView(getTextView());
        }
        b();
    }

    public final void setIcon(int i) {
        setIcon(kt3.b(getContext(), i));
    }

    public final void setText(int i) {
        setText(getContext().getString(i));
    }
}
