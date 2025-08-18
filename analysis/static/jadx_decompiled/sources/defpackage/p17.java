package defpackage;

import one.me.login.inputname.InputNameScreen;

/* loaded from: classes2.dex */
public final /* synthetic */ class p17 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ InputNameScreen b;

    public /* synthetic */ p17(InputNameScreen inputNameScreen, int i) {
        this.a = i;
        this.b = inputNameScreen;
    }

    @Override // defpackage.k56
    public final Object invoke() {
        InputNameScreen inputNameScreen = this.b;
        switch (this.a) {
            case 0:
                bc7[] bc7VarArr = InputNameScreen.B0;
                return new x37(inputNameScreen.getRouter());
            case 1:
                bc7[] bc7VarArr2 = InputNameScreen.B0;
                bc7[] bc7VarArr3 = InputNameScreen.B0;
                bc7 bc7Var = bc7VarArr3[0];
                String str = (String) inputNameScreen.b.a(inputNameScreen);
                bc7 bc7Var2 = bc7VarArr3[1];
                return new w17(str, (String) inputNameScreen.c.a(inputNameScreen), lt7.a.getAccessor().d(gh3.class));
            default:
                bc7[] bc7VarArr4 = InputNameScreen.B0;
                w17 w17VarQ0 = inputNameScreen.q0();
                bc7 bc7Var3 = InputNameScreen.B0[5];
                String str2 = (String) inputNameScreen.z0.a(inputNameScreen);
                String strP0 = inputNameScreen.p0();
                boolean zR = w17VarQ0.r(1, str2);
                boolean zR2 = w17VarQ0.r(2, strP0);
                if (zR && zR2) {
                    pnf.o(w17VarQ0.Y, new o17(new afc(w17VarQ0.c, w17VarQ0.o, str2, strP0, null)));
                }
                inputNameScreen.m0().setActiveButtonLoaderState(!(inputNameScreen.n0().c() || inputNameScreen.o0().c()));
                return e5f.a;
        }
    }
}
