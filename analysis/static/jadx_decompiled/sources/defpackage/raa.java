package defpackage;

/* loaded from: classes.dex */
public final class raa implements qo4 {
    public final /* synthetic */ String a;
    public final /* synthetic */ iab b;

    public raa(String str, iab iabVar) {
        this.a = str;
        this.b = iabVar;
    }

    @Override // defpackage.qo4
    public final void e(dn4 dn4Var, Exception exc) {
        if (tpa.f(dn4Var.a.a, this.a)) {
            hm9.n("OneMeDownloadController", "onDownloadChanged, " + dn4Var.a.a + ", " + dn4Var.b + ", " + dn4Var.h.b + "%");
            if (exc != null) {
                ((fab) this.b).i(exc);
                return;
            }
            fab fabVar = (fab) this.b;
            fabVar.getClass();
            fabVar.n(dn4Var);
            int i = dn4Var.b;
            if (i == 1 || i == 3 || i == 4 || i == 5) {
                fab fabVar2 = (fab) this.b;
                fabVar2.getClass();
                if (fabVar2.a.p()) {
                    return;
                }
                fab fabVar3 = (fab) this.b;
                fabVar3.getClass();
                fabVar3.i(null);
            }
        }
    }

    @Override // defpackage.qo4
    public final void f(so4 so4Var, dn4 dn4Var) {
        if (tpa.f(dn4Var.a.a, this.a)) {
            so4Var.e.remove(this);
            fab fabVar = (fab) this.b;
            fabVar.getClass();
            if (fabVar.a.p()) {
                return;
            }
            fabVar.getClass();
            fabVar.i(null);
        }
    }
}
