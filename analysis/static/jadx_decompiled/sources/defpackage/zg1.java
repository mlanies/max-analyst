package defpackage;

import android.widget.TextView;
import kotlin.coroutines.Continuation;
import one.me.calls.ui.bottomsheet.ratecall.CallRateBottomSheet;

/* loaded from: classes.dex */
public final class zg1 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ CallRateBottomSheet Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zg1(Continuation continuation, CallRateBottomSheet callRateBottomSheet) {
        super(2, continuation);
        this.Y = callRateBottomSheet;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        zg1 zg1Var = (zg1) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        zg1Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        zg1 zg1Var = new zg1(continuation, this.Y);
        zg1Var.X = obj;
        return zg1Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        jqe jqeVar = (jqe) this.X;
        bc7[] bc7VarArr = CallRateBottomSheet.I0;
        CallRateBottomSheet callRateBottomSheet = this.Y;
        callRateBottomSheet.getClass();
        ((TextView) callRateBottomSheet.D0.T0(callRateBottomSheet, CallRateBottomSheet.I0[3])).setText(jqeVar.b(callRateBottomSheet.getContext()));
        return e5f.a;
    }
}
