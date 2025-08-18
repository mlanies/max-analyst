package defpackage;

/* loaded from: classes2.dex */
public final class lg2 extends pg2 {
    public final Long b;
    public final long c;
    public final boolean d;

    public lg2(Long l, long j, boolean z) {
        this.b = l;
        this.c = j;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lg2)) {
            return false;
        }
        lg2 lg2Var = (lg2) obj;
        return tpa.f(this.b, lg2Var.b) && this.c == lg2Var.c && this.d == lg2Var.d;
    }

    public final int hashCode() {
        Long l = this.b;
        return Boolean.hashCode(this.d) + h4f.m((l == null ? 0 : l.hashCode()) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShareAttach(attachId=");
        sb.append(this.b);
        sb.append(", messageId=");
        sb.append(this.c);
        sb.append(", isForwardAttach=");
        return au1.j(sb, this.d, ")");
    }
}
