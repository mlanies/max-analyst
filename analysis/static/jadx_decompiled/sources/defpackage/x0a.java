package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class x0a extends AtomicBoolean implements f2a, zl4 {
    public final f2a a;
    public final y0a b;
    public final w0a c;
    public zl4 o;

    public x0a(f2a f2aVar, y0a y0aVar, w0a w0aVar) {
        this.a = f2aVar;
        this.b = y0aVar;
        this.c = w0aVar;
    }

    @Override // defpackage.f2a
    public final void b() {
        if (compareAndSet(false, true)) {
            this.b.x(this.c);
            this.a.b();
        }
    }

    @Override // defpackage.f2a
    public final void c(zl4 zl4Var) {
        if (dm4.f(this.o, zl4Var)) {
            this.o = zl4Var;
            this.a.c(this);
        }
    }

    @Override // defpackage.f2a
    public final void e(Object obj) {
        this.a.e(obj);
    }

    @Override // defpackage.zl4
    public final void g() {
        this.o.g();
        if (compareAndSet(false, true)) {
            y0a y0aVar = this.b;
            w0a w0aVar = this.c;
            synchronized (y0aVar) {
                try {
                    w0a w0aVar2 = y0aVar.c;
                    if (w0aVar2 != null && w0aVar2 == w0aVar) {
                        long j = w0aVar.b - 1;
                        w0aVar.b = j;
                        if (j == 0 && w0aVar.c) {
                            y0aVar.y(w0aVar);
                        }
                    }
                } finally {
                }
            }
        }
    }

    @Override // defpackage.zl4
    public final boolean h() {
        return this.o.h();
    }

    @Override // defpackage.f2a
    public final void onError(Throwable th) {
        if (!compareAndSet(false, true)) {
            j47.Z(th);
        } else {
            this.b.x(this.c);
            this.a.onError(th);
        }
    }
}
