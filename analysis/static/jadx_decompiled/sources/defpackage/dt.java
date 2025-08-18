package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class dt {
    public static final nva t;
    public static final Pattern u;
    public static final Pattern v;
    public static final Pattern w;
    public final zua i;
    public final String j;
    public final ova k;
    public ova l;
    public final StringBuilder a = new StringBuilder();
    public String b = "";
    public final StringBuilder c = new StringBuilder();
    public final StringBuilder d = new StringBuilder();
    public boolean e = true;
    public boolean f = false;
    public boolean g = false;
    public boolean h = false;
    public int m = 0;
    public final StringBuilder n = new StringBuilder();
    public boolean o = false;
    public String p = "";
    public final StringBuilder q = new StringBuilder();
    public final ArrayList r = new ArrayList();
    public final qqd s = new qqd(64);

    static {
        nva nvaVar = new nva();
        nvaVar.T0 = "<ignored>";
        nvaVar.V0 = "NA";
        t = nvaVar;
        u = Pattern.compile("[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～]*\\$1[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～]*(\\$\\d[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～]*)*");
        v = Pattern.compile("[- ]");
        w = Pattern.compile("\u2008");
    }

    public dt(zua zuaVar, String str) {
        this.i = zuaVar;
        this.j = str;
        ova ovaVarG = g(str);
        this.l = ovaVarG;
        this.k = ovaVarG;
    }

    public final String a(String str) {
        StringBuilder sb = this.n;
        int length = sb.length();
        if (!this.o || length <= 0 || sb.charAt(length - 1) == ' ') {
            return ((Object) sb) + str;
        }
        return new String(sb) + ' ' + str;
    }

    public final String b() {
        StringBuilder sb = this.q;
        if (sb.length() < 3) {
            return a(sb.toString());
        }
        String string = sb.toString();
        for (mva mvaVar : (this.g && this.p.length() == 0 && this.l.i1.size() > 0) ? this.l.i1 : this.l.h1) {
            if (this.p.length() > 0) {
                String str = mvaVar.X;
                if ((str.length() == 0 || zua.x.matcher(str).matches()) && !mvaVar.Y && !mvaVar.Z) {
                }
            }
            if (this.p.length() == 0 && !this.g) {
                String str2 = mvaVar.X;
                if (str2.length() == 0 || zua.x.matcher(str2).matches() || mvaVar.Y) {
                }
            }
            if (u.matcher(mvaVar.b).matches()) {
                this.r.add(mvaVar);
            }
        }
        l(string);
        String strE = e();
        return strE.length() > 0 ? strE : k() ? h() : this.c.toString();
    }

    public final boolean c() {
        StringBuilder sb;
        zua zuaVar;
        int iC;
        StringBuilder sb2 = this.q;
        if (sb2.length() == 0 || (iC = (zuaVar = this.i).c(sb2, (sb = new StringBuilder()))) == 0) {
            return false;
        }
        sb2.setLength(0);
        sb2.append((CharSequence) sb);
        String strK = zuaVar.k(iC);
        if ("001".equals(strK)) {
            this.l = zuaVar.f(iC);
        } else if (!strK.equals(this.j)) {
            this.l = g(strK);
        }
        String string = Integer.toString(iC);
        StringBuilder sb3 = this.n;
        sb3.append(string);
        sb3.append(' ');
        this.p = "";
        return true;
    }

    public final boolean d() {
        Pattern patternW = this.s.w("\\+|" + this.l.V0);
        StringBuilder sb = this.d;
        Matcher matcher = patternW.matcher(sb);
        if (!matcher.lookingAt()) {
            return false;
        }
        this.g = true;
        int iEnd = matcher.end();
        StringBuilder sb2 = this.q;
        sb2.setLength(0);
        sb2.append(sb.substring(iEnd));
        StringBuilder sb3 = this.n;
        sb3.setLength(0);
        sb3.append(sb.substring(0, iEnd));
        if (sb.charAt(0) != '+') {
            sb3.append(' ');
        }
        return true;
    }

    public final String e() {
        Iterator it = this.r.iterator();
        while (it.hasNext()) {
            mva mvaVar = (mva) it.next();
            Matcher matcher = this.s.w(mvaVar.a).matcher(this.q);
            if (matcher.matches()) {
                this.o = v.matcher(mvaVar.X).find();
                String strA = a(matcher.replaceAll(mvaVar.b));
                if (zua.s(strA, zua.i).contentEquals(this.d)) {
                    return strA;
                }
            }
        }
        return "";
    }

    public final void f() {
        this.c.setLength(0);
        this.d.setLength(0);
        this.a.setLength(0);
        this.m = 0;
        this.b = "";
        this.n.setLength(0);
        this.p = "";
        this.q.setLength(0);
        this.e = true;
        this.f = false;
        this.g = false;
        this.h = false;
        this.r.clear();
        this.o = false;
        if (this.l.equals(this.k)) {
            return;
        }
        this.l = g(this.j);
    }

    public final ova g(String str) {
        int i;
        zua zuaVar = this.i;
        if (zuaVar.n(str)) {
            ova ovaVarG = zuaVar.g(str);
            if (ovaVarG == null) {
                throw new IllegalArgumentException(wg0.i("Invalid region code: ", str));
            }
            i = ovaVarG.U0;
        } else {
            Level level = Level.WARNING;
            StringBuilder sb = new StringBuilder("Invalid or missing region code (");
            if (str == null) {
                str = "null";
            }
            zua.h.log(level, zr6.l(sb, str, ") provided."));
            i = 0;
        }
        ova ovaVarG2 = zuaVar.g(zuaVar.k(i));
        return ovaVarG2 != null ? ovaVarG2 : t;
    }

    public final String h() {
        StringBuilder sb = this.q;
        int length = sb.length();
        if (length <= 0) {
            return this.n.toString();
        }
        String strJ = "";
        for (int i = 0; i < length; i++) {
            strJ = j(sb.charAt(i));
        }
        return this.e ? a(strJ) : this.c.toString();
    }

    public final String i(char c) {
        StringBuilder sb = this.c;
        sb.append(c);
        boolean zIsDigit = Character.isDigit(c);
        StringBuilder sb2 = this.d;
        StringBuilder sb3 = this.q;
        if (!zIsDigit && (sb.length() != 1 || !zua.l.matcher(Character.toString(c)).matches())) {
            this.e = false;
            this.f = true;
        } else if (c == '+') {
            sb2.append(c);
        } else {
            c = Character.forDigit(Character.digit(c, 10), 10);
            sb2.append(c);
            sb3.append(c);
        }
        boolean z = this.e;
        StringBuilder sb4 = this.n;
        if (!z) {
            if (this.f) {
                return sb.toString();
            }
            if (!d()) {
                if (this.p.length() > 0) {
                    sb3.insert(0, this.p);
                    sb4.setLength(sb4.lastIndexOf(this.p));
                }
                if (!this.p.equals(m())) {
                    sb4.append(' ');
                    this.e = true;
                    this.h = false;
                    this.r.clear();
                    this.m = 0;
                    this.a.setLength(0);
                    this.b = "";
                    return b();
                }
            } else if (c()) {
                this.e = true;
                this.h = false;
                this.r.clear();
                this.m = 0;
                this.a.setLength(0);
                this.b = "";
                return b();
            }
            return sb.toString();
        }
        int length = sb2.length();
        if (length == 0 || length == 1 || length == 2) {
            return sb.toString();
        }
        if (length == 3) {
            if (!d()) {
                this.p = m();
                return b();
            }
            this.h = true;
        }
        if (this.h) {
            if (c()) {
                this.h = false;
            }
            return ((Object) sb4) + sb3.toString();
        }
        if (this.r.size() <= 0) {
            return b();
        }
        String strJ = j(c);
        String strE = e();
        if (strE.length() > 0) {
            return strE;
        }
        l(sb3.toString());
        return k() ? h() : this.e ? a(strJ) : sb.toString();
    }

    public final String j(char c) {
        StringBuilder sb = this.a;
        Matcher matcher = w.matcher(sb);
        if (!matcher.find(this.m)) {
            if (this.r.size() == 1) {
                this.e = false;
            }
            this.b = "";
            return this.c.toString();
        }
        String strReplaceFirst = matcher.replaceFirst(Character.toString(c));
        sb.replace(0, strReplaceFirst.length(), strReplaceFirst);
        int iStart = matcher.start();
        this.m = iStart;
        return sb.substring(0, iStart + 1);
    }

    public final boolean k() {
        Iterator it = this.r.iterator();
        while (it.hasNext()) {
            mva mvaVar = (mva) it.next();
            String str = mvaVar.a;
            if (this.b.equals(str)) {
                return false;
            }
            String str2 = mvaVar.a;
            StringBuilder sb = this.a;
            sb.setLength(0);
            String str3 = mvaVar.b;
            Matcher matcher = this.s.w(str2).matcher("999999999999999");
            matcher.find();
            String strGroup = matcher.group();
            String strReplaceAll = strGroup.length() < this.q.length() ? "" : strGroup.replaceAll(str2, str3).replaceAll("9", "\u2008");
            if (strReplaceAll.length() > 0) {
                sb.append(strReplaceAll);
                this.b = str;
                this.o = v.matcher(mvaVar.X).find();
                this.m = 0;
                return true;
            }
            it.remove();
        }
        this.e = false;
        return false;
    }

    public final void l(String str) {
        int length = str.length() - 3;
        Iterator it = this.r.iterator();
        while (it.hasNext()) {
            mva mvaVar = (mva) it.next();
            if (mvaVar.c.size() != 0) {
                if (!this.s.w((String) mvaVar.c.get(Math.min(length, mvaVar.c.size() - 1))).matcher(str).lookingAt()) {
                    it.remove();
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String m() {
        /*
            r7 = this;
            ova r0 = r7.l
            int r0 = r0.U0
            java.lang.StringBuilder r1 = r7.n
            r2 = 1
            java.lang.StringBuilder r3 = r7.q
            r4 = 0
            if (r0 != r2) goto L2d
            char r0 = r3.charAt(r4)
            r5 = 49
            if (r0 != r5) goto L2d
            char r0 = r3.charAt(r2)
            r6 = 48
            if (r0 == r6) goto L2d
            char r0 = r3.charAt(r2)
            if (r0 == r5) goto L2d
            r1.append(r5)
            r0 = 32
            r1.append(r0)
            r7.g = r2
            goto L5a
        L2d:
            ova r0 = r7.l
            boolean r5 = r0.c1
            if (r5 == 0) goto L59
            java.lang.String r0 = r0.d1
            qqd r5 = r7.s
            java.util.regex.Pattern r0 = r5.w(r0)
            java.util.regex.Matcher r0 = r0.matcher(r3)
            boolean r5 = r0.lookingAt()
            if (r5 == 0) goto L59
            int r5 = r0.end()
            if (r5 <= 0) goto L59
            r7.g = r2
            int r2 = r0.end()
            java.lang.String r7 = r3.substring(r4, r2)
            r1.append(r7)
            goto L5a
        L59:
            r2 = r4
        L5a:
            java.lang.String r7 = r3.substring(r4, r2)
            r3.delete(r4, r2)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dt.m():java.lang.String");
    }
}
