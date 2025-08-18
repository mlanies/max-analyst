package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class onc extends tnc {
    public static final /* synthetic */ int U0 = 0;
    public final Paint O0;
    public final Paint P0;
    public final Bitmap Q0;
    public WeakReference R0;
    public boolean S0;
    public RectF T0;

    public onc(Resources resources, Bitmap bitmap, Paint paint) {
        super(new BitmapDrawable(resources, bitmap));
        Paint paint2 = new Paint();
        this.O0 = paint2;
        Paint paint3 = new Paint(1);
        this.P0 = paint3;
        this.T0 = null;
        this.Q0 = bitmap;
        if (paint != null) {
            paint2.set(paint);
        }
        paint2.setFlags(1);
        paint3.setStyle(Paint.Style.STROKE);
        this.S0 = false;
    }

    @Override // defpackage.tnc, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Shader shader;
        if (f46.W()) {
            f46.e("RoundedBitmapDrawable#draw");
        }
        if (!h()) {
            super.draw(canvas);
            if (f46.W()) {
                f46.A();
                return;
            }
            return;
        }
        f();
        d();
        WeakReference weakReference = this.R0;
        Paint paint = this.O0;
        Bitmap bitmap = this.Q0;
        if (weakReference == null || weakReference.get() != bitmap) {
            this.R0 = new WeakReference(bitmap);
            if (bitmap != null) {
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
                this.Y = true;
            }
        }
        if (this.Y && (shader = paint.getShader()) != null) {
            shader.setLocalMatrix(this.I0);
            this.Y = false;
        }
        paint.setFilterBitmap(this.L0);
        int iSave = canvas.save();
        canvas.concat(this.F0);
        boolean z = this.S0;
        Path path = this.X;
        if (z || this.T0 == null) {
            canvas.drawPath(path, paint);
        } else {
            int iSave2 = canvas.save();
            canvas.clipRect(this.T0);
            canvas.drawPath(path, paint);
            canvas.restoreToCount(iSave2);
        }
        float f = this.o;
        if (f > 0.0f) {
            Paint paint2 = this.P0;
            paint2.setStrokeWidth(f);
            paint2.setColor(m6d.z(this.Z, paint.getAlpha()));
            canvas.drawPath(this.s0, paint2);
        }
        canvas.restoreToCount(iSave);
        if (f46.W()) {
            f46.A();
        }
    }

    @Override // defpackage.tnc
    public final void f() {
        super.f();
        if (this.S0) {
            return;
        }
        if (this.T0 == null) {
            this.T0 = new RectF();
        }
        this.I0.mapRect(this.T0, this.y0);
    }

    @Override // defpackage.tnc, defpackage.nnc
    public final void g() {
        this.S0 = false;
    }

    public final boolean h() {
        return (this.b || this.c || this.o > 0.0f) && this.Q0 != null;
    }

    @Override // defpackage.tnc, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        super.setAlpha(i);
        Paint paint = this.O0;
        if (i != paint.getAlpha()) {
            paint.setAlpha(i);
            super.setAlpha(i);
            invalidateSelf();
        }
    }

    @Override // defpackage.tnc, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
        this.O0.setColorFilter(colorFilter);
    }
}
