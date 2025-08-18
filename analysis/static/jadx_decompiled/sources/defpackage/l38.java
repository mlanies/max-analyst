package defpackage;

import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class l38 implements Comparable {
    public final String X;
    public final long Y;
    public final String a;
    public final long b;
    public final long c;
    public final TimeUnit o;

    public l38(String str, long j, long j2, TimeUnit timeUnit, String str2, long j3) {
        this.a = str;
        this.b = j;
        this.c = j2;
        this.o = timeUnit;
        this.X = str2;
        this.Y = j3;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        l38 l38Var = (l38) obj;
        TimeUnit timeUnit = this.o;
        long nanos = timeUnit.toNanos(this.b) + timeUnit.toNanos(this.c);
        long j = l38Var.c;
        TimeUnit timeUnit2 = l38Var.o;
        int iN = tpa.n(nanos, timeUnit2.toNanos(l38Var.b) + timeUnit2.toNanos(j));
        Integer numValueOf = Integer.valueOf(iN);
        if (iN == 0) {
            numValueOf = null;
        }
        return numValueOf != null ? numValueOf.intValue() : this.a.compareTo(l38Var.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l38)) {
            return false;
        }
        l38 l38Var = (l38) obj;
        return tpa.f(this.a, l38Var.a) && this.b == l38Var.b && this.c == l38Var.c && this.o == l38Var.o && tpa.f(this.X, l38Var.X) && this.Y == l38Var.Y;
    }

    public final int hashCode() {
        return Long.hashCode(this.Y) + rh4.d((this.o.hashCode() + h4f.m(h4f.m(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31, 31, this.X);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Measurement(taskName=");
        sb.append(this.a);
        sb.append(", dependencyDuration=");
        sb.append(this.b);
        sb.append(", executionDuration=");
        sb.append(this.c);
        sb.append(", unit=");
        sb.append(this.o);
        sb.append(", threadName=");
        sb.append(this.X);
        sb.append(", startTime=");
        return zr6.k(sb, this.Y, ")");
    }
}
