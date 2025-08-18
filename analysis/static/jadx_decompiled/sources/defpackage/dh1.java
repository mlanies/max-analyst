package defpackage;

import android.transition.TransitionManager;
import android.view.ViewGroup;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.calls.ui.bottomsheet.ratecall.CallRateBottomSheet;

/* loaded from: classes.dex */
public final class dh1 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ CallRateBottomSheet Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dh1(Continuation continuation, CallRateBottomSheet callRateBottomSheet) {
        super(2, continuation);
        this.Y = callRateBottomSheet;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        dh1 dh1Var = (dh1) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        dh1Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        dh1 dh1Var = new dh1(continuation, this.Y);
        dh1Var.X = obj;
        return dh1Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        hh1 hh1Var = (hh1) this.X;
        boolean zF = tpa.f(hh1Var, gh1.a);
        CallRateBottomSheet callRateBottomSheet = this.Y;
        if (zF) {
            bc7[] bc7VarArr = CallRateBottomSheet.I0;
            TransitionManager.beginDelayedTransition((ViewGroup) callRateBottomSheet.getView(), callRateBottomSheet.B0);
            bc7[] bc7VarArr2 = CallRateBottomSheet.I0;
            ((n04) callRateBottomSheet.H0.T0(callRateBottomSheet, bc7VarArr2[7])).setVisibility(0);
            ((w4c) callRateBottomSheet.E0.T0(callRateBottomSheet, bc7VarArr2[4])).setVisibility(8);
            callRateBottomSheet.A0().setVisibility(8);
        } else if (tpa.f(hh1Var, eh1.a)) {
            bc7[] bc7VarArr3 = CallRateBottomSheet.I0;
            callRateBottomSheet.A0().v0.g();
        } else {
            if (!tpa.f(hh1Var, fh1.a)) {
                throw new NoWhenBranchMatchedException();
            }
            wha whaVar = new wha(callRateBottomSheet);
            whaVar.g(new eqe(b8a.F0));
            whaVar.a(new eqe(b8a.E0));
            whaVar.e(new kia(yfa.n));
            whaVar.i();
            callRateBottomSheet.s0(true);
        }
        return e5f.a;
    }
}
