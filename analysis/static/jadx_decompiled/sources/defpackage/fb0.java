package defpackage;

/* loaded from: classes.dex */
public final class fb0 {
    public final long a;
    public final hc0 b;
    public final ja0 c;

    public fb0(long j, hc0 hc0Var, ja0 ja0Var) {
        this.a = j;
        this.b = hc0Var;
        this.c = ja0Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fb0)) {
            return false;
        }
        fb0 fb0Var = (fb0) obj;
        return this.a == fb0Var.a && this.b.equals(fb0Var.b) && this.c.equals(fb0Var.c);
    }

    public final int hashCode() {
        long j = this.a;
        return this.c.hashCode() ^ ((((((int) ((j >>> 32) ^ j)) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003);
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.a + ", transportContext=" + this.b + ", event=" + this.c + "}";
    }
}
