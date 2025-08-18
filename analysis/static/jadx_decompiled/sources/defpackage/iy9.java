package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import org.webrtc.EglBase;
import org.webrtc.SoftwareVideoDecoderFactory;
import org.webrtc.VideoCodecInfo;
import org.webrtc.VideoDecoder;
import org.webrtc.VideoDecoderFactory;
import org.webrtc.VideoDecoderFallback;

/* loaded from: classes2.dex */
public final class iy9 implements VideoDecoderFactory {
    public static final String e;
    public final hy9 a;
    public final a4c d;
    public boolean c = true;
    public final SoftwareVideoDecoderFactory b = new SoftwareVideoDecoderFactory();

    static {
        new ArrayList(Arrays.asList("OMX.qcom.".toLowerCase(), "OMX.MTK.".toLowerCase(), "OMX.Intel.".toLowerCase(), "OMX.Exynos.".toLowerCase()));
        e = "OKDefaultVideoDecoderFactory";
    }

    public iy9(EglBase.Context context, a4c a4cVar) {
        this.d = a4cVar;
        this.a = new hy9(context, new jj9(17));
    }

    @Override // org.webrtc.VideoDecoderFactory
    public final VideoDecoder createDecoder(VideoCodecInfo videoCodecInfo) {
        VideoDecoder videoDecoderFallback;
        String str = videoCodecInfo.name;
        boolean zEquals = str.equals("VP8");
        SoftwareVideoDecoderFactory softwareVideoDecoderFactory = this.b;
        a4c a4cVar = this.d;
        if ((zEquals || str.equals("VP9")) && !this.c) {
            return new ph4(softwareVideoDecoderFactory.createDecoder(videoCodecInfo), videoCodecInfo, a4cVar);
        }
        try {
            videoDecoderFallback = this.a.createDecoder(videoCodecInfo);
        } catch (Exception e2) {
            a4cVar.log(e, "Hardware encoder creating failed! Error=" + e2.getMessage());
            videoDecoderFallback = null;
        }
        VideoDecoder videoDecoderCreateDecoder = softwareVideoDecoderFactory.createDecoder(videoCodecInfo);
        if (videoDecoderFallback != null && videoDecoderCreateDecoder != null) {
            videoDecoderFallback = new VideoDecoderFallback(videoDecoderCreateDecoder, videoDecoderFallback);
        } else if (videoDecoderFallback == null) {
            if (videoDecoderCreateDecoder == null) {
                return null;
            }
            videoDecoderFallback = videoDecoderCreateDecoder;
        }
        return new ph4(videoDecoderFallback, videoCodecInfo, a4cVar);
    }

    @Override // org.webrtc.VideoDecoderFactory
    public final VideoCodecInfo[] getSupportedCodecs() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Collections.addAll(linkedHashSet, this.b.getSupportedCodecs());
        VideoCodecInfo[] supportedCodecs = this.a.getSupportedCodecs();
        if (this.c) {
            Collections.addAll(linkedHashSet, supportedCodecs);
        } else {
            for (VideoCodecInfo videoCodecInfo : supportedCodecs) {
                String str = videoCodecInfo.name;
                if (!str.equals("VP8") && !str.equals("VP9")) {
                    linkedHashSet.add(videoCodecInfo);
                }
            }
        }
        return (VideoCodecInfo[]) linkedHashSet.toArray(new VideoCodecInfo[linkedHashSet.size()]);
    }
}
