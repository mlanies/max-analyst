package defpackage;

/* loaded from: classes.dex */
public final class jh1 {
    public final Integer a;
    public final bi9 b;
    public final CharSequence c;

    public jh1(Integer num, bi9 bi9Var, CharSequence charSequence) {
        this.a = num;
        this.b = bi9Var;
        this.c = charSequence;
    }

    public static jh1 a(jh1 jh1Var, Integer num, bi9 bi9Var, CharSequence charSequence, int i) {
        if ((i & 1) != 0) {
            num = jh1Var.a;
        }
        if ((i & 2) != 0) {
            bi9Var = jh1Var.b;
        }
        if ((i & 4) != 0) {
            charSequence = jh1Var.c;
        }
        jh1Var.getClass();
        return new jh1(num, bi9Var, charSequence);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jh1)) {
            return false;
        }
        jh1 jh1Var = (jh1) obj;
        return tpa.f(this.a, jh1Var.a) && tpa.f(this.b, jh1Var.b) && tpa.f(this.c, jh1Var.c);
    }

    public final int hashCode() {
        Integer num = this.a;
        int iHashCode = (this.b.hashCode() + ((num == null ? 0 : num.hashCode()) * 31)) * 31;
        CharSequence charSequence = this.c;
        return iHashCode + (charSequence != null ? charSequence.hashCode() : 0);
    }

    public final String toString() {
        return "State(selectedEmoji=" + this.a + ", selectedReasons=" + this.b + ", otherReasonText=" + ((Object) this.c) + ")";
    }
}
