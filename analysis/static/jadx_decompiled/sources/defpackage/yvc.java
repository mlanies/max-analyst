package defpackage;

import org.webrtc.MediaSource;
import org.webrtc.MediaStream;
import org.webrtc.MediaStreamTrack;
import org.webrtc.PeerConnectionFactory;
import org.webrtc.SurfaceTextureHelper;
import org.webrtc.VideoSource;
import org.webrtc.VideoTrack;

/* loaded from: classes2.dex */
public final class yvc extends ej3 {
    public final PeerConnectionFactory Y;
    public SurfaceTextureHelper Z;
    public final jo7 s0;

    public yvc(PeerConnectionFactory peerConnectionFactory, String str, MediaStream mediaStream, a4c a4cVar, u5e u5eVar, dnc dncVar) {
        super(str, mediaStream, a4cVar);
        this.Y = peerConnectionFactory;
        jo7 jo7Var = new jo7();
        jo7Var.a = dncVar;
        jo7Var.b = u5eVar;
        this.s0 = jo7Var;
    }

    @Override // defpackage.ej3
    public final void b(MediaStream mediaStream, MediaStreamTrack mediaStreamTrack) {
        VideoTrack videoTrack = (VideoTrack) mediaStreamTrack;
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
        SurfaceTextureHelper surfaceTextureHelper = this.Z;
        if (surfaceTextureHelper != null) {
            surfaceTextureHelper.dispose();
        }
        this.Z = null;
    }

    @Override // defpackage.ej3
    public final MediaSource g() {
        return this.Y.createVideoSource(false);
    }

    @Override // defpackage.ej3
    public final MediaStreamTrack h(String str, MediaSource mediaSource) {
        return this.Y.createVideoTrack(str, (VideoSource) mediaSource);
    }

    public final String toString() {
        return "OkSdkScreenShareRecord";
    }

    public final void u(int i, int i2, int i3) {
        aff affVar;
        int iG;
        if (i <= 0 || i2 <= 0 || i < i2 || i3 <= 0) {
            affVar = null;
        } else {
            int i4 = 320;
            if (i < 320) {
                iG = tu0.G(320 * (i2 / i)) / 16;
            } else {
                i4 = (i / 16) * 16;
                iG = i2 / 16;
            }
            int i5 = iG * 16;
            int i6 = i4;
            affVar = new aff(i6, i5, i5, i6, i3);
        }
        if (affVar == null) {
            return;
        }
        VideoSource videoSource = (VideoSource) ((MediaSource) this.o);
        if (videoSource != null) {
            videoSource.adaptOutputFormat(affVar.a, affVar.b, affVar.c, affVar.d, i3);
        }
        String strJ = j();
        StringBuilder sb = new StringBuilder("Set screenshare dimensions to ");
        sb.append(affVar.a);
        sb.append(" x ");
        ms2.k(sb, affVar.b, " by requested ", i, " x ");
        sb.append(i2);
        sb.append(" fps ");
        sb.append(i3);
        ((a4c) this.c).log(strJ, sb.toString());
    }
}
