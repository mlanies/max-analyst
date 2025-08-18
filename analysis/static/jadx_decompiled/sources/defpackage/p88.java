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
public abstract class p88 {
    public static final Pattern a = Pattern.compile("^\\D?(\\d+)$");
    public static final HashMap b = new HashMap();
    public static int c = -1;

    public static void a(String str, ArrayList arrayList) {
        if ("audio/raw".equals(str)) {
            if (oaf.a < 26 && oaf.b.equals("R9") && arrayList.size() == 1 && ((y78) arrayList.get(0)).a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                arrayList.add(y78.h("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false));
            }
            Collections.sort(arrayList, new ca3(5, new kp7(19)));
        }
        int i = oaf.a;
        if (i < 21 && arrayList.size() > 1) {
            String str2 = ((y78) arrayList.get(0)).a;
            if ("OMX.SEC.mp3.dec".equals(str2) || "OMX.SEC.MP3.Decoder".equals(str2) || "OMX.brcm.audio.mp3.decoder".equals(str2)) {
                Collections.sort(arrayList, new ca3(5, new kp7(21)));
            }
        }
        if (i >= 32 || arrayList.size() <= 1 || !"OMX.qti.audio.decoder.flac".equals(((y78) arrayList.get(0)).a)) {
            return;
        }
        arrayList.add((y78) arrayList.remove(0));
    }

    public static String b(qy5 qy5Var) {
        Pair pairD;
        if ("audio/eac3-joc".equals(qy5Var.n)) {
            return "audio/eac3";
        }
        if (!"video/dolby-vision".equals(qy5Var.n) || (pairD = d(qy5Var)) == null) {
            return null;
        }
        int iIntValue = ((Integer) pairD.first).intValue();
        if (iIntValue == 16 || iIntValue == 256) {
            return "video/hevc";
        }
        if (iIntValue == 512) {
            return "video/avc";
        }
        if (iIntValue == 1024) {
            return "video/av01";
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
        if (str2.equals("audio/ac3") && "OMX.lge.ac3.decoder".equals(str)) {
            return "audio/lg-ac3";
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0395 A[PHI: r2
      0x0395: PHI (r2v136 int) = (r2v135 int), (r2v138 int), (r2v139 int), (r2v140 int), (r2v141 int) binds: [B:251:0x036c, B:254:0x0372, B:256:0x0376, B:258:0x037a, B:260:0x037e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:294:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x013d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Pair d(defpackage.qy5 r32) {
        /*
            Method dump skipped, instructions count: 2450
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p88.d(qy5):android.util.Pair");
    }

    public static synchronized List e(String str, boolean z, boolean z2) {
        try {
            i88 i88Var = new i88(str, z, z2);
            HashMap map = b;
            List list = (List) map.get(i88Var);
            if (list != null) {
                return list;
            }
            int i = oaf.a;
            ArrayList arrayListF = f(i88Var, i >= 21 ? new l88(1, z, z2) : new ob6());
            if (z && arrayListF.isEmpty() && 21 <= i && i <= 23) {
                arrayListF = f(i88Var, new ob6());
                if (!arrayListF.isEmpty()) {
                    z04.c0("MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + ((y78) arrayListF.get(0)).a);
                }
            }
            a(str, arrayListF);
            zw6 zw6VarJ = zw6.j(arrayListF);
            map.put(i88Var, zw6VarJ);
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
    public static java.util.ArrayList f(defpackage.i88 r23, defpackage.k88 r24) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 381
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p88.f(i88, k88):java.util.ArrayList");
    }

    public static ffc g(xw0 xw0Var, qy5 qy5Var, boolean z, boolean z2) {
        Iterable iterableE;
        String str = qy5Var.n;
        xw0Var.getClass();
        List listE = e(str, z, z2);
        String strB = b(qy5Var);
        if (strB == null) {
            iterableE = ffc.X;
        } else {
            xw0Var.getClass();
            iterableE = e(strB, z, z2);
        }
        ww6 ww6VarI = zw6.i();
        ww6VarI.e(listE);
        ww6VarI.e(iterableE);
        return ww6VarI.j();
    }

    public static ArrayList h(qy5 qy5Var, List list) {
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList, new ca3(5, new z16(20, qy5Var)));
        return arrayList;
    }

    public static boolean i(MediaCodecInfo mediaCodecInfo, String str, boolean z, String str2) {
        if (mediaCodecInfo.isEncoder() || (!z && str.endsWith(".secure"))) {
            return false;
        }
        int i = oaf.a;
        if (i < 21 && ("CIPAACDecoder".equals(str) || "CIPMP3Decoder".equals(str) || "CIPVorbisDecoder".equals(str) || "CIPAMRNBDecoder".equals(str) || "AACDecoder".equals(str) || "MP3Decoder".equals(str))) {
            return false;
        }
        if (i < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && "samsung".equals(oaf.c))) {
            String str3 = oaf.b;
            if (str3.startsWith("zeroflte") || str3.startsWith("zerolte") || str3.startsWith("zenlte") || "SC-05G".equals(str3) || "marinelteatt".equals(str3) || "404SC".equals(str3) || "SC-04G".equals(str3) || "SCV31".equals(str3)) {
                return false;
            }
        }
        if (i == 19 && "OMX.SEC.vp8.dec".equals(str) && "samsung".equals(oaf.c)) {
            String str4 = oaf.b;
            if (str4.startsWith("d2") || str4.startsWith("serrano") || str4.startsWith("jflte") || str4.startsWith("santos") || str4.startsWith("t0")) {
                return false;
            }
        }
        if (i == 19 && oaf.b.startsWith("jflte") && "OMX.qcom.video.decoder.vp8".equals(str)) {
            return false;
        }
        return (i <= 23 && "audio/eac3-joc".equals(str2) && "OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str)) ? false : true;
    }

    public static boolean j(MediaCodecInfo mediaCodecInfo, String str) {
        if (oaf.a >= 29) {
            return mediaCodecInfo.isSoftwareOnly();
        }
        if (ia9.h(str)) {
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

    public static int k() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        int i;
        if (c == -1) {
            int iMax = 0;
            List listE = e("video/avc", false, false);
            y78 y78Var = listE.isEmpty() ? null : (y78) listE.get(0);
            if (y78Var != null) {
                MediaCodecInfo.CodecCapabilities codecCapabilities = y78Var.d;
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
                iMax = Math.max(iMax2, oaf.a >= 21 ? 345600 : 172800);
            }
            c = iMax;
        }
        return c;
    }
}
