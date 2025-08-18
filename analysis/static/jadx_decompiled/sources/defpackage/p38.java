package defpackage;

import org.apache.http.HttpStatus;

/* loaded from: classes2.dex */
public final class p38 {
    public final double a = 120.0d;
    public final double b = 0.04d;
    public final double c = 0.04d;
    public final double d = 1000.0d;
    public final double e = 700.0d;
    public final int f = 500;
    public final int g = HttpStatus.SC_MULTIPLE_CHOICES;
    public final boolean h = true;
    public final boolean i = false;
    public final boolean j = false;
    public final boolean k = true;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p38)) {
            return false;
        }
        p38 p38Var = (p38) obj;
        return Double.compare(this.a, p38Var.a) == 0 && Double.compare(this.b, p38Var.b) == 0 && Double.compare(this.c, p38Var.c) == 0 && Double.compare(this.d, p38Var.d) == 0 && Double.compare(this.e, p38Var.e) == 0 && this.f == p38Var.f && this.g == p38Var.g && this.h == p38Var.h && this.i == p38Var.i && this.j == p38Var.j && this.k == p38Var.k;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.k) + ms2.d(ms2.d(ms2.d(s36.c(this.g, s36.c(this.f, c37.b(c37.b(c37.b(c37.b(Double.hashCode(this.a) * 31, this.b), this.c), this.d), this.e))), 31, this.h), 31, this.i), 31, this.j);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BadNetworkCondition(rttThreshold=");
        sb.append(this.a);
        sb.append(", lostPacketsLimitForRttBelowLowBound=");
        sb.append(this.b);
        sb.append(", lostPacketsLimitForRttAboveLowBound=");
        sb.append(this.c);
        sb.append(", rttEnterLevel2Mode=");
        sb.append(this.d);
        sb.append(", rttLeaveLevel2Mode=");
        sb.append(this.e);
        sb.append(", videoBitrateLevel1K=");
        sb.append(this.f);
        sb.append(", videoBitrateLevel2K=");
        sb.append(this.g);
        sb.append(", preferHardwareVPXEncoder=");
        sb.append(this.h);
        sb.append(", limitFrameSize=");
        sb.append(this.i);
        sb.append(", limitBitrate=");
        sb.append(this.j);
        sb.append(", setTemporalLayers=");
        return au1.j(sb, this.k, ")");
    }
}
