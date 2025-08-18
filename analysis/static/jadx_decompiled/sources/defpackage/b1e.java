package defpackage;

/* loaded from: classes2.dex */
public final class b1e {
    public final c1e a;

    public b1e(c1e c1eVar) {
        this.a = c1eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b1e) && tpa.f(this.a, ((b1e) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "StatesIconColors(disabled=" + this.a + ")";
    }
}
