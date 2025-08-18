package defpackage;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class ex1 extends dle {
    @Override // defpackage.dle
    public final CameraCharacteristics E(String str) throws CameraAccessExceptionCompat {
        try {
            return ((CameraManager) this.b).getCameraCharacteristics(str);
        } catch (CameraAccessException e) {
            throw CameraAccessExceptionCompat.a(e);
        }
    }

    @Override // defpackage.dle
    public final void Z(String str, Executor executor, CameraDevice.StateCallback stateCallback) throws CameraAccessException, CameraAccessExceptionCompat {
        try {
            ((CameraManager) this.b).openCamera(str, executor, stateCallback);
        } catch (CameraAccessException e) {
            throw CameraAccessExceptionCompat.a(e);
        }
    }

    @Override // defpackage.dle
    public final void b0(q6d q6dVar, yt1 yt1Var) {
        ((CameraManager) this.b).registerAvailabilityCallback(q6dVar, yt1Var);
    }

    @Override // defpackage.dle
    public final void g0(CameraManager.AvailabilityCallback availabilityCallback) {
        ((CameraManager) this.b).unregisterAvailabilityCallback(availabilityCallback);
    }
}
