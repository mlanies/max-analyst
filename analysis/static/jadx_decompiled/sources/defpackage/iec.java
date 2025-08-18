package defpackage;

/* loaded from: classes2.dex */
public final class iec implements kx3 {
    public final xi9 a;

    public iec(xi9 xi9Var) {
        this.a = xi9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iec) && tpa.f(this.a, ((iec) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ReentrantMutexContextKey(mutex=" + this.a + ")";
    }
}
