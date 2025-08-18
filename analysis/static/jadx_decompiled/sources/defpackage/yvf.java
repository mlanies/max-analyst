package defpackage;

/* loaded from: classes2.dex */
public final class yvf {
    public static final xvf Companion = new xvf();
    public final String a;
    public final String b;

    public /* synthetic */ yvf(int i, String str, String str2) {
        if (3 != (i & 3)) {
            ju0.I(i, 3, wvf.a.d());
            throw null;
        }
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yvf)) {
            return false;
        }
        yvf yvfVar = (yvf) obj;
        return tpa.f(this.a, yvfVar.a) && tpa.f(this.b, yvfVar.b);
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WebAppBiometryOpenSettingsRequest(queryId=");
        sb.append(this.a);
        sb.append(", requestId=");
        return zr6.l(sb, this.b, ")");
    }
}
