package defpackage;

/* loaded from: classes2.dex */
public final class ocb extends vcb {
    public final String b;

    public ocb(String str) {
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ocb) && tpa.f(this.b, ((ocb) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return zr6.l(new StringBuilder("CopyToClipboard(link="), this.b, ")");
    }
}
