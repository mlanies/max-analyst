package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class bta {
    public final cta a;
    public final long b;
    public final String c = null;
    public final String d = null;
    public long e = -1;
    public long f = -1;
    public long g = -1;
    public List h;

    public bta(cta ctaVar, long j) {
        this.a = ctaVar;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bta)) {
            return false;
        }
        bta btaVar = (bta) obj;
        return this.a == btaVar.a && this.b == btaVar.b && tpa.f(this.c, btaVar.c) && tpa.f(this.d, btaVar.d);
    }

    public final int hashCode() {
        int iM = h4f.m(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iM + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PerfSpan(name=");
        sb.append(this.a);
        sb.append(", startTime=");
        sb.append(this.b);
        sb.append(", parentSpanName=");
        sb.append(this.c);
        sb.append(", prevSpanName=");
        return zr6.l(sb, this.d, ")");
    }
}
