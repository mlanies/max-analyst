package defpackage;

/* loaded from: classes2.dex */
public final class f5g {
    public final e5g a;
    public final d5g b;
    public final z07 c;
    public final e d;

    public f5g(e5g e5gVar, d5g d5gVar, z07 z07Var, e eVar) {
        this.a = e5gVar;
        this.b = d5gVar;
        this.c = z07Var;
        this.d = eVar;
    }

    public final String a() {
        d5g d5gVar = this.b;
        String str = d5gVar != null ? d5gVar.a : null;
        return str == null ? "" : str;
    }

    public final boolean b() {
        return this.a == e5g.Y && this.c != null;
    }

    public final boolean c() {
        d5g d5gVar;
        return this.a == e5g.c && (d5gVar = this.b) != null && d5gVar.a.length() > 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f5g)) {
            return false;
        }
        f5g f5gVar = (f5g) obj;
        return this.a == f5gVar.a && tpa.f(this.b, f5gVar.b) && tpa.f(this.c, f5gVar.c) && tpa.f(this.d, f5gVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        d5g d5gVar = this.b;
        int iHashCode2 = (iHashCode + (d5gVar == null ? 0 : d5gVar.hashCode())) * 31;
        z07 z07Var = this.c;
        int iHashCode3 = (iHashCode2 + (z07Var == null ? 0 : z07Var.hashCode())) * 31;
        e eVar = this.d;
        return iHashCode3 + (eVar != null ? eVar.hashCode() : 0);
    }

    public final String toString() {
        return "Content(type=" + this.a + ", textContent=" + this.b + ", keyboard=" + this.c + ", icon=" + this.d + ")";
    }
}
