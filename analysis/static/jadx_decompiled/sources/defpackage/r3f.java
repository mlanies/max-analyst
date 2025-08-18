package defpackage;

import androidx.media3.extractor.text.SubtitleDecoderException;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* loaded from: classes.dex */
public final class r3f implements obe {
    public final XmlPullParserFactory a;
    public static final Pattern b = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
    public static final Pattern c = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
    public static final Pattern o = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
    public static final Pattern X = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");
    public static final Pattern Y = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");
    public static final Pattern Z = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");
    public static final Pattern s0 = Pattern.compile("^(\\d+) (\\d+)$");
    public static final uwc t0 = new uwc(1, 30.0f, 1);

    public r3f() throws XmlPullParserException {
        try {
            XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
            this.a = xmlPullParserFactoryNewInstance;
            xmlPullParserFactoryNewInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e);
        }
    }

    public static v3f a(v3f v3fVar) {
        return v3fVar == null ? new v3f() : v3fVar;
    }

    public static boolean b(String str) {
        return str.equals("tt") || str.equals("head") || str.equals("body") || str.equals("div") || str.equals("p") || str.equals("span") || str.equals("br") || str.equals("style") || str.equals("styling") || str.equals("layout") || str.equals("region") || str.equals("metadata") || str.equals("image") || str.equals("data") || str.equals("information");
    }

    public static int c(XmlPullParser xmlPullParser) throws NumberFormatException {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return 15;
        }
        Matcher matcher = s0.matcher(attributeValue);
        if (!matcher.matches()) {
            z04.c0("Ignoring malformed cell resolution: ".concat(attributeValue));
            return 15;
        }
        boolean z = true;
        try {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            int i = Integer.parseInt(strGroup);
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            int i2 = Integer.parseInt(strGroup2);
            if (i == 0 || i2 == 0) {
                z = false;
            }
            fm9.e("Invalid cell resolution " + i + " " + i2, z);
            return i2;
        } catch (NumberFormatException unused) {
            z04.c0("Ignoring malformed cell resolution: ".concat(attributeValue));
            return 15;
        }
    }

    public static void d(String str, v3f v3fVar) throws SubtitleDecoderException {
        Matcher matcher;
        String strGroup;
        int i = oaf.a;
        String[] strArrSplit = str.split("\\s+", -1);
        int length = strArrSplit.length;
        Pattern pattern = o;
        if (length == 1) {
            matcher = pattern.matcher(str);
        } else {
            if (strArrSplit.length != 2) {
                throw new SubtitleDecoderException(zr6.j(new StringBuilder("Invalid number of entries for fontSize: "), strArrSplit.length, "."));
            }
            matcher = pattern.matcher(strArrSplit[1]);
            z04.c0("Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        }
        if (!matcher.matches()) {
            throw new SubtitleDecoderException(zr6.i("Invalid expression for fontSize: '", str, "'."));
        }
        strGroup = matcher.group(3);
        strGroup.getClass();
        switch (strGroup) {
            case "%":
                v3fVar.j = 3;
                break;
            case "em":
                v3fVar.j = 2;
                break;
            case "px":
                v3fVar.j = 1;
                break;
            default:
                throw new SubtitleDecoderException(zr6.i("Invalid unit for fontSize: '", strGroup, "'."));
        }
        String strGroup2 = matcher.group(1);
        strGroup2.getClass();
        v3fVar.k = Float.parseFloat(strGroup2);
    }

    public static uwc e(XmlPullParser xmlPullParser) throws NumberFormatException {
        float f;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int i = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            int i2 = oaf.a;
            fm9.e("frameRateMultiplier doesn't have 2 parts", attributeValue2.split(" ", -1).length == 2);
            f = Integer.parseInt(r2[0]) / Integer.parseInt(r2[1]);
        } else {
            f = 1.0f;
        }
        uwc uwcVar = t0;
        int i3 = uwcVar.b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i3 = Integer.parseInt(attributeValue3);
        }
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        return new uwc(i3, i * f, attributeValue4 != null ? Integer.parseInt(attributeValue4) : uwcVar.c);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:104:0x024b A[LOOP:0: B:3:0x000a->B:104:0x024b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x024a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void f(org.xmlpull.v1.XmlPullParser r20, java.util.HashMap r21, int r22, defpackage.jt r23, java.util.HashMap r24, java.util.HashMap r25) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 614
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r3f.f(org.xmlpull.v1.XmlPullParser, java.util.HashMap, int, jt, java.util.HashMap, java.util.HashMap):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:6:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.q3f g(org.xmlpull.v1.XmlPullParser r21, defpackage.q3f r22, java.util.HashMap r23, defpackage.uwc r24) throws androidx.media3.extractor.text.SubtitleDecoderException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r3f.g(org.xmlpull.v1.XmlPullParser, q3f, java.util.HashMap, uwc):q3f");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:67:0x00ea. Please report as an issue. */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:112:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0446  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0103  */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v66, types: [fpe] */
    /* JADX WARN: Type inference failed for: r11v77 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r12v15, types: [fpe] */
    /* JADX WARN: Type inference failed for: r12v21, types: [fpe] */
    /* JADX WARN: Type inference failed for: r1v52, types: [fpe] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.v3f h(org.xmlpull.v1.XmlPullParser r19, defpackage.v3f r20) {
        /*
            Method dump skipped, instructions count: 1550
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r3f.h(org.xmlpull.v1.XmlPullParser, v3f):v3f");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long i(java.lang.String r13, defpackage.uwc r14) throws androidx.media3.extractor.text.SubtitleDecoderException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r3f.i(java.lang.String, uwc):long");
    }

    public static jt j(XmlPullParser xmlPullParser) throws NumberFormatException {
        String strV = a14.v(xmlPullParser, "extent");
        if (strV == null) {
            return null;
        }
        Matcher matcher = Z.matcher(strV);
        if (!matcher.matches()) {
            z04.c0("Ignoring non-pixel tts extent: ".concat(strV));
            return null;
        }
        try {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            int i = Integer.parseInt(strGroup);
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            return new jt(i, Integer.parseInt(strGroup2), 11);
        } catch (NumberFormatException unused) {
            z04.c0("Ignoring malformed tts extent: ".concat(strV));
            return null;
        }
    }

    @Override // defpackage.obe
    public final void G(byte[] bArr, int i, int i2, nbe nbeVar, pj3 pj3Var) {
        z04.Y(n(i, bArr, i2), nbeVar, pj3Var);
    }

    @Override // defpackage.obe
    public final int J() {
        return 1;
    }

    @Override // defpackage.obe
    public final bbe n(int i, byte[] bArr, int i2) throws XmlPullParserException, NumberFormatException, IOException {
        uwc uwcVar;
        try {
            XmlPullParser xmlPullParserNewPullParser = this.a.newPullParser();
            HashMap map = new HashMap();
            HashMap map2 = new HashMap();
            HashMap map3 = new HashMap();
            map2.put("", new t3f("", -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE));
            jt jtVarJ = null;
            xmlPullParserNewPullParser.setInput(new ByteArrayInputStream(bArr, i, i2), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            uwc uwcVarE = t0;
            int iC = 15;
            x3c x3cVar = null;
            int i3 = 0;
            for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.getEventType()) {
                q3f q3fVar = (q3f) arrayDeque.peek();
                if (i3 == 0) {
                    String name = xmlPullParserNewPullParser.getName();
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            uwcVarE = e(xmlPullParserNewPullParser);
                            iC = c(xmlPullParserNewPullParser);
                            jtVarJ = j(xmlPullParserNewPullParser);
                        }
                        jt jtVar = jtVarJ;
                        uwc uwcVar2 = uwcVarE;
                        int i4 = iC;
                        if (b(name)) {
                            if ("head".equals(name)) {
                                uwcVar = uwcVar2;
                                f(xmlPullParserNewPullParser, map, i4, jtVar, map2, map3);
                            } else {
                                uwcVar = uwcVar2;
                                try {
                                    q3f q3fVarG = g(xmlPullParserNewPullParser, q3fVar, map2, uwcVar);
                                    arrayDeque.push(q3fVarG);
                                    if (q3fVar != null) {
                                        if (q3fVar.m == null) {
                                            q3fVar.m = new ArrayList();
                                        }
                                        q3fVar.m.add(q3fVarG);
                                    }
                                } catch (SubtitleDecoderException e) {
                                    z04.d0("Suppressing parser error", e);
                                    i3++;
                                }
                            }
                            uwcVarE = uwcVar;
                        } else {
                            z04.J("Ignoring unsupported tag: " + xmlPullParserNewPullParser.getName());
                            i3++;
                            uwcVarE = uwcVar2;
                        }
                        jtVarJ = jtVar;
                        iC = i4;
                    } else if (eventType == 4) {
                        q3fVar.getClass();
                        q3f q3fVarA = q3f.a(xmlPullParserNewPullParser.getText());
                        if (q3fVar.m == null) {
                            q3fVar.m = new ArrayList();
                        }
                        q3fVar.m.add(q3fVarA);
                    } else if (eventType == 3) {
                        if (xmlPullParserNewPullParser.getName().equals("tt")) {
                            q3f q3fVar2 = (q3f) arrayDeque.peek();
                            q3fVar2.getClass();
                            x3cVar = new x3c(q3fVar2, map, map2, map3);
                        }
                        arrayDeque.pop();
                    }
                } else if (eventType == 2) {
                    i3++;
                } else if (eventType == 3) {
                    i3--;
                }
                xmlPullParserNewPullParser.next();
            }
            x3cVar.getClass();
            return x3cVar;
        } catch (IOException e2) {
            throw new IllegalStateException("Unexpected error when reading input.", e2);
        } catch (XmlPullParserException e3) {
            throw new IllegalStateException("Unable to decode source", e3);
        }
    }
}
