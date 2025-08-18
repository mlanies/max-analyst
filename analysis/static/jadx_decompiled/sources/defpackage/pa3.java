package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public abstract class pa3 {
    public final void a() {
        mp0 mp0Var = new mp0(1);
        i(mp0Var);
        mp0Var.d();
    }

    public final qa3 e(pa3 pa3Var) {
        Objects.requireNonNull(pa3Var, "other is null");
        return new qa3(this, 0, pa3Var);
    }

    public final db3 f(f6 f6Var) {
        return new db3(this, ft.e, f6Var);
    }

    public final db3 g(qj3 qj3Var) {
        return new db3(this, qj3Var, ft.d);
    }

    public final za3 h(ztc ztcVar) {
        Objects.requireNonNull(ztcVar, "scheduler is null");
        return new za3(this, ztcVar, 0);
    }

    public final void i(ab3 ab3Var) {
        Objects.requireNonNull(ab3Var, "observer is null");
        try {
            j(ab3Var);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            c37.B(th);
            j47.Z(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't pass out an exception otherwise...");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    public abstract void j(ab3 ab3Var);

    public final za3 k(ztc ztcVar) {
        Objects.requireNonNull(ztcVar, "scheduler is null");
        return new za3(this, ztcVar, 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final qy9 l() {
        return this instanceof x66 ? ((x66) this).d() : new hb3(0, this);
    }
}
