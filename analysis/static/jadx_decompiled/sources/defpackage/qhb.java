package defpackage;

/* loaded from: classes2.dex */
public final class qhb extends ka1 {
    public final String b;

    public qhb(String str) {
        super(10);
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qhb) && tpa.f(this.b, ((qhb) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return zr6.l(new StringBuilder("SendLink(link="), this.b, ")");
    }
}
