package defpackage;

/* loaded from: classes.dex */
public final class md0 {
    public final uc0 a;
    public final String b;

    public md0(uc0 uc0Var, String str) {
        this.a = uc0Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof md0)) {
            return false;
        }
        md0 md0Var = (md0) obj;
        return tpa.f(this.a, md0Var.a) && tpa.f(this.b, md0Var.b);
    }

    public final int hashCode() {
        uc0 uc0Var = this.a;
        int iHashCode = (uc0Var == null ? 0 : uc0Var.hashCode()) * 31;
        String str = this.b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "AvatarInfo(abbreviationModel=" + this.a + ", url=" + this.b + ")";
    }
}
