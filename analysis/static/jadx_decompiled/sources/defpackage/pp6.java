package defpackage;

import java.io.IOException;
import okhttp3.internal.http2.StreamResetException;

/* loaded from: classes.dex */
public final class pp6 implements yud {
    public boolean X;
    public final /* synthetic */ rp6 Y;
    public final bt0 a = new bt0();
    public final bt0 b = new bt0();
    public boolean c;
    public final long o;

    public pp6(rp6 rp6Var, long j, boolean z) {
        this.Y = rp6Var;
        this.o = j;
        this.X = z;
    }

    public final void a(long j) {
        byte[] bArr = naf.a;
        this.Y.n.o(j);
    }

    @Override // defpackage.yud
    public final long c(bt0 bt0Var, long j) throws Throwable {
        Throwable streamResetException;
        boolean z;
        long jC;
        long j2 = 0;
        if (j < 0) {
            throw new IllegalArgumentException(ey8.h(j, "byteCount < 0: ").toString());
        }
        while (true) {
            synchronized (this.Y) {
                this.Y.i.i();
                try {
                    if (this.Y.f() != 0) {
                        streamResetException = this.Y.l;
                        if (streamResetException == null) {
                            streamResetException = new StreamResetException(this.Y.f());
                        }
                    } else {
                        streamResetException = null;
                    }
                    if (this.c) {
                        throw new IOException("stream closed");
                    }
                    bt0 bt0Var2 = this.b;
                    long j3 = bt0Var2.b;
                    z = false;
                    if (j3 > j2) {
                        jC = bt0Var2.c(bt0Var, Math.min(j, j3));
                        rp6 rp6Var = this.Y;
                        long j4 = rp6Var.a + jC;
                        rp6Var.a = j4;
                        long j5 = j4 - rp6Var.b;
                        if (streamResetException == null && j5 >= rp6Var.n.C0.a() / 2) {
                            rp6 rp6Var2 = this.Y;
                            rp6Var2.n.e0(rp6Var2.m, j5);
                            rp6 rp6Var3 = this.Y;
                            rp6Var3.b = rp6Var3.a;
                        }
                    } else {
                        if (!this.X && streamResetException == null) {
                            this.Y.k();
                            z = true;
                        }
                        jC = -1;
                    }
                    this.Y.i.m();
                } catch (Throwable th) {
                    this.Y.i.m();
                    throw th;
                }
            }
            if (!z) {
                if (jC != -1) {
                    a(jC);
                    return jC;
                }
                if (streamResetException == null) {
                    return -1L;
                }
                throw streamResetException;
            }
            j2 = 0;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long j;
        synchronized (this.Y) {
            this.c = true;
            bt0 bt0Var = this.b;
            j = bt0Var.b;
            bt0Var.m();
            rp6 rp6Var = this.Y;
            if (rp6Var == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
            }
            rp6Var.notifyAll();
        }
        if (j > 0) {
            a(j);
        }
        this.Y.a();
    }

    @Override // defpackage.yud, defpackage.ksd
    public final oue p() {
        return this.Y.i;
    }
}
