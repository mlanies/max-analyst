package defpackage;

import java.lang.Thread;
import java.util.EnumMap;
import java.util.concurrent.atomic.AtomicLong;
import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes.dex */
public final class ate implements pi4 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final EnumMap e;
    public final ContextScope f;
    public z87 g;
    public final wwc h;

    public ate(je7 je7Var) {
        AtomicLong atomicLong = ei4.b;
        this.a = atomicLong.incrementAndGet();
        this.b = atomicLong.incrementAndGet();
        this.c = atomicLong.incrementAndGet();
        this.d = atomicLong.incrementAndGet();
        this.e = new EnumMap(Thread.State.class);
        this.f = j1e.a(((w9a) ((kke) je7Var.getValue())).a());
        e5f e5fVar = e5f.a;
        ua3 ua3Var = new ua3(null);
        ua3Var.makeCompleting$kotlinx_coroutines_core(e5fVar);
        this.g = ua3Var;
        this.h = new wwc(this);
    }

    @Override // defpackage.pi4
    public final j0e c() {
        return this.h;
    }

    @Override // defpackage.pi4
    public final void d(b54 b54Var) {
        long j = b54Var.a;
        if (ei4.a(j, this.a) && !this.g.isActive()) {
            this.g = j47.T(this.f, null, null, new zse(2, null), 3);
        } else if (ei4.a(j, this.d)) {
            hi4.c.P1().b(":settings/dev/threadsviewer", null);
        }
    }
}
