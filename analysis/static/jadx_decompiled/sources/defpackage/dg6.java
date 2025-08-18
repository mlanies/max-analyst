package defpackage;

/* loaded from: classes.dex */
public final class dg6 {
    public final int a;
    public final int b;

    public dg6(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final int a() {
        return this.b - this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || dg6.class != obj.getClass()) {
            return false;
        }
        dg6 dg6Var = (dg6) obj;
        return this.b == dg6Var.b && this.a == dg6Var.a;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        sb.append(this.a);
        sb.append(", ");
        return zr6.j(sb, this.b, "]");
    }
}
