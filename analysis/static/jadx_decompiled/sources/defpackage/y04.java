package defpackage;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class y04 extends q18 {
    public static final /* synthetic */ int K0 = 0;
    public x04 J0;

    public y04(x04 x04Var) {
        super(x04Var);
        this.J0 = x04Var;
    }

    @Override // defpackage.q18
    public final void g(Canvas canvas) {
        if (this.J0.v.isEmpty()) {
            super.g(canvas);
            return;
        }
        canvas.save();
        canvas.clipOutRect(this.J0.v);
        super.g(canvas);
        canvas.restore();
    }

    @Override // defpackage.q18, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.J0 = new x04(this.J0);
        return this;
    }

    public final void r(float f, float f2, float f3, float f4) {
        RectF rectF = this.J0.v;
        if (f == rectF.left && f2 == rectF.top && f3 == rectF.right && f4 == rectF.bottom) {
            return;
        }
        rectF.set(f, f2, f3, f4);
        invalidateSelf();
    }
}
