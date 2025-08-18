package defpackage;

/* loaded from: classes2.dex */
public final class a1e {
    public final y0e a;
    public final b1e b;
    public final e1e c;

    public a1e(y0e y0eVar, b1e b1eVar, e1e e1eVar) {
        this.a = y0eVar;
        this.b = b1eVar;
        this.c = e1eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a1e)) {
            return false;
        }
        a1e a1eVar = (a1e) obj;
        return tpa.f(this.a, a1eVar.a) && tpa.f(this.b, a1eVar.b) && tpa.f(this.c, a1eVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.a.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "StatesColors(background=" + this.a + ", icon=" + this.b + ", text=" + this.c + ")";
    }
}
