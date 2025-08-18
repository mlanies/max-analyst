package defpackage;

import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class hz9 extends w2 {
    public final /* synthetic */ int b;
    public final TimeUnit c;
    public final ztc o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hz9(xpb xpbVar, TimeUnit timeUnit, ztc ztcVar, int i) {
        super(xpbVar);
        this.b = i;
        this.c = timeUnit;
        this.o = ztcVar;
    }

    @Override // defpackage.qy9
    public final void q(f2a f2aVar) {
        switch (this.b) {
            case 0:
                this.a.a(new gz9(new y6d(f2aVar), this.c, this.o.a()));
                break;
            default:
                this.a.a(new x1a(f2aVar, this.c, this.o.a()));
                break;
        }
    }
}
