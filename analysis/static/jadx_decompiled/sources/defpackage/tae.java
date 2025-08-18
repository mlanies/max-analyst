package defpackage;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class tae implements obe {
    public final StringBuilder a = new StringBuilder();
    public final ArrayList b = new ArrayList();
    public final wpa c = new wpa();
    public static final Pattern o = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");
    public static final Pattern X = Pattern.compile("\\{\\\\.*?\\}");

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.yz3 a(android.text.Spanned r23, java.lang.String r24) {
        /*
            Method dump skipped, instructions count: 418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tae.a(android.text.Spanned, java.lang.String):yz3");
    }

    public static long b(Matcher matcher, int i) {
        String strGroup = matcher.group(i + 1);
        long j = strGroup != null ? Long.parseLong(strGroup) * 3600000 : 0L;
        String strGroup2 = matcher.group(i + 2);
        strGroup2.getClass();
        long j2 = (Long.parseLong(strGroup2) * 60000) + j;
        String strGroup3 = matcher.group(i + 3);
        strGroup3.getClass();
        long j3 = (Long.parseLong(strGroup3) * 1000) + j2;
        String strGroup4 = matcher.group(i + 4);
        if (strGroup4 != null) {
            j3 += Long.parseLong(strGroup4);
        }
        return j3 * 1000;
    }

    @Override // defpackage.obe
    public final void G(byte[] bArr, int i, int i2, nbe nbeVar, pj3 pj3Var) throws NumberFormatException {
        pj3 pj3Var2;
        String strH;
        String str;
        tae taeVar = this;
        pj3 pj3Var3 = pj3Var;
        wpa wpaVar = taeVar.c;
        wpaVar.E(i + i2, bArr);
        wpaVar.G(i);
        Charset charsetC = wpaVar.C();
        if (charsetC == null) {
            charsetC = b52.c;
        }
        long j = nbeVar.b;
        ArrayList arrayList = (j == -9223372036854775807L || !nbeVar.a) ? null : new ArrayList();
        while (true) {
            String strH2 = wpaVar.h(charsetC);
            if (strH2 == null) {
                break;
            }
            if (strH2.length() != 0) {
                try {
                    Integer.parseInt(strH2);
                    strH = wpaVar.h(charsetC);
                } catch (NumberFormatException unused) {
                    pj3Var2 = pj3Var3;
                    z04.c0("Skipping invalid index: ".concat(strH2));
                }
                if (strH == null) {
                    z04.c0("Unexpected end");
                    break;
                }
                Matcher matcher = o.matcher(strH);
                if (matcher.matches()) {
                    long jB = b(matcher, 1);
                    long jB2 = b(matcher, 6);
                    StringBuilder sb = taeVar.a;
                    sb.setLength(0);
                    ArrayList arrayList2 = taeVar.b;
                    arrayList2.clear();
                    for (String strH3 = wpaVar.h(charsetC); !TextUtils.isEmpty(strH3); strH3 = wpaVar.h(charsetC)) {
                        if (sb.length() > 0) {
                            sb.append("<br>");
                        }
                        String strTrim = strH3.trim();
                        StringBuilder sb2 = new StringBuilder(strTrim);
                        Matcher matcher2 = X.matcher(strTrim);
                        int i3 = 0;
                        while (matcher2.find()) {
                            String strGroup = matcher2.group();
                            arrayList2.add(strGroup);
                            Matcher matcher3 = matcher2;
                            int iStart = matcher2.start() - i3;
                            int length = strGroup.length();
                            sb2.replace(iStart, iStart + length, "");
                            i3 += length;
                            matcher2 = matcher3;
                            jB2 = jB2;
                        }
                        sb.append(sb2.toString());
                        jB2 = jB2;
                    }
                    long j2 = jB2;
                    Spanned spannedFromHtml = Html.fromHtml(sb.toString());
                    int i4 = 0;
                    while (true) {
                        if (i4 >= arrayList2.size()) {
                            str = null;
                            break;
                        }
                        str = (String) arrayList2.get(i4);
                        if (str.matches("\\{\\\\an[1-9]\\}")) {
                            break;
                        } else {
                            i4++;
                        }
                    }
                    if (j == -9223372036854775807L || jB >= j) {
                        b04 b04Var = new b04(jB, j2 - jB, zw6.n(a(spannedFromHtml, str)));
                        pj3Var2 = pj3Var;
                        pj3Var2.accept(b04Var);
                    } else {
                        if (arrayList != null) {
                            arrayList.add(new b04(jB, j2 - jB, zw6.n(a(spannedFromHtml, str))));
                        }
                        pj3Var2 = pj3Var;
                    }
                } else {
                    pj3Var2 = pj3Var3;
                    z04.c0("Skipping invalid timing: ".concat(strH));
                }
                pj3Var3 = pj3Var2;
                taeVar = this;
            }
        }
        pj3 pj3Var4 = pj3Var3;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                pj3Var4.accept((b04) it.next());
            }
        }
    }

    @Override // defpackage.obe
    public final int J() {
        return 1;
    }
}
