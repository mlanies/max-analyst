package defpackage;

/* loaded from: classes2.dex */
public final class xla extends wm9 {
    public final String b;

    public xla(String str) {
        super(e5f.a);
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xla) && tpa.f(this.b, ((xla) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return zr6.l(new StringBuilder("OpenExternalLink(url="), this.b, ")");
    }
}
