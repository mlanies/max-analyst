package defpackage;

/* loaded from: classes2.dex */
public final class y9g {
    public final py5 a;
    public final String b;

    public y9g(py5 py5Var, String str) {
        this.a = py5Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || y9g.class != obj.getClass()) {
            return false;
        }
        y9g y9gVar = (y9g) obj;
        py5 py5Var = y9gVar.a;
        py5 py5Var2 = this.a;
        if (py5Var2 == null ? py5Var != null : !py5Var2.equals(py5Var)) {
            return false;
        }
        String str = y9gVar.b;
        String str2 = this.b;
        return str2 != null ? str2.equals(str) : str == null;
    }

    public final int hashCode() {
        py5 py5Var = this.a;
        int iHashCode = (py5Var != null ? py5Var.hashCode() : 0) * 31;
        String str = this.b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("YtFile{format=");
        sb.append(this.a);
        sb.append(", url='");
        return zr6.l(sb, this.b, "'}");
    }
}
