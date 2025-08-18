package defpackage;

/* loaded from: classes2.dex */
public final class nc2 {
    public final String a;
    public final long b;
    public final CharSequence c;
    public final String d;
    public final String e;
    public final boolean f;
    public final boolean g;
    public final boolean h;

    public nc2(String str, long j, CharSequence charSequence, String str2, String str3, boolean z, boolean z2, boolean z3) {
        this.a = str;
        this.b = j;
        this.c = charSequence;
        this.d = str2;
        this.e = str3;
        this.f = z;
        this.g = z2;
        this.h = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nc2)) {
            return false;
        }
        nc2 nc2Var = (nc2) obj;
        return tpa.f(this.a, nc2Var.a) && this.b == nc2Var.b && tpa.f(this.c, nc2Var.c) && tpa.f(this.d, nc2Var.d) && tpa.f(this.e, nc2Var.e) && this.f == nc2Var.f && this.g == nc2Var.g && this.h == nc2Var.h;
    }

    public final int hashCode() {
        String str = this.a;
        return Boolean.hashCode(this.h) + ms2.d(ms2.d(rh4.d(rh4.d(rh4.f(this.c, h4f.m((str == null ? 0 : str.hashCode()) * 31, 31, this.b), 31), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChatItemModel(avatarUrl=");
        sb.append(this.a);
        sb.append(", avatarSourceId=");
        sb.append(this.b);
        sb.append(", avatarAbbreviation=");
        sb.append((Object) this.c);
        sb.append(", chatName=");
        sb.append(this.d);
        sb.append(", chatLink=");
        sb.append(this.e);
        sb.append(", isLoading=");
        sb.append(this.f);
        sb.append(", isPrivate=");
        sb.append(this.g);
        sb.append(", hasEditLinkPermission=");
        return au1.j(sb, this.h, ")");
    }
}
