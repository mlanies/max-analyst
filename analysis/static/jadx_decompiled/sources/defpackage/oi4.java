package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class oi4 implements pi4 {
    public final long a;
    public final long b;
    public final w7c c;

    public oi4() {
        AtomicLong atomicLong = ei4.b;
        long jIncrementAndGet = atomicLong.incrementAndGet();
        this.a = jIncrementAndGet;
        long jIncrementAndGet2 = atomicLong.incrementAndGet();
        this.b = jIncrementAndGet2;
        eqe eqeVar = new eqe(m0c.oneme_settings_old_dev_menu);
        int i = woc.S;
        z44 z44Var = z44.e;
        this.c = new w7c(r0e.a(y53.M(new b54(jIncrementAndGet, eqeVar, i, null, z44Var, 8), new b54(jIncrementAndGet2, new eqe(m0c.oneme_settings_old_logs_menu), woc.e, null, z44Var, 8))));
    }

    @Override // defpackage.pi4
    public final j0e c() {
        return this.c;
    }

    @Override // defpackage.pi4
    public final void d(b54 b54Var) {
        long j = b54Var.a;
        if (ei4.a(j, this.b)) {
            hi4.c.P1().b(":settings/dev/logsviewer", null);
        } else if (ei4.a(j, this.a)) {
            hi4.c.P1().b(":settings/dev/showroom", null);
        }
    }
}
