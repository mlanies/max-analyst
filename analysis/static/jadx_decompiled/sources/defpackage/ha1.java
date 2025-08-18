package defpackage;

/* loaded from: classes.dex */
public final class ha1 extends ka1 {
    public final CharSequence b;

    public ha1(CharSequence charSequence) {
        super(0);
        this.b = charSequence;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ha1) && tpa.f(this.b, ((ha1) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "ShareLink(link=" + ((Object) this.b) + ")";
    }
}
