package defpackage;

/* loaded from: classes.dex */
public final class fa1 extends ka1 {
    public final CharSequence b;

    public fa1(CharSequence charSequence) {
        super(0);
        this.b = charSequence;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fa1) && tpa.f(this.b, ((fa1) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "CopyLink(link=" + ((Object) this.b) + ")";
    }
}
