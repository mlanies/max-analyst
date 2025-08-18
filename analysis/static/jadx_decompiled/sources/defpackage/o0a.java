package defpackage;

import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class o0a extends qy9 {
    public final ztc a;
    public final long b;
    public final long c;
    public final TimeUnit o;

    public o0a(long j, long j2, TimeUnit timeUnit, ztc ztcVar) {
        this.b = j;
        this.c = j2;
        this.o = timeUnit;
        this.a = ztcVar;
    }

    @Override // defpackage.qy9
    public final void q(f2a f2aVar) {
        n0a n0aVar = new n0a(f2aVar);
        f2aVar.c(n0aVar);
        ztc ztcVar = this.a;
        if (!(ztcVar instanceof u0f)) {
            dm4.e(n0aVar, ztcVar.d(n0aVar, this.b, this.c, this.o));
        } else {
            ((u0f) ztcVar).getClass();
            t0f t0fVar = new t0f();
            dm4.e(n0aVar, t0fVar);
            t0fVar.d(n0aVar, this.b, this.c, this.o);
        }
    }
}
