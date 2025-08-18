package defpackage;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import com.google.android.material.tabs.TabLayout;

/* loaded from: classes2.dex */
public final class ed7 extends TabLayout implements kre {
    public final je7 m1;

    public ed7(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.m1 = tu0.r(3, new m57(9));
        setSelectedTabIndicator(getIndicatorDrawable());
        pq9 pq9Var = qp4.u0;
        setSelectedTabIndicatorColor(pq9Var.j(this).b().a.g);
        setTabIndicatorFullWidth(false);
        pla.a(this, new q57(2, this, this));
        setTabIndicatorAnimationMode(1);
        setTabTextColors(TabLayout.f(pq9Var.j(this).getText().e, pq9Var.j(this).getText().g));
        setBackgroundColor(0);
        setTabRippleColor(null);
        setClipToPadding(false);
        int iG = tu0.G(2 * fk4.d().getDisplayMetrics().density);
        ft.t(nec.a(TabLayout.class), this, "tabPaddingStart", Integer.valueOf(iG));
        ft.t(nec.a(TabLayout.class), this, "tabPaddingEnd", Integer.valueOf(iG));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final GradientDrawable getIndicatorDrawable() {
        return (GradientDrawable) this.m1.getValue();
    }

    @Override // defpackage.kre
    public final void onThemeChanged(fka fkaVar) {
        setSelectedTabIndicatorColor(fkaVar.b().a.g);
        pq9 pq9Var = qp4.u0;
        setTabTextColors(TabLayout.f(pq9Var.j(this).getText().e, pq9Var.j(this).getText().g));
        qp4.d(pq9Var.b(getContext()), this);
    }
}
