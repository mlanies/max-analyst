package ru.ok.messages.views.widgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import defpackage.b3c;

/* loaded from: classes2.dex */
public class BoundedLinearLayout extends LinearLayout {
    public final int a;
    public final int b;

    public BoundedLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = -1;
        this.b = -1;
        if (attributeSet == null) {
            this.a = -1;
            this.b = -1;
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b3c.BoundedLinearLayout);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(b3c.BoundedLinearLayout_boundedWidth, -1);
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(b3c.BoundedLinearLayout_boundedHeight, -1);
        typedArrayObtainStyledAttributes.recycle();
        this.a = dimensionPixelSize <= 0 ? -1 : dimensionPixelSize;
        this.b = dimensionPixelSize2 > 0 ? dimensionPixelSize2 : -1;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int i3 = this.a;
        if (i3 != -1 && size > i3) {
            int mode = View.MeasureSpec.getMode(i);
            if (mode == 0) {
                mode = Integer.MIN_VALUE;
            }
            i = View.MeasureSpec.makeMeasureSpec(this.a, mode);
        }
        int size2 = View.MeasureSpec.getSize(i2);
        int i4 = this.b;
        if (i4 != -1 && size2 > i4) {
            int mode2 = View.MeasureSpec.getMode(i2);
            i2 = View.MeasureSpec.makeMeasureSpec(this.b, mode2 != 0 ? mode2 : Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
    }
}
