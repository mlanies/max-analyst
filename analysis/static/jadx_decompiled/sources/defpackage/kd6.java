package defpackage;

/* loaded from: classes2.dex */
public final class kd6 {
    public final int a;
    public final long b;
    public final long c;
    public final float d;
    public final float e;
    public final boolean f;

    public kd6(int i, long j, long j2, float f, int i2) {
        boolean z = (i2 & 32) != 0;
        this.a = i;
        this.b = j;
        this.c = j2;
        this.d = f;
        this.e = 0.6f;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kd6)) {
            return false;
        }
        kd6 kd6Var = (kd6) obj;
        return this.a == kd6Var.a && this.b == kd6Var.b && this.c == kd6Var.c && Float.compare(this.d, kd6Var.d) == 0 && Float.compare(this.e, kd6Var.e) == 0 && this.f == kd6Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + ms2.c(ms2.c(h4f.m(h4f.m(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c), this.d, 31), this.e, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AnimationConfig(repeatCount=");
        sb.append(this.a);
        sb.append(", startDelay=");
        sb.append(this.b);
        sb.append(", duration=");
        sb.append(this.c);
        sb.append(", tiltDegrees=");
        sb.append(this.d);
        sb.append(", shineWidthFraction=");
        sb.append(this.e);
        sb.append(", startOnAttach=");
        return au1.j(sb, this.f, ")");
    }
}
