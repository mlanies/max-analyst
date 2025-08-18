package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class k1a extends AtomicInteger implements f2a, zl4 {
    public final r1a Z;
    public final f2a a;
    public final vg3 o;
    public volatile boolean s0;
    public final AtomicInteger b = new AtomicInteger();
    public final az c = new az();
    public final br5 X = new br5(this);
    public final AtomicReference Y = new AtomicReference();

    public k1a(f2a f2aVar, b7d b7dVar, r1a r1aVar) {
        this.a = f2aVar;
        this.o = b7dVar;
        this.Z = r1aVar;
    }

    public final void a() {
        if (this.b.getAndIncrement() == 0) {
            while (!h()) {
                if (!this.s0) {
                    this.s0 = true;
                    this.Z.a(this);
                }
                if (this.b.decrementAndGet() == 0) {
                    return;
                }
            }
        }
    }

    @Override // defpackage.f2a
    public final void b() {
        dm4.a(this.X);
        if (getAndIncrement() == 0) {
            this.c.d(this.a);
        }
    }

    @Override // defpackage.f2a
    public final void c(zl4 zl4Var) {
        dm4.c(this.Y, zl4Var);
    }

    @Override // defpackage.f2a
    public final void e(Object obj) {
        if (get() == 0 && compareAndSet(0, 1)) {
            f2a f2aVar = this.a;
            f2aVar.e(obj);
            if (decrementAndGet() != 0) {
                this.c.d(f2aVar);
            }
        }
    }

    @Override // defpackage.zl4
    public final void g() {
        dm4.a(this.Y);
        dm4.a(this.X);
    }

    @Override // defpackage.zl4
    public final boolean h() {
        return dm4.b((zl4) this.Y.get());
    }

    @Override // defpackage.f2a
    public final void onError(Throwable th) {
        dm4.c(this.Y, null);
        this.s0 = false;
        this.o.e(th);
    }
}
