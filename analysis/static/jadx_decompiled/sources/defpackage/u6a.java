package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

/* loaded from: classes.dex */
public final class u6a extends LinearLayout implements kre {
    public static final qx7 b;
    public static final /* synthetic */ bc7[] c;
    public final yj a;

    static {
        oi9 oi9Var = new oi9(u6a.class, "isBlurEnabled", "isBlurEnabled()Ljava/lang/Boolean;");
        nec.a.getClass();
        c = new bc7[]{oi9Var};
        b = new qx7(14);
    }

    public u6a(Context context) {
        super(context, null);
        this.a = new yj(17, this);
        setOrientation(0);
        setElevation(16.0f * fk4.d().getDisplayMetrics().density);
    }

    public final void a(fka fkaVar, Boolean bool) {
        Context context = getContext();
        ne0 ne0VarB = fkaVar.b();
        Boolean bool2 = Boolean.TRUE;
        Drawable drawableA = s36.a(context, ne0VarB.i, 2.0f, tpa.f(bool, bool2));
        if (!tpa.f(bool, bool2)) {
            drawableA.setAlpha(255);
        }
        setBackground(drawableA);
    }

    public final int getSelectedItemId() {
        u1 u1Var = new u1(4, this);
        while (u1Var.hasNext()) {
            View view = (View) u1Var.next();
            if (view.isSelected()) {
                Object objV = tpa.v(view, vxb.tag_tab_item);
                t6a t6aVar = objV instanceof t6a ? (t6a) objV : null;
                if (t6aVar != null) {
                    return t6aVar.c;
                }
                return -1;
            }
        }
        return -1;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        v27 v27VarF = x6g.f(this, getRootWindowInsets()).a.f(2);
        int i3 = 0;
        while (true) {
            if (!(i3 < getChildCount())) {
                float f = 8;
                setPadding(tu0.G(fk4.d().getDisplayMetrics().density * f), getPaddingTop(), tu0.G(f * fk4.d().getDisplayMetrics().density), getPaddingBottom());
                b.getClass();
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getPaddingTop() + getPaddingBottom() + qx7.a(this), 1073741824));
                return;
            }
            int i4 = i3 + 1;
            View childAt = getChildAt(i3);
            if (childAt == null) {
                throw new IndexOutOfBoundsException();
            }
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            }
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            layoutParams2.bottomMargin = tu0.G((v27VarF.d > 0 ? 4 : 12) * fk4.d().getDisplayMetrics().density);
            childAt.setLayoutParams(layoutParams2);
            i3 = i4;
        }
    }

    @Override // defpackage.kre
    public final void onThemeChanged(fka fkaVar) {
        bc7 bc7Var = c[0];
        a(fkaVar, (Boolean) this.a.b);
        int i = 0;
        while (true) {
            if (!(i < getChildCount())) {
                return;
            }
            int i2 = i + 1;
            View childAt = getChildAt(i);
            if (childAt == null) {
                throw new IndexOutOfBoundsException();
            }
            ((wq0) childAt).w();
            i = i2;
        }
    }

    public final void setBlurEnabled(Boolean bool) {
        this.a.o1(this, c[0], bool);
    }
}
