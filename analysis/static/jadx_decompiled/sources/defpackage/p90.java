package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class p90 {
    public final int a;
    public final double b;
    public final Throwable c;

    static {
        Collections.unmodifiableSet(new HashSet(Arrays.asList(2, 3, 4)));
    }

    public p90(int i, double d, Throwable th) {
        this.a = i;
        this.b = d;
        this.c = th;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p90)) {
            return false;
        }
        p90 p90Var = (p90) obj;
        if (this.a == p90Var.a && Double.doubleToLongBits(this.b) == Double.doubleToLongBits(p90Var.b)) {
            Throwable th = p90Var.c;
            Throwable th2 = this.c;
            if (th2 == null) {
                if (th == null) {
                    return true;
                }
            } else if (th2.equals(th)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (this.a ^ 1000003) * 1000003;
        double d = this.b;
        int iDoubleToLongBits = (i ^ ((int) (Double.doubleToLongBits(d) ^ (Double.doubleToLongBits(d) >>> 32)))) * 1000003;
        Throwable th = this.c;
        return (th == null ? 0 : th.hashCode()) ^ iDoubleToLongBits;
    }

    public final String toString() {
        return "AudioStats{audioState=" + this.a + ", audioAmplitudeInternal=" + this.b + ", errorCause=" + this.c + "}";
    }
}
