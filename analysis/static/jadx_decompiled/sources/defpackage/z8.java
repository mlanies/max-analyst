package defpackage;

/* loaded from: classes.dex */
public final class z8 {
    public final long a;
    public final long b;

    public z8(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z8)) {
            return false;
        }
        z8 z8Var = (z8) obj;
        return this.a == z8Var.a && this.b == z8Var.b;
    }

    public final int hashCode() {
        return (((int) this.a) * 31) + ((int) this.b);
    }
}
