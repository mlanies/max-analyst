package defpackage;

/* loaded from: classes2.dex */
public final class ryf {
    public static final qyf Companion = new qyf();
    public final String a;
    public final String b;

    public /* synthetic */ ryf(int i, String str, String str2) {
        if (3 != (i & 3)) {
            ju0.I(i, 3, pyf.a.d());
            throw null;
        }
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ryf)) {
            return false;
        }
        ryf ryfVar = (ryf) obj;
        return tpa.f(this.a, ryfVar.a) && tpa.f(this.b, ryfVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WebAppRequestPhoneResponse(requestId=");
        sb.append(this.a);
        sb.append(", phone=");
        return zr6.l(sb, this.b, ")");
    }

    public ryf(String str, String str2) {
        this.a = str;
        this.b = str2;
    }
}
