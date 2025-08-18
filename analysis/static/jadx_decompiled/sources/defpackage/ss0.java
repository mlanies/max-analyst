package defpackage;

import java.io.Closeable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class ss0 implements Closeable {
    public byte[] X;
    public bt0 a;
    public boolean b;
    public k2d c;
    public long o = -1;
    public int Y = -1;
    public int Z = -1;

    public final void a(long j) {
        bt0 bt0Var = this.a;
        if (bt0Var == null) {
            throw new IllegalStateException("not attached to a buffer".toString());
        }
        if (!this.b) {
            throw new IllegalStateException("resizeBuffer() only permitted for read/write buffers".toString());
        }
        long j2 = bt0Var.b;
        if (j <= j2) {
            if (j < 0) {
                throw new IllegalArgumentException(ey8.h(j, "newSize < 0: ").toString());
            }
            long j3 = j2 - j;
            while (true) {
                if (j3 <= 0) {
                    break;
                }
                k2d k2dVar = bt0Var.a.g;
                int i = k2dVar.c;
                long j4 = i - k2dVar.b;
                if (j4 > j3) {
                    k2dVar.c = i - ((int) j3);
                    break;
                } else {
                    bt0Var.a = k2dVar.a();
                    b3d.a(k2dVar);
                    j3 -= j4;
                }
            }
            this.c = null;
            this.o = j;
            this.X = null;
            this.Y = -1;
            this.Z = -1;
        } else if (j > j2) {
            long j5 = j - j2;
            int i2 = 1;
            boolean z = true;
            for (long j6 = 0; j5 > j6; j6 = 0) {
                k2d k2dVarR0 = bt0Var.r0(i2);
                int iMin = (int) Math.min(j5, 8192 - k2dVarR0.c);
                int i3 = k2dVarR0.c + iMin;
                k2dVarR0.c = i3;
                j5 -= iMin;
                if (z) {
                    this.c = k2dVarR0;
                    this.o = j2;
                    this.X = k2dVarR0.a;
                    this.Y = i3 - iMin;
                    this.Z = i3;
                    z = false;
                }
                i2 = 1;
            }
        }
        bt0Var.b = j;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (!(this.a != null)) {
            throw new IllegalStateException("not attached to a buffer".toString());
        }
        this.a = null;
        this.c = null;
        this.o = -1L;
        this.X = null;
        this.Y = -1;
        this.Z = -1;
    }

    public final int d(long j) {
        bt0 bt0Var = this.a;
        if (bt0Var == null) {
            throw new IllegalStateException("not attached to a buffer".toString());
        }
        if (j >= -1) {
            long j2 = bt0Var.b;
            if (j <= j2) {
                if (j == -1 || j == j2) {
                    this.c = null;
                    this.o = j;
                    this.X = null;
                    this.Y = -1;
                    this.Z = -1;
                    return -1;
                }
                k2d k2dVar = bt0Var.a;
                k2d k2dVar2 = this.c;
                long j3 = 0;
                if (k2dVar2 != null) {
                    long j4 = this.o - (this.Y - k2dVar2.b);
                    if (j4 > j) {
                        j2 = j4;
                        k2dVar2 = k2dVar;
                        k2dVar = k2dVar2;
                    } else {
                        j3 = j4;
                    }
                } else {
                    k2dVar2 = k2dVar;
                }
                if (j2 - j > j - j3) {
                    while (true) {
                        long j5 = (k2dVar2.c - k2dVar2.b) + j3;
                        if (j < j5) {
                            break;
                        }
                        k2dVar2 = k2dVar2.f;
                        j3 = j5;
                    }
                } else {
                    while (j2 > j) {
                        k2dVar = k2dVar.g;
                        j2 -= k2dVar.c - k2dVar.b;
                    }
                    k2dVar2 = k2dVar;
                    j3 = j2;
                }
                if (this.b && k2dVar2.d) {
                    byte[] bArr = k2dVar2.a;
                    k2d k2dVar3 = new k2d(Arrays.copyOf(bArr, bArr.length), k2dVar2.b, k2dVar2.c, false, true);
                    if (bt0Var.a == k2dVar2) {
                        bt0Var.a = k2dVar3;
                    }
                    k2dVar2.b(k2dVar3);
                    k2dVar3.g.a();
                    k2dVar2 = k2dVar3;
                }
                this.c = k2dVar2;
                this.o = j;
                this.X = k2dVar2.a;
                int i = k2dVar2.b + ((int) (j - j3));
                this.Y = i;
                int i2 = k2dVar2.c;
                this.Z = i2;
                return i2 - i;
            }
        }
        throw new ArrayIndexOutOfBoundsException(String.format("offset=%s > size=%s", Arrays.copyOf(new Object[]{Long.valueOf(j), Long.valueOf(bt0Var.b)}, 2)));
    }
}
