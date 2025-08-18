package defpackage;

import android.content.res.Resources;
import android.view.View;

/* loaded from: classes.dex */
public final class kv5 extends aba {
    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i, int i2) throws Resources.NotFoundException, NumberFormatException {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(wg0.m(12, fk4.d().getDisplayMetrics().density, 2, View.MeasureSpec.getSize(i2)) - tu0.G(128 * fk4.d().getDisplayMetrics().density), 1073741824));
    }
}
