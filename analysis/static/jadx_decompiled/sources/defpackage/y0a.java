package defpackage;

import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class y0a extends qy9 {
    public final vg3 a;
    public final int b;
    public w0a c;

    public y0a(vg3 vg3Var) {
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        this.a = vg3Var;
        this.b = 1;
    }

    @Override // defpackage.qy9
    public final void q(f2a f2aVar) {
        w0a w0aVar;
        boolean z;
        synchronized (this) {
            try {
                w0aVar = this.c;
                if (w0aVar == null) {
                    w0aVar = new w0a(this);
                    this.c = w0aVar;
                }
                long j = w0aVar.b + 1;
                w0aVar.b = j;
                if (w0aVar.c || j != this.b) {
                    z = false;
                } else {
                    z = true;
                    w0aVar.c = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.a.a(new x0a(f2aVar, this, w0aVar));
        if (z) {
            this.a.x(w0aVar);
        }
    }

    public final void x(w0a w0aVar) {
        synchronized (this) {
            try {
                if (this.c == w0aVar) {
                    w0aVar.getClass();
                    long j = w0aVar.b - 1;
                    w0aVar.b = j;
                    if (j == 0) {
                        this.c = null;
                        this.a.y();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void y(w0a w0aVar) {
        synchronized (this) {
            try {
                if (w0aVar.b == 0 && w0aVar == this.c) {
                    this.c = null;
                    zl4 zl4Var = (zl4) w0aVar.get();
                    dm4.a(w0aVar);
                    if (zl4Var == null) {
                        w0aVar.o = true;
                    } else {
                        this.a.y();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
