package defpackage;

/* loaded from: classes2.dex */
public final class qzd {
    public final bz a;
    public final d5g b;

    public qzd(bz bzVar, d5g d5gVar) {
        this.a = bzVar;
        this.b = d5gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qzd)) {
            return false;
        }
        qzd qzdVar = (qzd) obj;
        return tpa.f(this.a, qzdVar.a) && tpa.f(this.b, qzdVar.b);
    }

    public final int hashCode() {
        bz bzVar = this.a;
        return this.b.hashCode() + ((bzVar == null ? 0 : bzVar.hashCode()) * 31);
    }

    public final String toString() {
        return "StartMessage(media=" + this.a + ", text=" + this.b + ")";
    }
}
