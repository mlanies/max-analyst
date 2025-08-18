package defpackage;

import org.webrtc.VideoCodecInfo;
import org.webrtc.VideoEncoderFactory;

/* loaded from: classes2.dex */
public final class mra implements VideoEncoderFactory.VideoEncoderSelector, n38 {
    public volatile ucg X = new ucg(1, false);
    public final kra a;
    public final a4c b;
    public VideoCodecInfo c;
    public VideoCodecInfo o;

    public mra(kra kraVar, a4c a4cVar) {
        this.a = kraVar;
        this.b = a4cVar;
    }

    public static VideoCodecInfo b(VideoCodecInfo[] videoCodecInfoArr, String str) {
        if (videoCodecInfoArr != null) {
            for (VideoCodecInfo videoCodecInfo : videoCodecInfoArr) {
                if (tpa.f(videoCodecInfo.name, str)) {
                    return videoCodecInfo;
                }
            }
        }
        return null;
    }

    public final VideoCodecInfo a() {
        VideoCodecInfo videoCodecInfoB;
        if (this.o == null) {
            return null;
        }
        ucg ucgVar = this.X;
        if (lra.$EnumSwitchMapping$0[au1.s(ucgVar.a)] == 1) {
            videoCodecInfoB = this.o;
        } else if (ucgVar.b) {
            VideoCodecInfo[] supportedCodecs = this.a.a.getSupportedCodecs();
            VideoCodecInfo videoCodecInfoB2 = b(supportedCodecs, "VP9");
            if (videoCodecInfoB2 == null) {
                videoCodecInfoB = b(supportedCodecs, "VP8");
                if (videoCodecInfoB == null) {
                    videoCodecInfoB = b(this.a.b.getSupportedCodecs(), "VP8");
                }
            } else {
                videoCodecInfoB = videoCodecInfoB2;
            }
        } else {
            videoCodecInfoB = b(this.a.b.getSupportedCodecs(), "VP8");
            if (videoCodecInfoB == null) {
                this.b.log("PatchedVideoEncoderFactoryCodecSelector", "Software VP8 encoder not found");
            }
        }
        if (tpa.f(videoCodecInfoB, this.c)) {
            return null;
        }
        this.b.log("PatchedVideoEncoderFactoryCodecSelector", "Selected encoder " + videoCodecInfoB + " differs from current one " + this.c + ". Let us suggest an update");
        return videoCodecInfoB;
    }

    @Override // org.webrtc.VideoEncoderFactory.VideoEncoderSelector
    public final VideoCodecInfo onAvailableBitrate(int i) {
        return a();
    }

    @Override // org.webrtc.VideoEncoderFactory.VideoEncoderSelector
    public final void onCurrentEncoder(VideoCodecInfo videoCodecInfo) {
        if (this.o == null && videoCodecInfo != null) {
            this.b.log("PatchedVideoEncoderFactoryCodecSelector", "Encoder  " + videoCodecInfo + " was selected as default");
            this.o = videoCodecInfo;
        }
        this.c = videoCodecInfo;
        this.b.log("PatchedVideoEncoderFactoryCodecSelector", "Codec selected: " + videoCodecInfo + " for condition " + this.X);
    }

    @Override // org.webrtc.VideoEncoderFactory.VideoEncoderSelector
    public final VideoCodecInfo onEncoderBroken() {
        boolean zF = tpa.f(this.c, this.o);
        a4c a4cVar = this.b;
        if (zF) {
            VideoCodecInfo videoCodecInfo = this.o;
            if (videoCodecInfo != null) {
                a4cVar.log("PatchedVideoEncoderFactoryCodecSelector", "Default encoder " + videoCodecInfo + " was broken. reset");
            }
            this.o = null;
        }
        VideoCodecInfo videoCodecInfo2 = this.c;
        if (videoCodecInfo2 != null) {
            a4cVar.log("PatchedVideoEncoderFactoryCodecSelector", "Current encoder " + videoCodecInfo2 + " was broken. reset");
        }
        this.c = null;
        return a();
    }

    @Override // org.webrtc.VideoEncoderFactory.VideoEncoderSelector
    public final VideoCodecInfo onResolutionChange(int i, int i2) {
        return a();
    }

    @Override // defpackage.n38
    public final void p(o38 o38Var) {
        this.b.log("PatchedVideoEncoderFactoryCodecSelector", "Network condition did change. New condition is " + o38Var);
        this.X = new ucg(o38Var.a, o38Var.c);
    }
}
