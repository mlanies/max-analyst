package defpackage;

import java.text.DateFormat;
import java.util.Date;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class lw3 {
    public static final Pattern j = Pattern.compile("(\\d{2,4})[^\\d]*");
    public static final Pattern k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");
    public static final Pattern l = Pattern.compile("(\\d{1,2})[^\\d]*");
    public static final Pattern m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");
    public final String a;
    public final String b;
    public final long c;
    public final String d;
    public final String e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;

    public lw3(String str, String str2, long j2, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = str;
        this.b = str2;
        this.c = j2;
        this.d = str3;
        this.e = str4;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = z4;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof lw3) {
            lw3 lw3Var = (lw3) obj;
            if (tpa.f(lw3Var.a, this.a) && tpa.f(lw3Var.b, this.b) && lw3Var.c == this.c && tpa.f(lw3Var.d, this.d) && tpa.f(lw3Var.e, this.e) && lw3Var.f == this.f && lw3Var.g == this.g && lw3Var.h == this.h && lw3Var.i == this.i) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.i) + ms2.d(ms2.d(ms2.d(rh4.d(rh4.d(h4f.m(rh4.d(rh4.d(527, 31, this.a), 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append('=');
        sb.append(this.b);
        if (this.h) {
            long j2 = this.c;
            if (j2 == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                sb.append(((DateFormat) w34.a.get()).format(new Date(j2)));
            }
        }
        if (!this.i) {
            sb.append("; domain=");
            sb.append(this.d);
        }
        sb.append("; path=");
        sb.append(this.e);
        if (this.f) {
            sb.append("; secure");
        }
        if (this.g) {
            sb.append("; httponly");
        }
        return sb.toString();
    }
}
