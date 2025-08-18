package ru.ok.messages.settings.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import defpackage.bk4;
import defpackage.fm9;
import defpackage.hm9;
import defpackage.khe;
import defpackage.ote;
import defpackage.pn;
import defpackage.sme;
import defpackage.z00;

/* loaded from: classes2.dex */
public class BrightnessSeekBar extends pn {
    public static final /* synthetic */ int u0 = 0;
    public final bk4 b;
    public final int c;
    public final GradientDrawable o;
    public float s0;
    public ValueAnimator t0;

    public BrightnessSeekBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.s0 = -1.0f;
        getContext();
        bk4 bk4VarB = bk4.b();
        this.b = bk4VarB;
        this.c = bk4VarB.e;
        Context context2 = getContext();
        khe kheVar = sme.a0;
        sme smeVarR = fm9.R(context2);
        this.o = hm9.S(Integer.valueOf(smeVarR.m), Integer.valueOf(ote.b0(smeVarR.k, 0.5f)), Integer.valueOf(this.b.b));
    }

    @Override // defpackage.pn, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.s0 != -1.0f && this.o != null) {
            int measuredWidth = (int) (((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) * this.s0);
            Rect bounds = getThumb().getBounds();
            GradientDrawable gradientDrawable = this.o;
            int i = measuredWidth - this.c;
            int iCenterY = bounds.centerY();
            int i2 = this.c;
            gradientDrawable.setBounds(i, iCenterY - i2, measuredWidth + i2, bounds.centerY() + this.c);
            int iSave = canvas.save();
            canvas.translate(getPaddingLeft(), getPaddingTop());
            this.o.draw(canvas);
            canvas.restoreToCount(iSave);
        }
    }

    public void setBrightnessThumbProgress(float f) {
        ValueAnimator valueAnimator = this.t0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.t0.cancel();
        }
        float f2 = this.s0;
        if (f2 == -1.0f) {
            this.s0 = f;
            invalidate();
        } else {
            ValueAnimator duration = ValueAnimator.ofFloat(f2, f).setDuration(500L);
            this.t0 = duration;
            duration.addUpdateListener(new z00(3, this));
            this.t0.start();
        }
    }

    @Override // android.widget.ProgressBar
    public synchronized void setProgress(int i) {
        super.setProgress(i);
    }
}
