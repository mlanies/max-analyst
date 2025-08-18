package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.material.tabs.TabLayout;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class dje extends LinearLayout {
    public static final /* synthetic */ int c = 0;
    public ValueAnimator a;
    public final /* synthetic */ TabLayout b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dje(TabLayout tabLayout, Context context) {
        super(context);
        this.b = tabLayout;
        setWillNotDraw(false);
    }

    public final void a(int i) {
        TabLayout tabLayout = this.b;
        if (tabLayout.i1 == 0 || (tabLayout.getTabSelectedIndicator().getBounds().left == -1 && tabLayout.getTabSelectedIndicator().getBounds().right == -1)) {
            View childAt = getChildAt(i);
            qq9 qq9Var = tabLayout.W0;
            Drawable drawable = tabLayout.C0;
            qq9Var.getClass();
            RectF rectFB = qq9.b(tabLayout, childAt);
            drawable.setBounds((int) rectFB.left, drawable.getBounds().top, (int) rectFB.right, drawable.getBounds().bottom);
            tabLayout.a = i;
        }
    }

    public final void b(int i) {
        TabLayout tabLayout = this.b;
        Rect bounds = tabLayout.C0.getBounds();
        tabLayout.C0.setBounds(bounds.left, 0, bounds.right, i);
        requestLayout();
    }

    public final void c(View view, View view2, float f) {
        TabLayout tabLayout = this.b;
        if (view == null || view.getWidth() <= 0) {
            Drawable drawable = tabLayout.C0;
            drawable.setBounds(-1, drawable.getBounds().top, -1, tabLayout.C0.getBounds().bottom);
        } else {
            tabLayout.W0.n(tabLayout, view, view2, f, tabLayout.C0);
        }
        WeakHashMap weakHashMap = zmf.a;
        postInvalidateOnAnimation();
    }

    public final void d(int i, int i2, boolean z) {
        TabLayout tabLayout = this.b;
        if (tabLayout.a == i) {
            return;
        }
        View childAt = getChildAt(tabLayout.getSelectedTabPosition());
        View childAt2 = getChildAt(i);
        if (childAt2 == null) {
            a(tabLayout.getSelectedTabPosition());
            return;
        }
        tabLayout.a = i;
        zl zlVar = new zl(this, childAt, childAt2, 1);
        if (!z) {
            this.a.removeAllUpdateListeners();
            this.a.addUpdateListener(zlVar);
            return;
        }
        ValueAnimator valueAnimator = new ValueAnimator();
        this.a = valueAnimator;
        valueAnimator.setInterpolator(tabLayout.X0);
        valueAnimator.setDuration(i2);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        valueAnimator.addUpdateListener(zlVar);
        valueAnimator.start();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int height;
        TabLayout tabLayout = this.b;
        int iHeight = tabLayout.C0.getBounds().height();
        if (iHeight < 0) {
            iHeight = tabLayout.C0.getIntrinsicHeight();
        }
        int i = tabLayout.P0;
        if (i == 0) {
            height = getHeight() - iHeight;
            iHeight = getHeight();
        } else if (i != 1) {
            height = 0;
            if (i != 2) {
                iHeight = i != 3 ? 0 : getHeight();
            }
        } else {
            height = (getHeight() - iHeight) / 2;
            iHeight = (getHeight() + iHeight) / 2;
        }
        if (tabLayout.C0.getBounds().width() > 0) {
            Rect bounds = tabLayout.C0.getBounds();
            tabLayout.C0.setBounds(bounds.left, height, bounds.right, iHeight);
            tabLayout.C0.draw(canvas);
        }
        super.draw(canvas);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        ValueAnimator valueAnimator = this.a;
        TabLayout tabLayout = this.b;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            d(tabLayout.getSelectedTabPosition(), -1, false);
            return;
        }
        if (tabLayout.a == -1) {
            tabLayout.a = tabLayout.getSelectedTabPosition();
        }
        a(tabLayout.a);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            return;
        }
        TabLayout tabLayout = this.b;
        boolean z = true;
        if (tabLayout.N0 == 1 || tabLayout.Q0 == 2) {
            int childCount = getChildCount();
            int iMax = 0;
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0) {
                    iMax = Math.max(iMax, childAt.getMeasuredWidth());
                }
            }
            if (iMax <= 0) {
                return;
            }
            if (iMax * childCount <= getMeasuredWidth() - (((int) mqd.h(getContext(), 16)) * 2)) {
                boolean z2 = false;
                for (int i4 = 0; i4 < childCount; i4++) {
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i4).getLayoutParams();
                    if (layoutParams.width != iMax || layoutParams.weight != 0.0f) {
                        layoutParams.width = iMax;
                        layoutParams.weight = 0.0f;
                        z2 = true;
                    }
                }
                z = z2;
            } else {
                tabLayout.N0 = 0;
                tabLayout.s(false);
            }
            if (z) {
                super.onMeasure(i, i2);
            }
        }
    }
}
