package defpackage;

/* loaded from: classes.dex */
public final class ga1 extends ka1 {
    public final CharSequence b;

    public ga1(CharSequence charSequence) {
        super(0);
        this.b = charSequence;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ga1) && tpa.f(this.b, ((ga1) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "SendToChatLink(link=" + ((Object) this.b) + ")";
    }
}
