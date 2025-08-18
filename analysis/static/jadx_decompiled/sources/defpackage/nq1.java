package defpackage;

/* loaded from: classes.dex */
public final class nq1 extends m3 {
    public final /* synthetic */ oq1 s0;

    public nq1(oq1 oq1Var) {
        this.s0 = oq1Var;
    }

    @Override // defpackage.m3
    public final String g() {
        lq1 lq1Var = (lq1) this.s0.a.get();
        if (lq1Var == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return "tag=[" + lq1Var.a + "]";
    }
}
