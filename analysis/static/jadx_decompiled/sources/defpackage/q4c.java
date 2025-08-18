package defpackage;

import android.net.Uri;

/* loaded from: classes.dex */
public final class q4c {
    public final long a;
    public final long b;
    public final String c;
    public int d;

    public q4c(long j, String str, long j2) {
        this.c = str == null ? "" : str;
        this.a = j;
        this.b = j2;
    }

    public final q4c a(q4c q4cVar, String str) {
        long j;
        String strD = kq0.D(str, this.c);
        if (q4cVar == null || !strD.equals(kq0.D(str, q4cVar.c))) {
            return null;
        }
        long j2 = this.b;
        long j3 = q4cVar.b;
        if (j2 != -1) {
            long j4 = this.a;
            j = j2;
            if (j4 + j2 == q4cVar.a) {
                return new q4c(j4, strD, j3 != -1 ? j + j3 : -1L);
            }
        } else {
            j = j2;
        }
        if (j3 != -1) {
            long j5 = q4cVar.a;
            if (j5 + j3 == this.a) {
                return new q4c(j5, strD, j != -1 ? j3 + j : -1L);
            }
        }
        return null;
    }

    public final Uri b(String str) {
        return kq0.F(str, this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q4c.class != obj.getClass()) {
            return false;
        }
        q4c q4cVar = (q4c) obj;
        return this.a == q4cVar.a && this.b == q4cVar.b && this.c.equals(q4cVar.c);
    }

    public final int hashCode() {
        if (this.d == 0) {
            this.d = this.c.hashCode() + ((((527 + ((int) this.a)) * 31) + ((int) this.b)) * 31);
        }
        return this.d;
    }

    public final String toString() {
        String str = this.c;
        StringBuilder sb = new StringBuilder(rh4.e(81, str));
        sb.append("RangedUri(referenceUri=");
        sb.append(str);
        sb.append(", start=");
        sb.append(this.a);
        sb.append(", length=");
        return zr6.k(sb, this.b, ")");
    }
}
