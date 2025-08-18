package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class dvf {
    public static final cvf Companion = new cvf();
    public static final cc7[] h = {null, null, new ns(s9e.a), null, null, null, null};
    public final String a;
    public final boolean b;
    public final List c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final String g;

    public /* synthetic */ dvf(int i, String str, boolean z, List list, boolean z2, boolean z3, boolean z4, String str2) {
        if (127 != (i & 127)) {
            ju0.I(i, 127, bvf.a.d());
            throw null;
        }
        this.a = str;
        this.b = z;
        this.c = list;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dvf)) {
            return false;
        }
        dvf dvfVar = (dvf) obj;
        return tpa.f(this.a, dvfVar.a) && this.b == dvfVar.b && tpa.f(this.c, dvfVar.c) && this.d == dvfVar.d && this.e == dvfVar.e && this.f == dvfVar.f && tpa.f(this.g, dvfVar.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + ms2.d(ms2.d(ms2.d(k7d.g(this.c, ms2.d(this.a.hashCode() * 31, 31, this.b), 31), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WebAppBiometryInfoResponse(requestId=");
        sb.append(this.a);
        sb.append(", available=");
        sb.append(this.b);
        sb.append(", type=");
        sb.append(this.c);
        sb.append(", accessRequested=");
        sb.append(this.d);
        sb.append(", accessGranted=");
        sb.append(this.e);
        sb.append(", tokenSaved=");
        sb.append(this.f);
        sb.append(", deviceId=");
        return zr6.l(sb, this.g, ")");
    }

    public dvf(String str, List list, boolean z, boolean z2, boolean z3, String str2) {
        this.a = str;
        this.b = true;
        this.c = list;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = str2;
    }
}
