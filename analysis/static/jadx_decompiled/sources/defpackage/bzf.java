package defpackage;

/* loaded from: classes2.dex */
public final class bzf implements kzf {
    public final String a;

    public bzf(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bzf) && tpa.f(this.a, ((bzf) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return zr6.l(new StringBuilder("OpenLinkExternal(url="), this.a, ")");
    }
}
