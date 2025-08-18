package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import defpackage.gt;
import defpackage.ht;
import defpackage.x2c;

/* loaded from: classes.dex */
public final class AspectRatioFrameLayout extends FrameLayout {
    public static final /* synthetic */ int o = 0;
    public final ht a;
    public float b;
    public int c;

    public AspectRatioFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = 0;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, x2c.AspectRatioFrameLayout, 0, 0);
            try {
                this.c = typedArrayObtainStyledAttributes.getInt(x2c.AspectRatioFrameLayout_resize_mode, 0);
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        }
        this.a = new ht(this);
    }

    public int getResizeMode() {
        return this.c;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        float f;
        float f2;
        super.onMeasure(i, i2);
        if (this.b <= 0.0f) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f3 = measuredWidth;
        float f4 = measuredHeight;
        float f5 = (this.b / (f3 / f4)) - 1.0f;
        float fAbs = Math.abs(f5);
        ht htVar = this.a;
        if (fAbs <= 0.01f) {
            if (htVar.a) {
                return;
            }
            htVar.a = true;
            htVar.b.post(htVar);
            return;
        }
        int i3 = this.c;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 == 2) {
                    f = this.b;
                } else if (i3 == 4) {
                    if (f5 > 0.0f) {
                        f = this.b;
                    } else {
                        f2 = this.b;
                    }
                }
                measuredWidth = (int) (f4 * f);
            } else {
                f2 = this.b;
            }
            measuredHeight = (int) (f3 / f2);
        } else if (f5 > 0.0f) {
            f2 = this.b;
            measuredHeight = (int) (f3 / f2);
        } else {
            f = this.b;
            measuredWidth = (int) (f4 * f);
        }
        if (!htVar.a) {
            htVar.a = true;
            htVar.b.post(htVar);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
    }

    public void setAspectRatio(float f) {
        if (this.b != f) {
            this.b = f;
            requestLayout();
        }
    }

    public void setAspectRatioListener(gt gtVar) {
    }

    public void setResizeMode(int i) {
        if (this.c != i) {
            this.c = i;
            requestLayout();
        }
    }
}
