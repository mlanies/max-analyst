package defpackage;

import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class wk {
    public static final wk f = new wk(null, null, null);
    public final String a;
    public final String b = null;
    public final String c = null;
    public final String d;
    public final String e;

    public wk(String str, String str2, String str3) {
        this.a = str;
        this.d = str2;
        this.e = str3;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof wk) {
                wk wkVar = (wk) obj;
                if (!tpa.f(this.e, wkVar.e) || !tpa.f(this.d, wkVar.d) || !tpa.f(this.c, wkVar.c) || !tpa.f(this.b, wkVar.b) || !tpa.f(this.a, wkVar.a)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.d;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.e;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ApiConfig{appKey='");
        sb.append(this.a);
        sb.append("', userId='");
        sb.append(this.b);
        sb.append("', token='");
        sb.append(this.c);
        sb.append("', sessionKey='");
        sb.append(this.d);
        sb.append("', sessionSecret='");
        Locale locale = Locale.US;
        String str = this.e;
        sb.append(String.format(locale, "0x%08x", Arrays.copyOf(new Object[]{Integer.valueOf(str != null ? str.hashCode() : 0)}, 1)));
        sb.append("'}");
        return sb.toString();
    }
}
