package defpackage;

import android.view.View;
import android.widget.ScrollView;

/* loaded from: classes2.dex */
public final class e28 extends ScrollView {
    public int a;

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.a <= 0) {
            super.onMeasure(i, i2);
        } else {
            int mode = View.MeasureSpec.getMode(i2);
            super.onMeasure(i, mode == 0 ? View.MeasureSpec.makeMeasureSpec(this.a, Integer.MIN_VALUE) : View.MeasureSpec.makeMeasureSpec(Math.min(this.a, View.MeasureSpec.getSize(i2)), mode));
        }
    }

    public final void setMaxHeight(int i) {
        this.a = i;
    }
}
