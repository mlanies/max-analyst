package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class n34 implements Comparable, Serializable {
    public final Integer X;
    public final Integer Y;
    public final Integer Z;
    public final Integer a;
    public final Integer b;
    public final Integer c;
    public final Integer o;
    public int s0;

    public n34(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7) {
        this.a = num;
        this.b = num2;
        this.c = num3;
        this.o = num4;
        this.X = num5;
        this.Y = num6;
        this.Z = num7;
        d(1, 9999, num, "Year");
        d(1, 12, this.b, "Month");
        d(1, 31, this.c, "Day");
        d(0, 23, this.o, "Hour");
        d(0, 59, this.X, "Minute");
        d(0, 59, this.Y, "Second");
        d(0, 999999999, this.Z, "Nanosecond");
        Integer num8 = this.a;
        Integer num9 = this.b;
        Integer num10 = this.c;
        Object[] objArr = {num8, num9, num10};
        for (int i = 0; i < 3; i++) {
            if (objArr[i] == null) {
                return;
            }
        }
        if (num10.intValue() <= i(num8, num9).intValue()) {
            return;
        }
        throw new ic3("The day-of-the-month value '" + num10 + "' exceeds the number of days in the month: " + i(num8, num9), 1);
    }

    public static void a(String str, Object obj, StringBuilder sb) {
        StringBuilder sbO = rh4.o(str, ":");
        sbO.append(String.valueOf(obj));
        sbO.append(" ");
        sb.append(sbO.toString());
    }

    public static void d(int i, int i2, Integer num, String str) {
        if (num != null) {
            if (num.intValue() < i || num.intValue() > i2) {
                throw new ic3(str + " is not in the range " + i + ".." + i2 + ". Value is:" + num, 1);
            }
        }
    }

    public static n34 g(long j, TimeZone timeZone) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(timeZone);
        gregorianCalendar.setTimeInMillis(j);
        return new n34(Integer.valueOf(gregorianCalendar.get(1)), Integer.valueOf(gregorianCalendar.get(2) + 1), Integer.valueOf(gregorianCalendar.get(5)), Integer.valueOf(gregorianCalendar.get(11)), Integer.valueOf(gregorianCalendar.get(12)), Integer.valueOf(gregorianCalendar.get(13)), Integer.valueOf(gregorianCalendar.get(14) * 1000000));
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
    
        r4 = 29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Integer i(java.lang.Integer r4, java.lang.Integer r5) {
        /*
            if (r4 == 0) goto Ld3
            if (r5 == 0) goto Ld3
            int r0 = r5.intValue()
            r1 = 1
            r2 = 31
            if (r0 != r1) goto L13
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            goto Ld4
        L13:
            int r0 = r5.intValue()
            r1 = 2
            r3 = 4
            if (r0 != r1) goto L3e
            int r5 = r4.intValue()
            int r5 = r5 % 100
            if (r5 != 0) goto L2c
            int r4 = r4.intValue()
            int r4 = r4 % 400
            if (r4 != 0) goto L36
            goto L33
        L2c:
            int r4 = r4.intValue()
            int r4 = r4 % r3
            if (r4 != 0) goto L36
        L33:
            r4 = 29
            goto L38
        L36:
            r4 = 28
        L38:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            goto Ld4
        L3e:
            int r4 = r5.intValue()
            r0 = 3
            if (r4 != r0) goto L4b
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            goto Ld4
        L4b:
            int r4 = r5.intValue()
            r0 = 30
            if (r4 != r3) goto L59
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            goto Ld4
        L59:
            int r4 = r5.intValue()
            r1 = 5
            if (r4 != r1) goto L66
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            goto Ld4
        L66:
            int r4 = r5.intValue()
            r1 = 6
            if (r4 != r1) goto L72
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            goto Ld4
        L72:
            int r4 = r5.intValue()
            r1 = 7
            if (r4 != r1) goto L7e
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            goto Ld4
        L7e:
            int r4 = r5.intValue()
            r1 = 8
            if (r4 != r1) goto L8b
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            goto Ld4
        L8b:
            int r4 = r5.intValue()
            r1 = 9
            if (r4 != r1) goto L98
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            goto Ld4
        L98:
            int r4 = r5.intValue()
            r1 = 10
            if (r4 != r1) goto La5
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            goto Ld4
        La5:
            int r4 = r5.intValue()
            r1 = 11
            if (r4 != r1) goto Lb2
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            goto Ld4
        Lb2:
            int r4 = r5.intValue()
            r0 = 12
            if (r4 != r0) goto Lbf
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            goto Ld4
        Lbf:
            java.lang.AssertionError r4 = new java.lang.AssertionError
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Month is out of range 1..12:"
            r0.<init>(r1)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            r4.<init>(r5)
            throw r4
        Ld3:
            r4 = 0
        Ld4:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n34.i(java.lang.Integer, java.lang.Integer):java.lang.Integer");
    }

    public final String b() {
        if (n(1) && m(2, 3, 4, 5, 6, 7)) {
            return "YYYY";
        }
        if (n(1, 2) && m(3, 4, 5, 6, 7)) {
            return "YYYY-MM";
        }
        if (n(1, 2, 3) && m(4, 5, 6, 7)) {
            return "YYYY-MM-DD";
        }
        if (n(1, 2, 3, 4) && m(5, 6, 7)) {
            return "YYYY-MM-DD hh";
        }
        if (n(1, 2, 3, 4, 5) && m(6, 7)) {
            return "YYYY-MM-DD hh:mm";
        }
        if (n(1, 2, 3, 4, 5, 6) && m(7)) {
            return "YYYY-MM-DD hh:mm:ss";
        }
        if (n(1, 2, 3, 4, 5, 6, 7)) {
            return "YYYY-MM-DD hh:mm:ss.fffffffff";
        }
        if (m(1, 2, 3) && n(4, 5, 6, 7)) {
            return "hh:mm:ss.fffffffff";
        }
        if (m(1, 2, 3, 7) && n(4, 5, 6)) {
            return "hh:mm:ss";
        }
        if (m(1, 2, 3, 6, 7) && n(4, 5)) {
            return "hh:mm";
        }
        return null;
    }

    public final int c() {
        int iIntValue = this.a.intValue();
        int iIntValue2 = (this.b.intValue() - 14) / 12;
        return (((((((r1 - 2) - (iIntValue2 * 12)) * 367) / 12) + ((((iIntValue + 4800) + iIntValue2) * 1461) / 4)) - (((((iIntValue + 4900) + iIntValue2) / 100) * 3) / 4)) + this.c.intValue()) - 32075;
    }

    @Override // java.lang.Comparable
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final int compareTo(n34 n34Var) {
        if (this == n34Var) {
            return 0;
        }
        n34Var.getClass();
        int iE = xfg.e(this.a, n34Var.a);
        if (iE != 0) {
            return iE;
        }
        int iE2 = xfg.e(this.b, n34Var.b);
        if (iE2 != 0) {
            return iE2;
        }
        int iE3 = xfg.e(this.c, n34Var.c);
        if (iE3 != 0) {
            return iE3;
        }
        int iE4 = xfg.e(this.o, n34Var.o);
        if (iE4 != 0) {
            return iE4;
        }
        int iE5 = xfg.e(this.X, n34Var.X);
        if (iE5 != 0) {
            return iE5;
        }
        int iE6 = xfg.e(this.Y, n34Var.Y);
        if (iE6 != 0) {
            return iE6;
        }
        int iE7 = xfg.e(this.Z, n34Var.Z);
        if (iE7 != 0) {
            return iE7;
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004a, code lost:
    
        throw new java.lang.IllegalArgumentException("This method does not currently support arrays.");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            if (r6 != r7) goto L5
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            goto L11
        L5:
            java.lang.Class<n34> r0 = defpackage.n34.class
            boolean r0 = r0.isInstance(r7)
            if (r0 != 0) goto L10
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            goto L11
        L10:
            r0 = 0
        L11:
            if (r0 != 0) goto L61
            n34 r7 = (defpackage.n34) r7
            r7.getClass()
            java.lang.Object[] r6 = r6.j()
            java.lang.Object[] r7 = r7.j()
            r0 = 0
            r1 = r0
        L22:
            r2 = 7
            r3 = 1
            if (r1 >= r2) goto L5c
            r2 = r6[r1]
            r4 = r7[r1]
            if (r2 == 0) goto L36
            java.lang.Class r5 = r2.getClass()
            boolean r5 = r5.isArray()
            if (r5 != 0) goto L43
        L36:
            if (r4 == 0) goto L4b
            java.lang.Class r5 = r4.getClass()
            boolean r5 = r5.isArray()
            if (r5 != 0) goto L43
            goto L4b
        L43:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "This method does not currently support arrays."
            r6.<init>(r7)
            throw r6
        L4b:
            if (r2 != 0) goto L52
            if (r4 != 0) goto L50
            goto L56
        L50:
            r3 = r0
            goto L56
        L52:
            boolean r3 = r2.equals(r4)
        L56:
            if (r3 != 0) goto L59
            goto L5d
        L59:
            int r1 = r1 + 1
            goto L22
        L5c:
            r0 = r3
        L5d:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L61:
            boolean r6 = r0.booleanValue()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n34.equals(java.lang.Object):boolean");
    }

    public final void f() {
        if (!n(1, 2, 3)) {
            throw new ic3("DateTime does not include year/month/day.", 2);
        }
    }

    public final long h(TimeZone timeZone) {
        Integer num = this.a;
        Integer num2 = this.b;
        Integer num3 = this.c;
        Integer num4 = this.o;
        int iIntValue = num4 == null ? 0 : num4.intValue();
        Integer num5 = this.X;
        int iIntValue2 = num5 == null ? 0 : num5.intValue();
        Integer num6 = this.Y;
        int iIntValue3 = num6 == null ? 0 : num6.intValue();
        Integer num7 = this.Z;
        int iIntValue4 = num7 != null ? num7.intValue() : 0;
        GregorianCalendar gregorianCalendar = new GregorianCalendar(timeZone);
        gregorianCalendar.set(1, num.intValue());
        gregorianCalendar.set(2, num2.intValue() - 1);
        gregorianCalendar.set(5, num3.intValue());
        gregorianCalendar.set(11, iIntValue);
        gregorianCalendar.set(12, iIntValue2);
        gregorianCalendar.set(13, iIntValue3);
        gregorianCalendar.set(14, iIntValue4 / 1000000);
        return gregorianCalendar.getTimeInMillis();
    }

    public final int hashCode() {
        if (this.s0 == 0) {
            Object[] objArrJ = j();
            int iP = 23;
            for (int i = 0; i < 7; i++) {
                iP = xfg.p(iP, objArrJ[i]);
            }
            this.s0 = iP;
        }
        return this.s0;
    }

    public final Object[] j() {
        return new Object[]{this.a, this.b, this.c, this.o, this.X, this.Y, this.Z};
    }

    public final int k() {
        Integer num = this.Y;
        int iIntValue = num != null ? num.intValue() : 0;
        Integer num2 = this.X;
        if (num2 != null) {
            iIntValue += num2.intValue() * 60;
        }
        Integer num3 = this.o;
        return num3 != null ? iIntValue + (num3.intValue() * 3600) : iIntValue;
    }

    public final n34 l(Integer num) {
        f();
        f();
        int iIntValue = num.intValue() + c() + 68569;
        int i = (iIntValue * 4) / 146097;
        int i2 = iIntValue - (((146097 * i) + 3) / 4);
        int i3 = ((i2 + 1) * 4000) / 1461001;
        int i4 = (i2 - ((i3 * 1461) / 4)) + 31;
        int i5 = (i4 * 80) / 2447;
        int i6 = i5 / 11;
        n34 n34Var = new n34(Integer.valueOf(((i - 49) * 100) + i3 + i6), Integer.valueOf((i5 + 2) - (i6 * 12)), Integer.valueOf(i4 - ((i5 * 2447) / 80)), null, null, null, null);
        return new n34(n34Var.a, n34Var.b, n34Var.c, this.o, this.X, this.Y, this.Z);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0014  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0012  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m(int... r8) {
        /*
            r7 = this;
            int r0 = r8.length
            r1 = 1
            r2 = 0
            r4 = r1
            r3 = r2
        L5:
            if (r3 >= r0) goto L54
            r5 = r8[r3]
            r6 = 7
            if (r6 != r5) goto L16
            if (r4 == 0) goto L14
            java.lang.Integer r4 = r7.Z
            if (r4 != 0) goto L14
        L12:
            r4 = r1
            goto L51
        L14:
            r4 = r2
            goto L51
        L16:
            r6 = 6
            if (r6 != r5) goto L20
            if (r4 == 0) goto L14
            java.lang.Integer r4 = r7.Y
            if (r4 != 0) goto L14
            goto L12
        L20:
            r6 = 5
            if (r6 != r5) goto L2a
            if (r4 == 0) goto L14
            java.lang.Integer r4 = r7.X
            if (r4 != 0) goto L14
            goto L12
        L2a:
            r6 = 4
            if (r6 != r5) goto L34
            if (r4 == 0) goto L14
            java.lang.Integer r4 = r7.o
            if (r4 != 0) goto L14
            goto L12
        L34:
            r6 = 3
            if (r6 != r5) goto L3e
            if (r4 == 0) goto L14
            java.lang.Integer r4 = r7.c
            if (r4 != 0) goto L14
            goto L12
        L3e:
            r6 = 2
            if (r6 != r5) goto L48
            if (r4 == 0) goto L14
            java.lang.Integer r4 = r7.b
            if (r4 != 0) goto L14
            goto L12
        L48:
            if (r1 != r5) goto L51
            if (r4 == 0) goto L14
            java.lang.Integer r4 = r7.a
            if (r4 != 0) goto L14
            goto L12
        L51:
            int r3 = r3 + 1
            goto L5
        L54:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n34.m(int[]):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0014  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0012  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean n(int... r8) {
        /*
            r7 = this;
            int r0 = r8.length
            r1 = 1
            r2 = 0
            r4 = r1
            r3 = r2
        L5:
            if (r3 >= r0) goto L54
            r5 = r8[r3]
            r6 = 7
            if (r6 != r5) goto L16
            if (r4 == 0) goto L14
            java.lang.Integer r4 = r7.Z
            if (r4 == 0) goto L14
        L12:
            r4 = r1
            goto L51
        L14:
            r4 = r2
            goto L51
        L16:
            r6 = 6
            if (r6 != r5) goto L20
            if (r4 == 0) goto L14
            java.lang.Integer r4 = r7.Y
            if (r4 == 0) goto L14
            goto L12
        L20:
            r6 = 5
            if (r6 != r5) goto L2a
            if (r4 == 0) goto L14
            java.lang.Integer r4 = r7.X
            if (r4 == 0) goto L14
            goto L12
        L2a:
            r6 = 4
            if (r6 != r5) goto L34
            if (r4 == 0) goto L14
            java.lang.Integer r4 = r7.o
            if (r4 == 0) goto L14
            goto L12
        L34:
            r6 = 3
            if (r6 != r5) goto L3e
            if (r4 == 0) goto L14
            java.lang.Integer r4 = r7.c
            if (r4 == 0) goto L14
            goto L12
        L3e:
            r6 = 2
            if (r6 != r5) goto L48
            if (r4 == 0) goto L14
            java.lang.Integer r4 = r7.b
            if (r4 == 0) goto L14
            goto L12
        L48:
            if (r1 != r5) goto L51
            if (r4 == 0) goto L14
            java.lang.Integer r4 = r7.a
            if (r4 == 0) goto L14
            goto L12
        L51:
            int r3 = r3 + 1
            goto L5
        L54:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n34.n(int[]):boolean");
    }

    public final String toString() {
        int i;
        Iterator it;
        Matcher matcher;
        String strSubstring;
        if (b() == null) {
            StringBuilder sb = new StringBuilder();
            a("Y", this.a, sb);
            a("M", this.b, sb);
            a("D", this.c, sb);
            a("h", this.o, sb);
            a("m", this.X, sb);
            a("s", this.Y, sb);
            a("f", this.Z, sb);
            return sb.toString().trim();
        }
        q34 q34Var = new q34(b());
        q34Var.c = new ArrayList();
        q34Var.b = new ArrayList();
        Pattern pattern = q34.d;
        String str = q34Var.a;
        Matcher matcher2 = pattern.matcher(str);
        while (true) {
            i = 1;
            if (!matcher2.find()) {
                break;
            }
            o34 o34Var = new o34();
            o34Var.a = matcher2.start();
            o34Var.b = matcher2.end() - 1;
            q34Var.c.add(o34Var);
        }
        Iterator it2 = q34.f.iterator();
        String strReplace = str;
        while (it2.hasNext()) {
            String str2 = (String) it2.next();
            Matcher matcher3 = Pattern.compile(str2).matcher(strReplace);
            while (matcher3.find()) {
                p34 p34Var = new p34();
                p34Var.a = matcher3.start();
                p34Var.b = matcher3.end() - i;
                Iterator it3 = q34Var.c.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        o34 o34Var2 = (o34) it3.next();
                        it = it2;
                        int i2 = o34Var2.a;
                        Iterator it4 = it3;
                        int i3 = p34Var.a;
                        if (i2 <= i3 && i3 <= o34Var2.b) {
                            matcher = matcher3;
                            break;
                        }
                        it2 = it;
                        it3 = it4;
                    } else {
                        it = it2;
                        String strGroup = matcher3.group();
                        if ("YYYY".equals(strGroup)) {
                            strSubstring = q34.c(this.a);
                        } else if ("YY".equals(strGroup)) {
                            String strC = q34.c(this.a);
                            strSubstring = nu0.P(strC) ? strC.substring(2) : "";
                        } else {
                            if ("MMMM".equals(strGroup)) {
                                this.b.getClass();
                                throw new IllegalArgumentException("Your date pattern requires either a Locale, or your own custom localizations for text:" + nu0.I(str));
                            }
                            if ("MMM".equals(strGroup)) {
                                this.b.getClass();
                                throw new IllegalArgumentException("Your date pattern requires either a Locale, or your own custom localizations for text:" + nu0.I(str));
                            }
                            if ("MM".equals(strGroup)) {
                                strSubstring = q34.a(q34.c(this.b));
                            } else if ("M".equals(strGroup)) {
                                strSubstring = q34.c(this.b);
                            } else if ("DD".equals(strGroup)) {
                                strSubstring = q34.a(q34.c(this.c));
                            } else if ("D".equals(strGroup)) {
                                strSubstring = q34.c(this.c);
                            } else {
                                if ("WWWW".equals(strGroup)) {
                                    f();
                                    c();
                                    throw new IllegalArgumentException("Your date pattern requires either a Locale, or your own custom localizations for text:" + nu0.I(str));
                                }
                                if ("WWW".equals(strGroup)) {
                                    f();
                                    c();
                                    throw new IllegalArgumentException("Your date pattern requires either a Locale, or your own custom localizations for text:" + nu0.I(str));
                                }
                                if ("hh".equals(strGroup)) {
                                    strSubstring = q34.a(q34.c(this.o));
                                } else if ("h".equals(strGroup)) {
                                    strSubstring = q34.c(this.o);
                                } else if ("h12".equals(strGroup)) {
                                    strSubstring = q34.c(q34.b(this.o));
                                } else if ("hh12".equals(strGroup)) {
                                    strSubstring = q34.a(q34.c(q34.b(this.o)));
                                } else {
                                    if ("a".equals(strGroup)) {
                                        this.o.getClass();
                                        throw new IllegalArgumentException("Your date pattern requires either a Locale, or your own custom localizations for text:" + nu0.I(str));
                                    }
                                    if ("mm".equals(strGroup)) {
                                        strSubstring = q34.a(q34.c(this.X));
                                    } else if ("m".equals(strGroup)) {
                                        strSubstring = q34.c(this.X);
                                    } else if ("ss".equals(strGroup)) {
                                        strSubstring = q34.a(q34.c(this.Y));
                                    } else if ("s".equals(strGroup)) {
                                        strSubstring = q34.c(this.Y);
                                    } else {
                                        if (!strGroup.startsWith("f")) {
                                            throw new IllegalArgumentException("Unknown token in date formatting pattern: ".concat(strGroup));
                                        }
                                        if (!q34.e.matcher(strGroup).matches()) {
                                            throw new IllegalArgumentException("Unknown token in date formatting pattern: ".concat(strGroup));
                                        }
                                        String strC2 = q34.c(this.Z);
                                        while (true) {
                                            matcher = matcher3;
                                            if (strC2.length() >= 9) {
                                                break;
                                            }
                                            strC2 = "0".concat(strC2);
                                            matcher3 = matcher;
                                        }
                                        int length = strGroup.length();
                                        strSubstring = (!nu0.P(strC2) || strC2.length() < length) ? strC2 : strC2.substring(0, length);
                                        p34Var.c = strSubstring;
                                        q34Var.b.add(p34Var);
                                    }
                                }
                            }
                        }
                        matcher = matcher3;
                        p34Var.c = strSubstring;
                        q34Var.b.add(p34Var);
                    }
                }
                it2 = it;
                matcher3 = matcher;
                i = 1;
            }
            Iterator it5 = it2;
            StringBuilder sb2 = new StringBuilder();
            for (int i4 = 1; i4 <= str2.length(); i4++) {
                sb2.append("@");
            }
            strReplace = strReplace.replace(str2, sb2.toString());
            it2 = it5;
            i = 1;
        }
        StringBuilder sb3 = new StringBuilder();
        int i5 = 0;
        while (i5 < str.length()) {
            String strSubstring2 = str.substring(i5, i5 + 1);
            Iterator it6 = q34Var.b.iterator();
            p34 p34Var2 = null;
            while (it6.hasNext()) {
                p34 p34Var3 = (p34) it6.next();
                if (p34Var3.a == i5) {
                    p34Var2 = p34Var3;
                }
            }
            if (p34Var2 != null) {
                sb3.append(p34Var2.c);
                i5 = p34Var2.b;
            } else if (!"|".equals(strSubstring2)) {
                sb3.append(strSubstring2);
            }
            i5++;
        }
        return sb3.toString();
    }
}
