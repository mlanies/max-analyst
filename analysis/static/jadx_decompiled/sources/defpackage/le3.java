package defpackage;

import java.util.Map;

/* loaded from: classes2.dex */
public final class le3 {
    public final String a;
    public final a8d b;
    public final Map c;
    public final gaf d;
    public final sa2 e;

    public /* synthetic */ le3(gaf gafVar) {
        this(null, null, null, gafVar, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof le3)) {
            return false;
        }
        le3 le3Var = (le3) obj;
        return tpa.f(this.a, le3Var.a) && tpa.f(this.b, le3Var.b) && tpa.f(this.c, le3Var.c) && tpa.f(this.d, le3Var.d) && tpa.f(this.e, le3Var.e);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        a8d a8dVar = this.b;
        int iHashCode2 = (iHashCode + (a8dVar == null ? 0 : a8dVar.hashCode())) * 31;
        Map map = this.c;
        int iHashCode3 = (iHashCode2 + (map == null ? 0 : map.hashCode())) * 31;
        gaf gafVar = this.d;
        int iHashCode4 = (iHashCode3 + (gafVar == null ? 0 : gafVar.hashCode())) * 31;
        sa2 sa2Var = this.e;
        return iHashCode4 + (sa2Var != null ? sa2Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb;
        Map map = this.c;
        if (map == null || map.isEmpty()) {
            sb = null;
        } else {
            sb = new StringBuilder();
            sb.append('[');
            for (Map.Entry entry : map.entrySet()) {
                long jLongValue = ((Number) entry.getKey()).longValue();
                xq2 xq2Var = (xq2) entry.getValue();
                sb.append('#');
                sb.append(jLongValue);
                sb.append(':');
                sb.append(xq2Var);
            }
            sb.append(']');
        }
        return "Configuration: user=" + this.d + ", hash=" + this.a + ", chatsCount=" + (map != null ? Integer.valueOf(map.size()) : null) + ", chats=" + ((Object) sb) + ", server=" + this.b;
    }

    public le3(String str, a8d a8dVar, Map map, gaf gafVar, sa2 sa2Var) {
        this.a = str;
        this.b = a8dVar;
        this.c = map;
        this.d = gafVar;
        this.e = sa2Var;
    }
}
