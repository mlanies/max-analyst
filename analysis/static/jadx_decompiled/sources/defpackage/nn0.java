package defpackage;

/* loaded from: classes2.dex */
public final class nn0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public nn0(boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nn0)) {
            return false;
        }
        nn0 nn0Var = (nn0) obj;
        return this.a == nn0Var.a && this.b == nn0Var.b && this.c == nn0Var.c && this.d == nn0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ms2.d(ms2.d(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BiometryInfo(available=");
        sb.append(this.a);
        sb.append(", accessRequested=");
        sb.append(this.b);
        sb.append(", accessGranted=");
        sb.append(this.c);
        sb.append(", tokenSaved=");
        return au1.j(sb, this.d, ")");
    }
}
