package defpackage;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class umc extends g06 implements hqf {
    public Drawable X;
    public iqf Y;

    @Override // defpackage.g06, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (isVisible()) {
            iqf iqfVar = this.Y;
            if (iqfVar != null) {
                iqfVar.onDraw();
            }
            super.draw(canvas);
            Drawable drawable = this.X;
            if (drawable != null) {
                drawable.setBounds(getBounds());
                this.X.draw(canvas);
            }
        }
    }

    @Override // defpackage.g06, android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return -1;
    }

    @Override // defpackage.g06, android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return -1;
    }

    @Override // defpackage.g06, android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        iqf iqfVar = this.Y;
        if (iqfVar != null) {
            iqfVar.a(z);
        }
        return super.setVisible(z, z2);
    }
}
