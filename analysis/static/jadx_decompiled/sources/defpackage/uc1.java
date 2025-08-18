package defpackage;

import one.me.calllist.ui.callinfo.CallLinkInfoScreen;

/* loaded from: classes.dex */
public final /* synthetic */ class uc1 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ CallLinkInfoScreen b;

    public /* synthetic */ uc1(CallLinkInfoScreen callLinkInfoScreen, int i) {
        this.a = i;
        this.b = callLinkInfoScreen;
    }

    @Override // defpackage.k56
    public final Object invoke() {
        int i = 0;
        CallLinkInfoScreen callLinkInfoScreen = this.b;
        switch (this.a) {
            case 0:
                b46 b46Var = CallLinkInfoScreen.B0;
                return callLinkInfoScreen.getRouter();
            case 1:
                b46 b46Var2 = CallLinkInfoScreen.B0;
                return new rd0(kt3.b(callLinkInfoScreen.getContext(), q7a.c), l5a.a, qp4.u0.b(callLinkInfoScreen.getContext()).i(), new k8(28), new k8(29));
            case 2:
                b46 b46Var3 = CallLinkInfoScreen.B0;
                return new od0(kt3.b(callLinkInfoScreen.getContext(), q7a.a), j5a.a, callLinkInfoScreen.getContext(), new k8(23), new k8(24));
            default:
                b46 b46Var4 = CallLinkInfoScreen.B0;
                return new rg1(new khe(new uc1(callLinkInfoScreen, i)), new l5g(callLinkInfoScreen, 0));
        }
    }
}
