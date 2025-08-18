package defpackage;

import one.me.calllist.ui.CallHistoryScreen;

/* loaded from: classes.dex */
public final /* synthetic */ class o81 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ CallHistoryScreen b;

    public /* synthetic */ o81(CallHistoryScreen callHistoryScreen, int i) {
        this.a = i;
        this.b = callHistoryScreen;
    }

    @Override // defpackage.k56
    public final Object invoke() {
        q0e q0eVar;
        Object value;
        CallHistoryScreen callHistoryScreen = this.b;
        switch (this.a) {
            case 0:
                bc7[] bc7VarArr = CallHistoryScreen.C0;
                u81 u81VarN0 = callHistoryScreen.n0();
                do {
                    q0eVar = u81VarN0.Z;
                    value = q0eVar.getValue();
                } while (!q0eVar.c(value, new s81()));
                ((cla) callHistoryScreen.Y.T0(callHistoryScreen, CallHistoryScreen.C0[1])).a();
                return e5f.a;
            case 1:
                bc7[] bc7VarArr2 = CallHistoryScreen.C0;
                m5d m5dVar = new m5d(iyc.p, iyc.d, callHistoryScreen.a, iyc.g);
                rg1 rg1Var = (rg1) callHistoryScreen.o.getValue();
                return new u81(callHistoryScreen.b, iyc.a(), m5dVar, rg1Var);
            case 2:
                bc7[] bc7VarArr3 = CallHistoryScreen.C0;
                return new rg1(new khe(new o81(callHistoryScreen, 3)), new l5g(callHistoryScreen, 0));
            default:
                bc7[] bc7VarArr4 = CallHistoryScreen.C0;
                return callHistoryScreen.getRouter();
        }
    }
}
