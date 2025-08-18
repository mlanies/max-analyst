package defpackage;

import android.util.ArrayMap;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;

/* loaded from: classes.dex */
public final class dx1 {
    public final dle a;
    public final ArrayMap b = new ArrayMap(4);

    public dx1(ex1 ex1Var) {
        this.a = ex1Var;
    }

    public final xv1 a(String str) {
        xv1 xv1Var;
        synchronized (this.b) {
            xv1Var = (xv1) this.b.get(str);
            if (xv1Var == null) {
                try {
                    xv1 xv1Var2 = new xv1(this.a.E(str), str);
                    this.b.put(str, xv1Var2);
                    xv1Var = xv1Var2;
                } catch (AssertionError e) {
                    throw new CameraAccessExceptionCompat(e.getMessage(), e);
                }
            }
        }
        return xv1Var;
    }
}
