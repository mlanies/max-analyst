package defpackage;

/* loaded from: classes2.dex */
public final class wlb extends amb {
    public final jqe a;

    public wlb(int i, eqe eqeVar) {
        this.a = eqeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wlb)) {
            return false;
        }
        if (!tpa.f(this.a, ((wlb) obj).a)) {
            return false;
        }
        int i = gpc.a;
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(gpc.x0) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShowInfoSnackbar(title=");
        sb.append(this.a);
        sb.append(", iconRes=");
        return zr6.j(sb, gpc.x0, ")");
    }
}
