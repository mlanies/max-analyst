package defpackage;

/* loaded from: classes2.dex */
public final class s0g {
    public static final r0g Companion = new r0g();
    public final boolean a;

    public /* synthetic */ s0g(int i, boolean z) {
        if (1 == (i & 1)) {
            this.a = z;
        } else {
            ju0.I(i, 1, q0g.a.d());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s0g) && this.a == ((s0g) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return au1.j(new StringBuilder("WebAppSetupBackButtonRequest(isVisible="), this.a, ")");
    }
}
