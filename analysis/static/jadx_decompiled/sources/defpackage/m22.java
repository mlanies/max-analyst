package defpackage;

/* loaded from: classes2.dex */
public final class m22 {
    public final int a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public m22(int i, boolean z, boolean z2, boolean z3) {
        this.a = i;
        this.b = z;
        this.c = z2;
        this.d = z3;
    }

    public static m22 a(m22 m22Var, boolean z, boolean z2, boolean z3, int i) {
        if ((i & 8) != 0) {
            z3 = m22Var.d;
        }
        return new m22(m22Var.a, z, z2, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m22)) {
            return false;
        }
        m22 m22Var = (m22) obj;
        return this.a == m22Var.a && this.b == m22Var.b && this.c == m22Var.c && this.d == m22Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ms2.d(ms2.d(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return "ChangeLinkScreenState(title=" + this.a + ", hasChanges=" + this.b + ", enabledButton=" + this.c + ", hasProgress=" + this.d + ")";
    }
}
