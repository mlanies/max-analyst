package org.webrtc;

import android.os.SystemClock;
import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;
import org.webrtc.VideoFrame;

/* loaded from: classes2.dex */
public class VpxDecoderWrapper {
    private VideoSink decodedFrameSink;
    private long decoder = nativeCreate();
    private int desiredFps;
    private ErrorCallback errorCallback;
    private long lastFrameTimeNs;
    private long timeBetweenFramesNs;

    public enum DecoderKind {
        VP8((byte) 0),
        VP9((byte) 1);

        private final byte nativeKind;

        DecoderKind(byte b) {
            this.nativeKind = b;
        }
    }

    public interface ErrorCallback {
        void onDecodeError(int i);
    }

    private static native long nativeCreate();

    private static native int nativeDecode(long j);

    private static native VideoFrame.Buffer nativeGetDecodedImage(long j);

    private static native long nativeImgHeight(long j);

    private static native long nativeImgWidth(long j);

    private static native void nativeInit(long j, byte b);

    private static native void nativeRelease(long j);

    private static native void nativeSetData(long j, ByteBuffer byteBuffer, long j2);

    public void close() {
        long j = this.decoder;
        if (j != 0) {
            nativeRelease(j);
        }
        this.decoder = 0L;
    }

    public void decode(ByteBuffer byteBuffer) {
        nativeSetData(this.decoder, byteBuffer.slice(), r7.remaining());
        int iNativeDecode = nativeDecode(this.decoder);
        if (iNativeDecode != 0) {
            Logging.w("VpxDecoderWrap", "decode returned " + iNativeDecode);
            this.errorCallback.onDecodeError(iNativeDecode);
        }
        while (true) {
            long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            if (jElapsedRealtimeNanos < this.lastFrameTimeNs + this.timeBetweenFramesNs) {
                return;
            }
            this.lastFrameTimeNs = jElapsedRealtimeNanos;
            VideoFrame.Buffer bufferNativeGetDecodedImage = nativeGetDecodedImage(this.decoder);
            if (bufferNativeGetDecodedImage == null) {
                return;
            }
            VideoSink videoSink = this.decodedFrameSink;
            if (videoSink != null) {
                videoSink.onFrame(new VideoFrame(bufferNativeGetDecodedImage, 0, System.nanoTime()));
            }
            bufferNativeGetDecodedImage.release();
        }
    }

    public void init(DecoderKind decoderKind) {
        nativeInit(this.decoder, decoderKind.nativeKind);
    }

    public long lastDecodedHeight() {
        return nativeImgHeight(this.decoder);
    }

    public long lastDecodedWidth() {
        return nativeImgWidth(this.decoder);
    }

    public void setDesiredFps(int i) {
        this.desiredFps = i;
        this.timeBetweenFramesNs = i > 0 ? TimeUnit.SECONDS.toNanos(1L) / i : 0L;
    }

    public void setErrorCallback(ErrorCallback errorCallback) {
        this.errorCallback = errorCallback;
    }

    public void setFrameHandler(VideoSink videoSink) {
        this.decodedFrameSink = videoSink;
    }
}
