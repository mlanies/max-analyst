package org.webrtc;

import java.util.List;
import org.webrtc.CameraEnumerationAndroid;
import org.webrtc.CameraVideoCapturer;

/* loaded from: classes2.dex */
public interface CameraEnumerator {
    default CameraVideoCapturer createCapturer(String str, CameraVideoCapturer.CameraEventsHandler cameraEventsHandler) {
        return createCapturer(str, cameraEventsHandler, null);
    }

    CameraVideoCapturer createCapturer(String str, CameraVideoCapturer.CameraEventsHandler cameraEventsHandler, CameraVideoCapturer.CaptureFormatHelper captureFormatHelper);

    String[] getDeviceNames();

    List<CameraEnumerationAndroid.CaptureFormat> getSupportedFormats(String str);

    boolean isBackFacing(String str);

    boolean isFrontFacing(String str);
}
