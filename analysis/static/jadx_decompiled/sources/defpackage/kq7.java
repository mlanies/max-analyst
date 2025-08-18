package defpackage;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.view.Display;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import org.webrtc.CameraVideoCapturer;
import org.webrtc.CapturerObserver;
import org.webrtc.EglBase;
import org.webrtc.MediaSource;
import org.webrtc.MediaStream;
import org.webrtc.MediaStreamTrack;
import org.webrtc.PeerConnectionFactory;
import org.webrtc.Size;
import org.webrtc.SurfaceTextureHelper;
import org.webrtc.VideoCapturer;
import org.webrtc.VideoSink;
import org.webrtc.VideoSource;
import org.webrtc.VideoTrack;
import org.webrtc.YuvConverter;

/* loaded from: classes2.dex */
public final class kq7 {
    public final dnc C;
    public final m5d D;
    public final u5e E;
    public final EglBase.Context a;
    public final xx0 b;
    public final Context d;
    public final i50 e;
    public final aq7 f;
    public final Executor g;
    public final MediaStream h;
    public final n60 i;
    public final n60 j;
    public final String k;
    public final String l;
    public final String m;
    public final a4c n;
    public final boolean o;
    public blf p;
    public volatile VideoSink q;
    public volatile tv1 r;
    public volatile jx1 s;
    public volatile zuc t;
    public volatile fwc u;
    public volatile lq7 v;
    public final boolean w;
    public ece x;
    public final rkf y;
    public final yvc z;
    public final CopyOnWriteArraySet c = new CopyOnWriteArraySet();
    public final DisplayMetrics A = new DisplayMetrics();
    public final Size B = new Size(0, 0);

    public kq7(jq7 jq7Var) {
        this.w = false;
        a4c a4cVar = jq7Var.h;
        this.n = a4cVar;
        this.d = jq7Var.d;
        PeerConnectionFactory peerConnectionFactory = jq7Var.a;
        this.e = jq7Var.b;
        this.f = jq7Var.q;
        this.g = jq7Var.c;
        String str = jq7Var.g;
        String str2 = jq7Var.f;
        this.m = jq7Var.e;
        this.o = jq7Var.p;
        this.a = jq7Var.i;
        boolean z = jq7Var.k;
        this.b = jq7Var.j;
        this.w = jq7Var.l;
        String strL = zr6.l(new StringBuilder(), jq7Var.e, "sc0");
        this.k = strL;
        String strL2 = zr6.l(new StringBuilder(), jq7Var.e, "as0");
        this.l = strL2;
        MediaStream mediaStreamCreateLocalMediaStream = peerConnectionFactory.createLocalMediaStream(jq7Var.e);
        this.h = mediaStreamCreateLocalMediaStream;
        MediaStream mediaStreamCreateLocalMediaStream2 = peerConnectionFactory.createLocalMediaStream(strL);
        this.D = jq7Var.o ? new m5d(this) : null;
        this.E = jq7Var.r;
        mediaStreamCreateLocalMediaStream = z ? mediaStreamCreateLocalMediaStream : null;
        n60 n60Var = new n60(peerConnectionFactory, str, mediaStreamCreateLocalMediaStream, a4cVar);
        this.i = n60Var;
        n60Var.l();
        n60Var.o(false);
        n60 n60Var2 = new n60(peerConnectionFactory, strL2, mediaStreamCreateLocalMediaStream, a4cVar);
        this.j = n60Var2;
        n60Var2.l();
        n60Var2.o(false);
        rkf rkfVar = new rkf(peerConnectionFactory, str2, mediaStreamCreateLocalMediaStream, jq7Var.s, jq7Var.t, new w5e(this), a4cVar);
        this.y = rkfVar;
        rkfVar.l();
        yvc yvcVar = new yvc(peerConnectionFactory, strL, mediaStreamCreateLocalMediaStream2, a4cVar, jq7Var.r, jq7Var.m);
        this.z = yvcVar;
        yvcVar.l();
        this.C = jq7Var.m;
    }

    public final void a() {
        blf blfVar = this.p;
        if (blfVar != null) {
            blfVar.a = null;
            this.n.log("OKRTCLmsAdapter", this + ": " + jb9.c(this.p) + " was cleared");
        }
    }

    public final void b(nq7 nq7Var) {
        m5d m5dVar = this.D;
        if (m5dVar == null || nq7Var == null) {
            return;
        }
        m5dVar.b = nq7Var;
        Handler handler = (Handler) m5dVar.c;
        gwe gweVar = (gwe) m5dVar.o;
        handler.removeCallbacks(gweVar);
        ((kq7) m5dVar.X).n.log("OKRTCLmsAdapter", "Schedule check screen dimensions in 1500ms");
        handler.postDelayed(gweVar, 1500L);
    }

