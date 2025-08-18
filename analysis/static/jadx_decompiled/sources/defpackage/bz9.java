package defpackage;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class bz9 extends AtomicInteger implements f2a, zl4 {
    public dqd X;
    public zl4 Y;
    public volatile boolean Z;
    public final f2a a;
    public final b66 b;
    public final zy9 c;
    public final int o;
    public volatile boolean s0;
    public volatile boolean t0;
    public int u0;

    public bz9(y6d y6dVar, b66 b66Var, int i) {
        this.a = y6dVar;
        this.b = b66Var;
        this.o = i;
        this.c = new zy9(y6dVar, this, 1);
    }

    public final void a() {
        if (getAndIncrement() != 0) {
            return;
        }
        while (!this.s0) {
            if (!this.Z) {
                boolean z = this.t0;
                try {
                    Object objPoll = this.X.poll();
                    boolean z2 = objPoll == null;
                    if (z && z2) {
                        this.s0 = true;
                        this.a.b();
                        return;
                    }
                    if (!z2) {
                        try {
                            Object objMo131apply = this.b.mo131apply(objPoll);
                            Objects.requireNonNull(objMo131apply, "The mapper returned a null ObservableSource");
                            r1a r1aVar = (r1a) objMo131apply;
                            this.Z = true;
                            r1aVar.a(this.c);
                        } catch (Throwable th) {
                            c37.B(th);
                            g();
                            this.X.clear();
                            this.a.onError(th);
                            return;
                        }
                    }
                } catch (Throwable th2) {
                    c37.B(th2);
                    g();
                    this.X.clear();
                    this.a.onError(th2);
                    return;
                }
            }
            if (decrementAndGet() == 0) {
                return;
            }
        }
        this.X.clear();
    }

    @Override // defpackage.f2a
    public final void b() {
        if (this.t0) {
            return;
        }
        this.t0 = true;
        a();
    }

    @Override // defpackage.f2a
    public final void c(zl4 zl4Var) {
        if (dm4.f(this.Y, zl4Var)) {
            this.Y = zl4Var;
            if (zl4Var instanceof tqb) {
                tqb tqbVar = (tqb) zl4Var;
                int iN = tqbVar.n(3);
                if (iN == 1) {
                    this.u0 = iN;
                    this.X = tqbVar;
                    this.t0 = true;
                    this.a.c(this);
                    a();
                    return;
                }
                if (iN == 2) {
                    this.u0 = iN;
                    this.X = tqbVar;
                    this.a.c(this);
                    return;
                }
            }
            this.X = new pwd(this.o);
            this.a.c(this);
        }
    }

    @Override // defpackage.f2a
    public final void e(Object obj) {
        if (this.t0) {
            return;
        }
        if (this.u0 == 0) {
            this.X.offer(obj);
        }
        a();
    }

    @Override // defpackage.zl4
    public final void g() {
        this.s0 = true;
        zy9 zy9Var = this.c;
        zy9Var.getClass();
        dm4.a(zy9Var);
        this.Y.g();
        if (getAndIncrement() == 0) {
            this.X.clear();
        }
    }

    @Override // defpackage.zl4
    public final boolean h() {
        return this.s0;
    }

    @Override // defpackage.f2a
    public final void onError(Throwable th) {
        if (this.t0) {
            j47.Z(th);
            return;
        }
        this.t0 = true;
        g();
        this.a.onError(th);
    }
}
