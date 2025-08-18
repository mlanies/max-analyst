package defpackage;

/* loaded from: classes2.dex */
public final class xy8 {
    public final long a;
    public final CharSequence b;
    public final dz8 c;
    public final boolean d;
    public final boolean e;

    public xy8(long j, CharSequence charSequence, dz8 dz8Var, boolean z, boolean z2) {
        this.a = j;
        this.b = charSequence;
        this.c = dz8Var;
        this.d = z;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xy8)) {
            return false;
        }
        xy8 xy8Var = (xy8) obj;
        return this.a == xy8Var.a && tpa.f(this.b, xy8Var.b) && tpa.f(this.c, xy8Var.c) && this.d == xy8Var.d && this.e == xy8Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ms2.d((this.c.hashCode() + rh4.f(this.b, Long.hashCode(this.a) * 31, 31)) * 31, 31, this.d);
    }

    public final String toString() {
        return "EditMessageData(messageId=" + this.a + ", messageText=" + ((Object) this.b) + ", quoteData=" + this.c + ", hasMediaAttaches=" + this.d + ", shouldInsertOriginalText=" + this.e + ")";
    }
}
