package defpackage;

/* loaded from: classes2.dex */
public final class ty7 {
    public final long a;
    public final i08 b;
    public final boolean c;

    public ty7(long j, i08 i08Var, boolean z) {
        this.a = j;
        this.b = i08Var;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ty7.class != obj.getClass()) {
            return false;
        }
        ty7 ty7Var = (ty7) obj;
        return this.a == ty7Var.a && this.c == ty7Var.c && this.b == ty7Var.b;
    }

    public final int hashCode() {
        long j = this.a;
        return ((this.b.hashCode() + (((int) (j ^ (j >>> 32))) * 31)) * 31) + (this.c ? 1 : 0);
    }

    public final String toString() {
        return "Key{contactId=" + this.a + ", markerWeight=" + this.b + ", active=" + this.c + '}';
    }
}
