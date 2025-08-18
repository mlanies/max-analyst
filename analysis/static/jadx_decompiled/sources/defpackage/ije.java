package defpackage;

import java.util.Locale;

/* loaded from: classes.dex */
public final class ije {
    public final String a;
    public final String b;
    public final boolean c;
    public final int d;
    public final String e;
    public final int f;
    public final int g;

    public ije(int i, int i2, String str, String str2, String str3, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = i;
        this.e = str3;
        this.f = i2;
        String upperCase = str2.toUpperCase(Locale.US);
        this.g = w9e.p0(upperCase, "INT", false) ? 3 : (w9e.p0(upperCase, "CHAR", false) || w9e.p0(upperCase, "CLOB", false) || w9e.p0(upperCase, "TEXT", false)) ? 2 : w9e.p0(upperCase, "BLOB", false) ? 5 : (w9e.p0(upperCase, "REAL", false) || w9e.p0(upperCase, "FLOA", false) || w9e.p0(upperCase, "DOUB", false)) ? 4 : 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ije)) {
            return false;
        }
        ije ijeVar = (ije) obj;
        if (this.d != ijeVar.d) {
            return false;
        }
        if (!tpa.f(this.a, ijeVar.a) || this.c != ijeVar.c) {
            return false;
        }
        int i = ijeVar.f;
        String str = ijeVar.e;
        String str2 = this.e;
        int i2 = this.f;
        if (i2 == 1 && i == 2 && str2 != null && !ay7.i(str2, str)) {
            return false;
        }
        if (i2 != 2 || i != 1 || str == null || ay7.i(str, str2)) {
            return (i2 == 0 || i2 != i || (str2 == null ? str == null : ay7.i(str2, str))) && this.g == ijeVar.g;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.g) * 31) + (this.c ? 1231 : 1237)) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Column{name='");
        sb.append(this.a);
        sb.append("', type='");
        sb.append(this.b);
        sb.append("', affinity='");
        sb.append(this.g);
        sb.append("', notNull=");
        sb.append(this.c);
        sb.append(", primaryKeyPosition=");
        sb.append(this.d);
        sb.append(", defaultValue='");
        String str = this.e;
        if (str == null) {
            str = "undefined";
        }
        return zr6.l(sb, str, "'}");
    }
}
