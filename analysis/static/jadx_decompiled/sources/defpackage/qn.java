package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class qn extends va8 {
    public final SeekBar X;
    public Drawable Y;
    public ColorStateList Z;
    public PorterDuff.Mode s0;
    public boolean t0;
    public boolean u0;

    public qn(SeekBar seekBar) {
        super(1, seekBar);
        this.Z = null;
        this.s0 = null;
        this.t0 = false;
        this.u0 = false;
        this.X = seekBar;
    }

    @Override // defpackage.va8
    public final void A(AttributeSet attributeSet, int i) {
        super.A(attributeSet, i);
        SeekBar seekBar = this.X;
        k8g k8gVarX = k8g.x(seekBar.getContext(), attributeSet, p3c.AppCompatSeekBar, i, 0);
        SeekBar seekBar2 = this.X;
        Context context = seekBar2.getContext();
        int[] iArr = p3c.AppCompatSeekBar;
        WeakHashMap weakHashMap = zmf.a;
        umf.d(seekBar2, context, iArr, attributeSet, (TypedArray) k8gVarX.b, i, 0);
        Drawable drawableO = k8gVarX.o(p3c.AppCompatSeekBar_android_thumb);
        if (drawableO != null) {
            seekBar.setThumb(drawableO);
        }
        Drawable drawableN = k8gVarX.n(p3c.AppCompatSeekBar_tickMark);
        Drawable drawable = this.Y;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.Y = drawableN;
        if (drawableN != null) {
            drawableN.setCallback(seekBar);
            bq4.b(drawableN, seekBar.getLayoutDirection());
            if (drawableN.isStateful()) {
                drawableN.setState(seekBar.getDrawableState());
            }
            G();
        }
        seekBar.invalidate();
        int i2 = p3c.AppCompatSeekBar_tickMarkTintMode;
        TypedArray typedArray = (TypedArray) k8gVarX.b;
        if (typedArray.hasValue(i2)) {
            this.s0 = hq4.c(typedArray.getInt(p3c.AppCompatSeekBar_tickMarkTintMode, -1), this.s0);
            this.u0 = true;
        }
        if (typedArray.hasValue(p3c.AppCompatSeekBar_tickMarkTint)) {
            this.Z = k8gVarX.l(p3c.AppCompatSeekBar_tickMarkTint);
            this.t0 = true;
        }
        k8gVarX.z();
        G();
    }

    public final void G() {
        Drawable drawable = this.Y;
        if (drawable != null) {
            if (this.t0 || this.u0) {
                Drawable drawableMutate = drawable.mutate();
                this.Y = drawableMutate;
                if (this.t0) {
                    aq4.h(drawableMutate, this.Z);
                }
                if (this.u0) {
                    aq4.i(this.Y, this.s0);
                }
                if (this.Y.isStateful()) {
                    this.Y.setState(this.X.getDrawableState());
                }
            }
        }
    }

    public final void H(Canvas canvas) {
        if (this.Y != null) {
            int max = this.X.getMax();
            if (max > 1) {
                int intrinsicWidth = this.Y.getIntrinsicWidth();
                int intrinsicHeight = this.Y.getIntrinsicHeight();
                int i = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i2 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.Y.setBounds(-i, -i2, i, i2);
                float width = ((r0.getWidth() - r0.getPaddingLeft()) - r0.getPaddingRight()) / max;
                int iSave = canvas.save();
                canvas.translate(r0.getPaddingLeft(), r0.getHeight() / 2);
                for (int i3 = 0; i3 <= max; i3++) {
                    this.Y.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }
}
