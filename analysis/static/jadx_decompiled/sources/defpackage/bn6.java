package defpackage;

import android.net.Uri;
import android.util.Base64;
import com.google.android.exoplayer2.ParserException;
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
public final class bn6 implements ypa {
    public final xm6 a;
    public final pm6 b;
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
    public static final Pattern D0 = a("CAN-SKIP-DATERANGES");
    public static final Pattern E0 = Pattern.compile("SKIPPED-SEGMENTS=(\\d+)\\b");
    public static final Pattern F0 = Pattern.compile("[:|,]HOLD-BACK=([\\d\\.]+)\\b");
    public static final Pattern G0 = Pattern.compile("PART-HOLD-BACK=([\\d\\.]+)\\b");
    public static final Pattern H0 = a("CAN-BLOCK-RELOAD");
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
    public static final Pattern e1 = a("AUTOSELECT");
    public static final Pattern f1 = a("DEFAULT");
    public static final Pattern g1 = a("FORCED");
    public static final Pattern h1 = a("INDEPENDENT");
    public static final Pattern i1 = a("GAP");
    public static final Pattern j1 = a("PRECISE");
    public static final Pattern k1 = Pattern.compile("VALUE=\"(.+?)\"");
    public static final Pattern l1 = Pattern.compile("IMPORT=\"(.+?)\"");
    public static final Pattern m1 = Pattern.compile("\\{\\$([a-zA-Z0-9\\-_]+)\\}");

    public bn6(xm6 xm6Var, pm6 pm6Var) {
        this.a = xm6Var;
        this.b = pm6Var;
    }

    public static Pattern a(String str) {
        StringBuilder sb = new StringBuilder(str.length() + 9);
        sb.append(str);
        sb.append("=(NO|YES)");
        return Pattern.compile(sb.toString());
    }

    public static cr4 b(String str, ar4[] ar4VarArr) {
        ar4[] ar4VarArr2 = new ar4[ar4VarArr.length];
        for (int i = 0; i < ar4VarArr.length; i++) {
            ar4 ar4Var = ar4VarArr[i];
            ar4VarArr2[i] = new ar4(ar4Var.b, ar4Var.c, ar4Var.o, null);
        }
        return new cr4(str, true, ar4VarArr2);
    }

    public static ar4 c(String str, String str2, HashMap map) throws ParserException {
        String strJ = j(str, U0, "1", map);
        boolean zEquals = "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed".equals(str2);
        Pattern pattern = V0;
        if (zEquals) {
            String strK = k(str, pattern, map);
            return new ar4(bw0.d, null, "video/mp4", Base64.decode(strK.substring(strK.indexOf(44)), 0));
        }
        if ("com.widevine".equals(str2)) {
            UUID uuid = bw0.d;
            int i = maf.a;
            return new ar4(uuid, null, "hls", str.getBytes(b52.c));
        }
        if (!"com.microsoft.playready".equals(str2) || !"1".equals(strJ)) {
            return null;
        }
        String strK2 = k(str, pattern, map);
        byte[] bArrDecode = Base64.decode(strK2.substring(strK2.indexOf(44)), 0);
        UUID uuid2 = bw0.e;
        return new ar4(uuid2, null, "video/mp4", wmd.e(uuid2, null, bArrDecode));
    }

