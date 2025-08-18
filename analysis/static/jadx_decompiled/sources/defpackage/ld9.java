package defpackage;

/* loaded from: classes2.dex */
public final class ld9 {
    public final fp1 a;
    public final float b;
    public final boolean c;
    public final Long d;
    public final boolean e;

    public ld9(fp1 fp1Var, float f, boolean z, Long l, boolean z2) {
        this.a = fp1Var;
        this.b = f;
        this.c = z;
        this.d = l;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ld9)) {
            return false;
        }
        ld9 ld9Var = (ld9) obj;
        return tpa.f(this.a, ld9Var.a) && Float.compare(this.b, ld9Var.b) == 0 && this.c == ld9Var.c && tpa.f(this.d, ld9Var.d) && this.e == ld9Var.e;
    }

    public final int hashCode() {
        int iD = ms2.d(ms2.c(this.a.hashCode() * 31, this.b, 31), 31, this.c);
        Long l = this.d;
        return Boolean.hashCode(this.e) + ((iD + (l == null ? 0 : l.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MovieStateUpdate(trackKey=");
        sb.append(this.a);
        sb.append(", volume=");
        sb.append(this.b);
        sb.append(", isPaused=");
        sb.append(this.c);
        sb.append(", position=");
        sb.append(this.d);
        sb.append(", isMuted=");
        return au1.j(sb, this.e, ")");
    }
}
