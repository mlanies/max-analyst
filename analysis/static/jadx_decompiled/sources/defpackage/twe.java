package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public final class twe extends Drawable implements kre {
    public final Path X;
    public final Paint Y;
    public final k56 a;
    public final int b;
    public final int c;
    public final ShapeDrawable o;

    public twe(int i, int i2, k56 k56Var) {
        this.a = k56Var;
        this.b = i;
        this.c = i2;
        float[] fArr = new float[8];
        for (int i3 = 0; i3 < 8; i3++) {
            fArr[i3] = fk4.d().getDisplayMetrics().density * 12.0f;
        }
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, null, null));
        shapeDrawable.getPaint().setColor(((Number) this.a.invoke()).intValue());
        this.o = shapeDrawable;
        this.X = new Path();
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(((Number) this.a.invoke()).intValue());
        this.Y = paint;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        this.o.draw(canvas);
        canvas.drawPath(this.X, this.Y);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        float fG;
        float fG2;
        super.onBoundsChange(rect);
        Rect rect2 = new Rect(rect.left, rect.top, rect.right, rect.bottom);
        int i = this.b;
        int iS = au1.s(i);
        if (iS == 0) {
            rect2.top = rh4.c(8, fk4.d().getDisplayMetrics().density, rect.top);
        } else {
            if (iS != 1) {
                throw new NoWhenBranchMatchedException();
            }
            rect2.bottom = rh4.q(8, fk4.d().getDisplayMetrics().density, rect.bottom);
        }
        this.o.setBounds(rect2);
        Path path = this.X;
        path.reset();
        int iS2 = au1.s(i);
        int i2 = this.c;
        if (iS2 == 0) {
            int iG = tu0.G(16 * fk4.d().getDisplayMetrics().density);
            int iG2 = tu0.G(8 * fk4.d().getDisplayMetrics().density);
            int iS3 = au1.s(i2);
            if (iS3 == 0) {
                fG = (iG / 2.0f) + tu0.G(10 * fk4.d().getDisplayMetrics().density);
            } else if (iS3 == 1) {
                fG = rect.width() / 2.0f;
            } else {
                if (iS3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                fG = (rect.width() - (iG / 2.0f)) - tu0.G(10 * fk4.d().getDisplayMetrics().density);
            }
            float f = fG;
            float f2 = iG / 2.0f;
            float f3 = rect.top + iG2;
            path.moveTo(f + f2, f3);
            float f4 = rect.top;
            path.cubicTo(f, f4, f, f4, f - f2, f3);
            return;
        }
        if (iS2 != 1) {
            throw new NoWhenBranchMatchedException();
        }
        int iG3 = tu0.G(16 * fk4.d().getDisplayMetrics().density);
        int iG4 = tu0.G(8 * fk4.d().getDisplayMetrics().density);
        int iS4 = au1.s(i2);
        if (iS4 == 0) {
            fG2 = (iG3 / 2.0f) + tu0.G(10 * fk4.d().getDisplayMetrics().density);
        } else if (iS4 == 1) {
            fG2 = rect.width() / 2.0f;
        } else {
            if (iS4 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            fG2 = (rect.width() - (iG3 / 2.0f)) - tu0.G(10 * fk4.d().getDisplayMetrics().density);
        }
        float f5 = fG2;
        float f6 = iG3 / 2.0f;
        float f7 = rect.bottom - iG4;
        path.moveTo(f5 - f6, f7);
        float f8 = rect.bottom;
        path.cubicTo(f5, f8, f5, f8, f5 + f6, f7);
    }

    @Override // defpackage.kre
    public final void onThemeChanged(fka fkaVar) {
        Paint paint = this.o.getPaint();
        k56 k56Var = this.a;
        paint.setColor(((Number) k56Var.invoke()).intValue());
        this.Y.setColor(((Number) k56Var.invoke()).intValue());
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
