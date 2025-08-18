package defpackage;

import android.animation.TimeInterpolator;

/* loaded from: classes.dex */
public final class xc9 {
    public long a;
    public long b;
    public TimeInterpolator c;
    public int d;
    public int e;

    public final TimeInterpolator a() {
        TimeInterpolator timeInterpolator = this.c;
        return timeInterpolator != null ? timeInterpolator : og.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xc9)) {
            return false;
        }
        xc9 xc9Var = (xc9) obj;
        if (this.a == xc9Var.a && this.b == xc9Var.b && this.d == xc9Var.d && this.e == xc9Var.e) {
            return a().getClass().equals(xc9Var.a().getClass());
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        long j2 = this.b;
        return ((((a().getClass().hashCode() + (((((int) (j ^ (j >>> 32))) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31)) * 31) + this.d) * 31) + this.e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n");
        sb.append(xc9.class.getName());
        sb.append('{');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" delay: ");
        sb.append(this.a);
        sb.append(" duration: ");
        sb.append(this.b);
        sb.append(" interpolator: ");
        sb.append(a().getClass());
        sb.append(" repeatCount: ");
        sb.append(this.d);
        sb.append(" repeatMode: ");
        return zr6.j(sb, this.e, "}\n");
    }
}
