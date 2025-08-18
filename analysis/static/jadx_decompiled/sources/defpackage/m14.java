package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import androidx.media3.common.ParserException;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.webrtc.MediaStreamTrack;
import org.xml.sax.helpers.DefaultHandler;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* loaded from: classes.dex */
public final class m14 extends DefaultHandler implements zpa {
    public final XmlPullParserFactory a;
    public static final Pattern b = Pattern.compile("(\\d+)(?:/(\\d+))?");
    public static final Pattern c = Pattern.compile("CC([1-4])=.*");
    public static final Pattern o = Pattern.compile("([1-9]|[1-5][0-9]|6[0-3])=.*");
    public static final int[] X = {-1, 1, 2, 3, 4, 5, 6, 8, 2, 3, 4, 7, 8, 24, 8, 12, 10, 12, 14, 12, 14};

    public m14() {
        try {
            this.a = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e);
        }
    }

    public static long b(ArrayList arrayList, long j, long j2, int i, long j3) {
        int i2;
        if (i >= 0) {
            i2 = i + 1;
        } else {
            int i3 = oaf.a;
            i2 = (int) ((((j3 - j) + j2) - 1) / j2);
        }
        for (int i4 = 0; i4 < i2; i4++) {
            arrayList.add(new s2d(j, j2));
            j += j2;
        }
        return j;
    }

    public static void c(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        if (a14.C(xmlPullParser)) {
            int i = 1;
            while (i != 0) {
                xmlPullParser.next();
                if (a14.C(xmlPullParser)) {
                    i++;
                } else if (xmlPullParser.getEventType() == 3) {
                    i--;
                }
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Failed to find switch 'out' block (already processed)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.calcSwitchOut(SwitchRegionMaker.java:200)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:61)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:101)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.processFallThroughCases(SwitchRegionMaker.java:105)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:64)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int d(org.xmlpull.v1.XmlPullParser r12) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m14.d(org.xmlpull.v1.XmlPullParser):int");
    }

    public static long e(XmlPullParser xmlPullParser, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "availabilityTimeOffset");
        if (attributeValue == null) {
            return j;
        }
        if ("INF".equals(attributeValue)) {
            return Long.MAX_VALUE;
        }
        return (long) (Float.parseFloat(attributeValue) * 1000000.0f);
    }

    public static ArrayList f(XmlPullParser xmlPullParser, List list, boolean z) throws XmlPullParserException, IOException {
        String attributeValue = xmlPullParser.getAttributeValue(null, "dvb:priority");
        int i = attributeValue != null ? Integer.parseInt(attributeValue) : z ? 1 : Integer.MIN_VALUE;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "dvb:weight");
        int i2 = attributeValue2 != null ? Integer.parseInt(attributeValue2) : 1;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "serviceLocation");
        String text = "";
        do {
            xmlPullParser.next();
            if (xmlPullParser.getEventType() == 4) {
                text = xmlPullParser.getText();
            } else {
                c(xmlPullParser);
            }
        } while (!a14.B(xmlPullParser, "BaseURL"));
        if (text != null && mr0.F(text)[0] != -1) {
            if (attributeValue3 == null) {
                attributeValue3 = text;
            }
            return br7.I(new mk0(text, i, i2, attributeValue3));
        }
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < list.size(); i3++) {
            mk0 mk0Var = (mk0) list.get(i3);
            String strR = mr0.R(mk0Var.a, text);
            String str = attributeValue3 == null ? strR : attributeValue3;
            if (z) {
                i = mk0Var.c;
                i2 = mk0Var.d;
                str = mk0Var.b;
            }
            arrayList.add(new mk0(strR, i, i2, str));
        }
        return arrayList;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x015a  */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v16, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r6v17, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v26, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v30 */
    /* JADX WARN: Type inference failed for: r7v4, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.util.UUID] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Pair g(org.xmlpull.v1.XmlPullParser r13) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m14.g(org.xmlpull.v1.XmlPullParser):android.util.Pair");
    }

    public static int h(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "contentType");
        if (TextUtils.isEmpty(attributeValue)) {
            return -1;
        }
        if (MediaStreamTrack.AUDIO_TRACK_KIND.equals(attributeValue)) {
            return 1;
        }
        if (MediaStreamTrack.VIDEO_TRACK_KIND.equals(attributeValue)) {
            return 2;
        }
        if ("text".equals(attributeValue)) {
            return 3;
        }
        return "image".equals(attributeValue) ? 4 : -1;
    }

    public static ai4 i(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        String attributeValue = xmlPullParser.getAttributeValue(null, "schemeIdUri");
        if (attributeValue == null) {
            attributeValue = "";
        }
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "value");
        if (attributeValue2 == null) {
            attributeValue2 = null;
        }
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "id");
        String str2 = attributeValue3 != null ? attributeValue3 : null;
        do {
            xmlPullParser.next();
        } while (!a14.B(xmlPullParser, str));
        return new ai4(attributeValue, attributeValue2, str2);
    }

    public static long j(XmlPullParser xmlPullParser, String str, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return j;
        }
        Matcher matcher = oaf.i.matcher(attributeValue);
        if (!matcher.matches()) {
            return (long) (Double.parseDouble(attributeValue) * 3600.0d * 1000.0d);
        }
        boolean zIsEmpty = true ^ TextUtils.isEmpty(matcher.group(1));
        String strGroup = matcher.group(3);
        double d = strGroup != null ? Double.parseDouble(strGroup) * 3.1556908E7d : 0.0d;
        String strGroup2 = matcher.group(5);
        double d2 = d + (strGroup2 != null ? Double.parseDouble(strGroup2) * 2629739.0d : 0.0d);
        String strGroup3 = matcher.group(7);
        double d3 = d2 + (strGroup3 != null ? Double.parseDouble(strGroup3) * 86400.0d : 0.0d);
        String strGroup4 = matcher.group(10);
        double d4 = d3 + (strGroup4 != null ? Double.parseDouble(strGroup4) * 3600.0d : 0.0d);
        String strGroup5 = matcher.group(12);
        double d5 = d4 + (strGroup5 != null ? Double.parseDouble(strGroup5) * 60.0d : 0.0d);
        String strGroup6 = matcher.group(14);
        long j2 = (long) ((d5 + (strGroup6 != null ? Double.parseDouble(strGroup6) : 0.0d)) * 1000.0d);
        return zIsEmpty ? -j2 : j2;
    }

    public static float k(XmlPullParser xmlPullParser, float f) throws NumberFormatException {
        String attributeValue = xmlPullParser.getAttributeValue(null, "frameRate");
        if (attributeValue == null) {
            return f;
        }
        Matcher matcher = b.matcher(attributeValue);
        if (!matcher.matches()) {
            return f;
        }
        int i = Integer.parseInt(matcher.group(1));
        return !TextUtils.isEmpty(matcher.group(2)) ? i / Integer.parseInt(r2) : i;
    }

    public static int l(XmlPullParser xmlPullParser, String str, int i) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? i : Integer.parseInt(attributeValue);
    }

    public static long m(XmlPullParser xmlPullParser, String str, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? j : Long.parseLong(attributeValue);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:280:0x098a  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x09ca A[PHI: r0
      0x09ca: PHI (r0v79 java.lang.String) = (r0v78 java.lang.String), (r0v104 java.lang.String) binds: [B:279:0x0988, B:295:0x09c7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:332:0x0a66  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x0a70  */
    /* JADX WARN: Removed duplicated region for block: B:439:0x0c42  */
    /* JADX WARN: Removed duplicated region for block: B:440:0x0c45  */
    /* JADX WARN: Removed duplicated region for block: B:443:0x0c60  */
    /* JADX WARN: Removed duplicated region for block: B:444:0x0c63  */
    /* JADX WARN: Removed duplicated region for block: B:447:0x0c7f  */
    /* JADX WARN: Removed duplicated region for block: B:449:0x0c83  */
    /* JADX WARN: Removed duplicated region for block: B:458:0x0cb2 A[LOOP:11: B:194:0x06a8->B:458:0x0cb2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:554:0x0fd6 A[LOOP:5: B:129:0x03f3->B:554:0x0fd6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:656:0x13d5 A[LOOP:1: B:43:0x00cf->B:656:0x13d5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:664:0x13a1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:668:0x0e46 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:685:0x0904 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r15v70 */
    /* JADX WARN: Type inference failed for: r15v71, types: [java.lang.Exception] */
    /* JADX WARN: Type inference failed for: r15v72 */
    /* JADX WARN: Type inference failed for: r15v75 */
    /* JADX WARN: Type inference failed for: r41v10 */
    /* JADX WARN: Type inference failed for: r41v11 */
    /* JADX WARN: Type inference failed for: r41v12 */
    /* JADX WARN: Type inference failed for: r41v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.i14 n(org.xmlpull.v1.XmlPullParser r163, android.net.Uri r164) throws org.xmlpull.v1.XmlPullParserException, java.lang.IllegalStateException, java.io.IOException, java.lang.IllegalArgumentException {
        /*
            Method dump skipped, instructions count: 5152
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m14.n(org.xmlpull.v1.XmlPullParser, android.net.Uri):i14");
    }

    public static r4c o(XmlPullParser xmlPullParser, String str, String str2) throws NumberFormatException {
        long j;
        long j2;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        String attributeValue2 = xmlPullParser.getAttributeValue(null, str2);
        if (attributeValue2 != null) {
            String[] strArrSplit = attributeValue2.split("-");
            j = Long.parseLong(strArrSplit[0]);
            if (strArrSplit.length == 2) {
                j2 = (Long.parseLong(strArrSplit[1]) - j) + 1;
            }
            return new r4c(j, attributeValue, j2);
        }
        j = 0;
        j2 = -1;
        return new r4c(j, attributeValue, j2);
    }

    public static int p(String str) {
        if (str == null) {
            return 0;
        }
        switch (str) {
        }
        return 0;
    }

    public static int q(ArrayList arrayList) {
        int i = 0;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            if (lz7.j("http://dashif.org/guidelines/trickmode", ((ai4) arrayList.get(i2)).a)) {
                i = 16384;
            }
        }
        return i;
    }

    public static u2d r(XmlPullParser xmlPullParser, u2d u2dVar) throws XmlPullParserException, NumberFormatException, IOException {
        long j;
        long j2;
        long jM = m(xmlPullParser, "timescale", u2dVar != null ? u2dVar.a : 1L);
        long jM2 = m(xmlPullParser, "presentationTimeOffset", u2dVar != null ? u2dVar.b : 0L);
        long j3 = u2dVar != null ? u2dVar.d : 0L;
        long j4 = u2dVar != null ? u2dVar.e : 0L;
        String attributeValue = xmlPullParser.getAttributeValue(null, "indexRange");
        if (attributeValue != null) {
            String[] strArrSplit = attributeValue.split("-");
            long j5 = Long.parseLong(strArrSplit[0]);
            j = (Long.parseLong(strArrSplit[1]) - j5) + 1;
            j2 = j5;
        } else {
            j = j4;
            j2 = j3;
        }
        r4c r4cVarO = u2dVar != null ? (r4c) u2dVar.c : null;
        do {
            xmlPullParser.next();
            if (a14.D(xmlPullParser, "Initialization")) {
                r4cVarO = o(xmlPullParser, "sourceURL", "range");
            } else {
                c(xmlPullParser);
            }
        } while (!a14.B(xmlPullParser, "SegmentBase"));
        return new u2d(r4cVarO, jM, jM2, j2, j);
    }

    public static o2d s(XmlPullParser xmlPullParser, o2d o2dVar, long j, long j2, long j3, long j4, long j5) throws XmlPullParserException, IOException, NumberFormatException {
        long jM = m(xmlPullParser, "timescale", o2dVar != null ? o2dVar.a : 1L);
        long jM2 = m(xmlPullParser, "presentationTimeOffset", o2dVar != null ? o2dVar.b : 0L);
        long jM3 = m(xmlPullParser, "duration", o2dVar != null ? o2dVar.e : -9223372036854775807L);
        long jM4 = m(xmlPullParser, "startNumber", o2dVar != null ? o2dVar.d : 1L);
        long j6 = j4 == -9223372036854775807L ? j3 : j4;
        long j7 = j6 == Long.MAX_VALUE ? -9223372036854775807L : j6;
        List arrayList = null;
        r4c r4cVarO = null;
        List listU = null;
        do {
            xmlPullParser.next();
            if (a14.D(xmlPullParser, "Initialization")) {
                r4cVarO = o(xmlPullParser, "sourceURL", "range");
            } else if (a14.D(xmlPullParser, "SegmentTimeline")) {
                listU = u(xmlPullParser, jM, j2);
            } else if (a14.D(xmlPullParser, "SegmentURL")) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(o(xmlPullParser, "media", "mediaRange"));
            } else {
                c(xmlPullParser);
            }
        } while (!a14.B(xmlPullParser, "SegmentList"));
        if (o2dVar != null) {
            if (r4cVarO == null) {
                r4cVarO = (r4c) o2dVar.c;
            }
            if (listU == null) {
                listU = o2dVar.f;
            }
            if (arrayList == null) {
                arrayList = o2dVar.j;
            }
        }
        return new o2d(r4cVarO, jM, jM2, jM4, jM3, listU, j7, arrayList, oaf.S(j5), oaf.S(j));
    }

    public static q2d t(XmlPullParser xmlPullParser, q2d q2dVar, List list, long j, long j2, long j3, long j4, long j5) throws XmlPullParserException, NumberFormatException, IOException {
        long j6;
        long jM = m(xmlPullParser, "timescale", q2dVar != null ? q2dVar.a : 1L);
        long jM2 = m(xmlPullParser, "presentationTimeOffset", q2dVar != null ? q2dVar.b : 0L);
        long jM3 = m(xmlPullParser, "duration", q2dVar != null ? q2dVar.e : -9223372036854775807L);
        long jM4 = m(xmlPullParser, "startNumber", q2dVar != null ? q2dVar.d : 1L);
        int i = 0;
        while (true) {
            if (i >= list.size()) {
                j6 = -1;
                break;
            }
            ai4 ai4Var = (ai4) list.get(i);
            if (lz7.j("http://dashif.org/guidelines/last-segment-number", ai4Var.a)) {
                j6 = Long.parseLong(ai4Var.b);
                break;
            }
            i++;
        }
        long j7 = j6;
        long j8 = j4 == -9223372036854775807L ? j3 : j4;
        long j9 = j8 == Long.MAX_VALUE ? -9223372036854775807L : j8;
        r4c r4cVarO = null;
        pl8 pl8VarV = v(xmlPullParser, "media", q2dVar != null ? q2dVar.k : null);
        pl8 pl8VarV2 = v(xmlPullParser, "initialization", q2dVar != null ? q2dVar.j : null);
        List listU = null;
        do {
            xmlPullParser.next();
            if (a14.D(xmlPullParser, "Initialization")) {
                r4cVarO = o(xmlPullParser, "sourceURL", "range");
            } else if (a14.D(xmlPullParser, "SegmentTimeline")) {
                listU = u(xmlPullParser, jM, j2);
            } else {
                c(xmlPullParser);
            }
        } while (!a14.B(xmlPullParser, "SegmentTemplate"));
        if (q2dVar != null) {
            if (r4cVarO == null) {
                r4cVarO = (r4c) q2dVar.c;
            }
            if (listU == null) {
                listU = q2dVar.f;
            }
        }
        return new q2d(r4cVarO, jM, jM2, jM4, j7, jM3, listU, j9, pl8VarV2, pl8VarV, oaf.S(j5), oaf.S(j));
    }

    public static ArrayList u(XmlPullParser xmlPullParser, long j, long j2) throws XmlPullParserException, IOException {
        ArrayList arrayList = new ArrayList();
        long jB = 0;
        long j3 = -9223372036854775807L;
        boolean z = false;
        int iL = 0;
        do {
            xmlPullParser.next();
            if (a14.D(xmlPullParser, "S")) {
                long jM = m(xmlPullParser, "t", -9223372036854775807L);
                if (z) {
                    jB = b(arrayList, jB, j3, iL, jM);
                }
                if (jM == -9223372036854775807L) {
                    jM = jB;
                }
                long jM2 = m(xmlPullParser, "d", -9223372036854775807L);
                iL = l(xmlPullParser, "r", 0);
                z = true;
                j3 = jM2;
                jB = jM;
            } else {
                c(xmlPullParser);
            }
        } while (!a14.B(xmlPullParser, "SegmentTimeline"));
        if (z) {
            int i = oaf.a;
            b(arrayList, jB, j3, iL, oaf.a0(j2, j, 1000L, RoundingMode.FLOOR));
        }
        return arrayList;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0125 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.pl8 v(org.xmlpull.v1.XmlPullParser r12, java.lang.String r13, defpackage.pl8 r14) {
        /*
            Method dump skipped, instructions count: 378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m14.v(org.xmlpull.v1.XmlPullParser, java.lang.String, pl8):pl8");
    }

    @Override // defpackage.zpa
    public final Object a(Uri uri, w24 w24Var) throws XmlPullParserException, ParserException {
        try {
            XmlPullParser xmlPullParserNewPullParser = this.a.newPullParser();
            xmlPullParserNewPullParser.setInput(w24Var, null);
            if (xmlPullParserNewPullParser.next() == 2 && "MPD".equals(xmlPullParserNewPullParser.getName())) {
                return n(xmlPullParserNewPullParser, uri);
            }
            throw ParserException.b(null, "inputStream does not contain a valid media presentation description");
        } catch (XmlPullParserException e) {
            throw ParserException.b(e, null);
        }
    }
}
