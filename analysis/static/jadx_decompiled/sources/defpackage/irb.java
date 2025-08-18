package defpackage;

/* loaded from: classes2.dex */
public final class irb implements lrb {
    public final up7 a;
    public final int b;

    public irb(up7 up7Var, int i) {
        this.a = up7Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof irb)) {
            return false;
        }
        irb irbVar = (irb) obj;
        return tpa.f(this.a, irbVar.a) && this.b == irbVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OpenFullScreenMedia(localMedia=" + this.a + ", position=" + this.b + ")";
    }
}
