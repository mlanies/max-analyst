package defpackage;

/* loaded from: classes2.dex */
public final class okb extends ka1 {
    public final String b;

    public okb(String str) {
        super(11);
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof okb) && tpa.f(this.b, ((okb) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return zr6.l(new StringBuilder("OpenExternalLink(link="), this.b, ")");
    }
}
