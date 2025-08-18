package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;

/* loaded from: classes2.dex */
public final class a6d extends Drawable {
    public final int a;
    public final TextPaint b;
    public final Drawable c;
    public final String d;
    public StaticLayout e;
    public final int f;
    public final int g;

    public a6d(Context context, int i) {
        this.a = i;
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(context.getResources().getDimension(fpc.a));
        textPaint.setTypeface(Typeface.DEFAULT);
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setAntiAlias(true);
        khe kheVar = sme.a0;
        textPaint.setColor(fm9.R(context).t);
        this.b = textPaint;
        Drawable drawableB = kt3.b(context, gpc.g0);
        drawableB.setTint(-1);
        this.c = drawableB;
        this.d = context.getString(jpc.N2);
        this.f = (i / 2) + tu0.G(8 * context.getResources().getDisplayMetrics().density);
        this.g = tu0.G(32 * context.getResources().getDisplayMetrics().density);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        StaticLayout staticLayout = this.e;
        if (staticLayout == null) {
            return;
        }
        Drawable drawable = this.c;
        if (!drawable.getBounds().isEmpty()) {
            drawable.draw(canvas);
        }
        canvas.save();
        canvas.translate(getBounds().width() / 2.0f, ((drawable.getIntrinsicHeight() + (getBounds().height() - staticLayout.getHeight())) + this.f) / 2.0f);
        staticLayout.draw(canvas);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        if (rect.isEmpty()) {
            return;
        }
        if (this.e == null) {
            String str = this.d;
            int length = str.length();
            TextPaint textPaint = this.b;
            int iWidth = rect.width() - this.g;
            if (iWidth < 0) {
                iWidth = 0;
            }
            this.e = StaticLayout.Builder.obtain(str, 0, length, textPaint, iWidth).setAlignment(Layout.Alignment.ALIGN_NORMAL).build();
        }
        StaticLayout staticLayout = this.e;
        if (staticLayout == null) {
            throw new IllegalStateException("Text layout has null value");
        }
        int iWidth2 = rect.width();
        Drawable drawable = this.c;
        int intrinsicWidth = (iWidth2 - drawable.getIntrinsicWidth()) / 2;
        int i = this.a;
        int i2 = intrinsicWidth - (i / 2);
        int iHeight = ((rect.height() - drawable.getIntrinsicHeight()) - staticLayout.getHeight()) / 2;
        int i3 = this.f;
        int i4 = (iHeight - i3) - (i / 2);
        int intrinsicWidth2 = (i / 2) + ((drawable.getIntrinsicWidth() + rect.width()) / 2);
        int intrinsicHeight = (i / 2) + ((((drawable.getIntrinsicHeight() + rect.height()) - staticLayout.getHeight()) / 2) - i3);
        if (i2 >= intrinsicWidth2 || i4 >= intrinsicHeight) {
            return;
        }
        drawable.setBounds(i2, i4, intrinsicWidth2, intrinsicHeight);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.b.setAlpha(i);
        this.c.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.b.setColorFilter(colorFilter);
        this.c.setColorFilter(colorFilter);
    }
}
