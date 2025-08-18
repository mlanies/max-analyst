package defpackage;

/* loaded from: classes.dex */
public final class l3b {
    public final tm5 a;

    public l3b(tm5 tm5Var) {
        this.a = tm5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l3b) {
            return this.a.equals(((l3b) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
