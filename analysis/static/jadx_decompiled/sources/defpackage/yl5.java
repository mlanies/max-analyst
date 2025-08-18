package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;
import android.widget.TextView;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public class yl5 extends ImageSpan implements znf, kre {
    public final Rect X;
    public final WeakHashMap Y;
    public final sl5 a;
    public final boolean b;
    public final RectF c;
    public final RectF o;

    public /* synthetic */ yl5(Drawable drawable, sl5 sl5Var, int i) {
        this(drawable, (i & 2) != 0 ? sl5.b : sl5Var, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(TextView textView) {
        WeakHashMap weakHashMap = this.Y;
        weakHashMap.remove(textView);
        if (weakHashMap.isEmpty()) {
            Drawable drawable = getDrawable();
            Animatable animatable = drawable instanceof Animatable ? (Animatable) drawable : null;
            if (animatable != null) {
                animatable.stop();
            }
            drawable.setCallback(null);
        }
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        canvas.save();
        canvas.translate(f, i3);
        canvas.clipRect(this.c);
        getDrawable().draw(canvas);
        canvas.restore();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yl5)) {
            return false;
        }
        yl5 yl5Var = (yl5) obj;
        return this.a == yl5Var.a && tpa.f(getDrawable(), yl5Var.getDrawable());
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        float fWidth;
        float fWidth2;
        float fHeight;
        float fHeight2;
        Drawable drawable = getDrawable();
        RectF rectF = this.c;
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
            float f = fontMetricsInt2.descent - fontMetricsInt2.ascent;
            rectF.set(0.0f, 0.0f, f, f);
            RectF rectF2 = this.o;
            rectF2.set(0.0f, 0.0f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            float fWidth3 = rectF2.width() == -1.0f ? rectF.width() : rectF2.width();
            float fHeight3 = rectF2.height() == -1.0f ? rectF.height() : rectF2.height();
            int i3 = xl5.$EnumSwitchMapping$0[this.a.ordinal()];
            Rect rect = this.X;
            if (i3 == 1) {
                rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
            } else if (i3 == 2) {
                float f2 = fWidth3 / fHeight3;
                if (f2 > 1.0f) {
                    fWidth = rectF.height() * f2;
                    fWidth2 = rectF.height();
                } else {
                    fWidth = rectF.width();
                    fWidth2 = rectF.width() / f2;
                }
                float f3 = 2;
                float fWidth4 = ((rectF.width() - fWidth) / f3) + rectF.left;
                float fHeight4 = ((rectF.height() - fWidth2) / f3) + rectF.top;
                rect.set((int) Math.floor(fWidth4), (int) Math.floor(fHeight4), (int) Math.ceil(fWidth4 + fWidth), (int) Math.ceil(fHeight4 + fWidth2));
            } else if (i3 == 3) {
                float f4 = fWidth3 / fHeight3;
                if (f4 > rectF.width() / rectF.height()) {
                    fHeight2 = rectF.width();
                    fHeight = rectF.width() / f4;
                } else {
                    fHeight = rectF.height();
                    fHeight2 = rectF.height() * f4;
                }
                float f5 = 2;
                float fWidth5 = ((rectF.width() - fHeight2) / f5) + rectF.left;
                float fHeight5 = ((rectF.height() - fHeight) / f5) + rectF.top;
                rect.set((int) Math.floor(fWidth5), (int) Math.floor(fHeight5), (int) Math.ceil(fWidth5 + fHeight2), (int) Math.ceil(fHeight5 + fHeight));
            } else {
                if (i3 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                float f6 = 2;
                float fWidth6 = ((rectF.width() - fWidth3) / f6) + rectF.left;
                float fHeight6 = ((rectF.height() - fHeight3) / f6) + rectF.top;
                rect.set((int) Math.floor(fWidth6), (int) Math.floor(fHeight6), (int) Math.ceil(fWidth6 + fWidth3), (int) Math.ceil(fHeight6 + fHeight3));
            }
            drawable.setBounds(rect);
        }
        return (int) rectF.right;
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + getDrawable().hashCode();
    }

    @Override // defpackage.kre
    public final void onThemeChanged(fka fkaVar) {
        Object drawable = getDrawable();
        kre kreVar = drawable instanceof kre ? (kre) drawable : null;
        if (kreVar != null) {
            kreVar.onThemeChanged(fkaVar);
        }
    }

    public yl5(Drawable drawable, sl5 sl5Var, boolean z) {
        super(drawable);
        this.a = sl5Var;
        this.b = z;
        this.c = new RectF();
        this.o = new RectF();
        this.X = new Rect();
        this.Y = new WeakHashMap();
    }
}
