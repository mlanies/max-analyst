package defpackage;

/* loaded from: classes2.dex */
public final class sf0 {
    public final boolean a;
    public final boolean b;

    public sf0(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public static void a(boolean z, a4c a4cVar, String str, String str2) {
        if (z) {
            a4cVar.log("BadNetworkIndicatorConfig", rh4.k("[", str, "]: ", str2));
        }
    }

    public final void b(a4c a4cVar, String str, String str2) {
        a(this.a, a4cVar, str, str2);
    }

    public final void c(a4c a4cVar, String str, String str2) {
        a(this.b, a4cVar, str, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sf0)) {
            return false;
        }
        sf0 sf0Var = (sf0) obj;
        return this.a == sf0Var.a && this.b == sf0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "DebugLoggingConfig(debugLogging=" + this.a + ", debugVerboseLogging=" + this.b + ")";
    }
}
