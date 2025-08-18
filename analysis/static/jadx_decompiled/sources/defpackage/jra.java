package defpackage;

import android.content.Context;
import android.media.MediaRecorder;
import java.lang.reflect.Field;
import org.webrtc.CameraVideoCapturer;
import org.webrtc.CapturerObserver;
import org.webrtc.SurfaceTextureHelper;
import org.webrtc.VideoSink;
import org.webrtc.YuvConverter;

/* loaded from: classes2.dex */
public final class jra implements CameraVideoCapturer {
    public SurfaceTextureHelper X;
    public volatile VideoSink Y;
    public final CameraVideoCapturer a;
    public final qx1 b;
    public final a4c c;
    public YuvConverter o;

    public jra(CameraVideoCapturer cameraVideoCapturer, qx1 qx1Var, a4c a4cVar) {
        this.a = cameraVideoCapturer;
        this.b = qx1Var;
        this.c = a4cVar;
    }

    @Override // org.webrtc.CameraVideoCapturer
    public final void addMediaRecorderToCamera(MediaRecorder mediaRecorder, CameraVideoCapturer.MediaRecorderHandler mediaRecorderHandler) {
        this.c.log("PatchedVideoCapturer", "addMediaRecorderToCamera");
    }

    @Override // org.webrtc.VideoCapturer
    public final void changeCaptureFormat(int i, int i2, int i3) {
        this.a.changeCaptureFormat(i, i2, i3);
    }

    @Override // org.webrtc.VideoCapturer
    public final void dispose() {
        this.a.dispose();
    }

    @Override // org.webrtc.VideoCapturer
    public final void initialize(SurfaceTextureHelper surfaceTextureHelper, Context context, CapturerObserver capturerObserver) throws NoSuchFieldException, SecurityException {
        a4c a4cVar = this.c;
        a4cVar.log("PatchedVideoCapturer", "initialize");
        if (this.X != null) {
            throw new IllegalStateException("Repeated initialization".toString());
        }
        this.X = surfaceTextureHelper;
        try {
            Field declaredField = SurfaceTextureHelper.class.getDeclaredField("yuvConverter");
            declaredField.setAccessible(true);
            this.o = (YuvConverter) declaredField.get(surfaceTextureHelper);
        } catch (IllegalAccessException e) {
            a4cVar.logException("PatchedVideoCapturer", "Cant get yuv converter", e);
        } catch (NoSuchFieldException e2) {
            a4cVar.logException("PatchedVideoCapturer", "Cant get yuv converter", e2);
        }
        this.a.initialize(surfaceTextureHelper, context, new va8(this, capturerObserver, false, 28));
    }

    @Override // org.webrtc.VideoCapturer
    public final boolean isScreencast() {
        this.c.log("PatchedVideoCapturer", "isScreencast");
        return this.a.isScreencast();
    }

    @Override // org.webrtc.CameraVideoCapturer
    public final void removeMediaRecorderFromCamera(CameraVideoCapturer.MediaRecorderHandler mediaRecorderHandler) {
        this.c.log("PatchedVideoCapturer", "removeMediaRecorderFromCamera");
    }

    @Override // org.webrtc.VideoCapturer
    public final void startCapture(int i, int i2, int i3) {
        this.c.log("PatchedVideoCapturer", "startCapture");
        this.a.startCapture(i, i2, i3);
    }

    @Override // org.webrtc.VideoCapturer
    public final void stopCapture() throws InterruptedException {
        this.c.log("PatchedVideoCapturer", "stopCapture");
        this.a.stopCapture();
    }

    @Override // org.webrtc.CameraVideoCapturer
    public final void switchCamera(CameraVideoCapturer.CameraSwitchHandler cameraSwitchHandler) {
        this.c.log("PatchedVideoCapturer", "switchCamera");
        this.a.switchCamera(cameraSwitchHandler);
    }

    @Override // org.webrtc.CameraVideoCapturer
    public final void switchCamera(CameraVideoCapturer.CameraSwitchHandler cameraSwitchHandler, String str) {
        this.c.log("PatchedVideoCapturer", "switchCamera");
        this.a.switchCamera(cameraSwitchHandler, str);
    }
}
