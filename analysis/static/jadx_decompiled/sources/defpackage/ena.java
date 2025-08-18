package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class ena extends g06 {
    public final Matrix X;
    public final int Y;
    public final int Z;
    public final Matrix s0;
    public final RectF t0;

    public ena(BitmapDrawable bitmapDrawable, int i, int i2) {
        super(bitmapDrawable);
        this.X = new Matrix();
        this.Y = i - (i % 90);
        this.Z = (i2 < 0 || i2 > 8) ? 0 : i2;
        this.s0 = new Matrix();
        this.t0 = new RectF();
    }

    @Override // defpackage.g06, defpackage.b1f
    public final void d(Matrix matrix) {
        n(matrix);
        Matrix matrix2 = this.X;
        if (matrix2.isIdentity()) {
            return;
        }
        matrix.preConcat(matrix2);
    }

    @Override // defpackage.g06, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i;
        if (this.Y <= 0 && ((i = this.Z) == 0 || i == 1)) {
            super.draw(canvas);
            return;
        }
        int iSave = canvas.save();
        canvas.concat(this.X);
        super.draw(canvas);
        canvas.restoreToCount(iSave);
    }

    @Override // defpackage.g06, android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        int i = this.Z;
        return (i == 5 || i == 7 || this.Y % 180 != 0) ? super.getIntrinsicWidth() : super.getIntrinsicHeight();
    }

    @Override // defpackage.g06, android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        int i = this.Z;
        return (i == 5 || i == 7 || this.Y % 180 != 0) ? super.getIntrinsicHeight() : super.getIntrinsicWidth();
    }

    @Override // defpackage.g06, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.a;
        if (drawable == null) {
            return;
        }
        int i = this.Z;
        int i2 = this.Y;
        if (i2 <= 0 && (i == 0 || i == 1)) {
            drawable.setBounds(rect);
            return;
        }
        Matrix matrix = this.X;
        if (i == 2) {
            matrix.setScale(-1.0f, 1.0f);
        } else if (i == 7) {
            matrix.setRotate(270.0f, rect.centerX(), rect.centerY());
            matrix.postScale(-1.0f, 1.0f);
        } else if (i == 4) {
            matrix.setScale(1.0f, -1.0f);
        } else if (i != 5) {
            matrix.setRotate(i2, rect.centerX(), rect.centerY());
        } else {
            matrix.setRotate(270.0f, rect.centerX(), rect.centerY());
            matrix.postScale(1.0f, -1.0f);
        }
        Matrix matrix2 = this.s0;
        matrix2.reset();
        matrix.invert(matrix2);
        RectF rectF = this.t0;
        rectF.set(rect);
        matrix2.mapRect(rectF);
        drawable.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
    }
}
