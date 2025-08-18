package defpackage;

import java.io.File;

/* loaded from: classes2.dex */
public final class dq6 extends qy9 {
    public static final /* synthetic */ int o = 0;
    public final je7 a;
    public final File b;
    public final ztc c;

    public dq6(khe kheVar, File file, ztc ztcVar) {
        this.a = kheVar;
        this.b = file;
        this.c = ztcVar;
    }

    @Override // defpackage.qy9
    public final void q(f2a f2aVar) {
        xtc xtcVarA = this.c.a();
        cq6 cq6Var = new cq6(f2aVar, (khe) this.a, this.b, xtcVarA);
        f2aVar.c(cq6Var);
        if (cq6Var.Y.get()) {
            return;
        }
        ((iq6) cq6Var.a.getValue()).b(cq6Var.b, cq6Var.c, cq6Var, null);
    }
}
