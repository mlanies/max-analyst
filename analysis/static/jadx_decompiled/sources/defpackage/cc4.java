package defpackage;

/* loaded from: classes.dex */
public final class cc4 {
    public final /* synthetic */ int a;
    public final long b;
    public final long c;
    public final float d;
    public long e = -9223372036854775807L;
    public long f = -9223372036854775807L;
    public long h = -9223372036854775807L;
    public long i = -9223372036854775807L;
    public float l = 0.97f;
    public float k = 1.03f;
    public float m = 1.0f;
    public long n = -9223372036854775807L;
    public long g = -9223372036854775807L;
    public long j = -9223372036854775807L;
    public long o = -9223372036854775807L;
    public long p = -9223372036854775807L;

    public /* synthetic */ cc4(int i, long j, float f, long j2) {
        this.a = i;
        this.b = j;
        this.c = j2;
        this.d = f;
    }

    public final void a() {
        long j;
        switch (this.a) {
            case 0:
                long j2 = this.e;
                if (j2 != -9223372036854775807L) {
                    long j3 = this.f;
                    if (j3 != -9223372036854775807L) {
                        j2 = j3;
                    }
                    long j4 = this.h;
                    if (j4 != -9223372036854775807L && j2 < j4) {
                        j2 = j4;
                    }
                    long j5 = this.i;
                    if (j5 != -9223372036854775807L && j2 > j5) {
                        j2 = j5;
                    }
                } else {
                    j2 = -9223372036854775807L;
                }
                if (this.g != j2) {
                    this.g = j2;
                    this.j = j2;
                    this.o = -9223372036854775807L;
                    this.p = -9223372036854775807L;
                    this.n = -9223372036854775807L;
                    break;
                }
                break;
            default:
                long j6 = this.e;
                if (j6 != -9223372036854775807L) {
                    j = this.f;
                    if (j == -9223372036854775807L) {
                        long j7 = this.h;
                        if (j7 != -9223372036854775807L && j6 < j7) {
                            j6 = j7;
                        }
                        j = this.i;
                        if (j == -9223372036854775807L || j6 <= j) {
                            j = j6;
                        }
                    }
                } else {
                    j = -9223372036854775807L;
                }
                if (this.g != j) {
                    this.g = j;
                    this.j = j;
                    this.o = -9223372036854775807L;
                    this.p = -9223372036854775807L;
                    this.n = -9223372036854775807L;
                    break;
                }
                break;
        }
    }
}
