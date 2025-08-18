package defpackage;

/* loaded from: classes2.dex */
public final class cyf {
    public static final byf Companion = new byf();
    public final String a;

    public /* synthetic */ cyf(int i, String str) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            ju0.I(i, 1, ayf.a.d());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cyf) && tpa.f(this.a, ((cyf) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return zr6.l(new StringBuilder("WebAppOpenLinkRequest(url="), this.a, ")");
    }
}
