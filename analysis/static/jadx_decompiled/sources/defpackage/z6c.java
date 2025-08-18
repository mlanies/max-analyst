package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class z6c {
    public final String a;
    public final long b;
    public final List c;

    public z6c(long j, String str, List list) {
        this.a = str;
        this.b = j;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z6c)) {
            return false;
        }
        z6c z6cVar = (z6c) obj;
        return tpa.f(this.a, z6cVar.a) && this.b == z6cVar.b && tpa.f(this.c, z6cVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + h4f.m(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReactionsSectionEntity(id=");
        sb.append(this.a);
        sb.append(", updateTime=");
        sb.append(this.b);
        sb.append(", reactions=");
        return au1.i(sb, this.c, ")");
    }
}
