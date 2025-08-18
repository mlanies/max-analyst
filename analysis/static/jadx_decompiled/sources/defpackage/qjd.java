package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Rect;

/* loaded from: classes2.dex */
public abstract class qjd {
    public static final bo0 a = new bo0(10, 3);
    public static final Matrix b = new Matrix();

    public static final void a(Path path, Rect rect) {
        if (rect == null || rect.isEmpty()) {
            path.reset();
            return;
        }
        Matrix matrix = new Matrix();
        int iMin = Math.min(rect.width(), rect.height()) / 2;
        Path pathB = (Path) a.c(new qwd(iMin));
        if (pathB == null) {
            pathB = b(iMin, 4.0d);
        }
        path.set(pathB);
        float f = iMin;
        matrix.setTranslate(rect.left + ((rect.width() / 2.0f) - f), rect.top + ((rect.height() / 2.0f) - f));
        path.transform(matrix);
    }

    public static final Path b(int i, double d) {
        double d2;
        double d3;
        Path path = new Path();
        if (i <= 0) {
            return path;
        }
        double d4 = i;
        double dPow = Math.pow(d4, d);
        float f = i;
        path.moveTo(-f, 0.0f);
        double d5 = -d4;
        boolean z = false;
        while (true) {
            double dPow2 = dPow - Math.pow(Math.abs(d5), d);
            double d6 = 1.0d;
            double d7 = d5;
            d2 = 1.0d / d;
            d3 = d4;
            path.lineTo((float) d7, (float) (Math.pow(Math.abs(dPow2), d2) * Math.signum(dPow2)));
            if (z) {
                break;
            }
            double d8 = d3 / 80;
            if (d8 < 0.2d) {
                d6 = 0.2d;
            } else if (d8 <= 1.0d) {
                d6 = d8;
            }
            d5 = d6 + d7;
            if (d5 >= d3) {
                d4 = d3;
                d5 = d4;
                z = true;
            } else {
                d4 = d3;
            }
        }
        double d9 = d3;
        boolean z2 = false;
        while (true) {
            double dPow3 = dPow - Math.pow(Math.abs(d9), d);
            path.lineTo((float) d9, (float) (Math.pow(Math.abs(dPow3), d2) * (-Math.signum(dPow3))));
            if (z2) {
                path.close();
                path.offset(f, f);
                return path;
            }
            double d10 = d3 / 80;
            if (d10 < 0.2d) {
                d10 = 0.2d;
            } else if (d10 > 1.0d) {
                d10 = 1.0d;
            }
            d9 -= d10;
            if (d9 <= (-i)) {
                d9 = d5;
                z2 = true;
            }
        }
    }
}
