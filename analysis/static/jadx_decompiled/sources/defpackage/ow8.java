package defpackage;

/* loaded from: classes2.dex */
public final class ow8 {
    public static final ow8 d = new ow8(-1, null, null);
    public final long a;
    public final String b;
    public final CharSequence c;

    public ow8(long j, CharSequence charSequence, String str) {
        this.a = j;
        this.b = str;
        this.c = charSequence;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ow8)) {
            return false;
        }
        ow8 ow8Var = (ow8) obj;
        return this.a == ow8Var.a && tpa.f(this.b, ow8Var.b) && tpa.f(this.c, ow8Var.c);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.a) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        CharSequence charSequence = this.c;
        return iHashCode2 + (charSequence != null ? charSequence.hashCode() : 0);
    }

    public final String toString() {
        return "AvatarParams(id=" + this.a + ", url=" + this.b + ", placeholder=" + ((Object) this.c) + ")";
    }
}
