package defpackage;

import java.io.Closeable;

/* loaded from: classes.dex */
public final class f3 extends fi0 {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ f3(int i, Object obj) {
        this.b = i;
        this.c = obj;
    }

    @Override // defpackage.fi0
    public final void d() {
        switch (this.b) {
            case 0:
                m43 m43Var = (m43) this.c;
                synchronized (m43Var) {
                    od2.p(m43Var.g());
                }
                return;
            default:
                try {
                    f46.I();
                    vg9 vg9Var = (vg9) this.c;
                    synchronized (vg9Var) {
                        try {
                            if (vg9Var.g == this) {
                                vg9Var.g = null;
                                vg9Var.f = null;
                                vg9.b(vg9Var.c);
                                vg9Var.c = null;
                                vg9Var.i(3);
                            }
                        } finally {
                        }
                    }
                    return;
                } finally {
                    f46.I();
                }
        }
    }

    @Override // defpackage.fi0
    public final void f(Throwable th) {
        switch (this.b) {
            case 0:
                m43 m43Var = (m43) this.c;
                fcd fcdVar = m43Var.h;
                if (m43Var.j(th, fcdVar.Y)) {
                    m43Var.i.f(fcdVar, th);
                    return;
                }
                return;
            default:
                try {
                    if (f46.W()) {
                        f46.e("MultiplexProducer#onFailure");
                    }
                    ((vg9) this.c).f(this, th);
                    if (f46.W()) {
                        f46.A();
                        return;
                    }
                    return;
                } catch (Throwable th2) {
                    if (f46.W()) {
                        f46.A();
                    }
                    throw th2;
                }
        }
    }

    @Override // defpackage.fi0
    public final void h(int i, Object obj) {
        switch (this.b) {
            case 0:
                m43 m43Var = (m43) this.c;
                m43Var.o(obj, i, m43Var.h);
                return;
            default:
                Closeable closeable = (Closeable) obj;
                try {
                    if (f46.W()) {
                        f46.e("MultiplexProducer#onNewResult");
                    }
                    ((vg9) this.c).g(this, closeable, i);
                    if (f46.W()) {
                        f46.A();
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    if (f46.W()) {
                        f46.A();
                    }
                    throw th;
                }
        }
    }

    @Override // defpackage.fi0
    public final void j(float f) {
        switch (this.b) {
            case 0:
                ((m43) this.c).k(f);
                return;
            default:
                try {
                    if (f46.W()) {
                        f46.e("MultiplexProducer#onProgressUpdate");
                    }
                    ((vg9) this.c).h(this, f);
                    if (f46.W()) {
                        f46.A();
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    if (f46.W()) {
                        f46.A();
                    }
                    throw th;
                }
        }
    }
}
