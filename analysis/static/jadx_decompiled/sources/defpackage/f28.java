package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public abstract class f28 implements f38 {
    public static u28 e(Object obj) {
        Objects.requireNonNull(obj, "item is null");
        return new u28(obj);
    }

    @Override // defpackage.f38
    public final void a(b38 b38Var) {
        Objects.requireNonNull(b38Var, "observer is null");
        try {
            g(b38Var);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            c37.B(th);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    public final Object b() {
        mp0 mp0Var = new mp0(1);
        a(mp0Var);
        return mp0Var.d();
    }

    public final Object c(Object obj) throws InterruptedException {
        Objects.requireNonNull(obj, "defaultValue is null");
        mp0 mp0Var = new mp0(1);
        a(mp0Var);
        if (mp0Var.getCount() != 0) {
            try {
                mp0Var.await();
            } catch (InterruptedException e) {
                mp0Var.o = true;
                zl4 zl4Var = mp0Var.c;
                if (zl4Var != null) {
                    zl4Var.g();
                }
                throw q45.f(e);
            }
        }
        Throwable th = mp0Var.b;
        if (th != null) {
            throw q45.f(th);
        }
        Object obj2 = mp0Var.a;
        return obj2 != null ? obj2 : obj;
    }

    public final a38 f(ztc ztcVar) {
        Objects.requireNonNull(ztcVar, "scheduler is null");
        return new a38(this, ztcVar, 0);
    }

    public abstract void g(b38 b38Var);

    public final a38 h(ztc ztcVar) {
        Objects.requireNonNull(ztcVar, "scheduler is null");
        return new a38(this, ztcVar, 1);
    }
}
