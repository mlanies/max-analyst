package defpackage;

/* loaded from: classes2.dex */
public final class ca {
    public final long a;
    public final int b;
    public final long c;
    public final String d;

    public ca(int i, long j, long j2, String str) {
        this.a = j;
        this.b = i;
        this.c = j2;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ca)) {
            return false;
        }
        ca caVar = (ca) obj;
        return this.a == caVar.a && this.b == caVar.b && this.c == caVar.c && tpa.f(this.d, caVar.d);
    }

    public final int hashCode() {
        int iM = h4f.m(k7d.e(this.b, Long.hashCode(this.a) * 31, 31), 31, this.c);
        String str = this.d;
        return iM + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdminParticipant(id=");
        sb.append(this.a);
        sb.append(", permissions=");
        sb.append(this.b);
        sb.append(", inviterId=");
        sb.append(this.c);
        sb.append(", alias=");
        return zr6.l(sb, this.d, ")");
    }
}
