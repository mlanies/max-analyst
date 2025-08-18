package defpackage;

import android.content.pm.ShortcutInfo;
import android.hardware.camera2.CameraCharacteristics;
import android.media.EncoderProfiles;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class gu4 {
    public static ga0 a(EncoderProfiles encoderProfiles) {
        int defaultDurationSeconds = encoderProfiles.getDefaultDurationSeconds();
        int recommendedFileFormat = encoderProfiles.getRecommendedFileFormat();
        List<EncoderProfiles.AudioProfile> audioProfiles = encoderProfiles.getAudioProfiles();
        ArrayList arrayList = new ArrayList();
        for (EncoderProfiles.AudioProfile audioProfile : audioProfiles) {
            arrayList.add(new fa0(audioProfile.getCodec(), audioProfile.getBitrate(), audioProfile.getSampleRate(), audioProfile.getChannels(), audioProfile.getProfile(), audioProfile.getMediaType()));
        }
        List<EncoderProfiles.VideoProfile> videoProfiles = encoderProfiles.getVideoProfiles();
        ArrayList arrayList2 = new ArrayList();
        for (EncoderProfiles.VideoProfile videoProfile : videoProfiles) {
            arrayList2.add(new ha0(videoProfile.getCodec(), videoProfile.getMediaType(), videoProfile.getBitrate(), videoProfile.getFrameRate(), videoProfile.getWidth(), videoProfile.getHeight(), videoProfile.getProfile(), videoProfile.getBitDepth(), videoProfile.getChromaSubsampling(), videoProfile.getHdrFormat()));
        }
        return ga0.e(defaultDurationSeconds, recommendedFileFormat, arrayList, arrayList2);
    }

    public static eu4 b(xv1 xv1Var) {
        Long l = (Long) xv1Var.a(CameraCharacteristics.REQUEST_RECOMMENDED_TEN_BIT_DYNAMIC_RANGE_PROFILE);
        if (l != null) {
            return (eu4) fu4.a.get(l);
        }
        return null;
    }

    public static void c(ShortcutInfo.Builder builder) {
        builder.setExcludedFromSurfaces(0);
    }
}
