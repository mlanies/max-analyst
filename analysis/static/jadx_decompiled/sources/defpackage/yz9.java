package defpackage;

import java.util.ArrayDeque;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class yz9 extends AtomicInteger implements zl4, f2a {
    public static final xz9[] A0 = new xz9[0];
    public static final xz9[] B0 = new xz9[0];
    public final int X;
    public volatile bqd Y;
    public volatile boolean Z;
    public final f2a a;
    public final b66 b;
    public final int o;
    public volatile boolean t0;
    public final AtomicReference u0;
    public zl4 v0;
    public long w0;
    public int x0;
    public final ArrayDeque y0;
    public int z0;
    public final az s0 = new az();
    public final boolean c = false;

    public yz9(f2a f2aVar, b66 b66Var, int i, int i2) {
        this.a = f2aVar;
        this.b = b66Var;
        this.o = i;
        this.X = i2;
        if (i != Integer.MAX_VALUE) {
            this.y0 = new ArrayDeque(i);
        }
        this.u0 = new AtomicReference(A0);
    }

    public final boolean a() {
        if (this.t0) {
            return true;
        }
        Throwable th = (Throwable) this.s0.get();
        if (this.c || th == null) {
            return false;
        }
        d();
        this.s0.d(this.a);
        return true;
    }

    @Override // defpackage.f2a
    public final void b() {
        if (this.Z) {
            return;
        }
        this.Z = true;
        f();
    }

    @Override // defpackage.f2a
    public final void c(zl4 zl4Var) {
        if (dm4.f(this.v0, zl4Var)) {
            this.v0 = zl4Var;
            this.a.c(this);
        }
    }

    public final boolean d() {
        this.v0.g();
        AtomicReference atomicReference = this.u0;
        xz9[] xz9VarArr = B0;
        xz9[] xz9VarArr2 = (xz9[]) atomicReference.getAndSet(xz9VarArr);
        if (xz9VarArr2 == xz9VarArr) {
            return false;
        }
        for (xz9 xz9Var : xz9VarArr2) {
            xz9Var.getClass();
            dm4.a(xz9Var);
        }
        return true;
    }

    @Override // defpackage.f2a
    public final void e(Object obj) {
        if (this.Z) {
            return;
        }
        try {
            Object objMo131apply = this.b.mo131apply(obj);
            Objects.requireNonNull(objMo131apply, "The mapper returned a null ObservableSource");
            r1a r1aVar = (r1a) objMo131apply;
            if (this.o != Integer.MAX_VALUE) {
                synchronized (this) {
                    try {
                        int i = this.z0;
                        if (i == this.o) {
                            this.y0.offer(r1aVar);
                            return;
                        }
                        this.z0 = i + 1;
                    } finally {
                    }
                }
            }
            k(r1aVar);
        } catch (Throwable th) {
            c37.B(th);
            this.v0.g();
            onError(th);
        }
    }

    public final void f() {
        if (getAndIncrement() == 0) {
            i();
        }
    }

    @Override // defpackage.zl4
    public final void g() {
        this.t0 = true;
        if (d()) {
            this.s0.b();
        }
    }

    @Override // defpackage.zl4
    public final boolean h() {
        return this.t0;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x00c5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c4 A[PHI: r4
      0x00c4: PHI (r4v6 int) = (r4v4 int), (r4v7 int) binds: [B:57:0x00aa, B:66:0x00c2] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i() {
        /*
            Method dump skipped, instructions count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yz9.i():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void j(xz9 xz9Var) {
        xz9[] xz9VarArr;
        while (true) {
            AtomicReference atomicReference = this.u0;
            xz9[] xz9VarArr2 = (xz9[]) atomicReference.get();
            int length = xz9VarArr2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (xz9VarArr2[i] == xz9Var) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                xz9VarArr = A0;
            } else {
                xz9[] xz9VarArr3 = new xz9[length - 1];
                System.arraycopy(xz9VarArr2, 0, xz9VarArr3, 0, i);
                System.arraycopy(xz9VarArr2, i + 1, xz9VarArr3, i, (length - i) - 1);
                xz9VarArr = xz9VarArr3;
            }
            while (!atomicReference.compareAndSet(xz9VarArr2, xz9VarArr)) {
                if (atomicReference.get() != xz9VarArr2) {
                    break;
                }
            }
            return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void k(r1a r1aVar) {
        boolean z;
        do {
            z = false;
            if (!(r1aVar instanceof kde)) {
                this.w0++;
                xz9 xz9Var = new xz9(this);
                while (true) {
                    AtomicReference atomicReference = this.u0;
                    xz9[] xz9VarArr = (xz9[]) atomicReference.get();
                    if (xz9VarArr == B0) {
                        dm4.a(xz9Var);
                        return;
                    }
                    int length = xz9VarArr.length;
                    xz9[] xz9VarArr2 = new xz9[length + 1];
                    System.arraycopy(xz9VarArr, 0, xz9VarArr2, 0, length);
                    xz9VarArr2[length] = xz9Var;
                    while (!atomicReference.compareAndSet(xz9VarArr, xz9VarArr2)) {
                        if (atomicReference.get() != xz9VarArr) {
                            break;
                        }
                    }
                    r1aVar.a(xz9Var);
                    return;
                }
            }
            try {
                Object obj = ((kde) r1aVar).get();
                if (obj != null) {
                    if (get() == 0 && compareAndSet(0, 1)) {
                        this.a.e(obj);
                        if (decrementAndGet() != 0) {
                        }
                    } else {
                        bqd pwdVar = this.Y;
                        if (pwdVar == null) {
                            pwdVar = this.o == Integer.MAX_VALUE ? new pwd(this.X) : new owd(this.o);
                            this.Y = pwdVar;
                        }
                        pwdVar.offer(obj);
                        if (getAndIncrement() != 0) {
                            return;
                        }
                    }
                    i();
                }
            } catch (Throwable th) {
                c37.B(th);
                this.s0.a(th);
                f();
            }
            if (this.o == Integer.MAX_VALUE) {
                return;
            }
            synchronized (this) {
                try {
                    r1aVar = (r1a) this.y0.poll();
                    if (r1aVar == null) {
                        this.z0--;
                        z = true;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } while (!z);
        f();
    }

    public final void l(int i) {
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return;
            }
            synchronized (this) {
                try {
                    r1a r1aVar = (r1a) this.y0.poll();
                    if (r1aVar == null) {
                        this.z0--;
                    } else {
                        k(r1aVar);
                    }
                } finally {
                }
            }
            i = i2;
        }
    }

    @Override // defpackage.f2a
    public final void onError(Throwable th) {
        if (this.Z) {
            j47.Z(th);
        } else if (this.s0.a(th)) {
            this.Z = true;
            f();
        }
    }
}
