package defpackage;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import java.util.Set;

/* loaded from: classes.dex */
public final class fx1 extends ex1 {
    @Override // defpackage.dle
    public final Set G() throws CameraAccessExceptionCompat {
        try {
            return ((CameraManager) this.b).getConcurrentCameraIds();
        } catch (CameraAccessException e) {
            throw CameraAccessExceptionCompat.a(e);
        }
    }
}
