package defpackage;

/* loaded from: classes2.dex */
public final class txf extends uxf {
    public final String a;

    public txf(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof txf) && tpa.f(this.a, ((txf) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return zr6.l(new StringBuilder("OpenLinkExternal(url="), this.a, ")");
    }
}
