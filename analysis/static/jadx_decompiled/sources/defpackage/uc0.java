package defpackage;

/* loaded from: classes2.dex */
public final class uc0 {
    public static final uc0 c = new uc0("", 0);
    public final long a;
    public final CharSequence b;

    public uc0(CharSequence charSequence, long j) {
        this.a = j;
        this.b = charSequence;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uc0)) {
            return false;
        }
        uc0 uc0Var = (uc0) obj;
        return this.a == uc0Var.a && tpa.f(this.b, uc0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "AvatarAbbreviationModel(sourceId=" + this.a + ", abbreviation=" + ((Object) this.b) + ")";
    }
}
