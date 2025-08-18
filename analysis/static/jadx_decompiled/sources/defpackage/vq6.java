package defpackage;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class vq6 {
    public static final char[] j = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public final boolean a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final int f;
    public final List g;
    public final String h;
    public final String i;

    public vq6(String str, String str2, String str3, String str4, int i, ArrayList arrayList, String str5, String str6) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = i;
        this.g = arrayList;
        this.h = str5;
        this.i = str6;
        this.a = tpa.f(str, "https");
    }

    public final String a() {
        if (this.d.length() == 0) {
            return "";
        }
        int length = this.b.length() + 3;
        String str = this.i;
        int iZ0 = w9e.z0(str, ':', length, false, 4) + 1;
        int iZ02 = w9e.z0(str, '@', 0, false, 6);
        if (str != null) {
            return str.substring(iZ0, iZ02);
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }

    public final String b() {
        int length = this.b.length() + 3;
        String str = this.i;
        int iZ0 = w9e.z0(str, '/', length, false, 4);
        return str.substring(iZ0, naf.f(str, iZ0, str.length(), "?#"));
    }

    public final ArrayList c() {
        int length = this.b.length() + 3;
        String str = this.i;
        int iZ0 = w9e.z0(str, '/', length, false, 4);
        int iF = naf.f(str, iZ0, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (iZ0 < iF) {
            int i = iZ0 + 1;
            int iE = naf.e('/', i, iF, str);
            arrayList.add(str.substring(i, iE));
            iZ0 = iE;
        }
        return arrayList;
    }

    public final String d() {
        if (this.g == null) {
            return null;
        }
        String str = this.i;
        int iZ0 = w9e.z0(str, '?', 0, false, 6) + 1;
        return str.substring(iZ0, naf.e('#', iZ0, str.length(), str));
    }

    public final String e() {
        if (this.c.length() == 0) {
            return "";
        }
        int length = this.b.length() + 3;
        String str = this.i;
        int iF = naf.f(str, length, str.length(), ":@");
        if (str != null) {
            return str.substring(length, iF);
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }

    public final boolean equals(Object obj) {
        return (obj instanceof vq6) && tpa.f(((vq6) obj).i, this.i);
    }

    public final od3 f() {
        od3 od3Var = new od3();
        String str = this.b;
        od3Var.e = str;
        od3Var.f = e();
        od3Var.g = a();
        od3Var.h = this.e;
        int iT = buc.t(str);
        int i = this.f;
        if (i == iT) {
            i = -1;
        }
        od3Var.b = i;
        ArrayList arrayList = od3Var.c;
        arrayList.clear();
        arrayList.addAll(c());
        String strD = d();
        String strSubstring = null;
        od3Var.d = strD != null ? buc.A(buc.e(strD, 0, 0, " \"'<>#", true, false, true, false, 211)) : null;
        if (this.h != null) {
            String str2 = this.i;
            int iZ0 = w9e.z0(str2, '#', 0, false, 6) + 1;
            if (str2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            strSubstring = str2.substring(iZ0);
        }
        od3Var.i = strSubstring;
        return od3Var;
    }

    public final String g() {
        od3 od3Var;
        try {
            od3Var = new od3();
            od3Var.j(this, "/...");
        } catch (IllegalArgumentException unused) {
            od3Var = null;
        }
        od3Var.getClass();
        od3Var.f = buc.e("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, 251);
        od3Var.g = buc.e("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, 251);
        return od3Var.b().i;
    }

    public final URI h() {
        od3 od3VarF = f();
        String str = (String) od3VarF.h;
        od3VarF.h = str != null ? Pattern.compile("[\"<>^`{|}]").matcher(str).replaceAll("") : null;
        ArrayList arrayList = od3VarF.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.set(i, buc.e((String) arrayList.get(i), 0, 0, "[]", true, true, false, false, 227));
        }
        ArrayList arrayList2 = od3VarF.d;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                String str2 = (String) arrayList2.get(i2);
                arrayList2.set(i2, str2 != null ? buc.e(str2, 0, 0, "\\^`{|}", true, true, true, false, 195) : null);
            }
        }
        String str3 = (String) od3VarF.i;
        od3VarF.i = str3 != null ? buc.e(str3, 0, 0, " \"#<>\\^`{|}", true, true, false, true, 163) : null;
        String string = od3VarF.toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e) {
            try {
                return URI.create(Pattern.compile("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").matcher(string).replaceAll(""));
            } catch (Exception unused) {
                throw new RuntimeException(e);
            }
        }
    }

    public final int hashCode() {
        return this.i.hashCode();
    }

    public final String toString() {
        return this.i;
    }
}
