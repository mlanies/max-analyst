package defpackage;

/* loaded from: classes2.dex */
public final class avf {
    public static final zuf Companion = new zuf();
    public final String a;
    public final String b;

    public /* synthetic */ avf(int i, String str, String str2) {
        if (3 != (i & 3)) {
            ju0.I(i, 3, yuf.a.d());
            throw null;
        }
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof avf)) {
            return false;
        }
        avf avfVar = (avf) obj;
        return tpa.f(this.a, avfVar.a) && tpa.f(this.b, avfVar.b);
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WebAppBiometryGetInfoRequest(queryId=");
        sb.append(this.a);
        sb.append(", requestId=");
        return zr6.l(sb, this.b, ")");
    }
}
