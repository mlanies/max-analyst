package defpackage;

import kotlin.coroutines.Continuation;
import one.me.calls.ui.bottomsheet.ratecall.CallRateBottomSheet;
import one.me.sdk.uikit.common.button.OneMeButton;

/* loaded from: classes.dex */
public final class ch1 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ CallRateBottomSheet Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ch1(Continuation continuation, CallRateBottomSheet callRateBottomSheet) {
        super(2, continuation);
        this.Y = callRateBottomSheet;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ch1 ch1Var = (ch1) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        ch1Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        ch1 ch1Var = new ch1(continuation, this.Y);
        ch1Var.X = obj;
        return ch1Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        boolean zBooleanValue = ((Boolean) this.X).booleanValue();
        bc7[] bc7VarArr = CallRateBottomSheet.I0;
        CallRateBottomSheet callRateBottomSheet = this.Y;
        callRateBottomSheet.getClass();
        ((OneMeButton) callRateBottomSheet.G0.T0(callRateBottomSheet, CallRateBottomSheet.I0[6])).setVisibility(zBooleanValue ? 0 : 8);
        return e5f.a;
    }
}
