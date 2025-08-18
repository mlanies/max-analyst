package defpackage;

/* loaded from: classes2.dex */
public final class oka implements qka {
    public final yka a;

    public oka(vka vkaVar) {
        this.a = vkaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oka) && tpa.f(this.a, ((oka) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Icon(icon=" + this.a + ")";
    }
}
