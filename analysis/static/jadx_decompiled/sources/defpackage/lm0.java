package defpackage;

/* loaded from: classes.dex */
public final class lm0 {
    public static final lm0 d = new lm0(-3, -9223372036854775807L, -1);
    public static final lm0 e = new lm0(-3, -9223372036854775807L, -1);
    public static lm0 f;
    public int a;
    public long b;
    public long c;

    public /* synthetic */ lm0(int i, long j, long j2) {
        this.a = i;
        this.b = j;
        this.c = j2;
    }

    public void a(double d2, double d3, long j) {
        double d4 = (0.01720197f * ((j - 946728000000L) / 8.64E7f)) + 6.24006f;
        double dSin = (Math.sin(r4 * 3.0f) * 5.236000106378924E-6d) + (Math.sin(2.0f * r4) * 3.4906598739326E-4d) + (Math.sin(d4) * 0.03341960161924362d) + d4 + 1.796593063d + 3.141592653589793d;
        double dSin2 = (Math.sin(2.0d * dSin) * (-0.0069d)) + (Math.sin(d4) * 0.0053d) + Math.round((r3 - 9.0E-4f) - r7) + 9.0E-4f + ((-d3) / 360.0d);
        double dAsin = Math.asin(Math.sin(0.4092797040939331d) * Math.sin(dSin));
        double d5 = 0.01745329238474369d * d2;
        double dSin3 = (Math.sin(-0.10471975803375244d) - (Math.sin(dAsin) * Math.sin(d5))) / (Math.cos(dAsin) * Math.cos(d5));
        if (dSin3 >= 1.0d) {
            this.a = 1;
            this.b = -1L;
            this.c = -1L;
        } else {
            if (dSin3 <= -1.0d) {
                this.a = 0;
                this.b = -1L;
                this.c = -1L;
                return;
            }
            double dAcos = (float) (Math.acos(dSin3) / 6.283185307179586d);
            this.b = Math.round((dSin2 + dAcos) * 8.64E7d) + 946728000000L;
            long jRound = Math.round((dSin2 - dAcos) * 8.64E7d) + 946728000000L;
            this.c = jRound;
            if (jRound >= j || this.b <= j) {
                this.a = 1;
            } else {
                this.a = 0;
            }
        }
    }
}
