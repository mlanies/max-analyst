package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/* loaded from: classes2.dex */
public final class b0d {
    public static final aq9 b = new aq9();
    public final je7 a;

    public b0d(je7 je7Var) {
        this.a = je7Var;
    }

    public static List c(ArrayList arrayList, List list) {
        return (List) list.stream().filter(new zzc(arrayList, (Set) arrayList.stream().filter(new fl3(1)).map(new gl3(3)).collect(Collectors.toCollection(new tj(2))), (Set) arrayList.stream().filter(new fl3(2)).map(new gl3(4)).collect(Collectors.toCollection(new tj(2))), 0)).collect(Collectors.toList());
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0050 A[ADDED_TO_REGION, FALL_THROUGH, REMOVE, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean i(char r2) {
        /*
            boolean r0 = java.lang.Character.isWhitespace(r2)
            r1 = 1
            if (r0 == 0) goto L8
            return r1
        L8:
            r0 = 91
            if (r2 == r0) goto L50
            r0 = 123(0x7b, float:1.72E-43)
            if (r2 == r0) goto L50
            r0 = 160(0xa0, float:2.24E-43)
            if (r2 == r0) goto L50
            r0 = 8239(0x202f, float:1.1545E-41)
            if (r2 == r0) goto L50
            r0 = 8287(0x205f, float:1.1613E-41)
            if (r2 == r0) goto L50
            r0 = 8470(0x2116, float:1.1869E-41)
            if (r2 == r0) goto L50
            r0 = 12288(0x3000, float:1.7219E-41)
            if (r2 == r0) goto L50
            r0 = 93
            if (r2 == r0) goto L50
            r0 = 94
            if (r2 == r0) goto L50
            r0 = 125(0x7d, float:1.75E-43)
            if (r2 == r0) goto L50
            r0 = 126(0x7e, float:1.77E-43)
            if (r2 == r0) goto L50
            r0 = 8232(0x2028, float:1.1535E-41)
            if (r2 == r0) goto L50
            r0 = 8233(0x2029, float:1.1537E-41)
            if (r2 == r0) goto L50
            switch(r2) {
                case 33: goto L50;
                case 34: goto L50;
                case 35: goto L50;
                default: goto L3f;
            }
        L3f:
            switch(r2) {
                case 40: goto L50;
                case 41: goto L50;
                case 42: goto L50;
                default: goto L42;
            }
        L42:
            switch(r2) {
                case 44: goto L50;
                case 45: goto L50;
                case 46: goto L50;
                case 47: goto L50;
                default: goto L45;
            }
        L45:
            switch(r2) {
                case 58: goto L50;
                case 59: goto L50;
                case 60: goto L50;
                default: goto L48;
            }
        L48:
            switch(r2) {
                case 62: goto L50;
                case 63: goto L50;
                case 64: goto L50;
                default: goto L4b;
            }
        L4b:
            switch(r2) {
                case 8192: goto L50;
                case 8193: goto L50;
                case 8194: goto L50;
                case 8195: goto L50;
                case 8196: goto L50;
                case 8197: goto L50;
                case 8198: goto L50;
                case 8199: goto L50;
                case 8200: goto L50;
                case 8201: goto L50;
                case 8202: goto L50;
                case 8203: goto L50;
                case 8204: goto L50;
                case 8205: goto L50;
                default: goto L4e;
            }
        L4e:
            r2 = 0
            return r2
        L50:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b0d.i(char):boolean");
    }

    public static int j(String str, int i, String str2, boolean z) {
        int i2 = 0;
        int i3 = 0;
        while (i2 < str.length() && i3 < i) {
            if (Character.isLetter(str.charAt(i2))) {
                boolean z2 = false;
                int i4 = i3;
                int i5 = i2;
                while (i2 < Math.min(i5 + 3, str.length()) && !z2) {
                    int i6 = i2 + 1;
                    String strK = k(str.substring(i5, i6));
                    int i7 = i4;
                    while (true) {
                        if (i7 < Math.min(i4 + 3, str2.length())) {
                            int i8 = i7 + 1;
                            if (!strK.equals(str2.substring(i4, i8))) {
                                i7 = i8;
                            } else {
                                if (z && i4 + 1 >= i) {
                                    return i5;
                                }
                                z2 = true;
                                i5 = i2;
                                i4 = i7;
                            }
                        }
                    }
                    i2 = i6;
                }
                if (!z2) {
                    StringBuilder sbK = k7d.k("cannot correctly find composed index: original ", str, ", query = ", str2, ", index = ");
                    sbK.append(str2);
                    hm9.p("b0d", sbK.toString(), null);
                    return -1;
                }
                i2 = i5;
                i3 = i4;
            }
            i2++;
            i3++;
        }
        return i2;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:70:0x00ee. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0155  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String k(java.lang.String r16) {
        /*
            Method dump skipped, instructions count: 1026
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b0d.k(java.lang.String):java.lang.String");
    }

    public final kzc a(e52 e52Var, String str) {
        List listE = e(e52Var.q(), str);
        if (listE.isEmpty()) {
            String strC = bre.c(e52Var.b.I);
            if (!oag.t(strC)) {
                listE = e(strC, str);
            }
            uj3 uj3VarL = e52Var.l();
            if (listE.isEmpty() && uj3VarL != null) {
                listE = b(uj3VarL, str).c;
            }
        }
        return new kzc(1, null, listE, e52Var, null, null, 0L, null);
    }

    public final kzc b(uj3 uj3Var, String str) {
        int i = 3;
        List list = (List) new ty9(new hb3(i, new r1a[]{new e0a(qy9.j(uj3Var.i()), new p4c(20), i), qy9.m(uj3Var.j())}).i(ft.b, 2), new p4c(21), 1).v().e();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.addAll(e((String) it.next(), str));
        }
        return new kzc(4, null, arrayList, null, uj3Var, null, 0L, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List d(java.lang.String r7, java.util.List r8) {
        /*
            r6 = this;
            boolean r0 = defpackage.oag.t(r7)
            if (r0 == 0) goto Lb
            java.util.List r6 = java.util.Collections.emptyList()
            return r6
        Lb:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r8 = r8.iterator()
        L14:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L99
            java.lang.Object r1 = r8.next()
            java.lang.String r1 = (java.lang.String) r1
            boolean r2 = defpackage.oag.t(r1)
            if (r2 == 0) goto L27
            goto L14
        L27:
            java.lang.String r2 = r7.toLowerCase()
            java.lang.String r3 = r1.toLowerCase()
            r4 = 0
            int r2 = r2.indexOf(r3, r4)
        L34:
            if (r2 < 0) goto L14
            int r3 = r7.length()
            if (r2 >= r3) goto L14
            if (r2 == 0) goto L7d
            int r3 = r2 + (-1)
            char r4 = r7.charAt(r3)
            boolean r4 = i(r4)
            if (r4 != 0) goto L7d
            char r4 = r7.charAt(r2)
            boolean r4 = i(r4)
            if (r4 != 0) goto L7d
            if (r2 < 0) goto L8a
            int r4 = r7.length()
            if (r2 < r4) goto L5d
            goto L8a
        L5d:
            je7 r4 = r6.a
            java.lang.Object r5 = r4.getValue()
            ida r5 = (defpackage.ida) r5
            tx4 r5 = r5.j
            boolean r3 = r5.a(r3, r7)
            if (r3 != 0) goto L7d
            java.lang.Object r3 = r4.getValue()
            ida r3 = (defpackage.ida) r3
            int r4 = r2 + (-2)
            tx4 r3 = r3.j
            boolean r3 = r3.a(r4, r7)
            if (r3 == 0) goto L8a
        L7d:
            a0d r3 = new a0d
            int r4 = r1.length()
            int r4 = r4 + r2
            r3.<init>(r2, r4)
            r0.add(r3)
        L8a:
            int r2 = r2 + 1
            java.lang.String r3 = r7.toLowerCase()
            java.lang.String r4 = r1.toLowerCase()
            int r2 = r3.indexOf(r4, r2)
            goto L34
        L99:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b0d.d(java.lang.String, java.util.List):java.util.List");
    }

    public final List e(String str, String str2) {
        int iJ;
        if (oag.t(str) || oag.t(str2)) {
            return Collections.emptyList();
        }
        HashSet hashSet = new HashSet();
        String[] strArrL = l(str);
        String[] strArrL2 = l(str2);
        for (String str3 : strArrL) {
            String strK = k(str3);
            for (String str4 : strArrL2) {
                if (str3.regionMatches(true, 0, str4, 0, str4.length())) {
                    hashSet.add(str4);
                } else {
                    String strK2 = k(str4);
                    if (strK.startsWith(strK2)) {
                        int iJ2 = j(str3, 0, strK, true);
                        if (iJ2 >= 0 && (iJ = j(str3, strK2.length(), strK, false)) > iJ2) {
                            hashSet.add(str3.substring(iJ2, iJ));
                        }
                    }
                }
            }
        }
        return new ArrayList(hashSet);
    }

    public final boolean f(e52 e52Var, String str) {
        return h(e52Var.q(), str) || h(bre.b(e52Var.b.I), str) || (e52Var.l() != null && g(e52Var.l(), str));
    }

    public final boolean g(uj3 uj3Var, final String str) {
        if (oag.t(str)) {
            return true;
        }
        List listI = uj3Var.i();
        String strJ = uj3Var.j();
        if (oag.t(str)) {
            return true;
        }
        Predicate predicate = new Predicate() { // from class: yzc
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                String str2 = (String) obj;
                b0d b0dVar = this.a;
                b0dVar.getClass();
                return !oag.t(str2) && b0dVar.h(str2, str);
            }
        };
        if (predicate.test(bre.b(strJ))) {
            return true;
        }
        return listI.stream().map(new gl3(5)).anyMatch(predicate);
    }

    public final boolean h(String str, String str2) {
        if (oag.t(str2)) {
            return true;
        }
        String strTrim = str.trim();
        String[] strArrL = l(str2.trim());
        if (strArrL.length != 0) {
            String[] strArr = new String[strArrL.length];
            for (int i = 0; i < strArrL.length; i++) {
                strArr[i] = k(strArrL[i]);
            }
            String[] strArrL2 = l(strTrim);
            for (int i2 = 0; i2 < strArrL.length; i2++) {
                String str3 = strArrL[i2];
                String str4 = strArr[i2];
                boolean z = false;
                for (String str5 : strArrL2) {
                    if (str5.regionMatches(true, 0, str3, 0, str3.length()) || k(str5).startsWith(str4)) {
                        z = true;
                    }
                }
                if (z) {
                }
            }
            return true;
        }
        return false;
    }

    public final String[] l(String str) {
        return bre.d(str, (ida) this.a.getValue());
    }
}
