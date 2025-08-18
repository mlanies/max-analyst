package defpackage;

import java.util.Comparator;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class qy9 implements r1a {
    public static iz9 g(Throwable th) {
        Objects.requireNonNull(th, "throwable is null");
        return new iz9(new t66(th), 1);
    }

    public static hb3 j(Iterable iterable) {
        Objects.requireNonNull(iterable, "source is null");
        return new hb3(4, iterable);
    }

    public static o0a k(long j, long j2, TimeUnit timeUnit, ztc ztcVar) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(ztcVar, "scheduler is null");
        return new o0a(Math.max(0L, j), Math.max(0L, j2), timeUnit, ztcVar);
    }

    public static o0a l(long j, TimeUnit timeUnit) {
        return k(j, j, timeUnit, muc.a());
    }

    public static p0a m(Object obj) {
        Objects.requireNonNull(obj, "item is null");
        return new p0a(obj);
    }

    public static d2a u(long j, TimeUnit timeUnit, ztc ztcVar) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(ztcVar, "scheduler is null");
        return new d2a(Math.max(j, 0L), timeUnit, ztcVar);
    }

    @Override // defpackage.r1a
    public final void a(f2a f2aVar) {
        Objects.requireNonNull(f2aVar, "observer is null");
        try {
            q(f2aVar);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            c37.B(th);
            j47.Z(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final qy9 d(b66 b66Var) {
        hm9.j0(2, "bufferSize");
        if (!(this instanceof msc)) {
            return new cz9(this, b66Var, 2, 1);
        }
        Object obj = ((msc) this).get();
        return obj == null ? vz9.a : new q28(obj, b66Var, 2);
    }

    public final q28 f(b66 b66Var) {
        hm9.j0(2, "bufferSize");
        return new q28(this, b66Var, 1);
    }

    public final qy9 h(b66 b66Var) {
        return i(b66Var, Integer.MAX_VALUE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final qy9 i(b66 b66Var, int i) {
        int i2 = wq5.a;
        hm9.j0(i, "maxConcurrency");
        hm9.j0(i2, "bufferSize");
        if (!(this instanceof msc)) {
            return new cz9((r1a) this, b66Var, i, i2);
        }
        Object obj = ((msc) this).get();
        return obj == null ? vz9.a : new q28(obj, b66Var, 2);
    }

    public final r0a n(ztc ztcVar) {
        int i = wq5.a;
        Objects.requireNonNull(ztcVar, "scheduler is null");
        hm9.j0(i, "bufferSize");
        return new r0a(this, ztcVar, i);
    }

    public final j1a o(long j, b7b b7bVar) {
        if (j >= 0) {
            return new j1a(this, j, b7bVar);
        }
        throw new IllegalArgumentException(ey8.h(j, "times >= 0 required but it was "));
    }

    public final sd7 p(qj3 qj3Var) {
        sd7 sd7Var = new sd7(qj3Var, ft.f, ft.d);
        a(sd7Var);
        return sd7Var;
    }

    public abstract void q(f2a f2aVar);

    public final s1a r(ztc ztcVar) {
        Objects.requireNonNull(ztcVar, "scheduler is null");
        return new s1a(this, ztcVar, 0);
    }

    public final u1a s(long j) {
        if (j >= 0) {
            return new u1a(this, j);
        }
        throw new IllegalArgumentException(ey8.h(j, "count >= 0 required but it was "));
    }

    public final w1a t(long j, TimeUnit timeUnit) {
        ztc ztcVarA = muc.a();
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(ztcVarA, "scheduler is null");
        return new w1a(this, j, timeUnit, ztcVarA);
    }

    public final vy9 v() {
        hm9.j0(16, "capacityHint");
        return new vy9(this);
    }

    public final uqd w(Comparator comparator) {
        return v().h(new gd1(13, comparator));
    }
}
