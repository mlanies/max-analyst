package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public final class od0 extends Drawable {
    public final Drawable a;
    public final m5a b;
    public final Paint c;
    public final je7 d;

    public od0(Drawable drawable, m5a m5aVar, Context context, m56 m56Var, m56 m56Var2) {
        this.a = drawable;
        this.b = m5aVar;
        pq9 pq9Var = qp4.u0;
        aq4.g(drawable, ((Number) m56Var.invoke(pq9Var.b(context).i())).intValue());
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(((Number) m56Var2.invoke(pq9Var.b(context).i())).intValue());
        this.c = paint;
        je7 je7VarR = tu0.r(3, new m(18));
        this.d = je7VarR;
        if (m5aVar instanceof l5a) {
            qjd.a((Path) je7VarR.getValue(), getBounds());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int iMin = Math.min(getBounds().width(), getBounds().height());
        m5a m5aVar = this.b;
        boolean z = m5aVar instanceof j5a;
        Paint paint = this.c;
        if (z) {
            canvas.drawCircle(getBounds().exactCenterX(), getBounds().exactCenterY(), getBounds().width() / 2.0f, paint);
        } else if (m5aVar instanceof l5a) {
            canvas.drawPath((Path) this.d.getValue(), paint);
        } else if (!tpa.f(m5aVar, k5a.a)) {
            throw new NoWhenBranchMatchedException();
        }
        int i = s5a.K0;
        int iO = lz7.o(iMin);
        Drawable drawable = this.a;
        drawable.setBounds(0, 0, iO, iO);
        canvas.save();
        float f = iO / 2.0f;
        canvas.translate(getBounds().exactCenterX() - f, getBounds().exactCenterY() - f);
        drawable.draw(canvas);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        if (this.b instanceof l5a) {
            qjd.a((Path) this.d.getValue(), rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
