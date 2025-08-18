package defpackage;

/* loaded from: classes2.dex */
public final class ov extends qv {
    public final long a;
    public final boolean b;

    public ov(long j, boolean z) {
        this.a = j;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ov)) {
            return false;
        }
        ov ovVar = (ov) obj;
        return this.a == ovVar.a && this.b == ovVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LoadingNext(time=");
        sb.append(this.a);
        sb.append(", isRemoteCaused=");
        return au1.j(sb, this.b, ")");
    }
}
