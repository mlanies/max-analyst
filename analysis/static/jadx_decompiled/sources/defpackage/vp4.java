package defpackage;

/* loaded from: classes2.dex */
public final class vp4 {
    public final kp4 a;
    public final kp4 b;

    public vp4(kp4 kp4Var, kp4 kp4Var2) {
        this.a = kp4Var;
        this.b = kp4Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vp4)) {
            return false;
        }
        vp4 vp4Var = (vp4) obj;
        return tpa.f(this.a, vp4Var.a) && tpa.f(this.b, vp4Var.b);
    }

    public final int hashCode() {
        kp4 kp4Var = this.a;
        int iHashCode = (kp4Var == null ? 0 : kp4Var.hashCode()) * 31;
        kp4 kp4Var2 = this.b;
        return iHashCode + (kp4Var2 != null ? kp4Var2.hashCode() : 0);
    }

    public final String toString() {
        return "DraftsNews(chats=" + this.a + ", users=" + this.b + ")";
    }
}
