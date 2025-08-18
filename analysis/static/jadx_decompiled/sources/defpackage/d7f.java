package defpackage;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class d7f {
    public final String a;
    public final long b;
    public final int c;
    public final String d;

    public d7f(gk8 gk8Var) {
        this.a = (String) gk8Var.c;
        this.b = gk8Var.a;
        this.c = gk8Var.b;
        this.d = (String) gk8Var.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d7f.class != obj.getClass()) {
            return false;
        }
        d7f d7fVar = (d7f) obj;
        if (this.b != d7fVar.b) {
            return false;
        }
        String str = d7fVar.a;
        String str2 = this.a;
        if (str2 == null ? str == null : str2.equals(str)) {
            return Objects.equals(this.d, d7fVar.d) && this.c == d7fVar.c;
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = str != null ? str.hashCode() : 0;
        long j = this.b;
        int i = ((iHashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        int i2 = this.c;
        int iS = (i + (i2 != 0 ? au1.s(i2) : 0)) * 31;
        String str2 = this.d;
        return iS + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "UploadData{path='" + this.a + "'attachLocalId='" + this.d + "', lastModified=" + this.b + ", uploadType=" + h4f.t(this.c) + '}';
    }
}
