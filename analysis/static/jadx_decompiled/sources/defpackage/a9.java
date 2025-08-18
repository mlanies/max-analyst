package defpackage;

/* loaded from: classes.dex */
public final class a9 {
    public final long a;
    public final long b;

    public a9(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a9)) {
            return false;
        }
        a9 a9Var = (a9) obj;
        return this.a == a9Var.a && this.b == a9Var.b;
    }

    public final int hashCode() {
        return (((int) this.a) * 31) + ((int) this.b);
    }
}
