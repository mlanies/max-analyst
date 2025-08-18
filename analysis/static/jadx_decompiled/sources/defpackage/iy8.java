package defpackage;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class iy8 {
    public final nw8 a;
    public final String b;
    public final long c;
    public final int d;
    public final ref e;
    public final String f;

    public iy8(hy8 hy8Var) {
        this.a = hy8Var.a;
        this.b = hy8Var.b;
        this.c = hy8Var.c;
        this.d = hy8Var.d;
        this.e = hy8Var.e;
        this.f = hy8Var.f;
    }

    public final hy8 a() {
        hy8 hy8Var = new hy8();
        hy8Var.a = this.a;
        hy8Var.b = this.b;
        hy8Var.f = this.f;
        hy8Var.c = this.c;
        hy8Var.d = this.d;
        hy8Var.e = this.e;
        return hy8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || iy8.class != obj.getClass()) {
            return false;
        }
        iy8 iy8Var = (iy8) obj;
        if (this.c != iy8Var.c) {
            return false;
        }
        nw8 nw8Var = iy8Var.a;
        nw8 nw8Var2 = this.a;
        if (nw8Var2 == null ? nw8Var != null : !nw8Var2.equals(nw8Var)) {
            return false;
        }
        String str = iy8Var.b;
        String str2 = this.b;
        if (str2 == null ? str != null : !str2.equals(str)) {
            return false;
        }
        if (this.d != iy8Var.d || !Objects.equals(this.f, iy8Var.f)) {
            return false;
        }
        ref refVar = iy8Var.e;
        ref refVar2 = this.e;
        return refVar2 != null ? refVar2.equals(refVar) : refVar == null;
    }

    public final int hashCode() {
        nw8 nw8Var = this.a;
        int iHashCode = (nw8Var != null ? nw8Var.hashCode() : 0) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        long j = this.c;
        int i = (iHashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
        int i2 = this.d;
        int iS = (i + (i2 != 0 ? au1.s(i2) : 0)) * 31;
        ref refVar = this.e;
        int iHashCode3 = (iS + (refVar != null ? refVar.hashCode() : 0)) * 31;
        String str2 = this.f;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "MessageUpload{messageMediaUploadKey=" + this.a + ", path='" + this.b + "', attachLocalId='" + this.f + "', lastModified=" + this.c + ", uploadType=" + h4f.t(this.d) + ", videoConvertOptions=" + this.e + '}';
    }
}
