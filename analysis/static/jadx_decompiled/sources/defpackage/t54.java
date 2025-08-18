package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;
import org.webrtc.VpxDecoderWrapper;

/* loaded from: classes2.dex */
public final class t54 implements VideoSink, VpxDecoderWrapper.ErrorCallback {
    public final Handler X;
    public final int Y;
    public final ypc b;
    public final a4c c;
    public final HandlerThread o;
    public final /* synthetic */ vbg z0;
    public volatile boolean Z = false;
    public volatile boolean s0 = false;
    public volatile boolean t0 = true;
    public final AtomicInteger u0 = new AtomicInteger(0);
    public final AtomicInteger v0 = new AtomicInteger(0);
    public final AtomicInteger w0 = new AtomicInteger(-1);
    public final AtomicInteger x0 = new AtomicInteger(-1);
    public final AtomicInteger y0 = new AtomicInteger(-1);
    public final VpxDecoderWrapper a = new VpxDecoderWrapper();

    public t54(vbg vbgVar, int i, ypc ypcVar, a4c a4cVar) {
        this.z0 = vbgVar;
        this.b = ypcVar;
        this.c = a4cVar;
        HandlerThread handlerThread = new HandlerThread("DecoderWrapperVpxQueue");
        this.o = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.X = handler;
        this.Y = i;
        handler.post(new l40(i, 7, this));
    }

    public final void a() {
        if (this.Z) {
            return;
        }
        this.Z = true;
        this.c.log("DecoderWrapper", "releasing decoder " + System.identityHashCode(this));
        HandlerThread handlerThread = this.o;
        Handler handler = this.z0.e;
        VpxDecoderWrapper vpxDecoderWrapper = this.a;
        Objects.requireNonNull(vpxDecoderWrapper);
        cu1 cu1Var = new cu1(23, vpxDecoderWrapper);
        handler.removeCallbacksAndMessages(null);
        handler.post(cu1Var);
        handlerThread.quitSafely();
        this.s0 = true;
    }

    @Override // org.webrtc.VpxDecoderWrapper.ErrorCallback
    public final void onDecodeError(int i) {
        StringBuilder sbN = rh4.n(i, "onDecodeError vpx_error_code:", " System.identityHashCode: ");
        sbN.append(System.identityHashCode(this));
        this.c.log("DecoderWrapper", sbN.toString());
        vbg vbgVar = this.z0;
        vbgVar.x.a();
        vbgVar.t.incrementAndGet();
        this.t0 = true;
        this.w0.set(this.v0.get());
    }

    @Override // org.webrtc.VideoSink
    public final void onFrame(VideoFrame videoFrame) {
        if (this.Z) {
            return;
        }
        this.z0.s.incrementAndGet();
        this.z0.w.a();
        if (SystemClock.elapsedRealtimeNanos() > vbg.E) {
            ypc ypcVar = this.b;
            bwc bwcVar = (bwc) ypcVar.b;
            bg1 bg1Var = (bg1) ypcVar.c;
            if (!bwcVar.f) {
                bwcVar.e.a(bg1Var, videoFrame);
            }
        }
        this.x0.set(videoFrame.getRotatedWidth());
        this.y0.set(videoFrame.getRotatedHeight());
    }
}
