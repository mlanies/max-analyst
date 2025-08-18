package defpackage;

/* loaded from: classes2.dex */
public final class jg2 extends pg2 {
    public final String b;

    public jg2(String str) {
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jg2) && tpa.f(this.b, ((jg2) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return zr6.l(new StringBuilder("OpenLink(attachUrl="), this.b, ")");
    }
}
