package defpackage;

import android.view.View;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.calls.ui.ui.incoming.CallIncomingScreen;

/* loaded from: classes.dex */
public final class z81 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ CallIncomingScreen Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z81(CallIncomingScreen callIncomingScreen, Continuation continuation) {
        super(2, continuation);
        this.Y = callIncomingScreen;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        z81 z81Var = (z81) n((c91) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        z81Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        z81 z81Var = new z81(this.Y, continuation);
        z81Var.X = obj;
        return z81Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        c91 c91Var = (c91) this.X;
        boolean z = c91Var instanceof a91;
        CallIncomingScreen callIncomingScreen = this.Y;
        if (z) {
            crd crdVar = CallIncomingScreen.Z;
            callIncomingScreen.getClass();
            no1 no1Var = (no1) callIncomingScreen.c.T0(callIncomingScreen, CallIncomingScreen.s0[0]);
            a91 a91Var = (a91) c91Var;
            md0 md0Var = a91Var.a.c;
            bc7[] bc7VarArr = no1.s1;
            no1Var.getClass();
            String str = md0Var != null ? md0Var.b : null;
            uc0 uc0Var = md0Var != null ? md0Var.a : null;
            s5a s5aVar = no1Var.G0;
            s5a.h(s5aVar, str, uc0Var);
            s5aVar.setCustomOverlay(null);
            no1Var.setName(a91Var.a.b);
            no1Var.setStatus(a91Var.c);
            no1Var.Q(ztb.ic_cancel_call_25, f0c.call_incoming_decline_accessibility, new e11(0, callIncomingScreen.m0(), e91.class, "declineCall", "declineCall()V", 0, 1));
            no1Var.R(true, ztb.ic_call_22, f0c.call_incoming_accept_accessibility, new e11(0, callIncomingScreen, CallIncomingScreen.class, "acceptCallIfPossible", "acceptCallIfPossible()V", 0, 2));
        } else {
            if (!(c91Var instanceof b91)) {
                throw new NoWhenBranchMatchedException();
            }
            crd crdVar2 = CallIncomingScreen.Z;
            dy7.D(callIncomingScreen.requireActivity(), ((b91) c91Var).a);
            e91 e91VarM0 = callIncomingScreen.m0();
            e91VarM0.Y.c(e91VarM0);
            View viewRequireView = callIncomingScreen.requireView();
            if (viewRequireView.getMeasuredWidth() == 0 || viewRequireView.getMeasuredHeight() == 0) {
                callIncomingScreen.requireView().post(new b(21, callIncomingScreen));
            } else {
                callIncomingScreen.getRouter().B(callIncomingScreen);
            }
        }
        return e5f.a;
    }
}
