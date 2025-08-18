package defpackage;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class az9 extends AtomicInteger implements f2a, zl4 {
    public final zy9 X;
    public final boolean Y;
    public dqd Z;
    public final f2a a;
    public final b66 b;
    public final int c;
    public final az o = new az();
    public zl4 s0;
    public volatile boolean t0;
    public volatile boolean u0;
    public volatile boolean v0;
    public int w0;

    public az9(f2a f2aVar, b66 b66Var, int i, boolean z) {
        this.a = f2aVar;
        this.b = b66Var;
        this.c = i;
        this.Y = z;
        this.X = new zy9(f2aVar, this, 0);
    }

    public final void a() {
        if (getAndIncrement() != 0) {
            return;
        }
        f2a f2aVar = this.a;
        dqd dqdVar = this.Z;
        az azVar = this.o;
        while (true) {
            if (!this.t0) {
                if (this.v0) {
                    dqdVar.clear();
                    return;
                }
                if (!this.Y && ((Throwable) azVar.get()) != null) {
                    dqdVar.clear();
                    this.v0 = true;
                    azVar.d(f2aVar);
                    return;
                }
                boolean z = this.u0;
                try {
                    Object objPoll = dqdVar.poll();
                    boolean z2 = objPoll == null;
                    if (z && z2) {
                        this.v0 = true;
                        azVar.d(f2aVar);
                        return;
                    }
                    if (!z2) {
                        try {
                            Object objMo131apply = this.b.mo131apply(objPoll);
                            Objects.requireNonNull(objMo131apply, "The mapper returned a null ObservableSource");
                            r1a r1aVar = (r1a) objMo131apply;
                            if (r1aVar instanceof kde) {
                                try {
                                    Object obj = ((kde) r1aVar).get();
                                    if (obj != null && !this.v0) {
                                        f2aVar.e(obj);
                                    }
                                } catch (Throwable th) {
                                    c37.B(th);
                                    azVar.a(th);
                                }
                            } else {
                                this.t0 = true;
                                r1aVar.a(this.X);
                            }
                        } catch (Throwable th2) {
                            c37.B(th2);
                            this.v0 = true;
                            this.s0.g();
                            dqdVar.clear();
                            azVar.a(th2);
                            azVar.d(f2aVar);
                            return;
                        }
                    }
                } catch (Throwable th3) {
                    c37.B(th3);
                    this.v0 = true;
                    this.s0.g();
                    azVar.a(th3);
                    azVar.d(f2aVar);
                    return;
                }
            }
            if (decrementAndGet() == 0) {
                return;
            }
        }
    }

    @Override // defpackage.f2a
    public final void b() {
        this.u0 = true;
        a();
    }

    @Override // defpackage.f2a
    public final void c(zl4 zl4Var) {
        if (dm4.f(this.s0, zl4Var)) {
            this.s0 = zl4Var;
            if (zl4Var instanceof tqb) {
                tqb tqbVar = (tqb) zl4Var;
                int iN = tqbVar.n(3);
                if (iN == 1) {
                    this.w0 = iN;
                    this.Z = tqbVar;
                    this.u0 = true;
                    this.a.c(this);
                    a();
                    return;
                }
                if (iN == 2) {
                    this.w0 = iN;
                    this.Z = tqbVar;
                    this.a.c(this);
                    return;
                }
            }
            this.Z = new pwd(this.c);
            this.a.c(this);
        }
    }

    @Override // defpackage.f2a
    public final void e(Object obj) {
        if (this.w0 == 0) {
            this.Z.offer(obj);
        }
        a();
    }

    @Override // defpackage.zl4
    public final void g() {
        this.v0 = true;
        this.s0.g();
        zy9 zy9Var = this.X;
        zy9Var.getClass();
        dm4.a(zy9Var);
        this.o.b();
    }

    @Override // defpackage.zl4
    public final boolean h() {
        return this.v0;
    }

    @Override // defpackage.f2a
    public final void onError(Throwable th) {
        if (this.o.a(th)) {
            this.u0 = true;
            a();
        }
    }
}
