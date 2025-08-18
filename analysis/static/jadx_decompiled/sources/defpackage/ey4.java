package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.style.ReplacementSpan;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class ey4 extends ReplacementSpan implements dvd {
    public final Drawable Y;
    public int a;
    public int b;
    public Rect c;
    public final Paint.FontMetricsInt o = new Paint.FontMetricsInt();
    public final int X = 2;

    public ey4(Drawable drawable) {
        this.Y = drawable;
        Rect bounds = drawable.getBounds();
        this.c = bounds;
        this.a = bounds.width();
        this.b = this.c.height();
    }

    public final int a(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        Rect bounds = this.Y.getBounds();
        this.c = bounds;
        this.a = bounds.width();
        int iHeight = this.c.height();
        this.b = iHeight;
        if (fontMetricsInt == null) {
            return this.a;
        }
        Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
        int i3 = fontMetricsInt2.ascent;
        fontMetricsInt.ascent = i3;
        int i4 = fontMetricsInt2.descent;
        fontMetricsInt.descent = i4;
        fontMetricsInt.leading = fontMetricsInt2.leading;
        int i5 = this.X;
        if (i5 == 0) {
            int i6 = i4 - iHeight;
            if (i3 > i6) {
                fontMetricsInt.ascent = i6;
            }
        } else if (i5 != 2) {
            int i7 = -iHeight;
            if (i3 > i7) {
                fontMetricsInt.ascent = i7;
            }
        } else {
            int i8 = i4 - i3;
            if (i8 < iHeight) {
                int i9 = i3 - ((iHeight - i8) / 2);
                fontMetricsInt.ascent = i9;
                fontMetricsInt.descent = i9 + iHeight;
            }
        }
        fontMetricsInt.top = Math.min(fontMetricsInt2.top, fontMetricsInt.ascent);
        fontMetricsInt.bottom = Math.max(fontMetricsInt2.bottom, fontMetricsInt.descent);
        return this.a;
    }

    @Override // defpackage.dvd
    public final Drawable b() {
        return this.Y;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        int i6;
        Paint.FontMetricsInt fontMetricsInt = this.o;
        paint.getFontMetricsInt(fontMetricsInt);
        int i7 = this.b;
        int i8 = this.X;
        if (i8 == 0) {
            i6 = fontMetricsInt.descent - i7;
        } else if (i8 != 2) {
            i6 = -i7;
        } else {
            int i9 = fontMetricsInt.descent;
            int i10 = fontMetricsInt.ascent;
            i6 = i10 + (((i9 - i10) - i7) / 2);
        }
        canvas.translate(f, i4 + i6);
        this.Y.draw(canvas);
        canvas.translate(-f, -r7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ey4)) {
            return false;
        }
        ey4 ey4Var = (ey4) obj;
        return this.X == ey4Var.X && Objects.equals(this.c, ey4Var.c) && Objects.equals(this.Y, ey4Var.Y);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        Drawable drawable = this.Y;
        if (drawable instanceof mwd) {
            mwd mwdVar = (mwd) drawable;
            Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
            if (fontMetricsInt2 == null) {
                fontMetricsInt2 = fontMetricsInt;
            }
            Paint paint2 = mwd.d;
            mwdVar.getClass();
            if (fontMetricsInt2 != null) {
                int iAbs = Math.abs(fontMetricsInt2.ascent) + Math.abs(fontMetricsInt2.descent);
                if (iAbs > 0) {
                    nwd nwdVar = mwdVar.a;
                    if (nwdVar.b != iAbs) {
                        nwdVar.b = iAbs;
                        mwdVar.setBounds(0, 0, iAbs, iAbs);
                        mwdVar.a();
                        mwdVar.invalidateSelf();
                    }
                }
            }
        }
        return a(paint, charSequence, i, i2, fontMetricsInt);
    }

    public final int hashCode() {
        return Objects.hash(this.c, Integer.valueOf(this.X), this.Y);
    }
}
