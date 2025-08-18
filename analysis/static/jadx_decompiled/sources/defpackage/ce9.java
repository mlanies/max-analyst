package defpackage;

/* loaded from: classes2.dex */
public final class ce9 {
    public final String a;
    public final int b;
    public final int c;
    public final int d;

    public ce9(int i, String str, int i2, int i3) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ce9.class != obj.getClass()) {
            return false;
        }
        ce9 ce9Var = (ce9) obj;
        if (this.b == ce9Var.b && this.c == ce9Var.c && this.d == ce9Var.d) {
            return this.a.equals(ce9Var.a);
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }
}
