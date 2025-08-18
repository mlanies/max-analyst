package defpackage;

import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class w1a extends w2 {
    public final long b;
    public final TimeUnit c;
    public final ztc o;

    public w1a(r1a r1aVar, long j, TimeUnit timeUnit, ztc ztcVar) {
        super(r1aVar);
        this.b = j;
        this.c = timeUnit;
        this.o = ztcVar;
    }

    @Override // defpackage.qy9
    public final void q(f2a f2aVar) {
        this.a.a(new v1a(new y6d(f2aVar), this.b, this.c, this.o.a()));
    }
}
