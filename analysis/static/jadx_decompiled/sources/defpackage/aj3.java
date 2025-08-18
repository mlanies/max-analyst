package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;

/* loaded from: classes.dex */
public final class aj3 {
    public static final SparseIntArray j;
    public int a;
    public int b;
    public int c;
    public float d;
    public float e;
    public float f;
    public int g;
    public String h;
    public int i;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        j = sparseIntArray;
        sparseIntArray.append(i3c.Motion_motionPathRotate, 1);
        sparseIntArray.append(i3c.Motion_pathMotionArc, 2);
        sparseIntArray.append(i3c.Motion_transitionEasing, 3);
        sparseIntArray.append(i3c.Motion_drawPath, 4);
        sparseIntArray.append(i3c.Motion_animateRelativeTo, 5);
        sparseIntArray.append(i3c.Motion_animateCircleAngleTo, 6);
        sparseIntArray.append(i3c.Motion_motionStagger, 7);
        sparseIntArray.append(i3c.Motion_quantizeMotionSteps, 8);
        sparseIntArray.append(i3c.Motion_quantizeMotionPhase, 9);
        sparseIntArray.append(i3c.Motion_quantizeMotionInterpolator, 10);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i3c.Motion);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            switch (j.get(index)) {
                case 1:
                    this.e = typedArrayObtainStyledAttributes.getFloat(index, this.e);
                    break;
                case 2:
                    this.c = typedArrayObtainStyledAttributes.getInt(index, this.c);
                    break;
                case 3:
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        typedArrayObtainStyledAttributes.getString(index);
                        break;
                    } else {
                        String str = ema.a[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                        break;
                    }
                case 4:
                    typedArrayObtainStyledAttributes.getInt(index, 0);
                    break;
                case 5:
                    this.a = dj3.i(typedArrayObtainStyledAttributes, index, this.a);
                    break;
                case 6:
                    this.b = typedArrayObtainStyledAttributes.getInteger(index, this.b);
                    break;
                case 7:
                    this.d = typedArrayObtainStyledAttributes.getFloat(index, this.d);
                    break;
                case 8:
                    this.g = typedArrayObtainStyledAttributes.getInteger(index, this.g);
                    break;
                case 9:
                    this.f = typedArrayObtainStyledAttributes.getFloat(index, this.f);
                    break;
                case 10:
                    int i2 = typedArrayObtainStyledAttributes.peekValue(index).type;
                    if (i2 == 1) {
                        this.i = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                        break;
                    } else if (i2 == 3) {
                        String string = typedArrayObtainStyledAttributes.getString(index);
                        this.h = string;
                        if (string.indexOf("/") > 0) {
                            this.i = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                            break;
                        } else {
                            break;
                        }
                    } else {
                        typedArrayObtainStyledAttributes.getInteger(index, this.i);
                        break;
                    }
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
