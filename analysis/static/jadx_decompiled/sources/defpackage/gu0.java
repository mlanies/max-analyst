package defpackage;

/* loaded from: classes2.dex */
public final class gu0 {
    public final long a;
    public final boolean b;

    public gu0(long j, boolean z) {
        this.a = j;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gu0)) {
            return false;
        }
        gu0 gu0Var = (gu0) obj;
        return this.a == gu0Var.a && this.b == gu0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BufferingState(messageId=");
        sb.append(this.a);
        sb.append(", isBuffering=");
        return au1.j(sb, this.b, ")");
    }
}
