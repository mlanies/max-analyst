package defpackage;

import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class b2a extends w2 {
    public final r1a X;
    public final long b;
    public final TimeUnit c;
    public final ztc o;

    public b2a(qy9 qy9Var, long j, TimeUnit timeUnit, ztc ztcVar) {
        super(qy9Var);
        this.b = j;
        this.c = timeUnit;
        this.o = ztcVar;
        this.X = null;
    }

    @Override // defpackage.qy9
    public final void q(f2a f2aVar) {
        r1a r1aVar = this.X;
        r1a r1aVar2 = this.a;
        ztc ztcVar = this.o;
        if (r1aVar == null) {
            z1a z1aVar = new z1a(f2aVar, this.b, this.c, ztcVar.a());
            f2aVar.c(z1aVar);
            zl4 zl4VarC = z1aVar.o.c(new es5(0L, z1aVar), z1aVar.b, z1aVar.c);
            uy1 uy1Var = z1aVar.X;
            uy1Var.getClass();
            dm4.c(uy1Var, zl4VarC);
            r1aVar2.a(z1aVar);
            return;
        }
        y1a y1aVar = new y1a(f2aVar, this.b, this.c, ztcVar.a());
        f2aVar.c(y1aVar);
        zl4 zl4VarC2 = y1aVar.o.c(new es5(0L, y1aVar), y1aVar.b, y1aVar.c);
        uy1 uy1Var2 = y1aVar.X;
        uy1Var2.getClass();
        dm4.c(uy1Var2, zl4VarC2);
        r1aVar2.a(y1aVar);
    }
}
