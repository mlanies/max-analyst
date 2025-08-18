package defpackage;

import android.net.Uri;
import android.util.Base64;
import androidx.media3.common.ParserException;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.http.protocol.HTTP;

/* loaded from: classes.dex */
public final class cn6 implements zpa {
    public final ym6 a;
    public final qm6 b;
    public static final Pattern c = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");
    public static final Pattern o = Pattern.compile("VIDEO=\"(.+?)\"");
    public static final Pattern X = Pattern.compile("AUDIO=\"(.+?)\"");
    public static final Pattern Y = Pattern.compile("SUBTITLES=\"(.+?)\"");
    public static final Pattern Z = Pattern.compile("CLOSED-CAPTIONS=\"(.+?)\"");
    public static final Pattern s0 = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");
    public static final Pattern t0 = Pattern.compile("CHANNELS=\"(.+?)\"");
    public static final Pattern u0 = Pattern.compile("CODECS=\"(.+?)\"");
    public static final Pattern v0 = Pattern.compile("RESOLUTION=(\\d+x\\d+)");
    public static final Pattern w0 = Pattern.compile("FRAME-RATE=([\\d\\.]+)\\b");
    public static final Pattern x0 = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");
    public static final Pattern y0 = Pattern.compile("DURATION=([\\d\\.]+)\\b");
    public static final Pattern z0 = Pattern.compile("PART-TARGET=([\\d\\.]+)\\b");
    public static final Pattern A0 = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");
    public static final Pattern B0 = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");
    public static final Pattern C0 = Pattern.compile("CAN-SKIP-UNTIL=([\\d\\.]+)\\b");
    public static final Pattern D0 = b("CAN-SKIP-DATERANGES");
    public static final Pattern E0 = Pattern.compile("SKIPPED-SEGMENTS=(\\d+)\\b");
    public static final Pattern F0 = Pattern.compile("[:|,]HOLD-BACK=([\\d\\.]+)\\b");
    public static final Pattern G0 = Pattern.compile("PART-HOLD-BACK=([\\d\\.]+)\\b");
    public static final Pattern H0 = b("CAN-BLOCK-RELOAD");
    public static final Pattern I0 = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");
    public static final Pattern J0 = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");
    public static final Pattern K0 = Pattern.compile("#EXTINF:[\\d\\.]+\\b,(.+)");
    public static final Pattern L0 = Pattern.compile("LAST-MSN=(\\d+)\\b");
    public static final Pattern M0 = Pattern.compile("LAST-PART=(\\d+)\\b");
    public static final Pattern N0 = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");
    public static final Pattern O0 = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");
    public static final Pattern P0 = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");
    public static final Pattern Q0 = Pattern.compile("BYTERANGE-START=(\\d+)\\b");
    public static final Pattern R0 = Pattern.compile("BYTERANGE-LENGTH=(\\d+)\\b");
    public static final Pattern S0 = Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)");
    public static final Pattern T0 = Pattern.compile("KEYFORMAT=\"(.+?)\"");
    public static final Pattern U0 = Pattern.compile("KEYFORMATVERSIONS=\"(.+?)\"");
    public static final Pattern V0 = Pattern.compile("URI=\"(.+?)\"");
    public static final Pattern W0 = Pattern.compile("IV=([^,.*]+)");
    public static final Pattern X0 = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");
    public static final Pattern Y0 = Pattern.compile("TYPE=(PART|MAP)");
    public static final Pattern Z0 = Pattern.compile("LANGUAGE=\"(.+?)\"");
    public static final Pattern a1 = Pattern.compile("NAME=\"(.+?)\"");
    public static final Pattern b1 = Pattern.compile("GROUP-ID=\"(.+?)\"");
    public static final Pattern c1 = Pattern.compile("CHARACTERISTICS=\"(.+?)\"");
    public static final Pattern d1 = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");
    public static final Pattern e1 = b("AUTOSELECT");
    public static final Pattern f1 = b("DEFAULT");
    public static final Pattern g1 = b("FORCED");
    public static final Pattern h1 = b("INDEPENDENT");
    public static final Pattern i1 = b("GAP");
    public static final Pattern j1 = b("PRECISE");
    public static final Pattern k1 = Pattern.compile("VALUE=\"(.+?)\"");
    public static final Pattern l1 = Pattern.compile("IMPORT=\"(.+?)\"");
    public static final Pattern m1 = Pattern.compile("\\{\\$([a-zA-Z0-9\\-_]+)\\}");

    public cn6() {
        this(ym6.l, null);
    }

    public static Pattern b(String str) {
        return Pattern.compile(str.concat("=(NO|YES)"));
    }

    public static dr4 c(String str, br4[] br4VarArr) {
        br4[] br4VarArr2 = new br4[br4VarArr.length];
        for (int i = 0; i < br4VarArr.length; i++) {
            br4 br4Var = br4VarArr[i];
            br4VarArr2[i] = new br4(br4Var.b, br4Var.c, br4Var.o, null);
        }
        return new dr4(str, true, br4VarArr2);
    }

    public static br4 d(String str, String str2, HashMap map) throws ParserException {
        String strJ = j(str, U0, "1", map);
        boolean zEquals = "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed".equals(str2);
        Pattern pattern = V0;
        if (zEquals) {
            String strK = k(str, pattern, map);
            return new br4(ew0.d, null, "video/mp4", Base64.decode(strK.substring(strK.indexOf(44)), 0));
        }
        if ("com.widevine".equals(str2)) {
            UUID uuid = ew0.d;
            int i = oaf.a;
            return new br4(uuid, null, "hls", str.getBytes(b52.c));
        }
        if (!"com.microsoft.playready".equals(str2) || !"1".equals(strJ)) {
            return null;
        }
        String strK2 = k(str, pattern, map);
        byte[] bArrDecode = Base64.decode(strK2.substring(strK2.indexOf(44)), 0);
        UUID uuid2 = ew0.e;
        return new br4(uuid2, null, "video/mp4", mqd.b(uuid2, null, bArrDecode));
    }

    public static qm6 e(ym6 ym6Var, qm6 qm6Var, adb adbVar, String str) throws NumberFormatException, IOException {
        int i;
        String str2;
        HashMap map;
        HashMap map2;
        hm6 hm6Var;
        ArrayList arrayList;
        String str3;
        hm6 hm6Var2;
        int i2;
        String str4;
        HashMap map3;
        int i3;
        long j;
        long j2;
        HashMap map4;
        lm6 lm6Var;
        dr4 dr4Var;
        ym6 ym6Var2 = ym6Var;
        qm6 qm6Var2 = qm6Var;
        boolean z = ym6Var2.c;
        HashMap map5 = new HashMap();
        HashMap map6 = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        om6 om6Var = new om6(-9223372036854775807L, false, -9223372036854775807L, -9223372036854775807L, false);
        TreeMap treeMap = new TreeMap();
        String str5 = "";
        boolean z2 = z;
        om6 om6Var2 = om6Var;
        String strJ = "";
        long j3 = -1;
        int i4 = 0;
        boolean zG = false;
        long j4 = -9223372036854775807L;
        long jS = 0;
        boolean z3 = false;
        int i5 = 0;
        long j5 = 0;
        int i6 = 1;
        long j6 = -9223372036854775807L;
        long j7 = -9223372036854775807L;
        boolean z4 = false;
        dr4 dr4VarC = null;
        long j8 = 0;
        dr4 dr4Var2 = null;
        long j9 = 0;
        long j10 = 0;
        boolean z5 = false;
        String strK = null;
        String str6 = null;
        String str7 = null;
        int i7 = 0;
        long j11 = 0;
        boolean z6 = false;
        lm6 lm6Var2 = null;
        long jLongValue = 0;
        long j12 = 0;
        ArrayList arrayList6 = arrayList3;
        hm6 hm6Var3 = null;
        while (adbVar.r()) {
            String strU = adbVar.u();
            if (strU.startsWith("#EXT")) {
                arrayList5.add(strU);
            }
            if (strU.startsWith("#EXT-X-PLAYLIST-TYPE")) {
                String strK2 = k(strU, B0, map5);
                if ("VOD".equals(strK2)) {
                    i4 = 1;
                } else if ("EVENT".equals(strK2)) {
                    i4 = 2;
                }
            } else if (strU.equals("#EXT-X-I-FRAMES-ONLY")) {
                z6 = true;
            } else {
                if (strU.startsWith("#EXT-X-START")) {
                    str2 = str5;
                    long j13 = (long) (Double.parseDouble(k(strU, N0, Collections.emptyMap())) * 1000000.0d);
                    zG = g(strU, j1);
                    j4 = j13;
                } else {
                    str2 = str5;
                    if (strU.startsWith("#EXT-X-SERVER-CONTROL")) {
                        double dH = h(strU, C0);
                        long j14 = dH == -9.223372036854776E18d ? -9223372036854775807L : (long) (dH * 1000000.0d);
                        boolean zG2 = g(strU, D0);
                        double dH2 = h(strU, F0);
                        long j15 = dH2 == -9.223372036854776E18d ? -9223372036854775807L : (long) (dH2 * 1000000.0d);
                        double dH3 = h(strU, G0);
                        om6Var2 = new om6(j14, zG2, j15, dH3 == -9.223372036854776E18d ? -9223372036854775807L : (long) (dH3 * 1000000.0d), g(strU, H0));
                    } else if (strU.startsWith("#EXT-X-PART-INF")) {
                        j7 = (long) (Double.parseDouble(k(strU, z0, Collections.emptyMap())) * 1000000.0d);
                    } else {
                        boolean zStartsWith = strU.startsWith("#EXT-X-MAP");
                        Pattern pattern = P0;
                        boolean z7 = zG;
                        Pattern pattern2 = V0;
                        if (zStartsWith) {
                            String strK3 = k(strU, pattern2, map5);
                            String strJ2 = j(strU, pattern, null, map5);
                            if (strJ2 != null) {
                                int i8 = oaf.a;
                                String[] strArrSplit = strJ2.split("@", -1);
                                j3 = Long.parseLong(strArrSplit[0]);
                                if (strArrSplit.length > 1) {
                                    j8 = Long.parseLong(strArrSplit[1]);
                                }
                            }
                            if (j3 == -1) {
                                j8 = 0;
                            }
                            if (strK != null && str6 == null) {
                                throw ParserException.b(null, "The encryption IV attribute must be present when an initialization segment is encrypted with METHOD=AES-128.");
                            }
                            lm6Var2 = new lm6(j8, j3, strK3, strK, str6);
                            if (j3 != -1) {
                                j8 += j3;
                            }
                            j3 = -1;
                            str5 = str2;
                            zG = z7;
                        } else {
                            ArrayList arrayList7 = arrayList6;
                            ArrayList arrayList8 = arrayList5;
                            if (strU.startsWith("#EXT-X-TARGETDURATION")) {
                                j6 = Integer.parseInt(k(strU, x0, Collections.emptyMap())) * 1000000;
                            } else if (strU.startsWith("#EXT-X-MEDIA-SEQUENCE")) {
                                j9 = Long.parseLong(k(strU, I0, Collections.emptyMap()));
                                j5 = j9;
                            } else if (strU.startsWith("#EXT-X-VERSION")) {
                                i6 = Integer.parseInt(k(strU, A0, Collections.emptyMap()));
                            } else {
                                if (strU.startsWith("#EXT-X-DEFINE")) {
                                    String strJ3 = j(strU, l1, null, map5);
                                    if (strJ3 != null) {
                                        String str8 = (String) ym6Var2.j.get(strJ3);
                                        if (str8 != null) {
                                            map5.put(strJ3, str8);
                                        }
                                    } else {
                                        map5.put(k(strU, a1, map5), k(strU, k1, map5));
                                    }
                                    map = map5;
                                    map2 = map6;
                                    hm6Var = hm6Var3;
                                    arrayList = arrayList7;
                                    str3 = str7;
                                } else if (strU.startsWith("#EXTINF")) {
                                    jLongValue = new BigDecimal(k(strU, J0, Collections.emptyMap())).multiply(new BigDecimal(1000000L)).longValue();
                                    strJ = j(strU, K0, str2, map5);
                                    str5 = str2;
                                    arrayList6 = arrayList7;
                                    zG = z7;
                                    arrayList5 = arrayList8;
                                } else {
                                    String str9 = str2;
                                    if (strU.startsWith("#EXT-X-SKIP")) {
                                        int i9 = Integer.parseInt(k(strU, E0, Collections.emptyMap()));
                                        fm9.k(qm6Var2 != null && arrayList2.isEmpty());
                                        int i10 = oaf.a;
                                        int i11 = (int) (j5 - qm6Var2.k);
                                        int i12 = i9 + i11;
                                        if (i11 >= 0) {
                                            zw6 zw6Var = qm6Var2.r;
                                            if (i12 <= zw6Var.size()) {
                                                while (i11 < i12) {
                                                    lm6 lm6Var3 = (lm6) zw6Var.get(i11);
                                                    if (j5 != qm6Var2.k) {
                                                        int i13 = (qm6Var2.j - i5) + lm6Var3.o;
                                                        ArrayList arrayList9 = new ArrayList();
                                                        long j16 = j11;
                                                        int i14 = 0;
                                                        while (true) {
                                                            zw6 zw6Var2 = lm6Var3.x0;
                                                            i2 = i12;
                                                            if (i14 >= zw6Var2.size()) {
                                                                break;
                                                            }
                                                            hm6 hm6Var4 = (hm6) zw6Var2.get(i14);
                                                            arrayList9.add(new hm6(hm6Var4.a, hm6Var4.b, hm6Var4.c, i13, j16, hm6Var4.Y, hm6Var4.Z, hm6Var4.s0, hm6Var4.t0, hm6Var4.u0, hm6Var4.v0, hm6Var4.w0, hm6Var4.x0));
                                                            j16 += hm6Var4.c;
                                                            i14++;
                                                            map6 = map6;
                                                            i12 = i2;
                                                            str9 = str9;
                                                            hm6Var3 = hm6Var3;
                                                        }
                                                        hm6Var2 = hm6Var3;
                                                        str4 = str9;
                                                        map3 = map6;
                                                        lm6Var3 = new lm6(lm6Var3.a, lm6Var3.b, lm6Var3.w0, lm6Var3.c, i13, j11, lm6Var3.Y, lm6Var3.Z, lm6Var3.s0, lm6Var3.t0, lm6Var3.u0, lm6Var3.v0, arrayList9);
                                                    } else {
                                                        hm6Var2 = hm6Var3;
                                                        i2 = i12;
                                                        str4 = str9;
                                                        map3 = map6;
                                                    }
                                                    arrayList2.add(lm6Var3);
                                                    j11 += lm6Var3.c;
                                                    long j17 = lm6Var3.u0;
                                                    if (j17 != -1) {
                                                        j8 = lm6Var3.t0 + j17;
                                                    }
                                                    String str10 = lm6Var3.s0;
                                                    if (str10 == null || !str10.equals(Long.toHexString(j9))) {
                                                        str6 = str10;
                                                    }
                                                    j9++;
                                                    i11++;
                                                    i7 = lm6Var3.o;
                                                    lm6Var2 = lm6Var3.b;
                                                    dr4Var2 = lm6Var3.Y;
                                                    strK = lm6Var3.Z;
                                                    map6 = map3;
                                                    i12 = i2;
                                                    j10 = j11;
                                                    str9 = str4;
                                                    hm6Var3 = hm6Var2;
                                                    qm6Var2 = qm6Var;
                                                }
                                                str2 = str9;
                                                ym6Var2 = ym6Var;
                                                qm6Var2 = qm6Var;
                                            }
                                        }
                                        throw new IOException() { // from class: androidx.media3.exoplayer.hls.playlist.HlsPlaylistParser$DeltaUpdateException
                                        };
                                    }
                                    hm6Var = hm6Var3;
                                    str2 = str9;
                                    HashMap map7 = map6;
                                    if (strU.startsWith("#EXT-X-KEY")) {
                                        String strK4 = k(strU, S0, map5);
                                        String strJ4 = j(strU, T0, HTTP.IDENTITY_CODING, map5);
                                        if ("NONE".equals(strK4)) {
                                            treeMap.clear();
                                            dr4Var2 = null;
                                            strK = null;
                                            str6 = null;
                                        } else {
                                            String strJ5 = j(strU, W0, null, map5);
                                            if (!HTTP.IDENTITY_CODING.equals(strJ4)) {
                                                String str11 = str7;
                                                if (str11 == null) {
                                                    str7 = ("SAMPLE-AES-CENC".equals(strK4) || "SAMPLE-AES-CTR".equals(strK4)) ? "cenc" : "cbcs";
                                                } else {
                                                    str7 = str11;
                                                }
                                                br4 br4VarD = d(strU, strJ4, map5);
                                                if (br4VarD != null) {
                                                    treeMap.put(strJ4, br4VarD);
                                                    str6 = strJ5;
                                                    dr4Var2 = null;
                                                }
                                                strK = null;
                                            } else if ("AES-128".equals(strK4)) {
                                                strK = k(strU, pattern2, map5);
                                                str6 = strJ5;
                                            }
                                            str6 = strJ5;
                                            strK = null;
                                        }
                                        ym6Var2 = ym6Var;
                                        qm6Var2 = qm6Var;
                                        map6 = map7;
                                    } else {
                                        str3 = str7;
                                        if (strU.startsWith("#EXT-X-BYTERANGE")) {
                                            String strK5 = k(strU, O0, map5);
                                            int i15 = oaf.a;
                                            String[] strArrSplit2 = strK5.split("@", -1);
                                            j3 = Long.parseLong(strArrSplit2[0]);
                                            if (strArrSplit2.length > 1) {
                                                j8 = Long.parseLong(strArrSplit2[1]);
                                            }
                                        } else if (strU.startsWith("#EXT-X-DISCONTINUITY-SEQUENCE")) {
                                            i5 = Integer.parseInt(strU.substring(strU.indexOf(58) + 1));
                                            ym6Var2 = ym6Var;
                                            qm6Var2 = qm6Var;
                                            z3 = true;
                                            map6 = map7;
                                            str7 = str3;
                                        } else if (strU.equals("#EXT-X-DISCONTINUITY")) {
                                            i7++;
                                        } else if (strU.startsWith("#EXT-X-PROGRAM-DATE-TIME")) {
                                            if (jS == 0) {
                                                jS = oaf.S(oaf.V(strU.substring(strU.indexOf(58) + 1))) - j11;
                                            } else {
                                                map = map5;
                                                arrayList = arrayList7;
                                                map2 = map7;
                                            }
                                        } else if (strU.equals("#EXT-X-GAP")) {
                                            ym6Var2 = ym6Var;
                                            qm6Var2 = qm6Var;
                                            map6 = map7;
                                            str7 = str3;
                                            arrayList6 = arrayList7;
                                            str5 = str2;
                                            zG = z7;
                                            arrayList5 = arrayList8;
                                            hm6Var3 = hm6Var;
                                            z5 = true;
                                        } else if (strU.equals("#EXT-X-INDEPENDENT-SEGMENTS")) {
                                            ym6Var2 = ym6Var;
                                            qm6Var2 = qm6Var;
                                            map6 = map7;
                                            str7 = str3;
                                            arrayList6 = arrayList7;
                                            str5 = str2;
                                            zG = z7;
                                            arrayList5 = arrayList8;
                                            hm6Var3 = hm6Var;
                                            z2 = true;
                                        } else if (strU.equals("#EXT-X-ENDLIST")) {
                                            ym6Var2 = ym6Var;
                                            qm6Var2 = qm6Var;
                                            map6 = map7;
                                            str7 = str3;
                                            arrayList6 = arrayList7;
                                            str5 = str2;
                                            zG = z7;
                                            arrayList5 = arrayList8;
                                            hm6Var3 = hm6Var;
                                            z4 = true;
                                        } else {
                                            if (strU.startsWith("#EXT-X-RENDITION-REPORT")) {
                                                long jI = i(strU, L0);
                                                Matcher matcher = M0.matcher(strU);
                                                if (matcher.find()) {
                                                    String strGroup = matcher.group(1);
                                                    strGroup.getClass();
                                                    i3 = Integer.parseInt(strGroup);
                                                } else {
                                                    i3 = -1;
                                                }
                                                arrayList4.add(new jm6(Uri.parse(mr0.R(str, k(strU, pattern2, map5))), jI, i3));
                                            } else if (strU.startsWith("#EXT-X-PRELOAD-HINT")) {
                                                if (hm6Var == null && "PART".equals(k(strU, Y0, map5))) {
                                                    String strK6 = k(strU, pattern2, map5);
                                                    long jI2 = i(strU, Q0);
                                                    long jI3 = i(strU, R0);
                                                    String hexString = strK == null ? null : str6 != null ? str6 : Long.toHexString(j9);
                                                    if (dr4Var2 == null && !treeMap.isEmpty()) {
                                                        br4[] br4VarArr = (br4[]) treeMap.values().toArray(new br4[0]);
                                                        dr4 dr4Var3 = new dr4(str3, true, br4VarArr);
                                                        if (dr4VarC == null) {
                                                            dr4VarC = c(str3, br4VarArr);
                                                        }
                                                        dr4Var2 = dr4Var3;
                                                    }
                                                    if (jI2 == -1 || jI3 != -1) {
                                                        hm6Var = new hm6(strK6, lm6Var2, 0L, i7, j10, dr4Var2, strK, hexString, jI2 != -1 ? jI2 : 0L, jI3, false, false, true);
                                                    }
                                                }
                                            } else if (strU.startsWith("#EXT-X-PART")) {
                                                String hexString2 = strK == null ? null : str6 != null ? str6 : Long.toHexString(j9);
                                                String strK7 = k(strU, pattern2, map5);
                                                long j18 = (long) (Double.parseDouble(k(strU, y0, Collections.emptyMap())) * 1000000.0d);
                                                boolean zG3 = g(strU, h1) | (z2 && arrayList7.isEmpty());
                                                boolean zG4 = g(strU, i1);
                                                String strJ6 = j(strU, pattern, null, map5);
                                                if (strJ6 != null) {
                                                    int i16 = oaf.a;
                                                    String[] strArrSplit3 = strJ6.split("@", -1);
                                                    j = Long.parseLong(strArrSplit3[0]);
                                                    if (strArrSplit3.length > 1) {
                                                        j12 = Long.parseLong(strArrSplit3[1]);
                                                    }
                                                } else {
                                                    j = -1;
                                                }
                                                if (j == -1) {
                                                    j12 = 0;
                                                }
                                                if (dr4Var2 == null && !treeMap.isEmpty()) {
                                                    br4[] br4VarArr2 = (br4[]) treeMap.values().toArray(new br4[0]);
                                                    dr4 dr4Var4 = new dr4(str3, true, br4VarArr2);
                                                    if (dr4VarC == null) {
                                                        dr4VarC = c(str3, br4VarArr2);
                                                    }
                                                    dr4Var2 = dr4Var4;
                                                }
                                                arrayList7.add(new hm6(strK7, lm6Var2, j18, i7, j10, dr4Var2, strK, hexString2, j12, j, zG4, zG3, false));
                                                j10 += j18;
                                                if (j != -1) {
                                                    j12 += j;
                                                }
                                                ym6Var2 = ym6Var;
                                                qm6Var2 = qm6Var;
                                                map6 = map7;
                                                str7 = str3;
                                                arrayList6 = arrayList7;
                                                str5 = str2;
                                                zG = z7;
                                                arrayList5 = arrayList8;
                                                hm6Var3 = hm6Var;
                                            } else {
                                                arrayList = arrayList7;
                                                if (strU.startsWith("#")) {
                                                    map = map5;
                                                    map2 = map7;
                                                } else {
                                                    String hexString3 = strK == null ? null : str6 != null ? str6 : Long.toHexString(j9);
                                                    long j19 = j9 + 1;
                                                    String strL = l(strU, map5);
                                                    lm6 lm6Var4 = (lm6) map7.get(strL);
                                                    if (j3 == -1) {
                                                        j2 = 0;
                                                    } else {
                                                        if (z6 && lm6Var2 == null && lm6Var4 == null) {
                                                            lm6Var4 = new lm6(0L, j8, strL, null, null);
                                                            map7.put(strL, lm6Var4);
                                                        }
                                                        j2 = j8;
                                                    }
                                                    if (dr4Var2 != null || treeMap.isEmpty()) {
                                                        map4 = map5;
                                                        lm6Var = lm6Var4;
                                                        dr4Var = dr4Var2;
                                                    } else {
                                                        map4 = map5;
                                                        lm6Var = lm6Var4;
                                                        br4[] br4VarArr3 = (br4[]) treeMap.values().toArray(new br4[0]);
                                                        dr4Var = new dr4(str3, true, br4VarArr3);
                                                        if (dr4VarC == null) {
                                                            dr4VarC = c(str3, br4VarArr3);
                                                        }
                                                    }
                                                    arrayList2.add(new lm6(strL, lm6Var2 != null ? lm6Var2 : lm6Var, strJ, jLongValue, i7, j11, dr4Var, strK, hexString3, j2, j3, z5, arrayList));
                                                    j10 = j11 + jLongValue;
                                                    ArrayList arrayList10 = new ArrayList();
                                                    if (j3 != -1) {
                                                        j2 += j3;
                                                    }
                                                    j8 = j2;
                                                    qm6Var2 = qm6Var;
                                                    arrayList6 = arrayList10;
                                                    map6 = map7;
                                                    str7 = str3;
                                                    dr4Var2 = dr4Var;
                                                    j3 = -1;
                                                    j11 = j10;
                                                    j9 = j19;
                                                    map5 = map4;
                                                    str5 = str2;
                                                    strJ = str5;
                                                    zG = z7;
                                                    arrayList5 = arrayList8;
                                                    hm6Var3 = hm6Var;
                                                    z5 = false;
                                                    jLongValue = 0;
                                                    ym6Var2 = ym6Var;
                                                }
                                            }
                                            map = map5;
                                            arrayList = arrayList7;
                                            map2 = map7;
                                        }
                                        ym6Var2 = ym6Var;
                                        qm6Var2 = qm6Var;
                                        map6 = map7;
                                        str7 = str3;
                                    }
                                    arrayList6 = arrayList7;
                                    str5 = str2;
                                    zG = z7;
                                    arrayList5 = arrayList8;
                                    hm6Var3 = hm6Var;
                                }
                                ym6Var2 = ym6Var;
                                qm6Var2 = qm6Var;
                                map6 = map2;
                                str7 = str3;
                                arrayList6 = arrayList;
                                map5 = map;
                                str5 = str2;
                                zG = z7;
                                arrayList5 = arrayList8;
                                hm6Var3 = hm6Var;
                            }
                            arrayList6 = arrayList7;
                            str5 = str2;
                            zG = z7;
                            arrayList5 = arrayList8;
                        }
                    }
                }
                str5 = str2;
            }
        }
        hm6 hm6Var5 = hm6Var3;
        ArrayList arrayList11 = arrayList6;
        ArrayList arrayList12 = arrayList5;
        boolean z8 = zG;
        HashMap map8 = new HashMap();
        int i17 = 0;
        while (i17 < arrayList4.size()) {
            jm6 jm6Var = (jm6) arrayList4.get(i17);
            long size = jm6Var.b;
            if (size == -1) {
                size = (j5 + arrayList2.size()) - (arrayList11.isEmpty() ? 1L : 0L);
            }
            int size2 = jm6Var.c;
            if (size2 != -1 || j7 == -9223372036854775807L) {
                i = 1;
            } else {
                i = 1;
                size2 = (arrayList11.isEmpty() ? ((lm6) mqd.m(arrayList2)).x0 : arrayList11).size() - 1;
            }
            Uri uri = jm6Var.a;
            map8.put(uri, new jm6(uri, size, size2));
            i17 += i;
        }
        if (hm6Var5 != null) {
            arrayList11.add(hm6Var5);
        }
        return new qm6(i4, str, arrayList12, j4, z8, jS, z3, i5, j5, i6, j6, j7, z2, z4, jS != 0, dr4VarC, arrayList2, arrayList11, om6Var2, map8);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:127:0x03b1. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01fc  */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v32 */
    /* JADX WARN: Type inference failed for: r13v33 */
    /* JADX WARN: Type inference failed for: r13v9, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.ym6 f(defpackage.adb r38, java.lang.String r39) throws java.io.IOException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 1446
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cn6.f(adb, java.lang.String):ym6");
    }

    public static boolean g(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            return "YES".equals(matcher.group(1));
        }
        return false;
    }

    public static double h(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            return -9.223372036854776E18d;
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        return Double.parseDouble(strGroup);
    }

    public static long i(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            return -1L;
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        return Long.parseLong(strGroup);
    }

    public static String j(String str, Pattern pattern, String str2, Map map) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            str2 = matcher.group(1);
            str2.getClass();
        }
        return (map.isEmpty() || str2 == null) ? str2 : l(str2, map);
    }

    public static String k(String str, Pattern pattern, Map map) throws ParserException {
        String strJ = j(str, pattern, null, map);
        if (strJ != null) {
            return strJ;
        }
        throw ParserException.b(null, "Couldn't match " + pattern.pattern() + " in " + str);
    }

    public static String l(String str, Map map) {
        Matcher matcher = m1.matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            String strGroup = matcher.group(1);
            if (map.containsKey(strGroup)) {
                matcher.appendReplacement(stringBuffer, Matcher.quoteReplacement((String) map.get(strGroup)));
            }
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003f A[Catch: all -> 0x0096, TryCatch #0 {all -> 0x0096, blocks: (B:3:0x000f, B:5:0x0018, B:7:0x0020, B:10:0x0029, B:32:0x0069, B:34:0x006f, B:37:0x007a, B:39:0x0082, B:43:0x0098, B:45:0x00a0, B:47:0x00a8, B:49:0x00b0, B:51:0x00b8, B:53:0x00c0, B:55:0x00c8, B:57:0x00d0, B:60:0x00d9, B:61:0x00dd, B:66:0x00fd, B:67:0x0103, B:13:0x0030, B:15:0x0036, B:19:0x003f, B:22:0x0048, B:24:0x0051, B:26:0x0057, B:28:0x005d, B:29:0x0062), top: B:70:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x004f A[SYNTHETIC] */
    @Override // defpackage.zpa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(android.net.Uri r7, defpackage.w24 r8) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cn6.a(android.net.Uri, w24):java.lang.Object");
    }

    public cn6(ym6 ym6Var, qm6 qm6Var) {
        this.a = ym6Var;
        this.b = qm6Var;
    }
}
