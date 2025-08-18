package defpackage;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* loaded from: classes.dex */
public abstract class tj0 {
    public int a;
    public int b;
    public int[] c;
    public int d;
    public int e;
    public int f;
    public int g;

    public tj0(Context context, AttributeSet attributeSet, int i, int i2) throws Resources.NotFoundException {
        this.c = new int[0];
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(stb.mtrl_progress_track_thickness);
        int[] iArr = z2c.BaseProgressIndicator;
        sre.a(context, attributeSet, i, i2);
        sre.b(context, attributeSet, iArr, i, i2, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, i2);
        this.a = ju0.r(context, typedArrayObtainStyledAttributes, z2c.BaseProgressIndicator_trackThickness, dimensionPixelSize);
        this.b = Math.min(ju0.r(context, typedArrayObtainStyledAttributes, z2c.BaseProgressIndicator_trackCornerRadius, 0), this.a / 2);
        this.e = typedArrayObtainStyledAttributes.getInt(z2c.BaseProgressIndicator_showAnimationBehavior, 0);
        this.f = typedArrayObtainStyledAttributes.getInt(z2c.BaseProgressIndicator_hideAnimationBehavior, 0);
        this.g = typedArrayObtainStyledAttributes.getDimensionPixelSize(z2c.BaseProgressIndicator_indicatorTrackGapSize, 0);
        if (!typedArrayObtainStyledAttributes.hasValue(z2c.BaseProgressIndicator_indicatorColor)) {
            this.c = new int[]{mr0.x(tsb.colorPrimary, -1, context)};
        } else if (typedArrayObtainStyledAttributes.peekValue(z2c.BaseProgressIndicator_indicatorColor).type != 1) {
            this.c = new int[]{typedArrayObtainStyledAttributes.getColor(z2c.BaseProgressIndicator_indicatorColor, -1)};
        } else {
            int[] intArray = context.getResources().getIntArray(typedArrayObtainStyledAttributes.getResourceId(z2c.BaseProgressIndicator_indicatorColor, -1));
            this.c = intArray;
            if (intArray.length == 0) {
                throw new IllegalArgumentException("indicatorColors cannot be empty when indicatorColor is not used.");
            }
        }
        if (typedArrayObtainStyledAttributes.hasValue(z2c.BaseProgressIndicator_trackColor)) {
            this.d = typedArrayObtainStyledAttributes.getColor(z2c.BaseProgressIndicator_trackColor, -1);
        } else {
            this.d = this.c[0];
            TypedArray typedArrayObtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.disabledAlpha});
            float f = typedArrayObtainStyledAttributes2.getFloat(0, 0.2f);
            typedArrayObtainStyledAttributes2.recycle();
            this.d = mr0.j(this.d, (int) (f * 255.0f));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public void a() {
        if (this.g < 0) {
            throw new IllegalArgumentException("indicatorTrackGapSize must be >= 0.");
        }
    }
}
