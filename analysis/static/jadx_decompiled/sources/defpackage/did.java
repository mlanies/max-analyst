package defpackage;

/* loaded from: classes2.dex */
public final class did {
    public static final did h = new did(-1, null, "", "", "", "", false);
    public final long a;
    public final String b;
    public final String c;
    public final CharSequence d;
    public final String e;
    public final String f;
    public final boolean g;

    public did(long j, String str, String str2, CharSequence charSequence, String str3, String str4, boolean z) {
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = charSequence;
        this.e = str3;
        this.f = str4;
        this.g = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof did)) {
            return false;
        }
        did didVar = (did) obj;
        return this.a == didVar.a && tpa.f(this.b, didVar.b) && tpa.f(this.c, didVar.c) && tpa.f(this.d, didVar.d) && tpa.f(this.e, didVar.e) && tpa.f(this.f, didVar.f) && this.g == didVar.g;
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.a) * 31;
        String str = this.b;
        return Boolean.hashCode(this.g) + rh4.d(rh4.d(rh4.f(this.d, rh4.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c), 31), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SettingsProfileDataModel(id=");
        sb.append(this.a);
        sb.append(", avatarUrl=");
        sb.append(this.b);
        sb.append(", fullName=");
        sb.append(this.c);
        sb.append(", abbreviation=");
        sb.append((Object) this.d);
        sb.append(", phone=");
        sb.append(this.e);
        sb.append(", nickName=");
        sb.append(this.f);
        sb.append(", hasEsiaConnection=");
        return au1.j(sb, this.g, ")");
    }
}
