package defpackage;

/* loaded from: classes.dex */
public final class ea1 extends wm9 {
    public final String b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public ea1(String str, boolean z, boolean z2, boolean z3) {
        super(e5f.a);
        this.b = str;
        this.c = z;
        this.d = z2;
        this.e = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ea1)) {
            return false;
        }
        ea1 ea1Var = (ea1) obj;
        return tpa.f(this.b, ea1Var.b) && this.c == ea1Var.c && this.d == ea1Var.d && this.e == ea1Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ms2.d(ms2.d(this.b.hashCode() * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        return "OpenLink(link=" + this.b + ", isVideoEnabled=" + this.c + ", isAudioEnabled=" + this.d + ", isFront=" + this.e + ")";
    }
}
