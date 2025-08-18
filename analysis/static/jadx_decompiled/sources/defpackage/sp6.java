package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class sp6 implements Closeable {
    public static final Logger Z = Logger.getLogger(zo6.class.getName());
    public final eu0 X;
    public final boolean Y;
    public final bt0 a;
    public int b;
    public boolean c;
    public final ro6 o;

    public sp6(eu0 eu0Var, boolean z) {
        this.X = eu0Var;
        this.Y = z;
        bt0 bt0Var = new bt0();
        this.a = bt0Var;
        this.b = 16384;
        this.o = new ro6(bt0Var);
    }

    public final synchronized void S(int i, long j) {
        if (this.c) {
            throw new IOException("closed");
        }
        if (j == 0 || j > 2147483647L) {
            throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j).toString());
        }
        g(i, 4, 8, 0);
        this.X.A((int) j);
        this.X.flush();
    }

    public final void U(int i, long j) {
        while (j > 0) {
            long jMin = Math.min(this.b, j);
            j -= jMin;
            g(i, (int) jMin, 9, j == 0 ? 4 : 0);
            this.X.N(this.a, jMin);
        }
    }

    public final synchronized void a(ded dedVar) {
        try {
            if (this.c) {
                throw new IOException("closed");
            }
            int i = this.b;
            int i2 = dedVar.a;
            if ((i2 & 32) != 0) {
                i = dedVar.b[5];
            }
            this.b = i;
            if (((i2 & 2) != 0 ? dedVar.b[1] : -1) != -1) {
                ro6 ro6Var = this.o;
                int i3 = (i2 & 2) != 0 ? dedVar.b[1] : -1;
                ro6Var.getClass();
                int iMin = Math.min(i3, 16384);
                int i4 = ro6Var.c;
                if (i4 != iMin) {
                    if (iMin < i4) {
                        ro6Var.a = Math.min(ro6Var.a, iMin);
                    }
                    ro6Var.b = true;
                    ro6Var.c = iMin;
                    int i5 = ro6Var.g;
                    if (iMin < i5) {
                        if (iMin == 0) {
                            ys.c0(ro6Var.d, null);
                            ro6Var.e = ro6Var.d.length - 1;
                            ro6Var.f = 0;
                            ro6Var.g = 0;
                        } else {
                            ro6Var.a(i5 - iMin);
                        }
                    }
                }
            }
            g(0, 0, 4, 1);
            this.X.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.c = true;
        this.X.close();
    }

    public final synchronized void d(boolean z, int i, bt0 bt0Var, int i2) {
        if (this.c) {
            throw new IOException("closed");
        }
        g(i, i2, 0, z ? 1 : 0);
        if (i2 > 0) {
            this.X.N(bt0Var, i2);
        }
    }

    public final synchronized void flush() {
        if (this.c) {
            throw new IOException("closed");
        }
        this.X.flush();
    }

    public final void g(int i, int i2, int i3, int i4) {
        Level level = Level.FINE;
        Logger logger = Z;
        if (logger.isLoggable(level)) {
            logger.fine(zo6.a(false, i, i2, i3, i4));
        }
        if (i2 > this.b) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.b + ": " + i2).toString());
        }
        if ((((int) 2147483648L) & i) != 0) {
            throw new IllegalArgumentException(zr6.h(i, "reserved bit set: ").toString());
        }
        byte[] bArr = naf.a;
        eu0 eu0Var = this.X;
        eu0Var.C((i2 >>> 16) & 255);
        eu0Var.C((i2 >>> 8) & 255);
        eu0Var.C(i2 & 255);
        eu0Var.C(i3 & 255);
        eu0Var.C(i4 & 255);
        eu0Var.A(i & Integer.MAX_VALUE);
    }

    public final synchronized void m(int i, byte[] bArr, int i2) {
        try {
            if (this.c) {
                throw new IOException("closed");
            }
            if (au1.s(i2) == -1) {
                throw new IllegalArgumentException("errorCode.httpCode == -1".toString());
            }
            g(0, bArr.length + 8, 7, 0);
            this.X.A(i);
            this.X.A(au1.s(i2));
            if (!(bArr.length == 0)) {
                this.X.write(bArr);
            }
            this.X.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void n(int i, int i2, boolean z) {
        if (this.c) {
            throw new IOException("closed");
        }
        g(0, 8, 6, z ? 1 : 0);
        this.X.A(i);
        this.X.A(i2);
        this.X.flush();
    }

    public final synchronized void o(int i, int i2) {
        if (this.c) {
            throw new IOException("closed");
        }
        if (au1.s(i2) == -1) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        g(i, 4, 3, 0);
        this.X.A(au1.s(i2));
        this.X.flush();
    }
}
