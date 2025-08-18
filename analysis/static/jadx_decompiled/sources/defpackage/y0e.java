package defpackage;

/* loaded from: classes2.dex */
public final class y0e {
    public final x0e a;
    public final z0e b;

    public y0e(x0e x0eVar, z0e z0eVar) {
        this.a = x0eVar;
        this.b = z0eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y0e)) {
            return false;
        }
        y0e y0eVar = (y0e) obj;
        return tpa.f(this.a, y0eVar.a) && tpa.f(this.b, y0eVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "StatesBackgroundColors(active=" + this.a + ", disabled=" + this.b + ")";
    }
}
