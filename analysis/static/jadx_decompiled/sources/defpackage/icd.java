package defpackage;

/* loaded from: classes2.dex */
public final class icd {
    public final String a;
    public final String b;
    public final long c;
    public final String d;

    public icd(String str, long j, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof icd)) {
            return false;
        }
        icd icdVar = (icd) obj;
        return tpa.f(this.a, icdVar.a) && tpa.f(this.b, icdVar.b) && this.c == icdVar.c && tpa.f(this.d, icdVar.d);
    }

    public final int hashCode() {
        int iM = h4f.m(rh4.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return iM + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SettingEntryBanner(iconUrl=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", appId=");
        sb.append(this.c);
        sb.append(", startParam=");
        return zr6.l(sb, this.d, ")");
    }
}
