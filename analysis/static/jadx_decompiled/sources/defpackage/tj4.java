package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class tj4 implements moc {
    public final /* synthetic */ int a;
    public final /* synthetic */ uj4 b;

    public /* synthetic */ tj4(uj4 uj4Var, int i) {
        this.a = i;
        this.b = uj4Var;
    }

    @Override // defpackage.moc
    public void a(hoc hocVar, roc rocVar) {
        int i = this.a;
        f6f f6fVar = (f6f) rocVar;
        uj4 uj4Var = this.b;
        uj4Var.getClass();
        switch (i) {
            case 0:
                if (!f6fVar.a.isEmpty()) {
                    uj4Var.a.log("DisplayLayouts", "Resend next time after response with errors");
                    uj4Var.e = true;
                    break;
                }
                break;
            default:
                uj4Var.a.log("DisplayLayouts", "Stop stream on participant removed response: " + f6fVar);
                break;
        }
    }

    public void b(hoc hocVar, Throwable th) {
        switch (this.a) {
            case 1:
                uj4 uj4Var = this.b;
                uj4Var.a.log("DisplayLayouts", "Resend next time after error");
                uj4Var.e = true;
                break;
            default:
                uj4 uj4Var2 = this.b;
                uj4Var2.getClass();
                uj4Var2.a.log("DisplayLayouts", "Stop stream on participant removed error: " + th.getMessage());
                break;
        }
    }
}
