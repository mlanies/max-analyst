package defpackage;

import android.os.SystemClock;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.webrtc.EncodedImage;
import org.webrtc.EncoderCallback;
import org.webrtc.GlUtil;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;
import org.webrtc.VpxEncoderWrapper;

/* loaded from: classes2.dex */
public final class l26 implements EncoderCallback, VideoSink {
    public final dnc X;
    public volatile VpxEncoderWrapper Y;
    public volatile z26 Z;
    public final long a;
    public final long b;
    public final mu3 c;
    public final a4c o;
    public volatile z26 s0;
    public volatile long t0;
    public final cue u0;
    public final cue v0;
    public final AtomicInteger w0;
    public volatile boolean x0;
    public volatile long y0;

    public l26(a4c a4cVar, dnc dncVar) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.a = timeUnit.toMillis(5L);
        this.b = timeUnit.toNanos(1L) / 10;
        this.w0 = new AtomicInteger(0);
        this.o = a4cVar;
        this.X = dncVar;
        this.c = new mu3("SSFrameEncoder");
        this.u0 = new cue();
        this.v0 = new cue();
    }

    public final void a() {
        this.x0 = false;
        VpxEncoderWrapper vpxEncoderWrapper = this.Y;
        if (vpxEncoderWrapper != null) {
            vpxEncoderWrapper.release();
        }
        this.Y = null;
    }

    @Override // org.webrtc.EncoderCallback
    public final void onEncodedImage(EncodedImage encodedImage) {
        this.u0.a();
        EncodedImage.FrameType frameType = encodedImage.frameType;
        EncodedImage.FrameType frameType2 = EncodedImage.FrameType.VideoFrameKey;
        if (frameType == frameType2) {
            this.t0 = SystemClock.elapsedRealtime();
        }
        if (this.Z != null) {
            z26 z26Var = this.Z;
            if (!z26Var.a) {
                encodedImage.release();
                return;
            }
            if (encodedImage.frameType == frameType2) {
                z26Var.h = false;
            }
            z26Var.c.add(encodedImage);
            z26Var.d.addAndGet(encodedImage.buffer.remaining());
            z26.b(z26Var.g);
        }
    }

    @Override // org.webrtc.VideoSink
    public final void onFrame(VideoFrame videoFrame) {
        z26 z26Var = this.s0;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        if (jElapsedRealtimeNanos < this.y0 + this.b) {
            return;
        }
        if ((z26Var == null || (z26Var.c.size() <= 15 && z26Var.d.get() <= 4000000)) && this.w0.get() < 5) {
            try {
                VideoFrame.I420Buffer i420 = videoFrame.getBuffer().toI420();
                float rotation = videoFrame.getRotation() + 360;
                this.X.getClass();
                float f = (rotation + 0.0f) % 360.0f;
                this.o.log("SSFrameEncoder", "rotation angle = " + f);
                VideoFrame videoFrame2 = new VideoFrame(i420, (int) f, videoFrame.getTimestampNs());
                this.y0 = jElapsedRealtimeNanos;
                this.w0.incrementAndGet();
                this.c.c(new v05(this, z26Var, videoFrame2, 6));
            } catch (GlUtil.GlOutOfMemoryException unused) {
                this.o.log("SSFrameEncoder", "gl oom @ toI420, skipping");
            }
        }
    }

    @Override // org.webrtc.EncoderCallback
    public final void onFrameDropped(int i) {
        this.v0.a();
    }
}
