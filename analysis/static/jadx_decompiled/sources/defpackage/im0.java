package defpackage;

/* loaded from: classes.dex */
public final class im0 {
    public final long a;
    public final long b;
    public final long c;
    public long d;
    public long e;
    public long f;
    public long g;
    public long h;

    public im0(long j, long j2, long j3, long j4, long j5, long j6, int i) {
        switch (i) {
            case 1:
                this.a = j;
                this.b = j2;
                this.d = 0L;
                this.e = j3;
                this.f = j4;
                this.g = j5;
                this.c = j6;
                this.h = b(j2, 0L, j3, j4, j5, j6);
                break;
            default:
                this.a = j;
                this.b = j2;
                this.d = 0L;
                this.e = j3;
                this.f = j4;
                this.g = j5;
                this.c = j6;
                this.h = a(j2, 0L, j3, j4, j5, j6);
                break;
        }
    }

    public static long a(long j, long j2, long j3, long j4, long j5, long j6) {
        if (j4 + 1 >= j5 || j2 + 1 >= j3) {
            return j4;
        }
        long j7 = (long) ((j - j2) * ((j5 - j4) / (j3 - j2)));
        return maf.k(((j7 + j4) - j6) - (j7 / 20), j4, j5 - 1);
    }

    public static long b(long j, long j2, long j3, long j4, long j5, long j6) {
        if (j4 + 1 >= j5 || j2 + 1 >= j3) {
            return j4;
        }
        long j7 = (long) ((j - j2) * ((j5 - j4) / (j3 - j2)));
        return oaf.k(((j7 + j4) - j6) - (j7 / 20), j4, j5 - 1);
    }
}
