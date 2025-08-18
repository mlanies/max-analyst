package defpackage;

/* loaded from: classes2.dex */
public final class fde {
    public final ybe a;
    public final boolean b;

    public fde(ybe ybeVar, boolean z) {
        this.a = ybeVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fde)) {
            return false;
        }
        fde fdeVar = (fde) obj;
        return tpa.f(this.a, fdeVar.a) && this.b == fdeVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Item(suggest=" + this.a + ", fromContacts=" + this.b + ")";
    }
}
