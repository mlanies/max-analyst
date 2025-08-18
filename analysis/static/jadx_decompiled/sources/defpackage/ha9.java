package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.http.HttpStatus;
import org.webrtc.MediaStreamTrack;

/* loaded from: classes.dex */
public abstract class ha9 {
    public static final ArrayList a = new ArrayList();
    public static final Pattern b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    public static String a(String str, String str2) {
        if (str == null || str2 == null) {
            return null;
        }
        String[] strArrL = maf.L(str);
        StringBuilder sb = new StringBuilder();
        for (String str3 : strArrL) {
            if (str2.equals(c(str3))) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(str3);
            }
        }
        if (sb.length() > 0) {
            return sb.toString();
        }
        return null;
    }

    public static int b(String str, String str2) {
        jt jtVarE;
        str.getClass();
        switch (str) {
            case "audio/eac3-joc":
                return 18;
            case "audio/vnd.dts":
                return 7;
            case "audio/mp4a-latm":
                if (str2 == null || (jtVarE = e(str2)) == null) {
                    return 0;
                }
                return jtVarE.b();
            case "audio/ac3":
                return 5;
            case "audio/ac4":
                return 17;
            case "audio/eac3":
                return 6;
            case "audio/mpeg":
                return 9;
            case "audio/vnd.dts.hd":
                return 8;
            case "audio/true-hd":
                return 14;
            default:
                return 0;
        }
    }

    public static String c(String str) {
        jt jtVarE;
        String strD = null;
        if (str == null) {
            return null;
        }
        String strT = lz7.T(str.trim());
        if (strT.startsWith("avc1") || strT.startsWith("avc3")) {
            return "video/avc";
        }
        if (strT.startsWith("hev1") || strT.startsWith("hvc1")) {
            return "video/hevc";
        }
        if (strT.startsWith("dvav") || strT.startsWith("dva1") || strT.startsWith("dvhe") || strT.startsWith("dvh1")) {
            return "video/dolby-vision";
        }
        if (strT.startsWith("av01")) {
            return "video/av01";
        }
        if (strT.startsWith("vp9") || strT.startsWith("vp09")) {
            return "video/x-vnd.on2.vp9";
        }
        if (strT.startsWith("vp8") || strT.startsWith("vp08")) {
            return "video/x-vnd.on2.vp8";
        }
        if (strT.startsWith("mp4a")) {
            if (strT.startsWith("mp4a.") && (jtVarE = e(strT)) != null) {
                strD = d(jtVarE.b);
            }
            return strD == null ? "audio/mp4a-latm" : strD;
        }
        if (strT.startsWith("mha1")) {
            return "audio/mha1";
        }
        if (strT.startsWith("mhm1")) {
            return "audio/mhm1";
        }
        if (strT.startsWith("ac-3") || strT.startsWith("dac3")) {
            return "audio/ac3";
        }
        if (strT.startsWith("ec-3") || strT.startsWith("dec3")) {
            return "audio/eac3";
        }
        if (strT.startsWith("ec+3")) {
            return "audio/eac3-joc";
        }
        if (strT.startsWith("ac-4") || strT.startsWith("dac4")) {
            return "audio/ac4";
        }
        if (strT.startsWith("dtsc")) {
            return "audio/vnd.dts";
        }
        if (strT.startsWith("dtse")) {
            return "audio/vnd.dts.hd;profile=lbr";
        }
        if (strT.startsWith("dtsh") || strT.startsWith("dtsl")) {
            return "audio/vnd.dts.hd";
        }
        if (strT.startsWith("dtsx")) {
            return "audio/vnd.dts.uhd;profile=p2";
        }
        if (strT.startsWith("opus")) {
            return "audio/opus";
        }
        if (strT.startsWith("vorbis")) {
            return "audio/vorbis";
        }
        if (strT.startsWith("flac")) {
            return "audio/flac";
        }
        if (strT.startsWith("stpp")) {
            return "application/ttml+xml";
        }
        if (strT.startsWith("wvtt")) {
            return "text/vtt";
        }
        if (strT.contains("cea708")) {
            return "application/cea-708";
        }
        if (strT.contains("eia608") || strT.contains("cea608")) {
            return "application/cea-608";
        }
        ArrayList arrayList = a;
        if (arrayList.size() <= 0) {
            return null;
        }
        au1.r(arrayList.get(0));
        throw null;
    }

    public static String d(int i) {
        if (i == 32) {
            return "video/mp4v-es";
        }
        if (i == 33) {
            return "video/avc";
        }
        if (i == 35) {
            return "video/hevc";
        }
        if (i == 64) {
            return "audio/mp4a-latm";
        }
        if (i == 163) {
            return "video/wvc1";
        }
        if (i == 177) {
            return "video/x-vnd.on2.vp9";
        }
        if (i == 165) {
            return "audio/ac3";
        }
        if (i == 166) {
            return "audio/eac3";
        }
        switch (i) {
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case HttpStatus.SC_SWITCHING_PROTOCOLS /* 101 */:
                return "video/mpeg2";
            case HttpStatus.SC_PROCESSING /* 102 */:
            case 103:
            case 104:
                return "audio/mp4a-latm";
            case 105:
            case 107:
                return "audio/mpeg";
            case 106:
                return "video/mpeg";
            default:
                switch (i) {
                    case 169:
                    case 172:
                        return "audio/vnd.dts";
                    case 170:
                    case 171:
                        return "audio/vnd.dts.hd";
                    case 173:
                        return "audio/opus";
                    case 174:
                        return "audio/ac4";
                    default:
                        return null;
                }
        }
    }

    public static jt e(String str) {
        Matcher matcher = b.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        String strGroup2 = matcher.group(2);
        try {
            return new jt(Integer.parseInt(strGroup, 16), strGroup2 != null ? Integer.parseInt(strGroup2) : 0, 4);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static String f(String str) {
        int iIndexOf;
        if (str == null || (iIndexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, iIndexOf);
    }

    public static int g(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (h(str)) {
            return 1;
        }
        if (j(str)) {
            return 2;
        }
        if (i(str)) {
            return 3;
        }
        if ("image".equals(f(str))) {
            return 4;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str)) {
            return 5;
        }
        if ("application/x-camera-motion".equals(str)) {
            return 6;
        }
        ArrayList arrayList = a;
        if (arrayList.size() <= 0) {
            return -1;
        }
        au1.r(arrayList.get(0));
        throw null;
    }

    public static boolean h(String str) {
        return MediaStreamTrack.AUDIO_TRACK_KIND.equals(f(str));
    }

    public static boolean i(String str) {
        return "text".equals(f(str)) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str);
    }

    public static boolean j(String str) {
        return MediaStreamTrack.VIDEO_TRACK_KIND.equals(f(str));
    }
}
