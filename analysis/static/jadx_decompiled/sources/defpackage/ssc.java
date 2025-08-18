package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;

/* loaded from: classes.dex */
public final class ssc extends fm9 {
    public static final ssc k = new ssc(0);
    public static final ssc l = new ssc(1);
    public static final ssc m = new ssc(2);
    public static final ssc n = new ssc(3);
    public static final ssc o = new ssc(4);
    public static final ssc p = new ssc(5);
    public static final ssc q = new ssc(6);
    public static final ssc r = new ssc(7);
    public static final ssc s = new ssc(8);
    public final /* synthetic */ int j;

    public /* synthetic */ ssc(int i) {
        this.j = i;
    }

    @Override // defpackage.fm9
    public final void E(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
        float fWidth;
        float f5;
        float fMax;
        float fMax2;
        switch (this.j) {
            case 0:
                matrix.setTranslate((int) (((rect.width() - i) * 0.5f) + rect.left + 0.5f), (int) (((rect.height() - i2) * 0.5f) + rect.top + 0.5f));
                break;
            case 1:
                if (f4 > f3) {
                    fWidth = ((rect.width() - (i * f4)) * 0.5f) + rect.left;
                    f5 = rect.top;
                    f3 = f4;
                } else {
                    float f6 = rect.left;
                    float fHeight = ((rect.height() - (i2 * f3)) * 0.5f) + rect.top;
                    fWidth = f6;
                    f5 = fHeight;
                }
                matrix.setScale(f3, f3);
                matrix.postTranslate((int) (fWidth + 0.5f), (int) (f5 + 0.5f));
                break;
            case 2:
                float fMin = Math.min(Math.min(f3, f4), 1.0f);
                float fWidth2 = ((rect.width() - (i * fMin)) * 0.5f) + rect.left;
                float fHeight2 = ((rect.height() - (i2 * fMin)) * 0.5f) + rect.top;
                matrix.setScale(fMin, fMin);
                matrix.postTranslate((int) (fWidth2 + 0.5f), (int) (fHeight2 + 0.5f));
                break;
            case 3:
                float fMin2 = Math.min(f3, f4);
                float f7 = rect.left;
                float fHeight3 = (rect.height() - (i2 * fMin2)) + rect.top;
                matrix.setScale(fMin2, fMin2);
                matrix.postTranslate((int) (f7 + 0.5f), (int) (fHeight3 + 0.5f));
                break;
            case 4:
                float fMin3 = Math.min(f3, f4);
                float fWidth3 = ((rect.width() - (i * fMin3)) * 0.5f) + rect.left;
                float fHeight4 = ((rect.height() - (i2 * fMin3)) * 0.5f) + rect.top;
                matrix.setScale(fMin3, fMin3);
                matrix.postTranslate((int) (fWidth3 + 0.5f), (int) (fHeight4 + 0.5f));
                break;
            case 5:
                float fMin4 = Math.min(f3, f4);
                float fWidth4 = (rect.width() - (i * fMin4)) + rect.left;
                float fHeight5 = (rect.height() - (i2 * fMin4)) + rect.top;
                matrix.setScale(fMin4, fMin4);
                matrix.postTranslate((int) (fWidth4 + 0.5f), (int) (fHeight5 + 0.5f));
                break;
            case 6:
                float fMin5 = Math.min(f3, f4);
                float f8 = rect.left;
                float f9 = rect.top;
                matrix.setScale(fMin5, fMin5);
                matrix.postTranslate((int) (f8 + 0.5f), (int) (f9 + 0.5f));
                break;
            case 7:
                float f10 = rect.left;
                float f11 = rect.top;
                matrix.setScale(f3, f4);
                matrix.postTranslate((int) (f10 + 0.5f), (int) (f11 + 0.5f));
                break;
            default:
                if (f4 > f3) {
                    float f12 = i * f4;
                    fMax = Math.max(Math.min((rect.width() * 0.5f) - (f * f12), 0.0f), rect.width() - f12) + rect.left;
                    fMax2 = rect.top;
                    f3 = f4;
                } else {
                    fMax = rect.left;
                    float f13 = i2 * f3;
                    fMax2 = Math.max(Math.min((rect.height() * 0.5f) - (f2 * f13), 0.0f), rect.height() - f13) + rect.top;
                }
                matrix.setScale(f3, f3);
                matrix.postTranslate((int) (fMax + 0.5f), (int) (fMax2 + 0.5f));
                break;
        }
    }

    public final String toString() {
        switch (this.j) {
            case 0:
                return "center";
            case 1:
                return "center_crop";
            case 2:
                return "center_inside";
            case 3:
                return "fit_bottom_start";
            case 4:
                return "fit_center";
            case 5:
                return "fit_end";
            case 6:
                return "fit_start";
            case 7:
                return "fit_xy";
            default:
                return "focus_crop";
        }
    }
}
