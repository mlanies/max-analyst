package defpackage;

/* loaded from: classes2.dex */
public final class s38 {
    public final double a;
    public final double b;

    public s38(double d, double d2) {
        this.a = d;
        this.b = d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s38)) {
            return false;
        }
        s38 s38Var = (s38) obj;
        return Double.compare(this.a, s38Var.a) == 0 && Double.compare(this.b, s38Var.b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.b) + (Double.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "NetworkState(roundTripTime=" + this.a + ", lostPacketsFraction=" + this.b + ")";
    }
}
