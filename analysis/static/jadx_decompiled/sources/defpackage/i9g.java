package defpackage;

/* loaded from: classes2.dex */
public final class i9g {
    public final h9g a;
    public final j9g b;
    public final k9g c;
    public final l9g d;

    public i9g(h9g h9gVar, j9g j9gVar, k9g k9gVar, l9g l9gVar) {
        this.a = h9gVar;
        this.b = j9gVar;
        this.c = k9gVar;
        this.d = l9gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i9g)) {
            return false;
        }
        i9g i9gVar = (i9g) obj;
        return tpa.f(this.a, i9gVar.a) && tpa.f(this.b, i9gVar.b) && tpa.f(this.c, i9gVar.c) && tpa.f(this.d, i9gVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "WritebarColors(background=" + this.a + ", icon=" + this.b + ", stroke=" + this.c + ", text=" + this.d + ")";
    }
}
