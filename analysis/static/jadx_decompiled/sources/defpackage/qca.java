package defpackage;

/* loaded from: classes2.dex */
public final class qca {
    public final String a;
    public final qec b;
    public final qec c;
    public final int d;
    public final int e;

    public qca(String str, qec qecVar, qec qecVar2, int i, int i2) {
        qecVar = (i2 & 2) != 0 ? null : qecVar;
        qecVar2 = (i2 & 4) != 0 ? null : qecVar2;
        i = (i2 & 16) != 0 ? 8192 : i;
        this.a = str;
        this.b = qecVar;
        this.c = qecVar2;
        this.d = 50;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qca)) {
            return false;
        }
        qca qcaVar = (qca) obj;
        return tpa.f(this.a, qcaVar.a) && tpa.f(this.b, qcaVar.b) && tpa.f(this.c, qcaVar.c) && this.d == qcaVar.d && this.e == qcaVar.e;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        qec qecVar = this.b;
        int iHashCode2 = (iHashCode + (qecVar == null ? 0 : qecVar.hashCode())) * 31;
        qec qecVar2 = this.c;
        return Integer.hashCode(this.e) + k7d.e(this.d, (iHashCode2 + (qecVar2 != null ? qecVar2.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Target(logName=");
        sb.append(this.a);
        sb.append(", includedTags=");
        sb.append(this.b);
        sb.append(", excludedTags=");
        sb.append(this.c);
        sb.append(", maxBufferEntriesCount=");
        sb.append(this.d);
        sb.append(", sizeLimitKb=");
        return zr6.j(sb, this.e, ")");
    }
}
