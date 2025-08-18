package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class v69 {
    public final long a;
    public final long b;
    public final long c;
    public final List d;
    public final boolean e;
    public final boolean f;

    public v69(long j, long j2, long j3, List list, boolean z, boolean z2) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = list;
        this.e = z;
        this.f = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v69)) {
            return false;
        }
        v69 v69Var = (v69) obj;
        return this.a == v69Var.a && this.b == v69Var.b && this.c == v69Var.c && tpa.f(this.d, v69Var.d) && this.e == v69Var.e && this.f == v69Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + ms2.d(k7d.g(this.d, h4f.m(h4f.m(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessagesListWidgetArgs(chatId=");
        sb.append(this.a);
        sb.append(", loadMark=");
        sb.append(this.b);
        sb.append(", loadMessageId=");
        sb.append(this.c);
        sb.append(", highlights=");
        sb.append(this.d);
        sb.append(", shouldHighlightMessage=");
        sb.append(this.e);
        sb.append(", shouldSkipUnreadDecoration=");
        return au1.j(sb, this.f, ")");
    }
}
