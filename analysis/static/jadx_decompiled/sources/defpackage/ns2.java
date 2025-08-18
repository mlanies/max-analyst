package defpackage;

/* loaded from: classes2.dex */
public final class ns2 {
    public final long a;
    public final CharSequence b;

    public ns2(CharSequence charSequence, long j) {
        this.a = j;
        this.b = charSequence;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ns2)) {
            return false;
        }
        ns2 ns2Var = (ns2) obj;
        return this.a == ns2Var.a && tpa.f(this.b, ns2Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "ChatTyping(chatId=" + this.a + ", typingText=" + ((Object) this.b) + ")";
    }
}
