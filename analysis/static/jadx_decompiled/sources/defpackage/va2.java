package defpackage;

/* loaded from: classes2.dex */
public final class va2 {
    public final /* synthetic */ zb2 a;

    public va2(zb2 zb2Var) {
        this.a = zb2Var;
    }

    @uae
    public final void onEvent(ut7 ut7Var) {
        hm9.n(zb2.K0 + "/bus", "LoginEvent");
        zb2 zb2Var = this.a;
        vxd vxdVar = zb2Var.y0;
        if (vxdVar != null && vxdVar.isCancelled()) {
            zb2Var.i();
        }
        sd7 sd7Var = zb2Var.A0;
        if (sd7Var == null || !sd7Var.h()) {
            return;
        }
        zb2Var.h();
    }
}
