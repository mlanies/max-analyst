package defpackage;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class t95 extends pnf {
    public vxd X;
    public final je7 b;
    public final je7 c;
    public final s35 o;

    public t95() {
        l95 l95Var = l95.a;
        khe kheVarD = l95Var.getAccessor().d(ome.class);
        khe kheVarD2 = l95Var.getAccessor().d(kke.class);
        this.b = kheVarD;
        this.c = kheVarD2;
        this.o = new s35(0);
    }

    @Override // defpackage.pnf
    public final void p() {
        vxd vxdVar = this.X;
        if (vxdVar != null) {
            vxdVar.cancel((CancellationException) null);
        }
        this.X = null;
    }
}
