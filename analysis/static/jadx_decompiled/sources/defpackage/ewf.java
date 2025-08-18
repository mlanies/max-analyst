package defpackage;

/* loaded from: classes2.dex */
public final class ewf {
    public static final dwf Companion = new dwf();
    public final String a;
    public final boolean b;

    public /* synthetic */ ewf(String str, int i, boolean z) {
        if (3 != (i & 3)) {
            ju0.I(i, 3, cwf.a.d());
            throw null;
        }
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ewf)) {
            return false;
        }
        ewf ewfVar = (ewf) obj;
        return tpa.f(this.a, ewfVar.a) && this.b == ewfVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "WebAppBiometryUnavailableResponse(requestId=" + this.a + ", available=" + this.b + ")";
    }

    public ewf(String str) {
        this.a = str;
        this.b = false;
    }
}
