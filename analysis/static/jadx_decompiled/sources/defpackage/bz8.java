package defpackage;

/* loaded from: classes2.dex */
public final class bz8 {
    public final CharSequence a;
    public final Integer b;

    public bz8(CharSequence charSequence, Integer num) {
        this.a = charSequence;
        this.b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bz8)) {
            return false;
        }
        bz8 bz8Var = (bz8) obj;
        return tpa.f(this.a, bz8Var.a) && tpa.f(this.b, bz8Var.b);
    }

    public final int hashCode() {
        CharSequence charSequence = this.a;
        int iHashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
        Integer num = this.b;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "InputTextData(inputText=" + ((Object) this.a) + ", inputCursorPosition=" + this.b + ")";
    }
}
