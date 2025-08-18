package defpackage;

import java.util.Set;

/* loaded from: classes2.dex */
public final class zc8 {
    public final long a;
    public final long b;
    public final Set c;
    public final long d;

    public zc8(long j, long j2, Set set, long j3) {
        this.a = j;
        this.b = j2;
        this.c = set;
        this.d = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zc8)) {
            return false;
        }
        zc8 zc8Var = (zc8) obj;
        return this.a == zc8Var.a && this.b == zc8Var.b && tpa.f(this.c, zc8Var.c) && this.d == zc8Var.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + ((this.c.hashCode() + h4f.m(Long.hashCode(this.a) * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MediaMarkers(backward=");
        sb.append(this.a);
        sb.append(", forward=");
        sb.append(this.b);
        sb.append(", types=");
        sb.append(this.c);
        sb.append(", chatId=");
        return zr6.k(sb, this.d, ")");
    }
}
