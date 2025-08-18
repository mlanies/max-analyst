package defpackage;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.google.android.material.tabs.TabLayout;

/* loaded from: classes.dex */
public final class wja extends TabLayout implements kre {
    public final xja m1;
    public final je7 n1;

    public wja(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.m1 = (xja) yja.a.getValue();
        this.n1 = tu0.r(3, new zj7(20, this));
        super.setSelectedTabIndicator(getIndicatorDrawable());
        super.setSelectedTabIndicatorColor(qp4.u0.j(this).i().h);
        super.setTabIndicatorFullWidth(false);
        setBackgroundColor(0);
        setTabRippleColor(null);
        setClipToPadding(false);
        float f = 4;
        setPadding(tu0.G(fk4.d().getDisplayMetrics().density * f), getPaddingTop(), tu0.G(f * fk4.d().getDisplayMetrics().density), getPaddingBottom());
        ft.t(nec.a(TabLayout.class), this, "requestedTabMinWidth", 0);
    }

    private final GradientDrawable getIndicatorDrawable() {
        return (GradientDrawable) this.n1.getValue();
    }

    @Override // defpackage.kre
    public final void onThemeChanged(fka fkaVar) {
        super.setSelectedTabIndicatorColor(fkaVar.i().h);
        qp4.d(qp4.u0.b(getContext()), this);
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams != null) {
            layoutParams.height = tu0.G(40 * fk4.d().getDisplayMetrics().density);
        }
        super.setLayoutParams(layoutParams);
    }
}
