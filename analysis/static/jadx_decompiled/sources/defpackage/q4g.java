package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public abstract class q4g {
    public static final Pattern a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");
    public static final Pattern b = Pattern.compile("(\\S+?):(\\S+)");
    public static final Map c;
    public static final Map d;

    static {
        HashMap map = new HashMap();
        h4f.p(255, 255, 255, map, "white");
        h4f.p(0, 255, 0, map, "lime");
        h4f.p(0, 255, 255, map, "cyan");
        h4f.p(255, 0, 0, map, "red");
        h4f.p(255, 255, 0, map, "yellow");
        h4f.p(255, 0, 255, map, "magenta");
        h4f.p(0, 0, 255, map, "blue");
        h4f.p(0, 0, 0, map, "black");
        c = Collections.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        h4f.p(255, 255, 255, map2, "bg_white");
        h4f.p(0, 255, 0, map2, "bg_lime");
        h4f.p(0, 255, 255, map2, "bg_cyan");
        h4f.p(255, 0, 0, map2, "bg_red");
        h4f.p(255, 255, 0, map2, "bg_yellow");
        h4f.p(255, 0, 255, map2, "bg_magenta");
        h4f.p(0, 0, 255, map2, "bg_blue");
        h4f.p(0, 0, 0, map2, "bg_black");
        d = Collections.unmodifiableMap(map2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:4:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(java.lang.String r18, defpackage.l4g r19, java.util.List r20, android.text.SpannableStringBuilder r21, java.util.List r22) {
        /*
            Method dump skipped, instructions count: 634
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q4g.a(java.lang.String, l4g, java.util.List, android.text.SpannableStringBuilder, java.util.List):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList b(java.util.List r8, java.lang.String r9, defpackage.l4g r10) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            r2 = r1
        L7:
            int r3 = r8.size()
            if (r2 >= r3) goto L77
            java.lang.Object r3 = r8.get(r2)
            f4g r3 = (defpackage.f4g) r3
            java.lang.String r4 = r10.a
            java.lang.String r5 = r3.a
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L3a
            java.lang.String r5 = r3.b
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L3a
            java.util.Set r5 = r3.c
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L3a
            java.lang.String r5 = r3.d
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L3a
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            goto L6a
        L3a:
            java.lang.String r5 = r3.a
            r6 = 1073741824(0x40000000, float:2.0)
            int r5 = defpackage.f4g.a(r5, r1, r6, r9)
            java.lang.String r6 = r3.b
            r7 = 2
            int r4 = defpackage.f4g.a(r6, r5, r7, r4)
            java.lang.String r5 = r3.d
            java.lang.String r6 = r10.c
            r7 = 4
            int r4 = defpackage.f4g.a(r5, r4, r7, r6)
            r5 = -1
            if (r4 == r5) goto L69
            java.util.Set r5 = r3.c
            java.util.Set r6 = r10.d
            boolean r5 = r6.containsAll(r5)
            if (r5 != 0) goto L60
            goto L69
        L60:
            java.util.Set r5 = r3.c
            int r5 = r5.size()
            int r5 = r5 * r7
            int r4 = r4 + r5
            goto L6a
        L69:
            r4 = r1
        L6a:
            if (r4 <= 0) goto L74
            n4g r5 = new n4g
            r5.<init>(r4, r3)
            r0.add(r5)
        L74:
            int r2 = r2 + 1
            goto L7
        L77:
            java.util.Collections.sort(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q4g.b(java.util.List, java.lang.String, l4g):java.util.ArrayList");
    }

    public static int c(List list, String str, l4g l4gVar) {
        ArrayList arrayListB = b(list, str, l4gVar);
        for (int i = 0; i < arrayListB.size(); i++) {
            int i2 = ((n4g) arrayListB.get(i)).b.p;
            if (i2 != -1) {
                return i2;
            }
        }
        return -1;
    }

    public static h4g d(String str, Matcher matcher, wpa wpaVar, ArrayList arrayList) {
        o4g o4gVar = new o4g();
        try {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            o4gVar.a = v4g.c(strGroup);
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            o4gVar.b = v4g.c(strGroup2);
            String strGroup3 = matcher.group(3);
            strGroup3.getClass();
            e(strGroup3, o4gVar);
            StringBuilder sb = new StringBuilder();
            wpaVar.getClass();
            String strH = wpaVar.h(b52.c);
            while (!TextUtils.isEmpty(strH)) {
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                sb.append(strH.trim());
                strH = wpaVar.h(b52.c);
            }
            o4gVar.c = f(str, sb.toString(), arrayList);
            return new h4g(o4gVar.b().a(), o4gVar.a, o4gVar.b);
        } catch (NumberFormatException unused) {
            z04.c0("Skipping cue with bad header: " + matcher.group());
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void e(java.lang.String r18, defpackage.o4g r19) {
        /*
            Method dump skipped, instructions count: 480
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q4g.e(java.lang.String, o4g):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:70:0x00fb. Please report as an issue. */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.text.SpannedString f(java.lang.String r16, java.lang.String r17, java.util.List r18) {
        /*
            Method dump skipped, instructions count: 652
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q4g.f(java.lang.String, java.lang.String, java.util.List):android.text.SpannedString");
    }

    public static void g(String str, o4g o4gVar) {
        String strSubstring;
        int i = 2;
        int iIndexOf = str.indexOf(44);
        if (iIndexOf != -1) {
            strSubstring = str.substring(iIndexOf + 1);
            strSubstring.getClass();
            switch (strSubstring) {
                case "center":
                case "middle":
                    i = 1;
                    break;
                case "end":
                    break;
                case "start":
                    i = 0;
                    break;
                default:
                    z04.c0("Invalid anchor value: ".concat(strSubstring));
                    i = Integer.MIN_VALUE;
                    break;
            }
            o4gVar.g = i;
            str = str.substring(0, iIndexOf);
        }
        if (str.endsWith("%")) {
            o4gVar.e = v4g.b(str);
            o4gVar.f = 0;
        } else {
            o4gVar.e = Integer.parseInt(str);
            o4gVar.f = 1;
        }
    }
}
