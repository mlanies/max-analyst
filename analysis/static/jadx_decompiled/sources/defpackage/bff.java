package defpackage;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class bff {
    public final int a;
    public final int b;
    public final int c;

    public bff(w3 w3Var) {
        this.a = w3Var.a;
        this.b = w3Var.b;
        this.c = w3Var.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || bff.class != obj.getClass()) {
            return false;
        }
        bff bffVar = (bff) obj;
        return this.a == bffVar.a && this.b == bffVar.b && this.c == bffVar.c;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), Integer.valueOf(this.b), au1.a(this.c));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoDisplayLayout{width=");
        sb.append(this.a);
        sb.append(", height=");
        sb.append(this.b);
        sb.append(", fit=");
        int i = this.c;
        sb.append(i != 1 ? i != 2 ? "null" : "CONTAIN" : "COVER");
        sb.append('}');
        return sb.toString();
    }
}
