package defpackage;

import android.content.Context;
import android.media.projection.MediaProjection;
import android.os.Handler;
import org.webrtc.CapturerObserver;
import org.webrtc.EglBase;
import org.webrtc.ScreenCapturerAndroid;
import org.webrtc.Size;
import org.webrtc.SurfaceTextureHelper;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;

/* loaded from: classes2.dex */
public final class h26 extends MediaProjection.Callback implements CapturerObserver, nq7 {
    public volatile SurfaceTextureHelper X;
    public volatile ScreenCapturerAndroid Y;
    public VideoSink Z;
    public final EglBase.Context a;
    public final Context b;
    public final a4c c;
    public final mu3 o = new mu3("SSFrameCapturer");
    public final cue s0 = new cue();
    public boolean t0;
    public boolean u0;
    public final u5e v0;

    public h26(EglBase.Context context, Context context2, u5e u5eVar, a4c a4cVar) {
        this.a = context;
        this.b = context2;
        this.c = a4cVar;
        this.v0 = u5eVar;
    }

    @Override // defpackage.nq7
    public final void a(int i, int i2) {
        this.o.c(new ft0(this, i, i2, 1));
    }

    public final void b(Size size, int i) {
        if (!this.t0 || this.u0) {
            return;
        }
        try {
            this.Y.startCapture(size.width, size.height, 0);
            this.u0 = true;
        } catch (SecurityException e) {
            this.c.logException("FrameCapturerImpl", "Error starting screen capture", e);
            if (i > 10) {
                this.c.reportException("FrameCapturerImpl", wg0.g(i, "Error: ", "times of restart screen capture did fail"), e);
                this.o.c(new g26(this, 0));
            } else {
                mu3 mu3Var = this.o;
                ((Handler) mu3Var.b).postDelayed(new si1(this, size, i, 10), 400L);
            }
        } catch (RuntimeException e2) {
            this.c.reportException("FrameCapturerImpl", "Error starting screen capture", e2);
            this.o.c(new g26(this, 0));
        }
    }

    @Override // org.webrtc.CapturerObserver
    public final void onCapturerStarted(boolean z) {
        u5e u5eVar;
        this.c.log("FrameCapturerImpl", ey8.j("Screen capture did start success=", z));
        if (!z || (u5eVar = this.v0) == null) {
            return;
        }
        ((py0) u5eVar.a).V0.log("OKRTCCall", "Screen capture has started, fast=false");
    }

    @Override // org.webrtc.CapturerObserver
    public final void onCapturerStopped() {
        this.c.log("FrameCapturerImpl", "Screen capture did stop");
        u5e u5eVar = this.v0;
        if (u5eVar != null) {
            u5eVar.b(false);
        }
    }

    @Override // org.webrtc.CapturerObserver
    public final void onFrameCaptured(VideoFrame videoFrame) {
        this.s0.a();
        VideoSink videoSink = this.Z;
        if (videoSink != null) {
            videoSink.onFrame(videoFrame);
        }
    }

    @Override // android.media.projection.MediaProjection.Callback
    public final void onStop() {
        this.o.c(new g26(this, 0));
    }
}
