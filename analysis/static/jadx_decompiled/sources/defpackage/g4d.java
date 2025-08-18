package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public final class g4d extends RecyclerView {
    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(rh4.q(150, fk4.d().getDisplayMetrics().density, View.MeasureSpec.getSize(i2)), View.MeasureSpec.getMode(i2)));
    }
}
