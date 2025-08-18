package defpackage;

import android.graphics.Canvas;

/* loaded from: classes.dex */
public final class unc extends tnc {
    @Override // defpackage.tnc, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        f46.I();
        if (!this.b && !this.c && this.o <= 0.0f) {
            super.draw(canvas);
            f46.I();
            return;
        }
        f();
        d();
        canvas.clipPath(this.X);
        super.draw(canvas);
        f46.I();
    }
}
