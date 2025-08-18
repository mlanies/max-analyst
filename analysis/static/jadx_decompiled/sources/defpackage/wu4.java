package defpackage;

/* loaded from: classes2.dex */
public final class wu4 implements jv4 {
    public final String a;
    public final long b;
    public final CharSequence c;
    public final String d;
    public final a73 e;
    public final String f;
    public final int g;

    public wu4(String str, long j, CharSequence charSequence, String str2, a73 a73Var, String str3, int i) {
        this.a = str;
        this.b = j;
        this.c = charSequence;
        this.d = str2;
        this.e = a73Var;
        this.f = str3;
        this.g = i;
    }

    public static wu4 c(wu4 wu4Var, String str, a73 a73Var, String str2, int i) {
        if ((i & 8) != 0) {
            str = wu4Var.d;
        }
        String str3 = str;
        if ((i & 16) != 0) {
            a73Var = wu4Var.e;
        }
        a73 a73Var2 = a73Var;
        if ((i & 32) != 0) {
            str2 = wu4Var.f;
        }
        return new wu4(wu4Var.a, wu4Var.b, wu4Var.c, str3, a73Var2, str2, wu4Var.g);
    }

    @Override // defpackage.jv4
    public final boolean a(jv4 jv4Var) {
        if (jv4Var == null || !(jv4Var instanceof wu4)) {
            return false;
        }
        wu4 wu4Var = (wu4) jv4Var;
        return (tpa.f(this.d, wu4Var.d) && tpa.f(this.f, wu4Var.f) && this.g == wu4Var.g) ? false : true;
    }

    @Override // defpackage.jv4
    public final boolean b(jv4 jv4Var) {
        if (jv4Var == null || !(jv4Var instanceof wu4)) {
            return false;
        }
        return this.g != ((wu4) jv4Var).g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wu4)) {
            return false;
        }
        wu4 wu4Var = (wu4) obj;
        return tpa.f(this.a, wu4Var.a) && this.b == wu4Var.b && tpa.f(this.c, wu4Var.c) && tpa.f(this.d, wu4Var.d) && tpa.f(this.e, wu4Var.e) && tpa.f(this.f, wu4Var.f) && this.g == wu4Var.g;
    }

    public final int hashCode() {
        String str = this.a;
        int iF = rh4.f(this.c, h4f.m((str == null ? 0 : str.hashCode()) * 31, 31, this.b), 31);
        String str2 = this.d;
        int iHashCode = (iF + (str2 == null ? 0 : str2.hashCode())) * 31;
        a73 a73Var = this.e;
        int iHashCode2 = (iHashCode + (a73Var == null ? 0 : a73Var.a.hashCode())) * 31;
        String str3 = this.f;
        return au1.s(this.g) + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EditChatProfileUiModel(avatarUrl=");
        sb.append(this.a);
        sb.append(", avatarSourceId=");
        sb.append(this.b);
        sb.append(", abbreviation=");
        sb.append((Object) this.c);
        sb.append(", title=");
        sb.append(this.d);
        sb.append(", titleError=");
        sb.append(this.e);
        sb.append(", description=");
        sb.append(this.f);
        sb.append(", chatType=");
        int i = this.g;
        sb.append(i != 1 ? i != 2 ? "null" : "PRIVATE" : "PUBLIC");
        sb.append(")");
        return sb.toString();
    }
}
