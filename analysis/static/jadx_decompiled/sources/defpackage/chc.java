package defpackage;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class chc implements hoc {
    public final long a;
    public final long b;

    public chc(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    @Override // defpackage.hoc
    public final boolean a() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || chc.class != obj.getClass()) {
            return false;
        }
        chc chcVar = (chc) obj;
        return this.a == chcVar.a && this.b == chcVar.b;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), Long.valueOf(this.b));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReportNetworkStat{timestamp=");
        sb.append(this.a);
        sb.append(", sendBitrate=");
        return z7b.i(sb, this.b, '}');
    }
}
