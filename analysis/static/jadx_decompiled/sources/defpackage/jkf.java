package defpackage;

import android.content.Context;
import android.view.View;
import one.me.sdk.uikit.common.views.OneMeDraweeView;

/* loaded from: classes.dex */
public final class jkf extends OneMeDraweeView {
    public final int[] C0;
    public wcf D0;

    public jkf(Context context) {
        super(context);
        this.C0 = new int[2];
    }

    @Override // defpackage.uq4, android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        wcf wcfVar = this.D0;
        if (wcfVar == null || View.MeasureSpec.getMode(i2) == 1073741824) {
            super.onMeasure(i, i2);
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int i3 = wcfVar.c;
        int i4 = wcfVar.d;
        int[] iArr = this.C0;
        hm9.z(size, size2, i3, i4, iArr);
        setMeasuredDimension(iArr[0], iArr[1]);
    }
}
