package defpackage;

/* loaded from: classes2.dex */
public final class hac implements iac {
    public final bac a;
    public final jqe b;

    public hac(bac bacVar, eqe eqeVar) {
        this.a = bacVar;
        this.b = eqeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hac)) {
            return false;
        }
        hac hacVar = (hac) obj;
        return this.a == hacVar.a && tpa.f(this.b, hacVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ShowTooltip(recordControlType=" + this.a + ", textSource=" + this.b + ")";
    }
}
