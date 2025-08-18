package defpackage;

/* loaded from: classes2.dex */
public final class ddf implements edf {
    public final long a;
    public final wgf b;

    public ddf(long j, wgf wgfVar) {
        this.a = j;
        this.b = wgfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ddf)) {
            return false;
        }
        ddf ddfVar = (ddf) obj;
        return this.a == ddfVar.a && tpa.f(this.b, ddfVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "StartVideoMessage(msgId=" + this.a + ", attachModel=" + this.b + ")";
    }
}
