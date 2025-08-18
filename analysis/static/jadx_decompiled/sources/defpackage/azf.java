package defpackage;

/* loaded from: classes2.dex */
public final class azf implements kzf {
    public final String a;

    public azf(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof azf) && tpa.f(this.a, ((azf) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return zr6.l(new StringBuilder("LoadUrl(url="), this.a, ")");
    }
}
