package defpackage;

/* loaded from: classes2.dex */
public final class bma extends cma {
    public final long a;
    public final String b;

    public bma(long j, String str) {
        this.a = j;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bma)) {
            return false;
        }
        bma bmaVar = (bma) obj;
        return this.a == bmaVar.a && tpa.f(this.b, bmaVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OpenImage(messageId=");
        sb.append(this.a);
        sb.append(", attachLocalId=");
        return zr6.l(sb, this.b, ")");
    }
}
