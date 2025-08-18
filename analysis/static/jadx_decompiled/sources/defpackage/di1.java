package defpackage;

import one.me.calls.ui.ui.call.CallScreen;

/* loaded from: classes.dex */
public final /* synthetic */ class di1 implements m56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ CallScreen b;

    public /* synthetic */ di1(CallScreen callScreen, int i) {
        this.a = i;
        this.b = callScreen;
    }

    @Override // defpackage.m56
    public final Object invoke(Object obj) {
        e5f e5fVar = e5f.a;
        CallScreen callScreen = this.b;
        switch (this.a) {
            case 0:
                yxc yxcVar = CallScreen.R0;
                callScreen.D0().c.a((nnf) obj);
                break;
            case 1:
                if (((Boolean) obj).booleanValue() && !callScreen.t0) {
                    callScreen.D0().t(true);
                }
                callScreen.z0.c();
                break;
            default:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                yxc yxcVar2 = CallScreen.R0;
                if (!zBooleanValue) {
                    callScreen.D0().t(false);
                    break;
                }
                break;
        }
        return e5fVar;
    }
}
