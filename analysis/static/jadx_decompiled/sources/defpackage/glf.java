package defpackage;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;

/* loaded from: classes2.dex */
public final class glf extends g06 {
    public static final Typeface v0 = Typeface.create("sans-serif-medium", 0);
    public bk4 X;
    public String Y;
    public Paint Z;
    public Paint s0;
    public RectF t0;
    public Path u0;

    /* JADX WARN: Removed duplicated region for block: B:4:0x000f  */
    @Override // defpackage.g06, android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void draw(android.graphics.Canvas r6) {
        /*
            r5 = this;
            android.graphics.drawable.Drawable r0 = r5.a
            int r1 = r5.getIntrinsicWidth()
            java.lang.String r2 = r5.Y
            boolean r2 = defpackage.oag.t(r2)
            r3 = 0
            if (r2 == 0) goto L11
        Lf:
            r2 = r3
            goto L2e
        L11:
            java.lang.String r2 = r5.Y
            boolean r2 = defpackage.oag.t(r2)
            if (r2 == 0) goto L1b
            r2 = r3
            goto L24
        L1b:
            android.graphics.Paint r2 = r5.Z
            java.lang.String r4 = r5.Y
            float r2 = r2.measureText(r4)
            int r2 = (int) r2
        L24:
            int r4 = super.getIntrinsicWidth()
            int r4 = r4 / 2
            int r2 = r2 - r4
            if (r2 >= 0) goto L2e
            goto Lf
        L2e:
            int r1 = r1 - r2
            int r2 = r5.getIntrinsicHeight()
            r0.setBounds(r3, r3, r1, r2)
            java.lang.String r0 = r5.Y
            boolean r0 = defpackage.oag.t(r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L4a
            r6.save()
            android.graphics.Path r1 = r5.u0
            android.graphics.Region$Op r2 = android.graphics.Region.Op.DIFFERENCE
            r6.clipPath(r1, r2)
        L4a:
            android.graphics.drawable.Drawable r1 = r5.a
            r1.draw(r6)
            if (r0 == 0) goto L73
            r6.restore()
            android.graphics.RectF r0 = r5.t0
            bk4 r1 = r5.X
            int r2 = r1.b
            float r2 = (float) r2
            android.graphics.Paint r3 = r5.s0
            r6.drawRoundRect(r0, r2, r2, r3)
            java.lang.String r2 = r5.Y
            float r3 = r0.left
            int r4 = r1.a
            float r4 = (float) r4
            float r3 = r3 + r4
            float r0 = r0.bottom
            int r1 = r1.c
            float r1 = (float) r1
            float r0 = r0 - r1
            android.graphics.Paint r5 = r5.Z
            r6.drawText(r2, r3, r0, r5)
        L73:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.glf.draw(android.graphics.Canvas):void");
    }

    @Override // defpackage.g06, android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        int intrinsicWidth = super.getIntrinsicWidth();
        int i = 0;
        if (!oag.t(this.Y)) {
            int iMeasureText = (oag.t(this.Y) ? 0 : (int) this.Z.measureText(this.Y)) - (super.getIntrinsicWidth() / 2);
            if (iMeasureText >= 0) {
                i = iMeasureText;
            }
        }
        return i + intrinsicWidth;
    }
}
