package defpackage;

/* loaded from: classes.dex */
public final class v90 {
    public final int a;
    public final Throwable b;

    public v90(Throwable th, int i) {
        this.a = i;
        this.b = th;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v90)) {
            return false;
        }
        v90 v90Var = (v90) obj;
        if (this.a == v90Var.a) {
            Throwable th = v90Var.b;
            Throwable th2 = this.b;
            if (th2 == null) {
                if (th == null) {
                    return true;
                }
            } else if (th2.equals(th)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (this.a ^ 1000003) * 1000003;
        Throwable th = this.b;
        return (th == null ? 0 : th.hashCode()) ^ i;
    }

    public final String toString() {
        return "StateError{code=" + this.a + ", cause=" + this.b + "}";
    }
}
