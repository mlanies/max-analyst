package defpackage;

/* loaded from: classes2.dex */
public final class y0g {
    public static final x0g Companion = new x0g();
    public final String a;
    public final boolean b;

    public /* synthetic */ y0g(String str, int i, boolean z) {
        if (3 != (i & 3)) {
            ju0.I(i, 3, w0g.a.d());
            throw null;
        }
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y0g)) {
            return false;
        }
        y0g y0gVar = (y0g) obj;
        return tpa.f(this.a, y0gVar.a) && this.b == y0gVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "WebAppSetupScreenCaptureBehaviorRequest(requestId=" + this.a + ", isScreenCaptureEnabled=" + this.b + ")";
    }
}
