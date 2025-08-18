package defpackage;

/* loaded from: classes.dex */
public final class xoa implements f23 {
    public final Class a;

    public xoa(Class cls) {
        this.a = cls;
    }

    @Override // defpackage.f23
    public final Class a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof xoa) {
            if (tpa.f(this.a, ((xoa) obj).a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString() + " (Kotlin reflection is not available)";
    }
}
