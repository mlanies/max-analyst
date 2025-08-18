package defpackage;

/* loaded from: classes2.dex */
public final class ep3 {
    public static final /* synthetic */ int e = 0;
    public final long a;
    public final long b;
    public final er7 c;
    public final String d;

    static {
        er7 er7Var = er7.Z;
        qy qyVar = new qy(er7Var);
        if (((er7) qyVar.X) == null) {
            qyVar.X = er7Var;
        }
        new ep3(qyVar);
    }

    public ep3(qy qyVar) {
        this.a = qyVar.b;
        this.b = qyVar.c;
        this.c = (er7) qyVar.X;
        this.d = (String) qyVar.o;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ep3.class != obj.getClass()) {
            return false;
        }
        ep3 ep3Var = (ep3) obj;
        if (this.a != ep3Var.a || this.b != ep3Var.b) {
            return false;
        }
        er7 er7Var = ep3Var.c;
        er7 er7Var2 = this.c;
        if (er7Var2 == null ? er7Var != null : !er7Var2.equals(er7Var)) {
            return false;
        }
        String str = ep3Var.d;
        String str2 = this.d;
        return str2 != null ? str2.equals(str) : str == null;
    }

    public final int hashCode() {
        long j = this.a;
        long j2 = this.b;
        int i = ((((int) (j ^ (j >>> 32))) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31;
        er7 er7Var = this.c;
        int iHashCode = (i + (er7Var != null ? er7Var.hashCode() : 0)) * 31;
        String str = this.d;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ContactLocation{contactServerId=");
        sb.append(this.a);
        sb.append(", time=");
        sb.append(nu0.G(Long.valueOf(this.b)));
        sb.append(", location=");
        sb.append(this.c);
        sb.append(", deviceId='");
        return zr6.l(sb, this.d, "'}");
    }
}
