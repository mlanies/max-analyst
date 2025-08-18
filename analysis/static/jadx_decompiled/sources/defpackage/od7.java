package defpackage;

/* loaded from: classes.dex */
public final class od7 {
    public static final String c;
    public static final String d;
    public final String a;
    public final String b;

    static {
        int i = oaf.a;
        c = Integer.toString(0, 36);
        d = Integer.toString(1, 36);
    }

    public od7(String str, String str2) {
        this.a = oaf.T(str);
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || od7.class != obj.getClass()) {
            return false;
        }
        od7 od7Var = (od7) obj;
        return oaf.a(this.a, od7Var.a) && oaf.a(this.b, od7Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() * 31;
        String str = this.a;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
