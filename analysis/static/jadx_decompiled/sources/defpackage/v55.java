package defpackage;

/* loaded from: classes2.dex */
public final class v55 {
    public int a;
    public int b;
    public int c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || v55.class != obj.getClass()) {
            return false;
        }
        v55 v55Var = (v55) obj;
        return this.a == v55Var.a && this.b == v55Var.b && this.c == v55Var.c;
    }

    public final int hashCode() {
        return (((this.a * 31) + this.b) * 31) + this.c;
    }
}
