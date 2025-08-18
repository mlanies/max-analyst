package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.provider.Settings;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ProgressBar;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class sj0 extends ProgressBar {
    public static final int z0 = m2c.Widget_MaterialComponents_ProgressIndicator;
    public final tj0 a;
    public int b;
    public final boolean c;
    public final int o;
    public dh s0;
    public boolean t0;
    public int u0;
    public final qj0 v0;
    public final qj0 w0;
    public final rj0 x0;
    public final rj0 y0;

    public sj0(Context context, AttributeSet attributeSet, int i, int i2) {
        super(y18.a(context, attributeSet, i, z0), attributeSet, i);
        this.t0 = false;
        this.u0 = 4;
        this.v0 = new qj0(this, 0);
        this.w0 = new qj0(this, 1);
        this.x0 = new rj0(this, 0);
        this.y0 = new rj0(this, 1);
        Context context2 = getContext();
        this.a = a(context2, attributeSet);
        TypedArray typedArrayD = sre.d(context2, attributeSet, z2c.BaseProgressIndicator, i, i2, new int[0]);
        typedArrayD.getInt(z2c.BaseProgressIndicator_showDelay, -1);
        this.o = Math.min(typedArrayD.getInt(z2c.BaseProgressIndicator_minHideDelay, -1), 1000);
        typedArrayD.recycle();
        this.s0 = new dh();
        this.c = true;
    }

    private wq4 getCurrentDrawingDelegate() {
        if (isIndeterminate()) {
            if (getIndeterminateDrawable() == null) {
                return null;
            }
            return getIndeterminateDrawable().w0;
        }
        if (getProgressDrawable() == null) {
            return null;
        }
        return getProgressDrawable().w0;
    }

    public abstract tj0 a(Context context, AttributeSet attributeSet);

    public void b(int i) {
        if (!isIndeterminate()) {
            super.setProgress(i);
            if (getProgressDrawable() != null) {
                getProgressDrawable().jumpToCurrentState();
                return;
            }
            return;
        }
        if (getProgressDrawable() != null) {
            this.b = i;
            this.t0 = true;
            if (getIndeterminateDrawable().isVisible()) {
                dh dhVar = this.s0;
                ContentResolver contentResolver = getContext().getContentResolver();
                dhVar.getClass();
                if (Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f) != 0.0f) {
                    getIndeterminateDrawable().x0.c0();
                    return;
                }
            }
            this.x0.a(getIndeterminateDrawable());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0027, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c() {
        /*
            r2 = this;
            java.util.WeakHashMap r0 = defpackage.zmf.a
            boolean r0 = r2.isAttachedToWindow()
            if (r0 == 0) goto L2c
            int r0 = r2.getWindowVisibility()
            if (r0 != 0) goto L2c
            r0 = r2
        Lf:
            int r1 = r0.getVisibility()
            if (r1 == 0) goto L16
            goto L2c
        L16:
            android.view.ViewParent r0 = r0.getParent()
            if (r0 != 0) goto L23
            int r2 = r2.getWindowVisibility()
            if (r2 != 0) goto L2c
            goto L27
        L23:
            boolean r1 = r0 instanceof android.view.View
            if (r1 != 0) goto L29
        L27:
            r2 = 1
            goto L2d
        L29:
            android.view.View r0 = (android.view.View) r0
            goto Lf
        L2c:
            r2 = 0
        L2d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sj0.c():boolean");
    }

    @Override // android.widget.ProgressBar
    public Drawable getCurrentDrawable() {
        return isIndeterminate() ? getIndeterminateDrawable() : getProgressDrawable();
    }

    public int getHideAnimationBehavior() {
        return this.a.f;
    }

    public int[] getIndicatorColor() {
        return this.a.c;
    }

    public int getIndicatorTrackGapSize() {
        return this.a.g;
    }

    public int getShowAnimationBehavior() {
        return this.a.e;
    }

    public int getTrackColor() {
        return this.a.d;
    }

    public int getTrackCornerRadius() {
        return this.a.b;
    }

    public int getTrackThickness() {
        return this.a.a;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        if (getCurrentDrawable() != null) {
            getCurrentDrawable().invalidateSelf();
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getProgressDrawable() != null && getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().x0.a0(this.x0);
        }
        di4 progressDrawable = getProgressDrawable();
        rj0 rj0Var = this.y0;
        if (progressDrawable != null) {
            getProgressDrawable().c(rj0Var);
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().c(rj0Var);
        }
        if (c()) {
            if (this.o > 0) {
                SystemClock.uptimeMillis();
            }
            setVisibility(0);
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.w0);
        removeCallbacks(this.v0);
        ((jq4) getCurrentDrawable()).d(false, false, false);
        tz6 indeterminateDrawable = getIndeterminateDrawable();
        rj0 rj0Var = this.y0;
        if (indeterminateDrawable != null) {
            getIndeterminateDrawable().f(rj0Var);
            getIndeterminateDrawable().x0.f0();
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().f(rj0Var);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        try {
            int iSave = canvas.save();
            if (getPaddingLeft() != 0 || getPaddingTop() != 0) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            if (getPaddingRight() != 0 || getPaddingBottom() != 0) {
                canvas.clipRect(0, 0, getWidth() - (getPaddingLeft() + getPaddingRight()), getHeight() - (getPaddingTop() + getPaddingBottom()));
            }
            getCurrentDrawable().draw(canvas);
            canvas.restoreToCount(iSave);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int i, int i2) {
        try {
            wq4 currentDrawingDelegate = getCurrentDrawingDelegate();
            if (currentDrawingDelegate == null) {
                return;
            }
            setMeasuredDimension(currentDrawingDelegate.f() < 0 ? View.getDefaultSize(getSuggestedMinimumWidth(), i) : currentDrawingDelegate.f() + getPaddingLeft() + getPaddingRight(), currentDrawingDelegate.e() < 0 ? View.getDefaultSize(getSuggestedMinimumHeight(), i2) : currentDrawingDelegate.e() + getPaddingTop() + getPaddingBottom());
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        boolean z = i == 0;
        if (this.c) {
            ((jq4) getCurrentDrawable()).d(c(), false, z);
        }
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (this.c) {
            ((jq4) getCurrentDrawable()).d(c(), false, false);
        }
    }

    public void setAnimatorDurationScaleProvider(dh dhVar) {
        this.s0 = dhVar;
        if (getProgressDrawable() != null) {
            getProgressDrawable().c = dhVar;
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().c = dhVar;
        }
    }

    public void setHideAnimationBehavior(int i) {
        this.a.f = i;
        invalidate();
    }

    @Override // android.widget.ProgressBar
    public synchronized void setIndeterminate(boolean z) {
        try {
            if (z == isIndeterminate()) {
                return;
            }
            jq4 jq4Var = (jq4) getCurrentDrawable();
            if (jq4Var != null) {
                jq4Var.d(false, false, false);
            }
            super.setIndeterminate(z);
            jq4 jq4Var2 = (jq4) getCurrentDrawable();
            if (jq4Var2 != null) {
                jq4Var2.d(c(), false, false);
            }
            if ((jq4Var2 instanceof tz6) && c()) {
                ((tz6) jq4Var2).x0.e0();
            }
            this.t0 = false;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.widget.ProgressBar
    public void setIndeterminateDrawable(Drawable drawable) {
        if (drawable == null) {
            super.setIndeterminateDrawable(null);
        } else {
            if (!(drawable instanceof tz6)) {
                throw new IllegalArgumentException("Cannot set framework drawable as indeterminate drawable.");
            }
            ((jq4) drawable).d(false, false, false);
            super.setIndeterminateDrawable(drawable);
        }
    }

    public void setIndicatorColor(int... iArr) {
        if (iArr.length == 0) {
            iArr = new int[]{mr0.x(tsb.colorPrimary, -1, getContext())};
        }
        if (Arrays.equals(getIndicatorColor(), iArr)) {
            return;
        }
        this.a.c = iArr;
        getIndeterminateDrawable().x0.S();
        invalidate();
    }

    public void setIndicatorTrackGapSize(int i) {
        tj0 tj0Var = this.a;
        if (tj0Var.g != i) {
            tj0Var.g = i;
            tj0Var.a();
            invalidate();
        }
    }

    @Override // android.widget.ProgressBar
    public synchronized void setProgress(int i) {
        if (isIndeterminate()) {
            return;
        }
        b(i);
    }

    @Override // android.widget.ProgressBar
    public void setProgressDrawable(Drawable drawable) {
        if (drawable == null) {
            super.setProgressDrawable(null);
        } else {
            if (!(drawable instanceof di4)) {
                throw new IllegalArgumentException("Cannot set framework drawable as progress drawable.");
            }
            di4 di4Var = (di4) drawable;
            di4Var.d(false, false, false);
            super.setProgressDrawable(di4Var);
            di4Var.setLevel((int) ((getProgress() / getMax()) * 10000.0f));
        }
    }

    public void setShowAnimationBehavior(int i) {
        this.a.e = i;
        invalidate();
    }

    public void setTrackColor(int i) {
        tj0 tj0Var = this.a;
        if (tj0Var.d != i) {
            tj0Var.d = i;
            invalidate();
        }
    }

    public void setTrackCornerRadius(int i) {
        tj0 tj0Var = this.a;
        if (tj0Var.b != i) {
            tj0Var.b = Math.min(i, tj0Var.a / 2);
            invalidate();
        }
    }

    public void setTrackThickness(int i) {
        tj0 tj0Var = this.a;
        if (tj0Var.a != i) {
            tj0Var.a = i;
            requestLayout();
        }
    }

    public void setVisibilityAfterHide(int i) {
        if (i != 0 && i != 4 && i != 8) {
            throw new IllegalArgumentException("The component's visibility must be one of VISIBLE, INVISIBLE, and GONE defined in View.");
        }
        this.u0 = i;
    }

    @Override // android.widget.ProgressBar
    public tz6 getIndeterminateDrawable() {
        return (tz6) super.getIndeterminateDrawable();
    }

    @Override // android.widget.ProgressBar
    public di4 getProgressDrawable() {
        return (di4) super.getProgressDrawable();
    }
}
