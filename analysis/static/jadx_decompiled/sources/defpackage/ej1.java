package defpackage;

/* loaded from: classes.dex */
public final class ej1 extends wj1 {
    public final String D;

    public ej1(String str) {
        this.D = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ej1) && tpa.f(this.D, ((ej1) obj).D);
    }

    public final int hashCode() {
        return this.D.hashCode();
    }

    public final String toString() {
        return zr6.l(new StringBuilder("CopyCallLink(link="), this.D, ")");
    }
}
