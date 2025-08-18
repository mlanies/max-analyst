package defpackage;

import android.content.Context;
import android.graphics.Color;

/* loaded from: classes.dex */
public final class ew4 {
    public static final int f = (int) Math.round(5.1000000000000005d);
    public final boolean a;
    public final int b;
    public final int c;
    public final int d;
    public final float e;

    public ew4(Context context) {
        boolean zE = kq0.E(tsb.elevationOverlayEnabled, context, false);
        int iX = mr0.x(tsb.elevationOverlayColor, 0, context);
        int iX2 = mr0.x(tsb.elevationOverlayAccentColor, 0, context);
        int iX3 = mr0.x(tsb.colorSurface, 0, context);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.a = zE;
        this.b = iX;
        this.c = iX2;
        this.d = iX3;
        this.e = f2;
    }

    public final int a(int i, float f2) {
        int i2;
        if (!this.a || s63.i(i, 255) != this.d) {
            return i;
        }
        float fMin = (this.e <= 0.0f || f2 <= 0.0f) ? 0.0f : Math.min(((((float) Math.log1p(f2 / r1)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int iAlpha = Color.alpha(i);
        int iN = mr0.N(s63.i(i, 255), fMin, this.b);
        if (fMin > 0.0f && (i2 = this.c) != 0) {
            iN = s63.g(s63.i(i2, f), iN);
        }
        return s63.i(iN, iAlpha);
    }
}
