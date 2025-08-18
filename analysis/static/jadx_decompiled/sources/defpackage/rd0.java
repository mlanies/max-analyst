package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public final class rd0 extends Drawable implements kre {
    public final Paint X;
    public final je7 Y;
    public final Drawable a;
    public final m5a b;
    public final m56 c;
    public final m56 o;

    public rd0(Drawable drawable, m5a m5aVar, fka fkaVar, m56 m56Var, m56 m56Var2) {
        Paint paint;
        this.a = drawable;
        this.b = m5aVar;
        this.c = m56Var;
        this.o = m56Var2;
        if (m56Var2 != null) {
            paint = new Paint();
            paint.setAntiAlias(true);
            paint.setColor(((Number) m56Var2.invoke(fkaVar)).intValue());
        } else {
            paint = null;
        }
        this.X = paint;
        je7 je7VarR = tu0.r(3, new m(19));
        this.Y = je7VarR;
        if ((m5aVar instanceof l5a) && paint != null) {
            qjd.a((Path) je7VarR.getValue(), getBounds());
        }
        if (m56Var != null) {
            aq4.g(drawable, ((Number) m56Var.invoke(fkaVar)).intValue());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint = this.X;
        if (paint != null) {
            m5a m5aVar = this.b;
            if (m5aVar instanceof j5a) {
                canvas.drawCircle(getBounds().exactCenterX(), getBounds().exactCenterY(), getBounds().width() / 2.0f, paint);
            } else if (m5aVar instanceof l5a) {
                canvas.drawPath((Path) this.Y.getValue(), paint);
            } else if (!tpa.f(m5aVar, k5a.a)) {
                throw new NoWhenBranchMatchedException();
            }
        }
        Drawable drawable = this.a;
        float fWidth = drawable.getBounds().width() / 2.0f;
        float fExactCenterX = getBounds().exactCenterX() - fWidth;
        float fExactCenterY = getBounds().exactCenterY() - fWidth;
        int iSave = canvas.save();
        canvas.translate(fExactCenterX, fExactCenterY);
        try {
            drawable.draw(canvas);
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        m5a m5aVar = this.b;
        boolean z = m5aVar instanceof l5a;
        Drawable drawable = this.a;
        Paint paint = this.X;
        if (z) {
            qjd.a((Path) this.Y.getValue(), rect);
        } else if (m5aVar instanceof k5a) {
            int iMin = Math.min(rect.width(), rect.height());
            if (paint != null) {
                int i = s5a.K0;
                iMin = lz7.o(iMin);
            }
            drawable.setBounds(0, 0, iMin, iMin);
        }
        int iMin2 = Math.min(rect.width(), rect.height());
        if (paint != null) {
            int i2 = s5a.K0;
            iMin2 = lz7.o(iMin2);
        }
        drawable.setBounds(0, 0, iMin2, iMin2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.kre
    public final void onThemeChanged(fka fkaVar) {
        m56 m56Var;
        Paint paint = this.X;
        if (paint != null && (m56Var = this.o) != null) {
            paint.setColor(((Number) m56Var.invoke(fkaVar)).intValue());
        }
        Drawable drawable = this.a;
        m56 m56Var2 = this.c;
        if (m56Var2 != null) {
            aq4.g(drawable, ((Number) m56Var2.invoke(fkaVar)).intValue());
        }
        if (paint == null && m56Var2 == null) {
            kre kreVar = drawable instanceof kre ? (kre) drawable : null;
            if (kreVar != null) {
                kreVar.onThemeChanged(fkaVar);
            }
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
