package defpackage;

import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class zrd extends iqd {
    public final iqd X = null;
    public final iqd a;
    public final long b;
    public final TimeUnit c;
    public final ztc o;

    public zrd(uqd uqdVar, long j, TimeUnit timeUnit, ztc ztcVar) {
        this.a = uqdVar;
        this.b = j;
        this.c = timeUnit;
        this.o = ztcVar;
    }

    @Override // defpackage.iqd
    public final void l(erd erdVar) {
        yrd yrdVar = new yrd(erdVar, this.X, this.b, this.c);
        erdVar.c(yrdVar);
        dm4.c(yrdVar.b, this.o.c(yrdVar, this.b, this.c));
        this.a.k(yrdVar);
    }
}
