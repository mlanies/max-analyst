package defpackage;

import android.hardware.camera2.CameraManager;

/* loaded from: classes.dex */
public final class yt1 extends CameraManager.AvailabilityCallback implements tx1 {
    public final String a;
    public boolean b = true;
    public final /* synthetic */ fu1 c;

    public yt1(fu1 fu1Var, String str) {
        this.c = fu1Var;
        this.a = str;
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final void onCameraAvailable(String str) {
        if (this.a.equals(str)) {
            this.b = true;
            if (this.c.S0 == 4) {
                this.c.J(false);
            }
        }
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final void onCameraUnavailable(String str) {
        if (this.a.equals(str)) {
            this.b = false;
        }
    }
}
