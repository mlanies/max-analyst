package defpackage;

/* loaded from: classes2.dex */
public final class aw7 {
    public long a;
    public long b;
    public long c;
    public long d;

    public final double a(long j, long j2) {
        double d;
        this.c = ote.c(j - this.a, 0L);
        long jC = ote.c(j2 - this.b, 0L);
        this.d = jC;
        if (jC == 0 && this.c == 0) {
            d = 0.0d;
        } else {
            d = this.c / (jC + r2);
        }
        this.a = j;
        this.b = j2;
        return d;
    }
}
