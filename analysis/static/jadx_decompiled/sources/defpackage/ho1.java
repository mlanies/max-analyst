package defpackage;

import ru.ok.android.externcalls.sdk.util.CallsThreadUtilsKt;

/* loaded from: classes.dex */
public final /* synthetic */ class ho1 implements hnc, grd, xha {
    public final /* synthetic */ int a;
    public final /* synthetic */ k56 b;

    public /* synthetic */ ho1(int i, k56 k56Var) {
        this.a = i;
        this.b = k56Var;
    }

    @Override // defpackage.xha
    public void I(yha yhaVar) {
        k56 k56Var = this.b;
        if (k56Var != null) {
            k56Var.invoke();
        }
    }

    @Override // defpackage.hnc
    public void b() {
        int i = this.a;
        k56 k56Var = this.b;
        switch (i) {
            case 0:
                k56Var.invoke();
                break;
            default:
                k56Var.invoke();
                break;
        }
    }

    @Override // defpackage.grd
    public void j(nqd nqdVar) {
        CallsThreadUtilsKt.executeOnIoThread$lambda$0(this.b, nqdVar);
    }
}
