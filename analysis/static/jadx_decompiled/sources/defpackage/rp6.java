package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayDeque;
import okhttp3.internal.http2.StreamResetException;

/* loaded from: classes.dex */
public final class rp6 {
    public long a;
    public long b;
    public long c;
    public long d;
    public final ArrayDeque e;
    public boolean f;
    public final pp6 g;
    public final op6 h;
    public final qp6 i;
    public final qp6 j;
    public int k;
    public IOException l;
    public final int m;
    public final kp6 n;

    public rp6(int i, kp6 kp6Var, boolean z, boolean z2, cj6 cj6Var) {
        this.m = i;
        this.n = kp6Var;
        this.d = kp6Var.D0.a();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.e = arrayDeque;
        this.g = new pp6(this, kp6Var.C0.a(), z2);
        this.h = new op6(this, z);
        int i2 = 0;
        this.i = new qp6(i2, this);
        this.j = new qp6(i2, this);
        if (cj6Var == null) {
            if (!h()) {
                throw new IllegalStateException("remotely-initiated streams should have headers".toString());
            }
        } else {
            if (!(!h())) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet".toString());
            }
            arrayDeque.add(cj6Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            r2 = this;
            byte[] r0 = defpackage.naf.a
            monitor-enter(r2)
            pp6 r0 = r2.g     // Catch: java.lang.Throwable -> L19
            boolean r1 = r0.X     // Catch: java.lang.Throwable -> L19
            if (r1 != 0) goto L1b
            boolean r0 = r0.c     // Catch: java.lang.Throwable -> L19
            if (r0 == 0) goto L1b
            op6 r0 = r2.h     // Catch: java.lang.Throwable -> L19
            boolean r1 = r0.c     // Catch: java.lang.Throwable -> L19
            if (r1 != 0) goto L17
            boolean r0 = r0.b     // Catch: java.lang.Throwable -> L19
            if (r0 == 0) goto L1b
        L17:
            r0 = 1
            goto L1c
        L19:
            r0 = move-exception
            goto L34
        L1b:
            r0 = 0
        L1c:
            boolean r1 = r2.i()     // Catch: java.lang.Throwable -> L19
            monitor-exit(r2)
            if (r0 == 0) goto L2a
            r0 = 9
            r1 = 0
            r2.c(r0, r1)
            goto L33
        L2a:
            if (r1 != 0) goto L33
            kp6 r0 = r2.n
            int r2 = r2.m
            r0.m(r2)
        L33:
            return
        L34:
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rp6.a():void");
    }

    public final void b() throws IOException {
        op6 op6Var = this.h;
        if (op6Var.b) {
            throw new IOException("stream closed");
        }
        if (op6Var.c) {
            throw new IOException("stream finished");
        }
        if (this.k != 0) {
            IOException iOException = this.l;
            if (iOException == null) {
                throw new StreamResetException(this.k);
            }
        }
    }

    public final void c(int i, IOException iOException) {
        if (d(i, iOException)) {
            this.n.J0.o(this.m, i);
        }
    }

    public final boolean d(int i, IOException iOException) {
        byte[] bArr = naf.a;
        synchronized (this) {
            if (this.k != 0) {
                return false;
            }
            if (this.g.X && this.h.c) {
                return false;
            }
            this.k = i;
            this.l = iOException;
            notifyAll();
            this.n.m(this.m);
            return true;
        }
    }

    public final void e(int i) {
        if (d(i, null)) {
            this.n.U(this.m, i);
        }
    }

    public final synchronized int f() {
        return this.k;
    }

    public final op6 g() {
        synchronized (this) {
            if (!this.f && !h()) {
                throw new IllegalStateException("reply before requesting the sink".toString());
            }
        }
        return this.h;
    }

    public final boolean h() {
        return this.n.a == ((this.m & 1) == 1);
    }

    public final synchronized boolean i() {
        if (this.k != 0) {
            return false;
        }
        pp6 pp6Var = this.g;
        if (pp6Var.X || pp6Var.c) {
            op6 op6Var = this.h;
            if (op6Var.c || op6Var.b) {
                if (this.f) {
                    return false;
                }
            }
        }
        return true;
    }

    public final void j(cj6 cj6Var, boolean z) {
        boolean zI;
        byte[] bArr = naf.a;
        synchronized (this) {
            try {
                if (this.f && z) {
                    this.g.getClass();
                } else {
                    this.f = true;
                    this.e.add(cj6Var);
                }
                if (z) {
                    this.g.X = true;
                }
                zI = i();
                notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zI) {
            return;
        }
        this.n.m(this.m);
    }

    public final void k() throws InterruptedException, InterruptedIOException {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }
}
