package defpackage;

/* loaded from: classes.dex */
public final class zi2 {
    public final n26 a;
    public final boolean b;
    public final boolean c;

    public zi2(n26 n26Var, boolean z, boolean z2, int i) {
        n26Var = (i & 1) != 0 ? null : n26Var;
        z = (i & 2) != 0 ? false : z;
        z2 = (i & 4) != 0 ? true : z2;
        this.a = n26Var;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zi2)) {
            return false;
        }
        zi2 zi2Var = (zi2) obj;
        return tpa.f(this.a, zi2Var.a) && this.b == zi2Var.b && this.c == zi2Var.c;
    }

    public final int hashCode() {
        n26 n26Var = this.a;
        return Boolean.hashCode(this.c) + ms2.d((n26Var == null ? 0 : n26Var.hashCode()) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FrameState(frame=");
        sb.append(this.a);
        sb.append(", loading=");
        sb.append(this.b);
        sb.append(", featureEnabled=");
        return au1.j(sb, this.c, ")");
    }
}
