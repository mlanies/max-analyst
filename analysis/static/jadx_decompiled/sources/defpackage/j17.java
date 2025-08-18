package defpackage;

/* loaded from: classes.dex */
public final class j17 {
    public final h17 a;

    public j17(h17 h17Var) {
        this.a = h17Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j17)) {
            return false;
        }
        return this.a.equals(((j17) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}
