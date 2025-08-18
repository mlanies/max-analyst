package defpackage;

/* loaded from: classes2.dex */
public final class y97 implements z97 {
    public final f1g a;
    public final c1g b;

    public y97(f1g f1gVar, c1g c1gVar) {
        this.a = f1gVar;
        this.b = c1gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y97)) {
            return false;
        }
        y97 y97Var = (y97) obj;
        return tpa.f(this.a, y97Var.a) && tpa.f(this.b, y97Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        c1g c1gVar = this.b;
        return iHashCode + (c1gVar == null ? 0 : c1gVar.hashCode());
    }

    public final String toString() {
        return "RequestShare(data=" + this.a + ", fileInfo=" + this.b + ")";
    }
}
