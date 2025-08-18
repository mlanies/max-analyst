package defpackage;

/* loaded from: classes2.dex */
public final class oyf {
    public static final nyf Companion = new nyf();
    public final String a;

    public /* synthetic */ oyf(int i, String str) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            ju0.I(i, 1, myf.a.d());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oyf) && tpa.f(this.a, ((oyf) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return zr6.l(new StringBuilder("WebAppRequestPhoneRequest(requestId="), this.a, ")");
    }
}
