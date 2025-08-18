package defpackage;

import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class n7d {
    public static final /* synthetic */ int h = 0;
    public final long a;
    public final String b;
    public final List c;
    public final List d;
    public final Long e;
    public final Long f;
    public final long g;

    public n7d(long j, String str, List list, List list2, Long l, Long l2, long j2) {
        this.a = j;
        this.b = str;
        this.c = list;
        this.d = list2;
        this.e = l;
        this.f = l2;
        this.g = j2;
    }

    public final Map a() {
        String str = this.b;
        if (!oag.u(str)) {
            str = null;
        }
        kpa kpaVar = str != null ? new kpa("text", str) : null;
        List list = this.c;
        if (!(!list.isEmpty())) {
            list = null;
        }
        kpa kpaVar2 = list != null ? new kpa("attaches", list) : null;
        List list2 = this.d;
        if (!(!list2.isEmpty())) {
            list2 = null;
        }
        kpa kpaVar3 = list2 != null ? new kpa("elements", list2) : null;
        Long l = this.e;
        kpa kpaVar4 = l != null ? new kpa("replyTo", Long.valueOf(l.longValue())) : null;
        Long l2 = this.f;
        kpa kpaVar5 = l2 != null ? new kpa("editOn", Long.valueOf(l2.longValue())) : null;
        long j = this.g;
        Long lValueOf = Long.valueOf(j);
        if (j == 0) {
            lValueOf = null;
        }
        kpa kpaVar6 = lValueOf != null ? new kpa("saveTime", Long.valueOf(lValueOf.longValue())) : null;
        long j2 = this.a;
        Long lValueOf2 = Long.valueOf(j2);
        if (j2 == 0) {
            lValueOf2 = null;
        }
        return mz7.c0(ys.d0(new kpa[]{kpaVar, kpaVar2, kpaVar3, kpaVar4, kpaVar5, kpaVar6, lValueOf2 != null ? new kpa("cid", Long.valueOf(lValueOf2.longValue())) : null}));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n7d)) {
            return false;
        }
        n7d n7dVar = (n7d) obj;
        return this.a == n7dVar.a && tpa.f(this.b, n7dVar.b) && tpa.f(this.c, n7dVar.c) && tpa.f(this.d, n7dVar.d) && tpa.f(this.e, n7dVar.e) && tpa.f(this.f, n7dVar.f) && this.g == n7dVar.g;
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.a) * 31;
        String str = this.b;
        int iG = k7d.g(this.d, k7d.g(this.c, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31), 31);
        Long l = this.e;
        int iHashCode2 = (iG + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.f;
        return Long.hashCode(this.g) + ((iHashCode2 + (l2 != null ? l2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ServerDraft(text=***, attaches=");
        sb.append(this.c);
        sb.append(", elements=");
        sb.append(this.d);
        sb.append(", replyTo=");
        sb.append(this.e);
        sb.append(", editOn=");
        sb.append(this.f);
        sb.append(", saveTime=");
        return zr6.k(sb, this.g, ")");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ n7d(String str, List list, Long l, Long l2, int i) {
        String str2 = (i & 2) != 0 ? null : str;
        nz4 nz4Var = nz4.a;
        this(0L, str2, nz4Var, (i & 8) != 0 ? nz4Var : list, (i & 16) != 0 ? null : l, (i & 32) != 0 ? null : l2, 0L);
    }
}
