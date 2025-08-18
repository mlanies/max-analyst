package defpackage;

import android.hardware.camera2.CaptureResult;
import java.util.ArrayList;

/* loaded from: classes.dex */
public interface pv1 {
    mv1 A();

    default void b(t55 t55Var) {
        int i;
        int iS = s();
        if (iS == 1) {
            return;
        }
        int iS2 = au1.s(iS);
        if (iS2 == 1) {
            i = 32;
        } else if (iS2 == 2) {
            i = 0;
        } else {
            if (iS2 != 3) {
                if (iS != 1 && iS != 2 && iS != 3 && iS != 4) {
                    throw null;
                }
                return;
            }
            i = 1;
        }
        int i2 = i & 1;
        ArrayList arrayList = t55Var.a;
        if (i2 == 1) {
            t55Var.c("LightSource", String.valueOf(4), arrayList);
        }
        t55Var.c("Flash", String.valueOf(i), arrayList);
    }

    nje c();

    long getTimestamp();

    nv1 r();

    int s();

    lv1 v();

    default CaptureResult y() {
        return null;
    }
}
