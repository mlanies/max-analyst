package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class dm5 {
    public final /* synthetic */ int a;
    public long b;
    public long c;
    public long d;
    public long e;
    public long f;
    public long g;
    public final boolean[] h;
    public int i;

    public dm5(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.h = new boolean[15];
                break;
            default:
                this.h = new boolean[15];
                break;
        }
    }

    public final boolean a() {
        switch (this.a) {
            case 0:
                if (this.e <= 15 || this.i != 0) {
                }
                break;
            default:
                if (this.e <= 15 || this.i != 0) {
                }
                break;
        }
        return false;
    }

    public final void b(long j) {
        switch (this.a) {
            case 0:
                long j2 = this.e;
                if (j2 == 0) {
                    this.b = j;
                } else if (j2 == 1) {
                    long j3 = j - this.b;
                    this.c = j3;
                    this.g = j3;
                    this.f = 1L;
                } else {
                    long j4 = j - this.d;
                    int i = (int) (j2 % 15);
                    long jAbs = Math.abs(j4 - this.c);
                    boolean[] zArr = this.h;
                    if (jAbs <= 1000000) {
                        this.f++;
                        this.g += j4;
                        if (zArr[i]) {
                            zArr[i] = false;
                            this.i--;
                        }
                    } else if (!zArr[i]) {
                        zArr[i] = true;
                        this.i++;
                    }
                }
                this.e++;
                this.d = j;
                break;
            default:
                long j5 = this.e;
                if (j5 == 0) {
                    this.b = j;
                } else if (j5 == 1) {
                    long j6 = j - this.b;
                    this.c = j6;
                    this.g = j6;
                    this.f = 1L;
                } else {
                    long j7 = j - this.d;
                    int i2 = (int) (j5 % 15);
                    long jAbs2 = Math.abs(j7 - this.c);
                    boolean[] zArr2 = this.h;
                    if (jAbs2 <= 1000000) {
                        this.f++;
                        this.g += j7;
                        if (zArr2[i2]) {
                            zArr2[i2] = false;
                            this.i--;
                        }
                    } else if (!zArr2[i2]) {
                        zArr2[i2] = true;
                        this.i++;
                    }
                }
                this.e++;
                this.d = j;
                break;
        }
    }

    public final void c() {
        switch (this.a) {
            case 0:
                this.e = 0L;
                this.f = 0L;
                this.g = 0L;
                this.i = 0;
                Arrays.fill(this.h, false);
                break;
            default:
                this.e = 0L;
                this.f = 0L;
                this.g = 0L;
                this.i = 0;
                Arrays.fill(this.h, false);
                break;
        }
    }
}
