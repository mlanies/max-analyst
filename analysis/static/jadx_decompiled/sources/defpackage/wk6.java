package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class wk6 implements al6 {
    public final long a;
    public final long b;
    public final boolean c;
    public final List d;
    public final String e;

    public wk6(long j, long j2, boolean z, ArrayList arrayList, String str) {
        this.a = j;
        this.b = j2;
        this.c = z;
        this.d = arrayList;
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wk6)) {
            return false;
        }
        wk6 wk6Var = (wk6) obj;
        return this.a == wk6Var.a && this.b == wk6Var.b && this.c == wk6Var.c && tpa.f(this.d, wk6Var.d) && tpa.f(this.e, wk6Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + k7d.g(this.d, ms2.d(h4f.m(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Group(chatServerId=");
        sb.append(this.a);
        sb.append(", chatLocalId=");
        sb.append(this.b);
        sb.append(", isGroupCallAvailable=");
        sb.append(this.c);
        sb.append(", messagesIds=");
        sb.append(this.d);
        sb.append(", link=");
        return zr6.l(sb, this.e, ")");
    }
}
