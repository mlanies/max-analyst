package ru.ok.onechat.widgets;

import android.graphics.Canvas;
import android.graphics.Typeface;
import android.util.TypedValue;
import android.view.View;
import androidx.annotation.Keep;
import defpackage.ey9;
import defpackage.fk4;
import defpackage.je7;

/* loaded from: classes2.dex */
public class NumberTextView extends View {
    public float a;
    public float b;

    @Override // android.view.View
    public float getAlpha() {
        return this.b;
    }

    public float getOldTextWidth() {
        return 0.0f;
    }

    @Keep
    public float getProgress() {
        return this.a;
    }

    public float getTextWidth() {
        return 0.0f;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        throw null;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) 0.0f, 1073741824), i2);
    }

    @Override // android.view.View
    public void setAlpha(float f) {
        this.b = f * 255.0f;
    }

    public void setBold(boolean z) {
        throw null;
    }

    public void setCenterAlign(boolean z) {
    }

    public void setDuration(long j) {
    }

    public void setOnTextWidthProgressChangedListener(ey9 ey9Var) {
    }

    @Keep
    public void setProgress(float f) {
        if (this.a == f) {
            return;
        }
        this.a = f;
        invalidate();
    }

    public void setTextColor(int i) {
        throw null;
    }

    public void setTextSize(int i) {
        je7 je7Var = fk4.a;
        getContext();
        TypedValue.applyDimension(2, i, fk4.d().getDisplayMetrics());
        throw null;
    }

    public void setTypeface(Typeface typeface) {
        throw null;
    }
}
