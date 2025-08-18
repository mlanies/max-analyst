package defpackage;

/* loaded from: classes.dex */
public final class cn1 {
    public static final cn1 d = new cn1(2, null, null);
    public final int a;
    public final CharSequence b;
    public final CharSequence c;

    public cn1(int i, CharSequence charSequence, CharSequence charSequence2) {
        this.a = i;
        this.b = charSequence;
        this.c = charSequence2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cn1)) {
            return false;
        }
        cn1 cn1Var = (cn1) obj;
        return this.a == cn1Var.a && tpa.f(this.b, cn1Var.b) && tpa.f(this.c, cn1Var.c);
    }

    public final int hashCode() {
        int iS = au1.s(this.a) * 31;
        CharSequence charSequence = this.b;
        int iHashCode = (iS + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        CharSequence charSequence2 = this.c;
        return iHashCode + (charSequence2 != null ? charSequence2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CallTimeData(place=");
        int i = this.a;
        sb.append(i != 1 ? i != 2 ? "null" : "SPEAKER" : "HEADER");
        sb.append(", title=");
        sb.append((Object) this.b);
        sb.append(", status=");
        sb.append((Object) this.c);
        sb.append(")");
        return sb.toString();
    }
}
