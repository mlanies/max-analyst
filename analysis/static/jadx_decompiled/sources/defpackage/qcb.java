package defpackage;

/* loaded from: classes2.dex */
public final class qcb extends vcb {
    public final long b;

    public qcb(long j) {
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qcb) && this.b == ((qcb) obj).b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b);
    }

    public final String toString() {
        return zr6.k(new StringBuilder("OpenAddSubscribersAndUpdateBackstack(id="), this.b, ")");
    }
}