    public final void c(VideoCapturer videoCapturer) {
        this.n.log("OKRTCLmsAdapter", "createVideoTrackForCamera for " + jb9.c(videoCapturer));
        if (videoCapturer == null) {
            throw new IllegalArgumentException("Video capturer is expected to be not null");
        }
        this.y.l();
        rkf rkfVar = this.y;
        Context context = this.d;
        EglBase.Context context2 = this.a;
        VideoSource videoSource = (VideoSource) ((MediaSource) rkfVar.o);
        CapturerObserver capturerObserver = videoSource != null ? videoSource.getCapturerObserver() : null;
        if (capturerObserver == null) {
            throw new IllegalStateException("Can't set capture in absence of video source");
        }
        if (rkfVar.s0 != null) {
            throw new IllegalStateException("An attempt to create surface texture screencast=false, while got one");
        }
        SurfaceTextureHelper surfaceTextureHelperCreate = SurfaceTextureHelper.create("VideoCapturerThread", context2, false, new YuvConverter(), null, rkfVar);
        rkfVar.s0 = surfaceTextureHelperCreate;
        rkfVar.t0 = new b9b(rkfVar, capturerObserver, false, 12);
        videoCapturer.initialize(surfaceTextureHelperCreate, context.getApplicationContext(), rkfVar.t0);
        if (this.w) {
            if (!(videoCapturer instanceof jra)) {
                throw new IllegalArgumentException("Video capturer is expected to be an implementation of ".concat(jra.class.getName()));
            }
            ((jra) videoCapturer).Y = this.q;
            return;
        }
        VideoTrack videoTrack = (VideoTrack) ((MediaStreamTrack) this.y.X);
        if (videoTrack != null) {
            if (this.p == null) {
                blf blfVar = new blf();
                this.p = blfVar;
                blfVar.a = this.q;
            }
            videoTrack.addSink(this.p);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x016b A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(defpackage.ji9 r12) {
        /*
            Method dump skipped, instructions count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kq7.d(ji9):void");
    }

    public final void e() {
        Display[] displays = ((DisplayManager) this.d.getSystemService("display")).getDisplays();
        if (displays.length > 0) {
            displays[0].getRealMetrics(this.A);
        }
    }

    public final void f(VideoCapturer videoCapturer) {
        this.n.log("OKRTCLmsAdapter", "createVideoTrackForScreenCapture for " + jb9.c(videoCapturer));
        if (videoCapturer == null) {
            throw new IllegalArgumentException("videoCapturer must not be null");
        }
        yvc yvcVar = this.z;
        yvcVar.l();
        Context applicationContext = this.d.getApplicationContext();
        VideoSource videoSource = (VideoSource) ((MediaSource) yvcVar.o);
        CapturerObserver capturerObserver = videoSource != null ? videoSource.getCapturerObserver() : null;
        if (capturerObserver == null) {
            throw new IllegalStateException("Can't set capture in absence of video source");
        }
        jo7 jo7Var = yvcVar.s0;
        jo7Var.c = capturerObserver;
        SurfaceTextureHelper surfaceTextureHelper = yvcVar.Z;
        if (surfaceTextureHelper != null) {
            surfaceTextureHelper.dispose();
        }
        SurfaceTextureHelper surfaceTextureHelperCreate = SurfaceTextureHelper.create("ScreenCapturerThread", this.a);
        yvcVar.Z = surfaceTextureHelperCreate;
        videoCapturer.initialize(surfaceTextureHelperCreate, applicationContext.getApplicationContext(), jo7Var);
    }

    public final void g() {
        blf blfVar;
        a4c a4cVar = this.n;
        a4cVar.log("OKRTCLmsAdapter", "releaseCameraVideoTrack");
        a();
        rkf rkfVar = this.y;
        VideoTrack videoTrack = (VideoTrack) ((MediaStreamTrack) rkfVar.X);
        if (videoTrack != null && (blfVar = this.p) != null) {
            try {
                videoTrack.removeSink(blfVar);
            } catch (Exception unused) {
            }
            a4cVar.log("OKRTCLmsAdapter", this + ": " + jb9.c(this.p) + " was removed from " + jb9.c(videoTrack));
        }
        this.p = null;
        rkfVar.m();
    }

    public final Size h() {
        tv1 tv1Var = this.r;
        if (tv1Var == null) {
            return new Size(0, 0);
        }
        Size size = new Size(tv1Var.n, tv1Var.m);
        rkf rkfVar = this.y;
        rkfVar.getClass();
        Size sizeB = rkfVar.u0.b(size.width, size.height);
        return sizeB == null ? size : sizeB;
    }

    public final void i(tv1 tv1Var, boolean z) {
        this.n.log("OKRTCLmsAdapter", ey8.j("onCameraCapturerSwitchDone, switched ? ", z));
        if (z) {
            ece eceVar = this.x;
            if (eceVar != null) {
                ((py0) eceVar.a).k(w51.Z, Boolean.TRUE);
            }
            this.g.execute(new vs5(this, 14, tv1Var));
        }
    }

    public final void j(boolean z) {
        n60 n60Var = this.j;
        MediaStreamTrack mediaStreamTrack = (MediaStreamTrack) n60Var.X;
        if ((mediaStreamTrack != null ? mediaStreamTrack.enabled() : false) != z) {
            this.n.log("OKRTCLmsAdapter", ey8.j("setAudioShareTrackEnabled, enabled=", z));
            n60Var.o(z);
        }
    }

    public final void k(VideoSink videoSink) {
        this.n.log("OKRTCLmsAdapter", "setVideoRenderer, " + jb9.c(videoSink));
        this.q = videoSink;
        if (this.w) {
            tv1 tv1Var = this.r;
            CameraVideoCapturer cameraVideoCapturer = tv1Var != null ? (CameraVideoCapturer) tv1Var.c.b : null;
            if (cameraVideoCapturer instanceof jra) {
                ((jra) cameraVideoCapturer).Y = videoSink;
            } else if (cameraVideoCapturer != null) {
                throw new IllegalArgumentException("Video capturer is expected to be an implementation of ".concat(jra.class.getName()));
            }
        }
        blf blfVar = this.p;
        if (blfVar != null) {
            blfVar.a = videoSink;
        }
    }

    public final void l(jx1 jx1Var) {
        ww1 ww1VarI;
        this.n.log("OKRTCLmsAdapter", "switchCamera, " + this);
        if (this.r == null) {
            if (jx1Var != null) {
                this.n.log("OKRTCLmsAdapter", "Got cameraParams while no capturer created yet. Remember for future use");
                this.s = jx1Var;
                return;
            } else {
                this.n.log("OKRTCLmsAdapter", this + ": has no camera capturer");
                return;
            }
        }
        tv1 tv1Var = this.r;
        tv1Var.e.log("CameraCapturerAdapter", "switchCamera");
        if (!tv1Var.k) {
            tv1Var.e.log("CameraCapturerAdapter", "Camera is not started");
            return;
        }
        if (tv1Var.j) {
            synchronized (tv1Var.g) {
                try {
                    if (tv1Var.j) {
                        tv1Var.e.log("CameraCapturerAdapter", "Camera switch is pending");
                        return;
                    }
                    tv1Var.j = true;
                } finally {
                }
            }
        }
        if (jx1Var == null) {
            ww1VarI = tv1Var.d.I(tv1Var.i ? 2 : 1);
        } else {
            ww1VarI = tv1Var.d.I(jx1Var.a);
        }
        if (ww1VarI == null || Objects.equals(tv1Var.h, ww1VarI.a())) {
            return;
        }
        String strA = ww1VarI.a();
        ((CameraVideoCapturer) tv1Var.c.b).switchCamera(new qz7(tv1Var, strA), strA);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m(java.lang.Float r6, java.lang.Float r7) {
        /*
            r5 = this;
            rkf r0 = r5.y
            ogf r1 = r0.u0
            if (r6 == 0) goto L25
            r1.getClass()
            float r2 = r6.floatValue()
            int r3 = r1.c
            float r3 = (float) r3
            float r3 = r3 * r2
            int r2 = defpackage.tu0.G(r3)
            int r3 = r2 % 16
            int r2 = r2 - r3
            r3 = 320(0x140, float:4.48E-43)
            r4 = 4096(0x1000, float:5.74E-42)
            int r2 = defpackage.ote.e(r2, r3, r4)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L26
        L25:
            r2 = 0
        L26:
            r1.e = r2
            m56 r1 = r1.b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Set scale restriction: "
            r2.<init>(r3)
            r2.append(r6)
            java.lang.String r6 = " "
            r2.append(r6)
            java.lang.String r6 = r2.toString()
            r1.invoke(r6)
            r0.u()
            rkf r5 = r5.y
            if (r7 == 0) goto L64
            r5.getClass()
            float r6 = r7.floatValue()
            r0 = 0
            int r6 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r6 <= 0) goto L64
            float r6 = r7.floatValue()
            double r0 = (double) r6
            r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 < 0) goto L5f
            goto L64
        L5f:
            float r6 = r7.floatValue()
            goto L66
        L64:
            r6 = 1065353216(0x3f800000, float:1.0)
        L66:
            r5.w0 = r6
            r5.u()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kq7.m(java.lang.Float, java.lang.Float):void");
    }

    public final String toString() {
        return jb9.c(this);
    }
}
