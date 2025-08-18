package defpackage;

import io.michaelrocks.libphonenumber.android.MissingMetadataException;
import io.michaelrocks.libphonenumber.android.NumberParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class zua {
    public static final Logger h = Logger.getLogger(zua.class.getName());
    public static final Map i;
    public static final Map j;
    public static final Map k;
    public static final Pattern l;
    public static final Pattern m;
    public static final Pattern n;
    public static final Pattern o;
    public static final Pattern p;
    public static final Pattern q;
    public static final Pattern r;
    public static final Pattern s;
    public static final Pattern t;
    public static final Pattern u;
    public static final Pattern v;
    public static final Pattern w;
    public static final Pattern x;
    public final imc a;
    public final Map b;
    public final w4d c = new w4d(22);
    public final HashSet d = new HashSet(35);
    public final qqd e = new qqd(100);
    public final HashSet f = new HashSet(320);
    public final HashSet g = new HashSet();

    static {
        HashMap map = new HashMap();
        map.put(54, "9");
        Collections.unmodifiableMap(map);
        HashSet hashSet = new HashSet();
        hashSet.add(86);
        Collections.unmodifiableSet(hashSet);
        HashSet hashSet2 = new HashSet();
        hashSet2.add(52);
        hashSet2.add(54);
        hashSet2.add(55);
        hashSet2.add(62);
        hashSet2.addAll(hashSet);
        Collections.unmodifiableSet(hashSet2);
        HashMap map2 = new HashMap();
        map2.put('0', '0');
        map2.put('1', '1');
        map2.put('2', '2');
        map2.put('3', '3');
        map2.put('4', '4');
        map2.put('5', '5');
        map2.put('6', '6');
        map2.put('7', '7');
        map2.put('8', '8');
        map2.put('9', '9');
        HashMap map3 = new HashMap(40);
        map3.put('A', '2');
        map3.put('B', '2');
        map3.put('C', '2');
        map3.put('D', '3');
        map3.put('E', '3');
        map3.put('F', '3');
        map3.put('G', '4');
        map3.put('H', '4');
        map3.put('I', '4');
        map3.put('J', '5');
        map3.put('K', '5');
        map3.put('L', '5');
        map3.put('M', '6');
        map3.put('N', '6');
        map3.put('O', '6');
        map3.put('P', '7');
        map3.put('Q', '7');
        map3.put('R', '7');
        map3.put('S', '7');
        map3.put('T', '8');
        map3.put('U', '8');
        map3.put('V', '8');
        map3.put('W', '9');
        map3.put('X', '9');
        map3.put('Y', '9');
        map3.put('Z', '9');
        Map mapUnmodifiableMap = Collections.unmodifiableMap(map3);
        j = mapUnmodifiableMap;
        HashMap map4 = new HashMap(100);
        map4.putAll(mapUnmodifiableMap);
        map4.putAll(map2);
        k = Collections.unmodifiableMap(map4);
        HashMap map5 = new HashMap();
        map5.putAll(map2);
        map5.put('+', '+');
        map5.put('*', '*');
        map5.put('#', '#');
        i = Collections.unmodifiableMap(map5);
        HashMap map6 = new HashMap();
        for (Character ch : mapUnmodifiableMap.keySet()) {
            map6.put(Character.valueOf(Character.toLowerCase(ch.charValue())), ch);
            map6.put(ch, ch);
        }
        map6.putAll(map2);
        map6.put('-', '-');
        map6.put((char) 65293, '-');
        map6.put((char) 8208, '-');
        map6.put((char) 8209, '-');
        map6.put((char) 8210, '-');
        map6.put((char) 8211, '-');
        map6.put((char) 8212, '-');
        map6.put((char) 8213, '-');
        map6.put((char) 8722, '-');
        map6.put('/', '/');
        map6.put((char) 65295, '/');
        map6.put(' ', ' ');
        map6.put((char) 12288, ' ');
        map6.put((char) 8288, ' ');
        map6.put('.', '.');
        map6.put((char) 65294, '.');
        Collections.unmodifiableMap(map6);
        Pattern.compile("[\\d]+(?:[~⁓∼～][\\d]+)?");
        StringBuilder sb = new StringBuilder();
        Map map7 = j;
        sb.append(Arrays.toString(map7.keySet().toArray()).replaceAll("[, \\[\\]]", ""));
        sb.append(Arrays.toString(map7.keySet().toArray()).toLowerCase().replaceAll("[, \\[\\]]", ""));
        String string = sb.toString();
        l = Pattern.compile("[+＋]+");
        m = Pattern.compile("[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～]+");
        n = Pattern.compile("(\\p{Nd})");
        o = Pattern.compile("[+＋\\p{Nd}]");
        p = Pattern.compile("[\\\\/] *x");
        q = Pattern.compile("[[\\P{N}&&\\P{L}]&&[^#]]+$");
        r = Pattern.compile("(?:.*?[A-Za-z]){3}.*");
        String strI = zr6.i("\\p{Nd}{2}|[+＋]*+(?:[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～*]*\\p{Nd}){3,}[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～*", string, "\\p{Nd}]*");
        String strA = a(true);
        a(false);
        s = Pattern.compile("^\\+(\\p{Nd}|[\\-\\.\\(\\)]?)*\\p{Nd}(\\p{Nd}|[\\-\\.\\(\\)]?)*$");
        String strG = au1.g(string, "\\p{Nd}");
        t = Pattern.compile("^(" + k7d.j("[", strG, "]+((\\-)*[", strG, "])*") + "\\.)*" + k7d.j("[", string, "]+((\\-)*[", strG, "])*") + "\\.?$");
        StringBuilder sb2 = new StringBuilder("(?:");
        sb2.append(strA);
        sb2.append(")$");
        u = Pattern.compile(sb2.toString(), 66);
        v = Pattern.compile(strI + "(?:" + strA + ")?", 66);
        Pattern.compile("(\\D+)");
        w = Pattern.compile("(\\$\\d)");
        x = Pattern.compile("\\(?\\$1\\)?");
    }

    public zua(imc imcVar, HashMap map) {
        this.a = imcVar;
        this.b = map;
        for (Map.Entry entry : map.entrySet()) {
            List list = (List) entry.getValue();
            if (list.size() == 1 && "001".equals(list.get(0))) {
                this.g.add((Integer) entry.getKey());
            } else {
                this.f.addAll(list);
            }
        }
        if (this.f.remove("001")) {
            h.log(Level.WARNING, "invalid metadata (country calling code was mapped to the non-geo entity as well as specific region(s))");
        }
        this.d.addAll((Collection) map.get(1));
    }

    public static String a(boolean z) {
        String str = ";ext=" + b(20);
        String str2 = "[  \\t,]*(?:e?xt(?:ensi(?:ó?|ó))?n?|ｅ?ｘｔｎ?|доб|anexo)[:\\.．]?[  \\t,-]*" + b(20) + "#?";
        String str3 = "[  \\t,]*(?:[xｘ#＃~～]|int|ｉｎｔ)[:\\.．]?[  \\t,-]*" + b(9) + "#?";
        String str4 = "[- ]+" + b(6) + "#";
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("|");
        sb.append(str2);
        sb.append("|");
        sb.append(str3);
        String strL = zr6.l(sb, "|", str4);
        if (!z) {
            return strL;
        }
        return strL + "|" + ("[  \\t]*(?:,{2}|;)[:\\.．]?[  \\t,-]*" + b(15) + "#?") + "|" + ("[  \\t]*(?:,)+[:\\.．]?[  \\t,-]*" + b(9) + "#?");
    }

    public static String b(int i2) {
        return wg0.g(i2, "(\\p{Nd}{1,", "})");
    }

    public static String h(qva qvaVar) {
        int i2;
        StringBuilder sb = new StringBuilder();
        if (qvaVar.Y && (i2 = qvaVar.s0) > 0) {
            char[] cArr = new char[i2];
            Arrays.fill(cArr, '0');
            sb.append(new String(cArr));
        }
        sb.append(qvaVar.b);
        return sb.toString();
    }

    public static pva i(ova ovaVar, int i2) {
        switch (au1.s(i2)) {
            case 0:
            case 2:
                return ovaVar.o;
            case 1:
                return ovaVar.Y;
            case 3:
                return ovaVar.s0;
            case 4:
                return ovaVar.u0;
            case 5:
                return ovaVar.w0;
            case 6:
                return ovaVar.A0;
            case 7:
                return ovaVar.y0;
            case 8:
                return ovaVar.C0;
            case 9:
                return ovaVar.E0;
            case 10:
                return ovaVar.I0;
            default:
                return ovaVar.b;
        }
    }

    public static void q(StringBuilder sb) {
        if (r.matcher(sb).matches()) {
            sb.replace(0, sb.length(), s(sb, k));
        } else {
            sb.replace(0, sb.length(), r(sb));
        }
    }

    public static String r(CharSequence charSequence) {
        StringBuilder sb = new StringBuilder(charSequence.length());
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            int iDigit = Character.digit(charSequence.charAt(i2), 10);
            if (iDigit != -1) {
                sb.append(iDigit);
            }
        }
        return sb.toString();
    }

    public static String s(CharSequence charSequence, Map map) {
        StringBuilder sb = new StringBuilder(charSequence.length());
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            Character ch = (Character) map.get(Character.valueOf(Character.toUpperCase(charSequence.charAt(i2))));
            if (ch != null) {
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    public static void u(int i2, int i3, StringBuilder sb) {
        int iS = au1.s(i3);
        if (iS == 0) {
            sb.insert(0, i2).insert(0, '+');
        } else if (iS == 1) {
            sb.insert(0, " ").insert(0, i2).insert(0, '+');
        } else {
            if (iS != 3) {
                return;
            }
            sb.insert(0, "-").insert(0, i2).insert(0, '+').insert(0, "tel:");
        }
    }

    public static int v(StringBuilder sb, ova ovaVar, int i2) {
        pva pvaVarI = i(ovaVar, i2);
        ArrayList arrayList = pvaVarI.c.isEmpty() ? ovaVar.b.c : pvaVarI.c;
        ArrayList arrayList2 = pvaVarI.o;
        if (i2 == 3) {
            pva pvaVarI2 = i(ovaVar, 1);
            if (!((pvaVarI2.c.size() == 1 && ((Integer) pvaVarI2.c.get(0)).intValue() == -1) ? false : true)) {
                return v(sb, ovaVar, 2);
            }
            pva pvaVarI3 = i(ovaVar, 2);
            if (pvaVarI3.c.size() != 1 || ((Integer) pvaVarI3.c.get(0)).intValue() != -1) {
                ArrayList arrayList3 = new ArrayList(arrayList);
                arrayList3.addAll(pvaVarI3.c.size() == 0 ? ovaVar.b.c : pvaVarI3.c);
                Collections.sort(arrayList3);
                boolean zIsEmpty = arrayList2.isEmpty();
                ArrayList arrayList4 = pvaVarI3.o;
                if (zIsEmpty) {
                    arrayList2 = arrayList4;
                } else {
                    ArrayList arrayList5 = new ArrayList(arrayList2);
                    arrayList5.addAll(arrayList4);
                    Collections.sort(arrayList5);
                    arrayList2 = arrayList5;
                }
                arrayList = arrayList3;
            }
        }
        if (((Integer) arrayList.get(0)).intValue() == -1) {
            return 5;
        }
        int length = sb.length();
        if (arrayList2.contains(Integer.valueOf(length))) {
            return 2;
        }
        int iIntValue = ((Integer) arrayList.get(0)).intValue();
        if (iIntValue == length) {
            return 1;
        }
        if (iIntValue > length) {
            return 4;
        }
        if (((Integer) arrayList.get(arrayList.size() - 1)).intValue() < length) {
            return 6;
        }
        return arrayList.subList(1, arrayList.size()).contains(Integer.valueOf(length)) ? 1 : 5;
    }

    public final int c(StringBuilder sb, StringBuilder sb2) throws NumberFormatException {
        if (sb.length() != 0 && sb.charAt(0) != '0') {
            int length = sb.length();
            for (int i2 = 1; i2 <= 3 && i2 <= length; i2++) {
                int i3 = Integer.parseInt(sb.substring(0, i2));
                if (this.b.containsKey(Integer.valueOf(i3))) {
                    sb2.append(sb.substring(i2));
                    return i3;
                }
            }
        }
        return 0;
    }

    public final String d(qva qvaVar, int i2) {
        qqd qqdVar;
        mva mvaVar;
        StringBuilder sb = new StringBuilder(20);
        sb.setLength(0);
        int i3 = qvaVar.a;
        String strH = h(qvaVar);
        if (i2 == 1) {
            sb.append(strH);
            u(i3, 1, sb);
        } else {
            if (this.b.containsKey(Integer.valueOf(i3))) {
                String strK = k(i3);
                ova ovaVarF = "001".equals(strK) ? f(i3) : g(strK);
                Iterator it = ((ovaVarF.i1.size() == 0 || i2 == 3) ? ovaVarF.h1 : ovaVarF.i1).iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    qqdVar = this.e;
                    if (!zHasNext) {
                        mvaVar = null;
                        break;
                    }
                    mvaVar = (mva) it.next();
                    int size = mvaVar.c.size();
                    if (size != 0) {
                        if (!qqdVar.w((String) mvaVar.c.get(size - 1)).matcher(strH).lookingAt()) {
                            continue;
                        }
                    }
                    if (qqdVar.w(mvaVar.a).matcher(strH).matches()) {
                        break;
                    }
                }
                if (mvaVar != null) {
                    String str = mvaVar.b;
                    Matcher matcher = qqdVar.w(mvaVar.a).matcher(strH);
                    String str2 = mvaVar.X;
                    strH = (i2 != 3 || str2 == null || str2.length() <= 0) ? matcher.replaceAll(str) : matcher.replaceAll(w.matcher(str).replaceFirst(str2));
                    if (i2 == 4) {
                        Matcher matcher2 = m.matcher(strH);
                        if (matcher2.lookingAt()) {
                            strH = matcher2.replaceFirst("");
                        }
                        strH = matcher2.reset(strH).replaceAll("-");
                    }
                }
                sb.append(strH);
                if (qvaVar.c && qvaVar.o.length() > 0) {
                    if (i2 == 4) {
                        sb.append(";ext=");
                        sb.append(qvaVar.o);
                    } else if (ovaVarF.a1) {
                        sb.append(ovaVarF.b1);
                        sb.append(qvaVar.o);
                    } else {
                        sb.append(" ext. ");
                        sb.append(qvaVar.o);
                    }
                }
                u(i3, i2, sb);
            } else {
                sb.append(strH);
            }
        }
        return sb.toString();
    }

    public final qva e(String str) {
        boolean zN = n(str);
        Logger logger = h;
        if (!zN) {
            logger.log(Level.WARNING, "Invalid or unknown region code provided: " + str);
            return null;
        }
        pva pvaVarI = i(g(str), 2);
        try {
            if (pvaVarI.X) {
                return t(str, pvaVarI.Y);
            }
        } catch (NumberParseException e) {
            logger.log(Level.SEVERE, e.toString());
        }
        return null;
    }

    public final ova f(int i2) {
        if (!this.g.contains(Integer.valueOf(i2))) {
            return null;
        }
        imc imcVar = this.a;
        imcVar.getClass();
        List list = (List) m6d.q().get(Integer.valueOf(i2));
        if (list != null && !list.contains("001")) {
            throw new IllegalArgumentException(i2 + " calling code belongs to a geo entity");
        }
        ova ovaVar = (ova) ((ConcurrentHashMap) ((qc3) ((m5d) imcVar.c).A(((tf9) ((yua) imcVar.b)).a(Integer.valueOf(i2)))).a.a).get(Integer.valueOf(i2));
        String strH = zr6.h(i2, "Missing metadata for country code ");
        if (ovaVar != null) {
            return ovaVar;
        }
        throw new MissingMetadataException(strH);
    }

    public final ova g(String str) {
        if (!n(str)) {
            return null;
        }
        imc imcVar = this.a;
        imcVar.getClass();
        if (!(!str.equals("001"))) {
            throw new IllegalArgumentException(str.concat(" region code is a non-geo entity"));
        }
        ova ovaVar = (ova) ((ConcurrentHashMap) ((qc3) ((m5d) imcVar.c).A(((tf9) ((yua) imcVar.b)).a(str))).b.a).get(str);
        String strConcat = "Missing metadata for region code ".concat(str);
        if (ovaVar != null) {
            return ovaVar;
        }
        throw new MissingMetadataException(strConcat);
    }

    public final int j(String str, ova ovaVar) {
        if (!l(str, ovaVar.b)) {
            return 12;
        }
        if (l(str, ovaVar.u0)) {
            return 5;
        }
        if (l(str, ovaVar.s0)) {
            return 4;
        }
        if (l(str, ovaVar.w0)) {
            return 6;
        }
        if (l(str, ovaVar.A0)) {
            return 7;
        }
        if (l(str, ovaVar.y0)) {
            return 8;
        }
        if (l(str, ovaVar.C0)) {
            return 9;
        }
        if (l(str, ovaVar.E0)) {
            return 10;
        }
        if (l(str, ovaVar.I0)) {
            return 11;
        }
        return l(str, ovaVar.o) ? (ovaVar.g1 || l(str, ovaVar.Y)) ? 3 : 1 : (ovaVar.g1 || !l(str, ovaVar.Y)) ? 12 : 2;
    }

    public final String k(int i2) {
        List list = (List) this.b.get(Integer.valueOf(i2));
        return list == null ? "ZZ" : (String) list.get(0);
    }

    public final boolean l(String str, pva pvaVar) {
        int length = str.length();
        ArrayList arrayList = pvaVar.c;
        if (arrayList.size() <= 0 || arrayList.contains(Integer.valueOf(length))) {
            return this.c.F(str, pvaVar);
        }
        return false;
    }

    public final boolean m(qva qvaVar) {
        int i2 = qvaVar.a;
        List<String> list = (List) this.b.get(Integer.valueOf(i2));
        String str = null;
        if (list != null) {
            if (list.size() != 1) {
                String strH = h(qvaVar);
                for (String str2 : list) {
                    ova ovaVarG = g(str2);
                    if (!ovaVarG.k1) {
                        if (j(strH, ovaVarG) != 12) {
                            str = str2;
                            break;
                        }
                    } else {
                        if (this.e.w(ovaVarG.l1).matcher(strH).lookingAt()) {
                            str = str2;
                            break;
                        }
                    }
                }
            } else {
                str = (String) list.get(0);
            }
        } else {
            h.log(Level.INFO, wg0.g(i2, "Missing/invalid country_code (", ")"));
        }
        int i3 = qvaVar.a;
        ova ovaVarF = "001".equals(str) ? f(i3) : g(str);
        if (ovaVarF == null) {
            return false;
        }
        if (!"001".equals(str)) {
            ova ovaVarG2 = g(str);
            if (ovaVarG2 == null) {
                throw new IllegalArgumentException(wg0.i("Invalid region code: ", str));
            }
            if (i3 != ovaVarG2.U0) {
                return false;
            }
        }
        return j(h(qvaVar), ovaVarF) != 12;
    }

    public final boolean n(String str) {
        return str != null && this.f.contains(str);
    }

    public final int o(CharSequence charSequence, ova ovaVar, StringBuilder sb, qva qvaVar) throws NumberParseException, NumberFormatException {
        if (charSequence.length() == 0) {
            return 0;
        }
        StringBuilder sb2 = new StringBuilder(charSequence);
        String str = ovaVar != null ? ovaVar.V0 : "NonMatch";
        if (sb2.length() != 0) {
            Matcher matcher = l.matcher(sb2);
            if (matcher.lookingAt()) {
                sb2.delete(0, matcher.end());
                q(sb2);
            } else {
                Pattern patternW = this.e.w(str);
                q(sb2);
                Matcher matcher2 = patternW.matcher(sb2);
                if (matcher2.lookingAt()) {
                    int iEnd = matcher2.end();
                    Matcher matcher3 = n.matcher(sb2.substring(iEnd));
                    if (!matcher3.find() || !r(matcher3.group(1)).equals("0")) {
                        sb2.delete(0, iEnd);
                    }
                }
            }
            if (sb2.length() <= 2) {
                throw new NumberParseException(3, "Phone number had an IDD, but after this was not long enough to be a viable phone number.");
            }
            int iC = c(sb2, sb);
            if (iC == 0) {
                throw new NumberParseException(1, "Country calling code supplied was not recognised.");
            }
            qvaVar.a = iC;
            return iC;
        }
        if (ovaVar != null) {
            int i2 = ovaVar.U0;
            String strValueOf = String.valueOf(i2);
            String string = sb2.toString();
            if (string.startsWith(strValueOf)) {
                StringBuilder sb3 = new StringBuilder(string.substring(strValueOf.length()));
                pva pvaVar = ovaVar.b;
                p(sb3, ovaVar, null);
                w4d w4dVar = this.c;
                if ((!w4dVar.F(sb2, pvaVar) && w4dVar.F(sb3, pvaVar)) || v(sb2, ovaVar, 12) == 6) {
                    sb.append((CharSequence) sb3);
                    qvaVar.a = i2;
                    return i2;
                }
            }
        }
        qvaVar.a = 0;
        return 0;
    }

    public final void p(StringBuilder sb, ova ovaVar, StringBuilder sb2) {
        int length = sb.length();
        String str = ovaVar.d1;
        if (length == 0 || str.length() == 0) {
            return;
        }
        Matcher matcher = this.e.w(str).matcher(sb);
        if (matcher.lookingAt()) {
            pva pvaVar = ovaVar.b;
            w4d w4dVar = this.c;
            boolean zF = w4dVar.F(sb, pvaVar);
            int iGroupCount = matcher.groupCount();
            String str2 = ovaVar.f1;
            if (str2 == null || str2.length() == 0 || matcher.group(iGroupCount) == null) {
                if (!zF || w4dVar.F(sb.substring(matcher.end()), pvaVar)) {
                    if (sb2 != null && iGroupCount > 0 && matcher.group(iGroupCount) != null) {
                        sb2.append(matcher.group(1));
                    }
                    sb.delete(0, matcher.end());
                    return;
                }
                return;
            }
            StringBuilder sb3 = new StringBuilder(sb);
            sb3.replace(0, length, matcher.replaceFirst(str2));
            if (!zF || w4dVar.F(sb3.toString(), pvaVar)) {
                if (sb2 != null && iGroupCount > 1) {
                    sb2.append(matcher.group(1));
                }
                sb.replace(0, sb.length(), sb3.toString());
            }
        }
    }

    public final qva t(String str, CharSequence charSequence) {
        String strSubstring;
        CharSequence charSequenceSubSequence;
        int iO;
        qva qvaVar = new qva();
        qvaVar.a = 0;
        qvaVar.b = 0L;
        String strGroup = "";
        qvaVar.o = "";
        qvaVar.Y = false;
        qvaVar.s0 = 1;
        qvaVar.t0 = "";
        qvaVar.v0 = "";
        qvaVar.u0 = 5;
        if (charSequence == null) {
            throw new NumberParseException(2, "The phone number supplied was null.");
        }
        if (charSequence.length() > 250) {
            throw new NumberParseException(5, "The string supplied was too long to parse.");
        }
        StringBuilder sb = new StringBuilder();
        String string = charSequence.toString();
        int iIndexOf = string.indexOf(";phone-context=");
        if (iIndexOf == -1) {
            strSubstring = null;
        } else {
            int i2 = iIndexOf + 15;
            if (i2 >= string.length()) {
                strSubstring = "";
            } else {
                int iIndexOf2 = string.indexOf(59, i2);
                strSubstring = iIndexOf2 != -1 ? string.substring(i2, iIndexOf2) : string.substring(i2);
            }
        }
        if (strSubstring != null && (strSubstring.length() == 0 || !(s.matcher(strSubstring).matches() || t.matcher(strSubstring).matches()))) {
            throw new NumberParseException(2, "The phone-context value is invalid.");
        }
        if (strSubstring != null) {
            if (strSubstring.charAt(0) == '+') {
                sb.append(strSubstring);
            }
            int iIndexOf3 = string.indexOf("tel:");
            sb.append(string.substring(iIndexOf3 >= 0 ? iIndexOf3 + 4 : 0, iIndexOf));
        } else {
            Matcher matcher = o.matcher(string);
            if (matcher.find()) {
                charSequenceSubSequence = string.subSequence(matcher.start(), string.length());
                Matcher matcher2 = q.matcher(charSequenceSubSequence);
                if (matcher2.find()) {
                    charSequenceSubSequence = charSequenceSubSequence.subSequence(0, matcher2.start());
                }
                Matcher matcher3 = p.matcher(charSequenceSubSequence);
                if (matcher3.find()) {
                    charSequenceSubSequence = charSequenceSubSequence.subSequence(0, matcher3.start());
                }
            } else {
                charSequenceSubSequence = "";
            }
            sb.append(charSequenceSubSequence);
        }
        int iIndexOf4 = sb.indexOf(";isub=");
        if (iIndexOf4 > 0) {
            sb.delete(iIndexOf4, sb.length());
        }
        int length = sb.length();
        Pattern pattern = v;
        if (!(length < 2 ? false : pattern.matcher(sb).matches())) {
            throw new NumberParseException(2, "The string supplied did not seem to be a phone number.");
        }
        boolean zN = n(str);
        Pattern pattern2 = l;
        if (!zN && (sb.length() == 0 || !pattern2.matcher(sb).lookingAt())) {
            throw new NumberParseException(1, "Missing or invalid default region.");
        }
        Matcher matcher4 = u.matcher(sb);
        if (matcher4.find()) {
            String strSubstring2 = sb.substring(0, matcher4.start());
            if (strSubstring2.length() < 2 ? false : pattern.matcher(strSubstring2).matches()) {
                int iGroupCount = matcher4.groupCount();
                int i3 = 1;
                while (true) {
                    if (i3 > iGroupCount) {
                        break;
                    }
                    if (matcher4.group(i3) != null) {
                        strGroup = matcher4.group(i3);
                        sb.delete(matcher4.start(), sb.length());
                        break;
                    }
                    i3++;
                }
            }
        }
        if (strGroup.length() > 0) {
            qvaVar.c = true;
            qvaVar.o = strGroup;
        }
        ova ovaVarG = g(str);
        StringBuilder sb2 = new StringBuilder();
        try {
            iO = o(sb, ovaVarG, sb2, qvaVar);
        } catch (NumberParseException e) {
            Matcher matcher5 = pattern2.matcher(sb);
            int i4 = e.a;
            if (i4 != 1 || !matcher5.lookingAt()) {
                throw new NumberParseException(i4, e.getMessage());
            }
            iO = o(sb.substring(matcher5.end()), ovaVarG, sb2, qvaVar);
            if (iO == 0) {
                throw new NumberParseException(1, "Could not interpret numbers after plus-sign.");
            }
        }
        if (iO != 0) {
            String strK = k(iO);
            if (!strK.equals(str)) {
                ovaVarG = "001".equals(strK) ? f(iO) : g(strK);
            }
        } else {
            q(sb);
            sb2.append((CharSequence) sb);
            if (str != null) {
                qvaVar.a = ovaVarG.U0;
            }
        }
        if (sb2.length() < 2) {
            throw new NumberParseException(4, "The string supplied is too short to be a phone number.");
        }
        if (ovaVarG != null) {
            StringBuilder sb3 = new StringBuilder();
            StringBuilder sb4 = new StringBuilder(sb2);
            p(sb4, ovaVarG, sb3);
            int iV = v(sb4, ovaVarG, 12);
            if (iV != 4 && iV != 2 && iV != 5) {
                sb2 = sb4;
            }
        }
        int length2 = sb2.length();
        if (length2 < 2) {
            throw new NumberParseException(4, "The string supplied is too short to be a phone number.");
        }
        if (length2 > 17) {
            throw new NumberParseException(5, "The string supplied is too long to be a phone number.");
        }
        if (sb2.length() > 1 && sb2.charAt(0) == '0') {
            qvaVar.X = true;
            qvaVar.Y = true;
            int i5 = 1;
            while (i5 < sb2.length() - 1 && sb2.charAt(i5) == '0') {
                i5++;
            }
            if (i5 != 1) {
                qvaVar.Z = true;
                qvaVar.s0 = i5;
            }
        }
        qvaVar.b = Long.parseLong(sb2.toString());
        return qvaVar;
    }
}
