package defpackage;

/* loaded from: classes2.dex */
public final class htf {
    public static final gtf Companion = new gtf();
    public static final cc7[] d = {null, null, wbe.Companion.serializer()};
    public final String a;
    public final String b;
    public final wbe c;

    public /* synthetic */ htf(int i, String str, String str2, wbe wbeVar) {
        if (7 != (i & 7)) {
            ju0.I(i, 7, ftf.a.d());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = wbeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof htf)) {
            return false;
        }
        htf htfVar = (htf) obj;
        return tpa.f(this.a, htfVar.a) && tpa.f(this.b, htfVar.b) && this.c == htfVar.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + rh4.d(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "WebAppBiometryAuthResponse(requestId=" + this.a + ", token=" + this.b + ", status=" + this.c + ")";
    }

    public htf(String str, String str2) {
        wbe wbeVar = wbe.Y;
        this.a = str;
        this.b = str2;
        this.c = wbeVar;
    }
}
