package defpackage;

import org.webrtc.MediaSource;
import org.webrtc.MediaStream;
import org.webrtc.MediaStreamTrack;
import org.webrtc.PeerConnectionFactory;
import org.webrtc.Size;
import org.webrtc.SurfaceTextureHelper;
import org.webrtc.VideoSource;
import org.webrtc.VideoTrack;

/* loaded from: classes2.dex */
public final class rkf extends ej3 implements SurfaceTextureHelper.FrameGeometryAdjuster {
    public final PeerConnectionFactory Y;
    public final w5e Z;
    public SurfaceTextureHelper s0;
    public b9b t0;
    public final ogf u0;
    public volatile Size v0;
    public volatile float w0;

    public rkf(PeerConnectionFactory peerConnectionFactory, String str, MediaStream mediaStream, Integer num, boolean z, w5e w5eVar, a4c a4cVar) {
        super(str, mediaStream, a4cVar);
        this.Y = peerConnectionFactory;
        this.Z = w5eVar;
        this.u0 = new ogf(z, num != null ? num.intValue() : 960, new om8(1, this, rkf.class, "logBufferTransform", "logBufferTransform(Ljava/lang/String;)V", 0, 25));
        this.v0 = new Size(960, 540);
        this.w0 = 1.0f;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0057  */
    @Override // org.webrtc.SurfaceTextureHelper.FrameGeometryAdjuster
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final org.webrtc.SurfaceTextureHelper.FrameGeometry adjustFrameGeometry(android.graphics.Matrix r7, int r8, int r9) {
        /*
            r6 = this;
            ogf r6 = r6.u0
            r6.getClass()
            java.lang.String r0 = "x"
            if (r8 == 0) goto L8e
            if (r9 != 0) goto Ld
            goto L8e
        Ld:
            nua r1 = r6.f
            java.lang.Integer r2 = r6.d
            java.lang.Integer r3 = r6.e
            int r4 = r6.c
            if (r2 == 0) goto L26
            if (r3 == 0) goto L26
            int r2 = r2.intValue()
            int r3 = r3.intValue()
            int r4 = java.lang.Math.min(r2, r3)
            goto L33
        L26:
            if (r2 == 0) goto L2d
            int r4 = r2.intValue()
            goto L33
        L2d:
            if (r3 == 0) goto L33
            int r4 = r3.intValue()
        L33:
            if (r1 == 0) goto L57
            java.lang.Integer r2 = r6.g
            if (r2 != 0) goto L3a
            goto L57
        L3a:
            int r2 = r2.intValue()
            if (r2 != r8) goto L57
            java.lang.Integer r2 = r6.h
            if (r2 != 0) goto L45
            goto L57
        L45:
            int r2 = r2.intValue()
            if (r2 != r9) goto L57
            java.lang.Integer r2 = r6.i
            if (r2 != 0) goto L50
            goto L57
        L50:
            int r2 = r2.intValue()
            if (r2 != r4) goto L57
            goto La9
        L57:
            nua r1 = r6.a(r8, r9)
            r6.f = r1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)
            r6.g = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r9)
            r6.h = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            r6.i = r2
            m56 r6 = r6.b
            int r2 = r1.g
            int r3 = r1.h
            java.lang.String r4 = "get new transform "
            java.lang.String r5 = " -> "
            java.lang.StringBuilder r4 = defpackage.wg0.j(r4, r8, r0, r9, r5)
            r4.append(r2)
            r4.append(r0)
            r4.append(r3)
            java.lang.String r0 = r4.toString()
            r6.invoke(r0)
            goto La9
        L8e:
            m56 r6 = r6.b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Wrong frame size: "
            r1.<init>(r2)
            r1.append(r8)
            r1.append(r0)
            r1.append(r9)
            java.lang.String r0 = r1.toString()
            r6.invoke(r0)
            mgf r1 = defpackage.mgf.a
        La9:
            org.webrtc.SurfaceTextureHelper$FrameGeometry r6 = r1.a(r7, r8, r9)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rkf.adjustFrameGeometry(android.graphics.Matrix, int, int):org.webrtc.SurfaceTextureHelper$FrameGeometry");
    }

    @Override // defpackage.ej3
    public final void b(MediaStream mediaStream, MediaStreamTrack mediaStreamTrack) {
        VideoTrack videoTrack = (VideoTrack) mediaStreamTrack;
        videoTrack.setContentHint(VideoTrack.ContentHint.NONE);
        if (mediaStream != null) {
            mediaStream.addTrack(videoTrack);
        }
    }

    @Override // defpackage.ej3
    public final void c(MediaStream mediaStream, MediaStreamTrack mediaStreamTrack) {
        VideoTrack videoTrack = (VideoTrack) mediaStreamTrack;
        if (mediaStream != null) {
            mediaStream.removeTrack(videoTrack);
        }
        SurfaceTextureHelper surfaceTextureHelper = this.s0;
        if (surfaceTextureHelper != null) {
            surfaceTextureHelper.dispose();
        }
        this.s0 = null;
    }

    @Override // defpackage.ej3
    public final MediaSource g() {
        return this.Y.createVideoSource(false);
    }

    @Override // defpackage.ej3
    public final MediaStreamTrack h(String str, MediaSource mediaSource) {
        return this.Y.createVideoTrack(str, (VideoSource) mediaSource);
    }

    @Override // defpackage.ej3
    public final String j() {
        return "VideoRecord";
    }

    @Override // defpackage.ej3
    public final void m() {
        super.m();
        this.t0 = null;
    }

    public final String toString() {
        return "OkSdkVideoRecord(isScreenCast=false)";
    }

    public final void u() {
        VideoSource videoSource = (VideoSource) ((MediaSource) this.o);
        if (videoSource == null) {
            ((a4c) this.c).log("VideoRecord", "No source while trying to update video format");
            return;
        }
        Size sizeB = this.u0.b(this.v0.width, this.v0.height);
        if (sizeB == null) {
            sizeB = new Size(960, 540);
        }
        ((a4c) this.c).log("VideoRecord", rh4.h("Apply output format adaptation: size= ", sizeB.width, sizeB.height, "x"));
        videoSource.adaptOutputFormat(sizeB.width, sizeB.height, tu0.G(this.w0 * 24.0f));
    }
}
