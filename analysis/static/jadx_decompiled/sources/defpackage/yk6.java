package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class yk6 implements al6 {
    public final long a;
    public final long b;
    public final List c;

    public yk6(long j, long j2, ArrayList arrayList) {
        this.a = j;
        this.b = j2;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yk6)) {
            return false;
        }
        yk6 yk6Var = (yk6) obj;
        return this.a == yk6Var.a && this.b == yk6Var.b && tpa.f(this.c, yk6Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + h4f.m(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OneToOne(opponentId=");
        sb.append(this.a);
        sb.append(", chatId=");
        sb.append(this.b);
        sb.append(", messagesIds=");
        return au1.i(sb, this.c, ")");
    }
}
