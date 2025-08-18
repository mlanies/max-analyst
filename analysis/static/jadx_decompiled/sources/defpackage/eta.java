package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class eta {
    public final List a;
    public final long b;

    public eta(long j, List list) {
        this.a = list;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eta)) {
            return false;
        }
        eta etaVar = (eta) obj;
        return tpa.f(this.a, etaVar.a) && this.b == etaVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PerfSpansPreparedForEvent(spans=" + this.a + ", totalDuration=" + this.b + ")";
    }
}
