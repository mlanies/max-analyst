package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.exoplayer2.ParserException;
import java.io.IOException;
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
public final class l14 extends DefaultHandler implements ypa {
    public final XmlPullParserFactory a;
    public static final Pattern b = Pattern.compile("(\\d+)(?:/(\\d+))?");
    public static final Pattern c = Pattern.compile("CC([1-4])=.*");
    public static final Pattern o = Pattern.compile("([1-9]|[1-5][0-9]|6[0-3])=.*");
    public static final int[] X = {-1, 1, 2, 3, 4, 5, 6, 8, 2, 3, 4, 7, 8, 24, 8, 12, 10, 12, 14, 12, 14};

    public l14() {
        try {
            this.a = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e);
        }
    }

    public static long a(ArrayList arrayList, long j, long j2, int i, long j3) {
        int i2;
        if (i >= 0) {
            i2 = i + 1;
        } else {
            int i3 = maf.a;
            i2 = (int) ((((j3 - j) + j2) - 1) / j2);
        }
        for (int i4 = 0; i4 < i2; i4++) {
            arrayList.add(new r2d(j, j2));
            j += j2;
        }
        return j;
    }

    public static void b(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        if (z04.O(xmlPullParser)) {
            int i = 1;
            while (i != 0) {
                xmlPullParser.next();
                if (z04.O(xmlPullParser)) {
                    i++;
                } else if (xmlPullParser.getEventType() == 3) {
                    i--;
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int c(org.xmlpull.v1.XmlPullParser r9) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r0 = 3
            r1 = 0
            r2 = 2
            r3 = 1
            r4 = -1
            r5 = 0
            java.lang.String r6 = "schemeIdUri"
            java.lang.String r6 = r9.getAttributeValue(r5, r6)
            if (r6 != 0) goto Lf
            r6 = r5
        Lf:
            r6.getClass()
            java.lang.String r7 = "value"
            int r8 = r6.hashCode()
            switch(r8) {
                case -1352850286: goto L3e;
                case -1138141449: goto L33;
                case -986633423: goto L28;
                case 2036691300: goto L1d;
                default: goto L1b;
            }
        L1b:
            r6 = r4
            goto L48
        L1d:
            java.lang.String r8 = "urn:dolby:dash:audio_channel_configuration:2011"
            boolean r6 = r6.equals(r8)
            if (r6 != 0) goto L26
            goto L1b
        L26:
            r6 = r0
            goto L48
        L28:
            java.lang.String r8 = "urn:mpeg:mpegB:cicp:ChannelConfiguration"
            boolean r6 = r6.equals(r8)
            if (r6 != 0) goto L31
            goto L1b
        L31:
            r6 = r2
            goto L48
        L33:
            java.lang.String r8 = "tag:dolby.com,2014:dash:audio_channel_configuration:2011"
            boolean r6 = r6.equals(r8)
            if (r6 != 0) goto L3c
            goto L1b
        L3c:
            r6 = r3
            goto L48
        L3e:
            java.lang.String r8 = "urn:mpeg:dash:23003:3:audio_channel_configuration:2011"
            boolean r6 = r6.equals(r8)
            if (r6 != 0) goto L47
            goto L1b
        L47:
            r6 = r1
        L48:
            switch(r6) {
                case 0: goto La8;
                case 1: goto L5b;
                case 2: goto L4d;
                case 3: goto L5b;
                default: goto L4b;
            }
        L4b:
            goto Lac
        L4d:
            int r0 = l(r9, r7, r4)
            if (r0 < 0) goto Lac
            int[] r1 = defpackage.l14.X
            int r2 = r1.length
            if (r0 >= r2) goto Lac
            r4 = r1[r0]
            goto Lac
        L5b:
            java.lang.String r5 = r9.getAttributeValue(r5, r7)
            if (r5 != 0) goto L63
        L61:
            r2 = r4
            goto La6
        L63:
            java.lang.String r5 = defpackage.lz7.T(r5)
            r5.getClass()
            int r6 = r5.hashCode()
            switch(r6) {
                case 1596796: goto L92;
                case 2937391: goto L87;
                case 3094035: goto L7c;
                case 3133436: goto L73;
                default: goto L71;
            }
        L71:
            r0 = r4
            goto L9c
        L73:
            java.lang.String r1 = "fa01"
            boolean r1 = r5.equals(r1)
            if (r1 != 0) goto L9c
            goto L71
        L7c:
            java.lang.String r0 = "f801"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L85
            goto L71
        L85:
            r0 = r2
            goto L9c
        L87:
            java.lang.String r0 = "a000"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L90
            goto L71
        L90:
            r0 = r3
            goto L9c
        L92:
            java.lang.String r0 = "4000"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L9b
            goto L71
        L9b:
            r0 = r1
        L9c:
            switch(r0) {
                case 0: goto La5;
                case 1: goto La6;
                case 2: goto La3;
                case 3: goto La0;
                default: goto L9f;
            }
        L9f:
            goto L61
        La0:
            r2 = 8
            goto La6
        La3:
            r2 = 6
            goto La6
        La5:
            r2 = r3
        La6:
            r4 = r2
            goto Lac
        La8:
            int r4 = l(r9, r7, r4)
        Lac:
            r9.next()
            java.lang.String r0 = "AudioChannelConfiguration"
            boolean r0 = defpackage.z04.L(r9, r0)
            if (r0 == 0) goto Lac
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l14.c(org.xmlpull.v1.XmlPullParser):int");
    }

    public static long d(XmlPullParser xmlPullParser, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "availabilityTimeOffset");
        if (attributeValue == null) {
            return j;
        }
        if ("INF".equals(attributeValue)) {
            return Long.MAX_VALUE;
        }
        return (long) (Float.parseFloat(attributeValue) * 1000000.0f);
    }

    public static ArrayList e(XmlPullParser xmlPullParser, List list, boolean z) throws XmlPullParserException, IOException {
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
                b(xmlPullParser);
            }
        } while (!z04.L(xmlPullParser, "BaseURL"));
        if (text != null && kq0.p(text)[0] != -1) {
            if (attributeValue3 == null) {
                attributeValue3 = text;
            }
            return br7.I(new lk0(text, i, i2, attributeValue3));
        }
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < list.size(); i3++) {
            lk0 lk0Var = (lk0) list.get(i3);
            String strD = kq0.D(lk0Var.a, text);
            String str = attributeValue3 == null ? strD : attributeValue3;
            if (z) {
                i = lk0Var.c;
                i2 = lk0Var.d;
                str = lk0Var.b;
            }
            arrayList.add(new lk0(strD, i, i2, str));
        }
        return arrayList;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0126  */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v14, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v22, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v13, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Pair f(org.xmlpull.v1.XmlPullParser r13) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l14.f(org.xmlpull.v1.XmlPullParser):android.util.Pair");
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
        return "text".equals(attributeValue) ? 3 : -1;
    }

    public static zh4 i(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
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
        } while (!z04.L(xmlPullParser, str));
        return new zh4(attributeValue, attributeValue2, str2);
    }

    public static long j(XmlPullParser xmlPullParser, String str, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return j;
        }
        Matcher matcher = maf.h.matcher(attributeValue);
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
    /* JADX WARN: Removed duplicated region for block: B:279:0x0964 A[PHI: r2
      0x0964: PHI (r2v67 java.lang.String) = (r2v66 java.lang.String), (r2v68 java.lang.String) binds: [B:281:0x0970, B:267:0x0942] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0993  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x09dc A[PHI: r0
      0x09dc: PHI (r0v84 java.lang.String) = (r0v83 java.lang.String), (r0v108 java.lang.String) binds: [B:290:0x0991, B:306:0x09d9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:343:0x0a83  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x0a8d  */
    /* JADX WARN: Removed duplicated region for block: B:426:0x0be9  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x0bec  */
    /* JADX WARN: Removed duplicated region for block: B:430:0x0c07  */
    /* JADX WARN: Removed duplicated region for block: B:431:0x0c0a  */
    /* JADX WARN: Removed duplicated region for block: B:435:0x0c27  */
    /* JADX WARN: Removed duplicated region for block: B:442:0x0c50 A[LOOP:9: B:193:0x067f->B:442:0x0c50, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:516:0x0f0e A[LOOP:5: B:130:0x03d4->B:516:0x0f0e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:619:0x12fd A[LOOP:1: B:43:0x00cf->B:619:0x12fd, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:624:0x12c7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:628:0x0df7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:638:0x08de A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.h14 n(org.xmlpull.v1.XmlPullParser r157, android.net.Uri r158) throws org.xmlpull.v1.XmlPullParserException, java.lang.IllegalStateException, java.io.IOException, java.lang.IllegalArgumentException {
        /*
            Method dump skipped, instructions count: 4936
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l14.n(org.xmlpull.v1.XmlPullParser, android.net.Uri):h14");
    }

    public static q4c o(XmlPullParser xmlPullParser, String str, String str2) throws NumberFormatException {
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
            return new q4c(j, attributeValue, j2);
        }
        j = 0;
        j2 = -1;
        return new q4c(j, attributeValue, j2);
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
            if (lz7.j("http://dashif.org/guidelines/trickmode", ((zh4) arrayList.get(i2)).a)) {
                i = 16384;
            }
        }
        return i;
    }

    public static t2d r(XmlPullParser xmlPullParser, t2d t2dVar) throws XmlPullParserException, NumberFormatException, IOException {
        long j;
        long j2;
        long jM = m(xmlPullParser, "timescale", t2dVar != null ? t2dVar.a : 1L);
        long jM2 = m(xmlPullParser, "presentationTimeOffset", t2dVar != null ? t2dVar.b : 0L);
        long j3 = t2dVar != null ? t2dVar.d : 0L;
        long j4 = t2dVar != null ? t2dVar.e : 0L;
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
        q4c q4cVarO = t2dVar != null ? (q4c) t2dVar.c : null;
        do {
            xmlPullParser.next();
            if (z04.P(xmlPullParser, "Initialization")) {
                q4cVarO = o(xmlPullParser, "sourceURL", "range");
            } else {
                b(xmlPullParser);
            }
        } while (!z04.L(xmlPullParser, "SegmentBase"));
        return new t2d(q4cVarO, jM, jM2, j2, j);
    }

    public static n2d s(XmlPullParser xmlPullParser, n2d n2dVar, long j, long j2, long j3, long j4, long j5) throws XmlPullParserException, IOException, NumberFormatException {
        long jM = m(xmlPullParser, "timescale", n2dVar != null ? n2dVar.a : 1L);
        long jM2 = m(xmlPullParser, "presentationTimeOffset", n2dVar != null ? n2dVar.b : 0L);
        long jM3 = m(xmlPullParser, "duration", n2dVar != null ? n2dVar.e : -9223372036854775807L);
        long jM4 = m(xmlPullParser, "startNumber", n2dVar != null ? n2dVar.d : 1L);
        long j6 = j4 == -9223372036854775807L ? j3 : j4;
        long j7 = j6 == Long.MAX_VALUE ? -9223372036854775807L : j6;
        List arrayList = null;
        q4c q4cVarO = null;
        List listU = null;
        do {
            xmlPullParser.next();
            if (z04.P(xmlPullParser, "Initialization")) {
                q4cVarO = o(xmlPullParser, "sourceURL", "range");
            } else if (z04.P(xmlPullParser, "SegmentTimeline")) {
                listU = u(xmlPullParser, jM, j2);
            } else if (z04.P(xmlPullParser, "SegmentURL")) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(o(xmlPullParser, "media", "mediaRange"));
            } else {
                b(xmlPullParser);
            }
        } while (!z04.L(xmlPullParser, "SegmentList"));
        if (n2dVar != null) {
            if (q4cVarO == null) {
                q4cVarO = (q4c) n2dVar.c;
            }
            if (listU == null) {
                listU = n2dVar.f;
            }
            if (arrayList == null) {
                arrayList = n2dVar.j;
            }
        }
        return new n2d(q4cVarO, jM, jM2, jM4, jM3, listU, j7, arrayList, maf.D(j5), maf.D(j));
    }

    public static p2d t(XmlPullParser xmlPullParser, p2d p2dVar, List list, long j, long j2, long j3, long j4, long j5) throws XmlPullParserException, NumberFormatException, IOException {
        long j6;
        long jM = m(xmlPullParser, "timescale", p2dVar != null ? p2dVar.a : 1L);
        long jM2 = m(xmlPullParser, "presentationTimeOffset", p2dVar != null ? p2dVar.b : 0L);
        long jM3 = m(xmlPullParser, "duration", p2dVar != null ? p2dVar.e : -9223372036854775807L);
        long jM4 = m(xmlPullParser, "startNumber", p2dVar != null ? p2dVar.d : 1L);
        int i = 0;
        while (true) {
            if (i >= list.size()) {
                j6 = -1;
                break;
            }
            zh4 zh4Var = (zh4) list.get(i);
            if (lz7.j("http://dashif.org/guidelines/last-segment-number", zh4Var.a)) {
                j6 = Long.parseLong(zh4Var.b);
                break;
            }
            i++;
        }
        long j7 = j6;
        long j8 = j4 == -9223372036854775807L ? j3 : j4;
        long j9 = j8 == Long.MAX_VALUE ? -9223372036854775807L : j8;
        q4c q4cVarO = null;
        pkg pkgVarV = v(xmlPullParser, "media", p2dVar != null ? p2dVar.k : null);
        pkg pkgVarV2 = v(xmlPullParser, "initialization", p2dVar != null ? p2dVar.j : null);
        List listU = null;
        do {
            xmlPullParser.next();
            if (z04.P(xmlPullParser, "Initialization")) {
                q4cVarO = o(xmlPullParser, "sourceURL", "range");
            } else if (z04.P(xmlPullParser, "SegmentTimeline")) {
                listU = u(xmlPullParser, jM, j2);
            } else {
                b(xmlPullParser);
            }
        } while (!z04.L(xmlPullParser, "SegmentTemplate"));
        if (p2dVar != null) {
            if (q4cVarO == null) {
                q4cVarO = (q4c) p2dVar.c;
            }
            if (listU == null) {
                listU = p2dVar.f;
            }
        }
        return new p2d(q4cVarO, jM, jM2, jM4, j7, jM3, listU, j9, pkgVarV2, pkgVarV, maf.D(j5), maf.D(j));
    }

    public static ArrayList u(XmlPullParser xmlPullParser, long j, long j2) throws XmlPullParserException, IOException {
        ArrayList arrayList = new ArrayList();
        long jA = 0;
        long j3 = -9223372036854775807L;
        boolean z = false;
        int iL = 0;
        do {
            xmlPullParser.next();
            if (z04.P(xmlPullParser, "S")) {
                long jM = m(xmlPullParser, "t", -9223372036854775807L);
                if (z) {
                    jA = a(arrayList, jA, j3, iL, jM);
                }
                if (jM == -9223372036854775807L) {
                    jM = jA;
                }
                long jM2 = m(xmlPullParser, "d", -9223372036854775807L);
                iL = l(xmlPullParser, "r", 0);
                z = true;
                j3 = jM2;
                jA = jM;
            } else {
                b(xmlPullParser);
            }
        } while (!z04.L(xmlPullParser, "SegmentTimeline"));
        if (z) {
            a(arrayList, jA, j3, iL, maf.J(j2, j, 1000L));
        }
        return arrayList;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.pkg v(org.xmlpull.v1.XmlPullParser r17, java.lang.String r18, defpackage.pkg r19) {
        /*
            Method dump skipped, instructions count: 338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l14.v(org.xmlpull.v1.XmlPullParser, java.lang.String, pkg):pkg");
    }

    @Override // defpackage.ypa
    public final Object g(Uri uri, w24 w24Var) throws XmlPullParserException, ParserException {
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
