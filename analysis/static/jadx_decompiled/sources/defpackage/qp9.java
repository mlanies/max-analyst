package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class qp9 extends LinearLayout {
    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
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
            ((cmd) childAt).b.d();
            i = i2;
        }
    }

    public final void setTabs(int i) {
        removeAllViews();
        for (int i2 = 0; i2 < i; i2++) {
            View cmdVar = new cmd(getContext());
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(tu0.G(86 * fk4.d().getDisplayMetrics().density), tu0.G(40 * fk4.d().getDisplayMetrics().density));
            float f = 4;
            marginLayoutParams.setMarginStart(tu0.G(fk4.d().getDisplayMetrics().density * f));
            marginLayoutParams.setMarginEnd(tu0.G(f * fk4.d().getDisplayMetrics().density));
            cmdVar.setLayoutParams(marginLayoutParams);
            cmdVar.setOutlineProvider(new ix3(fk4.d().getDisplayMetrics().density * 8.0f));
            cmdVar.setBackgroundColor(qp4.u0.j(cmdVar).b().k);
            v3c.y(new xh0(3, (Continuation) null, 22), cmdVar);
            addView(cmdVar, i2);
        }
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 0) {
            int i2 = 0;
            while (true) {
                if (!(i2 < getChildCount())) {
                    return;
                }
                int i3 = i2 + 1;
                View childAt = getChildAt(i2);
                if (childAt == null) {
                    throw new IndexOutOfBoundsException();
                }
                ((cmd) childAt).b.c();
                i2 = i3;
            }
        } else {
            int i4 = 0;
            while (true) {
                if (!(i4 < getChildCount())) {
                    return;
                }
                int i5 = i4 + 1;
                View childAt2 = getChildAt(i4);
                if (childAt2 == null) {
                    throw new IndexOutOfBoundsException();
                }
                ((cmd) childAt2).b.d();
                i4 = i5;
            }
        }
    }
}
