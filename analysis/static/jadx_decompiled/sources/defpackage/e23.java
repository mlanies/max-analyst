package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* loaded from: classes.dex */
public final class e23 extends tj0 {
    public int h;
    public int i;
    public int j;

    /* JADX WARN: Illegal instructions before constructor call */
    public e23(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        int i = tsb.circularProgressIndicatorStyle;
        int i2 = d23.A0;
        super(context, attributeSet, i, i2);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(stb.mtrl_progress_circular_size_medium);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(stb.mtrl_progress_circular_inset_medium);
        int[] iArr = z2c.CircularProgressIndicator;
        sre.a(context, attributeSet, i, i2);
        sre.b(context, attributeSet, iArr, i, i2, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, i2);
        this.h = Math.max(ju0.r(context, typedArrayObtainStyledAttributes, z2c.CircularProgressIndicator_indicatorSize, dimensionPixelSize), this.a * 2);
        this.i = ju0.r(context, typedArrayObtainStyledAttributes, z2c.CircularProgressIndicator_indicatorInset, dimensionPixelSize2);
        this.j = typedArrayObtainStyledAttributes.getInt(z2c.CircularProgressIndicator_indicatorDirectionCircular, 0);
        typedArrayObtainStyledAttributes.recycle();
        a();
    }
}
