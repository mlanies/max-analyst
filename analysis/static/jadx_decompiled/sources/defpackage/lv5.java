package defpackage;

/* loaded from: classes.dex */
public final class lv5 implements nv5 {
    public final long a;
    public final String b;

    public lv5(long j, String str) {
        this.a = j;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lv5)) {
            return false;
        }
        lv5 lv5Var = (lv5) obj;
        return this.a == lv5Var.a && tpa.f(this.b, lv5Var.b);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.a) * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OpenApp(appId=");
        sb.append(this.a);
        sb.append(", startParam=");
        return zr6.l(sb, this.b, ")");
    }
}
