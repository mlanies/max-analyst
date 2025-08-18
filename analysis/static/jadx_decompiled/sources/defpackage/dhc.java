package defpackage;

/* loaded from: classes2.dex */
public final class dhc {
    public final double a;
    public final int b;
    public final int c;

    public dhc(int i, int i2, double d) {
        this.a = d;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dhc)) {
            return false;
        }
        dhc dhcVar = (dhc) obj;
        return Double.compare(this.a, dhcVar.a) == 0 && this.b == dhcVar.b && this.c == dhcVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + s36.c(this.b, Double.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "ReportNetworkStatusConfig(networkStatusReportThreshold=" + this.a + ", networkStatusReportIntervalMs=" + this.b + ", networkStatusReportForceIntervalMs=" + this.c + ")";
    }
}
