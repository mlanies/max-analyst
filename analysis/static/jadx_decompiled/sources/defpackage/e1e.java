package defpackage;

/* loaded from: classes2.dex */
public final class e1e {
    public final d1e a;
    public final f1e b;

    public e1e(d1e d1eVar, f1e f1eVar) {
        this.a = d1eVar;
        this.b = f1eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e1e)) {
            return false;
        }
        e1e e1eVar = (e1e) obj;
        return tpa.f(this.a, e1eVar.a) && tpa.f(this.b, e1eVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "StatesTextColors(active=" + this.a + ", disabled=" + this.b + ")";
    }
}
