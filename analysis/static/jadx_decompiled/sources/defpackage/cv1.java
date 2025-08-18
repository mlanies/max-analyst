package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;

/* loaded from: classes.dex */
public final class cv1 extends re6 {
    public static final aa0 Z = new aa0(Integer.TYPE, null, "camera2.captureRequest.templateType");
    public static final aa0 s0 = new aa0(Long.TYPE, null, "camera2.cameraCaptureSession.streamUseCase");
    public static final aa0 t0 = new aa0(CameraDevice.StateCallback.class, null, "camera2.cameraDevice.stateCallback");
    public static final aa0 u0 = new aa0(CameraCaptureSession.StateCallback.class, null, "camera2.cameraCaptureSession.stateCallback");
    public static final aa0 v0 = new aa0(CameraCaptureSession.CaptureCallback.class, null, "camera2.cameraCaptureSession.captureCallback");
    public static final aa0 w0 = new aa0(String.class, null, "camera2.cameraCaptureSession.physicalCameraId");

    public static aa0 v0(CaptureRequest.Key key) {
        return new aa0(Object.class, key, "camera2.captureRequest.option." + key.getName());
    }
}
