package defpackage;

import one.me.login.confirm.ConfirmPhoneScreen;

/* loaded from: classes2.dex */
public final /* synthetic */ class ye3 implements m56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ConfirmPhoneScreen b;

    public /* synthetic */ ye3(ConfirmPhoneScreen confirmPhoneScreen, int i) {
        this.a = i;
        this.b = confirmPhoneScreen;
    }

    @Override // defpackage.m56
    public final Object invoke(Object obj) {
        e5f e5fVar = e5f.a;
        ConfirmPhoneScreen confirmPhoneScreen = this.b;
        switch (this.a) {
            case 0:
                bc7[] bc7VarArr = ConfirmPhoneScreen.C0;
                confirmPhoneScreen.getRouter().C();
                break;
            default:
                gg3 gg3Var = (gg3) obj;
                bc7[] bc7VarArr2 = ConfirmPhoneScreen.C0;
                if (gg3Var == gg3.SUCCESS) {
                    confirmPhoneScreen.r0().B0.m(null, Boolean.TRUE);
                    break;
                }
                break;
        }
        return e5fVar;
    }
}
