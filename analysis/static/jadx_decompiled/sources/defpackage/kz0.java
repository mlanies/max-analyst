package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class kz0 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ yz0 b;

    public /* synthetic */ kz0(yz0 yz0Var, int i) {
        this.a = i;
        this.b = yz0Var;
    }

    @Override // defpackage.k56
    public final Object invoke() {
        switch (this.a) {
            case 0:
                yz0 yz0Var = this.b;
                ir6 ir6Var = hm9.m;
                if (ir6Var != null && ir6Var.c()) {
                    ir6Var.d(us7.X, "CallAdminSettingsController", "Low hands for all success.", null);
                }
                yz0Var.C0.g(new bb(true));
                return e5f.a;
            case 1:
                yz0 yz0Var2 = this.b;
                ir6 ir6Var2 = hm9.m;
                if (ir6Var2 != null && ir6Var2.c()) {
                    ir6Var2.d(us7.X, "CallAdminSettingsController", "Disable cameras for all once was success", null);
                }
                yz0Var2.C0.g(new ya(true));
                return e5f.a;
            case 2:
                return new nz0(this.b, 0);
            case 3:
                return new uz0(this.b);
            default:
                yz0 yz0Var3 = this.b;
                ir6 ir6Var3 = hm9.m;
                if (ir6Var3 != null && ir6Var3.c()) {
                    ir6Var3.d(us7.X, "CallAdminSettingsController", "Disable microphone for all once was success", null);
                }
                yz0Var3.C0.g(new ab(true));
                return e5f.a;
        }
    }
}
