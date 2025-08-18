package defpackage;

import com.google.android.exoplayer2.text.SubtitleDecoderException;
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
public final class o3f extends fqd {
    public final XmlPullParserFactory x0;
    public static final Pattern y0 = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
    public static final Pattern z0 = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
    public static final Pattern A0 = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
    public static final Pattern B0 = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");
    public static final Pattern C0 = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");
    public static final Pattern D0 = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");
    public static final Pattern E0 = Pattern.compile("^(\\d+) (\\d+)$");
    public static final uwc F0 = new uwc(1, 30.0f, 1);
    public static final fm5 G0 = new fm5(15, 12);

    public o3f() throws XmlPullParserException {
        try {
            XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
            this.x0 = xmlPullParserFactoryNewInstance;
            xmlPullParserFactoryNewInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e);
        }
    }

    public static u3f g(u3f u3fVar) {
        return u3fVar == null ? new u3f() : u3fVar;
    }

    public static boolean h(String str) {
        return str.equals("tt") || str.equals("head") || str.equals("body") || str.equals("div") || str.equals("p") || str.equals("span") || str.equals("br") || str.equals("style") || str.equals("styling") || str.equals("layout") || str.equals("region") || str.equals("metadata") || str.equals("image") || str.equals("data") || str.equals("information");
    }

    public static fm5 i(XmlPullParser xmlPullParser, fm5 fm5Var) throws SubtitleDecoderException, NumberFormatException {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return fm5Var;
        }
        Matcher matcher = E0.matcher(attributeValue);
        if (!matcher.matches()) {
            if (attributeValue.length() != 0) {
                "Ignoring malformed cell resolution: ".concat(attributeValue);
            }
            return fm5Var;
        }
        try {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            int i = Integer.parseInt(strGroup);
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            int i2 = Integer.parseInt(strGroup2);
            if (i != 0 && i2 != 0) {
                return new fm5(i2, 12);
            }
            StringBuilder sb = new StringBuilder(47);
            sb.append("Invalid cell resolution ");
            sb.append(i);
            sb.append(" ");
            sb.append(i2);
            throw new SubtitleDecoderException(sb.toString());
        } catch (NumberFormatException unused) {
            if (attributeValue.length() != 0) {
                "Ignoring malformed cell resolution: ".concat(attributeValue);
            }
            return fm5Var;
        }
    }

    public static void j(String str, u3f u3fVar) throws SubtitleDecoderException {
        Matcher matcher;
        String strGroup;
        int i = maf.a;
        String[] strArrSplit = str.split("\\s+", -1);
        int length = strArrSplit.length;
        Pattern pattern = A0;
        if (length == 1) {
            matcher = pattern.matcher(str);
        } else {
            if (strArrSplit.length != 2) {
                int length2 = strArrSplit.length;
                StringBuilder sb = new StringBuilder(52);
                sb.append("Invalid number of entries for fontSize: ");
                sb.append(length2);
                sb.append(".");
                throw new SubtitleDecoderException(sb.toString());
            }
            matcher = pattern.matcher(strArrSplit[1]);
        }
        if (!matcher.matches()) {
            StringBuilder sb2 = new StringBuilder(str.length() + 36);
            sb2.append("Invalid expression for fontSize: '");
            sb2.append(str);
            sb2.append("'.");
            throw new SubtitleDecoderException(sb2.toString());
        }
        strGroup = matcher.group(3);
        strGroup.getClass();
        switch (strGroup) {
            case "%":
                u3fVar.j = 3;
                break;
            case "em":
                u3fVar.j = 2;
                break;
            case "px":
                u3fVar.j = 1;
                break;
            default:
                StringBuilder sb3 = new StringBuilder(strGroup.length() + 30);
                sb3.append("Invalid unit for fontSize: '");
                sb3.append(strGroup);
                sb3.append("'.");
                throw new SubtitleDecoderException(sb3.toString());
        }
        String strGroup2 = matcher.group(1);
        strGroup2.getClass();
        u3fVar.k = Float.parseFloat(strGroup2);
    }

    public static uwc k(XmlPullParser xmlPullParser) throws SubtitleDecoderException, NumberFormatException {
        float f;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int i = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            int i2 = maf.a;
            if (attributeValue2.split(" ", -1).length != 2) {
                throw new SubtitleDecoderException("frameRateMultiplier doesn't have 2 parts");
            }
            f = Integer.parseInt(r2[0]) / Integer.parseInt(r2[1]);
        } else {
            f = 1.0f;
        }
        uwc uwcVar = F0;
        int i3 = uwcVar.b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i3 = Integer.parseInt(attributeValue3);
        }
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        return new uwc(i3, i * f, attributeValue4 != null ? Integer.parseInt(attributeValue4) : uwcVar.c);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:120:0x025a A[LOOP:0: B:3:0x000a->B:120:0x025a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0259 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0201  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m(org.xmlpull.v1.XmlPullParser r20, java.util.HashMap r21, defpackage.fm5 r22, defpackage.jt r23, java.util.HashMap r24, java.util.HashMap r25) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 630
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o3f.m(org.xmlpull.v1.XmlPullParser, java.util.HashMap, fm5, jt, java.util.HashMap, java.util.HashMap):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:6:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.p3f n(org.xmlpull.v1.XmlPullParser r21, defpackage.p3f r22, java.util.HashMap r23, defpackage.uwc r24) throws com.google.android.exoplayer2.text.SubtitleDecoderException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o3f.n(org.xmlpull.v1.XmlPullParser, p3f, java.util.HashMap, uwc):p3f");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:67:0x00ea. Please report as an issue. */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0476  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x04e4  */
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
    /* JADX WARN: Type inference failed for: r11v66, types: [epe] */
    /* JADX WARN: Type inference failed for: r11v77 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r12v16, types: [epe] */
    /* JADX WARN: Type inference failed for: r12v22, types: [epe] */
    /* JADX WARN: Type inference failed for: r1v52, types: [epe] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.u3f o(org.xmlpull.v1.XmlPullParser r19, defpackage.u3f r20) {
        /*
            Method dump skipped, instructions count: 1598
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o3f.o(org.xmlpull.v1.XmlPullParser, u3f):u3f");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long p(java.lang.String r13, defpackage.uwc r14) throws com.google.android.exoplayer2.text.SubtitleDecoderException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o3f.p(java.lang.String, uwc):long");
    }

    public static jt q(XmlPullParser xmlPullParser) throws NumberFormatException {
        String strX = z04.x(xmlPullParser, "extent");
        if (strX == null) {
            return null;
        }
        Matcher matcher = D0.matcher(strX);
        if (!matcher.matches()) {
            if (strX.length() != 0) {
                "Ignoring non-pixel tts extent: ".concat(strX);
            }
            return null;
        }
        try {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            int i = Integer.parseInt(strGroup);
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            return new jt(i, Integer.parseInt(strGroup2), 10);
        } catch (NumberFormatException unused) {
            if (strX.length() != 0) {
                "Ignoring malformed tts extent: ".concat(strX);
            }
            return null;
        }
    }

    @Override // defpackage.fqd
    public final abe a(int i, byte[] bArr, boolean z) throws XmlPullParserException, SubtitleDecoderException, NumberFormatException, IOException {
        uwc uwcVar;
        try {
            XmlPullParser xmlPullParserNewPullParser = this.x0.newPullParser();
            HashMap map = new HashMap();
            HashMap map2 = new HashMap();
            HashMap map3 = new HashMap();
            map2.put("", new s3f("", -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE));
            jt jtVarQ = null;
            xmlPullParserNewPullParser.setInput(new ByteArrayInputStream(bArr, 0, i), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            uwc uwcVarK = F0;
            fm5 fm5Var = G0;
            int i2 = 0;
            jc6 jc6Var = null;
            fm5 fm5VarI = fm5Var;
            for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.getEventType()) {
                p3f p3fVar = (p3f) arrayDeque.peek();
                if (i2 == 0) {
                    String name = xmlPullParserNewPullParser.getName();
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            uwcVarK = k(xmlPullParserNewPullParser);
                            fm5VarI = i(xmlPullParserNewPullParser, fm5Var);
                            jtVarQ = q(xmlPullParserNewPullParser);
                        }
                        fm5 fm5Var2 = fm5VarI;
                        jt jtVar = jtVarQ;
                        uwc uwcVar2 = uwcVarK;
                        if (h(name)) {
                            if ("head".equals(name)) {
                                uwcVar = uwcVar2;
                                m(xmlPullParserNewPullParser, map, fm5Var2, jtVar, map2, map3);
                            } else {
                                uwcVar = uwcVar2;
                                try {
                                    p3f p3fVarN = n(xmlPullParserNewPullParser, p3fVar, map2, uwcVar);
                                    arrayDeque.push(p3fVarN);
                                    if (p3fVar != null) {
                                        if (p3fVar.m == null) {
                                            p3fVar.m = new ArrayList();
                                        }
                                        p3fVar.m.add(p3fVarN);
                                    }
                                } catch (SubtitleDecoderException e) {
                                    fm9.c("Suppressing parser error", e);
                                    i2++;
                                }
                            }
                            uwcVarK = uwcVar;
                        } else {
                            String strValueOf = String.valueOf(xmlPullParserNewPullParser.getName());
                            if (strValueOf.length() != 0) {
                                "Ignoring unsupported tag: ".concat(strValueOf);
                            }
                            i2++;
                            uwcVarK = uwcVar2;
                        }
                        fm5VarI = fm5Var2;
                        jtVarQ = jtVar;
                    } else if (eventType == 4) {
                        p3fVar.getClass();
                        p3f p3fVarA = p3f.a(xmlPullParserNewPullParser.getText());
                        if (p3fVar.m == null) {
                            p3fVar.m = new ArrayList();
                        }
                        p3fVar.m.add(p3fVarA);
                    } else if (eventType == 3) {
                        if (xmlPullParserNewPullParser.getName().equals("tt")) {
                            p3f p3fVar2 = (p3f) arrayDeque.peek();
                            p3fVar2.getClass();
                            jc6Var = new jc6(p3fVar2, map, map2, map3);
                        }
                        arrayDeque.pop();
                    }
                } else if (eventType == 2) {
                    i2++;
                } else if (eventType == 3) {
                    i2--;
                }
                xmlPullParserNewPullParser.next();
            }
            if (jc6Var != null) {
                return jc6Var;
            }
            throw new SubtitleDecoderException("No TTML subtitles found");
        } catch (IOException e2) {
            throw new IllegalStateException("Unexpected error when reading input.", e2);
        } catch (XmlPullParserException e3) {
            throw new SubtitleDecoderException("Unable to decode source", e3);
        }
    }
}
