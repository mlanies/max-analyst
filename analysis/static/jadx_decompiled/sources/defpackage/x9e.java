package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class x9e extends c54 {
    public static String b0(String str) {
        List listI0 = l6d.i0(w9e.G0(str));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listI0) {
            if (!w9e.C0((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(z53.S(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (true) {
            int length = 0;
            if (!it.hasNext()) {
                break;
            }
            String str2 = (String) it.next();
            int length2 = str2.length();
            while (true) {
                if (length >= length2) {
                    length = -1;
                    break;
                }
                if (!nd7.E(str2.charAt(length))) {
                    break;
                }
                length++;
            }
            if (length == -1) {
                length = str2.length();
            }
            arrayList2.add(Integer.valueOf(length));
        }
        Integer num = (Integer) x53.r0(arrayList2);
        int iIntValue = num != null ? num.intValue() : 0;
        int length3 = str.length();
        listI0.size();
        int iL = y53.L(listI0);
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = listI0.iterator();
        int i = 0;
        while (true) {
            if (!it2.hasNext()) {
                StringBuilder sb = new StringBuilder(length3);
                x53.m0(arrayList3, sb, 0, null, 124);
                return sb.toString();
            }
            Object next = it2.next();
            int i2 = i + 1;
            if (i < 0) {
                y53.R();
                throw null;
            }
            String str3 = (String) next;
            String strR0 = ((i == 0 || i == iL) && w9e.C0(str3)) ? null : w9e.r0(iIntValue, str3);
            if (strR0 != null) {
                arrayList3.add(strR0);
            }
            i = i2;
        }
    }

    public static String c0(String str) {
        if (!(!w9e.C0("|"))) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.".toString());
        }
        List listI0 = l6d.i0(w9e.G0(str));
        int length = str.length();
        listI0.size();
        int iL = y53.L(listI0);
        ArrayList arrayList = new ArrayList();
        Iterator it = listI0.iterator();
        int i = 0;
        while (true) {
            String strSubstring = null;
            if (!it.hasNext()) {
                StringBuilder sb = new StringBuilder(length);
                x53.m0(arrayList, sb, 0, null, 124);
                return sb.toString();
            }
            Object next = it.next();
            int i2 = i + 1;
            if (i < 0) {
                y53.R();
                throw null;
            }
            String str2 = (String) next;
            if ((i != 0 && i != iL) || !w9e.C0(str2)) {
                int length2 = str2.length();
                int i3 = 0;
                while (true) {
                    if (i3 >= length2) {
                        i3 = -1;
                        break;
                    }
                    if (!nd7.E(str2.charAt(i3))) {
                        break;
                    }
                    i3++;
                }
                if (i3 != -1 && str2.startsWith("|", i3)) {
                    strSubstring = str2.substring(i3 + 1);
                }
                if (strSubstring == null) {
                    strSubstring = str2;
                }
            }
            if (strSubstring != null) {
                arrayList.add(strSubstring);
            }
            i = i2;
        }
    }
}
