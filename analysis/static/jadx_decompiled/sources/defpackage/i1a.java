package defpackage;

import io.reactivex.rxjava3.exceptions.CompositeException;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class i1a extends AtomicInteger implements f2a {
    public long X;
    public final f2a a;
    public final uy1 b;
    public final r1a c;
    public final b7b o;

    public i1a(f2a f2aVar, long j, b7b b7bVar, uy1 uy1Var, r1a r1aVar) {
        this.a = f2aVar;
        this.b = uy1Var;
        this.c = r1aVar;
        this.o = b7bVar;
        this.X = j;
    }

    public final void a() {
        if (getAndIncrement() == 0) {
            int iAddAndGet = 1;
            while (!this.b.h()) {
                this.c.a(this);
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }
    }

    @Override // defpackage.f2a
    public final void b() {
        this.a.b();
    }

    @Override // defpackage.f2a
    public final void c(zl4 zl4Var) {
        uy1 uy1Var = this.b;
        uy1Var.getClass();
        dm4.c(uy1Var, zl4Var);
    }

    @Override // defpackage.f2a
    public final void e(Object obj) {
        this.a.e(obj);
    }

    @Override // defpackage.f2a
    public final void onError(Throwable th) {
        long j = this.X;
        if (j != Long.MAX_VALUE) {
            this.X = j - 1;
        }
        f2a f2aVar = this.a;
        if (j == 0) {
            f2aVar.onError(th);
            return;
        }
        try {
            if (this.o.test(th)) {
                a();
            } else {
                f2aVar.onError(th);
            }
        } catch (Throwable th2) {
            c37.B(th2);
            f2aVar.onError(new CompositeException(th, th2));
        }
    }
}
