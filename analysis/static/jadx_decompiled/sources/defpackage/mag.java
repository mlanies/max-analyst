package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.media.ImageWriter;
import androidx.camera.camera2.internal.compat.quirk.ZslDisablerQuirk;

/* loaded from: classes.dex */
public final class mag {
    public final xv1 a;
    public final nag b;
    public boolean c = false;
    public boolean d = false;
    public final boolean e;
    public final boolean f;
    public hqc g;
    public oz1 h;
    public fw6 i;
    public ImageWriter j;

    public mag(xv1 xv1Var) {
        boolean z;
        this.e = false;
        this.f = false;
        this.a = xv1Var;
        int[] iArr = (int[]) xv1Var.a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        if (iArr != null) {
            for (int i : iArr) {
                if (i == 4) {
                    z = true;
                    break;
                }
            }
            z = false;
        } else {
            z = false;
        }
        this.e = z;
        this.f = zi4.a.e(ZslDisablerQuirk.class) != null;
        this.b = new nag(3, new av1());
    }
}
