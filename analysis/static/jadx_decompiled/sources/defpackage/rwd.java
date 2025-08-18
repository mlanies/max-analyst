package defpackage;

import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import androidx.work.WorkRequest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class rwd extends fqd {
    public static final Pattern C0 = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");
    public float A0 = -3.4028235E38f;
    public float B0 = -3.4028235E38f;
    public final boolean x0;
    public final ve y0;
    public LinkedHashMap z0;

    public rwd(List list) throws NumberFormatException {
        if (list == null || list.isEmpty()) {
            this.x0 = false;
            this.y0 = null;
            return;
        }
        this.x0 = true;
        String strN = maf.n((byte[]) list.get(0));
        np8.d(strN.startsWith("Format:"));
        ve veVarB = ve.b(strN);
        veVarB.getClass();
        this.y0 = veVarB;
        h(new yaf((byte[]) list.get(1)));
    }

    public static int g(long j, ArrayList arrayList, ArrayList arrayList2) {
        int i;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i = 0;
                break;
            }
            if (((Long) arrayList.get(size)).longValue() == j) {
                return size;
            }
            if (((Long) arrayList.get(size)).longValue() < j) {
                i = size + 1;
                break;
            }
            size--;
        }
        arrayList.add(i, Long.valueOf(j));
        arrayList2.add(i, i == 0 ? new ArrayList() : new ArrayList((Collection) arrayList2.get(i - 1)));
        return i;
    }

    public static long i(String str) {
        Matcher matcher = C0.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        String strGroup = matcher.group(1);
        int i = maf.a;
        return (Long.parseLong(matcher.group(4)) * WorkRequest.MIN_BACKOFF_MILLIS) + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(2)) * 60000000) + (Long.parseLong(strGroup) * 3600000000L);
    }

    @Override // defpackage.fqd
    public final abe a(int i, byte[] bArr, boolean z) throws NumberFormatException {
        yaf yafVar;
        ve veVar;
        float f;
        int i2;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        int i3;
        int i4;
        int i5;
        float f2;
        float f3;
        float f4;
        float f5;
        int i6;
        float f6;
        int i7;
        int i8;
        int i9;
        int iA;
        int i10;
        rwd rwdVar = this;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        yaf yafVar2 = new yaf(i, bArr);
        boolean z2 = rwdVar.x0;
        if (!z2) {
            rwdVar.h(yafVar2);
        }
        ve veVarB = z2 ? rwdVar.y0 : null;
        while (true) {
            String strI = yafVar2.i();
            if (strI == null) {
                return new eqa(arrayList, arrayList2);
            }
            if (strI.startsWith("Format:")) {
                veVarB = ve.b(strI);
            } else if (strI.startsWith("Dialogue:")) {
                if (veVarB != null) {
                    np8.d(strI.startsWith("Dialogue:"));
                    String strSubstring = strI.substring(9);
                    int i11 = veVarB.e;
                    String[] strArrSplit = strSubstring.split(",", i11);
                    if (strArrSplit.length == i11) {
                        long jI = i(strArrSplit[veVarB.a]);
                        if (jI != -9223372036854775807L) {
                            long jI2 = i(strArrSplit[veVarB.b]);
                            if (jI2 != -9223372036854775807L) {
                                LinkedHashMap linkedHashMap = rwdVar.z0;
                                xwd xwdVar = (linkedHashMap == null || (i10 = veVarB.c) == -1) ? null : (xwd) linkedHashMap.get(strArrSplit[i10].trim());
                                String str = strArrSplit[veVarB.d];
                                Matcher matcher = vwd.a.matcher(str);
                                int i12 = -1;
                                PointF pointF = null;
                                while (matcher.find()) {
                                    String strGroup = matcher.group(1);
                                    strGroup.getClass();
                                    try {
                                        PointF pointFA = vwd.a(strGroup);
                                        if (pointFA != null) {
                                            pointF = pointFA;
                                        }
                                    } catch (RuntimeException unused) {
                                    }
                                    try {
                                        Matcher matcher2 = vwd.d.matcher(strGroup);
                                        if (matcher2.find()) {
                                            String strGroup2 = matcher2.group(1);
                                            strGroup2.getClass();
                                            iA = xwd.a(strGroup2);
                                        } else {
                                            iA = -1;
                                        }
                                        if (iA != -1) {
                                            i12 = iA;
                                        }
                                    } catch (RuntimeException unused2) {
                                    }
                                }
                                String strReplace = vwd.a.matcher(str).replaceAll("").replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " ");
                                float f7 = rwdVar.A0;
                                float f8 = rwdVar.B0;
                                SpannableString spannableString = new SpannableString(strReplace);
                                if (xwdVar != null) {
                                    Integer num = xwdVar.c;
                                    if (num != null) {
                                        yafVar = yafVar2;
                                        veVar = veVarB;
                                        spannableString.setSpan(new ForegroundColorSpan(num.intValue()), 0, spannableString.length(), 33);
                                    } else {
                                        yafVar = yafVar2;
                                        veVar = veVarB;
                                    }
                                    float f9 = xwdVar.d;
                                    if (f9 == -3.4028235E38f || f8 == -3.4028235E38f) {
                                        f5 = -3.4028235E38f;
                                        i6 = Integer.MIN_VALUE;
                                    } else {
                                        f5 = f9 / f8;
                                        i6 = 1;
                                    }
                                    boolean z3 = xwdVar.f;
                                    boolean z4 = xwdVar.e;
                                    if (z4 && z3) {
                                        f6 = f5;
                                        i7 = i6;
                                        i8 = 0;
                                        i9 = 33;
                                        spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
                                    } else {
                                        f6 = f5;
                                        i7 = i6;
                                        i8 = 0;
                                        i9 = 33;
                                        if (z4) {
                                            spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
                                        } else if (z3) {
                                            spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
                                        }
                                    }
                                    if (xwdVar.g) {
                                        spannableString.setSpan(new UnderlineSpan(), i8, spannableString.length(), i9);
                                    }
                                    if (xwdVar.h) {
                                        spannableString.setSpan(new StrikethroughSpan(), i8, spannableString.length(), i9);
                                    }
                                    i2 = i7;
                                    f = f6;
                                } else {
                                    yafVar = yafVar2;
                                    veVar = veVarB;
                                    f = -3.4028235E38f;
                                    i2 = Integer.MIN_VALUE;
                                }
                                int i13 = -1;
                                if (i12 != -1) {
                                    i13 = i12;
                                } else if (xwdVar != null) {
                                    i13 = xwdVar.b;
                                }
                                switch (i13) {
                                    case 1:
                                    case 4:
                                    case 7:
                                        alignment = Layout.Alignment.ALIGN_NORMAL;
                                        alignment2 = alignment;
                                        break;
                                    case 2:
                                    case 5:
                                    case 8:
                                        alignment = Layout.Alignment.ALIGN_CENTER;
                                        alignment2 = alignment;
                                        break;
                                    case 3:
                                    case 6:
                                    case 9:
                                        alignment = Layout.Alignment.ALIGN_OPPOSITE;
                                        alignment2 = alignment;
                                        break;
                                    default:
                                        alignment2 = null;
                                        break;
                                }
                                int i14 = Integer.MIN_VALUE;
                                switch (i13) {
                                    case 1:
                                    case 4:
                                    case 7:
                                        i3 = 0;
                                        break;
                                    case 2:
                                    case 5:
                                    case 8:
                                        i3 = 1;
                                        break;
                                    case 3:
                                    case 6:
                                    case 9:
                                        i3 = 2;
                                        break;
                                    default:
                                        i3 = Integer.MIN_VALUE;
                                        break;
                                }
                                switch (i13) {
                                    case 1:
                                    case 2:
                                    case 3:
                                        i14 = 2;
                                        break;
                                    case 4:
                                    case 5:
                                    case 6:
                                        i14 = 1;
                                        break;
                                    case 7:
                                    case 8:
                                    case 9:
                                        i14 = 0;
                                        break;
                                }
                                if (pointF == null || f8 == -3.4028235E38f || f7 == -3.4028235E38f) {
                                    if (i3 != 0) {
                                        i4 = 1;
                                        if (i3 != 1) {
                                            i5 = 2;
                                            f2 = i3 != 2 ? -3.4028235E38f : 0.95f;
                                        } else {
                                            i5 = 2;
                                            f2 = 0.5f;
                                        }
                                    } else {
                                        i4 = 1;
                                        i5 = 2;
                                        f2 = 0.05f;
                                    }
                                    f3 = i14 != 0 ? i14 != i4 ? i14 != i5 ? -3.4028235E38f : 0.95f : 0.5f : 0.05f;
                                    f4 = f2;
                                } else {
                                    f4 = pointF.x / f7;
                                    f3 = pointF.y / f8;
                                }
                                xz3 xz3Var = new xz3(spannableString, alignment2, null, null, f3, 0, i14, f4, i3, i2, f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f);
                                int iG = g(jI2, arrayList2, arrayList);
                                for (int iG2 = g(jI, arrayList2, arrayList); iG2 < iG; iG2++) {
                                    ((List) arrayList.get(iG2)).add(xz3Var);
                                }
                                rwdVar = this;
                                yafVar2 = yafVar;
                                veVarB = veVar;
                            } else if (strI.length() != 0) {
                                "Skipping invalid timing: ".concat(strI);
                            }
                        } else if (strI.length() != 0) {
                            "Skipping invalid timing: ".concat(strI);
                        }
                    } else if (strI.length() != 0) {
                        "Skipping dialogue line with fewer columns than format: ".concat(strI);
                    }
                } else if (strI.length() != 0) {
                    "Skipping dialogue line before complete format: ".concat(strI);
                }
                yafVar = yafVar2;
                veVar = veVarB;
                rwdVar = this;
                yafVar2 = yafVar;
                veVarB = veVar;
            } else {
                yafVar = yafVar2;
                veVar = veVarB;
                rwdVar = this;
                yafVar2 = yafVar;
                veVarB = veVar;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(defpackage.yaf r33) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 716
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rwd.h(yaf):void");
    }
}
