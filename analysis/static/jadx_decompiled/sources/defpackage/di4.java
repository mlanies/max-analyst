package defpackage;

import android.animation.ValueAnimator;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.provider.Settings;

/* loaded from: classes.dex */
public final class di4 extends jq4 {
    public static final ci4 B0 = new ci4();
    public boolean A0;
    public final wq4 w0;
    public final lwd x0;
    public final kwd y0;
    public final vq4 z0;

    public di4(Context context, tj0 tj0Var, wq4 wq4Var) {
        super(context, tj0Var);
        this.A0 = false;
        this.w0 = wq4Var;
        this.z0 = new vq4();
        lwd lwdVar = new lwd();
        this.x0 = lwdVar;
        lwdVar.a(1.0f);
        lwdVar.b(50.0f);
        kwd kwdVar = new kwd(this, B0);
        this.y0 = kwdVar;
        kwdVar.m = lwdVar;
        if (this.s0 != 1.0f) {
            this.s0 = 1.0f;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect rect = new Rect();
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
            canvas.save();
            wq4 wq4Var = this.w0;
            Rect bounds = getBounds();
            float fB = b();
            ValueAnimator valueAnimator = this.o;
            boolean z = valueAnimator != null && valueAnimator.isRunning();
            ValueAnimator valueAnimator2 = this.X;
            boolean z2 = valueAnimator2 != null && valueAnimator2.isRunning();
            wq4Var.a.a();
            wq4Var.a(canvas, bounds, fB, z, z2);
            Paint paint = this.t0;
            paint.setStyle(Paint.Style.FILL);
            paint.setAntiAlias(true);
            tj0 tj0Var = this.b;
            int i = tj0Var.c[0];
            vq4 vq4Var = this.z0;
            vq4Var.c = i;
            int iO = tj0Var.g;
            if (iO > 0) {
                if (!(this.w0 instanceof nh7)) {
                    iO = (int) ((z04.o(vq4Var.b, 0.0f, 0.01f) * iO) / 0.01f);
                }
                this.w0.d(canvas, paint, vq4Var.b, 1.0f, tj0Var.d, this.u0, iO);
            } else {
                this.w0.d(canvas, paint, 0.0f, 1.0f, tj0Var.d, this.u0, 0);
            }
            this.w0.c(canvas, paint, vq4Var, this.u0);
            this.w0.b(canvas, paint, tj0Var.c[0], this.u0);
            canvas.restore();
        }
    }

    @Override // defpackage.jq4
    public final boolean e(boolean z, boolean z2, boolean z3) {
        boolean zE = super.e(z, z2, z3);
        dh dhVar = this.c;
        ContentResolver contentResolver = this.a.getContentResolver();
        dhVar.getClass();
        float f = Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
        if (f == 0.0f) {
            this.A0 = true;
        } else {
            this.A0 = false;
            this.x0.b(50.0f / f);
        }
        return zE;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.w0.e();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.w0.f();
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        this.y0.f();
        this.z0.b = getLevel() / 10000.0f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        boolean z = this.A0;
        vq4 vq4Var = this.z0;
        kwd kwdVar = this.y0;
        if (z) {
            kwdVar.f();
            vq4Var.b = i / 10000.0f;
            invalidateSelf();
        } else {
            kwdVar.b = vq4Var.b * 10000.0f;
            kwdVar.c = true;
            kwdVar.a(i);
        }
        return true;
    }
}
