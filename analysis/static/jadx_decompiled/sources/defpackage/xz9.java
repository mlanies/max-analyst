package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class xz9 extends AtomicReference implements f2a {
    public final yz9 a;
    public volatile boolean b;
    public volatile dqd c;
    public int o;

    public xz9(yz9 yz9Var) {
        this.a = yz9Var;
    }

    @Override // defpackage.f2a
    public final void b() {
        this.b = true;
        this.a.f();
    }

    @Override // defpackage.f2a
    public final void c(zl4 zl4Var) {
        if (dm4.e(this, zl4Var) && (zl4Var instanceof tqb)) {
            tqb tqbVar = (tqb) zl4Var;
            int iN = tqbVar.n(7);
            if (iN == 1) {
                this.o = iN;
                this.c = tqbVar;
                this.b = true;
                this.a.f();
                return;
            }
            if (iN == 2) {
                this.o = iN;
                this.c = tqbVar;
            }
        }
    }

    @Override // defpackage.f2a
    public final void e(Object obj) {
        if (this.o != 0) {
            this.a.f();
            return;
        }
        yz9 yz9Var = this.a;
        if (yz9Var.get() == 0 && yz9Var.compareAndSet(0, 1)) {
            yz9Var.a.e(obj);
            if (yz9Var.decrementAndGet() == 0) {
                return;
            }
        } else {
            dqd pwdVar = this.c;
            if (pwdVar == null) {
                pwdVar = new pwd(yz9Var.X);
                this.c = pwdVar;
            }
            pwdVar.offer(obj);
            if (yz9Var.getAndIncrement() != 0) {
                return;
            }
        }
        yz9Var.i();
    }

    @Override // defpackage.f2a
    public final void onError(Throwable th) {
        if (this.a.s0.a(th)) {
            yz9 yz9Var = this.a;
            if (!yz9Var.c) {
                yz9Var.d();
            }
            this.b = true;
            this.a.f();
        }
    }
}
