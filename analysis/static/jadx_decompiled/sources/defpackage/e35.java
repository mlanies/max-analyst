package defpackage;

/* loaded from: classes2.dex */
public final class e35 {
    public static final a35 Companion = new a35();
    public final String a;
    public final d35 b;

    public /* synthetic */ e35(int i, String str, d35 d35Var) {
        if (3 != (i & 3)) {
            ju0.I(i, 3, z25.a.d());
            throw null;
        }
        this.a = str;
        this.b = d35Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e35)) {
            return false;
        }
        e35 e35Var = (e35) obj;
        return tpa.f(this.a, e35Var.a) && tpa.f(this.b, e35Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ErrorResponse(requestId=" + this.a + ", error=" + this.b + ")";
    }

    public e35(String str, d35 d35Var) {
        this.a = str;
        this.b = d35Var;
    }
}
