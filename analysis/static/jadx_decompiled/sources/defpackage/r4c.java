package defpackage;

import android.net.Uri;

/* loaded from: classes.dex */
public final class r4c {
    public final long a;
    public final long b;
    public final String c;
    public int d;

    public r4c(long j, String str, long j2) {
        this.c = str == null ? "" : str;
        this.a = j;
        this.b = j2;
    }

    public final r4c a(r4c r4cVar, String str) {
        long j;
        String strR = mr0.R(str, this.c);
        if (r4cVar == null || !strR.equals(mr0.R(str, r4cVar.c))) {
            return null;
        }
        long j2 = this.b;
        long j3 = r4cVar.b;
        if (j2 != -1) {
            long j4 = this.a;
            j = j2;
            if (j4 + j2 == r4cVar.a) {
                return new r4c(j4, strR, j3 != -1 ? j + j3 : -1L);
            }
        } else {
            j = j2;
        }
        if (j3 != -1) {
            long j5 = r4cVar.a;
            if (j5 + j3 == this.a) {
                return new r4c(j5, strR, j != -1 ? j3 + j : -1L);
            }
        }
        return null;
    }

    public final Uri b(String str) {
        return mr0.S(str, this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r4c.class != obj.getClass()) {
            return false;
        }
        r4c r4cVar = (r4c) obj;
        return this.a == r4cVar.a && this.b == r4cVar.b && this.c.equals(r4cVar.c);
    }

    public final int hashCode() {
        if (this.d == 0) {
            this.d = this.c.hashCode() + ((((527 + ((int) this.a)) * 31) + ((int) this.b)) * 31);
        }
        return this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RangedUri(referenceUri=");
        sb.append(this.c);
        sb.append(", start=");
        sb.append(this.a);
        sb.append(", length=");
        return zr6.k(sb, this.b, ")");
    }
}
