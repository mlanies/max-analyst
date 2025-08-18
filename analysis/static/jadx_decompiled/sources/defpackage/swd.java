package defpackage;

import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import androidx.work.WorkRequest;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class swd implements obe {
    public static final Pattern Z = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");
    public final boolean a;
    public final ve b;
    public LinkedHashMap o;
    public float X = -3.4028235E38f;
    public float Y = -3.4028235E38f;
    public final wpa c = new wpa();

    public swd(List list) throws NumberFormatException {
        if (list == null || list.isEmpty()) {
            this.a = false;
            this.b = null;
            return;
        }
        this.a = true;
        String strQ = oaf.q((byte[]) list.get(0));
        fm9.f(strQ.startsWith("Format:"));
        ve veVarC = ve.c(strQ);
        veVarC.getClass();
        this.b = veVarC;
        b(new wpa((byte[]) list.get(1)), b52.c);
    }

    public static int a(long j, ArrayList arrayList, ArrayList arrayList2) {
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

    public static long c(String str) {
        Matcher matcher = Z.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        String strGroup = matcher.group(1);
        int i = oaf.a;
        return (Long.parseLong(matcher.group(4)) * WorkRequest.MIN_BACKOFF_MILLIS) + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(2)) * 60000000) + (Long.parseLong(strGroup) * 3600000000L);
    }

    @Override // defpackage.obe
    public final void G(byte[] bArr, int i, int i2, nbe nbeVar, pj3 pj3Var) throws NumberFormatException {
        Charset charset;
        wpa wpaVar;
        ve veVar;
        float f;
        int i3;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        int i4;
        int i5;
        int i6;
        float f2;
        float f3;
        float f4;
        float f5;
        int i7;
        int i8;
        float f6;
        int i9;
        int i10;
        Integer num;
        int iA;
        int i11;
        swd swdVar = this;
        nbe nbeVar2 = nbeVar;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        wpa wpaVar2 = swdVar.c;
        wpaVar2.E(i + i2, bArr);
        wpaVar2.G(i);
        Charset charsetC = wpaVar2.C();
        if (charsetC == null) {
            charsetC = b52.c;
        }
        boolean z = swdVar.a;
        if (!z) {
            swdVar.b(wpaVar2, charsetC);
        }
        ve veVarC = z ? swdVar.b : null;
        while (true) {
            String strH = wpaVar2.h(charsetC);
            if (strH == null) {
                nbe nbeVar3 = nbeVar2;
                long j = nbeVar3.b;
                ArrayList arrayList3 = (j == -9223372036854775807L || !nbeVar3.a) ? null : new ArrayList();
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    List list = (List) arrayList.get(i12);
                    if (!list.isEmpty() || i12 == 0) {
                        if (i12 == arrayList.size() - 1) {
                            throw new IllegalStateException();
                        }
                        long jLongValue = ((Long) arrayList2.get(i12)).longValue();
                        long jLongValue2 = ((Long) arrayList2.get(i12 + 1)).longValue() - ((Long) arrayList2.get(i12)).longValue();
                        if (j == -9223372036854775807L || jLongValue >= j) {
                            pj3Var.accept(new b04(jLongValue, jLongValue2, list));
                        } else if (arrayList3 != null) {
                            arrayList3.add(new b04(jLongValue, jLongValue2, list));
                        }
                    }
                }
                if (arrayList3 != null) {
                    Iterator it = arrayList3.iterator();
                    while (it.hasNext()) {
                        pj3Var.accept((b04) it.next());
                    }
                    return;
                }
                return;
            }
            if (strH.startsWith("Format:")) {
                veVarC = ve.c(strH);
            } else if (strH.startsWith("Dialogue:")) {
                if (veVarC == null) {
                    z04.c0("Skipping dialogue line before complete format: ".concat(strH));
                } else {
                    fm9.f(strH.startsWith("Dialogue:"));
                    String strSubstring = strH.substring(9);
                    int i13 = veVarC.e;
                    String[] strArrSplit = strSubstring.split(",", i13);
                    if (strArrSplit.length != i13) {
                        z04.c0("Skipping dialogue line with fewer columns than format: ".concat(strH));
                    } else {
                        long jC = c(strArrSplit[veVarC.a]);
                        if (jC == -9223372036854775807L) {
                            z04.c0("Skipping invalid timing: ".concat(strH));
                        } else {
                            charset = charsetC;
                            long jC2 = c(strArrSplit[veVarC.b]);
                            if (jC2 == -9223372036854775807L) {
                                z04.c0("Skipping invalid timing: ".concat(strH));
                                veVar = veVarC;
                                wpaVar = wpaVar2;
                                swdVar = this;
                                nbeVar2 = nbeVar;
                                charsetC = charset;
                                veVarC = veVar;
                                wpaVar2 = wpaVar;
                            } else {
                                LinkedHashMap linkedHashMap = swdVar.o;
                                ywd ywdVar = (linkedHashMap == null || (i11 = veVarC.c) == -1) ? null : (ywd) linkedHashMap.get(strArrSplit[i11].trim());
                                String str = strArrSplit[veVarC.d];
                                Matcher matcher = wwd.a.matcher(str);
                                int i14 = -1;
                                PointF pointF = null;
                                while (matcher.find()) {
                                    ve veVar2 = veVarC;
                                    String strGroup = matcher.group(1);
                                    strGroup.getClass();
                                    try {
                                        PointF pointFA = wwd.a(strGroup);
                                        if (pointFA != null) {
                                            pointF = pointFA;
                                        }
                                    } catch (RuntimeException unused) {
                                    }
                                    try {
                                        Matcher matcher2 = wwd.d.matcher(strGroup);
                                        if (matcher2.find()) {
                                            String strGroup2 = matcher2.group(1);
                                            strGroup2.getClass();
                                            iA = ywd.a(strGroup2);
                                        } else {
                                            iA = -1;
                                        }
                                        if (iA != -1) {
                                            i14 = iA;
                                        }
                                    } catch (RuntimeException unused2) {
                                    }
                                    veVarC = veVar2;
                                }
                                veVar = veVarC;
                                String strReplace = wwd.a.matcher(str).replaceAll("").replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " ");
                                float f7 = swdVar.X;
                                float f8 = swdVar.Y;
                                SpannableString spannableString = new SpannableString(strReplace);
                                if (ywdVar != null) {
                                    Integer num2 = ywdVar.c;
                                    if (num2 != null) {
                                        wpaVar = wpaVar2;
                                        spannableString.setSpan(new ForegroundColorSpan(num2.intValue()), 0, spannableString.length(), 33);
                                    } else {
                                        wpaVar = wpaVar2;
                                    }
                                    if (ywdVar.j == 3 && (num = ywdVar.d) != null) {
                                        spannableString.setSpan(new BackgroundColorSpan(num.intValue()), 0, spannableString.length(), 33);
                                    }
                                    float f9 = ywdVar.e;
                                    if (f9 == -3.4028235E38f || f8 == -3.4028235E38f) {
                                        f5 = -3.4028235E38f;
                                        i7 = Integer.MIN_VALUE;
                                    } else {
                                        f5 = f9 / f8;
                                        i7 = 1;
                                    }
                                    boolean z2 = ywdVar.g;
                                    boolean z3 = ywdVar.f;
                                    if (z3 && z2) {
                                        i8 = i7;
                                        f6 = f5;
                                        i9 = 0;
                                        i10 = 33;
                                        spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
                                    } else {
                                        i8 = i7;
                                        f6 = f5;
                                        i9 = 0;
                                        i10 = 33;
                                        if (z3) {
                                            spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
                                        } else if (z2) {
                                            spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
                                        }
                                    }
                                    if (ywdVar.h) {
                                        spannableString.setSpan(new UnderlineSpan(), i9, spannableString.length(), i10);
                                    }
                                    if (ywdVar.i) {
                                        spannableString.setSpan(new StrikethroughSpan(), i9, spannableString.length(), i10);
                                    }
                                    f = f6;
                                    i3 = i8;
                                } else {
                                    wpaVar = wpaVar2;
                                    f = -3.4028235E38f;
                                    i3 = Integer.MIN_VALUE;
                                }
                                int i15 = -1;
                                if (i14 != -1) {
                                    i15 = i14;
                                } else if (ywdVar != null) {
                                    i15 = ywdVar.b;
                                }
                                switch (i15) {
                                    case 0:
                                    default:
                                        ey8.k(i15, "Unknown alignment: ");
                                    case -1:
                                        alignment2 = null;
                                        break;
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
                                }
                                int i16 = Integer.MIN_VALUE;
                                switch (i15) {
                                    case 0:
                                    default:
                                        ey8.k(i15, "Unknown alignment: ");
                                    case -1:
                                        i4 = Integer.MIN_VALUE;
                                        break;
                                    case 1:
                                    case 4:
                                    case 7:
                                        i4 = 0;
                                        break;
                                    case 2:
                                    case 5:
                                    case 8:
                                        i4 = 1;
                                        break;
                                    case 3:
                                    case 6:
                                    case 9:
                                        i4 = 2;
                                        break;
                                }
                                switch (i15) {
                                    case -1:
                                        break;
                                    case 0:
                                    default:
                                        ey8.k(i15, "Unknown alignment: ");
                                        break;
                                    case 1:
                                    case 2:
                                    case 3:
                                        i16 = 2;
                                        break;
                                    case 4:
                                    case 5:
                                    case 6:
                                        i16 = 1;
                                        break;
                                    case 7:
                                    case 8:
                                    case 9:
                                        i16 = 0;
                                        break;
                                }
                                if (pointF == null || f8 == -3.4028235E38f || f7 == -3.4028235E38f) {
                                    if (i4 != 0) {
                                        i5 = 1;
                                        if (i4 != 1) {
                                            i6 = 2;
                                            f2 = i4 != 2 ? -3.4028235E38f : 0.95f;
                                        } else {
                                            i6 = 2;
                                            f2 = 0.5f;
                                        }
                                    } else {
                                        i5 = 1;
                                        i6 = 2;
                                        f2 = 0.05f;
                                    }
                                    f3 = i16 != 0 ? i16 != i5 ? i16 != i6 ? -3.4028235E38f : 0.95f : 0.5f : 0.05f;
                                    f4 = f2;
                                } else {
                                    f4 = pointF.x / f7;
                                    f3 = pointF.y / f8;
                                }
                                yz3 yz3Var = new yz3(spannableString, alignment2, null, null, f3, 0, i16, f4, i4, i3, f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f);
                                int iA2 = a(jC2, arrayList2, arrayList);
                                for (int iA3 = a(jC, arrayList2, arrayList); iA3 < iA2; iA3++) {
                                    ((List) arrayList.get(iA3)).add(yz3Var);
                                }
                                swdVar = this;
                                nbeVar2 = nbeVar;
                                charsetC = charset;
                                veVarC = veVar;
                                wpaVar2 = wpaVar;
                            }
                        }
                    }
                }
                charset = charsetC;
                veVar = veVarC;
                wpaVar = wpaVar2;
                swdVar = this;
                nbeVar2 = nbeVar;
                charsetC = charset;
                veVarC = veVar;
                wpaVar2 = wpaVar;
            } else {
                charset = charsetC;
                veVar = veVarC;
                wpaVar = wpaVar2;
                swdVar = this;
                nbeVar2 = nbeVar;
                charsetC = charset;
                veVarC = veVar;
                wpaVar2 = wpaVar;
            }
        }
    }

    @Override // defpackage.obe
    public final int J() {
        return 1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:167:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(defpackage.wpa r37, java.nio.charset.Charset r38) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 828
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.swd.b(wpa, java.nio.charset.Charset):void");
    }
}
