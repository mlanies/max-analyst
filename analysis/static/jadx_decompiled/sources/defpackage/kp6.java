package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class kp6 implements Closeable {
    public static final ded M0;
    public long A0;
    public long B0;
    public final ded C0;
    public ded D0;
    public long E0;
    public long F0;
    public long G0;
    public long H0;
    public final Socket I0;
    public final sp6 J0;
    public final cc1 K0;
    public final LinkedHashSet L0;
    public int X;
    public int Y;
    public boolean Z;
    public final cp6 b;
    public final String o;
    public final foe s0;
    public final coe t0;
    public final coe u0;
    public final coe v0;
    public final hx9 w0;
    public long x0;
    public long y0;
    public long z0;
    public final boolean a = true;
    public final LinkedHashMap c = new LinkedHashMap();

    static {
        ded dedVar = new ded();
        dedVar.b(7, 65535);
        dedVar.b(5, 16384);
        M0 = dedVar;
    }

    public kp6(gb0 gb0Var) {
        this.b = (cp6) gb0Var.f;
        String str = (String) gb0Var.a;
        this.o = str;
        this.Y = 3;
        foe foeVar = (foe) gb0Var.g;
        this.s0 = foeVar;
        coe coeVarF = foeVar.f();
        this.t0 = coeVarF;
        this.u0 = foeVar.f();
        this.v0 = foeVar.f();
        this.w0 = hx9.t0;
        ded dedVar = new ded();
        dedVar.b(7, 16777216);
        this.C0 = dedVar;
        this.D0 = M0;
        this.H0 = r2.a();
        this.I0 = (Socket) gb0Var.c;
        this.J0 = new sp6((eu0) gb0Var.e, true);
        this.K0 = new cc1(this, new np6((fu0) gb0Var.d, true));
        this.L0 = new LinkedHashSet();
        int i = gb0Var.b;
        if (i != 0) {
            long nanos = TimeUnit.MILLISECONDS.toNanos(i);
            coeVarF.c(new ap6(au1.g(str, " ping"), this, nanos), nanos);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0035, code lost:
    
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.J0.b);
        r6 = r2;
        r8.G0 += r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void S(int r9, boolean r10, defpackage.bt0 r11, long r12) {
        /*
            r8 = this;
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            r3 = 0
            if (r2 != 0) goto Ld
            sp6 r8 = r8.J0
            r8.d(r10, r9, r11, r3)
            return
        Ld:
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 <= 0) goto L68
            monitor-enter(r8)
        L12:
            long r4 = r8.G0     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            long r6 = r8.H0     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 < 0) goto L34
            java.util.LinkedHashMap r2 = r8.c     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            boolean r2 = r2.containsKey(r4)     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            if (r2 == 0) goto L2c
            r8.wait()     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            goto L12
        L2a:
            r9 = move-exception
            goto L66
        L2c:
            java.io.IOException r9 = new java.io.IOException     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            throw r9     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
        L34:
            long r6 = r6 - r4
            long r4 = java.lang.Math.min(r12, r6)     // Catch: java.lang.Throwable -> L2a
            int r2 = (int) r4     // Catch: java.lang.Throwable -> L2a
            sp6 r4 = r8.J0     // Catch: java.lang.Throwable -> L2a
            int r4 = r4.b     // Catch: java.lang.Throwable -> L2a
            int r2 = java.lang.Math.min(r2, r4)     // Catch: java.lang.Throwable -> L2a
            long r4 = r8.G0     // Catch: java.lang.Throwable -> L2a
            long r6 = (long) r2     // Catch: java.lang.Throwable -> L2a
            long r4 = r4 + r6
            r8.G0 = r4     // Catch: java.lang.Throwable -> L2a
            monitor-exit(r8)
            long r12 = r12 - r6
            sp6 r4 = r8.J0
            if (r10 == 0) goto L54
            int r5 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r5 != 0) goto L54
            r5 = 1
            goto L55
        L54:
            r5 = r3
        L55:
            r4.d(r5, r9, r11, r2)
            goto Ld
        L59:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L2a
            r9.interrupt()     // Catch: java.lang.Throwable -> L2a
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L2a
            r9.<init>()     // Catch: java.lang.Throwable -> L2a
            throw r9     // Catch: java.lang.Throwable -> L2a
        L66:
            monitor-exit(r8)
            throw r9
        L68:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kp6.S(int, boolean, bt0, long):void");
    }

    public final void U(int i, int i2) {
        this.t0.c(new ep6(this.o + '[' + i + "] writeSynReset", this, i, i2, 1), 0L);
    }

    public final void a(int i, int i2, IOException iOException) throws IOException {
        int i3;
        rp6[] rp6VarArr;
        byte[] bArr = naf.a;
        try {
            n(i);
        } catch (IOException unused) {
        }
        synchronized (this) {
            try {
                if (!this.c.isEmpty()) {
                    Object[] array = this.c.values().toArray(new rp6[0]);
                    if (array == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                    }
                    rp6VarArr = (rp6[]) array;
                    this.c.clear();
                } else {
                    rp6VarArr = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (rp6VarArr != null) {
            for (rp6 rp6Var : rp6VarArr) {
                try {
                    rp6Var.c(i2, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.J0.close();
        } catch (IOException unused3) {
        }
        try {
            this.I0.close();
        } catch (IOException unused4) {
        }
        this.t0.e();
        this.u0.e();
        this.v0.e();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        a(1, 9, null);
    }

    public final void d(IOException iOException) throws IOException {
        a(2, 2, iOException);
    }

    public final void e0(int i, long j) {
        this.t0.c(new jp6(this.o + '[' + i + "] windowUpdate", this, i, j), 0L);
    }

    public final void flush() {
        this.J0.flush();
    }

    public final synchronized rp6 g(int i) {
        return (rp6) this.c.get(Integer.valueOf(i));
    }

    public final synchronized rp6 m(int i) {
        rp6 rp6Var;
        rp6Var = (rp6) this.c.remove(Integer.valueOf(i));
        notifyAll();
        return rp6Var;
    }

    public final void n(int i) {
        synchronized (this.J0) {
            synchronized (this) {
                if (this.Z) {
                    return;
                }
                this.Z = true;
                this.J0.m(this.X, naf.a, i);
            }
        }
    }

    public final synchronized void o(long j) {
        long j2 = this.E0 + j;
        this.E0 = j2;
        long j3 = j2 - this.F0;
        if (j3 >= this.C0.a() / 2) {
            e0(0, j3);
            this.F0 += j3;
        }
    }
}
