package defpackage;

/* loaded from: classes2.dex */
public final class kkb extends ka1 {
    public final String b;

    public kkb(String str) {
        super(11);
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kkb) && tpa.f(this.b, ((kkb) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return zr6.l(new StringBuilder("ExternalCallback(params="), this.b, ")");
    }
}
