package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public abstract class iqd {
    public static oqd f(Throwable th) {
        Objects.requireNonNull(th, "throwable is null");
        return new oqd(new t66(th), 1);
    }

    public static q1a g(Object obj) {
        Objects.requireNonNull(obj, "item is null");
        return new q1a(3, obj);
    }

    public final Object e() {
        mp0 mp0Var = new mp0(1);
        k(mp0Var);
        return mp0Var.d();
    }

    public final uqd h(b66 b66Var) {
        Objects.requireNonNull(b66Var, "mapper is null");
        return new uqd(this, b66Var, 1);
    }

    public final drd i(ztc ztcVar) {
        Objects.requireNonNull(ztcVar, "scheduler is null");
        return new drd(this, ztcVar, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ds5 j(dme dmeVar) {
        return new ds5(new yr5(this instanceof w66 ? ((w66) this).b() : new gr5(3, this), dmeVar, 0), 0);
    }

    public final void k(erd erdVar) {
        Objects.requireNonNull(erdVar, "observer is null");
        try {
            l(erdVar);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            c37.B(th);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    public abstract void l(erd erdVar);

    public final drd m(ztc ztcVar) {
        Objects.requireNonNull(ztcVar, "scheduler is null");
        return new drd(this, ztcVar, 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final qy9 n() {
        return this instanceof x66 ? ((x66) this).d() : new hb3(6, this);
    }
}
