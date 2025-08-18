package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class gk6 {
    public final long a;
    public final long b;
    public final long c;
    public final List d;

    public gk6(long j, long j2, long j3, List list) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gk6)) {
            return false;
        }
        gk6 gk6Var = (gk6) obj;
        return this.a == gk6Var.a && this.b == gk6Var.b && this.c == gk6Var.c && tpa.f(this.d, gk6Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + h4f.m(h4f.m(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HighlightMessage(ts=");
        sb.append(this.a);
        sb.append(", localId=");
        sb.append(this.b);
        sb.append(", serverId=");
        sb.append(this.c);
        sb.append(", highlight=");
        return au1.i(sb, this.d, ")");
    }
}
