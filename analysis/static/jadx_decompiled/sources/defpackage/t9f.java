package defpackage;

import java.util.TimeZone;
import ru.ok.android.externcalls.analytics.internal.upload.AbstractUploader;

/* loaded from: classes2.dex */
public final class t9f {
    public final String a;
    public final String b;
    public final int c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final int j;
    public final TimeZone k;

    public t9f(String str, String str2, String str3, String str4, String str5) {
        TimeZone timeZone = TimeZone.getDefault();
        this.a = AbstractUploader.SDK_TYPE_STRING;
        this.b = "25.8.1";
        this.c = 6392;
        this.d = null;
        this.e = str;
        this.f = str2;
        this.g = str3;
        this.h = str4;
        this.i = str5;
        this.j = 2;
        this.k = timeZone;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t9f)) {
            return false;
        }
        t9f t9fVar = (t9f) obj;
        return tpa.f(this.a, t9fVar.a) && tpa.f(this.b, t9fVar.b) && this.c == t9fVar.c && tpa.f(this.d, t9fVar.d) && tpa.f(this.e, t9fVar.e) && tpa.f(this.f, t9fVar.f) && tpa.f(this.g, t9fVar.g) && tpa.f(this.h, t9fVar.h) && tpa.f(this.i, t9fVar.i) && this.j == t9fVar.j && tpa.f(this.k, t9fVar.k);
    }

    public final int hashCode() {
        int iE = k7d.e(this.c, rh4.d(this.a.hashCode() * 31, 31, this.b), 31);
        String str = this.d;
        return this.k.hashCode() + ey8.g(this.j, rh4.d(rh4.d(rh4.d(rh4.d(rh4.d((iE + (str == null ? 0 : str.hashCode())) * 31, 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UserAgent(deviceType=");
        sb.append(this.a);
        sb.append(", appVersion=");
        sb.append(this.b);
        sb.append(", buildNumber=");
        sb.append(this.c);
        sb.append(", appKey=");
        sb.append(this.d);
        sb.append(", osVersion=");
        sb.append(this.e);
        sb.append(", locale=");
        sb.append(this.f);
        sb.append(", deviceLocale=");
        sb.append(this.g);
        sb.append(", deviceName=");
        sb.append(this.h);
        sb.append(", screen=");
        sb.append(this.i);
        sb.append(", pushDeviceType=");
        int i = this.j;
        sb.append(i != 1 ? i != 2 ? i != 3 ? "null" : "RUSTORE" : "GCM" : "HUAWEI");
        sb.append(", timeZone=");
        sb.append(this.k);
        sb.append(")");
        return sb.toString();
    }
}
