package defpackage;

/* loaded from: classes2.dex */
public final class x45 {
    public final String a;
    public final int b;
    public final int c;
    public final long d;
    public final boolean e;
    public final boolean f;
    public final int g;

    public x45(String str, int i, int i2, long j, boolean z, boolean z2, int i3) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = j;
        this.e = z;
        this.f = z2;
        this.g = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x45)) {
            return false;
        }
        x45 x45Var = (x45) obj;
        return tpa.f(this.a, x45Var.a) && this.b == x45Var.b && this.c == x45Var.c && this.d == x45Var.d && this.e == x45Var.e && this.f == x45Var.f && this.g == x45Var.g;
    }

    public final int hashCode() {
        return Integer.hashCode(this.g) + ms2.d(ms2.d(h4f.m(k7d.e(this.c, k7d.e(this.b, this.a.hashCode() * 31, 31), 31), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ExecutorConfig(threadName=");
        sb.append(this.a);
        sb.append(", corePoolSize=");
        sb.append(this.b);
        sb.append(", maxPoolSize=");
        sb.append(this.c);
        sb.append(", keepAliveTimeMs=");
        sb.append(this.d);
        sb.append(", allowCoreThreadTimeOut=");
        sb.append(this.e);
        sb.append(", prestartCoreThreads=");
        sb.append(this.f);
        sb.append(", threadPriority=");
        return zr6.j(sb, this.g, ")");
    }

    public /* synthetic */ x45(String str, int i, long j, boolean z, boolean z2, int i2, int i3) {
        this(str, 1, i, (i3 & 8) != 0 ? 0L : j, z, (i3 & 32) != 0 ? false : z2, (i3 & 64) != 0 ? 5 : i2);
    }
}
