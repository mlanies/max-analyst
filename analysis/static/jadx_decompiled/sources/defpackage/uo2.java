package defpackage;

import android.view.View;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public final class uo2 extends FrameLayout {
    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        if (view == null || view.getId() != t8a.b) {
            super.measureChildWithMargins(view, i, i2, i3, i4);
            return;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
        int measuredHeight = findViewById(t8a.o).getMeasuredHeight();
        int measuredHeight2 = findViewById(t8a.l).getMeasuredHeight();
        Integer numX = br7.x(this);
        int iIntValue = numX != null ? numX.intValue() : 0;
        Integer numE = br7.E(this);
        super.measureChildWithMargins(view, i, i2, iMakeMeasureSpec, Math.max(i4, measuredHeight + measuredHeight2 + iIntValue + (numE != null ? numE.intValue() : 0)));
    }
}
