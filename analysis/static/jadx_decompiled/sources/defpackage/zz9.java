package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public final class zz9 extends vk0 implements f2a {
    public zl4 Y;
    public volatile boolean Z;
    public final f2a a;
    public final b66 c;
    public final boolean o;
    public final az b = new az();
    public final hc3 X = new hc3();

    public zz9(f2a f2aVar, b66 b66Var, boolean z) {
        this.a = f2aVar;
        this.c = b66Var;
        this.o = z;
        lazySet(1);
    }

    @Override // defpackage.f2a
    public final void b() {
        if (decrementAndGet() == 0) {
            this.b.d(this.a);
        }
    }

    @Override // defpackage.f2a
    public final void c(zl4 zl4Var) {
        if (dm4.f(this.Y, zl4Var)) {
            this.Y = zl4Var;
            this.a.c(this);
        }
    }

    @Override // defpackage.dqd
    public final void clear() {
    }

    @Override // defpackage.f2a
    public final void e(Object obj) {
        try {
            Object objMo131apply = this.c.mo131apply(obj);
            Objects.requireNonNull(objMo131apply, "The mapper returned a null CompletableSource");
            pa3 pa3Var = (pa3) objMo131apply;
            getAndIncrement();
            nqd nqdVar = new nqd(this);
            if (this.Z || !this.X.a(nqdVar)) {
                return;
            }
            pa3Var.i(nqdVar);
        } catch (Throwable th) {
            c37.B(th);
            this.Y.g();
            onError(th);
        }
    }

    @Override // defpackage.zl4
    public final void g() {
        this.Z = true;
        this.Y.g();
        this.X.g();
        this.b.b();
    }

    @Override // defpackage.zl4
    public final boolean h() {
        return this.Y.h();
    }

    @Override // defpackage.dqd
    public final boolean isEmpty() {
        return true;
    }

    @Override // defpackage.uqb
    public final int n(int i) {
        return 2;
    }

    @Override // defpackage.f2a
    public final void onError(Throwable th) {
        if (this.b.a(th)) {
            if (this.o) {
                if (decrementAndGet() == 0) {
                    this.b.d(this.a);
                }
            } else {
                this.Z = true;
                this.Y.g();
                this.X.g();
                this.b.d(this.a);
            }
        }
    }

    @Override // defpackage.dqd
    public final Object poll() {
        return null;
    }
}
