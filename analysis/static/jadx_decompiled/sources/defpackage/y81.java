package defpackage;

import android.content.Context;
import android.widget.FrameLayout;
import one.me.calls.ui.ui.incoming.CallIncomingScreen;

/* loaded from: classes.dex */
public final class y81 extends FrameLayout implements bk1 {
    public final /* synthetic */ CallIncomingScreen a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y81(CallIncomingScreen callIncomingScreen, Context context) {
        super(context);
        this.a = callIncomingScreen;
        setId(rvb.call_screen_incoming_container_id);
        setBackgroundColor(qp4.u0.p(this).c.b().k);
        no1 no1Var = new no1(getContext(), null);
        no1Var.setId(rvb.call_incoming_avatar);
        no1Var.setMode(jo1.a);
        no1Var.setBackgroundState(ko1.b);
        addView(no1Var, -1, -1);
    }

    @Override // defpackage.bk1
    public final void a(boolean z) {
        if (z) {
            CallIncomingScreen callIncomingScreen = this.a;
            if (callIncomingScreen.getView() == null) {
                return;
            }
            ((no1) callIncomingScreen.c.T0(callIncomingScreen, CallIncomingScreen.s0[0])).a(z);
        }
    }

    @Override // defpackage.bk1
    public final void h(kl7 kl7Var, boolean z, long j) {
        crd crdVar = CallIncomingScreen.Z;
        CallIncomingScreen callIncomingScreen = this.a;
        callIncomingScreen.getClass();
        ((no1) callIncomingScreen.c.T0(callIncomingScreen, CallIncomingScreen.s0[0])).h(kl7Var, z, j);
    }
}
