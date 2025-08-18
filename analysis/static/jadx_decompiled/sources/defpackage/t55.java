package defpackage;

import android.util.Pair;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final class t55 {
    public static final Pattern c = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
    public static final Pattern d = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
    public static final Pattern e = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
    public static final ArrayList f;
    public final ArrayList a;
    public final ByteOrder b;

    static {
        r55 r55Var = new r55(0);
        r55Var.b = 0;
        f = Collections.list(r55Var);
    }

    public t55(ByteOrder byteOrder) {
        r55 r55Var = new r55(1);
        r55Var.b = 0;
        this.a = Collections.list(r55Var);
        this.b = byteOrder;
    }

    public static Pair a(String str) throws NumberFormatException {
        if (str.contains(",")) {
            String[] strArrSplit = str.split(",", -1);
            Pair pairA = a(strArrSplit[0]);
            if (((Integer) pairA.first).intValue() == 2) {
                return pairA;
            }
            for (int i = 1; i < strArrSplit.length; i++) {
                Pair pairA2 = a(strArrSplit[i]);
                int iIntValue = (((Integer) pairA2.first).equals(pairA.first) || ((Integer) pairA2.second).equals(pairA.first)) ? ((Integer) pairA.first).intValue() : -1;
                int iIntValue2 = (((Integer) pairA.second).intValue() == -1 || !(((Integer) pairA2.first).equals(pairA.second) || ((Integer) pairA2.second).equals(pairA.second))) ? -1 : ((Integer) pairA.second).intValue();
                if (iIntValue == -1 && iIntValue2 == -1) {
                    return new Pair(2, -1);
                }
                if (iIntValue == -1) {
                    pairA = new Pair(Integer.valueOf(iIntValue2), -1);
                } else if (iIntValue2 == -1) {
                    pairA = new Pair(Integer.valueOf(iIntValue), -1);
                }
            }
            return pairA;
        }
        if (!str.contains("/")) {
            try {
                try {
                    long j = Long.parseLong(str);
                    return (j < 0 || j > 65535) ? j < 0 ? new Pair(9, -1) : new Pair(4, -1) : new Pair(3, 4);
                } catch (NumberFormatException unused) {
                    return new Pair(2, -1);
                }
            } catch (NumberFormatException unused2) {
                Double.parseDouble(str);
                return new Pair(12, -1);
            }
        }
        String[] strArrSplit2 = str.split("/", -1);
        if (strArrSplit2.length == 2) {
            try {
                long j2 = (long) Double.parseDouble(strArrSplit2[0]);
                long j3 = (long) Double.parseDouble(strArrSplit2[1]);
                if (j2 >= 0 && j3 >= 0) {
                    if (j2 <= 2147483647L && j3 <= 2147483647L) {
                        return new Pair(10, 5);
                    }
                    return new Pair(5, -1);
                }
                return new Pair(10, -1);
            } catch (NumberFormatException unused3) {
            }
        }
        return new Pair(2, -1);
    }

    public final void b(String str, String str2, ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((Map) it.next()).containsKey(str)) {
                return;
            }
        }
        c(str, str2, arrayList);
    }

    public final void c(String str, String str2, List list) {
        char c2;
        int i;
        q55 q55Var;
        String str3 = str;
        String strReplaceAll = str2;
        if (("DateTime".equals(str3) || "DateTimeOriginal".equals(str3) || "DateTimeDigitized".equals(str3)) && strReplaceAll != null) {
            boolean zFind = d.matcher(strReplaceAll).find();
            boolean zFind2 = e.matcher(strReplaceAll).find();
            if (str2.length() != 19) {
                return;
            }
            if (!zFind && !zFind2) {
                return;
            }
            if (zFind2) {
                strReplaceAll = strReplaceAll.replaceAll("-", ":");
            }
        }
        if ("ISOSpeedRatings".equals(str3)) {
            str3 = "PhotographicSensitivity";
        }
        char c3 = 3;
        int i2 = 2;
        if (strReplaceAll != null && u55.e.contains(str3)) {
            if (str3.equals("GPSTimeStamp")) {
                Matcher matcher = c.matcher(strReplaceAll);
                if (!matcher.find()) {
                    return;
                }
                StringBuilder sb = new StringBuilder();
                String strGroup = matcher.group(1);
                strGroup.getClass();
                sb.append(Integer.parseInt(strGroup));
                sb.append("/1,");
                String strGroup2 = matcher.group(2);
                strGroup2.getClass();
                sb.append(Integer.parseInt(strGroup2));
                sb.append("/1,");
                String strGroup3 = matcher.group(3);
                strGroup3.getClass();
                sb.append(Integer.parseInt(strGroup3));
                sb.append("/1");
                strReplaceAll = sb.toString();
            } else {
                try {
                    strReplaceAll = ((long) (Double.parseDouble(strReplaceAll) * 10000.0d)) + "/10000";
                } catch (NumberFormatException unused) {
                    return;
                }
            }
        }
        int i3 = 0;
        while (true) {
            g65[] g65VarArr = u55.c;
            if (i3 >= 4) {
                return;
            }
            g65 g65Var = (g65) ((HashMap) f.get(i3)).get(str3);
            if (g65Var == null) {
                c2 = c3;
                i = i2;
            } else {
                if (strReplaceAll != null) {
                    Pair pairA = a(strReplaceAll);
                    int iIntValue = ((Integer) pairA.first).intValue();
                    int i4 = -1;
                    int i5 = g65Var.c;
                    if (i5 != iIntValue && i5 != ((Integer) pairA.second).intValue()) {
                        int i6 = g65Var.d;
                        if (i6 == -1 || !(i6 == ((Integer) pairA.first).intValue() || i6 == ((Integer) pairA.second).intValue())) {
                            if (i5 == 1 || i5 == 7 || i5 == i2) {
                            }
                            c2 = c3;
                            i = i2;
                        } else {
                            i5 = i6;
                        }
                    }
                    String str4 = "/";
                    ByteOrder byteOrder = this.b;
                    switch (i5) {
                        case 1:
                            c2 = c3;
                            i = i2;
                            Map map = (Map) list.get(i3);
                            Charset charset = q55.d;
                            if (strReplaceAll.length() != 1 || strReplaceAll.charAt(0) < '0' || strReplaceAll.charAt(0) > '1') {
                                byte[] bytes = strReplaceAll.getBytes(q55.d);
                                q55Var = new q55(1, bytes, bytes.length);
                            } else {
                                q55Var = new q55(1, new byte[]{(byte) (strReplaceAll.charAt(0) - '0')}, 1);
                            }
                            map.put(str3, q55Var);
                            break;
                        case 2:
                        case 7:
                            c2 = c3;
                            Map map2 = (Map) list.get(i3);
                            Charset charset2 = q55.d;
                            byte[] bytes2 = strReplaceAll.concat("\u0000").getBytes(q55.d);
                            i = 2;
                            map2.put(str3, new q55(2, bytes2, bytes2.length));
                            break;
                        case 3:
                            String[] strArrSplit = strReplaceAll.split(",", -1);
                            int length = strArrSplit.length;
                            int[] iArr = new int[length];
                            for (int i7 = 0; i7 < strArrSplit.length; i7++) {
                                iArr[i7] = Integer.parseInt(strArrSplit[i7]);
                            }
                            Map map3 = (Map) list.get(i3);
                            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[q55.f[3] * length]);
                            byteBufferWrap.order(byteOrder);
                            for (int i8 = 0; i8 < length; i8++) {
                                byteBufferWrap.putShort((short) iArr[i8]);
                            }
                            byte[] bArrArray = byteBufferWrap.array();
                            c2 = 3;
                            map3.put(str3, new q55(3, bArrArray, length));
                            i = 2;
                            break;
                        case 4:
                            String[] strArrSplit2 = strReplaceAll.split(",", -1);
                            long[] jArr = new long[strArrSplit2.length];
                            for (int i9 = 0; i9 < strArrSplit2.length; i9++) {
                                jArr[i9] = Long.parseLong(strArrSplit2[i9]);
                            }
                            ((Map) list.get(i3)).put(str3, q55.b(jArr, byteOrder));
                            c2 = 3;
                            i = 2;
                            break;
                        case 5:
                            int i10 = -1;
                            String[] strArrSplit3 = strReplaceAll.split(",", -1);
                            int length2 = strArrSplit3.length;
                            l7[] l7VarArr = new l7[length2];
                            int i11 = 0;
                            while (i11 < strArrSplit3.length) {
                                String[] strArrSplit4 = strArrSplit3[i11].split(str4, i10);
                                l7VarArr[i11] = new l7((long) Double.parseDouble(strArrSplit4[0]), (long) Double.parseDouble(strArrSplit4[1]), 6);
                                i11++;
                                str4 = str4;
                                strArrSplit3 = strArrSplit3;
                                i10 = -1;
                            }
                            Map map4 = (Map) list.get(i3);
                            ByteBuffer byteBufferWrap2 = ByteBuffer.wrap(new byte[q55.f[5] * length2]);
                            byteBufferWrap2.order(byteOrder);
                            for (int i12 = 0; i12 < length2; i12++) {
                                l7 l7Var = l7VarArr[i12];
                                byteBufferWrap2.putInt((int) l7Var.b);
                                byteBufferWrap2.putInt((int) l7Var.c);
                            }
                            map4.put(str3, new q55(5, byteBufferWrap2.array(), length2));
                            c2 = 3;
                            i = 2;
                            break;
                        case 6:
                        case 8:
                        case 11:
                        default:
                            c2 = c3;
                            i = i2;
                            break;
                        case 9:
                            String[] strArrSplit5 = strReplaceAll.split(",", -1);
                            int length3 = strArrSplit5.length;
                            int[] iArr2 = new int[length3];
                            for (int i13 = 0; i13 < strArrSplit5.length; i13++) {
                                iArr2[i13] = Integer.parseInt(strArrSplit5[i13]);
                            }
                            Map map5 = (Map) list.get(i3);
                            ByteBuffer byteBufferWrap3 = ByteBuffer.wrap(new byte[q55.f[9] * length3]);
                            byteBufferWrap3.order(byteOrder);
                            for (int i14 = 0; i14 < length3; i14++) {
                                byteBufferWrap3.putInt(iArr2[i14]);
                            }
                            map5.put(str3, new q55(9, byteBufferWrap3.array(), length3));
                            c2 = 3;
                            i = 2;
                            break;
                        case 10:
                            String[] strArrSplit6 = strReplaceAll.split(",", -1);
                            int length4 = strArrSplit6.length;
                            l7[] l7VarArr2 = new l7[length4];
                            int i15 = 0;
                            while (i15 < strArrSplit6.length) {
                                String[] strArrSplit7 = strArrSplit6[i15].split("/", i4);
                                l7[] l7VarArr3 = l7VarArr2;
                                l7VarArr3[i15] = new l7((long) Double.parseDouble(strArrSplit7[0]), (long) Double.parseDouble(strArrSplit7[1]), 6);
                                i15++;
                                l7VarArr2 = l7VarArr3;
                                i4 = -1;
                            }
                            l7[] l7VarArr4 = l7VarArr2;
                            Map map6 = (Map) list.get(i3);
                            ByteBuffer byteBufferWrap4 = ByteBuffer.wrap(new byte[q55.f[10] * length4]);
                            byteBufferWrap4.order(byteOrder);
                            for (int i16 = 0; i16 < length4; i16++) {
                                l7 l7Var2 = l7VarArr4[i16];
                                byteBufferWrap4.putInt((int) l7Var2.b);
                                byteBufferWrap4.putInt((int) l7Var2.c);
                            }
                            map6.put(str3, new q55(10, byteBufferWrap4.array(), length4));
                            c2 = 3;
                            i = 2;
                            break;
                        case Protos.Attaches.Attach.PRESENT /* 12 */:
                            String[] strArrSplit8 = strReplaceAll.split(",", -1);
                            int length5 = strArrSplit8.length;
                            double[] dArr = new double[length5];
                            for (int i17 = 0; i17 < strArrSplit8.length; i17++) {
                                dArr[i17] = Double.parseDouble(strArrSplit8[i17]);
                            }
                            Map map7 = (Map) list.get(i3);
                            ByteBuffer byteBufferWrap5 = ByteBuffer.wrap(new byte[q55.f[12] * length5]);
                            byteBufferWrap5.order(byteOrder);
                            for (int i18 = 0; i18 < length5; i18++) {
                                byteBufferWrap5.putDouble(dArr[i18]);
                            }
                            map7.put(str3, new q55(12, byteBufferWrap5.array(), length5));
                            c2 = 3;
                            i = 2;
                            break;
                    }
                } else {
                    ((Map) list.get(i3)).remove(str3);
                }
                c2 = c3;
                i = i2;
            }
            i3++;
            c3 = c2;
            i2 = i;
        }
    }

    public final void d(int i) {
        c("Orientation", String.valueOf(i != 0 ? i != 90 ? i != 180 ? i != 270 ? 0 : 8 : 3 : 6 : 1), this.a);
    }
}