    public static pm6 d(xm6 xm6Var, pm6 pm6Var, pl8 pl8Var, String str) throws NumberFormatException, IOException {
        int i;
        String str2;
        HashMap map;
        HashMap map2;
        gm6 gm6Var;
        ArrayList arrayList;
        String str3;
        gm6 gm6Var2;
        int i2;
        String str4;
        HashMap map3;
        int i3;
        long j;
        long j2;
        HashMap map4;
        km6 km6Var;
        cr4 cr4Var;
        xm6 xm6Var2 = xm6Var;
        pm6 pm6Var2 = pm6Var;
        boolean z = xm6Var2.c;
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
        boolean zF = false;
        long j4 = -9223372036854775807L;
        long jD = 0;
        boolean z3 = false;
        int i5 = 0;
        long j5 = 0;
        int i6 = 1;
        long j6 = -9223372036854775807L;
        long j7 = -9223372036854775807L;
        boolean z4 = false;
        cr4 cr4VarB = null;
        long j8 = 0;
        cr4 cr4Var2 = null;
        long j9 = 0;
        long j10 = 0;
        boolean z5 = false;
        String strK = null;
        String str6 = null;
        String str7 = null;
        int i7 = 0;
        long j11 = 0;
        boolean z6 = false;
        km6 km6Var2 = null;
        long jLongValue = 0;
        long j12 = 0;
        ArrayList arrayList6 = arrayList3;
        gm6 gm6Var3 = null;
        while (pl8Var.B()) {
            String strD = pl8Var.D();
            if (strD.startsWith("#EXT")) {
                arrayList5.add(strD);
            }
            if (strD.startsWith("#EXT-X-PLAYLIST-TYPE")) {
                String strK2 = k(strD, B0, map5);
                if ("VOD".equals(strK2)) {
                    i4 = 1;
                } else if ("EVENT".equals(strK2)) {
                    i4 = 2;
                }
            } else if (strD.equals("#EXT-X-I-FRAMES-ONLY")) {
                z6 = true;
            } else {
                if (strD.startsWith("#EXT-X-START")) {
                    str2 = str5;
                    long j13 = (long) (Double.parseDouble(k(strD, N0, Collections.emptyMap())) * 1000000.0d);
                    zF = f(strD, j1);
                    j4 = j13;
                } else {
                    str2 = str5;
                    if (strD.startsWith("#EXT-X-SERVER-CONTROL")) {
                        double dH = h(strD, C0);
                        long j14 = dH == -9.223372036854776E18d ? -9223372036854775807L : (long) (dH * 1000000.0d);
                        boolean zF2 = f(strD, D0);
                        double dH2 = h(strD, F0);
                        long j15 = dH2 == -9.223372036854776E18d ? -9223372036854775807L : (long) (dH2 * 1000000.0d);
                        double dH3 = h(strD, G0);
                        om6Var2 = new om6(j14, zF2, j15, dH3 == -9.223372036854776E18d ? -9223372036854775807L : (long) (dH3 * 1000000.0d), f(strD, H0));
                    } else if (strD.startsWith("#EXT-X-PART-INF")) {
                        j7 = (long) (Double.parseDouble(k(strD, z0, Collections.emptyMap())) * 1000000.0d);
                    } else {
                        boolean zStartsWith = strD.startsWith("#EXT-X-MAP");
                        Pattern pattern = P0;
                        boolean z7 = zF;
                        Pattern pattern2 = V0;
                        if (zStartsWith) {
                            String strK3 = k(strD, pattern2, map5);
                            String strJ2 = j(strD, pattern, null, map5);
                            if (strJ2 != null) {
                                int i8 = maf.a;
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
                            km6Var2 = new km6(j8, j3, strK3, strK, str6);
                            if (j3 != -1) {
                                j8 += j3;
                            }
                            j3 = -1;
                            str5 = str2;
                            zF = z7;
                        } else {
                            ArrayList arrayList7 = arrayList6;
                            ArrayList arrayList8 = arrayList5;
                            if (strD.startsWith("#EXT-X-TARGETDURATION")) {
                                j6 = Integer.parseInt(k(strD, x0, Collections.emptyMap())) * 1000000;
                            } else if (strD.startsWith("#EXT-X-MEDIA-SEQUENCE")) {
                                j9 = Long.parseLong(k(strD, I0, Collections.emptyMap()));
                                j5 = j9;
                            } else if (strD.startsWith("#EXT-X-VERSION")) {
                                i6 = Integer.parseInt(k(strD, A0, Collections.emptyMap()));
                            } else {
                                if (strD.startsWith("#EXT-X-DEFINE")) {
                                    String strJ3 = j(strD, l1, null, map5);
                                    if (strJ3 != null) {
                                        String str8 = (String) xm6Var2.l.get(strJ3);
                                        if (str8 != null) {
                                            map5.put(strJ3, str8);
                                        }
                                    } else {
                                        map5.put(k(strD, a1, map5), k(strD, k1, map5));
                                    }
                                    map = map5;
                                    map2 = map6;
                                    gm6Var = gm6Var3;
                                    arrayList = arrayList7;
                                    str3 = str7;
                                } else if (strD.startsWith("#EXTINF")) {
                                    jLongValue = new BigDecimal(k(strD, J0, Collections.emptyMap())).multiply(new BigDecimal(1000000L)).longValue();
                                    strJ = j(strD, K0, str2, map5);
                                    str5 = str2;
                                    arrayList6 = arrayList7;
                                    zF = z7;
                                    arrayList5 = arrayList8;
                                } else {
                                    String str9 = str2;
                                    if (strD.startsWith("#EXT-X-SKIP")) {
                                        int i9 = Integer.parseInt(k(strD, E0, Collections.emptyMap()));
                                        np8.f(pm6Var2 != null && arrayList2.isEmpty());
                                        int i10 = maf.a;
                                        int i11 = (int) (j5 - pm6Var2.k);
                                        int i12 = i9 + i11;
                                        if (i11 >= 0) {
                                            zw6 zw6Var = pm6Var2.r;
                                            if (i12 <= zw6Var.size()) {
                                                while (i11 < i12) {
                                                    km6 km6Var3 = (km6) zw6Var.get(i11);
                                                    if (j5 != pm6Var2.k) {
                                                        int i13 = (pm6Var2.j - i5) + km6Var3.o;
                                                        ArrayList arrayList9 = new ArrayList();
                                                        long j16 = j11;
                                                        int i14 = 0;
                                                        while (true) {
                                                            zw6 zw6Var2 = km6Var3.x0;
                                                            i2 = i12;
                                                            if (i14 >= zw6Var2.size()) {
                                                                break;
                                                            }
                                                            gm6 gm6Var4 = (gm6) zw6Var2.get(i14);
                                                            arrayList9.add(new gm6(gm6Var4.a, gm6Var4.b, gm6Var4.c, i13, j16, gm6Var4.Y, gm6Var4.Z, gm6Var4.s0, gm6Var4.t0, gm6Var4.u0, gm6Var4.v0, gm6Var4.w0, gm6Var4.x0));
                                                            j16 += gm6Var4.c;
                                                            i14++;
                                                            map6 = map6;
                                                            i12 = i2;
                                                            str9 = str9;
                                                            gm6Var3 = gm6Var3;
                                                        }
                                                        gm6Var2 = gm6Var3;
                                                        str4 = str9;
                                                        map3 = map6;
                                                        km6Var3 = new km6(km6Var3.a, km6Var3.b, km6Var3.w0, km6Var3.c, i13, j11, km6Var3.Y, km6Var3.Z, km6Var3.s0, km6Var3.t0, km6Var3.u0, km6Var3.v0, arrayList9);
                                                    } else {
                                                        gm6Var2 = gm6Var3;
                                                        i2 = i12;
                                                        str4 = str9;
                                                        map3 = map6;
                                                    }
                                                    arrayList2.add(km6Var3);
                                                    j11 += km6Var3.c;
                                                    long j17 = km6Var3.u0;
                                                    if (j17 != -1) {
                                                        j8 = km6Var3.t0 + j17;
                                                    }
                                                    String str10 = km6Var3.s0;
                                                    if (str10 == null || !str10.equals(Long.toHexString(j9))) {
                                                        str6 = str10;
                                                    }
                                                    j9++;
                                                    i11++;
                                                    i7 = km6Var3.o;
                                                    km6Var2 = km6Var3.b;
                                                    cr4Var2 = km6Var3.Y;
                                                    strK = km6Var3.Z;
                                                    map6 = map3;
                                                    i12 = i2;
                                                    j10 = j11;
                                                    str9 = str4;
                                                    gm6Var3 = gm6Var2;
                                                    pm6Var2 = pm6Var;
                                                }
                                                str2 = str9;
                                                xm6Var2 = xm6Var;
                                                pm6Var2 = pm6Var;
                                            }
                                        }
                                        throw new IOException() { // from class: com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser$DeltaUpdateException
                                        };
                                    }
                                    gm6Var = gm6Var3;
                                    str2 = str9;
                                    HashMap map7 = map6;
                                    if (strD.startsWith("#EXT-X-KEY")) {
                                        String strK4 = k(strD, S0, map5);
                                        String strJ4 = j(strD, T0, HTTP.IDENTITY_CODING, map5);
                                        if ("NONE".equals(strK4)) {
                                            treeMap.clear();
                                            cr4Var2 = null;
                                            strK = null;
                                            str6 = null;
                                        } else {
                                            String strJ5 = j(strD, W0, null, map5);
                                            if (!HTTP.IDENTITY_CODING.equals(strJ4)) {
                                                String str11 = str7;
                                                if (str11 == null) {
                                                    str7 = ("SAMPLE-AES-CENC".equals(strK4) || "SAMPLE-AES-CTR".equals(strK4)) ? "cenc" : "cbcs";
                                                } else {
                                                    str7 = str11;
                                                }
                                                ar4 ar4VarC = c(strD, strJ4, map5);
                                                if (ar4VarC != null) {
                                                    treeMap.put(strJ4, ar4VarC);
                                                    str6 = strJ5;
                                                    cr4Var2 = null;
                                                }
                                                strK = null;
                                            } else if ("AES-128".equals(strK4)) {
                                                strK = k(strD, pattern2, map5);
                                                str6 = strJ5;
                                            }
                                            str6 = strJ5;
                                            strK = null;
                                        }
                                        xm6Var2 = xm6Var;
                                        pm6Var2 = pm6Var;
                                        map6 = map7;
                                    } else {
                                        str3 = str7;
                                        if (strD.startsWith("#EXT-X-BYTERANGE")) {
                                            String strK5 = k(strD, O0, map5);
                                            int i15 = maf.a;
                                            String[] strArrSplit2 = strK5.split("@", -1);
                                            j3 = Long.parseLong(strArrSplit2[0]);
                                            if (strArrSplit2.length > 1) {
                                                j8 = Long.parseLong(strArrSplit2[1]);
                                            }
                                        } else if (strD.startsWith("#EXT-X-DISCONTINUITY-SEQUENCE")) {
                                            i5 = Integer.parseInt(strD.substring(strD.indexOf(58) + 1));
                                            xm6Var2 = xm6Var;
                                            pm6Var2 = pm6Var;
                                            z3 = true;
                                            map6 = map7;
                                            str7 = str3;
                                        } else if (strD.equals("#EXT-X-DISCONTINUITY")) {
                                            i7++;
                                        } else if (strD.startsWith("#EXT-X-PROGRAM-DATE-TIME")) {
                                            if (jD == 0) {
                                                jD = maf.D(maf.G(strD.substring(strD.indexOf(58) + 1))) - j11;
                                            } else {
                                                map = map5;
                                                arrayList = arrayList7;
                                                map2 = map7;
                                            }
                                        } else if (strD.equals("#EXT-X-GAP")) {
                                            xm6Var2 = xm6Var;
                                            pm6Var2 = pm6Var;
                                            map6 = map7;
                                            str7 = str3;
                                            arrayList6 = arrayList7;
                                            str5 = str2;
                                            zF = z7;
                                            arrayList5 = arrayList8;
                                            gm6Var3 = gm6Var;
                                            z5 = true;
                                        } else if (strD.equals("#EXT-X-INDEPENDENT-SEGMENTS")) {
                                            xm6Var2 = xm6Var;
                                            pm6Var2 = pm6Var;
                                            map6 = map7;
                                            str7 = str3;
                                            arrayList6 = arrayList7;
                                            str5 = str2;
                                            zF = z7;
                                            arrayList5 = arrayList8;
                                            gm6Var3 = gm6Var;
                                            z2 = true;
                                        } else if (strD.equals("#EXT-X-ENDLIST")) {
                                            xm6Var2 = xm6Var;
                                            pm6Var2 = pm6Var;
                                            map6 = map7;
                                            str7 = str3;
                                            arrayList6 = arrayList7;
                                            str5 = str2;
                                            zF = z7;
                                            arrayList5 = arrayList8;
                                            gm6Var3 = gm6Var;
                                            z4 = true;
                                        } else {
                                            if (strD.startsWith("#EXT-X-RENDITION-REPORT")) {
                                                long jI = i(strD, L0);
                                                Matcher matcher = M0.matcher(strD);
                                                if (matcher.find()) {
                                                    String strGroup = matcher.group(1);
                                                    strGroup.getClass();
                                                    i3 = Integer.parseInt(strGroup);
                                                } else {
                                                    i3 = -1;
                                                }
                                                arrayList4.add(new im6(Uri.parse(kq0.D(str, k(strD, pattern2, map5))), jI, i3));
                                            } else if (strD.startsWith("#EXT-X-PRELOAD-HINT")) {
                                                if (gm6Var == null && "PART".equals(k(strD, Y0, map5))) {
                                                    String strK6 = k(strD, pattern2, map5);
                                                    long jI2 = i(strD, Q0);
                                                    long jI3 = i(strD, R0);
                                                    String hexString = strK == null ? null : str6 != null ? str6 : Long.toHexString(j9);
                                                    if (cr4Var2 == null && !treeMap.isEmpty()) {
                                                        ar4[] ar4VarArr = (ar4[]) treeMap.values().toArray(new ar4[0]);
                                                        cr4 cr4Var3 = new cr4(str3, true, ar4VarArr);
                                                        if (cr4VarB == null) {
                                                            cr4VarB = b(str3, ar4VarArr);
                                                        }
                                                        cr4Var2 = cr4Var3;
                                                    }
                                                    if (jI2 == -1 || jI3 != -1) {
                                                        gm6Var = new gm6(strK6, km6Var2, 0L, i7, j10, cr4Var2, strK, hexString, jI2 != -1 ? jI2 : 0L, jI3, false, false, true);
                                                    }
                                                }
                                            } else if (strD.startsWith("#EXT-X-PART")) {
                                                String hexString2 = strK == null ? null : str6 != null ? str6 : Long.toHexString(j9);
                                                String strK7 = k(strD, pattern2, map5);
                                                long j18 = (long) (Double.parseDouble(k(strD, y0, Collections.emptyMap())) * 1000000.0d);
                                                boolean zF3 = f(strD, h1) | (z2 && arrayList7.isEmpty());
                                                boolean zF4 = f(strD, i1);
                                                String strJ6 = j(strD, pattern, null, map5);
                                                if (strJ6 != null) {
                                                    int i16 = maf.a;
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
                                                if (cr4Var2 == null && !treeMap.isEmpty()) {
                                                    ar4[] ar4VarArr2 = (ar4[]) treeMap.values().toArray(new ar4[0]);
                                                    cr4 cr4Var4 = new cr4(str3, true, ar4VarArr2);
                                                    if (cr4VarB == null) {
                                                        cr4VarB = b(str3, ar4VarArr2);
                                                    }
                                                    cr4Var2 = cr4Var4;
                                                }
                                                arrayList7.add(new gm6(strK7, km6Var2, j18, i7, j10, cr4Var2, strK, hexString2, j12, j, zF4, zF3, false));
                                                j10 += j18;
                                                if (j != -1) {
                                                    j12 += j;
                                                }
                                                xm6Var2 = xm6Var;
                                                pm6Var2 = pm6Var;
                                                map6 = map7;
                                                str7 = str3;
                                                arrayList6 = arrayList7;
                                                str5 = str2;
                                                zF = z7;
                                                arrayList5 = arrayList8;
                                                gm6Var3 = gm6Var;
                                            } else {
                                                arrayList = arrayList7;
                                                if (strD.startsWith("#")) {
                                                    map = map5;
                                                    map2 = map7;
                                                } else {
                                                    String hexString3 = strK == null ? null : str6 != null ? str6 : Long.toHexString(j9);
                                                    long j19 = j9 + 1;
                                                    String strL = l(strD, map5);
                                                    km6 km6Var4 = (km6) map7.get(strL);
                                                    if (j3 == -1) {
                                                        j2 = 0;
                                                    } else {
                                                        if (z6 && km6Var2 == null && km6Var4 == null) {
                                                            km6Var4 = new km6(0L, j8, strL, null, null);
                                                            map7.put(strL, km6Var4);
                                                        }
                                                        j2 = j8;
                                                    }
                                                    if (cr4Var2 != null || treeMap.isEmpty()) {
                                                        map4 = map5;
                                                        km6Var = km6Var4;
                                                        cr4Var = cr4Var2;
                                                    } else {
                                                        map4 = map5;
                                                        km6Var = km6Var4;
                                                        ar4[] ar4VarArr3 = (ar4[]) treeMap.values().toArray(new ar4[0]);
                                                        cr4Var = new cr4(str3, true, ar4VarArr3);
                                                        if (cr4VarB == null) {
                                                            cr4VarB = b(str3, ar4VarArr3);
                                                        }
                                                    }
                                                    arrayList2.add(new km6(strL, km6Var2 != null ? km6Var2 : km6Var, strJ, jLongValue, i7, j11, cr4Var, strK, hexString3, j2, j3, z5, arrayList));
                                                    j10 = j11 + jLongValue;
                                                    ArrayList arrayList10 = new ArrayList();
                                                    if (j3 != -1) {
                                                        j2 += j3;
                                                    }
                                                    j8 = j2;
                                                    pm6Var2 = pm6Var;
                                                    arrayList6 = arrayList10;
                                                    map6 = map7;
                                                    str7 = str3;
                                                    cr4Var2 = cr4Var;
                                                    j3 = -1;
                                                    j11 = j10;
                                                    j9 = j19;
                                                    map5 = map4;
                                                    str5 = str2;
                                                    strJ = str5;
                                                    zF = z7;
                                                    arrayList5 = arrayList8;
                                                    gm6Var3 = gm6Var;
                                                    z5 = false;
                                                    jLongValue = 0;
                                                    xm6Var2 = xm6Var;
                                                }
                                            }
                                            map = map5;
                                            arrayList = arrayList7;
                                            map2 = map7;
                                        }
                                        xm6Var2 = xm6Var;
                                        pm6Var2 = pm6Var;
                                        map6 = map7;
                                        str7 = str3;
                                    }
                                    arrayList6 = arrayList7;
                                    str5 = str2;
                                    zF = z7;
                                    arrayList5 = arrayList8;
                                    gm6Var3 = gm6Var;
                                }
                                xm6Var2 = xm6Var;
                                pm6Var2 = pm6Var;
                                map6 = map2;
                                str7 = str3;
                                arrayList6 = arrayList;
                                map5 = map;
                                str5 = str2;
                                zF = z7;
                                arrayList5 = arrayList8;
                                gm6Var3 = gm6Var;
                            }
                            arrayList6 = arrayList7;
                            str5 = str2;
                            zF = z7;
                            arrayList5 = arrayList8;
                        }
                    }
                }
                str5 = str2;
            }
        }
        gm6 gm6Var5 = gm6Var3;
        ArrayList arrayList11 = arrayList6;
        ArrayList arrayList12 = arrayList5;
        boolean z8 = zF;
        HashMap map8 = new HashMap();
        int i17 = 0;
        while (i17 < arrayList4.size()) {
            im6 im6Var = (im6) arrayList4.get(i17);
            long size = im6Var.b;
            if (size == -1) {
                size = (j5 + arrayList2.size()) - (arrayList11.isEmpty() ? 1L : 0L);
            }
            int size2 = im6Var.c;
            if (size2 != -1 || j7 == -9223372036854775807L) {
                i = 1;
            } else {
                i = 1;
                size2 = (arrayList11.isEmpty() ? ((km6) mqd.m(arrayList2)).x0 : arrayList11).size() - 1;
            }
            Uri uri = im6Var.a;
            map8.put(uri, new im6(uri, size, size2));
            i17 += i;
        }
        if (gm6Var5 != null) {
            arrayList11.add(gm6Var5);
        }
        return new pm6(i4, str, arrayList12, j4, z8, jD, z3, i5, j5, i6, j6, j7, z2, z4, jD != 0, cr4VarB, arrayList2, arrayList11, om6Var2, map8);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:129:0x03cb. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:112:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01f6  */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v10, types: [int] */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v47 */
    /* JADX WARN: Type inference failed for: r2v48 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.xm6 e(defpackage.pl8 r38, java.lang.String r39) throws java.io.IOException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 1446
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bn6.e(pl8, java.lang.String):xm6");
    }

    public static boolean f(String str, Pattern pattern) {
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
        String strPattern = pattern.pattern();
        StringBuilder sb = new StringBuilder(rh4.e(rh4.e(19, strPattern), str));
        sb.append("Couldn't match ");
        sb.append(strPattern);
        sb.append(" in ");
        sb.append(str);
        throw ParserException.b(null, sb.toString());
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

    /* JADX WARN: Removed duplicated region for block: B:19:0x0040 A[Catch: all -> 0x00a0, TryCatch #0 {all -> 0x00a0, blocks: (B:3:0x0010, B:5:0x0019, B:7:0x0021, B:10:0x002a, B:40:0x0073, B:42:0x0079, B:45:0x0084, B:47:0x008c, B:51:0x00a2, B:53:0x00aa, B:55:0x00b2, B:57:0x00ba, B:59:0x00c2, B:61:0x00ca, B:63:0x00d2, B:65:0x00da, B:68:0x00e3, B:69:0x00e7, B:74:0x0107, B:75:0x010d, B:13:0x0031, B:15:0x0037, B:19:0x0040, B:22:0x0049, B:25:0x0055, B:27:0x005b, B:31:0x0062, B:32:0x0067), top: B:78:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x004f A[SYNTHETIC] */
    @Override // defpackage.ypa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(android.net.Uri r9, defpackage.w24 r10) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bn6.g(android.net.Uri, w24):java.lang.Object");
    }
}
