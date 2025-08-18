package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* loaded from: classes2.dex */
public final class e17 extends Drawable {
    public static final /* synthetic */ bc7[] j = {new oi9(e17.class, "innerDrawable", "getInnerDrawable$message_list_release()Landroid/graphics/drawable/Drawable;"), rh4.g(nec.a, e17.class, "strokeColor", "getStrokeColor$message_list_release()I")};
    public final float a;
    public final float b;
    public final float[] c;
    public final Paint d;
    public final RectF e;
    public final Path f;
    public final Path g;
    public final d17 h;
    public final d17 i;

    public e17(float f, float f2, int i) {
        this.a = f;
        this.b = f2;
        float[] fArr = new float[8];
        for (int i2 = 0; i2 < 8; i2++) {
            fArr[i2] = this.b;
        }
        this.c = fArr;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(i);
        paint.setStrokeWidth(this.a);
        this.d = paint;
        this.e = new RectF();
        this.f = new Path();
        this.g = new Path();
        this.h = new d17(this);
        this.i = new d17(Integer.valueOf(i), this);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int iSave = canvas.save();
        try {
            canvas.drawPath(this.f, this.d);
            bc7 bc7Var = j[0];
            Drawable drawable = (Drawable) this.h.b;
            if (drawable != null) {
                Path path = this.g;
                iSave = canvas.save();
                canvas.clipPath(path);
                try {
                    drawable.draw(canvas);
                    canvas.restoreToCount(iSave);
                } finally {
                    canvas.restoreToCount(iSave);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        if (Build.VERSION.SDK_INT < 30) {
            super.getOutline(outline);
        } else {
            outline.setPath(this.g);
            outline.setAlpha(0.0f);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        float[] fArr;
        Path path = this.f;
        path.reset();
        RectF rectF = this.e;
        float f = rect.left;
        float f2 = this.a / 2.0f;
        rectF.set(f + f2, rect.top + f2, rect.right - f2, rect.bottom - f2);
        float[] fArr2 = new float[8];
        int i = 0;
        while (true) {
            fArr = this.c;
            if (i >= 8) {
                break;
            }
            fArr2[i] = ote.b(fArr[i] - f2, 0.0f);
            i++;
        }
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF, fArr2, direction);
        Path path2 = this.g;
        path2.reset();
        rectF.set(rect);
        path2.addRoundRect(rectF, fArr, direction);
        bc7 bc7Var = j[0];
        Drawable drawable = (Drawable) this.h.b;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.d.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.d.setColorFilter(colorFilter);
    }
}
