package defpackage;

/* loaded from: classes2.dex */
public final class abg {
    public final long a;
    public final z9b b;

    public abg(long j, z9b z9bVar) {
        this.a = j;
        this.b = z9bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof abg)) {
            return false;
        }
        abg abgVar = (abg) obj;
        return this.a == abgVar.a && tpa.f(this.b, abgVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "State(uptime=" + this.a + ", processorInfo=" + this.b + ")";
    }
}
