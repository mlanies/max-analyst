package ru.ok.messages.settings.view;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import com.google.android.material.ComGoogleAndroidMaterialR$style;
import defpackage.b3c;
import defpackage.bk4;
import defpackage.fk4;
import defpackage.kj0;
import defpackage.stb;
import defpackage.usd;
import defpackage.z2c;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\t\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000b\u0010\u0007J\u0019\u0010\u000e\u001a\u00020\u00052\b\b\u0001\u0010\r\u001a\u00020\fH\u0017¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ok/messages/settings/view/SliderWithCustomTicks;", "Lusd;", "", "", "valueFrom", "Le5f;", "setValueFrom", "(F)V", "valueTo", "setValueTo", "stepSize", "setStepSize", "", "color", "setBackgroundColor", "(I)V", "tamtam-app_release"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public final class SliderWithCustomTicks extends usd implements kj0 {
    public final int K1;
    public float[] L1;
    public boolean M1;
    public final Paint N1;
    public final Paint O1;
    public final Paint P1;
    public final int Q1;
    public final float R1;

    public SliderWithCustomTicks(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.value});
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            setValue(typedArrayObtainStyledAttributes.getFloat(0, 0.0f));
        }
        typedArrayObtainStyledAttributes.recycle();
        this.K1 = getResources().getDimensionPixelOffset(stb.mtrl_slider_track_height);
        this.L1 = new float[0];
        this.M1 = true;
        Paint paint = new Paint(1);
        this.N1 = paint;
        Paint paint2 = new Paint(1);
        this.O1 = paint2;
        Paint paint3 = new Paint(1);
        this.P1 = paint3;
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, z2c.Slider, 0, ComGoogleAndroidMaterialR$style.Widget_MaterialComponents_Slider);
        boolean zHasValue = typedArrayObtainStyledAttributes2.hasValue(z2c.Slider_tickColor);
        int i = zHasValue ? z2c.Slider_tickColor : z2c.Slider_tickColorInactive;
        int i2 = zHasValue ? z2c.Slider_tickColor : z2c.Slider_tickColorActive;
        paint.setColor(typedArrayObtainStyledAttributes2.getColor(i, 0));
        paint2.setColor(typedArrayObtainStyledAttributes2.getColor(i2, 0));
        typedArrayObtainStyledAttributes2.recycle();
        TypedArray typedArrayObtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, b3c.SliderWithCustomTicks, 0, 0);
        int i3 = b3c.SliderWithCustomTicks_tickRadius;
        bk4.b();
        this.Q1 = typedArrayObtainStyledAttributes3.getDimensionPixelSize(i3, fk4.b((int) 4.0f));
        this.R1 = typedArrayObtainStyledAttributes3.getDimension(b3c.SliderWithCustomTicks_normalValue, 0.0f);
        typedArrayObtainStyledAttributes3.recycle();
        if (getBackground() instanceof ColorDrawable) {
            paint3.setColor(((ColorDrawable) getBackground()).getColor());
        }
        this.A0.add(this);
    }

    @Override // defpackage.ck0, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int i = 0;
        if (this.M1 && getStepSize() > 0.0f) {
            int iMin = Math.min((int) (((getValueTo() - getValueFrom()) / getStepSize()) + 1), (getTrackWidth() / (getTrackHeight() * 2)) + 1) * 2;
            if (this.L1.length != iMin) {
                this.L1 = new float[iMin];
            }
            float trackWidth = getTrackWidth() / (r2 - 1);
            for (int i2 = 0; i2 < iMin; i2 += 2) {
                this.L1[i2] = ((i2 / 2) * trackWidth) + getTrackSidePadding();
                this.L1[i2 + 1] = this.K1;
            }
            this.M1 = false;
        }
        if (getStepSize() <= 0.0f) {
            return;
        }
        int value = (int) (getValue() - getValueFrom());
        int valueFrom = (int) (this.R1 - getValueFrom());
        float f = this.Q1;
        int length = this.L1.length / 2;
        while (i < length) {
            Paint paint = this.P1;
            Paint paint2 = this.N1;
            Paint paint3 = this.O1;
            if (i == valueFrom && i != value) {
                float[] fArr = this.L1;
                int i3 = i * 2;
                int i4 = i3 + 1;
                canvas.drawCircle(fArr[i3], fArr[i4], getThumbRadius(), i < value ? paint3 : paint2);
                float[] fArr2 = this.L1;
                canvas.drawCircle(fArr2[i3], fArr2[i4], f, paint);
                float[] fArr3 = this.L1;
                float f2 = fArr3[i3];
                float f3 = fArr3[i4];
                float f4 = f / 2.0f;
                if (i < value) {
                    paint2 = paint3;
                }
                canvas.drawCircle(f2, f3, f4, paint2);
            } else if (i < value) {
                float[] fArr4 = this.L1;
                int i5 = i * 2;
                int i6 = i5 + 1;
                canvas.drawCircle(fArr4[i5], fArr4[i6], f, paint3);
                float[] fArr5 = this.L1;
                canvas.drawCircle(fArr5[i5], fArr5[i6], f / 2.0f, paint);
            } else if (i > value) {
                float[] fArr6 = this.L1;
                int i7 = i * 2;
                int i8 = i7 + 1;
                canvas.drawCircle(fArr6[i7], fArr6[i8], f, paint2);
                float[] fArr7 = this.L1;
                canvas.drawCircle(fArr7[i7], fArr7[i8], f / 2.0f, paint);
            }
            i++;
        }
    }

    @Override // defpackage.ck0, android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.M1 = true;
    }

    @Override // android.view.View
    @SuppressLint({"ResourceType"})
    public void setBackgroundColor(int color) {
        super.setBackgroundColor(color);
        this.P1.setColor(color);
    }

    @Override // defpackage.usd
    public void setStepSize(float stepSize) {
        super.setStepSize(stepSize);
        this.M1 = true;
    }

    @Override // defpackage.usd
    public void setValueFrom(float valueFrom) {
        super.setValueFrom(valueFrom);
        this.M1 = true;
    }

    @Override // defpackage.usd
    public void setValueTo(float valueTo) {
        super.setValueTo(valueTo);
        this.M1 = true;
    }
}
