package defpackage;

/* loaded from: classes.dex */
public final class bl6 extends hl6 {
    public final long a;
    public final CharSequence b;
    public final String c;
    public final boolean d;

    public bl6(long j, CharSequence charSequence, String str, boolean z) {
        this.a = j;
        this.b = charSequence;
        this.c = str;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bl6)) {
            return false;
        }
        bl6 bl6Var = (bl6) obj;
        return this.a == bl6Var.a && tpa.f(this.b, bl6Var.b) && tpa.f(this.c, bl6Var.c) && this.d == bl6Var.d;
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.a) * 31;
        CharSequence charSequence = this.b;
        int iHashCode2 = (iHashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        String str = this.c;
        return Boolean.hashCode(this.d) + ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "Avatar(avatarColorId=" + this.a + ", abbreviation=" + ((Object) this.b) + ", avatar=" + this.c + ", isCallLink=" + this.d + ")";
    }
}
