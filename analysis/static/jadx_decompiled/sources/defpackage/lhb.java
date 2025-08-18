package defpackage;

/* loaded from: classes2.dex */
public final class lhb extends phb {
    public final String a;

    public lhb(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lhb) && tpa.f(this.a, ((lhb) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return zr6.l(new StringBuilder("CopyToClipboard(text="), this.a, ")");
    }
}
