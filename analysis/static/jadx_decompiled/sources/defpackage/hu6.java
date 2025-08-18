package defpackage;

import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.internal.compat.quirk.ImageCapturePixelHDRPlusQuirk;

/* loaded from: classes.dex */
public final class hu6 extends lu1 {
    public static final hu6 c = new hu6(new crd());
    public final crd b;

    public hu6(crd crdVar) {
        this.b = crdVar;
    }

    @Override // defpackage.lu1
    public final void a(o9f o9fVar, u40 u40Var) {
        super.a(o9fVar, u40Var);
        if (!(o9fVar instanceof gu6)) {
            throw new IllegalArgumentException("config is not ImageCaptureConfig");
        }
        gu6 gu6Var = (gu6) o9fVar;
        mi9 mi9VarB = mi9.b();
        aa0 aa0Var = gu6.b;
        if (gu6Var.o(aa0Var)) {
            crd crdVar = this.b;
            int iIntValue = ((Integer) gu6Var.h(aa0Var)).intValue();
            crdVar.getClass();
            if (((ImageCapturePixelHDRPlusQuirk) zi4.a.e(ImageCapturePixelHDRPlusQuirk.class)) != null) {
                if (iIntValue == 0) {
                    CaptureRequest.Key key = CaptureRequest.CONTROL_ENABLE_ZSL;
                    mi9VarB.j(cv1.v0(key), Boolean.TRUE);
                } else if (iIntValue == 1) {
                    CaptureRequest.Key key2 = CaptureRequest.CONTROL_ENABLE_ZSL;
                    mi9VarB.j(cv1.v0(key2), Boolean.FALSE);
                }
            }
        }
        u40Var.c(new cv1(8, wma.a(mi9VarB)));
    }
}
