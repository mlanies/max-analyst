package defpackage;

import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class o1a extends w2 {
    public final boolean X;
    public final long b;
    public final TimeUnit c;
    public final ztc o;

    public o1a(r1a r1aVar, long j, TimeUnit timeUnit, ztc ztcVar, boolean z) {
        super(r1aVar);
        this.b = j;
        this.c = timeUnit;
        this.o = ztcVar;
        this.X = z;
    }

    @Override // defpackage.qy9
    public final void q(f2a f2aVar) {
        y6d y6dVar = new y6d(f2aVar);
        boolean z = this.X;
        r1a r1aVar = this.a;
        if (z) {
            r1aVar.a(new l1a(y6dVar, this.b, this.c, this.o));
            return;
        }
        r1aVar.a(new m1a(y6dVar, this.b, this.c, this.o));
    }
}
