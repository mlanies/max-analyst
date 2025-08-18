package defpackage;

import android.media.MediaCodecInfo;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.webrtc.EglBase;

/* loaded from: classes.dex */
public abstract class o88 {
    public static final Pattern a = Pattern.compile("^\\D?(\\d+)$");
    public static final HashMap b = new HashMap();
    public static int c = -1;

    public static void a(String str, ArrayList arrayList) {
        if ("audio/raw".equals(str)) {
            if (maf.a < 26 && maf.b.equals("R9") && arrayList.size() == 1 && ((x78) arrayList.get(0)).a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                arrayList.add(x78.g("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false));
            }
            Collections.sort(arrayList, new ca3(4, new kp7(18)));
        }
        int i = maf.a;
        if (i < 21 && arrayList.size() > 1) {
            String str2 = ((x78) arrayList.get(0)).a;
            if ("OMX.SEC.mp3.dec".equals(str2) || "OMX.SEC.MP3.Decoder".equals(str2) || "OMX.brcm.audio.mp3.decoder".equals(str2)) {
                Collections.sort(arrayList, new ca3(4, new kp7(20)));
            }
        }
        if (i >= 32 || arrayList.size() <= 1 || !"OMX.qti.audio.decoder.flac".equals(((x78) arrayList.get(0)).a)) {
            return;
        }
        arrayList.add((x78) arrayList.remove(0));
    }

    public static String b(oy5 oy5Var) {
        Pair pairD;
        if ("audio/eac3-joc".equals(oy5Var.w0)) {
            return "audio/eac3";
        }
        if (!"video/dolby-vision".equals(oy5Var.w0) || (pairD = d(oy5Var)) == null) {
            return null;
        }
        int iIntValue = ((Integer) pairD.first).intValue();
        if (iIntValue == 16 || iIntValue == 256) {
            return "video/hevc";
        }
        if (iIntValue == 512) {
            return "video/avc";
        }
        return null;
    }

    public static String c(MediaCodecInfo mediaCodecInfo, String str, String str2) {
        for (String str3 : mediaCodecInfo.getSupportedTypes()) {
            if (str3.equalsIgnoreCase(str2)) {
                return str3;
            }
        }
        if (str2.equals("video/dolby-vision")) {
            if ("OMX.MS.HEVCDV.Decoder".equals(str)) {
                return "video/hevcdv";
            }
            if ("OMX.RTK.video.decoder".equals(str) || "OMX.realtek.video.decoder.tunneled".equals(str)) {
                return "video/dv_hevc";
            }
            return null;
        }
        if (str2.equals("audio/alac") && "OMX.lge.alac.decoder".equals(str)) {
            return "audio/x-lg-alac";
        }
        if (str2.equals("audio/flac") && "OMX.lge.flac.decoder".equals(str)) {
            return "audio/x-lg-flac";
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x03a3 A[PHI: r2
      0x03a3: PHI (r2v96 int) = (r2v95 int), (r2v98 int), (r2v99 int), (r2v100 int), (r2v101 int) binds: [B:259:0x037a, B:263:0x0382, B:265:0x0386, B:267:0x038a, B:269:0x038e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:485:0x06c5  */
    /* JADX WARN: Removed duplicated region for block: B:595:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:615:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0140  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Pair d(defpackage.oy5 r26) {
        /*
            Method dump skipped, instructions count: 2498
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o88.d(oy5):android.util.Pair");
    }

    public static synchronized List e(String str, boolean z, boolean z2) {
        try {
            h88 h88Var = new h88(str, z, z2);
            HashMap map = b;
            List list = (List) map.get(h88Var);
            if (list != null) {
                return list;
            }
            int i = maf.a;
            ArrayList arrayListF = f(h88Var, i >= 21 ? new l88(0, z, z2) : new vu4());
            if (z && arrayListF.isEmpty() && 21 <= i && i <= 23) {
                arrayListF = f(h88Var, new vu4());
                if (!arrayListF.isEmpty()) {
                    new StringBuilder(String.valueOf(str).length() + 63 + String.valueOf(((x78) arrayListF.get(0)).a).length());
                }
            }
            a(str, arrayListF);
            zw6 zw6VarJ = zw6.j(arrayListF);
            map.put(h88Var, zw6VarJ);
            return zw6VarJ;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList f(defpackage.h88 r23, defpackage.j88 r24) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o88.f(h88, j88):java.util.ArrayList");
    }

    public static boolean g(MediaCodecInfo mediaCodecInfo, String str, boolean z, String str2) {
        if (mediaCodecInfo.isEncoder() || (!z && str.endsWith(".secure"))) {
            return false;
        }
        int i = maf.a;
        if (i < 21 && ("CIPAACDecoder".equals(str) || "CIPMP3Decoder".equals(str) || "CIPVorbisDecoder".equals(str) || "CIPAMRNBDecoder".equals(str) || "AACDecoder".equals(str) || "MP3Decoder".equals(str))) {
            return false;
        }
        if (i < 18 && "OMX.MTK.AUDIO.DECODER.AAC".equals(str)) {
            String str3 = maf.b;
            if ("a70".equals(str3) || ("Xiaomi".equals(maf.c) && str3.startsWith("HM"))) {
                return false;
            }
        }
        if (i == 16 && "OMX.qcom.audio.decoder.mp3".equals(str)) {
            String str4 = maf.b;
            if ("dlxu".equals(str4) || "protou".equals(str4) || "ville".equals(str4) || "villeplus".equals(str4) || "villec2".equals(str4) || str4.startsWith("gee") || "C6602".equals(str4) || "C6603".equals(str4) || "C6606".equals(str4) || "C6616".equals(str4) || "L36h".equals(str4) || "SO-02E".equals(str4)) {
                return false;
            }
        }
        if (i == 16 && "OMX.qcom.audio.decoder.aac".equals(str)) {
            String str5 = maf.b;
            if ("C1504".equals(str5) || "C1505".equals(str5) || "C1604".equals(str5) || "C1605".equals(str5)) {
                return false;
            }
        }
        if (i < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && "samsung".equals(maf.c))) {
            String str6 = maf.b;
            if (str6.startsWith("zeroflte") || str6.startsWith("zerolte") || str6.startsWith("zenlte") || "SC-05G".equals(str6) || "marinelteatt".equals(str6) || "404SC".equals(str6) || "SC-04G".equals(str6) || "SCV31".equals(str6)) {
                return false;
            }
        }
        if (i <= 19 && "OMX.SEC.vp8.dec".equals(str) && "samsung".equals(maf.c)) {
            String str7 = maf.b;
            if (str7.startsWith("d2") || str7.startsWith("serrano") || str7.startsWith("jflte") || str7.startsWith("santos") || str7.startsWith("t0")) {
                return false;
            }
        }
        if (i <= 19 && maf.b.startsWith("jflte") && "OMX.qcom.video.decoder.vp8".equals(str)) {
            return false;
        }
        return (i <= 23 && "audio/eac3-joc".equals(str2) && "OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str)) ? false : true;
    }

    public static boolean h(MediaCodecInfo mediaCodecInfo, String str) {
        if (maf.a >= 29) {
            return mediaCodecInfo.isSoftwareOnly();
        }
        if (ha9.h(str)) {
            return true;
        }
        String strT = lz7.T(mediaCodecInfo.getName());
        if (strT.startsWith("arc.")) {
            return false;
        }
        if (strT.startsWith("omx.google.") || strT.startsWith("omx.ffmpeg.")) {
            return true;
        }
        if ((strT.startsWith("omx.sec.") && strT.contains(".sw.")) || strT.equals("omx.qcom.video.decoder.hevcswvdec") || strT.startsWith("c2.android.") || strT.startsWith("c2.google.")) {
            return true;
        }
        return (strT.startsWith("omx.") || strT.startsWith("c2.")) ? false : true;
    }

    public static int i() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        int i;
        if (c == -1) {
            int iMax = 0;
            List listE = e("video/avc", false, false);
            x78 x78Var = listE.isEmpty() ? null : (x78) listE.get(0);
            if (x78Var != null) {
                MediaCodecInfo.CodecCapabilities codecCapabilities = x78Var.d;
                if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                    codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
                }
                int length = codecProfileLevelArr.length;
                int iMax2 = 0;
                while (iMax < length) {
                    int i2 = codecProfileLevelArr[iMax].level;
                    if (i2 != 1 && i2 != 2) {
                        switch (i2) {
                            case 8:
                            case 16:
                            case 32:
                                i = 101376;
                                break;
                            case EglBase.EGL_OPENGL_ES3_BIT /* 64 */:
                                i = 202752;
                                break;
                            case 128:
                            case 256:
                                i = 414720;
                                break;
                            case 512:
                                i = 921600;
                                break;
                            case LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY /* 1024 */:
                                i = 1310720;
                                break;
                            case 2048:
                            case 4096:
                                i = 2097152;
                                break;
                            case 8192:
                                i = 2228224;
                                break;
                            case 16384:
                                i = 5652480;
                                break;
                            case 32768:
                            case 65536:
                                i = 9437184;
                                break;
                            case 131072:
                            case 262144:
                            case 524288:
                                i = 35651584;
                                break;
                            default:
                                i = -1;
                                break;
                        }
                    } else {
                        i = 25344;
                    }
                    iMax2 = Math.max(i, iMax2);
                    iMax++;
                }
                iMax = Math.max(iMax2, maf.a >= 21 ? 345600 : 172800);
            }
            c = iMax;
        }
        return c;
    }
}
