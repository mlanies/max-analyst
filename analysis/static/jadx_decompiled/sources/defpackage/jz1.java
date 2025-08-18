package defpackage;

import android.hardware.camera2.CameraCaptureSession;

/* loaded from: classes.dex */
public final class jz1 extends iv1 {
    public final CameraCaptureSession.CaptureCallback a;

    public jz1(CameraCaptureSession.CaptureCallback captureCallback) {
        if (captureCallback == null) {
            throw new NullPointerException("captureCallback is null");
        }
        this.a = captureCallback;
    }
}
