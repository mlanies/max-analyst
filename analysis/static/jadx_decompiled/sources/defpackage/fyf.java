package defpackage;

/* loaded from: classes2.dex */
public final class fyf {
    public static final eyf Companion = new eyf();
    public final String a;

    public /* synthetic */ fyf(int i, String str) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            ju0.I(i, 1, dyf.a.d());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fyf) && tpa.f(this.a, ((fyf) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return zr6.l(new StringBuilder("WebAppOpenMaxLinkRequest(url="), this.a, ")");
    }
}
