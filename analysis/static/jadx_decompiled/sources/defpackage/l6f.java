package defpackage;

import java.util.Set;

/* loaded from: classes2.dex */
public final class l6f extends pi0 {
    public final boolean X;
    public final long b;
    public final long c;
    public final Set o;

    public l6f(long j, long j2) {
        this(j, j2, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l6f)) {
            return false;
        }
        l6f l6fVar = (l6f) obj;
        return this.b == l6fVar.b && this.c == l6fVar.c && tpa.f(this.o, l6fVar.o) && this.X == l6fVar.X;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.X) + ((this.o.hashCode() + h4f.m(Long.hashCode(this.b) * 31, 31, this.c)) * 31);
    }

    @Override // defpackage.pi0
    public final String toString() {
        StringBuilder sb = new StringBuilder("UpdateMessageEvent(chatId=");
        sb.append(this.b);
        sb.append(", messageId=");
        sb.append(this.c);
        sb.append(", reactionsToAnimate=");
        sb.append(this.o);
        sb.append(", reactionsChanged=");
        return au1.j(sb, this.X, ")");
    }

    public /* synthetic */ l6f(long j, long j2, int i) {
        this(j, j2, wz4.a, false);
    }

    public l6f(long j, long j2, Set set, boolean z) {
        this.b = j;
        this.c = j2;
        this.o = set;
        this.X = z;
    }
}
