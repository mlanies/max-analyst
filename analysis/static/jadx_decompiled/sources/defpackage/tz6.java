package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.provider.Settings;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class tz6 extends jq4 {
    public final wq4 w0;
    public dle x0;
    public Drawable y0;

    public tz6(Context context, tj0 tj0Var, wq4 wq4Var, dle dleVar) {
        super(context, tj0Var);
        this.w0 = wq4Var;
        this.x0 = dleVar;
        dleVar.b = this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable;
        Rect rect = new Rect();
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
            boolean z = this.c != null && Settings.Global.getFloat(this.a.getContentResolver(), "animator_duration_scale", 1.0f) == 0.0f;
            tj0 tj0Var = this.b;
            if (z && (drawable = this.y0) != null) {
                drawable.setBounds(getBounds());
                aq4.g(this.y0, tj0Var.c[0]);
                this.y0.draw(canvas);
                return;
            }
            canvas.save();
            wq4 wq4Var = this.w0;
            Rect bounds = getBounds();
            float fB = b();
            ValueAnimator valueAnimator = this.o;
            boolean z2 = valueAnimator != null && valueAnimator.isRunning();
            ValueAnimator valueAnimator2 = this.X;
            boolean z3 = valueAnimator2 != null && valueAnimator2.isRunning();
            wq4Var.a.a();
            wq4Var.a(canvas, bounds, fB, z2, z3);
            int i = tj0Var.g;
            int i2 = this.u0;
            Paint paint = this.t0;
            if (i == 0) {
                this.w0.d(canvas, paint, 0.0f, 1.0f, tj0Var.d, i2, 0);
            } else {
                vq4 vq4Var = (vq4) ((ArrayList) this.x0.c).get(0);
                vq4 vq4Var2 = (vq4) wg0.f((ArrayList) this.x0.c, 1);
                wq4 wq4Var2 = this.w0;
                if (wq4Var2 instanceof nh7) {
                    wq4Var2.d(canvas, paint, 0.0f, vq4Var.a, tj0Var.d, i2, i);
                    this.w0.d(canvas, paint, vq4Var2.b, 1.0f, tj0Var.d, i2, i);
                } else {
                    i2 = 0;
                    wq4Var2.d(canvas, paint, vq4Var2.b, vq4Var.a + 1.0f, tj0Var.d, 0, i);
                }
            }
            for (int i3 = 0; i3 < ((ArrayList) this.x0.c).size(); i3++) {
                vq4 vq4Var3 = (vq4) ((ArrayList) this.x0.c).get(i3);
                this.w0.c(canvas, paint, vq4Var3, this.u0);
                if (i3 > 0 && i > 0) {
                    this.w0.d(canvas, paint, ((vq4) ((ArrayList) this.x0.c).get(i3 - 1)).b, vq4Var3.a, tj0Var.d, i2, i);
                }
            }
            canvas.restore();
        }
    }

    @Override // defpackage.jq4
    public final boolean e(boolean z, boolean z2, boolean z3) {
        Drawable drawable;
        boolean zE = super.e(z, z2, z3);
        if (this.c != null && Settings.Global.getFloat(this.a.getContentResolver(), "animator_duration_scale", 1.0f) == 0.0f && (drawable = this.y0) != null) {
            return drawable.setVisible(z, z2);
        }
        if (!isRunning()) {
            this.x0.x();
        }
        if (z && z3) {
            this.x0.e0();
        }
        return zE;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.w0.e();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.w0.f();
    }
}
