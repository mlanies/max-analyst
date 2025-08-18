package defpackage;

/* loaded from: classes2.dex */
public final class b1g {
    public static final a1g Companion = new a1g();
    public final String a;
    public final boolean b;

    public /* synthetic */ b1g(String str, int i, boolean z) {
        if (3 != (i & 3)) {
            ju0.I(i, 3, z0g.a.d());
            throw null;
        }
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b1g)) {
            return false;
        }
        b1g b1gVar = (b1g) obj;
        return tpa.f(this.a, b1gVar.a) && this.b == b1gVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "WebAppSetupScreenCaptureBehaviorResponse(requestId=" + this.a + ", isScreenCaptureEnabled=" + this.b + ")";
    }

    public b1g(String str, boolean z) {
        this.a = str;
        this.b = z;
    }
}
